package com.viettel.backend.repository.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.EmptyEO;
import com.viettel.backend.repository.CommonRepository;

@Repository
public class CommonRepositoryImpl 
	extends BasicRepositoryImpl<EmptyEO, UUID> 
	implements CommonRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7656679614421880207L;
	
}
