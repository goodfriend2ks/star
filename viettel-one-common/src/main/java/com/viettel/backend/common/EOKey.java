package com.viettel.backend.common;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public abstract class EOKey<PK extends Serializable> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8420487127683513851L;
	
	public abstract UUID getAd_Client_ID();
	
	public abstract void setAd_Client_ID(UUID ad_Client_ID);
	
	@Transient
	public abstract void setID(PK id);
	
	@Transient
	public abstract PK getID();
	
	@Transient
	public abstract String getKeyName();
}
