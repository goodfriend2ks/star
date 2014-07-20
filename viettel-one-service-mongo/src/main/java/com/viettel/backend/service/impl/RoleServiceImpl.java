package com.viettel.backend.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MRole;
import com.viettel.backend.repository.RoleRepository;
import com.viettel.backend.service.RoleService;

@Service(value="roleService")
public class RoleServiceImpl extends DaoBaseService<MRole, UUID> implements RoleService {
	
    private RoleRepository roleRepo;
    
    @Autowired
	public RoleServiceImpl(RoleRepository roleRepo) {
        super(roleRepo);
        this.roleRepo = roleRepo;
    }

    @Override
    public MRole getByCode(UUID tenant_ID, UUID app_ID, String code) {
        return roleRepo.getByCode(tenant_ID, app_ID, code);
    }
    
    @Override
    public List<MRole> getAccessedRoles(UUID tenant_ID, UUID user_ID, UUID app_ID) {
        return roleRepo.getAccessedRoles(tenant_ID, user_ID, app_ID);
    }
}
