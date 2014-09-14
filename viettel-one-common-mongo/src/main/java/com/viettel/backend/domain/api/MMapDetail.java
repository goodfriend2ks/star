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
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;

@Entity(name = MMapDetail.TABLE_NAME)
@Table(name = MMapDetail.TABLE_NAME)
@Description("With MapDetail, AD_Client_ID, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootTenant = true, alwayRootOrg = true, alwayRootApp = true)
@Caption("mapdetail")
public class MMapDetail extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3982485387049898320L;
	
	@Transient
	public static final String TABLE_NAME = "API_Map_Detail";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "propertyName";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = MMapType.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MMapType.class, pkClazz = UUID.class, 
			idProperty = MMapType.KEY_PROPERTY, captionProperty = MMapType.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = true)
    private UUID mapType_ID;
	
	/*@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String name;*/
	
	@Index
	@Column(name = "PropertyName", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String propertyName;
	
	@Column(name = "PropertyType", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String propertyType;
	
	@Column(name = "InputName", nullable = false, length = EO.NAME_SHORT_LENGTH)
	private String inputPropertyName;
	
	@Column(name = "InputType", nullable = true, length = EO.NAME_SHORT_LENGTH)
	private String inputPropertyType;
	
	@Column(name = "JavaCode", nullable = true)
	private String javaCode;
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public UUID getMapType_ID() {
		return mapType_ID;
	}

	public void setMapType_ID(UUID mapType_ID) {
		this.mapType_ID = mapType_ID;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/
	
	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getInputPropertyName() {
		return inputPropertyName;
	}

	public void setInputPropertyName(String inputPropertyName) {
		this.inputPropertyName = inputPropertyName;
	}

	public String getInputPropertyType() {
		return inputPropertyType;
	}

	public void setInputPropertyType(String inputPropertyType) {
		this.inputPropertyType = inputPropertyType;
	}

	public String getJavaCode() {
		return javaCode;
	}

	public void setJavaCode(String javaCode) {
		this.javaCode = javaCode;
	}

	@Override
	public String getDisplay() {
		return propertyName;
	}

	@Override
	public void setDisplay(String display) {
		this.propertyName = display;
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
