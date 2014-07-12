package com.viettel.backend.repository.dms;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.dms.MProduct;
import com.viettel.backend.domain.dms.MProductFile;
import com.viettel.backend.domain.dms.key.MProductKey;
import com.viettel.backend.repository.GenericRepository;

public interface ProductRepository extends GenericRepository<MProduct, MProductKey, UUID> {
	
	List<MProductFile> getFiles(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, UUID M_Product_ID);
}
