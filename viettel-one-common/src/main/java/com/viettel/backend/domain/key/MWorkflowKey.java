package com.viettel.backend.domain.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MWorkflow;

@Embeddable
public class MWorkflowKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4105322420775979111L;

	@Transient
	public static final String KEY_NAME = "ad_Workflow_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MWorkflow.KEYCOLUMN_NAME, nullable = false)
    private UUID ad_Workflow_ID;
	
	public MWorkflowKey() {
		super();
	}

	public MWorkflowKey(UUID ad_Client_ID, UUID ad_Workflow_ID) {
		super();
		this.ad_Client_ID = ad_Client_ID;
		this.ad_Workflow_ID = ad_Workflow_ID;
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
		this.ad_Workflow_ID = id;
	}

	@Override
	public UUID getID() {
		return this.ad_Workflow_ID;
	}
	
	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
