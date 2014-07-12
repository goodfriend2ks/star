package com.viettel.backend.domain.dms;

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
import com.viettel.backend.domain.dms.key.MProductCategoryKey;
import com.viettel.backend.domain.dms.key.MProductGroupKey;

@Entity(name = MProductCategory.TABLE_NAME)
@Table(name = MProductCategory.TABLE_NAME)
//@IndexCollection(columns = { @Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"), @Index(name = "isActive"),
//		@Index(name = "created"), @Index(name = "createdBy"),
//		@Index(name = "updated"), @Index(name = "updatedBy"),
//		@Index(name = "version"), @Index(name = "name") })
@Description("With MProductCategory, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("productcategory")
public class MProductCategory extends BaseEO<MProductCategoryKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8954662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductCategory";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MProductCategoryKey key;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;

	@Index
	@EntityLinked(entityClazz = MProductCategory.class, keyClazz = MProductGroupKey.class, pkClazz = UUID.class, 
			idProperty = MProductGroupKey.KEY_NAME, captionProperty = "name", emptyValue = DEFAULT_PARENT_STRING_VALUE,
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
	@Column(name = MProductCategory.PARENT_COLUMN_NAME, nullable = true)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;

	public MProductCategory() {
		super();
	}

	public MProductCategoryKey getKey() {
		return key;
	}

	public void setKey(MProductCategoryKey key) {
		this.key = key;
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
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MProductCategoryKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MProductCategoryKey();

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
	
	@Override
	@Transient
	public boolean hasParent() {
		return !EO.isRootID(parent_ID, true);
	}
}
