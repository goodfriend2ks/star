package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MRole;

public interface RoleService extends GenericService<MRole, UUID> {

	public MRole getByCode(UUID AD_Client_ID, UUID AD_App_ID, String code);
	
	public List<MRole> getAccessedRoles(UUID AD_Client_ID, UUID AD_User_ID, UUID AD_App_ID);
}
	
