package com.viettel.backend.service;


import java.util.UUID;

import com.viettel.backend.domain.MConfig;

public interface ConfigService extends GenericService<MConfig, UUID> 
{
    public MConfig getByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property);
    
    public String getValueByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property);
}
