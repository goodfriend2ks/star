package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MRole;

public interface RoleRepository extends GenericRepository<MRole, UUID> {
	
	public MRole getByCode(UUID tenant_ID, UUID app_ID, String code);
    
    public List<MRole> getAccessedRoles(UUID tenant_ID, UUID user_ID, UUID app_ID);
}
