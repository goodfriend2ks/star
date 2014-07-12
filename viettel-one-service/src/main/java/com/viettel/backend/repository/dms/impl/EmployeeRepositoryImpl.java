package com.viettel.backend.repository.dms.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.dms.MEmployee;
import com.viettel.backend.domain.dms.key.MEmployeeKey;
import com.viettel.backend.repository.dms.EmployeeRepository;
import com.viettel.backend.repository.impl.GenericRepositoryImpl;

@Repository
public class EmployeeRepositoryImpl 
	extends GenericRepositoryImpl<MEmployee, MEmployeeKey, UUID> 
	implements EmployeeRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5649213461452866310L;

}
