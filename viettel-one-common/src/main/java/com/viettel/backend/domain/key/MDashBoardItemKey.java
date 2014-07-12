package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MDashBoardItem;

@Embeddable
public class MDashBoardItemKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6513693533974446834L;

	@Transient
	public static final String KEY_NAME = "ad_DashBoardItem_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MDashBoardItem.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_DashBoardItem_ID;
	
	public MDashBoardItemKey() {
		super();
	}

	public MDashBoardItemKey(UUID ad_Client_ID, UUID ad_DashBoardItem_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_DashBoardItem_ID = ad_DashBoardItem_ID;
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
		this.ad_DashBoardItem_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_DashBoardItem_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
