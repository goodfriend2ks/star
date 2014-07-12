package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MView;
import com.viettel.backend.domain.MViewPopup;
import com.viettel.backend.domain.MViewRole;
import com.viettel.backend.domain.key.MViewKey;

public interface ViewRepository extends GenericRepository<MView, MViewKey, UUID> {
	public MView getByCode(UUID AD_App_ID, String code);

    public List<MView> getRootMenusForRole(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID);

    public List<MView> getViewNotMenu(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID);

    public List<MView> getViewHasFragment(UUID AD_Role_ID);
    
    public List<UUID> getAccessedViewIdForRole(UUID AD_Role_ID);

    public List<MView> getListByApp(UUID AD_App_ID);

    public List<MView> loadByIds(UUID AD_App_ID, List<UUID> viewIds);
    
    public List<MPopup> getPopups(UUID AD_App_ID, UUID AD_View_ID);
    
    public List<MViewPopup> getViewPopups(UUID AD_App_ID, UUID AD_View_ID);
    
    public List<MViewRole> getViewRoles(UUID AD_App_ID, UUID AD_View_ID);
    
    public List<MView> getViewChildren(UUID AD_App_ID, UUID AD_View_ID, UUID AD_Role_ID);
    
    public List<MView> getChildren(UUID AD_App_ID, UUID parentView_ID);
    
    public List<MPopup> getChildPopups(UUID AD_App_ID, UUID parentView_ID);
    
    public List<MView> getViewMenus(UUID AD_App_ID, int firstResult, int maxResults);
}
