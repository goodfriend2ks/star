package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MOrg;

@Embeddable
public class MOrgKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public static final String KEY_NAME = "ad_Org_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MOrg.ORG_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Org_ID;
	
	public MOrgKey() {
		super();
	}

	public MOrgKey(UUID ad_Client_ID, UUID ad_Org_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_Org_ID = ad_Org_ID;
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
		this.ad_Org_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_Org_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
