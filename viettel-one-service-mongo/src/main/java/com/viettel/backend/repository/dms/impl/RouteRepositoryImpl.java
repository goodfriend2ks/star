package com.viettel.backend.repository.dms.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.dms.MRoute;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.repository.dms.RouteRepository;
import com.viettel.backend.repository.impl.GenericRepositoryImpl;

@Repository
public class RouteRepositoryImpl 
	extends GenericRepositoryImpl<MRoute, UUID> 
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
		
		return save(MRouteHistory.class, UUID.class, history, localTrx);
	}

	@Override
	public MRouteHistory getOpenRouteHistory(MRoute route) {
		GenericQuery query = query(criteria("route_ID").is(route.getId()));
		List<MRouteHistory> histories = getList(MRouteHistory.class, UUID.class, 
				route.getTenant_ID(), route.getOrg_ID(), route.getApp_ID(), query);
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
