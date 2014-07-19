package com.viettel.backend.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.domain.key.MUserKey;
import com.viettel.backend.domain.key.MUserRoleKey;
import com.viettel.backend.repository.AppRepository;
import com.viettel.backend.repository.UserRepository;
import com.viettel.backend.service.UserService;

@Service(value="userService")
public class UserServiceImpl extends DaoBaseService<MUser, MUserKey, UUID> implements UserService {

	private UserRepository userRepo;
	
	@Autowired
	private AppRepository appRepo;
	
    @Autowired
    public UserServiceImpl(UserRepository userRepo) {
        super(userRepo);
        this.userRepo = userRepo;
    }

    @Override
    public MUser getByUserName(String userName) {
        return userRepo.findUsers(userName);
    }
	
    @Override
	public List<MUser> getUserWithRoleByApplication(UUID applicationId, int start, int count) {
	    return userRepo.getUserWithRoleByApplication(applicationId, start, count);
	}
	
    @Override
    public List<MUser> getUserWithRoleAndApplication(int start, int count) {
        return userRepo.getUserWithRoleAndApplication(start, count);
    }
    
//    @Override
//    public List<MUser> getList(int firstResult, int maxResults, String orderBy, String txt, Date dob) {
//    	return userDao.getList(txt, dob, orderBy, firstResult, maxResults);
//    }
//    
//    @Override
//	public long getCount(UUID AD_App_ID) {
//	    return userDao.getCount(applicationId);
//	}

    @Override
    public long getCount(UUID AD_Client_ID, boolean includeInactive) {
        return userRepo.getCount(AD_Client_ID, includeInactive);
    }

//    @Override
//    public long getCount(String txt, Date dob) {
//    	return userDao.getCount(txt, dob);
//    }
    
	@Override
	public List<MUserRole> getUserRoles(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_User_ID) {
		return userRepo.getUserRoles(AD_Client_ID, AD_App_ID, AD_User_ID);
	}
	
	@Override
    public UUID addRole(MApp application, MRole role, MUser user) {
        MUserRole userRole = new MUserRole(role.getID(), user.getID());
        userRole.setID(UUID.randomUUID());
        userRole.setAd_Client_ID(role.getAd_Client_ID());
        
        return userRepo.save(MUserRole.class, MUserRoleKey.class, UUID.class, userRole, true);
    }
    
    @Override
    public void removeRole(MUserRole userRole) {
        userRepo.delete(MUserRole.class, MUserRoleKey.class, UUID.class, userRole, true);
    }
    
    @Override
    public List<MApp> getAccessedApplications(UUID userId) {
        return appRepo.getAccessedApplications(userId);
    }
}
