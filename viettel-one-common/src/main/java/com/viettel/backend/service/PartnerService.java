package com.viettel.backend.service;

import java.util.UUID;

import com.viettel.backend.domain.common.MPartner;
import com.viettel.backend.domain.common.key.MPartnerKey;

public interface PartnerService extends GenericService<MPartner, MPartnerKey, UUID> {
	
	public UUID save(MPartner entity, boolean isNew, boolean localTrx);
	
}
