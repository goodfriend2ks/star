package com.viettel.backend.repository.dms;

import java.util.UUID;

import com.viettel.backend.domain.dms.MRoute;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.repository.GenericRepository;

public interface RouteRepository extends GenericRepository<MRoute, UUID> {
	
	public MRouteHistory getOpenRouteHistory(MRoute route);
	
	public UUID saveRouteHistory(MRouteHistory history, boolean finished, boolean localTrx);
}
