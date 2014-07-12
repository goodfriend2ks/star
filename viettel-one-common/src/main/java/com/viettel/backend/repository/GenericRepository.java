package com.viettel.backend.repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;

import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;

public interface GenericRepository<T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> extends BasicRepository {
	
	/**** Find By ID *****/
	public T findById(KT key);
	
	public T findById(UUID ad_Client_ID, PK id);
	
	/**** Get Count *****/
    public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses);
    
    /** Get First **/
    public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses);
    
    /**** Get List *****/
    public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses);
    
	public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
			int firstResult, int maxResults, Clause...clauses);
	
	/**** Save *****/
    public PK save(T entity, boolean localTrx);

    /**** Delete *****/
    public boolean delete(T entity, boolean localTrx);

    public boolean delete(KT key, boolean localTrx);
    
    public boolean delete(UUID ad_Client_ID, PK id, boolean localTrx);
    
    public int delete(UUID ad_Client_ID, List<PK> ids, boolean localTrx);
    
    public int delete(UUID ad_Client_ID, boolean localTrx, Clause...clauses);
    
    /** Set Active **/
    public boolean setActive(KT key, boolean isActive, boolean localTrx);
    
    public boolean setActive(UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx);
    
    public int setActive(UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx);
    
    public int setActive(UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause...clauses);
}
