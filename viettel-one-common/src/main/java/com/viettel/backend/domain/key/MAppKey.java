package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MClient;

@Embeddable
public class MAppKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7664081205492542693L;

	@Transient
	public static final String KEY_NAME = "ad_App_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MApp.APP_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_App_ID;
	
	public MAppKey() {
		super();
	}

	public MAppKey(UUID ad_Client_ID, UUID ad_App_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_App_ID = ad_App_ID;
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
		this.ad_App_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_App_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
