package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MRole;

@Embeddable
public class MRoleKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7348230799593663438L;

	@Transient
	public static final String KEY_NAME = "ad_Role_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MRole.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Role_ID;
	
	public MRoleKey() {
		super();
	}

	public MRoleKey(UUID ad_Client_ID, UUID ad_Role_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_Role_ID = ad_Role_ID;
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
		this.ad_Role_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_Role_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
