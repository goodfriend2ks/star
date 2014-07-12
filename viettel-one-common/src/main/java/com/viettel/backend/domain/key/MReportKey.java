package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MReport;

@Embeddable
public class MReportKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6798786178224713066L;

	@Transient
	public static final String KEY_NAME = "ad_Report_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MReport.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Report_ID;
	
	public MReportKey() {
		super();
	}

	public MReportKey(UUID ad_Client_ID, UUID ad_Report_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_Report_ID = ad_Report_ID;
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
		this.ad_Report_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_Report_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
