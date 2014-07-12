package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.domain.key.MUserKey;

public interface UserRepository extends GenericRepository<MUser, MUserKey, UUID> {
	
	/** Get Count **/
	public long getCount(UUID AD_Client_ID, boolean includeInactive);
	
	public MUser findUsers(String userName);
	
	public List<MUser> getUserWithRoleByApplication(UUID AD_App_ID, int start, int count);
    
    public List<MUser> getUserWithRoleAndApplication(int start, int count);
    
    public List<MUserRole> getUserRoles(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_User_ID);
}
