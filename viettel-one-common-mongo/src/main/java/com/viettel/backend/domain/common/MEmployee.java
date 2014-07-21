package com.viettel.backend.domain.common;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MUser;

@Entity(name = MEmployee.TABLE_NAME)
@Table(name = MEmployee.TABLE_NAME)
@Description("With MEmployee, AD_App_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false)
@Caption("employee")
public class MEmployee extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2689977806059549548L;
	
	@Transient
	public static final String TABLE_NAME = "C_Employee";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String SUPERVISION_COLUMN_NAME = "Supervision_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
    private String name;

	@Index
	@Enumerated
	@Column(name = "Type", nullable = false)
    private MEmployeeType type;
	
	@Index
	@Enumerated
	@Column(name = "Status", nullable = false)
    private MEmployeeStatus status;
	
	@Index
	@Enumerated
	@Column(name = "Gender", nullable = false)
    private MGender gender;
	
	@Description("Chuc danh")
	@Column(name = "Position", length = EO.NAME_SHORT_LENGTH)
	private String position;
	
	@Column(name = "Address", length = EO.ADDRESS_LENGTH)
    private String address;
	
	@Column(name = "Phone", length = EO.PHONE_LENGTH)
    private String phone;
	
	@Column(name = "Mobile", length = EO.PHONE_LENGTH)
    private String mobile;

	@Column(name = "Email", length = EO.URL_LENGTH)
    private String email;
	
	@Column(name = "BankAccount", length = EO.CODE_NORMAL_LENGTH)
    private String bankAccount;
	
	@Column(name = "BankName", length = EO.NAME_NORMAL_LENGTH)
    private String bankName;
	
	@Column(name = "TaxCode", length = EO.CODE_NORMAL_LENGTH)
    private String taxCode;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "StartedDate")
	private Date startedDate;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OfficialDate")
	private Date officialDate;
	
	@Column(name = "IdCard", length = EO.CODE_NORMAL_LENGTH)
    private String idCard;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "IdCardDate")
	private Date idCardDate;
	
	@Column(name = "IdCardPlace", length = EO.ADDRESS_LENGTH)
    private String idCardPlace;
	
	@Column(name = "Education", length = EO.NAME_NORMAL_LENGTH)
    private String education;
	
	@Column(name = "IMEI", length = EO.CODE_NORMAL_LENGTH)
	private String imei;
	
	@Column(name = "LastApprovedOrder")
	@Temporal(TemporalType.DATE)
	@Description("don hang cuoi cung duoc duyet")
	private Date lastApprovedOrder;
	
	@Column(name = "LastOrder")
	@Temporal(TemporalType.DATE)
	@Description("don hang cuoi cung da dat")
	private Date lastOrder;
	
	@Index
	@Description("Nhan vien giam sat")
	@Column(name = MEmployee.SUPERVISION_COLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MEmployee.class, pkClazz = UUID.class, 
			idProperty = MEmployee.KEY_PROPERTY, captionProperty = MEmployee.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID supervision_ID;
	
	@Index
	@Description("Dia ban")
	@Column(name = MArea.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MArea.class, pkClazz = UUID.class, 
			idProperty = MArea.KEY_PROPERTY, captionProperty = MArea.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID area_ID;
	
	@ElementCollection
	@Column(name = "AD_Users", nullable = false)
	@EntityLinked(entityClazz = MUser.class, pkClazz = UUID.class, 
			idProperty = MUser.KEY_PROPERTY, captionProperty = MUser.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, condition = "tenant_ID={tanent_ID} AND isActive=true", canNew = false)
	private Set<UUID> linkedUsers;
	
	@Index
	@Description("Nha phan phoi")
	@Column(name = "Shop_ID", nullable = false)
	@EntityLinked(entityClazz = MOrg.class, pkClazz = UUID.class, 
			idProperty = MOrg.KEY_PROPERTY, captionProperty = MOrg.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID shop_ID;
	
	@Description("SKU Ke hoach")
	@Column(name = "SKU")
	private long sku;
	
	@Column(name = "PlanUpdated")
	@Temporal(TemporalType.DATE)
	private Date planUpdated;
	
	public MEmployee() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MEmployeeType getType() {
		return type;
	}

	public void setType(MEmployeeType type) {
		this.type = type;
	}

	public MEmployeeStatus getStatus() {
		return status;
	}

	public void setStatus(MEmployeeStatus status) {
		this.status = status;
	}

	public MGender getGender() {
		return gender;
	}

	public void setGender(MGender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Date getOfficialDate() {
		return officialDate;
	}

	public void setOfficialDate(Date officialDate) {
		this.officialDate = officialDate;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getIdCardDate() {
		return idCardDate;
	}

	public void setIdCardDate(Date idCardDate) {
		this.idCardDate = idCardDate;
	}

	public String getIdCardPlace() {
		return idCardPlace;
	}

	public void setIdCardPlace(String idCardPlace) {
		this.idCardPlace = idCardPlace;
	}

	public UUID getSupervision_ID() {
		return supervision_ID;
	}

	public void setSupervision_ID(UUID supervision_ID) {
		this.supervision_ID = supervision_ID;
	}

	public UUID getArea_ID() {
		return area_ID;
	}

	public void setArea_ID(UUID area_ID) {
		this.area_ID = area_ID;
	}

	public Set<UUID> getLinkedUsers() {
		return linkedUsers;
	}

	public void setLinkedUsers(Set<UUID> linkedUsers) {
		this.linkedUsers = linkedUsers;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Date getLastApprovedOrder() {
		return lastApprovedOrder;
	}

	public void setLastApprovedOrder(Date lastApprovedOrder) {
		this.lastApprovedOrder = lastApprovedOrder;
	}

	public Date getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(Date lastOrder) {
		this.lastOrder = lastOrder;
	}

	public UUID getShop_ID() {
		return shop_ID;
	}

	public void setShop_ID(UUID shop_ID) {
		this.shop_ID = shop_ID;
	}

	public long getSku() {
		return sku;
	}

	public void setSku(long sku) {
		this.sku = sku;
	}

	public Date getPlanUpdated() {
		return planUpdated;
	}

	public void setPlanUpdated(Date planUpdated) {
		this.planUpdated = planUpdated;
	}

	@Override
	public String getDisplay() {
		return name;
	}

	@Override
	public void setDisplay(String display) {
		this.name = display;
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
