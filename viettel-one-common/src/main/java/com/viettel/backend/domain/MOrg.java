package com.viettel.backend.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.viettel.annotation.Caption;
import com.viettel.annotation.CommonCaption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.key.MAppKey;
import com.viettel.backend.domain.key.MOrgKey;

@Entity(name = MOrg.ORG_TABLE_NAME)
@Table(name = MOrg.ORG_TABLE_NAME)
@Description("With MOrg, AD_App_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = true, 
		alwayRootApp = true)
@Caption("org")
public class MOrg extends EO<MOrgKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1551741934939695342L;
	
	@EmbeddedId
	private MOrgKey key;
	
	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_NORMAL_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
    private String name;
	
	@Index
	@Enumerated
	@Column(name = "OrgType", nullable = false)
    private MOrgType orgType;
	
	@Column(name = "Address", length = EO.ADDRESS_LENGTH)
    private String address;
	
	@Column(name = "Phone", length = EO.PHONE_LENGTH)
    private String phone;
	
	@Column(name = "Mobile", length = EO.PHONE_LENGTH)
    private String mobile;
	
	@Column(name = "Fax", length = EO.PHONE_LENGTH)
    private String fax;
	
	@Column(name = "Email", length = EO.URL_LENGTH)
    private String email;
	
	@Column(name = "Website", length = EO.URL_LENGTH)
    private String website;
	
	@Column(name = "BankAccount", length = EO.CODE_NORMAL_LENGTH)
    private String bankAccount;
	
	@Column(name = "BankName", length = EO.NAME_NORMAL_LENGTH)
    private String bankName;
	
	@Column(name = "TaxCode", length = EO.CODE_NORMAL_LENGTH)
    private String taxCode;
	
	@Column(name = "BillAddress", length = EO.ADDRESS_LENGTH)
    private String billAddress;
	
	@Column(name = "ContactName", length = EO.NAME_SHORT_LENGTH)
    private String contactName;
	
	@Column(name = "DeliveryAddress", length = EO.ADDRESS_LENGTH)
    private String deliveryAddress;
	
	@Column(name = "Longitude")
	private double longitude;
	
	@Column(name = "Latitude")
	private double latitude;
	
	@Index
	@Column(name = MOrg.PARENT_COLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MOrg.class, keyClazz = MOrgKey.class, pkClazz = UUID.class, 
			idProperty = MOrgKey.KEY_NAME, captionProperty = "name", emptyValue = DEFAULT_PARENT_STRING_VALUE, 
			type = LinkedType.DROPDOWN, canNew = true)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;
	
	@Index
	@Column(name = APP_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MApp.class, keyClazz = MAppKey.class, pkClazz = UUID.class, 
			idProperty = MAppKey.KEY_NAME, captionProperty = "name",  
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID ad_App_ID;
	
	@Index
	@CommonCaption("active")
	@Column(name = "IsActive")
	private boolean isActive;
	
	@Index
	@CommonCaption("created")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Created")
	private Date created;
	
	@Index
	@CommonCaption("createdBy")
	@Column(name = "CreatedBy")
	private UUID createdBy;
	
	@Index
	@CommonCaption("updated")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Updated")
	private Date updated;
	
	@Index
	@CommonCaption("updatedBy")
	@Column(name = "UpdatedBy")
	private UUID updatedBy;
	
	@Index
	@Version
	@CommonCaption("version")
	@Column (name = "Version")
	private long version;
	
	public MOrg() {
		super();
	}

	@Override
	public MOrgKey getKey() {
		return key;
	}

	@Override
	public void setKey(MOrgKey key) {
		this.key = key;
	}

	@Override
	public UUID getAd_App_ID() {
		return ad_App_ID;
	}

	@Override
	public void setAd_App_ID(UUID ad_App_ID) {
		this.ad_App_ID = ad_App_ID;
	}

	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	public UUID getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UUID createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdated() {
		return updated;
	}

	@Override
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public UUID getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UUID updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public long getVersion() {
		return version;
	}

	@Override
	public void setVersion(long version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

	public MOrgType getOrgType() {
		return orgType;
	}

	public void setOrgType(MOrgType orgType) {
		this.orgType = orgType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MOrgKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public UUID getID() {
		if (key == null)
			return null;
		
		return key.getID();
	}
	
	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MOrgKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}
	
	@Override
	@Transient
	public UUID getAd_Client_ID() {
		if (key == null)
			return null;
		
		return key.getAd_Client_ID();
	}
	
	@Override
	@Transient
	public UUID getAd_Org_ID() {
		return this.getID();
	}

	@Override
	@Transient
	public void setAd_Org_ID(UUID ad_Org_ID) {
		this.setID(ad_Org_ID);
	}

	@Override
	@Transient
	public String getTableName() {
		return ORG_TABLE_NAME;
	}

	@Override
	@Transient
	public String getKeyColumn() {
		return ORG_KEYCOLUMN_NAME;
	}

	@Override
	@Transient
	public String getDisplay() {
		return name;
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}
	
	@Override
	@Transient
	public boolean beforeSave(boolean isNew) {
		this.setAd_App_ID(ROOT_ID_VALUE);
		return true;
	}

	@Override
	@Transient
	public boolean afterSave(boolean isNew) {
		return true;
	}

	@Override
	@Transient
	public boolean beforeDelete() {
		return true;
	}

	@Override
	@Transient
	public boolean afterDelete() {
		return true;
	}
	
	@Transient
	public boolean hasParent()
	{
		return !EO.isRootID(parent_ID, true);
	}
}
