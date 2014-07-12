package com.viettel.backend.repository;

import java.util.UUID;

import com.viettel.backend.domain.common.MPartner;
import com.viettel.backend.domain.common.key.MPartnerKey;

public interface PartnerRepository extends GenericRepository<MPartner, MPartnerKey, UUID> {

}
