package com.viettel.backend.service;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MApp;

public interface AppService extends GenericService<MApp, UUID> {

	public UUID createApp(String name, String code, String viewAddress, String serviceAddress);
	
	public MApp getCurrentApp();
	
	public MApp getByCode(String code);
	
	/*public List<com.viettel.ws.model.Role> getRoles(UUID AD_Client_ID, UUID AD_App_ID);
	
	public List<com.viettel.ws.model.Role> getRoles(UUID AD_Client_ID, MApp app);*/
	
	public String getCurrentAppCode();
	
	/*public UUID save(MApp app, 
			Collection<MWebService> addServices, Collection<MWebService> removeServices, 
			Collection<MView> addViews, Collection<MView> removeViews,
			Collection<MPopup> addPopups, Collection<MPopup> removePopups);
	*/
	/** Popup **/
	/*public List<MPopup> getPopups(UUID AD_App_ID);
	
	public MPopup getPopup(UUID AD_App_ID, UUID AD_Popup_ID);
	
	public UUID savePopup(MPopup popup, boolean localTrx);*/
	
	/** Web Service **/
	/*public List<MWebService> getServices(UUID AD_App_ID);
	
	public MWebService getService(UUID AD_App_ID, UUID AD_WebService_ID);
	
	public MWebService getServiceByInterface(UUID AD_App_ID,
	        Class<Object> serviceInterface);
	
	public MWebService getServiceByInterface(UUID AD_App_ID,
	        String serviceInterface);

	public UUID saveWebService(MWebService webService, boolean localTrx);*/
}
	
