package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MApp;

public interface AppRepository extends GenericRepository<MApp, UUID> {
	
	public MApp getByCode(String code);

    public List<MApp> getAccessedApplications(UUID user_ID);

//    public List<MWebService> getWebServices(UUID app_ID);
//    
//    public MWebService getWebServiceByInterface(UUID app_ID, String serviceInterface);
//    
//    public MWebService getWebService(UUID app_ID, UUID AD_WebService_ID);
//    
//    public List<MPopup> getPopups(UUID app_ID);
//    
//    public MPopup getPopup(UUID app_ID, UUID AD_Popup_ID);
}
