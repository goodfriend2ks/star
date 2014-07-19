package com.viettel.backend.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.key.MClientKey;
import com.viettel.backend.repository.ClientRepository;
import com.viettel.backend.service.ClientService;

@Service(value="clientService")
public class ClientServiceImpl extends DaoBaseService<MClient, MClientKey, UUID> implements ClientService {
	
	@Autowired
    private ClientRepository clientRepo;
	
	@Autowired
	public ClientServiceImpl(ClientRepository clientRepo) {
        super(clientRepo);
        this.clientRepo = clientRepo;
    }
	
	@Override
	public List<MOrg> getOrgs(UUID ad_Client_ID)
	{
		return clientRepo.getOrgs(ad_Client_ID);
	}

	@Override
	public long getOrgCount(UUID ad_Client_ID) {
		return clientRepo.getOrgCount(ad_Client_ID);
	}

	@Override
	public MOrg getOrg(UUID ad_Client_ID, UUID ad_Org_ID) {
		return clientRepo.getOrg(ad_Client_ID, ad_Org_ID);
	}
}
