package com.viettel.backend.repository;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MMailTemplate;
import com.viettel.backend.domain.key.MMailTemplateKey;

public interface MailTemplateRepository extends GenericRepository<MMailTemplate, MMailTemplateKey, UUID> {
	
	public List<MMailTemplate> getMailTemplateByName(UUID AD_Client_ID, UUID AD_App_ID, String name);

    public MMailTemplate getMailTemplateByCode(UUID AD_Client_ID, UUID AD_App_ID, String code);
}
