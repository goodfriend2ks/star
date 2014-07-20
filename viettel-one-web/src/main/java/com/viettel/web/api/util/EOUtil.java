package com.viettel.web.api.util;

import java.util.Date;
import java.util.UUID;

import org.springframework.security.authentication.AccountExpiredException;

import com.viettel.backend.common.EO;
import com.viettel.util.DataTypeUtil;
import com.viettel.web.api.security.VOUser;

public class EOUtil {
	
	public static boolean initBaseEO(EO<UUID> eo) throws AccountExpiredException
    {
		VOUser oauthUser = Env.getCurrentUser();
		if (oauthUser == null) {
			throw new AccountExpiredException("Account Expired");
		}
		
		boolean isNew = DataTypeUtil.isEmpty(UUID.class, eo.getId());
    	if (isNew)
    	{
    		eo.setTenant_ID(oauthUser.getTenant_ID());
    		eo.setOrg_ID(oauthUser.getOrg_ID());
//    		eo.setAd_App_ID(Env.getAD_App_ID());
    		eo.setId(DataTypeUtil.newValue(UUID.class));
    		eo.setCreated(new Date());
    		eo.setCreatedBy(oauthUser.getUser_ID());
    		eo.setVersion(0);
    		eo.setActive(true);
    	}
    	
    	eo.setUpdated(new Date());
    	eo.setUpdatedBy(oauthUser.getUser_ID());
    	
    	return isNew;
    }
    /*
    public static <KT extends EOKey<UUID>> KT getKey(Class<KT> clazz, UUID id)
    {
    	KT key = null;
		try {
			VOUser oauthUser = Env.getCurrentUser();
			if (oauthUser != null) {
				key = clazz.newInstance();
				key.setAd_Client_ID(oauthUser.getAd_Client_ID());
				key.setID(id);
			}
		} catch (Exception e) {}
    	
    	return key;
    }*/
}
