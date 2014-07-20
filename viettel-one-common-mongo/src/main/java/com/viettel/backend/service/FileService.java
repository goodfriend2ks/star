package com.viettel.backend.service;

import java.util.UUID;

import com.viettel.backend.domain.MFile;

public interface FileService
{
	public MFile getByName(UUID tenant_ID, UUID app_ID, String name);
	
	public MFile getByUrl(UUID tenant_ID, UUID app_ID, String url);
}
