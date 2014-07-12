package com.viettel.backend.service.internal.impl;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;
import com.viettel.backend.repository.CommonRepository;
import com.viettel.backend.service.CommonService;

@Service(value="commonService")
public class CommonServiceImpl implements CommonService
{
	private CommonRepository commonRepo;
	
	@Autowired
	public CommonServiceImpl(CommonRepository commonRepo) {
		this.commonRepo = commonRepo;
	}

	/**** Find By ID *****/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		T findById(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, KT key)
	{
		return this.commonRepo.findById(typeClazz, keyClazz, pkClazz, key);
	}
	
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		T findById(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, UUID ad_Client_ID, PK id) 
	{
		return this.commonRepo.findById(typeClazz, keyClazz, pkClazz, ad_Client_ID, id);
	}

	/**** Get Count *****/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		long getCount(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses)
	{
		return this.commonRepo.getCount(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

//	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
//		long getCount(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params)
//	{
//		return this.commonRepo.getCount(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, 
//				whereClause, params);
//	}
	
	/** Get First **/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		T getFirst(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		return this.commonRepo.getFirst(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

//	@Override
//	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> T getFirst(
//			Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID,
//			String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getFirst(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, whereClause, params, orderBy);
//	}

	/**** Get List *****/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) 
	{
		return this.commonRepo.getList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
				int firstResult, int maxResults, Clause...clauses)
	{
		return this.commonRepo.getList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, 
				firstResult, maxResults, clauses);
	}

//	@Override
//	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
//		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, 
//				whereClause, params, orderBy);
//	}
//	
//	@Override
//	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
//		List<T> getList(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
//				UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//				String whereClause, Object[] params, String orderBy, 
//				int firstResult, int maxResults) {
//		return this.commonRepo.getList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, 
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/** Get Generic First **/
	@Override
	public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz,
			Class<?> pkClazz, UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) {
		return this.commonRepo.getGenericFirst(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

//	@Override
//	public Object getGenericFirst(Class<?> typeClazz, Class<?> keyClazz,
//			Class<?> pkClazz, UUID AD_Client_ID, UUID AD_Org_ID,
//			UUID AD_App_ID, String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getGenericFirst(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, 
//				whereClause, params, orderBy);
//	}

	/**** Get Generic List *****/
	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, Clause...clauses) 
	{
		return this.commonRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, clauses);
	}

	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
			int firstResult, int maxResults, Clause...clauses)
	{
		return this.commonRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, 
				firstResult, maxResults, clauses);
	}

//	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//			String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, 
//				whereClause, params, orderBy);
//	}
//	
//	public List<?> getGenericList(Class<?> typeClazz, Class<?> keyClazz, Class<?> pkClazz, 
//			UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, 
//			String whereClause, Object[] params, String orderBy, 
//			int firstResult, int maxResults) {
//		return this.commonRepo.getGenericList(typeClazz, keyClazz, pkClazz, 
//				AD_Client_ID, AD_Org_ID, AD_App_ID, 
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/**** Save *****/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		PK save(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, T entity, boolean localTrx) 
	{
		return this.commonRepo.save(typeClazz, keyClazz, pkClazz, entity, localTrx);
	}

	/**** Delete *****/
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, T entity, boolean localTrx) 
	{
		return this.commonRepo.delete(typeClazz, keyClazz, pkClazz, entity, localTrx);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable>
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean localTrx)
	{
		return this.commonRepo.delete(typeClazz, keyClazz, pkClazz, ad_Client_ID, id, localTrx);
	}
	
	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				KT key, boolean localTrx)
	{
		return this.commonRepo.delete(typeClazz, keyClazz, pkClazz, key, localTrx);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> int delete(
			Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
			UUID ad_Client_ID, List<PK> ids, boolean localTrx) {
		return this.commonRepo.delete(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, ids, localTrx);
	}

	@Override
	public <T extends EO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> int delete(
			Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
			UUID ad_Client_ID, boolean localTrx, Clause... clauses) {
		return this.commonRepo.delete(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, localTrx, clauses);
	}
	
	/** Set Active **/
	@Override
	public <T extends BaseEO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
				UUID ad_Client_ID, List<PK> ids, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, ids, isActive, localTrx);
	}

	@Override
	public <T extends BaseEO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				KT key, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, keyClazz, pkClazz, 
				key, isActive, localTrx);
	}

	@Override
	public <T extends BaseEO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> 
		boolean setActive(Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz, 
				UUID ad_Client_ID, PK id, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, id, isActive, localTrx);
	}

	@Override
	public <T extends BaseEO<KT, PK>, KT extends EOKey<PK>, PK extends Serializable> int setActive(
			Class<T> typeClazz, Class<KT> keyClazz, Class<PK> pkClazz,
			UUID ad_Client_ID, boolean isActive, boolean localTrx, Clause... clauses) {
		return this.commonRepo.setActive(typeClazz, keyClazz, pkClazz, 
				ad_Client_ID, isActive, localTrx, clauses);
	}
}
