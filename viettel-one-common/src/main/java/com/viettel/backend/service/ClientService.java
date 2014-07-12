package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.key.MClientKey;

public interface ClientService extends GenericService<MClient, MClientKey, UUID> {
	public List<MOrg> getOrgs(UUID ad_Client_ID);
	
	public MOrg getOrg(UUID ad_Client_ID, UUID ad_Org_ID);
	
	public long getOrgCount(UUID ad_Client_ID);
}
