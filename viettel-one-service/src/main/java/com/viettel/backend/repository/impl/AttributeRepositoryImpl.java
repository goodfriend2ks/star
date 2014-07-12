package com.viettel.backend.repository.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.common.MAttribute;
import com.viettel.backend.domain.common.key.MAttributeKey;
import com.viettel.backend.repository.AttributeRepository;

@Repository
public class AttributeRepositoryImpl 
	extends GenericRepositoryImpl<MAttribute, MAttributeKey, UUID> 
	implements AttributeRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8399319752788307111L;
}
