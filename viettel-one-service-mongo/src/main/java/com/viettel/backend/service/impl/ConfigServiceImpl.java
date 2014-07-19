package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MConfig;
import com.viettel.backend.domain.key.MConfigKey;
import com.viettel.backend.repository.ConfigRepository;
import com.viettel.backend.service.ConfigService;

@Service(value="configService")
public class ConfigServiceImpl extends DaoBaseService<MConfig, MConfigKey, UUID> implements ConfigService {
	
	@Autowired
    private ConfigRepository configRepo;
	
	@Autowired
	public ConfigServiceImpl(ConfigRepository configRepo) {
        super(configRepo);
        this.configRepo = configRepo;
    }
	
	@Override
	public MConfig getByProperty(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, String property) {
		return configRepo.getByProperty(AD_Client_ID, AD_Org_ID, AD_App_ID, property);
	}

	@Override
	public String getValueByProperty(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, String property) {
		return configRepo.getValueByProperty(AD_Client_ID, AD_Org_ID, AD_App_ID, property);
	}
}
