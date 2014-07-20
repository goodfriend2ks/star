package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MTenant;

public interface TenantService extends GenericService<MTenant, UUID> {
	public List<MOrg> getOrgs(UUID tenant_ID);
	
	public MOrg getOrg(UUID tenant_ID, UUID org_ID);
	
	public long getOrgCount(UUID tenant_ID);
}
