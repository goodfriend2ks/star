package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.common.MAttribute;
import com.viettel.backend.domain.common.key.MAttributeKey;
import com.viettel.backend.repository.AttributeRepository;
import com.viettel.backend.service.AttributeService;

@Service(value="attributeService")
public class AttributeServiceImpl 
	extends DaoBaseService<MAttribute, MAttributeKey, UUID> 
	implements AttributeService {

	@Autowired
	public AttributeServiceImpl(AttributeRepository attributeRepo) {
        super(attributeRepo);
    }
}
