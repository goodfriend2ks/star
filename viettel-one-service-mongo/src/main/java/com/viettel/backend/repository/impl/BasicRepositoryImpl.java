package com.viettel.backend.repository.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericCriteria;
import javax.persistence.criteria.GenericQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.viettel.annotation.EntityType;
import com.viettel.backend.common.EO;
import com.viettel.backend.repository.BasicRepository;
import com.viettel.util.DataTypeUtil;

public abstract class BasicRepositoryImpl<EOT, EOKT extends Serializable>
		implements /*CrudRepository<EOT, EOKT>,*/ BasicRepository {
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
	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
			T findById(Class<T> typeClazz, Class<PK> pkClazz, PK key) {
		
		Query query = query(criteria("id").is(key));
		return getDataTemplate().findOne(query, typeClazz);
	}*/
	
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
			T findById(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID tenant_ID, PK id) {
		
		Query query = query(criteria("id").is(id)
				.and(EO.TENANT_FIELD_NAME).is(tenant_ID));
		return getDataTemplate().findOne(query, typeClazz);
	}

	/** Get Count ***/
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
			long getCount(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return getGenericCount(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	/** Get First **/
	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<PK>, PK extends Serializable> 
			T getFirst(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return (T)getGenericFirst(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	/** Get List **/
	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<PK>, PK extends Serializable> 
			List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
					UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return (List<T>)getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends EO<PK>, PK extends Serializable> 
			List<T> getList(Class<T> typeClazz, Class<PK> pkClazz,
					UUID tenant_ID, UUID org_ID, UUID app_ID, 
					GenericQuery query, int firstResult, int maxResults) {
		return (List<T>)getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query, firstResult, maxResults);
	}

	/** Get Generic Count **/
	@Override
	public long getGenericCount(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		
		long retValue = 0;
		
		EntityType entityType = typeClazz.getAnnotation(EntityType.class);
		boolean clientCheck = false;
		boolean orgCheck = false;
		boolean appCheck = false;
		
		/*if (tenant_ID != null) {
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
				tenant_ID = EO.ROOT_ID_VALUE;
		}
		
		if (entityType != null && org_ID != null) {
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
					org_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (entityType != null && app_ID != null) {
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
					app_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (!clientCheck && !orgCheck && !appCheck) {
			if (clauses == null || clauses.length == 0) {
				return getDataTemplate().count(typeClazz, ConsistencyLevel.ONE);
			}
		}
		
		if (entityType != null) {
			if (clientCheck && entityType.withRootClient() && !EO.isRootID(tenant_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
					CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
					countQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(countQuery, query);
					retValue += countQuery.execute();
				}
				
				if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
					CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
					countQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (orgCheck)
						countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, app_ID);
					
					ClauseBuilderUtil.buildClause(countQuery, query);
					retValue += countQuery.execute();
				}
			}
			
			if (orgCheck && entityType.withRootOrg() && !EO.isRootID(org_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
					CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						countQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
					countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
					
					ClauseBuilderUtil.buildClause(countQuery, query);
					retValue += countQuery.execute();
				}
				
				CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					countQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
				countQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
				if (appCheck)
					countQuery.eq(EO.APP_FIELD_NAME, app_ID);
				
				ClauseBuilderUtil.buildClause(countQuery, query);
				retValue += countQuery.execute();
			}
			
			if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
				CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					countQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
				if (orgCheck)
					countQuery.eq(EO.ORG_FIELD_NAME, org_ID);
				countQuery.eq(EO.APP_FIELD_NAME, EO.ROOT_ID_VALUE);
				
				ClauseBuilderUtil.buildClause(countQuery, query);
				retValue += countQuery.execute();
			}
		}
		
		CountBuilder<?> countQuery = getDataTemplate().countBuilder(typeClazz).allowFiltering();
		if (clientCheck)
			countQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
		if (orgCheck)
			countQuery.eq(EO.ORG_FIELD_NAME, org_ID);
		if (appCheck)
			countQuery.eq(EO.APP_FIELD_NAME, app_ID);
		
		ClauseBuilderUtil.buildClause(countQuery, query);
		retValue += countQuery.execute();*/
		
		return retValue;
	}

	/** Get Generic First **/
	@Override
	public Object getGenericFirst(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		
		List<?> results = getGenericList(typeClazz, pkClazz, 
    			tenant_ID, org_ID, app_ID, query, 0, 1);
    	if (results == null || results.size() == 0)
    		return null;
    	
    	return results.get(0);
	}

	/** Get Generic List **/
	@Override
	public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		
		return getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query, -1, -1);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, 
			GenericQuery query, int firstResult, int maxResults) {
		
		List allResults = new ArrayList<>();
		
		boolean checkSize = (firstResult >= 0 && maxResults > firstResult);
		boolean notFullSize = true;
		
		EntityType entityType = typeClazz.getAnnotation(EntityType.class);
		boolean clientCheck = false;
		boolean orgCheck = false;
		boolean appCheck = false;
		
		/*if (tenant_ID != null) {
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
				tenant_ID = EO.ROOT_ID_VALUE;
		}
		
		if (entityType != null && org_ID != null) {
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
					org_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (entityType != null && app_ID != null) {
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
					app_ID = EO.ROOT_ID_VALUE;
			}
		}
		
		if (!clientCheck && !orgCheck && !appCheck) {
			if (clauses == null || clauses.length == 0) {
				return getDataTemplate().findAll(typeClazz, ConsistencyLevel.ONE);
			}
		}
		
		if (entityType != null) {
			if (clientCheck && entityType.withRootClient() && !EO.isRootID(tenant_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
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
					if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
						SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
						selectQuery.eq(EO.CLIENT_FIELD_NAME, EO.ROOT_ID_VALUE);
						if (orgCheck)
							selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
						selectQuery.eq(EO.APP_FIELD_NAME, app_ID);
						
						ClauseBuilderUtil.buildClause(selectQuery, query);
						if (checkSize)
							selectQuery.withLimit(maxResults);
						
						allResults.addAll(selectQuery.execute());
						if (checkSize)
							notFullSize = (allResults.size() < maxResults);
					}
				}
			}
			
			if (notFullSize && orgCheck && entityType.withRootOrg() && !EO.isRootID(org_ID, false)) {
				if (appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
					SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
					if (clientCheck)
						selectQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
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
						selectQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
					selectQuery.eq(EO.ORG_FIELD_NAME, EO.ROOT_ID_VALUE);
					if (appCheck)
						selectQuery.eq(EO.APP_FIELD_NAME, app_ID);
					
					ClauseBuilderUtil.buildClause(selectQuery, query);
					if (checkSize)
						selectQuery.withLimit(maxResults);
					
					allResults.addAll(selectQuery.execute());
					if (checkSize)
						notFullSize = (allResults.size() < maxResults);
				}
			}
			
			if (notFullSize && appCheck && entityType.withRootApp() && !EO.isRootID(app_ID, false)) {
				SelectBuilder<?> selectQuery = getDataTemplate().selectBuilder(typeClazz).allowFiltering();
				if (clientCheck)
					selectQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
				if (orgCheck)
					selectQuery.eq(EO.ORG_FIELD_NAME, org_ID);
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
				selectQuery.eq(EO.CLIENT_FIELD_NAME, tenant_ID);
			if (orgCheck)
				selectQuery.eq(EO.ORG_FIELD_NAME, org_ID);
			if (appCheck)
				selectQuery.eq(EO.APP_FIELD_NAME, app_ID);
			
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

	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
				PK key, boolean localTrx) {
		try {
			Query query = query(criteria("id").is(key));
			getDataTemplate().remove(query, typeClazz);
			return true;
		} catch (Exception e) {}
		
		return false;
	}*/

	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK id, boolean localTrx) {
		try {
			Query query = query(criteria("tenant_ID").is(tenant_ID)
					.and("id").is(id));
			getDataTemplate().remove(query, typeClazz);
			return true;
		} catch (Exception e) {}
		
		return false;
	}

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
	
	public <T extends EO<PK>, PK extends Serializable>
		int delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, GenericQuery query, boolean localTrx) {
		
		/*if (clauses == null || clauses.length == 0)
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
				deleteBuilder.whereEq(EO.CLIENT_FIELD_NAME, tenant_ID);
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
			
		} catch (Exception e) {}*/
		
		return -1;
	}
	
	/** Set Active **/
	/*@Override
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
	}*/
	
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK id, boolean isActive, boolean localTrx) {
		
		Query query = query(criteria("id").is(id));
		return setActive(typeClazz, pkClazz, tenant_ID, query, isActive, localTrx) == 1;
	}

	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<PK> pkClazz,
				UUID tenant_ID, List<PK> ids, boolean isActive, boolean localTrx) {
		
		String keyName = null;
		try {
			KT key = keyClazz.newInstance();
			keyName = key.getKeyName();
		} catch (InstantiationException | IllegalAccessException e) {
			return -1;
		}
		
		Clause clause = new Clause(keyName, ids);
		return setActive(typeClazz, keyClazz, pkClazz, tenant_ID, isActive, localTrx, clause);
	}*/

	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, GenericQuery query, 
				boolean isActive, boolean localTrx) {
		
		/*if (clauses == null || clauses.length == 0)
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
				updateBuilder.whereEq(EO.CLIENT_FIELD_NAME, tenant_ID);
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
		} catch (Exception e) {}*/
		
		return -1;
	}
	
	/** Private Methods **/
	/*private <KT extends EOKey<PK>, PK extends Serializable> 
			KT getKey(Class<PK> pkClazz, UUID tenant_ID, PK id) {
		KT key = null;
		try {
			key = keyClazz.newInstance();
			key.setAd_Client_ID(tenant_ID);
			key.setID(id);
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
		
		return key;
	}*/
}
