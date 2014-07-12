package com.viettel.backend.domain.dms;

import java.util.Map;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
import com.viettel.backend.domain.common.MCountry;
import com.viettel.backend.domain.common.MManufacturer;
import com.viettel.backend.domain.common.MUnit;
import com.viettel.backend.domain.common.key.MCountryKey;
import com.viettel.backend.domain.common.key.MManufacturerKey;
import com.viettel.backend.domain.common.key.MUnitKey;
import com.viettel.backend.domain.dms.key.MProductCategoryKey;
import com.viettel.backend.domain.dms.key.MProductGroupKey;
import com.viettel.backend.domain.dms.key.MProductKey;
import com.viettel.backend.domain.dms.key.MProductTypeKey;

@Entity(name = MProduct.TABLE_NAME)
@Table(name = MProduct.TABLE_NAME)
//@IndexCollection(columns = { @Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"), @Index(name = "isActive"),
//		@Index(name = "created"), @Index(name = "createdBy"),
//		@Index(name = "updated"), @Index(name = "updatedBy"),
//		@Index(name = "version"), @Index(name = "name") })
@Description("With MProductType, AD_App_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("product")
public class MProduct extends BaseEO<MProductKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_Product";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MProductKey key;

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
	@EntityLinked(entityClazz = MProductGroup.class, keyClazz = MProductGroupKey.class, pkClazz = UUID.class, 
			idProperty = MProductGroupKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProductGroup.KEYCOLUMN_NAME, nullable = false)
	private UUID m_ProductGroup_ID;

	@Index
	@EntityLinked(entityClazz = MProductCategory.class, keyClazz = MProductCategoryKey.class, pkClazz = UUID.class, 
			idProperty = MProductCategoryKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProductCategory.KEYCOLUMN_NAME, nullable = false)
	private UUID m_ProductCategory_ID;
	
	@Index
	@EntityLinked(entityClazz = MProductType.class, keyClazz = MProductTypeKey.class, pkClazz = UUID.class, 
			idProperty = MProductTypeKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProductType.KEYCOLUMN_NAME, nullable = false)
	private UUID m_ProductType_ID;

	@Index
	@EntityLinked(entityClazz = MUnit.class, keyClazz = MUnitKey.class, pkClazz = UUID.class, 
			idProperty = MUnitKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = true)
	@Column(name = "BaseUnit_ID", nullable = false)
	private UUID c_BaseUnit_ID;

	@Index
	@EntityLinked(entityClazz = MUnit.class, keyClazz = MUnitKey.class, pkClazz = UUID.class, 
			idProperty = MUnitKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = true)
	@Column(name = "ExtendUnit_ID", nullable = true)
	private UUID c_ExtendUnit_ID;
	
	@Index
	@EntityLinked(entityClazz = MCountry.class, keyClazz = MCountryKey.class, pkClazz = UUID.class, 
			idProperty = MCountryKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MCountry.KEYCOLUMN_NAME, nullable = true)
	private UUID c_Country_ID;

	@Index
	@EntityLinked(entityClazz = MManufacturer.class, keyClazz = MManufacturerKey.class, pkClazz = UUID.class, 
			idProperty = MManufacturerKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MManufacturer.KEYCOLUMN_NAME, nullable = true)
	private UUID c_Manufacturer_ID;
	
	@ElementCollection
	@Column(name = "AttrValues", nullable = true)
	private Map<UUID, String> attrValues;
	
	public MProduct() {
		super();
	}

	public MProductKey getKey() {
		return key;
	}

	public void setKey(MProductKey key) {
		this.key = key;
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

	public UUID getM_ProductGroup_ID() {
		return m_ProductGroup_ID;
	}

	public void setM_ProductGroup_ID(UUID ad_App_ID) {
		this.m_ProductGroup_ID = ad_App_ID;
	}

	public UUID getM_ProductCategory_ID() {
		return m_ProductCategory_ID;
	}

	public void setM_ProductCategory_ID(UUID ad_App_ID) {
		this.m_ProductCategory_ID = ad_App_ID;
	}

	public UUID getM_ProductType_ID() {
		return m_ProductType_ID;
	}

	public void setM_ProductType_ID(UUID ad_App_ID) {
		this.m_ProductType_ID = ad_App_ID;
	}

	public UUID getC_BaseUnit_ID() {
		return c_BaseUnit_ID;
	}

	public void setC_BaseUnit_ID(UUID ad_App_ID) {
		this.c_BaseUnit_ID = ad_App_ID;
	}

	public UUID getC_ExtendUnit_ID() {
		return c_ExtendUnit_ID;
	}

	public void setC_ExtendUnit_ID(UUID ad_App_ID) {
		this.c_ExtendUnit_ID = ad_App_ID;
	}

	public UUID getC_Country_ID() {
		return c_Country_ID;
	}

	public void setC_Country_ID(UUID ad_App_ID) {
		this.c_Country_ID = ad_App_ID;
	}

	public UUID getC_Manufacturer_ID() {
		return c_Manufacturer_ID;
	}

	public void setC_Manufacturer_ID(UUID c_Manufacturer_ID) {
		this.c_Manufacturer_ID = c_Manufacturer_ID;
	}

	public Map<UUID, String> getAttrValues() {
		return attrValues;
	}

	public void setAttrValues(Map<UUID, String> attrValues) {
		this.attrValues = attrValues;
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MProductKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MProductKey();

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
