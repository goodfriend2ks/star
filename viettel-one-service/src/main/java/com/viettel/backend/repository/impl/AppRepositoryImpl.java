package com.viettel.backend.repository.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MWebService;
import com.viettel.backend.domain.key.MAppKey;
import com.viettel.backend.domain.key.MPopupKey;
import com.viettel.backend.domain.key.MWebServiceKey;
import com.viettel.backend.repository.AppRepository;

@Repository
public class AppRepositoryImpl 
	extends GenericRepositoryImpl<MApp, MAppKey, UUID> 
	implements AppRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3157910231121230143L;

	private static final Comparator<MWebService> serviceSeqNoComparator = new Comparator<MWebService>() {
		@Override
		public int compare(MWebService obj1, MWebService obj2) {
			return (obj1.getSeqNo() == obj2.getSeqNo() ? 0 : (obj1.getSeqNo() < obj2.getSeqNo() ? -1 : 1));
		}
	};
	
	@Override
	public MApp getByCode(String code) {
		Clause clause = new Clause("code", ClauseOp.eq, code);
    	return getFirst(EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, null, clause);
	}

	@Override
	public List<MApp> getAccessedApplications(UUID AD_User_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MWebService> getWebServices(UUID AD_App_ID) {
		Clause appClause = new Clause(EO.APP_FIELD_NAME, ClauseOp.eq, AD_App_ID);
		List<MWebService> results = getList(MWebService.class, MWebServiceKey.class, UUID.class,
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, appClause);
		Collections.sort(results, serviceSeqNoComparator);
		return results;
	}

	@Override
	public MWebService getWebServiceByInterface(UUID AD_App_ID, String serviceInterface) {
		Clause appClause = new Clause(EO.APP_FIELD_NAME, ClauseOp.eq, AD_App_ID);
		Clause interfaceClause = new Clause("serviceInterface", ClauseOp.eq, serviceInterface);
		return getFirst(MWebService.class, MWebServiceKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID,
				appClause, interfaceClause);
	}

	@Override
	public MWebService getWebService(UUID AD_App_ID, UUID AD_WebService_ID) {
		Clause appClause = new Clause(EO.APP_FIELD_NAME, ClauseOp.eq, AD_App_ID);
		Clause webServiceClause = new Clause("ad_WebService_ID", ClauseOp.eq, AD_WebService_ID);
		return getFirst(MWebService.class, MWebServiceKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID,
				appClause, webServiceClause);
	}

	@Override
	public List<MPopup> getPopups(UUID AD_App_ID) {
		Clause appClause = new Clause(EO.APP_FIELD_NAME, ClauseOp.eq, AD_App_ID);
		return getList(MPopup.class, MPopupKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID, appClause);
	}

	@Override
	public MPopup getPopup(UUID AD_App_ID, UUID AD_Popup_ID) {
		Clause appClause = new Clause(EO.APP_FIELD_NAME, ClauseOp.eq, AD_App_ID);
		Clause popupClause = new Clause("ad_Popup_ID", ClauseOp.eq, AD_Popup_ID);
		return getFirst(MPopup.class, MPopupKey.class, UUID.class, 
				EO.ROOT_ID_VALUE, EO.ROOT_ID_VALUE, AD_App_ID,
				appClause, popupClause);
	}
}
