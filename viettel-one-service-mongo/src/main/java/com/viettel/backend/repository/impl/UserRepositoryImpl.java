package com.viettel.backend.repository.impl;

import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.repository.UserRepository;

@Repository
public class UserRepositoryImpl 
	extends GenericRepositoryImpl<MUser, UUID> 
	implements UserRepository {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1746027152695193471L;

	@Override
	public long getCount(UUID tenant_ID, boolean includeInactive) {
		if (includeInactive) {
	        return getCount(tenant_ID, null, null, null);
	    }
	    
		GenericQuery query = query(criteria(EO.ACTIVE_PROPERTY).is(true));
	    return getCount(tenant_ID, null, null, query);
	}

	@Override
	public MUser findUsers(String userName) {
		GenericQuery query = query(criteria("userName").is(userName));
		return getFirst(null, null, null, query);
	}

	@Override
	public List<MUser> getUserWithRoleByApplication(UUID app_ID, int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MUser> getUserWithRoleAndApplication(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MUserRole> getUserRoles(UUID tenant_ID, UUID app_ID, UUID user_ID) {
		GenericQuery query = query(criteria("user_ID").is(user_ID));
		
		return getList(MUserRole.class, UUID.class, 
				tenant_ID, EO.ROOT_ID_VALUE, app_ID, query);
	}
}
