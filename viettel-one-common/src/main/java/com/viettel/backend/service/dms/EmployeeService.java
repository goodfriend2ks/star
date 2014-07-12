package com.viettel.backend.service.dms;

import java.util.UUID;

import com.viettel.backend.domain.dms.MEmployee;
import com.viettel.backend.domain.dms.key.MEmployeeKey;
import com.viettel.backend.service.GenericService;

public interface EmployeeService extends GenericService<MEmployee, MEmployeeKey, UUID> {

}
