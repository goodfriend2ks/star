package com.viettel.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MOrg;
import com.viettel.util.DataTypeUtil;

public abstract class BaseDto<T extends EO<PK>, PK extends Serializable> extends EO<PK> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7179132051896284616L;

	public static final String YES = "Y";
	public static final String NO = "N";
	
	@Transient
	public static String fromBoolean(boolean value) {
		return (value ? YES : NO);
	}
	
	@Transient
	public static boolean toBoolean(String value) {
		return YES.equalsIgnoreCase(value) || "true".equalsIgnoreCase(value);
	}
	
	private PK id;
	
	private UUID org_ID;
	
	private String orgName;
	
	/*private List<IValuePair<UUID>> orgs;*/
	
	private String status;
	
	private Date created;
	
	private Date updated;
	
	private long version;

	protected BaseDto() {
	}
	
	protected BaseDto(T eo, MOrg org) {
		if (eo == null)
			return;
		
		this.id = eo.getId();
		this.org_ID = eo.getOrg_ID();
		this.created = eo.getCreated();
		this.updated = eo.getUpdated();
		this.version = eo.getVersion();
		this.status = fromBoolean(eo.isActive());
		
		if (org != null && DataTypeUtil.compare(UUID.class, org.getId(), eo.getOrg_ID()) == 0) {
			this.orgName = org.getName();
		}
		
		this.fromBean(eo);
	}
	
	public abstract void fromBean(T bean);
	
	public abstract void toBean(T bean) throws Exception;
	
	@Override
	public void setId(PK id) {
		this.id = id;
	}

	@Override
	public PK getId() {
		return this.id;
	}
	
	@Override
	public UUID getOrg_ID() {
		return org_ID;
	}

	@Override
	public void setOrg_ID(UUID org_ID) {
		this.org_ID = org_ID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/*public List<IValuePair<UUID>> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<IValuePair<UUID>> orgs) {
		this.orgs = orgs;
	}*/
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public Date getUpdated() {
		return updated;
	}

	@Override
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public long getVersion() {
		return version;
	}

	@Override
	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	@Transient
	@JsonIgnore
	public boolean isActive() {
		return true;
	}

	@Override
	@Transient
	@JsonIgnore
	public void setActive(boolean isActive) {
	}
	
	@Override
	@Transient
	@JsonIgnore
	public String getDisplay() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public void setDisplay(String display) {
	}

	@Override
	@Transient
	@JsonIgnore
	public UUID getTenant_ID() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public void setTenant_ID(UUID tenant_ID) {
	}

	@Override
	@Transient
	@JsonIgnore
	public UUID getApp_ID() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public void setApp_ID(UUID app_ID) {
	}

	@Override
	@Transient
	@JsonIgnore
	public UUID getCreatedBy() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public void setCreatedBy(UUID createdBy) {
	}

	@Override
	@Transient
	@JsonIgnore
	public UUID getUpdatedBy() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public void setUpdatedBy(UUID updatedBy) {
	}

	@Override
	@Transient
	@JsonIgnore
	public PK getParent_ID() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public boolean hasParent() {
		return false;
	}

	@Override
	@Transient
	@JsonIgnore
	public String getTableName() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public String getKeyColumn() {
		return null;
	}

	@Override
	@Transient
	@JsonIgnore
	public boolean beforeSave(boolean isNew) {
		return false;
	}

	@Override
	@Transient
	@JsonIgnore
	public boolean afterSave(boolean isNew) {
		return false;
	}

	@Override
	@Transient
	@JsonIgnore
	public boolean beforeDelete() {
		return false;
	}

	@Override
	@Transient
	@JsonIgnore
	public boolean afterDelete() {
		return false;
	}
}
