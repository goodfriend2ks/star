package com.viettel.backend.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.backend.domain.common.MProduct;
import com.viettel.backend.domain.common.MProductFile;
import com.viettel.backend.repository.ProductRepository;
import com.viettel.backend.service.ProductService;

@Service(value="productService")
public class ProductServiceImpl 
	extends DaoBaseService<MProduct, UUID> 
	implements ProductService {

	private ProductRepository productRepo;
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepo) {
        super(productRepo);
        
        this.productRepo = productRepo;
    }

	@Override
	public List<MProductFile> getFiles(UUID tenant_ID, UUID org_ID, UUID app_ID, UUID product_ID) {
		return productRepo.getFiles(tenant_ID, org_ID, app_ID, product_ID);
	}

	@Override
	public List<MProductFile> getFiles(MProduct product) {
		if (product == null)
			return null;
		
		return getFiles(product.getTenant_ID(), product.getOrg_ID(), product.getApp_ID(), product.getId());
	}
}
