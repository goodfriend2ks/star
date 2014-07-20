package com.viettel.backend.domain.common;

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

@Entity(name = MArea.TABLE_NAME)
@Table(name = MArea.TABLE_NAME)
@Description("With MArea, AD_Org_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("area")
public class MArea extends BaseEO<UUID>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8787270723992184385L;
	
	@Transient
	public static final String TABLE_NAME = "M_Area";
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
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Column(name = "Longitude")
	private double longitude;
	
	@Column(name = "Latitude")
	private double latitude;
	
	@Index
	@Column(name = MArea.PARENT_COLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MArea.class, pkClazz = UUID.class, 
			idProperty = MArea.KEY_PROPERTY, captionProperty = MArea.DISPLAY_PROPERTY, 
			emptyValue = DEFAULT_PARENT_STRING_VALUE, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;
	
	public MArea() {
        super();
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
	
	@Override
	@Transient
	public boolean hasParent() {
		return !EO.isRootID(parent_ID, true);
	}
}
