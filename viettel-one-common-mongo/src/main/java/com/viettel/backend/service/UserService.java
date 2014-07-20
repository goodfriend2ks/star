package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;

public interface UserService extends GenericService<MUser, UUID> {

	public MUser getByUserName(String userName);
	
//	public long getCount(UUID app_ID);
	
	public long getCount(UUID tenant_ID, boolean includeInactive);
	
//	public long getCount(String txt, Date dob);
	
	public List<MUser> getUserWithRoleByApplication(UUID app_ID, int start, int count);
	
	public List<MUser> getUserWithRoleAndApplication(int start, int count);
	
//	public List<MUser> getList(int firstResult, int maxResults, String orderBy, String txt, Date dob);
	
	public List<MApp> getAccessedApplications(UUID user_ID);
	
	public List<MUserRole> getUserRoles(UUID tenant_ID, UUID app_ID, UUID user_ID);
	
	public UUID addRole(MApp app, MRole role, MUser user);
	
	public void removeRole(MUserRole userRole);
}
