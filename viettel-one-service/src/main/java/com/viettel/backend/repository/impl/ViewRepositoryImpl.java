package com.viettel.backend.repository.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
import com.viettel.backend.repository.AppRepository;
import com.viettel.backend.repository.CommonRepository;
import com.viettel.backend.repository.RoleRepository;
import com.viettel.backend.repository.ViewRepository;
import com.viettel.util.DataTypeUtil;

@Repository
public class ViewRepositoryImpl 
	extends GenericRepositoryImpl<MView, MViewKey, UUID> 
	implements ViewRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 355292824429605955L;

	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private AppRepository appRepo;
	
	@Autowired
	private CommonRepository commonRepo;

	private static final Comparator<MView> viewSeqNoComparator = new Comparator<MView>() {
		@Override
		public int compare(MView obj1, MView obj2) {
			return (obj1.getSeqNo() == obj2.getSeqNo() ? 0 : (obj1.getSeqNo() < obj2.getSeqNo() ? -1 : 1));
		}
	};
	
	@Override
	public MView getByCode(UUID AD_App_ID, String code) {
		Clause clause = new Clause("code", ClauseOp.eq, code); 
		return getFirst(EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, clause );
	}

	@Override
	public List<MView> getRootMenusForRole(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID) {
		List<MView> results = new ArrayList<MView>();
		
		MRole role = roleRepo.findById(AD_Client_ID, AD_Role_ID);
		if (role == null || !role.isActive())
			return results;
		
		Clause viewRoleClause = new Clause("ad_Role_ID", ClauseOp.eq, AD_Role_ID);
		List<MViewRole> viewRoles = commonRepo.getList(MViewRole.class, MViewRoleKey.class, UUID.class, 
				AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, viewRoleClause);
		if (viewRoles == null || viewRoles.size() == 0)
			return results;
		
		List<UUID> viewIds = new ArrayList<>();
		for (MViewRole viewRole : viewRoles)
			viewIds.add(viewRole.getAd_View_ID());
		
		Clause viewClause = new Clause("ad_View_ID", viewIds);
		results = getList(EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, viewClause);
		
		Map<UUID, MView> viewMaps = new HashMap<UUID, MView>();
		for (MView view : results) {
			viewMaps.put(view.getID(), view);
		}
		
		int index = 0;
		while (index != results.size())
		{
			MView view = results.get(index);
			index++;
			
			loadParentView(results, viewMaps, view, true);
		}

		return results;
	}

	private void loadParentView(List<MView> views, Map<UUID, MView> viewMaps, MView view, boolean addList) {
		if (!view.hasParent())
			return;
		
		boolean addToMap = false;
		
		MView parent = null;
		if (viewMaps.containsKey(view.getParent_ID())) {
			parent = viewMaps.get(view.getParent_ID());
		} else { 
			parent = findById(EO.ROOT_ID_VALUE, view.getParent_ID());
			addToMap = true;
		}
		
		if (parent == null || !parent.isSummary())
			return;
		
		if (!parent.isActive()) {
			removeChildren(views, parent);
			return;
		}
		
		if (addList && addToMap)
			views.add(parent);
		
		if (addToMap)
			viewMaps.put(parent.getID(), parent);
		
		loadParentView(views, viewMaps, parent, addList);
	}
	
	private void removeChildren(List<MView> views, MView parent) {
		int index = 0;
		while (index != views.size())
		{
			MView view = views.get(index);
			index++;
			
			if (DataTypeUtil.compare(UUID.class, parent.getID(), view.getParent_ID()) == 0) {
				removeChildren(views, view);
			}
		}
		
		views.remove(parent);
	}
	
	@Override
	public List<MView> getViewNotMenu(UUID AD_Client_ID, UUID AD_App_ID, UUID AD_Role_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MView> getViewHasFragment(UUID AD_Role_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UUID> getAccessedViewIdForRole(UUID AD_Role_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MView> getListByApp(UUID AD_App_ID) {
		List<MView> results = getList(EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID);
		Collections.sort(results, viewSeqNoComparator);
		return results;
	}

	@Override
	public List<MView> loadByIds(UUID AD_App_ID, List<UUID> viewIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MPopup> getPopups(UUID AD_App_ID, UUID AD_View_ID) {
		List<MViewPopup> viewPopups = getViewPopups(AD_App_ID, AD_View_ID);
		if (viewPopups == null || viewPopups.isEmpty())
			return null;
		
		List<UUID> popupIds = new ArrayList<>();
		for (MViewPopup viewPopup : viewPopups) {
			popupIds.add(viewPopup.getAd_Popup_ID());
		}
		
		Clause popupClause = new Clause("ad_Popup_ID", popupIds);
		return appRepo.getList(MPopup.class, MPopupKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, popupClause);
	}

	@Override
	public List<MViewPopup> getViewPopups(UUID AD_App_ID, UUID AD_View_ID) {
		Clause viewPopupClause = new Clause("ad_View_ID", ClauseOp.eq, AD_View_ID);
		return getList(MViewPopup.class, MViewPopupKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, viewPopupClause);
	}

	@Override
	public List<MViewRole> getViewRoles(UUID AD_App_ID, UUID AD_View_ID) {
		Clause viewRoleClause = new Clause("ad_View_ID", ClauseOp.eq, AD_View_ID);
		return getList(MViewRole.class, MViewRoleKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, viewRoleClause);
	}

	@Override
	public List<MView> getViewChildren(UUID AD_App_ID, UUID AD_View_ID,
			UUID AD_Role_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MView> getChildren(UUID AD_App_ID, UUID parentView_ID) {
		Clause parentClause = new Clause(EO.PARENT_FIELD_NAME, ClauseOp.eq, parentView_ID);
		Clause activeClause = new Clause(EO.ACTIVE_FIELD_NAME, ClauseOp.eq, true);
		return getList(EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID,
				parentClause, activeClause);
	}

	@Override
	public List<MPopup> getChildPopups(UUID AD_App_ID, UUID parentView_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MView> getViewMenus(UUID AD_App_ID, int firstResult,
			int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}
}
