package com.viettel.backend.repository.dms;

import java.util.UUID;

import com.viettel.backend.domain.dms.MRoute;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.domain.dms.key.MRouteKey;
import com.viettel.backend.repository.GenericRepository;

public interface RouteRepository extends GenericRepository<MRoute, MRouteKey, UUID> {
	
	public MRouteHistory getOpenRouteHistory(MRoute route);
	
	public UUID saveRouteHistory(MRouteHistory history, boolean finished, boolean localTrx);
}
