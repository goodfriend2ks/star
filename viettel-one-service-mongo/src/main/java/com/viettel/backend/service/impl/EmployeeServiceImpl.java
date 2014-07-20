package com.viettel.backend.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.common.MEmployee;
import com.viettel.backend.repository.EmployeeRepository;
import com.viettel.backend.service.EmployeeService;

@Service(value = "employeeService")
public class EmployeeServiceImpl 
	extends DaoBaseService<MEmployee, UUID> 
	implements EmployeeService {

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        super(employeeRepo);
    }
}
