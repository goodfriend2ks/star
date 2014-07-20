package com.viettel.backend.repository;

import java.util.UUID;

import com.viettel.backend.domain.MFile;

public interface FileRepository extends GenericRepository<MFile, UUID> {
	
	public MFile getByName(UUID tenant_ID, UUID app_ID, String name);
	
	public MFile getByUrl(UUID tenant_ID, UUID app_ID, String url);
}
