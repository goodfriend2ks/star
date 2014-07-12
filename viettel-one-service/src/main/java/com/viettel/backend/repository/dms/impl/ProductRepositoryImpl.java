package com.viettel.backend.repository.dms.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.domain.dms.MProduct;
import com.viettel.backend.domain.dms.MProductFile;
import com.viettel.backend.domain.dms.key.MProductFileKey;
import com.viettel.backend.domain.dms.key.MProductKey;
import com.viettel.backend.repository.dms.ProductRepository;
import com.viettel.backend.repository.impl.GenericRepositoryImpl;

@Repository
public class ProductRepositoryImpl 
	extends GenericRepositoryImpl<MProduct, MProductKey, UUID> 
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
	public List<MProductFile> getFiles(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, UUID M_Product_ID) {
		Clause fileClause = new Clause(MProductKey.KEY_NAME, ClauseOp.eq, M_Product_ID);
		List<MProductFile> files = getList(MProductFile.class, MProductFileKey.class, UUID.class, 
				AD_Client_ID, AD_Org_ID, AD_App_ID, fileClause);
		if (files != null && !files.isEmpty()) {
			Collections.sort(files, fileSeqNoComparator);
		}
		
		return files;
	}
}
