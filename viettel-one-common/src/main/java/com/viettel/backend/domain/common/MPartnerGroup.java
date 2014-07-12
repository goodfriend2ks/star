package com.viettel.backend.domain.common;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.common.key.MPartnerGroupKey;

@Entity(name = MPartnerGroup.TABLE_NAME)
@Table(name = MPartnerGroup.TABLE_NAME)
@Description("With MPartnerGroup, AD_Org_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false)
@Caption("partnergroup")
public class MPartnerGroup extends BaseEO<MPartnerGroupKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5085654932674398717L;
	
	@Transient
	public static final String TABLE_NAME = "C_PartnerGroup";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MPartnerGroupKey key;
	
	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_NORMAL_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
    private String name;
	
	@Index
	@Enumerated
	@Column(name = "Type", nullable = false)
    private MPartnerType type;
	
	@Index
	@Column(name = MPartnerGroup.PARENT_COLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MPartnerGroup.class, keyClazz = MPartnerGroupKey.class, pkClazz = UUID.class, 
			idProperty = MPartnerGroupKey.KEY_NAME, captionProperty = "name", emptyValue = DEFAULT_PARENT_STRING_VALUE, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;

	public MPartnerGroup() {
		super();
	}

	public MPartnerGroupKey getKey() {
		return key;
	}

	public void setKey(MPartnerGroupKey key) {
		this.key = key;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MPartnerType getType() {
		return type;
	}

	public void setType(MPartnerType type) {
		this.type = type;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

	@Override
	@Transient
	public String getDisplay() {
		return this.name;
	}

	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}

	@Override
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MPartnerGroupKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	public void setID(UUID id) {
		if (key == null)
			key = new MPartnerGroupKey();
		
		key.setID(id);
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}
}
