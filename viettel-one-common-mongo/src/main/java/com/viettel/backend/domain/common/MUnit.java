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
import com.viettel.util.DataTypeUtil;

@Entity(name = MUnit.TABLE_NAME)
@Table(name = MUnit.TABLE_NAME)
@Description("With Unit, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootOrg = true)
@Caption("unit")
public class MUnit extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6954662898035550047L;
	
	@Transient
	public static final String TABLE_NAME = "C_Unit";
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
	
	@Index
	@Column(name = "Symbol", nullable = false, length = EO.CODE_SHORT_LENGTH)
	private String symbol;
	
	@Column(name = "Scale", nullable = false)
	private int scale = 0;
	
	@Index
	@Column(name = MUnit.PARENT_COLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MUnit.class, pkClazz = UUID.class, 
			idProperty = MUnit.KEY_PROPERTY, captionProperty = MUnit.DISPLAY_PROPERTY, 
			emptyValue = DEFAULT_PARENT_STRING_VALUE, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;
	
	@Column(name = "Ratio", nullable = false)
	private double ratio = 1d;
	
	public MUnit() {
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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}

	@Override
	public String getDisplay() {
		return name;
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}
	
	@Transient
	public boolean hasParent()
	{
		boolean isEmpty = DataTypeUtil.isEmpty(UUID.class, parent_ID);
		if (isEmpty)
			return false;
		
		return DataTypeUtil.compare(UUID.class, parent_ID, DEFAULT_PARENT_VALUE) != 0;
	}
}
