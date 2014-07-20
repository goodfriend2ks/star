package com.viettel.backend.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MTenant;
import com.viettel.backend.repository.TenantRepository;
import com.viettel.backend.service.TenantService;

@Service(value="tenantService")
public class TenantServiceImpl extends DaoBaseService<MTenant, UUID> implements TenantService {
	
	@Autowired
    private TenantRepository tenantRepo;
	
	@Autowired
	public TenantServiceImpl(TenantRepository tenantRepo) {
        super(tenantRepo);
        this.tenantRepo = tenantRepo;
    }
	
	@Override
	public List<MOrg> getOrgs(UUID tenant_ID)
	{
		return tenantRepo.getOrgs(tenant_ID);
	}

	@Override
	public long getOrgCount(UUID tenant_ID) {
		return tenantRepo.getOrgCount(tenant_ID);
	}

	@Override
	public MOrg getOrg(UUID tenant_ID, UUID org_ID) {
		return tenantRepo.getOrg(tenant_ID, org_ID);
	}
}
