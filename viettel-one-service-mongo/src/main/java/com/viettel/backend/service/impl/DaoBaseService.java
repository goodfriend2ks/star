package com.viettel.backend.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericCriteria;
import javax.persistence.criteria.GenericQuery;

import org.springframework.transaction.annotation.Transactional;

import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.repository.GenericRepository;

@Transactional
public abstract class DaoBaseService<T extends EO<PK>, PK extends Serializable> {
    
    private GenericRepository<T, PK> genericRepo;

    public DaoBaseService() {
    }
    
    public DaoBaseService(GenericRepository<T, PK> genericRepo) {
        this.genericRepo = genericRepo;
    }
    
    public GenericRepository<T, PK> getRepo() {
        return genericRepo;
    }
    
    /********** Query constructor *********/
	public GenericQuery query() {
		return genericRepo.query();
	}
	
	public GenericQuery query(GenericCriteria criteria) {
		return genericRepo.query(criteria);
	}
	
	public GenericCriteria criteria() {
		return genericRepo.criteria();
	}
	
	public GenericCriteria criteria(String key) {
		return genericRepo.criteria(key);
	}
	
    /**** Find By ID *****/
    /*public T findById(PK key) {
        return genericRepo.findById(key);
    }*/

    public T findById(UUID tenant_ID, PK id) {
        return genericRepo.findById(tenant_ID, id);
    }
    
    /**** Get Count *****/
    public long getCount(UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
        return genericRepo.getCount(tenant_ID, org_ID, app_ID, query);
    }

//    public long getCount(UUID tenant_ID, UUID org_ID, UUID app_ID, 
//    		String whereClause, Object[] params) {
//        return genericRepo.getCount(tenant_ID, org_ID, app_ID, 
//        		whereClause, params);
//    }
    
    /** Get First **/
    public T getFirst(UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
    	return this.genericRepo.getFirst(tenant_ID, org_ID, app_ID, query);
    }
    
//    public T getFirst(UUID tenant_ID, UUID org_ID, UUID app_ID, 
//    		String whereClause, Object[] params, String orderBy) {
//    	return this.genericRepo.getFirst(tenant_ID, org_ID, app_ID, 
//    			whereClause, params, orderBy);
//    }
    
    /**** Get List *****/
    public List<T> getList(UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
        return genericRepo.getList(tenant_ID, org_ID, app_ID, query);
    }
    
    public List<T> getList(UUID tenant_ID, UUID org_ID, UUID app_ID, 
    		GenericQuery query, int firstResult, int maxResults) {
        return genericRepo.getList(tenant_ID, org_ID, app_ID, 
        		query, firstResult, maxResults);
    }

//    public List<T> getList(UUID tenant_ID, UUID org_ID, UUID app_ID, 
//    		String whereClause, Object[] params, String orderBy) {
//        return genericRepo.getList(tenant_ID, org_ID, app_ID, 
//        		whereClause, params, orderBy);
//    }
//    
//    public List<T> getList(UUID tenant_ID, UUID org_ID, UUID app_ID, 
//    		String whereClause, Object[] params, String orderBy, 
//    		int firstResult, int maxResults) {
//        return genericRepo.getList(tenant_ID, org_ID, app_ID, 
//        		whereClause, params, orderBy, 
//        		firstResult, maxResults);
//    }
    
    /**** Save *****/
    public PK save(T entity, boolean localTrx) {
        return genericRepo.save(entity, localTrx);
    }

    /**** Delete *****/
    public boolean delete(T e, boolean localTrx) {
        return genericRepo.delete(e, localTrx);
    }
    
    /*public boolean delete(PK key, boolean localTrx) {
        return genericRepo.delete(key, localTrx);
    }*/
    
    public boolean delete(UUID tenant_ID, PK id, boolean localTrx) {
        return genericRepo.delete(tenant_ID, id, localTrx);
    }
    
    /*public int delete(UUID tenant_ID, List<PK> ids, boolean localTrx) {
    	return genericRepo.delete(tenant_ID, ids, localTrx);
    }*/
    
    public int delete(UUID tenant_ID, GenericQuery query, boolean localTrx) {
    	return genericRepo.delete(tenant_ID, query, localTrx);
    }
    
    /**** Update Active *****/
    /*public boolean setActive(PK key, boolean isActive, boolean localTrx) {
    	return genericRepo.setActive(key, isActive, localTrx);
    }*/
    
    public boolean setActive(UUID tenant_ID, PK id, boolean isActive, boolean localTrx) {
    	return genericRepo.setActive(tenant_ID, id, isActive, localTrx);
    }
    
    /*public int setActive(UUID tenant_ID, List<PK> ids, boolean isActive, boolean localTrx){
    	return genericRepo.setActive(tenant_ID, ids, isActive, localTrx);
    }*/
    
    public int setActive(UUID tenant_ID, GenericQuery query, boolean isActive, boolean localTrx) {
    	return genericRepo.setActive(tenant_ID, query, isActive, localTrx);
    }
    
    /******************* Generic Type ********************************/
    /**** Find By ID *****/
    /*public <TE extends EO<PKE>, PKE extends Serializable> 
		TE findById(Class<TE> typeClazz, Class<PKE> pkClazz, PKE key) 
	{
		return this.genericRepo.findById(typeClazz, pkClazz, key);
	}*/
	
//	public <TE extends EO<PKE>, PKE extends Serializable> 
//		TE findById(Class<TE> typeClazz, Class<PKE> pkClazz, PKE id) 
//	{
//		return this.dao.findById(typeClazz, pkClazz, id);
//	}
		
	public <TE extends EO<PKE>, PKE extends Serializable> 
		TE findById(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, PKE id) 
	{
		return this.genericRepo.findById(typeClazz, pkClazz, tenant_ID, id);
	}
	
	/**** Get Count *****/
	public <TE extends EO<PKE>, PKE extends Serializable> 
		long getCount(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query)
	{
		return this.genericRepo.getCount(typeClazz, pkClazz,
				tenant_ID, org_ID, app_ID, query);
	}

//	public <TE extends EO<PKE>, PKE extends Serializable> 
//		long getCount(Class<TE> typeClazz, Class<PKE> pkClazz, 
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params)
//	{
//		return this.genericRepo.getCount(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID,
//				whereClause, params);
//	}
	
	/** Get First **/
    public <TE extends EO<PKE>, PKE extends Serializable> 
		TE getFirst(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
    	return this.genericRepo.getFirst(typeClazz, pkClazz, 
    			tenant_ID, org_ID, app_ID, query);
    }
	
//	public <TE extends EO<PKE>, PKE extends Serializable> 
//		TE getFirst(Class<TE> typeClazz, Class<PKE> pkClazz,
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params, String orderBy) {
//		return this.genericRepo.getFirst(typeClazz, pkClazz, 
//    			tenant_ID, org_ID, app_ID, 
//    			whereClause, params, orderBy);
//	}
	
	/**** Get List *****/
	public <TE extends EO<PKE>, PKE extends Serializable> 
		List<TE> getList(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) 
	{
		return this.genericRepo.getList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	public <TE extends EO<PKE>, PKE extends Serializable>
		List<TE> getList(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, 
				GenericQuery query, int firstResult, int maxResults)
	{
		return this.genericRepo.getList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID,
				query, firstResult, maxResults);
	}

//	public <TE extends EO<PKE>, PKE extends Serializable>
//		List<TE> getList(Class<TE> typeClazz, Class<PKE> pkClazz, 
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params, String orderBy) {
//		return this.genericRepo.getList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID,
//				whereClause, params, orderBy);
//	}
//	
//	public <TE extends EO<PKE>, PKE extends Serializable>
//		List<TE> getList(Class<TE> typeClazz, Class<PKE> pkClazz, 
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params, String orderBy, 
//				int firstResult, int maxResults) {
//		return this.genericRepo.getList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID,
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/** Get Generic Count **/
    public long getGenericCount(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
    	return this.genericRepo.getGenericCount(typeClazz, pkClazz, 
    			tenant_ID, org_ID, app_ID, query);
    }
    
//    public long getGenericCount(Class<?> typeClazz, Class<?> Class<?> pkClazz,
//			UUID tenant_ID, UUID org_ID, UUID app_ID, 
//			String whereClause, Object[] params) {
//    	return this.genericRepo.getGenericCount(typeClazz, pkClazz, 
//    			tenant_ID, org_ID, app_ID, 
//    			whereClause, params);
//    }
    
	/** Get Generic First **/
    public Object getGenericFirst(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
    	return this.genericRepo.getGenericFirst(typeClazz, pkClazz, 
    			tenant_ID, org_ID, app_ID, query);
    }
    
//    public Object getGenericFirst(Class<?> typeClazz, Class<?> Class<?> pkClazz,
//			UUID tenant_ID, UUID org_ID, UUID app_ID, 
//			String whereClause, Object[] params, String orderBy) {
//    	return this.genericRepo.getGenericFirst(typeClazz, pkClazz, 
//    			tenant_ID, org_ID, app_ID, 
//    			whereClause, params, orderBy);
//    }
    
	/**** Get Generic List *****/
	public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) 
	{
		return this.genericRepo.getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, 
			GenericQuery query, int firstResult, int maxResults)
	{
		return this.genericRepo.getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID,
				query, firstResult, maxResults);
	}

//	public List<?> getGenericList(Class<?> typeClazz, Class<?> Class<?> pkClazz, 
//			UUID tenant_ID, UUID org_ID, UUID app_ID, 
//			String whereClause, Object[] params, String orderBy) {
//		return this.genericRepo.getGenericList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID,
//				whereClause, params, orderBy);
//	}
//	
//	public List<?> getGenericList(Class<?> typeClazz, Class<?> Class<?> pkClazz, 
//			UUID tenant_ID, UUID org_ID, UUID app_ID, 
//			String whereClause, Object[] params, String orderBy, 
//			int firstResult, int maxResults) {
//		return this.genericRepo.getGenericList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID,
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/**** Save *****/
	public <TE extends EO<PKE>, PKE extends Serializable>
		PKE save(Class<TE> typeClazz, Class<PKE> pkClazz, TE entity, boolean localTrx) 
	{
		return this.genericRepo.save(typeClazz, pkClazz, entity, localTrx);
	}
	
	/**** Delete *****/
	public <TE extends EO<PKE>, PKE extends Serializable>
		boolean delete(Class<TE> typeClazz, Class<PKE> pkClazz, 
				TE entity, boolean localTrx) 
	{
		return this.genericRepo.delete(typeClazz, pkClazz, entity, localTrx);
	}

	/*public <TE extends EO<PKE>, PKE extends Serializable>
		boolean delete(Class<TE> typeClazz, Class<PKE> pkClazz, 
				PKE key, boolean localTrx)
	{
		return this.genericRepo.delete(typeClazz, pkClazz, key, localTrx);
	}*/
	
	public <TE extends EO<PKE>, PKE extends Serializable>
		boolean delete(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, PKE id, boolean localTrx)
	{
		return this.genericRepo.delete(typeClazz, pkClazz, tenant_ID, id, localTrx);
	}
	
	/*public <TE extends EO<PKE>, PKE extends Serializable>
		int delete(Class<TE> typeClazz, Class<PKE> pkClazz,
				UUID tenant_ID, List<PKE> ids, boolean localTrx) {
		return this.genericRepo.delete(typeClazz, pkClazz, 
				tenant_ID, ids, localTrx);
	}*/
	
	public <TE extends EO<PKE>, PKE extends Serializable>
		int delete(Class<TE> typeClazz, Class<PKE> pkClazz,
				UUID tenant_ID, GenericQuery query, boolean localTrx) {
		return this.genericRepo.delete(typeClazz, pkClazz, 
				tenant_ID, query, localTrx);
	}
	
	/**** Update Active *****/
	/*public <TE extends BaseEO<PKE>, PKE extends Serializable>
		boolean setActive(Class<TE> typeClazz, Class<PKE> pkClazz, 
				PKE key, boolean isActive, boolean localTrx) {
		return this.genericRepo.setActive(typeClazz, pkClazz, 
				key, isActive, localTrx);
	}*/

	public <TE extends BaseEO<PKE>, PKE extends Serializable>
		boolean setActive(Class<TE> typeClazz, Class<PKE> pkClazz,
				UUID tenant_ID, PKE id, boolean isActive, boolean localTrx) {
		return this.genericRepo.setActive(typeClazz, pkClazz, 
				tenant_ID, id, isActive, localTrx);
	}

	/*public <TE extends BaseEO<PKE>, PKE extends Serializable>
		int setActive(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, List<PKE> ids, boolean isActive, boolean localTrx)
	{
		return genericRepo.setActive(typeClazz, pkClazz, 
				tenant_ID, ids, isActive, localTrx);
	}*/
	
	public <TE extends BaseEO<PKE>, PKE extends Serializable>
		int setActive(Class<TE> typeClazz, Class<PKE> pkClazz, 
				UUID tenant_ID, GenericQuery query, 
				boolean isActive, boolean localTrx) {
		return this.genericRepo.setActive(typeClazz, pkClazz, 
				tenant_ID, query, isActive, localTrx);
	}
}
