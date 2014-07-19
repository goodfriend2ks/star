package com.viettel.backend.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.common.MPartner;
import com.viettel.backend.domain.common.key.MPartnerKey;
import com.viettel.backend.domain.dms.MRouteHistory;
import com.viettel.backend.domain.dms.key.MRouteHistoryKey;
import com.viettel.backend.repository.PartnerRepository;
import com.viettel.backend.service.PartnerService;

@Service(value="partnerService")
public class PartnerServiceImpl extends DaoBaseService<MPartner, MPartnerKey, UUID> implements PartnerService {
	
	private PartnerRepository partnerRepo;
	
	@Autowired
	public PartnerServiceImpl(PartnerRepository partnerRepo) {
        super(partnerRepo);
        
        this.partnerRepo = partnerRepo;
    }

	@Override
	public UUID save(MPartner entity, boolean isNew, boolean localTrx) {
		UUID saveId = super.save(entity, localTrx);
		
		if (isNew && saveId != null && !EO.isRootID(entity.getM_CurrentRoute_ID(), true)) {
			MRouteHistory history = new MRouteHistory();
			EO.initBaseEO(entity, history, UUID.class, true);
			
			history.setC_Partner_ID(entity.getID());
			history.setM_Route_ID(entity.getM_CurrentRoute_ID());
			history.setStartedDate(new Date());
			history.setFinishedDate(null);
			
			partnerRepo.save(MRouteHistory.class, MRouteHistoryKey.class, UUID.class, history, localTrx);
		}
			
		return saveId;
	}
}
