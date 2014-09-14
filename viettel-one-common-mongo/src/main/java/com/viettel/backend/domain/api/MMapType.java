package com.viettel.backend.domain.api;

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

@Entity(name = MMapType.TABLE_NAME)
@Table(name = MMapType.TABLE_NAME)
@Description("With MapType, AD_Client_ID, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootTenant = true, alwayRootOrg = true, alwayRootApp = true)
@Caption("maptype")
public class MMapType extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8591847399932672527L;
	
	@Transient
	public static final String TABLE_NAME = "API_Map_Type";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
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
