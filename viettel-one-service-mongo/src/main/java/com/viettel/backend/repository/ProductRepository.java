package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.common.MProduct;
import com.viettel.backend.domain.common.MProductFile;

public interface ProductRepository extends GenericRepository<MProduct, UUID> {
	
	List<MProductFile> getFiles(UUID tenant_ID, UUID org_ID, UUID app_ID, UUID product_ID);
}
