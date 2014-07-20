package com.viettel.backend.repository.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.common.MPartner;
import com.viettel.backend.repository.PartnerRepository;

@Repository
public class PartnerRepositoryImpl 
	extends GenericRepositoryImpl<MPartner, UUID> 
	implements PartnerRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4498128006800220166L;

}
