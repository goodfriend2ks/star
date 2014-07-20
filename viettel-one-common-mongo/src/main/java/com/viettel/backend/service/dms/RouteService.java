package com.viettel.backend.service.dms;

import java.util.UUID;

import com.viettel.backend.domain.dms.MRoute;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.service.GenericService;

public interface RouteService extends GenericService<MRoute, UUID> {
	
	public MRouteHistory getOpenRouteHistory(MRoute route);
	
	public UUID saveRouteHistory(MRouteHistory history, boolean finished, boolean localTrx);
}
