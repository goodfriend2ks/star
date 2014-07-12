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
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.common.key.MCountryKey;
import com.viettel.backend.domain.common.key.MCurrencyKey;
import com.viettel.backend.domain.common.key.MLanguageKey;

@Entity(name = MCountry.TABLE_NAME)
@Table(name = MCountry.TABLE_NAME)
@Description("With Country, AD_Client_ID, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootClient = true, alwayRootOrg = true, alwayRootApp = true)
@Caption("country")
public class MCountry extends BaseEO<MCountryKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 954662898035550047L;
	
	@Transient
	public static final String TABLE_NAME = "C_Country";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MCountryKey key;
	
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
	@EntityLinked(entityClazz = MCurrency.class, keyClazz = MCurrencyKey.class, pkClazz = UUID.class, 
			idProperty = MCurrencyKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID c_Currency_ID;
	
	@Index
	@Column(name = MLanguage.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MLanguage.class, keyClazz = MLanguageKey.class, pkClazz = UUID.class, 
			idProperty = MLanguageKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID c_Language_ID;
	
	public MCountry() {
		super();
	}

	public MCountryKey getKey() {
		return key;
	}

	public void setKey(MCountryKey key) {
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

	public UUID getC_Currency_ID() {
		return c_Currency_ID;
	}

	public void setC_Currency_ID(UUID c_Currency_ID) {
		this.c_Currency_ID = c_Currency_ID;
	}

	public UUID getC_Language_ID() {
		return c_Language_ID;
	}

	public void setC_Language_ID(UUID c_Language_ID) {
		this.c_Language_ID = c_Language_ID;
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
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MCountryKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MCountryKey();
		
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
