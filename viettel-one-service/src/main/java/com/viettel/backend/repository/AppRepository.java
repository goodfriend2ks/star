package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MWebService;
import com.viettel.backend.domain.key.MAppKey;

public interface AppRepository extends GenericRepository<MApp, MAppKey, UUID> {
	
	public MApp getByCode(String code);

    public List<MApp> getAccessedApplications(UUID AD_User_ID);

    public List<MWebService> getWebServices(UUID AD_App_ID);
    
    public MWebService getWebServiceByInterface(UUID AD_App_ID, String serviceInterface);
    
    public MWebService getWebService(UUID AD_App_ID, UUID AD_WebService_ID);
    
//    public List<MView> getViews(UUID appId);
    
    public List<MPopup> getPopups(UUID AD_App_ID);
    
    public MPopup getPopup(UUID AD_App_ID, UUID AD_Popup_ID);
}
