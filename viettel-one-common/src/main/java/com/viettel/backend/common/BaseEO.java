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
import com.viettel.backend.domain.key.MAppKey;
import com.viettel.backend.domain.key.MOrgKey;

/**
 * Common Entity Object
 * 
 * @name: Entity Object
 * @author phatpq
 * @Time: Jan 9, 2013
 * @param <PK extends Object, CK extends EOKey<PK>>
 */
@MappedSuperclass
public abstract class BaseEO<KT extends EOKey<PK>, PK extends Serializable> extends EO<KT, PK>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6193509556593385167L;
	
	@Index
	@Column(name = ORG_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MOrg.class, keyClazz = MOrgKey.class, pkClazz = UUID.class,  
			idProperty = MOrgKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, checkOrg = false, checkApp = false, canNew = false)
	private UUID ad_Org_ID;
	
	@Index
	@Column(name = APP_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MApp.class, keyClazz = MAppKey.class, pkClazz = UUID.class, 
			idProperty = MAppKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, checkApp = false, canNew = false)
	private UUID ad_App_ID;
	
	@Index
	@CommonCaption("active")
	@Column(name = "IsActive", nullable = false)
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
	@Transient
	public PK getID() {
		KT key = getKey();
		if (key == null)
			return null;
		
		return key.getID();
	}

	@Override
	@Transient
	public UUID getAd_Client_ID() {
		KT key = getKey();
		if (key == null)
			return null;
		
		return key.getAd_Client_ID();
	}

	public UUID getAd_Org_ID() {
		return ad_Org_ID;
	}

	public void setAd_Org_ID(UUID ad_Org_ID) {
		this.ad_Org_ID = ad_Org_ID;
	}
	
	public UUID getAd_App_ID() {
		return ad_App_ID;
	}

	public void setAd_App_ID(UUID ad_App_ID) {
		this.ad_App_ID = ad_App_ID;
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

	public UUID getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UUID createdBy) {
		this.createdBy = createdBy;
	}

	public UUID getUpdatedBy() {
		return updatedBy;
	}

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
	    hash = hash * prime + this.getID().hashCode();
	    
	    return hash;
	}

	@Override
	public String toString() {
		return "EO [TableName=" + getTableName() + ", " + getKeyColumn() + "=" + getID() + "]";
	}
}