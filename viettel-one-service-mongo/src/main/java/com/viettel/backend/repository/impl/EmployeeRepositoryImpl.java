package com.viettel.backend.repository.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.common.MEmployee;
import com.viettel.backend.repository.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl 
	extends GenericRepositoryImpl<MEmployee, UUID> 
	implements EmployeeRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5649213461452866310L;

}
