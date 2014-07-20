package com.viettel.backend.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.repository.RoleRepository;

@Repository
public class RoleRepositoryImpl 
	extends GenericRepositoryImpl<MRole, UUID> 
	implements RoleRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2243454900885367536L;

	@Override
	public MRole getByCode(UUID tenant_ID, UUID app_ID, String code) {
		GenericQuery query = query(criteria("code").is(code));
    	return getFirst(tenant_ID, EO.ROOT_ID_VALUE, app_ID, query);
	}

	@Override
	public List<MRole> getAccessedRoles(UUID tenant_ID, UUID user_ID, UUID app_ID) {
		GenericQuery query = query(criteria("user_ID").is(user_ID));
		List<MUserRole> userRoles = getList(MUserRole.class, UUID.class, 
				tenant_ID, EO.ROOT_ID_VALUE, app_ID, query);
		if (userRoles == null || userRoles.isEmpty())
			return null;
		
		List<UUID> roleIds = new ArrayList<>();
		for (MUserRole ur : userRoles)
			roleIds.add(ur.getRole_ID());
		
		query = query(criteria("app_ID").is(app_ID)
				.and("role_ID").in(roleIds));
		return getList(tenant_ID, EO.ROOT_ID_VALUE, app_ID, query);
	}
}
