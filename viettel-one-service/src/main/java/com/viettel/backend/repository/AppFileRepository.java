package com.viettel.backend.repository;

import java.util.UUID;

import com.viettel.backend.domain.MAppFile;
import com.viettel.backend.domain.key.MAppFileKey;

public interface AppFileRepository extends GenericRepository<MAppFile, MAppFileKey, UUID> {
	
	public MAppFile getByClientName(UUID AD_Client_ID, UUID AD_App_ID, String path);
	
	public MAppFile getByFtpName(UUID AD_Client_ID, UUID AD_App_ID, String name);
}
