package com.viettel.backend.service;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MMailTemplate;
import com.viettel.backend.domain.key.MMailTemplateKey;

/**
 *
 * @author khangpn
 *
 */
public interface MailTemplateService extends GenericService<MMailTemplate, MMailTemplateKey, UUID> {

    public List<MMailTemplate> getMailTemplateName(String name);

    public MMailTemplate getMailTemplateByCode(String code);
}
