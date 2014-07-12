package com.viettel.backend.domain.dms.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.dms.MProductCategory;


@Embeddable
public class MProductCategoryKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 16035188702183012L;

	@Transient
	public static final String KEY_NAME = "m_ProductCategory_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MProductCategory.KEYCOLUMN_NAME, nullable = false)
    private UUID m_ProductCategory_ID;
	
	public MProductCategoryKey() {
		super();
	}

	public MProductCategoryKey(UUID ad_Client_ID, UUID m_ProductCategory_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.m_ProductCategory_ID = m_ProductCategory_ID;
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
		this.m_ProductCategory_ID = id;
	}

	@Override
	public UUID getID() {
		return this.m_ProductCategory_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
