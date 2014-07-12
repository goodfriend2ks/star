package com.viettel.backend.domain.dms.key;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.dms.MArea;

@Embeddable
public class MAreaKey extends EOKey<UUID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8373143823710506757L;
	
	@Transient
	public static final String KEY_NAME = "m_Area_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MArea.KEYCOLUMN_NAME, nullable = false)
    private UUID m_Area_ID;
	
	public MAreaKey()
	{
		super();
	}

	public MAreaKey(UUID ad_Client_ID, UUID c_Area_ID)
	{
	   this.ad_Client_ID = ad_Client_ID;
	   this.m_Area_ID = c_Area_ID;
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
		this.m_Area_ID = id;
	}

	@Override
	public UUID getID() {
		return this.m_Area_ID;
	}

	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}