package com.viettel.backend.service.dms.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.dms.MRoute;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.repository.dms.RouteRepository;
import com.viettel.backend.service.dms.RouteService;
import com.viettel.backend.service.impl.DaoBaseService;

@Service(value="routeService")
public class RouteServiceImpl 
	extends DaoBaseService<MRoute, UUID> 
	implements RouteService {

	private RouteRepository routeRepo;
	
	@Autowired
	public RouteServiceImpl(RouteRepository routeRepo) {
        super(routeRepo);
        
        this.routeRepo = routeRepo;
    }

	@Override
	public MRouteHistory getOpenRouteHistory(MRoute route) {
		return routeRepo.getOpenRouteHistory(route);
	}

	@Override
	public UUID saveRouteHistory(MRouteHistory history, boolean finished, boolean localTrx) {
		return routeRepo.saveRouteHistory(history, finished, localTrx);
	}
	
}
