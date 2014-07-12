package com.viettel.backend.domain.dms.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.dms.MProductType;


@Embeddable
public class MProductTypeKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1603318870218012L;

	@Transient
	public static final String KEY_NAME = "m_ProductType_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MProductType.KEYCOLUMN_NAME, nullable = false)
    private UUID m_ProductType_ID;
	
	public MProductTypeKey() {
		super();
	}

	public MProductTypeKey(UUID ad_Client_ID, UUID m_ProductType_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.m_ProductType_ID = m_ProductType_ID;
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
		this.m_ProductType_ID = id;
	}

	@Override
	public UUID getID() {
		return this.m_ProductType_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
