package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;

public interface UserRepository extends GenericRepository<MUser, UUID> {
	
	/** Get Count **/
	public long getCount(UUID tenant_ID, boolean includeInactive);
	
	public MUser findUsers(String userName);
	
	public List<MUser> getUserWithRoleByApplication(UUID app_ID, int start, int count);
    
    public List<MUser> getUserWithRoleAndApplication(int start, int count);
    
    public List<MUserRole> getUserRoles(UUID tenant_ID, UUID app_ID, UUID user_ID);
}
