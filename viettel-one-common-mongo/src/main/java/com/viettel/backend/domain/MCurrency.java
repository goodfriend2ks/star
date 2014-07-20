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
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;

@Entity(name = MCurrency.TABLE_NAME)
@Table(name = MCurrency.TABLE_NAME)
@Description("With Currency, AD_Client_ID, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootTenant = true, alwayRootOrg = true, alwayRootApp = true)
@Caption("currency")
public class MCurrency extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5012872974143436305L;

	@Transient
	public static final String TABLE_NAME = "C_Currency";
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
	@Column(name = "Sign", nullable = false, length = EO.CODE_SHORT_LENGTH)
	private String sign;
	
	@Column(name = "Precision", nullable = false)
	private int precision;
	
	public MCurrency() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
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
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}
}