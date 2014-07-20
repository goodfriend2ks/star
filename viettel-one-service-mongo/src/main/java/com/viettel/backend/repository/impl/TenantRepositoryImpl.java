package com.viettel.backend.repository.impl;

import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MTenant;
import com.viettel.backend.repository.TenantRepository;

@Repository
public class TenantRepositoryImpl 
	extends GenericRepositoryImpl<MTenant, UUID> 
	implements TenantRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4467839748910905940L;

	@Override
	public List<MOrg> getOrgs(UUID tenant_ID) {
		GenericQuery query = query(criteria(EO.TENANT_FIELD_NAME).is(tenant_ID));
		return getList(MOrg.class, UUID.class,
				tenant_ID, null, EO.ROOT_ID_VALUE, query);
	}

	@Override
	public long getOrgCount(UUID tenant_ID) {
		GenericQuery query = query(criteria(EO.TENANT_FIELD_NAME).is(tenant_ID));
		return getCount(MOrg.class, UUID.class,
				tenant_ID, null, EO.ROOT_ID_VALUE, query);
	}

	@Override
	public MOrg getOrg(UUID tenant_ID, UUID org_ID) {
		GenericQuery query = query(criteria(EO.TENANT_FIELD_NAME).is(tenant_ID)
				.and(EO.ORG_FIELD_NAME).is(org_ID));
		return getFirst(MOrg.class, UUID.class,
				tenant_ID, null, EO.ROOT_ID_VALUE, query);
	}
}