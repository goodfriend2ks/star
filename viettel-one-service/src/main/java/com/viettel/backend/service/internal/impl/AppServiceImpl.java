package com.viettel.backend.service.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MView;
import com.viettel.backend.domain.MWebService;
import com.viettel.backend.domain.key.MAppKey;
import com.viettel.backend.domain.key.MPopupKey;
import com.viettel.backend.domain.key.MViewKey;
import com.viettel.backend.domain.key.MWebServiceKey;
import com.viettel.backend.repository.AppRepository;
import com.viettel.backend.repository.RoleRepository;
import com.viettel.backend.service.AppService;
import com.viettel.backend.service.external.jaxws.WebServiceProxyFactory;
import com.viettel.util.DataTypeUtil;

@Service(value="appService")
public class AppServiceImpl extends DaoBaseService<MApp, MAppKey, UUID> implements AppService {
	
    private AppRepository appRepo;
    
    @Autowired
    private String applicationCode;
    
    @Autowired
    private RoleRepository roleRepo;
    
    @Autowired
    private WebServiceProxyFactory serviceProxyFactory;
    
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
		
		return application.getID();
	}

	@Override
	public MApp getByCode(String code) {
		return appRepo.getByCode(code);
	}
/*
	@Override
    public List<com.viettel.ws.model.Role> getRoles(UUID AD_Client_ID, UUID AD_App_ID) {
        RoleWS roleService = serviceProxyFactory.getService(RoleWS.class, AD_App_ID);
        return roleService.getAllRole(AD_Client_ID, AD_App_ID);
    }

    @Override
    public List<com.viettel.ws.model.Role> getRoles(UUID AD_Client_ID, MApp app) {
        return getRoles(AD_Client_ID, app.getID());
    }*/

    @Override
    public String getCurrentAppCode() {
        return applicationCode;
    }

	@Override
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
	}

	@Override
	public MApp getCurrentApp() {
		return getByCode(applicationCode);
	}
//
//	@Override
//	public List<MView> getViews(UUID AD_App_ID) {
//		return applicationDao.getViews(applicationId);
//	}

	/** Popup **/
	@Override
	public List<MPopup> getPopups(UUID AD_App_ID) {
		return appRepo.getPopups(AD_App_ID);
	}

	@Override
	public MPopup getPopup(UUID AD_App_ID, UUID AD_Popup_ID) {
		return appRepo.getPopup(AD_App_ID, AD_Popup_ID);
	}

	@Override
	public UUID savePopup(MPopup popup, boolean localTrx) {
		return appRepo.save(MPopup.class, MPopupKey.class, UUID.class, popup, localTrx);
	}

	/** Web Service **/
	@Override
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
	public MWebService getService(UUID AD_App_ID, UUID AD_WebService_ID) {
		return appRepo.getWebService(AD_App_ID, AD_WebService_ID);
	}

	@Override
	public UUID saveWebService(MWebService webService, boolean localTrx) {
		return appRepo.save(MWebService.class, MWebServiceKey.class, UUID.class, webService, localTrx);
	}
}