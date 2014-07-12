package com.viettel.backend.repository.impl;

import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.MConfig;
import com.viettel.backend.domain.key.MConfigKey;
import com.viettel.backend.repository.ConfigRepository;

@Repository
public class ConfigRepositoryImpl 
	extends GenericRepositoryImpl<MConfig, MConfigKey, UUID> 
	implements ConfigRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2246007052747049434L;

	@Override
	public MConfig getByProperty(UUID AD_Client_ID, UUID AD_Org_ID,
			UUID AD_App_ID, String property) {
		Clause clause = new Clause("name", ClauseOp.eq, property);
    	return getFirst(AD_Client_ID, AD_Org_ID, AD_App_ID, clause);
	}

	@Override
	public String getValueByProperty(UUID AD_Client_ID, UUID AD_Org_ID,
			UUID AD_App_ID, String property) {
		MConfig config = getByProperty(AD_Client_ID, AD_Org_ID, AD_App_ID, property);
    	if (config == null)
    		return null;
    	
    	return config.getValue();
	}

}
