package com.viettel.backend.repository.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;

import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;
import com.viettel.backend.repository.GenericRepository;

public abstract class GenericRepositoryImpl<T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
	extends BasicRepositoryImpl<T, KT> 
	implements GenericRepository<T, KT, PK> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7641250283840412529L;

	private Class<T> typeClazz;
	private Class<KT> keyClazz;
	private Class<PK> pkClazz;
	
	@SuppressWarnings("unchecked")
	public GenericRepositoryImpl() {
		Class<?> superClazz = getClass();
		Type superType = superClazz.getGenericSuperclass();
		while (!(superType instanceof ParameterizedType)) {
			superClazz = superClazz.getSuperclass();
			superType = superClazz.getGenericSuperclass();
		}
		
		ParameterizedType genericSuperclass = (ParameterizedType)superType;
        this.typeClazz = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
        this.keyClazz = (Class<KT>) genericSuperclass.getActualTypeArguments()[1];
        this.pkClazz = (Class<PK>) genericSuperclass.getActualTypeArguments()[2];
	}

	/**** Find By ID *****/
	@Override
	public T findById(KT key) {
		return findById(typeClazz, keyClazz, pkClazz, key);
	}

	@Override
	public T findById(UUID ad_Client_ID, PK id) {
		return findById(typeClazz, keyClazz, pkClazz, ad_Client_ID, id);
	}

	/** Get Count ***/
	@Override
	public long getCount(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause... clauses) {
		return getCount(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	/** Get First **/
	@Override
	public T getFirst(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause... clauses) {
		return getFirst(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	/** Get List **/
	@Override
	public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause... clauses) {
		return getList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	@Override
	public List<T> getList(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID,
			int firstResult, int maxResults, Clause... clauses) {
		return getList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, 
				firstResult, maxResults, clauses);
	}

	/** Save **/
	@Override
	public PK save(T entity, boolean localTrx) {
		return save(typeClazz, keyClazz, pkClazz, entity, localTrx);
	}

	/** Delete **/
	@Override
	public boolean delete(T entity, boolean localTrx) {
		return delete(typeClazz, keyClazz, pkClazz, entity, localTrx);
	}

	@Override
	public boolean delete(KT key, boolean localTrx) {
		return delete(typeClazz, keyClazz, pkClazz, key, localTrx);
	}

	@Override
	public boolean delete(UUID ad_Client_ID, PK id, boolean localTrx) {
		return delete(typeClazz, keyClazz, pkClazz, ad_Client_ID, id, localTrx);
	}

	@Override
	public int delete(UUID ad_Client_ID, List<PK> ids, boolean localTrx) {
		return delete(typeClazz, keyClazz, pkClazz, ad_Client_ID, ids, localTrx);
	}

	public int delete(UUID ad_Client_ID, boolean localTrx, Clause...clauses) {
		return delete(typeClazz, keyClazz, pkClazz, ad_Client_ID, localTrx, clauses);
	}
	
	/** Set Active **/
	@Override
	public boolean setActive(KT key, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, keyClazz, pkClazz, key, isActive, localTrx);
	}

	@Override
	public boolean setActive(UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, keyClazz, pkClazz, ad_Client_ID, id, isActive, localTrx);
	}

	@Override
	public int setActive(UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, keyClazz, pkClazz, ad_Client_ID, ids, isActive, localTrx);
	}

	@Override
	public int setActive(UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause... clauses) {
		return setActive(typeClazz, keyClazz, pkClazz, ad_Client_ID, isActive, localTrx, clauses);
	}
}
