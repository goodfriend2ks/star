package com.viettel.backend.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MView;
import com.viettel.backend.domain.MViewPopup;
import com.viettel.backend.domain.MViewRole;
import com.viettel.backend.domain.key.MViewKey;

public interface ViewService extends GenericService<MView, MViewKey, UUID> {

	public MView getByCode(UUID AD_App_ID, String code);
	
	public List<MView> getViewMenu(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID);
	
	public List<MView> getViewNotMenu(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID);
	
	public List<MView> getViewHasFragment(UUID AD_Role_ID);
	
	/**
	 * Lay danh sach id cac view ma role duoc truy cap
	 * 
	 */
	public List<UUID> getAccessedViewIdForRole(UUID AD_Role_ID);
	
	/**
	 * Tra ve tat ca cac View bao gom cac thuoc tinh view, views.
	 * Cac view la view con duoc chua trong cac view cha.
	 */
	public List<MView> getListByApp(UUID ad_App_ID);
	
	/**
	 * cap nhat lai danh sach cac view ma role duoc truy cap
	 *
	 * @param roleId
	 *		Id role can cap nhat
	 * @param viewIds
	 *  danh sach id cac view ma role duoc truy cap
	 * 		
	 */
	public void updateAccessedViewsForRole(UUID ad_Client_ID, UUID ad_App_ID, UUID AD_Role_ID, List<UUID> viewIds);
	
	/**
	 * @author haind25
	 * lay danh sach tat cac cac view la view con cua view nay 
	 * duoc phep truy cap.
	 * trong lop DAO phai tu check voi role
	 * 
	 * */
	public List<MPopup> getPopups(UUID AD_App_ID, UUID AD_View_ID);
	
	/** View_ID -> { MPopup } **/
	public Map<UUID, List<MPopup>> getAllPopups(UUID AD_App_ID);
	
	public List<MViewPopup> getViewPopups(UUID AD_App_ID, UUID AD_View_ID);
	
	public List<MViewRole> getViewRoles(UUID AD_App_ID, UUID AD_View_ID);
	
	public List<MView> getViewChildren(UUID AD_App_ID, UUID AD_View_ID, UUID AD_Role_ID);
	
	public List<MView> getChildren(UUID AD_App_ID, UUID parentView_ID);
	
    public List<MPopup> getChildPopups(UUID AD_App_ID, UUID parentView_ID);
    
    public List<MView> getViewMenus(UUID AD_App_ID, int firstResult, int maxResults);
	
    public UUID save(MView view, Collection<MViewPopup> addPopups, Collection<MViewPopup> removePopups);
}
