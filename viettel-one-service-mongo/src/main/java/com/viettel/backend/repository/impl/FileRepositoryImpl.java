package com.viettel.backend.repository.impl;

import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MFile;
import com.viettel.backend.repository.FileRepository;

@Repository
public class FileRepositoryImpl 
	extends GenericRepositoryImpl<MFile, UUID> 
	implements FileRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2028349374524945651L;

	@Override
	public MFile getByName(UUID tenant_ID, UUID app_ID, String name) {
		GenericQuery query = query(criteria("name").is(name));
		return getFirst(tenant_ID, EO.ROOT_ID_VALUE, app_ID, query);
	}

	@Override
	public MFile getByUrl(UUID tenant_ID, UUID app_ID, String url) {
		GenericQuery query = query(criteria("url").is(url));
		return getFirst(tenant_ID, EO.ROOT_ID_VALUE, app_ID, query);
	}
}
