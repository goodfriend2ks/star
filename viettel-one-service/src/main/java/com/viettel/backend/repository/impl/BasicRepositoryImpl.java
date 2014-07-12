package com.viettel.backend.repository.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.easycassandra.persistence.cassandra.CountBuilder;
import org.easycassandra.persistence.cassandra.DeleteBuilder;
import org.easycassandra.persistence.cassandra.SelectBuilder;
import org.easycassandra.persistence.cassandra.UpdateBuilder;
import org.easycassandra.persistence.cassandra.spring.CassandraRepository;
import org.easycassandra.persistence.cassandra.spring.CassandraTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.datastax.driver.core.ConsistencyLevel;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;
import com.viettel.backend.repository.BasicRepository;
import com.viettel.backend.util.ClauseBuilderUtil;
import com.viettel.util.DataTypeUtil;

public abstract class BasicRepositoryImpl<EOT, EOKT extends Serializable>
		extends CassandraRepository<EOT, EOKT> 
		implements CrudRepository<EOT, EOKT>, BasicRepository {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8614939314232137816L;
	
	@Autowired
	private CassandraTemplate cassandraTemplate;
	
	public BasicRepositoryImpl() {
	}

	@Override
	public CassandraTemplate getCassandraTemplate() {
		return cassandraTemplate;
	}
	
	/****** Transaction ************/
	@Override
	public boolean beginTransaction(String trxName) {
		return true;
	}

	@Override
	public boolean rolebackTransaction(String trxName) {
		return true;
	}

	@Override
	public boolean commitTransaction(String trxName) {
		return true;
	}

	/**** Find By ID *****/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			T findById(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, KT key) {
		return getCassandraTemplate().findOne(key, typeClazz);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			T findById(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
					UUID ad_Client_ID, PK id) {
		KT key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
		if (key == null)
			return null;
		
		return this.findById(typeClazz, keyClazz, pkClazz, key);
	}

	/** Get Count ***/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			long getCount(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		return getGenericCount(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	/** Get First **/
	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			T getFirst(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		return (T)getGenericFirst(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	/** Get List **/
	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		return (List<T>)getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
					int firstResult, int maxResults, Clause...clauses) {
		return (List<T>)getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, firstResult, maxResults, clauses);
	}

	/** Get Generic Count **/
	@Override
	public long getGenericCount(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		
		EntityType entityType = typeClazz.getAnnotation(EntityType.class);
		boolean clientCheck = false;
		boolean orgCheck = false;
		boolean appCheck = false;
		
		if (AD_Client_ID != null) {
			clientCheck = true;
			if (clauses != null) {
				for (Clause clause : clauses) {
					if (clause.getName().indexOf(EO.CLIENT_FIELD_NAME) >= 0) {
						clientCheck = false;
						break;
					}
				}
			}
			
			if (clientCheck && entityType != null && entityType.alwayRootClient())
				AD_Client_ID = EO.ROOT_ID_VALUE;
		}
		
		if (entityType != null && AD_Org_ID != null) {
			orgCheck = entityType.hasOrg();
			if (orgCheck) {
				if (clauses != null) {
					for (Clause clause : clauses) {
						if (clause.getName().indexOf(EO.ORG_FIELD_NAME) >= 0) {
							orgCheck = false;
							break;
						}
					}
				}
				
				if (orgCheck && entityType.alwayRootOrg())
					AD_Org_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (entityType != null && AD_App_ID != null) {
			appCheck = entityType.hasApp();
			if (appCheck) {
				if (clauses != null) {
					for (Clause clause : clauses) {
						if (clause.getName().indexOf(EO.APP_FIELD_NAME) >= 0) {
							appCheck = false;
							break;
						}
					}
				}
				
				if (appCheck && entityType.alwayRootApp())
					AD_App_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (!clientCheck && !orgCheck && !appCheck) {
			if (clauses == null || clauses.length == 0) {
				return getCassandraTemplate().count(typeClazz, ConsistencyLevel.ONE);
			}
		}
		
		long retValue = 0;
		if (entityType != null) {
			if (clientCheck && entityType.withRootClient() && !EO.isRootID(AD_Client_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					CountBuilder<?> countQuery = getCassandraTemplate().countBuilder(typeClazz).allowFiltering();
					countQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(countQuery, clauses);
					retValue += countQuery.execute();
				}
				
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					CountBuilder<?> countQuery = getCassandraTemplate().countBuilder(typeClazz).allowFiltering();
					countQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
					
					ClauseBuilderUtil.buildClause(countQuery, clauses);
					retValue += countQuery.execute();
				}
			}
			
			if (orgCheck && entityType.withRootOrg() && !EO.isRootID(AD_Org_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					CountBuilder<?> countQuery = getCassandraTemplate().countBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
					countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(countQuery, clauses);
					retValue += countQuery.execute();
				}
				
				CountBuilder<?> countQuery = getCassandraTemplate().countBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
				countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
				if (appCheck)
					countQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
				
				ClauseBuilderUtil.buildClause(countQuery, clauses);
				retValue += countQuery.execute();
			}
			
			if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
				CountBuilder<?> countQuery = getCassandraTemplate().countBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
				if (orgCheck)
					countQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
				countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
				
				ClauseBuilderUtil.buildClause(countQuery, clauses);
				retValue += countQuery.execute();
			}
		}
		
		CountBuilder<?> countQuery = getCassandraTemplate().countBuilder(typeClazz).allowFiltering();
		if (clientCheck)
			countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
		if (orgCheck)
			countQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
		if (appCheck)
			countQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
		
		ClauseBuilderUtil.buildClause(countQuery, clauses);
		retValue += countQuery.execute();
		
		return retValue;
	}

	/** Get Generic First **/
	@Override
	public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		List<?> results = getGenericList(typeClazz, keyClazz, pkClazz, 
    			AD_Client_ID, AD_Org_ID, AD_App_ID, 0, 1, clauses);
    	if (results == null || results.size() == 0)
    		return null;
    	
    	return results.get(0);
	}

	/** Get Generic List **/
	@Override
	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		return getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, -1, -1, clauses);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
			int firstResult, int maxResults, Clause...clauses) {
		
		EntityType entityType = typeClazz.getAnnotation(EntityType.class);
		boolean clientCheck = false;
		boolean orgCheck = false;
		boolean appCheck = false;
		
		if (AD_Client_ID != null) {
			clientCheck = true;
			if (clauses != null) {
				for (Clause clause : clauses) {
					if (clause.getName().indexOf(EO.CLIENT_FIELD_NAME) >= 0) {
						clientCheck = false;
						break;
					}
				}
			}
			
			if (clientCheck && entityType != null && entityType.alwayRootClient())
				AD_Client_ID = EO.ROOT_ID_VALUE;
		}
		
		if (entityType != null && AD_Org_ID != null) {
			orgCheck = entityType.hasOrg();
			if (orgCheck) {
				if (clauses != null) {
					for (Clause clause : clauses) {
						if (clause.getName().indexOf(EO.ORG_FIELD_NAME) >= 0) {
							orgCheck = false;
							break;
						}
					}
				}
				
				if (orgCheck && entityType.alwayRootOrg())
					AD_Org_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (entityType != null && AD_App_ID != null) {
			appCheck = entityType.hasApp();
			if (appCheck) {
				if (clauses != null) {
					for (Clause clause : clauses) {
						if (clause.getName().indexOf(EO.APP_FIELD_NAME) >= 0) {
							appCheck = false;
							break;
						}
					}
				}
				
				if (appCheck && entityType.alwayRootApp())
					AD_App_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (!clientCheck && !orgCheck && !appCheck) {
			if (clauses == null || clauses.length == 0) {
				return getCassandraTemplate().findAll(typeClazz, ConsistencyLevel.ONE);
			}
		}
		
		List allResults = new ArrayList<>();
		boolean checkSize = (firstResult >= 0 && maxResults > firstResult);
		boolean notFullSize = true;
		
		if (entityType != null) {
			if (clientCheck && entityType.withRootClient() && !EO.isRootID(AD_Client_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					SelectBuilder<?> selectQuery = getCassandraTemplate().selectBuilder(typeClazz).allowFiltering();
					selectQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					selectQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(selectQuery, clauses);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
					
				}
				
				if (notFullSize) {
					if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
						SelectBuilder<?> selectQuery = getCassandraTemplate().selectBuilder(typeClazz).allowFiltering();
						selectQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
						if (orgCheck)
							selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
						selectQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
						
						ClauseBuilderUtil.buildClause(selectQuery, clauses);
						if (checkSize)
							selectQuery.withLimit(maxResults);
						
						allResults.addAll(selectQuery.execute());
						if (checkSize)
							notFullSize = (allResults.size() < maxResults);
					}
				}
			}
			
			if (notFullSize && orgCheck && entityType.withRootOrg() && !EO.isRootID(AD_Org_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					SelectBuilder<?> selectQuery = getCassandraTemplate().selectBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
					selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					selectQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(selectQuery, clauses);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
				}
				
				if (notFullSize) {
					SelectBuilder<?> selectQuery = getCassandraTemplate().selectBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
					selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (appCheck)
						selectQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
					
					ClauseBuilderUtil.buildClause(selectQuery, clauses);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
				}
			}
			
			if (notFullSize && appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
				SelectBuilder<?> selectQuery = getCassandraTemplate().selectBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
				if (orgCheck)
					selectQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
				selectQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
				
				ClauseBuilderUtil.buildClause(selectQuery, clauses);
				if (checkSize)
					selectQuery.withLimit(maxResults);
				
				allResults.addAll(selectQuery.execute());
				if (checkSize)
					notFullSize = (allResults.size() < maxResults);
			}
		}
		
		if (notFullSize) {
			SelectBuilder<?> selectQuery = getCassandraTemplate().selectBuilder(typeClazz).allowFiltering();
			if (clientCheck)
				selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
			if (orgCheck)
				selectQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
			if (appCheck)
				selectQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
			
			ClauseBuilderUtil.buildClause(selectQuery, clauses);
			if (checkSize)
				selectQuery.withLimit(maxResults);
			
			allResults.addAll(selectQuery.execute());
			if (checkSize)
				notFullSize = (allResults.size() < maxResults);
		}
		
		if (checkSize) {
			if (firstResult > 0 || allResults.size() > maxResults) {
				List pagedResults = new ArrayList<>();
				int maxIndex = maxResults;
				if (allResults.size() < maxResults)
					maxIndex = allResults.size();
				
				for (int i=firstResult; i<maxIndex; i++) {
					pagedResults.add(allResults.get(i));
				}
				
				return pagedResults;
			}
		}
		
		return allResults;
	}

	/** Save **/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
			PK save(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
					T entity, boolean localTrx) {
		
		PK retValue = null;
		
//		EntityTransaction trx = null;
		boolean success = true;
		try {
//			if (localTrx)
//			{
//				trx = this.getEntityManager().getTransaction();
//				trx.begin();
//			}
			
			long version = entity.getVersion();
			PK entityId = entity.getID();
			boolean isNew = (version == 0L);
			
			if (DataTypeUtil.isEmpty(pkClazz, entityId))
			{
				entity.setID(DataTypeUtil.newValue(pkClazz));
				isNew = true;
				version = 0;
			}
			
			if (isNew) {
				entity.setCreated(new Date());
				
				EntityType entityType = typeClazz.getAnnotation(EntityType.class);
				if (entityType != null) {
					if (entityType.alwayRootClient())
						entity.setAd_Client_ID(EO.ROOT_ID_VALUE);
					if (entityType.alwayRootOrg())
						entity.setAd_Org_ID(EO.ROOT_ID_VALUE);
					if (entityType.alwayRootApp())
						entity.setAd_App_ID(EO.ROOT_ID_VALUE);
				}
			}
			success = entity.beforeSave(isNew);
			if (success)
			{
				entity.setVersion(version + 1);
				entity.setUpdated(new Date());
				
				getCassandraTemplate().save(entity);
				
				success = entity.afterSave(isNew);
				if (success)
					retValue = entity.getID();
			}
		} catch (Exception e) {
			success = false;
		} finally {
//			if (localTrx)
//			{
//				if (success)
//					trx.commit();
//				else
//					trx.rollback();
//				
//				trx = null;
//			}
		}
		
		return retValue;
	}

//	@Override
//	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//		int save(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				List<T> entities, boolean localTrx) {
//		getCassandraTemplate().save(entities);
//		
//		return entities.size();
//	}
	
	/** Delete **/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				T entity, boolean localTrx) {
		try {
			getCassandraTemplate().delete(entity);
			return true;
		} catch (Exception e) {}
		
		return false;
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				KT key, boolean localTrx) {
		try {
			getCassandraTemplate().delete(key, typeClazz);
			return true;
		} catch (Exception e) {}
		
		return false;
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean localTrx) {
		KT key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
		if (key == null)
			return false;
		
		return delete(typeClazz, keyClazz, pkClazz, key, localTrx);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		int delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
					UUID ad_Client_ID, List<PK> ids, boolean localTrx) {
		List<KT> keys = new ArrayList<>();
		for (PK id : ids) {
			if (id != null) {
				KT key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
				if (key != null) {
					keys.add(key);
				}
			}
		}
		if (keys.size() == 0)
			return 0;
		
		try {
			getCassandraTemplate().delete(keys, typeClazz);
			return keys.size();
		} catch (Exception e) {}
		
		return -1;
	}
	
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		int delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, boolean localTrx, Clause...clauses) {
		
		if (clauses == null || clauses.length == 0)
			return -1;
		
		try {
			DeleteBuilder<T> deleteBuilder = getCassandraTemplate().deleteBuilder(typeClazz);
			
			boolean clientCheck = true;
			if (clauses != null) {
				for (Clause clause : clauses) {
					if (clause.getName().indexOf(EO.CLIENT_FIELD_NAME) >= 0) {
						clientCheck = false;
						break;
					}
				}
			}
			if (clientCheck)
			{
				deleteBuilder.whereEq(EO.CLIENT_FIELD_NAME, ad_Client_ID);
			}
			
			for (Clause clause : clauses) {
				if (clause.getOp().equals(ClauseOp.eq)) {
					deleteBuilder.whereEq(clause.getName(), clause.getFirstValue());
				} else if (clause.getOp().equals(ClauseOp.in)) {
					if (clause.getFirstValue() != null) {
						if (clause.getFirstValue() instanceof Object[])
							deleteBuilder.whereIn(clause.getName(), clause.getFirstValue());
						else
							deleteBuilder.whereIn(clause.getName(), clause.getFirstValue(), clause.getSecondValue());
					}
				}
			}
			
			if (deleteBuilder.execute())
				return 1;
			
		} catch (Exception e) {}
		
		return -1;
	}
	
	/** Set Active **/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				KT key, boolean isActive, boolean localTrx) {
		T entity = findById(typeClazz, keyClazz, pkClazz, key);
		if (entity == null)
			return false;
		
		entity.setActive(isActive);
		try {
			getCassandraTemplate().save(entity);
			return true;
		} catch (Exception e) {}
		
		return false;
	}
	
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx) {
		KT key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
		if (key == null)
			return false;
		
		return setActive(typeClazz, keyClazz, pkClazz, key, isActive, localTrx);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx) {
		
		String keyName = null;
		try {
			KT key = keyClazz.newInstance();
			keyName = key.getKeyName();
		} catch (InstantiationException | IllegalAccessException e) {
			return -1;
		}
		
		Clause clause = new Clause(keyName, ids);
		return setActive(typeClazz, keyClazz, pkClazz, ad_Client_ID, isActive, localTrx, clause);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
			UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause... clauses) {
		
		if (clauses == null || clauses.length == 0)
			return -1;
		
		try {
			UpdateBuilder<T> updateBuilder = getCassandraTemplate().updateBuilder(typeClazz)
					.value(EO.ACTIVE_FIELD_NAME, isActive);
			
			boolean clientCheck = true;
			if (clauses != null) {
				for (Clause clause : clauses) {
					if (clause.getName().indexOf(EO.CLIENT_FIELD_NAME) >= 0) {
						clientCheck = false;
						break;
					}
				}
			}
			if (clientCheck)
			{
				updateBuilder.whereEq(EO.CLIENT_FIELD_NAME, ad_Client_ID);
			}
			
			for (Clause clause : clauses) {
				if (clause.getOp().equals(ClauseOp.eq)) {
					updateBuilder.whereEq(clause.getName(), clause.getFirstValue());
				} else if (clause.getOp().equals(ClauseOp.in)) {
					if (clause.getFirstValue() != null) {
						if (clause.getFirstValue() instanceof Object[])
							updateBuilder.whereIn(clause.getName(), clause.getFirstValue());
						else
							updateBuilder.whereIn(clause.getName(), clause.getFirstValue(), clause.getSecondValue());
					}
				}
			}
			
			if (updateBuilder.execute())
				return 1;
		} catch (Exception e) {}
		
		return -1;
	}

	/** Private Methods **/
	private <KT extends EOKey<PK>, PK extends Serializable> 
			KT getKey(Class<KT> keyClazz, Class<PK> pkClazz, UUID ad_Client_ID, PK id) {
		KT key = null;
		try {
			key = keyClazz.newInstance();
			key.setAd_Client_ID(ad_Client_ID);
			key.setID(id);
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
		
		return key;
	}
}
