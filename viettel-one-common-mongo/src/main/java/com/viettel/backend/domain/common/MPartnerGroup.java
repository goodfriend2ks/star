package com.viettel.backend.domain.common;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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

@Entity(name = MPartnerGroup.TABLE_NAME)
@Table(name = MPartnerGroup.TABLE_NAME)
@Description("With MPartnerGroup, AD_Org_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false)
@Caption("partnergroup")
public class MPartnerGroup extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5085654932674398717L;
	
	@Transient
	public static final String TABLE_NAME = "C_PartnerGroup";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = "id";
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
	
	@Index
	@Enumerated
	@Column(name = "Type", nullable = false)
    private MPartnerType type;
	
	@Index
	@Column(name = MPartnerGroup.PARENT_COLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MPartnerGroup.class, pkClazz = UUID.class, 
			idProperty = MPartnerGroup.KEY_PROPERTY, captionProperty = MPartnerGroup.DISPLAY_PROPERTY, 
			emptyValue = DEFAULT_PARENT_STRING_VALUE, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;

	public MPartnerGroup() {
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

	public MPartnerType getType() {
		return type;
	}

	public void setType(MPartnerType type) {
		this.type = type;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

	@Override
	@Transient
	public String getDisplay() {
		return this.name;
	}

	@Override
	@Transient
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
