package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MUser;

@Embeddable
public class MUserKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8567200835961526352L;

	@Transient
	public static final String KEY_NAME = "ad_User_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MUser.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_User_ID;
	
	public MUserKey() {
		super();
	}

	public MUserKey(UUID ad_Client_ID, UUID ad_User_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_User_ID = ad_User_ID;
	}
	
	@Override
	public UUID getAd_Client_ID() {
		return ad_Client_ID;
	}

	@Override
	public void setAd_Client_ID(UUID ad_Client_ID) {
		this.ad_Client_ID = ad_Client_ID;
	}

	@Override
	public void setID(UUID id) {
		this.ad_User_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_User_ID;
	}
	
	@Override
	@Transient
	@JsonIgnore
	public String getKeyName() {
		return KEY_NAME;
	}
}
