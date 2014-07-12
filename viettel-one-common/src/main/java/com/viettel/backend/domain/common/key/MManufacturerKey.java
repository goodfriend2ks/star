package com.viettel.backend.domain.common.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.common.MManufacturer;

@Embeddable
public class MManufacturerKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 731223125893346152L;

	@Transient
	public static final String KEY_NAME = "ad_Manufacturer_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MManufacturer.KEYCOLUMN_NAME, nullable = false)
	private UUID c_Manufacturer_ID;
	
	public MManufacturerKey() {
		super();
	}

	public MManufacturerKey(UUID ad_Client_ID, UUID c_Manufacturer_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.c_Manufacturer_ID = c_Manufacturer_ID;
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
		this.c_Manufacturer_ID = id;
	}

	@Override
	public UUID getID() {
		return this.c_Manufacturer_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
