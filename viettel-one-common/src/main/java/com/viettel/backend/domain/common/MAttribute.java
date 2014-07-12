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
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.common.key.MAttributeKey;

@Entity(name = MAttribute.TABLE_NAME)
@Table(name = MAttribute.TABLE_NAME)
@Description("With MAttribute, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootOrg = true)
@Caption("attribute")
public class MAttribute extends BaseEO<MAttributeKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 954662898035550047L;

	@Transient
	public static final String TABLE_NAME = "C_Attribute";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MAttributeKey key;

	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Index
	@Enumerated
	@Column(name = "DataType", nullable = false, length = EO.TEXT_SHORT_LENGTH)
	private MAttributeType dataType;
	
	@Column(name = "Values", nullable = true)
	private String values;
	
	@Column(name = "MaxLength", nullable = true)
	private int maxLength;
	
	public MAttribute() {
		super();
	}

	public MAttributeKey getKey() {
		return key;
	}

	public void setKey(MAttributeKey key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String value) {
		this.values = value;
	}

	public MAttributeType getDataType() {
		return dataType;
	}

	public void setDataType(MAttributeType datatype) {
		this.dataType = datatype;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MAttributeKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MAttributeKey();

		key.setID(id);
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
