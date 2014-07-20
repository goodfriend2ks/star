package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MRole;

public interface RoleService extends GenericService<MRole, UUID> {

	public MRole getByCode(UUID tenant_ID, UUID app_ID, String code);
	
	public List<MRole> getAccessedRoles(UUID tenant_ID, UUID user_ID, UUID app_ID);
}
	
