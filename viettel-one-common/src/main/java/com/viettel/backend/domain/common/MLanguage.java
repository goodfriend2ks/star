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
import com.viettel.backend.domain.common.key.MLanguageKey;

@Entity(name = MLanguage.TABLE_NAME)
@Table(name = MLanguage.TABLE_NAME)
@Description("With Language, AD_Client_ID, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootClient = true, alwayRootOrg = true, alwayRootApp = true)
@Caption("language")
public class MLanguage extends BaseEO<MLanguageKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 954662898035550047L;
	
	@Transient
	public static final String TABLE_NAME = "C_Language";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MLanguageKey key;
	
	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_SHORT_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String name;

	@Column(name = "DatePattern", nullable = false, length = EO.TEXT_SHORT_LENGTH)
	private String datePattern;
	
	@Column(name = "DateTimePattern", nullable = false, length = EO.TEXT_SHORT_LENGTH)
	private String dateTimePattern;
	
	@Column(name = "TimePattern", nullable = false, length = EO.TEXT_SHORT_LENGTH)
	private String timePattern;
	
	@Column(name = "DecimalPoint", nullable = false)
	private boolean decimalPoint;

	public MLanguageKey getKey() {
		return key;
	}

	public void setKey(MLanguageKey key) {
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

	public String getDatePattern() {
		return datePattern;
	}

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

	public String getDateTimePattern() {
		return dateTimePattern;
	}

	public void setDateTimePattern(String dateTimePattern) {
		this.dateTimePattern = dateTimePattern;
	}

	public String getTimePattern() {
		return timePattern;
	}

	public void setTimePattern(String timePattern) {
		this.timePattern = timePattern;
	}

	public boolean isDecimalPoint() {
		return decimalPoint;
	}

	public void setDecimalPoint(boolean decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	@Override
	public String getDisplay() {
		return name;
	}

	@Override
	public void setDisplay(String display) {
		this.name = display;
	}

	@Override
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MLanguageKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	public void setID(UUID id) {
		if (key == null)
			key = new MLanguageKey();
		
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
