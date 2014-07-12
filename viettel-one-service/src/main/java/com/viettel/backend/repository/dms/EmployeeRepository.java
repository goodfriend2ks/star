package com.viettel.backend.repository.dms;

import java.util.UUID;

import com.viettel.backend.domain.dms.MEmployee;
import com.viettel.backend.domain.dms.key.MEmployeeKey;
import com.viettel.backend.repository.GenericRepository;

public interface EmployeeRepository extends GenericRepository<MEmployee, MEmployeeKey, UUID> {

}
