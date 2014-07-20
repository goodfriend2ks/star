package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

@Entity(name = MCountry.TABLE_NAME)
@Table(name = MCountry.TABLE_NAME)
@Description("With Country, AD_Client_ID, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootTenant = true, alwayRootOrg = true, alwayRootApp = true)
@Caption("country")
public class MCountry extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 954662898035550047L;
	
	@Transient
	public static final String TABLE_NAME = "C_Country";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = "id";
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_SHORT_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String name;
	
	@Index
	@Column(name = "PostCode", nullable = false, length = EO.CODE_SHORT_LENGTH)
	private String postCode;
	
	@Column(name = "TimeZone", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String timeZone;
	
	@Column(name = "Capital", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String capital;
	
	@Column(name = "Longitude")
	private double longitude;
	
	@Column(name = "Latitude")
	private double latitude;
	
	@Index
	@Column(name = MCurrency.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MCurrency.class, pkClazz = UUID.class, 
			idProperty = MCurrency.KEY_PROPERTY, captionProperty = MCurrency.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID currency_ID;
	
	@Index
	@Column(name = MLanguage.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MLanguage.class, pkClazz = UUID.class, 
			idProperty = MLanguage.KEY_PROPERTY, captionProperty = MLanguage.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID language_ID;
	
	public MCountry() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID key) {
		this.id = key;
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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postcode) {
		this.postCode = postcode;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public UUID getCurrency_ID() {
		return currency_ID;
	}

	public void setCurrency_ID(UUID currency_ID) {
		this.currency_ID = currency_ID;
	}

	public UUID getLanguage_ID() {
		return language_ID;
	}

	public void setLanguage_ID(UUID language_ID) {
		this.language_ID = language_ID;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
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
