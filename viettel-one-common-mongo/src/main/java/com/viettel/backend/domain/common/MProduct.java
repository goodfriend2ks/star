package com.viettel.backend.domain.common;

import java.util.Map;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
import com.viettel.backend.domain.MCountry;

@Entity(name = MProduct.TABLE_NAME)
@Table(name = MProduct.TABLE_NAME)
@Description("With MProduct, AD_App_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, alwayRootOrg = true)
@Caption("product")
public class MProduct extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_Product";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;

	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_NORMAL_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;

	@Column(name = "Description", nullable = true)
	private String description;

	@Index
	@Column(name = "BarCode", nullable = true, length = EO.BARCODE_LENGTH)
	private String barCode;

	@Column(name = "WarrantyDay", nullable = true)
	private int warrantyDay;

	@Index
	@EntityLinked(entityClazz = MProductGroup.class, pkClazz = UUID.class, 
			idProperty = MProductGroup.KEY_PROPERTY, captionProperty = MProductGroup.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProductGroup.KEYCOLUMN_NAME, nullable = false)
	private UUID productGroup_ID;

	@Index
	@EntityLinked(entityClazz = MProductCategory.class, pkClazz = UUID.class, 
			idProperty = MProductCategory.KEY_PROPERTY, captionProperty = MProductCategory.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProductCategory.KEYCOLUMN_NAME, nullable = false)
	private UUID productCategory_ID;
	
	@Index
	@EntityLinked(entityClazz = MProductType.class, pkClazz = UUID.class, 
			idProperty = MProductType.KEY_PROPERTY, captionProperty = MProductType.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProductType.KEYCOLUMN_NAME, nullable = false)
	private UUID productType_ID;

	@Index
	@EntityLinked(entityClazz = MUnit.class, pkClazz = UUID.class, 
			idProperty = MUnit.KEY_PROPERTY, captionProperty = MUnit.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = true)
	@Column(name = "BaseUnit_ID", nullable = false)
	private UUID baseUnit_ID;

	@Index
	@EntityLinked(entityClazz = MUnit.class, pkClazz = UUID.class, 
			idProperty = MUnit.KEY_PROPERTY, captionProperty = MUnit.DISPLAY_PROPERTY,
			type = LinkedType.DROPDOWN, canNew = true)
	@Column(name = "ExtendUnit_ID", nullable = true)
	private UUID extendUnit_ID;
	
	@Index
	@EntityLinked(entityClazz = MCountry.class, pkClazz = UUID.class, 
			idProperty = MCountry.KEY_PROPERTY, captionProperty = MCountry.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MCountry.KEYCOLUMN_NAME, nullable = true)
	private UUID country_ID;

	@Index
	@EntityLinked(entityClazz = MPartner.class, pkClazz = UUID.class, 
			idProperty = MPartner.KEY_PROPERTY, captionProperty = MPartner.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MPartner.KEYCOLUMN_NAME, nullable = true)
	private UUID manufacturer_ID;
	
	@ElementCollection
	@Column(name = "AttrValues", nullable = true)
	private Map<UUID, String> attrValues;
	
	public MProduct() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String value) {
		this.code = value;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String value) {
		this.barCode = value;
	}

	public int getWarrantyDay() {
		return warrantyDay;
	}

	public void setWarrantyDay(int value) {
		this.warrantyDay = value;
	}

	public UUID getProductGroup_ID() {
		return productGroup_ID;
	}

	public void setProductGroup_ID(UUID productGroup_ID) {
		this.productGroup_ID = productGroup_ID;
	}

	public UUID getProductCategory_ID() {
		return productCategory_ID;
	}

	public void setProductCategory_ID(UUID productCategory_ID) {
		this.productCategory_ID = productCategory_ID;
	}

	public UUID getProductType_ID() {
		return productType_ID;
	}

	public void setProductType_ID(UUID productType_ID) {
		this.productType_ID = productType_ID;
	}

	public UUID getBaseUnit_ID() {
		return baseUnit_ID;
	}

	public void setBaseUnit_ID(UUID baseUnit_ID) {
		this.baseUnit_ID = baseUnit_ID;
	}

	public UUID getExtendUnit_ID() {
		return extendUnit_ID;
	}

	public void setExtendUnit_ID(UUID extendUnit_ID) {
		this.extendUnit_ID = extendUnit_ID;
	}

	public UUID getCountry_ID() {
		return country_ID;
	}

	public void setCountry_ID(UUID country_ID) {
		this.country_ID = country_ID;
	}

	public UUID getManufacturer_ID() {
		return manufacturer_ID;
	}

	public void setManufacturer_ID(UUID manufacturer_ID) {
		this.manufacturer_ID = manufacturer_ID;
	}

	public Map<UUID, String> getAttrValues() {
		return attrValues;
	}

	public void setAttrValues(Map<UUID, String> attrValues) {
		this.attrValues = attrValues;
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
