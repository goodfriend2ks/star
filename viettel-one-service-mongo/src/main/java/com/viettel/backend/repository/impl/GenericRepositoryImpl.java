package com.viettel.backend.repository.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import com.viettel.backend.common.EO;
import com.viettel.backend.repository.GenericRepository;

public abstract class GenericRepositoryImpl<T extends EO<PK>, PK extends Serializable> 
	extends BasicRepositoryImpl<T, PK> 
	implements GenericRepository<T, PK> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7641250283840412529L;

	private Class<T> typeClazz;
//	private Class<KT> keyClazz;
	private Class<PK> pkClazz;
	
	@SuppressWarnings("unchecked")
	public GenericRepositoryImpl() {
		Class<?> superClazz = getClass();
		Type superType = superClazz.getGenericSuperclass();
		while (!(superType instanceof ParameterizedType)) {
			superClazz = superClazz.getSuperclass();
			superType = superClazz.getGenericSuperclass();
		}
		
		int paraIndex = 0;
		ParameterizedType genericSuperclass = (ParameterizedType)superType;
        this.typeClazz = (Class<T>) genericSuperclass.getActualTypeArguments()[paraIndex++];
//        this.keyClazz = (Class<KT>) genericSuperclass.getActualTypeArguments()[paraIndex++];
        this.pkClazz = (Class<PK>) genericSuperclass.getActualTypeArguments()[paraIndex++];
	}

	/**** Find By ID *****/
	@Override
	public T findById(PK key) {
		return findById(typeClazz, pkClazz, key);
	}

	@Override
	public T findById(UUID ad_Client_ID, PK id) {
		return findById(typeClazz, pkClazz, ad_Client_ID, id);
	}

	/** Get Count ***/
	@Override
	public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return getCount(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, query);
	}

	/** Get First **/
	@Override
	public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return getFirst(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, query);
	}

	/** Get List **/
	@Override
	public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, GenericQuery query) {
		return getList(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, query);
	}

	@Override
	public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID,
			int firstResult, int maxResults, GenericQuery query) {
		return getList(typeClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, 
				firstResult, maxResults, query);
	}

	/** Save **/
	@Override
	public PK save(T entity, boolean localTrx) {
		return save(typeClazz, pkClazz, entity, localTrx);
	}

	/** Delete **/
	@Override
	public boolean delete(T entity, boolean localTrx) {
		return delete(typeClazz, pkClazz, entity, localTrx);
	}

	@Override
	public boolean delete(PK key, boolean localTrx) {
		return delete(typeClazz, pkClazz, key, localTrx);
	}

//	@Override
//	public boolean delete(UUID ad_Client_ID, PK id, boolean localTrx) {
//		return delete(typeClazz, pkClazz, ad_Client_ID, id, localTrx);
//	}

	@Override
	public int delete(UUID ad_Client_ID, List<PK> ids, boolean localTrx) {
		return delete(typeClazz, pkClazz, ad_Client_ID, ids, localTrx);
	}

	public int delete(UUID ad_Client_ID, boolean localTrx, GenericQuery query) {
		return delete(typeClazz, pkClazz, ad_Client_ID, localTrx, query);
	}
	
	/** Set Active **/
	@Override
	public boolean setActive(PK key, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, pkClazz, key, isActive, localTrx);
	}

//	@Override
//	public boolean setActive(UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx) {
//		return setActive(typeClazz, pkClazz, ad_Client_ID, id, isActive, localTrx);
//	}

	@Override
	public int setActive(UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, pkClazz, ad_Client_ID, ids, isActive, localTrx);
	}

	@Override
	public int setActive(UUID ad_Client_ID, boolean isActive, boolean localTrx, GenericQuery query) {
		return setActive(typeClazz, pkClazz, ad_Client_ID, isActive, localTrx, query);
	}
}
