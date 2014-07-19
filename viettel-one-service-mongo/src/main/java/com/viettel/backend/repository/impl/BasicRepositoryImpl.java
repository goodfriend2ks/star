package com.viettel.backend.repository.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.GenericCriteria;
import javax.persistence.criteria.GenericQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.viettel.annotation.EntityType;
import com.viettel.backend.common.EO;
import com.viettel.backend.repository.BasicRepository;
import com.viettel.util.DataTypeUtil;

public abstract class BasicRepositoryImpl<EOT, EOKT extends Serializable>
		implements CrudRepository<EOT, EOKT>, BasicRepository {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8614939314232137816L;
	
	@Autowired
	private MongoTemplate dataTemplate;
	
	public BasicRepositoryImpl() {
	}

	public MongoTemplate getDataTemplate() {
		return dataTemplate;
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

	/********** Query constructor *********/
	@Override
	public Query query() {
		return new Query();
	}
	
	@Override
	public Query query(GenericCriteria criteria) {
		return new Query(criteria);
	}
	
	@Override
	public Criteria criteria() {
		return new Criteria();
	}
	
	@Override
	public Criteria criteria(String key) {
		return new Criteria(key);
	}
	
	/**** Find By ID *****/
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
			T findById(Class<T> typeClazz, Class<PK> pkClazz, PK key) {
		
		Query query = query(criteria("id").is(key));
		return getDataTemplate().findOne(query, typeClazz);
	}
/*
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
			T findById(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID ad_Client_ID, PK id) {
		PK key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
		if (key == null)
			return null;
		
		return this.findById(typeClazz, keyClazz, pkClazz, key);
	}*/

	/** Get Count ***/
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
			long getCount(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return getGenericCount(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, query);
	}

	/** Get First **/
	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<PK>, PK extends Serializable> 
			T getFirst(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return (T)getGenericFirst(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, query);
	}

	/** Get List **/
	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<PK>, PK extends Serializable> 
			List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return (List<T>)getGenericList(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, query);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<PK>, PK extends Serializable> 
			List<T> getList(Class<T> typeClazz, Class<PK> pkClazz,
					UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
					int firstResult, int maxResults, GenericQuery query) {
		return (List<T>)getGenericList(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, firstResult, maxResults, query);
	}

	/** Get Generic Count **/
	@Override
	public long getGenericCount(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		
		long retValue = 0;
		
		EntityType entityType = typeClazz.getAnnotation(EntityType.class);
		boolean clientCheck = false;
		boolean orgCheck = false;
		boolean appCheck = false;
		
		/*if (AD_Client_ID != null) {
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
				return getDataTemplate().count(typeClazz, ConsistencyLevel.ONE);
			}
		}
		
		if (entityType != null) {
			if (clientCheck && entityType.withRootClient() && !EO.isRootID(AD_Client_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
					countQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(countQuery, query);
					retValue += countQuery.execute();
				}
				
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
					countQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
					
					ClauseBuilderUtil.buildClause(countQuery, query);
					retValue += countQuery.execute();
				}
			}
			
			if (orgCheck && entityType.withRootOrg() && !EO.isRootID(AD_Org_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
					countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(countQuery, query);
					retValue += countQuery.execute();
				}
				
				CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
				countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
				if (appCheck)
					countQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
				
				ClauseBuilderUtil.buildClause(countQuery, query);
				retValue += countQuery.execute();
			}
			
			if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
				CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
				if (orgCheck)
					countQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
				countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
				
				ClauseBuilderUtil.buildClause(countQuery, query);
				retValue += countQuery.execute();
			}
		}
		
		CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
		if (clientCheck)
			countQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
		if (orgCheck)
			countQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
		if (appCheck)
			countQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
		
		ClauseBuilderUtil.buildClause(countQuery, query);
		retValue += countQuery.execute();*/
		
		return retValue;
	}

	/** Get Generic First **/
	@Override
	public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		List<?> results = getGenericList(typeClazz, keyClazz, pkClazz, 
    			AD_Client_ID, AD_Org_ID, AD_App_ID, 0, 1, query);
    	if (results == null || results.size() == 0)
    		return null;
    	
    	return results.get(0);
	}

	/** Get Generic List **/
	@Override
	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, -1, -1, query);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
			int firstResult, int maxResults, GenericQuery query) {
		
		List allResults = new ArrayList<>();
		
		boolean checkSize = (firstResult >= 0 && maxResults > firstResult);
		boolean notFullSize = true;
		
		EntityType entityType = typeClazz.getAnnotation(EntityType.class);
		boolean clientCheck = false;
		boolean orgCheck = false;
		boolean appCheck = false;
		
		/*if (AD_Client_ID != null) {
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
				return getDataTemplate().findAll(typeClazz, ConsistencyLevel.ONE);
			}
		}
		
		if (entityType != null) {
			if (clientCheck && entityType.withRootClient() && !EO.isRootID(AD_Client_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
					SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
					selectQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					selectQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(selectQuery, query);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
					
				}
				
				if (notFullSize) {
					if (appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
						SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
						selectQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
						if (orgCheck)
							selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
						selectQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
						
						ClauseBuilderUtil.buildClause(selectQuery, query);
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
					SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
					selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					selectQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(selectQuery, query);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
				}
				
				if (notFullSize) {
					SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
					selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (appCheck)
						selectQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
					
					ClauseBuilderUtil.buildClause(selectQuery, query);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
				}
			}
			
			if (notFullSize && appCheck && entityType.withRootApp() && !EO.isRootID(AD_App_ID, false)) {
				SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
				if (orgCheck)
					selectQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
				selectQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
				
				ClauseBuilderUtil.buildClause(selectQuery, query);
				if (checkSize)
					selectQuery.withLimit(maxResults);
				
				allResults.addAll(selectQuery.execute());
				if (checkSize)
					notFullSize = (allResults.size() < maxResults);
			}
		}
		
		if (notFullSize) {
			SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
			if (clientCheck)
				selectQuery.eq(EO.CLIENT_FIELD_NAME, AD_Client_ID);
			if (orgCheck)
				selectQuery.eq(EO.ORG_FIELD_NAME, AD_Org_ID);
			if (appCheck)
				selectQuery.eq(EO.APP_FIELD_NAME, AD_App_ID);
			
			ClauseBuilderUtil.buildClause(selectQuery, query);
			if (checkSize)
				selectQuery.withLimit(maxResults);
			
			allResults.addAll(selectQuery.execute());
			if (checkSize)
				notFullSize = (allResults.size() < maxResults);
		}*/
		
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
	public <T extends EO<PK>, PK extends Serializable> 
			PK save(Class<T> typeClazz, Class<PK> pkClazz,
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
			PK entityId = entity.getId();
			boolean isNew = (version == 0L);
			
			if (DataTypeUtil.isEmpty(pkClazz, entityId))
			{
				entity.setId(DataTypeUtil.newValue(pkClazz));
				isNew = true;
				version = 0;
			}
			
			if (isNew) {
				entity.setCreated(new Date());
				
				EntityType entityType = typeClazz.getAnnotation(EntityType.class);
				if (entityType != null) {
					if (entityType.alwayRootTenant())
						entity.setTenant_ID(EO.ROOT_ID_VALUE);
					if (entityType.alwayRootOrg())
						entity.setOrg_ID(EO.ROOT_ID_VALUE);
					if (entityType.alwayRootApp())
						entity.setApp_ID(EO.ROOT_ID_VALUE);
				}
			}
			success = entity.beforeSave(isNew);
			if (success)
			{
				entity.setVersion(version + 1);
				entity.setUpdated(new Date());
				
				getDataTemplate().save(entity);
				
				success = entity.afterSave(isNew);
				if (success)
					retValue = entity.getId();
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
//	public <T extends EO<PK>, PK extends Serializable> 
//		int save(Class<T> typeClazz, Class<PK> pkClazz, 
//				List<T> entities, boolean localTrx) {
//		getDataTemplate().save(entities);
//		
//		return entities.size();
//	}
	
	/** Delete **/
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz,
				T entity, boolean localTrx) {
		try {
			getDataTemplate().remove(entity);
			return true;
		} catch (Exception e) {}
		
		return false;
	}

	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
				PK key, boolean localTrx) {
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(key));
			
			getDataTemplate().remove(query, typeClazz);
			return true;
		} catch (Exception e) {}
		
		return false;
	}
/*
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean localTrx) {
		KT key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
		if (key == null)
			return false;
		
		return delete(typeClazz, keyClazz, pkClazz, key, localTrx);
	}*/

	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
		int delete(Class<T> typeClazz, Class<PK> pkClazz,
					List<PK> ids, boolean localTrx) {
		
		if (ids == null || ids.size() == 0)
			return 0;
		
		try {
			getDataTemplate().delete(keys, typeClazz);
			return keys.size();
		} catch (Exception e) {}
		
		return -1;
	}*/
	
	/*public <T extends EO<PK>, PK extends Serializable>
		int delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, boolean localTrx, GenericQuery query) {
		
		if (clauses == null || clauses.length == 0)
			return -1;
		
		try {
			DeleteBuilder<T> deleteBuilder = getDataTemplate().deleteBuilder(typeClazz);
			
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
	}*/
	
	/** Set Active **/
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				PK key, boolean isActive, boolean localTrx) {
		T entity = findById(typeClazz, pkClazz, key);
		if (entity == null)
			return false;
		
		entity.setActive(isActive);
		try {
			getDataTemplate().save(entity);
			return true;
		} catch (Exception e) {}
		
		return false;
	}
	/*
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx) {
		KT key = getKey(keyClazz, pkClazz, ad_Client_ID, id);
		if (key == null)
			return false;
		
		return setActive(typeClazz, keyClazz, pkClazz, key, isActive, localTrx);
	}*/

	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<PK> pkClazz,
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
	}*/

	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<PK> pkClazz,
			UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause... clauses) {
		
		if (clauses == null || clauses.length == 0)
			return -1;
		
		try {
			UpdateBuilder<T> updateBuilder = getDataTemplate().updateBuilder(typeClazz)
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
	}*/

	/** Private Methods **/
	/*private <KT extends EOKey<PK>, PK extends Serializable> 
			KT getKey(Class<PK> pkClazz, UUID ad_Client_ID, PK id) {
		KT key = null;
		try {
			key = keyClazz.newInstance();
			key.setAd_Client_ID(ad_Client_ID);
			key.setID(id);
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
		
		return key;
	}*/
}
