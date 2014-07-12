package com.viettel.backend.service.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MView;
import com.viettel.backend.domain.MViewPopup;
import com.viettel.backend.domain.MViewRole;
import com.viettel.backend.domain.key.MPopupKey;
import com.viettel.backend.domain.key.MViewKey;
import com.viettel.backend.domain.key.MViewPopupKey;
import com.viettel.backend.domain.key.MViewRoleKey;
import com.viettel.backend.repository.RoleRepository;
import com.viettel.backend.repository.ViewRepository;
import com.viettel.backend.service.ViewService;
import com.viettel.util.DataTypeUtil;

@Service(value="viewService")
public class ViewServiceImpl extends DaoBaseService<MView, MViewKey, UUID> implements ViewService {
	
    private ViewRepository viewRepo;
    
    @Autowired
    private RoleRepository roleRepo;
    
//    @Autowired
//    private ApplicationDao appDao;
    
    @Autowired
	public ViewServiceImpl(ViewRepository viewRepo) {
        super(viewRepo);
        this.viewRepo = viewRepo;
    }

    public MView getByCode(UUID AD_App_ID, String code) {
        return viewRepo.getByCode(AD_App_ID, code);
    }

    @Cacheable(value = "viewMenu", key = "{ #root.methodName, #AD_Client_ID, #AD_App_ID, #AD_Role_ID }")
    public List<MView> getViewMenu(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID) {
        return viewRepo.getRootMenusForRole(AD_Client_ID, AD_App_ID, AD_Role_ID);
    }
    
    public List<MView> getViewNotMenu(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID) {
        return viewRepo.getViewNotMenu(AD_Client_ID, AD_App_ID, AD_Role_ID);
    }

    public List<MView> getViewHasFragment(UUID roleId) {
        return viewRepo.getViewHasFragment(roleId);
    }

    public List<UUID> getAccessedViewIdForRole(UUID roleId) {
        return viewRepo.getAccessedViewIdForRole(roleId);
    }

    @Cacheable(value = "allViewInApp", key = "{ #root.methodName, #AD_App_ID }")
	public List<MView> getListByApp(UUID AD_App_ID) {
		return viewRepo.getListByApp(AD_App_ID);
	}
	
	public void updateAccessedViewsForRole(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID, List<UUID> viewIds) {
		MRole role = roleRepo.findById(MRole.ROOT_ID_VALUE, AD_Role_ID);
		if (role == null)
			return;
		
		Clause viewRoleClause = new Clause("ad_Role_ID", ClauseOp.eq, AD_Role_ID);
		List<MViewRole> viewRoles = viewRepo.getList(MViewRole.class, MViewRoleKey.class, UUID.class,
				AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, viewRoleClause);
		// Load các view lên - 100 mỗi lần
		//List<MView> views = viewDao.loadByIds(viewIds);
		
//		String trxName = "Trx_" + UUID.randomUUID().toString() + "_ViewServiceImpl.updateAccessedViewsForRole";
//		viewRepo.beginTransaction(trxName);
		for (UUID viewId : viewIds)
		{
			if (viewId == null)
				continue;
			
			boolean addNew = true;
			if (viewRoles != null)
			{
				for (int i=0; i<viewRoles.size(); i++)
				{
					if (viewRoles.get(i) != null 
							&& DataTypeUtil.compare(UUID.class, viewRoles.get(i).getAd_View_ID(), viewId) == 0)
					{
						addNew = false;
						viewRoles.remove(i);
						break;
					}
				}
			}
			
			if (addNew)
			{
				MViewRole viewRole = new MViewRole();
				viewRole.setID(DataTypeUtil.newValue(UUID.class));
				viewRole.setAd_Client_ID(AD_Client_ID);
				viewRole.setAd_Role_ID(AD_Role_ID);
				viewRole.setAd_View_ID(viewId);
				viewRepo.save(MViewRole.class, MViewRoleKey.class, UUID.class, viewRole, false);
			}
		}
		//role.setViews(new ArrayList<MView>(views));
		roleRepo.save(role, false);
		
		if (viewRoles != null && viewRoles.size() > 0)
		{
			List<UUID> viewRoleIds = new ArrayList<>();
			for (MViewRole viewRole : viewRoles)
				viewRoleIds.add(viewRole.getID());
			
			Clause clause = new Clause("ad_View_Role_ID", viewRoleIds);
			viewRepo.delete(MViewRole.class, MViewRoleKey.class, UUID.class, AD_Client_ID, false, clause);
		}
		
//		viewRepo.commitTransaction(trxName);
	}

	@Override
	public List<MPopup> getPopups(UUID AD_App_ID, UUID AD_View_ID) {
		return viewRepo.getPopups(AD_App_ID, AD_View_ID);
	}

	/** View_ID -> { MPopup } **/
	@Cacheable(value = "allViewPopups", key = "{ #root.methodName, #AD_App_ID }")
	public Map<UUID, List<MPopup>> getAllPopups(UUID AD_App_ID) {
		Clause clause = new Clause("ad_App_ID", ClauseOp.eq, AD_App_ID);
		List<MViewPopup> viewPopups = viewRepo.getList(MViewPopup.class, MViewPopupKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, clause);
		
		List<MPopup> allPopups = viewRepo.getList(MPopup.class, MPopupKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, clause);
		
		Map<UUID, List<MPopup>> results = new HashMap<UUID, List<MPopup>>();
		for (MViewPopup viewPopup : viewPopups) {
			UUID AD_View_ID = viewPopup.getAd_View_ID();
			UUID AD_Popup_ID = viewPopup.getAd_Popup_ID();
			List<MPopup> popups = results.get(AD_View_ID);
			if (popups == null)
				popups = new ArrayList<>();
			
			for (MPopup popup : allPopups) {
				if (DataTypeUtil.compare(UUID.class, AD_Popup_ID, popup.getID()) == 0) {
					popups.add(popup);
				}
			}
			
			results.put(AD_View_ID, popups);
		}
		
		return results;
	}
	
	@Override
	public List<MViewPopup> getViewPopups(UUID AD_App_ID, UUID AD_View_ID) {
		return viewRepo.getViewPopups(AD_App_ID, AD_View_ID);
	}
	
	@Override
	public List<MViewRole> getViewRoles(UUID AD_App_ID, UUID AD_View_ID) {
		return viewRepo.getViewRoles(AD_App_ID, AD_View_ID);
	}
	
	@Override
	public List<MView> getViewChildren(UUID AD_App_ID, UUID AD_View_ID, UUID AD_Role_ID) {
		return viewRepo.getViewChildren(AD_App_ID, AD_View_ID, AD_Role_ID);
	}

	@Override
	public List<MView> getChildren(UUID AD_App_ID, UUID parentView_ID) {
		return viewRepo.getChildren(AD_App_ID, parentView_ID);
	}

	@Override
	public List<MPopup> getChildPopups(UUID AD_App_ID, UUID parentView_ID) {
		return viewRepo.getChildPopups(AD_App_ID, parentView_ID);
	}

	@Override
	public List<MView> getViewMenus(UUID AD_App_ID, int firstResult, int maxResults) {
		return viewRepo.getViewMenus(AD_App_ID, firstResult, maxResults);
	}
	
	public UUID save(MView view, Collection<MViewPopup> addPopups, Collection<MViewPopup> removePopups) {
//		String trxName = "Save_" + view.getID().toString();
		try {
//			viewRepo.beginTransaction(trxName);
			
			UUID itemId = viewRepo.save(view, false);
			if (addPopups != null)
			{
				for (MViewPopup viewPopup : addPopups)
				{
					if (viewPopup.getAd_View_ID() == null)
						viewPopup.setAd_View_ID(view.getID());
					
					UUID viewPopupId = viewRepo.save(MViewPopup.class, MViewPopupKey.class, UUID.class, 
							viewPopup, false);
					if (DataTypeUtil.isEmpty(UUID.class, viewPopupId))
					{
//						viewRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			if (removePopups != null)
			{
				for (MViewPopup viewPopup : removePopups) {
					boolean result = viewRepo.delete(MViewPopup.class, MViewPopupKey.class, UUID.class, 
							viewPopup, false);
					if (!result)
					{
//						viewRepo.rolebackTransaction(trxName);
						return null;
					}
				}
			}
			
			List<MViewRole> viewRoles = viewRepo.getViewRoles(view.getAd_App_ID(), itemId);
			if (viewRoles == null || viewRoles.size() == 0) {
				MViewRole viewRole = new MViewRole();
				viewRole.setAd_Client_ID(EO.ROOT_ID_VALUE);
				viewRole.setAd_Org_ID(EO.ROOT_ID_VALUE);
				viewRole.setAd_App_ID(view.getAd_App_ID());
				viewRole.setID(DataTypeUtil.newValue(UUID.class));
				viewRole.setAd_View_ID(itemId);
				viewRole.setAd_Role_ID(EO.ROOT_ID_VALUE);
				viewRepo.save(MViewRole.class, MViewRoleKey.class, UUID.class, viewRole, false);
			}
			
//			viewRepo.commitTransaction(trxName);
			return itemId;
		} catch (Exception e) {
//			viewRepo.rolebackTransaction(trxName);
		}
		
		return null;
	}
}
