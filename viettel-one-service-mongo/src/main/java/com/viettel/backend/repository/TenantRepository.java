package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MTenant;

public interface TenantRepository extends GenericRepository<MTenant, UUID> {
	
	public List<MOrg> getOrgs(UUID ad_Client_ID);
	
	public MOrg getOrg(UUID ad_Client_ID, UUID ad_Org_ID);
	
	public long getOrgCount(UUID ad_Client_ID);
}
