package com.viettel.backend.repository;

import java.util.UUID;

import com.viettel.backend.domain.common.MAttribute;
import com.viettel.backend.domain.common.key.MAttributeKey;

public interface AttributeRepository extends GenericRepository<MAttribute, MAttributeKey, UUID> {

}
