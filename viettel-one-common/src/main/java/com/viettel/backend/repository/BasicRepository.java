package com.viettel.backend.repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;

import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;

public interface BasicRepository extends Serializable {
	
	/******** Transaction **********/
	public boolean beginTransaction(String trxName);
	
	public boolean rolebackTransaction(String trxName);
	
	public boolean commitTransaction(String trxName);
	
	/**** Find By ID *****/
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		T findById(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, KT key);
	
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		T findById(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id);
	
	/**** Get Count *****/
//    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//    	long getCount(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//    			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		long getCount(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID,
				Clause...clauses);
    
    /** Get First **/
//    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//		T getFirst(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		T getFirst(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
				Clause...clauses);
    
    /**** Get List *****/
//    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID);
	
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
				Clause...clauses);
    
//	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				int firstResult, int maxResults);

	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
				int firstResult, int maxResults, Clause...clauses);
	
	/** Get Generic Count **/
    public long getGenericCount(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses);
    
    /** Get Generic First **/
    public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses);
    
    /** Get Generic List **/
    public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses);
    
    public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
    			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
    			int firstResult, int maxResults, Clause...clauses);
    
    /**** Save *****/
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
    	PK save(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
    			T entity, boolean localTrx);

//    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//		int save(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				List<T> entities, boolean localTrx);
    
    /**** Delete *****/
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
    	boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
    			T entity, boolean localTrx);

    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				KT key, boolean localTrx);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				UUID ad_Client_ID, PK id, boolean localTrx);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		int delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				UUID ad_Client_ID, List<PK> ids, boolean localTrx);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		int delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, boolean localTrx, Clause...clauses);
    
    /** Set Active **/
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				KT key, boolean isActive, boolean localTrx);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		boolean setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		int setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx);
    
    public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		int setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause...clauses);
}
