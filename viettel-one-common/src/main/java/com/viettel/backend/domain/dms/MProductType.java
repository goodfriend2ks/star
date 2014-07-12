package com.viettel.backend.domain.dms;

import java.util.List;
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
import com.viettel.annotation.InputPrompt;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.common.MAttribute;
import com.viettel.backend.domain.common.key.MAttributeKey;
import com.viettel.backend.domain.dms.key.MProductTypeKey;

@Entity(name = MProductType.TABLE_NAME)
@Table(name = MProductType.TABLE_NAME)
//@IndexCollection(columns = { @Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"), @Index(name = "isActive"),
//		@Index(name = "created"), @Index(name = "createdBy"),
//		@Index(name = "updated"), @Index(name = "updatedBy"),
//		@Index(name = "version"), @Index(name = "name") })
@Description("With MProductType, AD_App_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("producttype")
public class MProductType extends BaseEO<MProductTypeKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductType";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MProductTypeKey key;

	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Column(name = "Description", nullable = true)
	private String description;
	
	@InputPrompt()
	@ElementCollection
	@Column(name = "Attributes", nullable = false)
	@EntityLinked(entityClazz = MAttribute.class, keyClazz = MAttributeKey.class, pkClazz = UUID.class, 
			idProperty = MAttributeKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	private List<UUID> attributes;
	
	public MProductType() {
		super();
	}

	public MProductTypeKey getKey() {
		return key;
	}

	public void setKey(MProductTypeKey key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UUID> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<UUID> attributes) {
		this.attributes = attributes;
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MProductTypeKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MProductTypeKey();

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
	public String getDisplay() {
		return name;
	}

	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}
}
