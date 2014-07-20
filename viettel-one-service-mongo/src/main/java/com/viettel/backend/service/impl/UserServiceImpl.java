package com.viettel.backend.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.repository.AppRepository;
import com.viettel.backend.repository.UserRepository;
import com.viettel.backend.service.UserService;

@Service(value="userService")
public class UserServiceImpl extends DaoBaseService<MUser, UUID> implements UserService {

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
	public List<MUser> getUserWithRoleByApplication(UUID app_ID, int start, int count) {
	    return userRepo.getUserWithRoleByApplication(app_ID, start, count);
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
//	public long getCount(UUID app_ID) {
//	    return userDao.getCount(applicationId);
//	}

    @Override
    public long getCount(UUID tenant_ID, boolean includeInactive) {
        return userRepo.getCount(tenant_ID, includeInactive);
    }

//    @Override
//    public long getCount(String txt, Date dob) {
//    	return userDao.getCount(txt, dob);
//    }
    
	@Override
	public List<MUserRole> getUserRoles(UUID tenant_ID, UUID app_ID, UUID user_ID) {
		return userRepo.getUserRoles(tenant_ID, app_ID, user_ID);
	}
	
	@Override
    public UUID addRole(MApp app, MRole role, MUser user) {
        MUserRole userRole = new MUserRole(role.getId(), user.getId());
        userRole.setId(UUID.randomUUID());
        userRole.setTenant_ID(role.getTenant_ID());
        
        return userRepo.save(MUserRole.class, UUID.class, userRole, true);
    }
    
    @Override
    public void removeRole(MUserRole userRole) {
        userRepo.delete(MUserRole.class, UUID.class, userRole, true);
    }
    
    @Override
    public List<MApp> getAccessedApplications(UUID userId) {
        return appRepo.getAccessedApplications(userId);
    }
}
