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

@Entity(name = MProductCategory.TABLE_NAME)
@Table(name = MProductCategory.TABLE_NAME)
@Description("With MProductCategory, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("productcategory")
public class MProductCategory extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8954662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductCategory";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;

	@Index
	@EntityLinked(entityClazz = MProductCategory.class, pkClazz = UUID.class, 
			idProperty = MProductCategory.KEY_PROPERTY, captionProperty = MProductCategory.DISPLAY_PROPERTY, 
			emptyValue = DEFAULT_PARENT_STRING_VALUE,
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
	@Column(name = MProductCategory.PARENT_COLUMN_NAME, nullable = true)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;

	public MProductCategory() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
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
