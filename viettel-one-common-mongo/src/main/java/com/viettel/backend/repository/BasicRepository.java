package com.viettel.backend.repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericCriteria;
import javax.persistence.criteria.GenericQuery;

import com.viettel.backend.common.EO;

public interface BasicRepository extends Serializable {
	
	/******** Transaction **********/
	public boolean beginTransaction(String trxName);
	
	public boolean rolebackTransaction(String trxName);
	
	public boolean commitTransaction(String trxName);
	
	/********** Query constructor *********/
	public GenericQuery query();
	
	public GenericQuery query(GenericCriteria criteria);
	
	public GenericCriteria criteria();
	
	public GenericCriteria criteria(String key);
	
	/**** Find By ID *****/
//	public <T extends EO<PK>, PK extends Serializable> 
//		T findById(Class<T> typeClazz, Class<PK> pkClazz, PK key);
	
	public <T extends EO<PK>, PK extends Serializable> 
		T findById(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK id);
	
	/**** Get Count *****/
    public <T extends EO<PK>, PK extends Serializable> 
		long getCount(Class<T> typeClazz, Class<PK> pkClazz,
				UUID tenant_ID, UUID org_ID, UUID app_ID,
				GenericQuery query);
    
    /** Get First **/
    public <T extends EO<PK>, PK extends Serializable> 
		T getFirst(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, 
				GenericQuery query);
    
    /**** Get List *****/
    public <T extends EO<PK>, PK extends Serializable> 
		List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, 
				GenericQuery query);
    
	public <T extends EO<PK>, PK extends Serializable> 
		List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, 
				GenericQuery query, int firstResult, int maxResults);
	
	/** Get Generic Count **/
    public long getGenericCount(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query);
    
    /** Get Generic First **/
    public Object getGenericFirst(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query);
    
    /** Get Generic List **/
    public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query);
    
    public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
    			UUID tenant_ID, UUID org_ID, UUID app_ID, 
    			GenericQuery query, int firstResult, int maxResults);
    
    /**** Save *****/
    public <T extends EO<PK>, PK extends Serializable> 
    	PK save(Class<T> typeClazz, Class<PK> pkClazz, 
    			T entity, boolean localTrx);

//    public <T extends EO<PK>, PK extends Serializable> 
//		int save(Class<T> typeClazz, Class<PK> pkClazz, 
//				List<T> entities, boolean localTrx);
    
    /**** Delete *****/
    public <T extends EO<PK>, PK extends Serializable> 
    	boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
    			T entity, boolean localTrx);

    public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz,
				UUID tenant_ID, PK id, boolean localTrx);
    
/*    public <T extends EO<PK>, PK extends Serializable> 
		int delete(Class<T> typeClazz, Class<PK> pkClazz,
				UUID tenant_ID, List<PK> ids, boolean localTrx);
*/    
    public <T extends EO<PK>, PK extends Serializable>
		int delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, GenericQuery query, boolean localTrx);
    
    /** Set Active **/
    /*public <T extends EO<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				PK key, boolean isActive, boolean localTrx);*/
    
    public <T extends EO<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK id, boolean isActive, boolean localTrx);
    
    /*public <T extends EO<PK>, PK extends Serializable>
		int setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, List<PK> ids, boolean isActive, boolean localTrx);*/
    
    public <T extends EO<PK>, PK extends Serializable>
		int setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, GenericQuery query, 
				boolean isActive, boolean localTrx);
}
