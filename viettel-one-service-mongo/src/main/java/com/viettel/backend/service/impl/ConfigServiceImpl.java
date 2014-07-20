package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MConfig;
import com.viettel.backend.repository.ConfigRepository;
import com.viettel.backend.service.ConfigService;

@Service(value="configService")
public class ConfigServiceImpl extends DaoBaseService<MConfig, UUID> implements ConfigService {
	
	@Autowired
    private ConfigRepository configRepo;
	
	@Autowired
	public ConfigServiceImpl(ConfigRepository configRepo) {
        super(configRepo);
        this.configRepo = configRepo;
    }
	
	@Override
	public MConfig getByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property) {
		return configRepo.getByProperty(tenant_ID, org_ID, app_ID, property);
	}

	@Override
	public String getValueByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property) {
		return configRepo.getValueByProperty(tenant_ID, org_ID, app_ID, property);
	}
}
