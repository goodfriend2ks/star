package com.viettel.backend.domain.common;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.common.key.MManufacturerKey;

@Entity(name = MManufacturer.TABLE_NAME)
@Table(name = MManufacturer.TABLE_NAME)
@Description("With MManufacturer, AD_App_ID always is root")
@EntityType(alwayRootClient = true, withRootOrg = true, alwayRootApp = true)
@Caption("manufacturer")
public class MManufacturer extends BaseEO<MManufacturerKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6954662898035550047L;

	@Transient
	public static final String TABLE_NAME = "C_Manufacturer";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MManufacturerKey key;

	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_NORMAL_LENGTH)
	private String code;

	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Column(name = "Website", length = EO.URL_LENGTH)
	private String website;

	@Column(name = "Description")
	private String description;

	@Column(name = "Email", length = EO.URL_LENGTH)
	private String email;

	@Column(name = "Hotline", length = EO.PHONE_LENGTH)
	private String hotline;

	public MManufacturer() {
		super();
	}

	public MManufacturerKey getKey() {
		return key;
	}

	public void setKey(MManufacturerKey key) {
		this.key = key;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MManufacturerKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MManufacturerKey();

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
		return this.name;
	}

	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}
	
	@Override
	public boolean beforeSave(boolean isNew) {
		return true;
		// EmailValidator emailValidator = new EmailValidator();
		// boolean isValid=false;
		// isValid= emailValidator.validate(this.getWebsite());
		// return isValid;
	}
}
