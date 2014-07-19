package com.viettel.backend.repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import com.viettel.backend.common.EO;

public interface GenericRepository<T extends EO<PK>, PK extends Serializable> extends BasicRepository {
	
	/**** Find By ID *****/
	public T findById(PK key);
	
	public T findById(UUID ad_Client_ID, PK id);
	
	/**** Get Count *****/
    public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query);
    
    /** Get First **/
    public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query);
    
    /**** Get List *****/
    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query);
    
	public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
			int firstResult, int maxResults, GenericQuery query);
	
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
