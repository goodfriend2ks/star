package com.viettel.backend.service.internal.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.key.MRoleKey;
import com.viettel.backend.repository.RoleRepository;
import com.viettel.backend.service.RoleService;

@Service(value="roleService")
public class RoleServiceImpl extends DaoBaseService<MRole, MRoleKey, UUID> implements RoleService {
	
    private RoleRepository roleRepo;
    
    @Autowired
	public RoleServiceImpl(RoleRepository roleRepo) {
        super(roleRepo);
        this.roleRepo = roleRepo;
    }

    @Override
    public MRole getByCode(UUID AD_Client_ID, UUID AD_App_ID, String code) {
        return roleRepo.getByCode(AD_Client_ID, AD_App_ID, code);
    }
    
    @Override
    public List<MRole> getAccessedRoles(UUID AD_Client_ID, UUID AD_User_ID, UUID AD_App_ID) {
        return roleRepo.getAccessedRoles(AD_Client_ID, AD_User_ID, AD_App_ID);
    }
}
