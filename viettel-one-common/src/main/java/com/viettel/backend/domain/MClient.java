package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.domain.key.MClientKey;

@Entity(name = MClient.CLIENT_TABLE_NAME)
@Table(name = MClient.CLIENT_TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "code"), 
//		@Index(name = "name")})
@Description("With MClient, AD_Org_ID and AD_App_ID always is root")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootOrg = true, alwayRootApp = true)
@Caption("client")
public class MClient extends BaseEO<MClientKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4142212916030434607L;
	
	@EmbeddedId
	private MClientKey key;
	
	@Index
	@Column(name = "Code", nullable = false, length = 60)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = 255)
    private String name;
	
	@Column(name = "OfficeAddress")
    private String officeAddress;
	
	@Column(name = "BillAddress")
    private String billAddress;
	
	@Column(name = "Website")
    private String website;
	
	@Column(name = "Phone")
    private String phone;
	
	public MClient() {
    	super();
    }

	public MClientKey getKey() {
		return key;
	}

	public void setKey(MClientKey key) {
		this.key = key;
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

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MClientKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MClientKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	public String getTableName() {
		return CLIENT_TABLE_NAME;
	}

	@Override
	public String getKeyColumn() {
		return CLIENT_KEYCOLUMN_NAME;
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
	public boolean beforeSave(boolean isNew) {
		setAd_Org_ID(ROOT_ID_VALUE);
		setAd_App_ID(ROOT_ID_VALUE);
		
		return super.beforeSave(isNew);
	}
}
