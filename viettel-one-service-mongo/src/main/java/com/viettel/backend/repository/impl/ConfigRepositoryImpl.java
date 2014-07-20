package com.viettel.backend.repository.impl;

import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.MConfig;
import com.viettel.backend.repository.ConfigRepository;

@Repository
public class ConfigRepositoryImpl 
	extends GenericRepositoryImpl<MConfig, UUID> 
	implements ConfigRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2246007052747049434L;

	@Override
	public MConfig getByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property) {
		GenericQuery query = query(criteria("name").is(property));
    	return getFirst(tenant_ID, org_ID, app_ID, query);
	}

	@Override
	public String getValueByProperty(UUID tenant_ID, UUID org_ID, UUID app_ID, String property) {
		MConfig config = getByProperty(tenant_ID, org_ID, app_ID, property);
    	if (config == null)
    		return null;
    	
    	return config.getValue();
	}

}
