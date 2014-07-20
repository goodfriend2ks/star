package com.viettel.backend.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.viettel.annotation.Caption;
import com.viettel.annotation.CommonCaption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.EO;

@Entity(name = MTenant.TENANT_TABLE_NAME)
@Table(name = MTenant.TENANT_TABLE_NAME)
@Description("With MTenant, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootOrg = true, alwayRootApp = true)
@Caption("tenant")
public class MTenant extends EO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4142212916030434607L;
	
	@Transient
	public static final String KEY_PROPERTY = "id";
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = ORG_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MOrg.class, pkClazz = UUID.class,
			idProperty = MOrg.KEY_PROPERTY, captionProperty = MOrg.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID org_ID;
	
	@Index
	@Column(name = APP_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MApp.class, pkClazz = UUID.class, 
			idProperty = MApp.KEY_PROPERTY, captionProperty = MApp.DISPLAY_PROPERTY,  
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID app_ID;
	
	@Index
	@Column(name = "Code", nullable = false, length = 60)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = 255)
    private String name;
	
	@Column(name = "OfficeAddress")
    private String officeAddress;
	
	@Column(name = "BillAddress")
    private String billAddress;
	
	@Column(name = "Website")
    private String website;
	
	@Column(name = "Phone")
    private String phone;
	
	@Index
	@CommonCaption("active")
	@Column(name = "IsActive")
	private boolean isActive;
	
	@Index
	@CommonCaption("created")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Created")
	private Date created;
	
	@Index
	@CommonCaption("createdBy")
	@Column(name = "CreatedBy")
	private UUID createdBy;
	
	@Index
	@CommonCaption("updated")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Updated")
	private Date updated;
	
	@Index
	@CommonCaption("updatedBy")
	@Column(name = "UpdatedBy")
	private UUID updatedBy;
	
	@Index
	@Version
	@CommonCaption("version")
	@Column (name = "Version")
	private long version;
	
	public MTenant() {
    	super();
    }

	@Override
	public UUID getId() {
		return id;
	}
	
	@Override
	public void setId(UUID id) {
		this.id = id;
	}
	
	@Override
	public UUID getOrg_ID() {
		return org_ID;
	}

	@Override
	public void setOrg_ID(UUID org_ID) {
		this.org_ID = org_ID;
	}

	@Override
	public UUID getApp_ID() {
		return app_ID;
	}

	@Override
	public void setApp_ID(UUID app_ID) {
		this.app_ID = app_ID;
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

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public UUID getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(UUID createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdated() {
		return updated;
	}

	@Override
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public UUID getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(UUID updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public long getVersion() {
		return version;
	}

	@Override
	public void setVersion(long version) {
		this.version = version;
	}
	
	@Override
	@Transient
	public String getTableName() {
		return TENANT_TABLE_NAME;
	}

	@Override
	@Transient
	public String getKeyColumn() {
		return TENANT_KEYCOLUMN_NAME;
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
	public UUID getTenant_ID() {
		return id;
	}

	@Override
	@Transient
	public void setTenant_ID(UUID tenant_ID) {
		this.id = tenant_ID;
	}

	@Override
	@Transient
	public UUID getParent_ID() {
		return null;
	}

	@Override
	@Transient
	public boolean hasParent() {
		return false;
	}

	@Override
	public boolean beforeSave(boolean isNew) {
		setOrg_ID(ROOT_ID_VALUE);
		setApp_ID(ROOT_ID_VALUE);
		
		return true;
	}
	
	@Override
	public boolean afterSave(boolean isNew) {
		return true;
	}

	@Override
	public boolean beforeDelete() {
		return true;
	}

	@Override
	public boolean afterDelete() {
		return true;
	}
}
