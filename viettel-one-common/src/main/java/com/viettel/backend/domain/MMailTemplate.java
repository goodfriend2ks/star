package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.domain.key.MMailTemplateKey;

/**
 *
 * @author khangpn
 */
@Entity(name = MMailTemplate.TABLE_NAME)
@Table(name = MMailTemplate.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "code"), 
//		@Index(name = "name")
//})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("mailtemplate")
public class MMailTemplate extends BaseEO<MMailTemplateKey, UUID> {

    private static final long serialVersionUID = -5950787026422751290L;
    
    @Transient
	public static final String TABLE_NAME = "AD_MailTemplate";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@Transient
    public static final String FIELD_NAME = "name";
	@Transient
    public static final String FIELD_CODE = "code";
        
	@EmbeddedId
	private MMailTemplateKey key;
	
	@Index
    @Column(name = "Name", length = 100)
    private String name;
    
	@Index
    @Column(name = "Code", length = 50, nullable = false)
    private String code;
    
    @Column(name = "Description", length = Integer.MAX_VALUE)
    private String description;
    
    @Column(name = "Subject")
    private String subject;
    
    @Column(name = "Content", length = Integer.MAX_VALUE, nullable = false)
    private String content;

    public MMailTemplate() {
		super();
	}

	public MMailTemplateKey getKey() {
		return key;
	}

	public void setKey(MMailTemplateKey key) {
		this.key = key;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MMailTemplateKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_MailTemplate_ID;
//	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MMailTemplateKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}
	
	@Override
	@Transient
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	@Transient
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}
	
	@Override
	@Transient
	public String getDisplay() {
		return name;
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}
}
