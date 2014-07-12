package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.domain.key.MUserKey;

public interface UserService extends GenericService<MUser, MUserKey, UUID> {

	public MUser getByUserName(String userName);
	
//	public long getCount(UUID AD_App_ID);
	
	public long getCount(UUID AD_Client_ID, boolean includeInactive);
	
//	public long getCount(String txt, Date dob);
	
	public List<MUser> getUserWithRoleByApplication(UUID AD_App_ID, int start, int count);
	
	public List<MUser> getUserWithRoleAndApplication(int start, int count);
	
//	public List<MUser> getList(int firstResult, int maxResults, String orderBy, String txt, Date dob);
	
	public List<MApp> getAccessedApplications(UUID AD_User_ID);
	
	public List<MUserRole> getUserRoles(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_User_ID);
	
	public UUID addRole(MApp app, MRole role, MUser user);
	
	public void removeRole(MUserRole userRole);
}
