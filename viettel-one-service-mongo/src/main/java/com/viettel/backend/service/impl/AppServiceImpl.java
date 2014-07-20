package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.repository.AppRepository;
import com.viettel.backend.repository.RoleRepository;
import com.viettel.backend.service.AppService;

@Service(value="appService")
public class AppServiceImpl extends DaoBaseService<MApp, UUID> implements AppService {
	
    private AppRepository appRepo;
    
    @Autowired
    private String applicationCode;
    
    @Autowired
    private RoleRepository roleRepo;
    
//    @Autowired
//    private WebServiceProxyFactory serviceProxyFactory;
    
    @Autowired
	public AppServiceImpl(AppRepository appRepo) {
        super(appRepo);
        this.appRepo = appRepo;
    }

    @Override
	public UUID createApp(String name, String code, String viewAddress, String serviceAddress) {
		MApp application = new MApp();
		application.setName(name);
		application.setCode(code);
		application.setViewAddress(viewAddress);
		application.setServiceAddress(serviceAddress);
		
		appRepo.save(application, true);
		
		return application.getId();
	}

	@Override
	public MApp getByCode(String code) {
		return appRepo.getByCode(code);
	}
/*
	@Override
    public List<com.viettel.ws.model.Role> getRoles(UUID tenant_ID, UUID app_ID) {
        RoleWS roleService = serviceProxyFactory.getService(RoleWS.class, app_ID);
        return roleService.getAllRole(tenant_ID, app_ID);
    }

    @Override
    public List<com.viettel.ws.model.Role> getRoles(UUID tenant_ID, MApp app) {
        return getRoles(tenant_ID, app.getID());
    }*/

    @Override
    public String getCurrentAppCode() {
        return applicationCode;
    }

	/*@Override
	public UUID save(MApp app, 
			Collection<MWebService> addServices, Collection<MWebService> removeServices, 
			Collection<MView> addViews, Collection<MView> removeViews,
			Collection<MPopup> addPopups, Collection<MPopup> removePopups) {
		
		String trxName = "Save_" + app.getID().toString();
		try {
			appRepo.beginTransaction(trxName);
			
			UUID appId = appRepo.save(app, false);
			
			// Web Service
			if (addServices != null)
			{
				for (MWebService service : addServices)
				{
					if (service.getAd_App_ID() == null)
						service.setAd_App_ID(app.getID());
					
					UUID serviceId = appRepo.save(MWebService.class, MWebServiceKey.class, UUID.class, 
							service, false);
					if (DataTypeUtil.isEmpty(UUID.class, serviceId))
					{
						appRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			if (removeServices != null)
			{
				for (MWebService service : removeServices)
				{
					boolean result = appRepo.delete(MWebService.class, MWebServiceKey.class, UUID.class, 
							service, false);
					if (!result)
					{
						appRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			// View
			if (addViews != null)
			{
				for (MView view : addViews)
				{
					if (view.getAd_App_ID() == null)
						view.setAd_App_ID(app.getID());
					
					UUID viewId = appRepo.save(MView.class, MViewKey.class, UUID.class, view, false);
					if (DataTypeUtil.isEmpty(UUID.class, viewId))
					{
						appRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			if (removeViews != null)
			{
				for (MView view : removeViews)
				{
					boolean result = appRepo.delete(MView.class, MViewKey.class, UUID.class, 
							view, false);
					if (!result)
					{
						appRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			// Popup
			if (addPopups != null)
			{
				for (MPopup popup : addPopups)
				{
					if (popup.getAd_App_ID() == null)
						popup.setAd_App_ID(app.getID());
					
					UUID popupId = appRepo.save(MPopup.class, MPopupKey.class, UUID.class, popup, false);
					if (DataTypeUtil.isEmpty(UUID.class, popupId))
					{
						appRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			if (removePopups != null)
			{
				for (MPopup popup : removePopups)
				{
					boolean result = appRepo.delete(MPopup.class, MPopupKey.class, UUID.class, 
							popup, false);
					if (!result)
					{
						appRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			appRepo.commitTransaction(trxName);
			return appId;
		} catch (Exception e) {
			appRepo.rolebackTransaction(trxName);
		}
		
		return null;
	}*/

	@Override
	public MApp getCurrentApp() {
		return getByCode(applicationCode);
	}
//
//	@Override
//	public List<MView> getViews(UUID app_ID) {
//		return applicationDao.getViews(applicationId);
//	}

	/** Popup **/
	/*@Override
	public List<MPopup> getPopups(UUID app_ID) {
		return appRepo.getPopups(app_ID);
	}

	@Override
	public MPopup getPopup(UUID app_ID, UUID AD_Popup_ID) {
		return appRepo.getPopup(app_ID, AD_Popup_ID);
	}

	@Override
	public UUID savePopup(MPopup popup, boolean localTrx) {
		return appRepo.save(MPopup.class, MPopupKey.class, UUID.class, popup, localTrx);
	}*/

	/** Web Service **/
	/*@Override
    public List<MWebService> getServices(UUID appId) {
        return appRepo.getWebServices(appId);
    }

    @Override
    public MWebService getServiceByInterface(UUID appId, Class<Object> serviceInterface) {
        return appRepo.getWebServiceByInterface(appId, serviceInterface.getName());
    }

    @Override
    public MWebService getServiceByInterface(UUID appId, String serviceInterface) {
        return appRepo.getWebServiceByInterface(appId, serviceInterface);
    }
    
	@Override
	public MWebService getService(UUID app_ID, UUID AD_WebService_ID) {
		return appRepo.getWebService(app_ID, AD_WebService_ID);
	}

	@Override
	public UUID saveWebService(MWebService webService, boolean localTrx) {
		return appRepo.save(MWebService.class, MWebServiceKey.class, UUID.class, webService, localTrx);
	}*/
}