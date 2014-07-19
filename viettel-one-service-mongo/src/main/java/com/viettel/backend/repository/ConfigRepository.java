package com.viettel.backend.repository;

import java.util.UUID;

import com.viettel.backend.domain.MConfig;

public interface ConfigRepository extends GenericRepository<MConfig, UUID> {
	
	public MConfig getByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property);
    
    public String getValueByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property);
}
