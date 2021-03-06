package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MReportPara;

@Embeddable
public class MReportParaKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7124365808156710770L;

	@Transient
	public static final String KEY_NAME = "ad_ReportPara_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MReportPara.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_ReportPara_ID;
	
	public MReportParaKey() {
		super();
	}

	public MReportParaKey(UUID ad_Client_ID, UUID ad_ReportPara_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_ReportPara_ID = ad_ReportPara_ID;
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
		this.ad_ReportPara_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_ReportPara_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
