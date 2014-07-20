package com.viettel.backend.common;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Index;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.domain.MTenant;

@MappedSuperclass
public abstract class LinkedEO<PK extends Serializable> extends EO<PK> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8140429010376867569L;

	@Index
	@Column(name = ORG_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MTenant.class, pkClazz = UUID.class,  
			idProperty = MTenant.KEY_PROPERTY, captionProperty = "name", 
			type = LinkedType.DROPDOWN, checkOrg = false, checkApp = false, canNew = false)
	private UUID tenant_ID;
	
	/*@Transient
	public abstract void setKey(KT id);
	
	@Transient
	public abstract KT getKey();*/
	
	/*@Override
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
	}*/

	@Override
	public UUID getTenant_ID() {
		return tenant_ID;
	}

	@Override
	public void setTenant_ID(UUID tenant_ID) {
		this.tenant_ID = tenant_ID;
	}
	
	@Override
	@Transient
	public UUID getOrg_ID() {
		return null;
	}

	@Override
	@Transient
	public void setOrg_ID(UUID org_ID) {
	}

	@Override
	@Transient
	public UUID getApp_ID() {
		return null;
	}

	@Override
	@Transient
	public void setApp_ID(UUID app_ID) {
	}

	@Override
	@Transient
	public boolean isActive() {
		return true;
	}

	@Override
	@Transient
	public void setActive(boolean isActive) {
	}

	@Override
	@Transient
	public long getVersion() {
		return 0;
	}

	@Override
	@Transient
	public void setVersion(long version) {
	}

	@Override
	@Transient
	public Date getCreated() {
		return null;
	}
	
	@Override
	@Transient
	public void setCreated(Date created) {
	}

	@Override
	@Transient
	public Date getUpdated() {
		return null;
	}
	
	@Override
	@Transient
	public void setUpdated(Date updated) {
	}

	@Override
	public UUID getCreatedBy() {
		return null;
	}

	@Override
	public void setCreatedBy(UUID createdBy) {
	}

	@Override
	public UUID getUpdatedBy() {
		return null;
	}

	@Override
	public void setUpdatedBy(UUID updatedBy) {
	}
	
	@Override
	@Transient
	public String getDisplay() {
		return getId().toString();
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
	}
	
	@Override
	@Transient
	public PK getParent_ID() {
		return null;
	}
	
	@Override
	public boolean hasParent() {
		return false;
	}
	
	@Override
	@Transient
	public boolean beforeSave(boolean isNew) {
		return true;
	}

	@Override
	@Transient
	public boolean afterSave(boolean isNew) {
		return true;
	}

	@Override
	@Transient
	public boolean beforeDelete() {
		return true;
	}

	@Override
	@Transient
	public boolean afterDelete() {
		return true;
	}
}
