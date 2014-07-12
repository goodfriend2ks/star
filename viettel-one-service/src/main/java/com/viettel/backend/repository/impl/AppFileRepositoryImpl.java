package com.viettel.backend.repository.impl;

import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MAppFile;
import com.viettel.backend.domain.key.MAppFileKey;
import com.viettel.backend.repository.AppFileRepository;

@Repository
public class AppFileRepositoryImpl 
	extends GenericRepositoryImpl<MAppFile, MAppFileKey, UUID> 
	implements AppFileRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2028349374524945651L;
	
	@Override
	public MAppFile getByClientName(UUID AD_Client_ID, UUID AD_App_ID, String path) {
		Clause clause = new Clause("clientFileName", ClauseOp.eq, path);
		return getFirst(AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, clause);
	}

	@Override
	public MAppFile getByFtpName(UUID AD_Client_ID, UUID AD_App_ID, String name) {
		Clause clause = new Clause("ftpFileName", ClauseOp.eq, name);
		return getFirst(AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, clause);
	}

}
