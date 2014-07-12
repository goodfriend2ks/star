package com.viettel.backend.repository.impl;

import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.springframework.stereotype.Repository;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MMailTemplate;
import com.viettel.backend.domain.key.MMailTemplateKey;
import com.viettel.backend.repository.MailTemplateRepository;

@Repository
public class MailTemplateRepositoryImpl 
	extends GenericRepositoryImpl<MMailTemplate, MMailTemplateKey, UUID> 
	implements MailTemplateRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = -208920384380883434L;

	@Override
	public List<MMailTemplate> getMailTemplateByName(UUID AD_Client_ID, UUID AD_App_ID, String name) {
		Clause clause = new Clause("name", ClauseOp.eq, name);
		return getList(AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, clause);
	}

	@Override
	public MMailTemplate getMailTemplateByCode(UUID AD_Client_ID, UUID AD_App_ID, String code) {
		Clause clause = new Clause("code", ClauseOp.eq, code);
		return getFirst(AD_Client_ID, EO.ROOT_ID_VALUE, AD_App_ID, clause);
	}
}
