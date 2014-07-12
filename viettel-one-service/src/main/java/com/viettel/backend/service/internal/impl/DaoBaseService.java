package com.viettel.backend.service.internal.impl;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;

import org.springframework.transaction.annotation.Transactional;

import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;
import com.viettel.backend.repository.GenericRepository;

@Transactional
public abstract class DaoBaseService<T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> {
    
    private GenericRepository<T, KT, PK> genericRepo;

    public DaoBaseService() {
    }
    
    public DaoBaseService(GenericRepository<T, KT, PK> genericRepo) {
        this.genericRepo = genericRepo;
    }
    
    public GenericRepository<T, KT, PK> getRepo() {
        return genericRepo;
    }
    
    /**** Find By ID *****/
    public T findById(KT key) {
        return genericRepo.findById(key);
    }

    public T findById(UUID ad_Client_ID, PK id) {
        return genericRepo.findById(ad_Client_ID, id);
    }
    
    /**** Get Count *****/
    public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
        return genericRepo.getCount(AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
    }

//    public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params) {
//        return genericRepo.getCount(AD_Client_ID, AD_Org_ID, AD_App_ID, 
//        		whereClause, params);
//    }
    
    /** Get First **/
    public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
    	return this.genericRepo.getFirst(AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
    }
    
//    public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params, String orderBy) {
//    	return this.genericRepo.getFirst(AD_Client_ID, AD_Org_ID, AD_App_ID, 
//    			whereClause, params, orderBy);
//    }
    
    /**** Get List *****/
    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
        return genericRepo.getList(AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
    }
    
    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
    		int firstResult, int maxResults, Clause...clauses) {
        return genericRepo.getList(AD_Client_ID, AD_Org_ID, AD_App_ID, 
        		firstResult, maxResults, clauses);
    }

//    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params, String orderBy) {
//        return genericRepo.getList(AD_Client_ID, AD_Org_ID, AD_App_ID, 
//        		whereClause, params, orderBy);
//    }
//    
//    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params, String orderBy, 
//    		int firstResult, int maxResults) {
//        return genericRepo.getList(AD_Client_ID, AD_Org_ID, AD_App_ID, 
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
    
    public boolean delete(KT key, boolean localTrx) {
        return genericRepo.delete(key, localTrx);
    }
    
    public boolean delete(UUID ad_Client_ID, PK id, boolean localTrx) {
        return genericRepo.delete(ad_Client_ID, id, localTrx);
    }
    
    public int delete(UUID ad_Client_ID, List<PK> ids, boolean localTrx) {
    	return genericRepo.delete(ad_Client_ID, ids, localTrx);
    }
    
    public int delete(UUID ad_Client_ID, boolean localTrx, Clause...clauses) {
    	return genericRepo.delete(ad_Client_ID, localTrx, clauses);
    }
    
    /**** Update Active *****/
    public boolean setActive(KT key, boolean isActive, boolean localTrx) {
    	return genericRepo.setActive(key, isActive, localTrx);
    }
    
    public boolean setActive(UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx) {
    	return genericRepo.setActive(ad_Client_ID, id, isActive, localTrx);
    }
    
    public int setActive(UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx){
    	return genericRepo.setActive(ad_Client_ID, ids, isActive, localTrx);
    }
    
    public int setActive(UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause...clauses) {
    	return genericRepo.setActive(ad_Client_ID, isActive, localTrx, clauses);
    }
    
    /******************* Generic Type ********************************/
    /**** Find By ID *****/
    public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
		TE findById(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, KTE key) 
	{
		return this.genericRepo.findById(typeClazz, keyClazz, pkClazz, key);
	}
	
//	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
//		TE findById(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, PKE id) 
//	{
//		return this.dao.findById(typeClazz, keyClazz, pkClazz, id);
//	}
		
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
		TE findById(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID ad_Client_ID, PKE id) 
	{
		return this.genericRepo.findById(typeClazz, keyClazz, pkClazz, ad_Client_ID, id);
	}
	
	/**** Get Count *****/
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
		long getCount(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses)
	{
		return this.genericRepo.getCount(typeClazz, keyClazz, pkClazz,
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

//	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
//		long getCount(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params)
//	{
//		return this.genericRepo.getCount(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID,
//				whereClause, params);
//	}
	
	/** Get First **/
    public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
		TE getFirst(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
    	return this.genericRepo.getFirst(typeClazz, keyClazz, pkClazz, 
    			AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
    }
	
//	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
//		TE getFirst(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz,
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params, String orderBy) {
//		return this.genericRepo.getFirst(typeClazz, keyClazz, pkClazz, 
//    			AD_Client_ID, AD_Org_ID, AD_App_ID, 
//    			whereClause, params, orderBy);
//	}
	
	/**** Get List *****/
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable> 
		List<TE> getList(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) 
	{
		return this.genericRepo.getList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		List<TE> getList(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
				int firstResult, int maxResults, Clause...clauses)
	{
		return this.genericRepo.getList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID,
				firstResult, maxResults, clauses);
	}

//	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
//		List<TE> getList(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params, String orderBy) {
//		return this.genericRepo.getList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID,
//				whereClause, params, orderBy);
//	}
//	
//	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
//		List<TE> getList(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params, String orderBy, 
//				int firstResult, int maxResults) {
//		return this.genericRepo.getList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID,
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/** Get Generic Count **/
    public long getGenericCount(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
    	return this.genericRepo.getGenericCount(typeClazz, keyClazz, pkClazz, 
    			AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
    }
    
//    public long getGenericCount(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz,
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//			String whereClause, Object[] params) {
//    	return this.genericRepo.getGenericCount(typeClazz, keyClazz, pkClazz, 
//    			AD_Client_ID, AD_Org_ID, AD_App_ID, 
//    			whereClause, params);
//    }
    
	/** Get Generic First **/
    public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
    	return this.genericRepo.getGenericFirst(typeClazz, keyClazz, pkClazz, 
    			AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
    }
    
//    public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz,
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//			String whereClause, Object[] params, String orderBy) {
//    	return this.genericRepo.getGenericFirst(typeClazz, keyClazz, pkClazz, 
//    			AD_Client_ID, AD_Org_ID, AD_App_ID, 
//    			whereClause, params, orderBy);
//    }
    
	/**** Get Generic List *****/
	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) 
	{
		return this.genericRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
			int firstResult, int maxResults, Clause...clauses)
	{
		return this.genericRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID,
				firstResult, maxResults, clauses);
	}

//	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//			String whereClause, Object[] params, String orderBy) {
//		return this.genericRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID,
//				whereClause, params, orderBy);
//	}
//	
//	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//			String whereClause, Object[] params, String orderBy, 
//			int firstResult, int maxResults) {
//		return this.genericRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID,
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/**** Save *****/
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		PKE save(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, TE entity, boolean localTrx) 
	{
		return this.genericRepo.save(typeClazz, keyClazz, pkClazz, entity, localTrx);
	}
	
	/**** Delete *****/
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		boolean delete(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				TE entity, boolean localTrx) 
	{
		return this.genericRepo.delete(typeClazz, keyClazz, pkClazz, entity, localTrx);
	}

	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		boolean delete(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				KTE key, boolean localTrx)
	{
		return this.genericRepo.delete(typeClazz, keyClazz, pkClazz, key, localTrx);
	}
	
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		boolean delete(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID ad_Client_ID, PKE id, boolean localTrx)
	{
		return this.genericRepo.delete(typeClazz, keyClazz, pkClazz, ad_Client_ID, id, localTrx);
	}
	
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		int delete(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz,
				UUID ad_Client_ID, List<PKE> ids, boolean localTrx) {
		return this.genericRepo.delete(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, ids, localTrx);
	}
	
	public <TE extends EO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		int delete(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz,
				UUID ad_Client_ID, boolean localTrx, Clause...clauses) {
		return this.genericRepo.delete(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, localTrx, clauses);
	}
	
	/**** Update Active *****/
	public <TE extends BaseEO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		boolean setActive(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				KTE key, boolean isActive, boolean localTrx) {
		return this.genericRepo.setActive(typeClazz, keyClazz, pkClazz, 
				key, isActive, localTrx);
	}

	public <TE extends BaseEO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		boolean setActive(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz,
				UUID ad_Client_ID, PKE id, boolean isActive, boolean localTrx) {
		return this.genericRepo.setActive(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, id, isActive, localTrx);
	}

	public <TE extends BaseEO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		int setActive(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID ad_Client_ID, List<PKE> ids, boolean isActive, boolean localTrx)
	{
		return genericRepo.setActive(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, ids, isActive, localTrx);
	}
	
	public <TE extends BaseEO<KTE, PKE>, KTE extends EOKey<PKE>, PKE extends Serializable>
		int setActive(Class<TE> typeClazz, Class<KTE> keyClazz, Class<PKE> pkClazz, 
				UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause...clauses) {
		return this.genericRepo.setActive(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, isActive, localTrx, clauses);
	}
}
