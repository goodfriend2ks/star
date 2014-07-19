package com.viettel.backend.repository.impl;

import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.domain.key.MUserKey;
import com.viettel.backend.domain.key.MUserRoleKey;
import com.viettel.backend.repository.UserRepository;

@Repository
public class UserRepositoryImpl 
	extends GenericRepositoryImpl<MUser, MUserKey, UUID> 
	implements UserRepository {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1746027152695193471L;

	@Override
	public long getCount(UUID AD_Client_ID, boolean includeInactive) {
		if (includeInactive) {
	        return getCount(AD_Client_ID, null, null);
	    }
	    
		Clause clause = new Clause(EO.ACTIVE_FIELD_NAME, ClauseOp.eq, true);
	    return getCount(AD_Client_ID, null, null, clause);
	}

	@Override
	public MUser findUsers(String userName) {
		Clause clause = new Clause("userName", ClauseOp.eq, userName);
		return getFirst(null, null, null, clause);
	}

	@Override
	public List<MUser> getUserWithRoleByApplication(UUID AD_App_ID, int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MUser> getUserWithRoleAndApplication(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MUserRole> getUserRoles(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_User_ID) {
		Clause clause = new Clause("ad_User_ID", ClauseOp.eq, AD_User_ID);
		return getList(MUserRole.class, MUserRoleKey.class, UUID.class, 
				AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, clause);
	}
}
