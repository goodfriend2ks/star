package com.viettel.backend.service;

import java.util.UUID;

import com.viettel.backend.domain.common.MPartner;

public interface PartnerService extends GenericService<MPartner, UUID> {
	
	public UUID save(MPartner entity, boolean isNew, boolean localTrx);
	
}
