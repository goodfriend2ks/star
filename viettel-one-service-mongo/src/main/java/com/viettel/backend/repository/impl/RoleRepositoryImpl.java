package com.viettel.backend.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.domain.key.MRoleKey;
import com.viettel.backend.domain.key.MUserRoleKey;
import com.viettel.backend.repository.RoleRepository;

@Repository
public class RoleRepositoryImpl 
	extends GenericRepositoryImpl<MRole, MRoleKey, UUID> 
	implements RoleRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2243454900885367536L;

	@Override
	public MRole getByCode(UUID AD_Client_ID, UUID AD_App_ID, String code) {
		Clause clause = new Clause("code", ClauseOp.eq, code);
    	return getFirst(AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, clause);
	}

	@Override
	public List<MRole> getAccessedRoles(UUID AD_Client_ID, UUID AD_User_ID, UUID AD_App_ID) {
		Clause userRoleClause = new Clause("ad_User_ID", ClauseOp.eq, AD_User_ID);
		List<MUserRole> userRoles = getList(MUserRole.class, MUserRoleKey.class, UUID.class, 
				AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, userRoleClause);
		if (userRoles == null || userRoles.isEmpty())
			return null;
		
		List<UUID> roleIds = new ArrayList<>();
		for (MUserRole ur : userRoles)
			roleIds.add(ur.getAd_Role_ID());
		
		Clause appClause = new Clause("ad_App_ID", ClauseOp.eq, AD_App_ID);
		Clause roleClause = new Clause("ad_Role_ID", roleIds);
		return getList(AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, 
				appClause, roleClause);
	}
}
