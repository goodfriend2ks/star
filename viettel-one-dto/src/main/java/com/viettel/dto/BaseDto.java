package com.viettel.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.viettel.backend.common.IValuePair;

public abstract class BaseDto {
	
	private UUID ad_Org_ID;
	
	private String orgName;
	
	private List<IValuePair<UUID>> orgs;
	
	private boolean isActive;
	
	private Date created;
	
	private Date updated;
	
	private long version;

	public UUID getAd_Org_ID() {
		return ad_Org_ID;
	}

	public void setAd_Org_ID(UUID ad_Org_ID) {
		this.ad_Org_ID = ad_Org_ID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public List<IValuePair<UUID>> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<IValuePair<UUID>> orgs) {
		this.orgs = orgs;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
}
