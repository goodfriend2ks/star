package com.viettel.api.util;

import java.util.Date;
import java.util.UUID;

import org.springframework.security.authentication.AccountExpiredException;

import com.viettel.api.security.VOUser;
import com.viettel.backend.common.EO;
import com.viettel.backend.common.EOKey;
import com.viettel.util.DataTypeUtil;

public class EOUtil {
	
	public static <KT extends EOKey<UUID>> boolean initBaseEO(EO<KT, UUID> eo) throws AccountExpiredException
    {
		VOUser oauthUser = Env.getCurrentUser();
		if (oauthUser == null) {
			throw new AccountExpiredException("Account Expired");
		}
		
		boolean isNew = DataTypeUtil.isEmpty(UUID.class, eo.getID());
    	if (isNew)
    	{
    		eo.setAd_Client_ID(oauthUser.getAd_Client_ID());
    		eo.setAd_Org_ID(oauthUser.getAd_Org_ID());
//    		eo.setAd_App_ID(Env.getAD_App_ID());
    		eo.setID(DataTypeUtil.newValue(UUID.class));
    		eo.setCreated(new Date());
    		eo.setCreatedBy(oauthUser.getAd_User_ID());
    		eo.setVersion(0);
    		eo.setActive(true);
    	}
    	
    	eo.setUpdated(new Date());
    	eo.setUpdatedBy(oauthUser.getAd_User_ID());
    	
    	return isNew;
    }
    
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
    }
}
