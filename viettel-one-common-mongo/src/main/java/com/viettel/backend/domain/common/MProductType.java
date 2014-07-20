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
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;

@Entity(name = MProductType.TABLE_NAME)
@Table(name = MProductType.TABLE_NAME)
@Description("With MProductType, AD_App_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, alwayRootOrg = true)
@Caption("producttype")
public class MProductType extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductType";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = "id";
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;

	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Column(name = "Description", nullable = true)
	private String description;
	
	/*@InputPrompt()
	@ElementCollection
	@Column(name = "Attributes", nullable = false)
	@EntityLinked(entityClazz = MAttribute.class, pkClazz = UUID.class, 
			idProperty = MAttributeKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	private List<UUID> attributes;*/
	
	public MProductType() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public List<UUID> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<UUID> attributes) {
		this.attributes = attributes;
	}*/
	
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
