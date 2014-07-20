package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MFile;
import com.viettel.backend.repository.FileRepository;
import com.viettel.backend.service.FileService;


@Service(value="fileService")
public class FileServiceImpl extends DaoBaseService<MFile, UUID> implements FileService {
	
	private FileRepository fileRepo;
	
	@Autowired
	public FileServiceImpl(FileRepository fileRepo) {
		super(fileRepo);
		
		this.fileRepo = fileRepo;
	}

	@Override
	public MFile getByName(UUID tenant_ID, UUID app_ID, String name) {
		return this.fileRepo.getByName(tenant_ID, app_ID, name);
	}

	@Override
	public MFile getByUrl(UUID tenant_ID, UUID app_ID, String url) {
		return this.fileRepo.getByUrl(tenant_ID, app_ID, url);
	}

}
