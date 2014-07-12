package com.viettel.backend.service.internal.dms.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.dms.MEmployee;
import com.viettel.backend.domain.dms.key.MEmployeeKey;
import com.viettel.backend.repository.dms.EmployeeRepository;
import com.viettel.backend.service.dms.EmployeeService;
import com.viettel.backend.service.internal.impl.DaoBaseService;

@Service(value="employeeService")
public class EmployeeServiceImpl 
	extends DaoBaseService<MEmployee, MEmployeeKey, UUID> 
	implements EmployeeService {

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        super(employeeRepo);
    }
}
