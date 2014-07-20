package com.viettel.backend.repository.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.common.MProduct;
import com.viettel.backend.domain.common.MProductFile;
import com.viettel.backend.repository.ProductRepository;

@Repository
public class ProductRepositoryImpl 
	extends GenericRepositoryImpl<MProduct, UUID> 
	implements ProductRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1139407954114913739L;
	
	private static final Comparator<MProductFile> fileSeqNoComparator = new Comparator<MProductFile>() {
		@Override
		public int compare(MProductFile obj1, MProductFile obj2) {
			return (obj1.getSeqNo() == obj2.getSeqNo() ? 0 : (obj1.getSeqNo() < obj2.getSeqNo() ? -1 : 1));
		}
	};
	
	@Override
	public List<MProductFile> getFiles(UUID tenant_ID, UUID org_ID, UUID app_ID, UUID product_ID) {
		GenericQuery query = query(criteria("product_ID").is(product_ID));
		List<MProductFile> files = getList(MProductFile.class, UUID.class, 
				tenant_ID, org_ID, app_ID, query);
		if (files != null && !files.isEmpty()) {
			Collections.sort(files, fileSeqNoComparator);
		}
		
		return files;
	}
}
