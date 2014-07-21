package com.viettel.backend.domain.common;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.dms.MRoute;

@Entity(name = MPartner.TABLE_NAME)
@Table(name = MPartner.TABLE_NAME)
@Description("With MPartner, AD_Org_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false)
@Caption("partner")
public class MPartner extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "C_Partner";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_NORMAL_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
    private String name;
	
	@Index
	@Column(name = MPartnerGroup.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MPartnerGroup.class, pkClazz = UUID.class, 
			idProperty = MPartnerGroup.KEY_PROPERTY, captionProperty = MPartnerGroup.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID partnerGroup_ID;
	
	@Index
	@Enumerated
	@Column(name = "Type", nullable = false)
    private MPartnerType type;
	
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
	@Column(name = MArea.KEYCOLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MArea.class, pkClazz = UUID.class, 
			idProperty = MArea.KEY_PROPERTY, captionProperty = MArea.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID area_ID;
	
	@Index
	@Column(name = MRoute.KEYCOLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MRoute.class, pkClazz = UUID.class, 
			idProperty = MRoute.KEY_PROPERTY, captionProperty = MRoute.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, condition = "", canNew = false)
    private UUID currentRoute_ID;
	
	public MPartner() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public UUID getPartnerGroup_ID() {
		return partnerGroup_ID;
	}

	public void setPartnerGroup_ID(UUID partnerGroup_ID) {
		this.partnerGroup_ID = partnerGroup_ID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public MPartnerType getType() {
		return type;
	}

	public void setType(MPartnerType type) {
		this.type = type;
	}

	public UUID getArea_ID() {
		return area_ID;
	}

	public void setArea_ID(UUID area_ID) {
		this.area_ID = area_ID;
	}

	public UUID getCurrentRoute_ID() {
		return currentRoute_ID;
	}

	public void setCurrentRoute_ID(UUID currentRoute_ID) {
		this.currentRoute_ID = currentRoute_ID;
	}

	@Override
	public String getDisplay() {
		return name;
	}

	@Override
	public void setDisplay(String display) {
		name = display;
	}
	
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}
}
