package com.viettel.backend.common;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class LinkedEO<KT extends EOKey<PK>, PK extends Serializable> extends EO<KT, PK> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8140429010376867569L;

	@Transient
	public abstract void setKey(KT id);
	
	@Transient
	public abstract KT getKey();
	
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

	@Override
	@Transient
	public UUID getAd_Org_ID() {
		return null;
	}

	@Override
	@Transient
	public void setAd_Org_ID(UUID ad_Org_ID) {
	}

	@Override
	@Transient
	public UUID getAd_App_ID() {
		return null;
	}

	@Override
	@Transient
	public void setAd_App_ID(UUID ad_App_ID) {
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
	public void setCreated(Date created) {
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
		return getID().toString();
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
}
