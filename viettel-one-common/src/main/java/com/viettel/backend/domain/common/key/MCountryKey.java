package com.viettel.backend.domain.common.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.common.MCountry;


@Embeddable
public class MCountryKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 301160188702183012L;

	@Transient
	public static final String KEY_NAME = "c_Country_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MCountry.KEYCOLUMN_NAME, nullable = false)
    private UUID c_Country_ID;
	
	public MCountryKey() {
		super();
	}

	public MCountryKey(UUID ad_Client_ID, UUID c_Country_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.c_Country_ID = c_Country_ID;
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
		this.c_Country_ID = id;
	}

	@Override
	public UUID getID() {
		return this.c_Country_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
