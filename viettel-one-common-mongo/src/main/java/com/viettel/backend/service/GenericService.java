package com.viettel.backend.service;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import com.viettel.backend.common.EO;

public interface GenericService<T extends EO<PK>, PK extends Serializable> extends BaseService {
	
	/**** Find By ID *****/
	public T findById(PK key);
	
//	public T findById(PK id);
	
    public T findById(UUID ad_Client_ID, PK id);
    
    /**** Get Count *****/
    public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query);
    
//    public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params);
    
    /** Get First **/
    public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query);
    
//    public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params, String orderBy);
    
    /**** Get List *****/
    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query);
    
    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
    		int firstResult, int maxResults, GenericQuery query);
    
//    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params, String orderBy);
//    
//    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//    		String whereClause, Object[] params, String orderBy, 
//    		int firstResult, int maxResults);
    
    /**** Save *****/
    public PK save(T entity, boolean localTrx);
    
    /**** Delete *****/
    public boolean delete(T entity, boolean localTrx);
    
    public boolean delete(PK key, boolean localTrx);
    
    public boolean delete(UUID ad_Client_ID, PK id, boolean localTrx);
    
    public int delete(UUID ad_Client_ID, List<PK> ids, boolean localTrx);
    
    public int delete(UUID ad_Client_ID, boolean localTrx, GenericQuery query);
    
    /** Set Active **/
    public boolean setActive(PK key, boolean isActive, boolean localTrx);
    
    public boolean setActive(UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx);
    
    public int setActive(UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx);
    
    public int setActive(UUID ad_Client_ID, boolean isActive, boolean localTrx, GenericQuery query);
}
