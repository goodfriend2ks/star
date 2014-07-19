package com.viettel.backend.repository.impl;

import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.easycassandra.persistence.cassandra.spring.CassandraTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.key.MClientKey;
import com.viettel.backend.domain.key.MOrgKey;
import com.viettel.backend.repository.ClientRepository;

@Repository
public class TenantRepositoryImpl 
	extends GenericRepositoryImpl<MClient, MClientKey, UUID> 
	implements ClientRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4467839748910905940L;

	@Autowired
	private CassandraTemplate cassandraTemplate;
	
	@Override
	public CassandraTemplate getCassandraTemplate() {
		return cassandraTemplate;
	}
	
	@Override
	public List<MOrg> getOrgs(UUID ad_Client_ID) {
		Clause clause = new Clause(EO.CLIENT_FIELD_NAME, ClauseOp.eq, ad_Client_ID);
		return getList(MOrg.class, MOrgKey.class, UUID.class,
				ad_Client_ID, null, EO.ROOT_ID_VALUE, clause);
	}

	@Override
	public long getOrgCount(UUID ad_Client_ID) {
		Clause clause = new Clause(EO.CLIENT_FIELD_NAME, ClauseOp.eq, ad_Client_ID);
		return getCount(MOrg.class, MOrgKey.class, UUID.class,
				ad_Client_ID, null, EO.ROOT_ID_VALUE, clause);
	}

	@Override
	public MOrg getOrg(UUID ad_Client_ID, UUID ad_Org_ID) {
		Clause clientClause = new Clause(EO.CLIENT_FIELD_NAME, ClauseOp.eq, ad_Client_ID);
		Clause orgClause = new Clause(EO.ORG_FIELD_NAME, ClauseOp.eq, ad_Org_ID);
		return getFirst(MOrg.class, MOrgKey.class, UUID.class,
				ad_Client_ID, null, EO.ROOT_ID_VALUE, clientClause, orgClause);
	}
}