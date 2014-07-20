package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.common.MProduct;
import com.viettel.backend.domain.common.MProductFile;

public interface ProductService extends GenericService<MProduct, UUID> {
	
	List<MProductFile> getFiles(UUID tenant_ID, UUID org_ID, UUID app_ID, UUID product_ID);
	
	List<MProductFile> getFiles(MProduct product);
}
