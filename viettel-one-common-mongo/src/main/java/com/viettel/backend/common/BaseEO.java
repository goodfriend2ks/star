package com.viettel.backend.common;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Index;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.viettel.annotation.CommonCaption;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MTenant;

/**
 * Common Entity Object
 * 
 * @name: Entity Object
 * @author phatpq
 * @Time: Jan 9, 2013
 * @param <PK extends Object>
 */
@MappedSuperclass
public abstract class BaseEO<PK extends Serializable> extends EO<PK>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6193509556593385167L;
	
	@Index
	@Column(name = TENANT_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MTenant.class, pkClazz = UUID.class,  
			idProperty = MTenant.KEY_PROPERTY, captionProperty = MTenant.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, checkOrg = false, checkApp = false, canNew = false)
	private UUID tenant_ID;
	
	@Index
	@Column(name = ORG_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MOrg.class, pkClazz = UUID.class,  
			idProperty = MOrg.KEY_PROPERTY, captionProperty = MOrg.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, checkOrg = false, checkApp = false, canNew = false)
	private UUID org_ID;
	
	@Index
	@Column(name = APP_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MApp.class, pkClazz = UUID.class, 
			idProperty = MApp.KEY_PROPERTY, captionProperty = MApp.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, checkApp = false, canNew = false)
	private UUID app_ID;
	
	@Index
	@CommonCaption("active")
	@Column(name = ACTIVE_COLUMN_NAME, nullable = false)
	private boolean isActive;
	
	@Index
	@CommonCaption("created")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Created", nullable = false)
	private Date created;
	
	@Index
	@CommonCaption("createdBy")
	@Column(name = "CreatedBy", nullable = false)
	private UUID createdBy;
	
	@Index
	@CommonCaption("updated")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Updated", nullable = false)
	private Date updated;

	@Index
	@CommonCaption("updatedBy")
	@Column(name = "UpdatedBy", nullable = false)
	private UUID updatedBy;
	
	@Index
	@Version
	@CommonCaption("version")
	@Column (name = "Version", nullable = false)
	private long version;
	
	public BaseEO() 
	{
		super();
		
		this.isActive = true;
		this.version = 0L;
	}

	@Override
	public UUID getTenant_ID() {
		return tenant_ID;
	}

	@Override
	public void setTenant_ID(UUID tenant_ID) {
		this.tenant_ID = tenant_ID;
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

	@Override
	public UUID getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(UUID updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdated() {
		return updated;
	}
	
	@Override
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	@Override
	public long getVersion() {
		return this.version;
	}

	@Override
	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	public PK getParent_ID() {
		return null;
	}
	
	@Override
	public boolean hasParent() {
		return false;
	}
	
	@Override
	@Transient
	public boolean beforeSave(boolean isNew)
	{
		if (created == null)
		{
			created = new Date();
			version = 0L;
		}
		
		updated = new Date();
		version += 1;
		
		return true;
	}
	
	@Override
	@Transient
	public boolean afterSave(boolean isNew)
	{
		return true;
	}
	
	@Override
	@Transient
	public boolean beforeDelete()
	{
		return true;
	}
	
	@Override
	@Transient
	public boolean afterDelete()
	{
		return true;
	}
	
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int hash = 17;
	    hash = hash * prime + this.getId().hashCode();
	    
	    return hash;
	}

	@Override
	public String toString() {
		return "EO [TableName=" + getTableName() + ", " + getKeyColumn() + "=" + getId() + "]";
	}
}