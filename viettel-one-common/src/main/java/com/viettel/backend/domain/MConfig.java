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
import com.viettel.backend.domain.key.MConfigKey;

/**
 * @author khangpn
 */
@Entity(name = MConfig.TABLE_NAME)
@Table(name = MConfig.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "name")
//})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("config")
public class MConfig extends BaseEO<MConfigKey, UUID> {

    private static final long serialVersionUID = 238753371318264396L;
    
    @Transient
	public static final String TABLE_NAME = "AD_Config";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MConfigKey key;
	
	@Index
    @Column(name = "Name", length = 100, nullable = false)
    private String name;
    
    @Column(name = "Value", length = 200, nullable = false)
    private String value;
    
    @Column(name = "Description")
    private String description;
    
    public MConfig() {
		super();
	}

    public MConfigKey getKey() {
		return key;
	}

	public void setKey(MConfigKey key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MConfigKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MConfigKey();
		
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
