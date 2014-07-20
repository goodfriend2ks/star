package com.viettel.backend.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericCriteria;
import javax.persistence.criteria.GenericQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
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

	/********** Query constructor *********/
	public GenericQuery query() {
		return commonRepo.query();
	}
	
	public GenericQuery query(GenericCriteria criteria) {
		return commonRepo.query(criteria);
	}
	
	public GenericCriteria criteria() {
		return commonRepo.criteria();
	}
	
	public GenericCriteria criteria(String key) {
		return commonRepo.criteria(key);
	}
	
	/**** Find By ID *****/
	/*@Override
	public <T extends EO<PK>, PK extends Serializable> 
		T findById(Class<T> typeClazz, Class<PK> pkClazz, PK key)
	{
		return this.commonRepo.findById(typeClazz, pkClazz, key);
	}*/
	
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		T findById(Class<T> typeClazz, Class<PK> pkClazz, UUID tenant_ID, PK id) 
	{
		return this.commonRepo.findById(typeClazz, pkClazz, tenant_ID, id);
	}
	
	/**** Get Count *****/
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		long getCount(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query)
	{
		return this.commonRepo.getCount(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

//	public <T extends EO<PK>, PK extends Serializable> 
//		long getCount(Class<T> typeClazz, Class<PK> pkClazz, 
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params)
//	{
//		return this.commonRepo.getCount(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, 
//				whereClause, params);
//	}
	
	/** Get First **/
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		T getFirst(Class<T> typeClazz, Class<PK> pkClazz,
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return this.commonRepo.getFirst(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

//	@Override
//	public <T extends EO<PK>, PK extends Serializable> T getFirst(
//			Class<T> typeClazz, Class<PK> pkClazz,
//			UUID tenant_ID, UUID org_ID, UUID app_ID,
//			String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getFirst(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, whereClause, params, orderBy);
//	}

	/**** Get List *****/
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) 
	{
		return this.commonRepo.getList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	@Override
	public <T extends EO<PK>, PK extends Serializable>
		List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, UUID org_ID, UUID app_ID, 
				GenericQuery query, int firstResult, int maxResults)
	{
		return this.commonRepo.getList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, 
				query, firstResult, maxResults);
	}

//	@Override
//	public <T extends EO<PK>, PK extends Serializable>
//		List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, 
//				whereClause, params, orderBy);
//	}
//	
//	@Override
//	public <T extends EO<PK>, PK extends Serializable>
//		List<T> getList(Class<T> typeClazz, Class<PK> pkClazz, 
//				UUID tenant_ID, UUID org_ID, UUID app_ID, 
//				String whereClause, Object[] params, String orderBy, 
//				int firstResult, int maxResults) {
//		return this.commonRepo.getList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, 
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/** Get Generic First **/
	@Override
	public Object getGenericFirst(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return this.commonRepo.getGenericFirst(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

//	@Override
//	public Object getGenericFirst(Class<?> typeClazz, 
//			Class<?> pkClazz, UUID tenant_ID, UUID org_ID,
//			UUID app_ID, String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getGenericFirst(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, 
//				whereClause, params, orderBy);
//	}

	/**** Get Generic List *****/
	public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) 
	{
		return this.commonRepo.getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	public List<?> getGenericList(Class<?> typeClazz, Class<?> pkClazz, 
			UUID tenant_ID, UUID org_ID, UUID app_ID, 
			GenericQuery query, int firstResult, int maxResults)
	{
		return this.commonRepo.getGenericList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, 
				query, firstResult, maxResults);
	}

//	public List<?> getGenericList(Class<?> typeClazz, Class<?> Class<?> pkClazz, 
//			UUID tenant_ID, UUID org_ID, UUID app_ID, 
//			String whereClause, Object[] params, String orderBy) {
//		return this.commonRepo.getGenericList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, 
//				whereClause, params, orderBy);
//	}
//	
//	public List<?> getGenericList(Class<?> typeClazz, Class<?> Class<?> pkClazz, 
//			UUID tenant_ID, UUID org_ID, UUID app_ID, 
//			String whereClause, Object[] params, String orderBy, 
//			int firstResult, int maxResults) {
//		return this.commonRepo.getGenericList(typeClazz, pkClazz, 
//				tenant_ID, org_ID, app_ID, 
//				whereClause, params, orderBy, 
//				firstResult, maxResults);
//	}
	
	/**** Save *****/
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		PK save(Class<T> typeClazz, Class<PK> pkClazz, T entity, boolean localTrx) 
	{
		return this.commonRepo.save(typeClazz, pkClazz, entity, localTrx);
	}

	/**** Delete *****/
	@Override
	public <T extends EO<PK>, PK extends Serializable>
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, T entity, boolean localTrx) 
	{
		return this.commonRepo.delete(typeClazz, pkClazz, entity, localTrx);
	}

	/*@Override
	public <T extends EO<PK>, PK extends Serializable>
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK id, boolean localTrx)
	{
		return this.commonRepo.delete(typeClazz, pkClazz, tenant_ID, id, localTrx);
	}*/
	
	@Override
	public <T extends EO<PK>, PK extends Serializable> 
		boolean delete(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK key, boolean localTrx)
	{
		return this.commonRepo.delete(typeClazz, pkClazz, tenant_ID, key, localTrx);
	}

	/*@Override
	public <T extends EO<PK>, PK extends Serializable> int delete(
			Class<T> typeClazz, Class<PK> pkClazz,
			UUID tenant_ID, List<PK> ids, boolean localTrx) {
		return this.commonRepo.delete(typeClazz, pkClazz, 
				tenant_ID, ids, localTrx);
	}*/

	@Override
	public <T extends EO<PK>, PK extends Serializable> int delete(
			Class<T> typeClazz, Class<PK> pkClazz,
			UUID tenant_ID, GenericQuery query, boolean localTrx) {
		return this.commonRepo.delete(typeClazz, pkClazz, 
				tenant_ID, query, localTrx);
	}
	
	/** Set Active **/
	/*@Override
	public <T extends BaseEO<PK>, PK extends Serializable> 
		int setActive(Class<T> typeClazz, Class<PK> pkClazz,
				UUID tenant_ID, List<PK> ids, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, pkClazz, 
				tenant_ID, ids, isActive, localTrx);
	}*/

	/*@Override
	public <T extends BaseEO<PK>, PK extends Serializable> 
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				PK key, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, pkClazz, 
				key, isActive, localTrx);
	}*/

	@Override
	public <T extends BaseEO<PK>, PK extends Serializable> 
		boolean setActive(Class<T> typeClazz, Class<PK> pkClazz, 
				UUID tenant_ID, PK id, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, pkClazz, 
				tenant_ID, id, isActive, localTrx);
	}

	@Override
	public <T extends BaseEO<PK>, PK extends Serializable> int setActive(
			Class<T> typeClazz, Class<PK> pkClazz,
			UUID tenant_ID, GenericQuery query, boolean isActive, boolean localTrx) {
		return this.commonRepo.setActive(typeClazz, pkClazz, 
				tenant_ID, query, isActive, localTrx);
	}
}
