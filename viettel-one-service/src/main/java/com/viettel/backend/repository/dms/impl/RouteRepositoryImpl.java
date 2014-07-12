package com.viettel.backend.repository.dms.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.dms.MRoute;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.domain.dms.key.MRouteHistoryKey;
import com.viettel.backend.domain.dms.key.MRouteKey;
import com.viettel.backend.repository.dms.RouteRepository;
import com.viettel.backend.repository.impl.GenericRepositoryImpl;

@Repository
public class RouteRepositoryImpl 
	extends GenericRepositoryImpl<MRoute, MRouteKey, UUID> 
	implements RouteRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -821849901421586627L;

	@Override
	public UUID saveRouteHistory(MRouteHistory history, boolean finished, boolean localTrx) {
		if (finished && EO.isEmptyDate(history.getFinishedDate())) {
			history.setFinishedDate(new Date());
		}
		
		return save(MRouteHistory.class, MRouteHistoryKey.class, UUID.class, history, localTrx);
	}

	@Override
	public MRouteHistory getOpenRouteHistory(MRoute route) {
		Clause clause = new Clause("m_Route_ID", ClauseOp.eq, route.getID());
		List<MRouteHistory> histories = getList(MRouteHistory.class, MRouteHistoryKey.class, UUID.class, 
				route.getAd_Client_ID(), route.getAd_Org_ID(), route.getAd_App_ID(), clause);
		if (histories == null || histories.isEmpty())
			return null;
		
		for (MRouteHistory history : histories) {
			if (EO.isEmptyDate(history.getFinishedDate())) {
				return history;
			}
		}
		
		return null;
	}

}
