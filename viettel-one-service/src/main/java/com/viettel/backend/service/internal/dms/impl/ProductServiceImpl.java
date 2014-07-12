package com.viettel.backend.service.internal.dms.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.dms.MProduct;
import com.viettel.backend.domain.dms.MProductFile;
import com.viettel.backend.domain.dms.key.MProductKey;
import com.viettel.backend.repository.dms.ProductRepository;
import com.viettel.backend.service.dms.ProductService;
import com.viettel.backend.service.internal.impl.DaoBaseService;

@Service(value="productService")
public class ProductServiceImpl 
	extends DaoBaseService<MProduct, MProductKey, UUID> 
	implements ProductService {

	private ProductRepository productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepo) {
        super(productRepo);
        
        this.productRepo = productRepo;
    }

	@Override
	public List<MProductFile> getFiles(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, UUID M_Product_ID) {
		return productRepo.getFiles(AD_Client_ID, AD_Org_ID, AD_App_ID, M_Product_ID);
	}

	@Override
	public List<MProductFile> getFiles(MProduct product) {
		if (product == null)
			return null;
		
		return getFiles(product.getAd_Client_ID(), product.getAd_Org_ID(), product.getAd_App_ID(), product.getID());
	}
}
