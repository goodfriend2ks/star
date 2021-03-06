package com.viettel.backend.repository;

import java.util.UUID;

import com.viettel.backend.domain.MConfig;
import com.viettel.backend.domain.key.MConfigKey;

public interface ConfigRepository extends GenericRepository<MConfig, MConfigKey, UUID> {
	
	public MConfig getByProperty(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, String property);
    
    public String getValueByProperty(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, String property);
}
