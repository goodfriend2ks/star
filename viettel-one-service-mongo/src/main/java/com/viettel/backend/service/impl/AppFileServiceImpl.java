package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MAppFile;
import com.viettel.backend.domain.key.MAppFileKey;
import com.viettel.backend.repository.AppFileRepository;
import com.viettel.backend.service.AppFileService;


@Service(value="appFileService")
public class AppFileServiceImpl extends DaoBaseService<MAppFile, MAppFileKey, UUID> implements AppFileService {
	
	private AppFileRepository appFileRepo;
	
	@Autowired
	public AppFileServiceImpl(AppFileRepository appFileRepo) {
		super(appFileRepo);
		
		this.appFileRepo = appFileRepo;
	}

	@Override
	public MAppFile getByClientName(UUID AD_Client_ID, UUID AD_App_ID, String path) {
		return appFileRepo.getByClientName(AD_Client_ID, AD_App_ID, path);
	}

	@Override
	public MAppFile getByFtpName(UUID AD_Client_ID, UUID AD_App_ID, String name) {
		return appFileRepo.getByFtpName(AD_Client_ID, AD_App_ID, name);
	}
}
