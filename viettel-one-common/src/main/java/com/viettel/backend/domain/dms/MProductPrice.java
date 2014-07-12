package com.viettel.backend.domain.dms;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
import com.viettel.backend.domain.dms.key.MProductKey;
import com.viettel.backend.domain.dms.key.MProductPriceKey;

@Entity(name = MProductPrice.TABLE_NAME)
@Table(name = MProductPrice.TABLE_NAME)
//@IndexCollection(columns = { @Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"), @Index(name = "isActive"),
//		@Index(name = "created"), @Index(name = "createdBy"),
//		@Index(name = "updated"), @Index(name = "updatedBy"),
//		@Index(name = "version"), @Index(name = "name") })
@Description("With MProductType, AD_App_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("producttype")
public class MProductPrice extends BaseEO<MProductPriceKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductPrice";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MProductPriceKey key;
	
	@Index
	@EntityLinked(entityClazz = MProduct.class, keyClazz = MProductKey.class, pkClazz = UUID.class, 
			idProperty = MProductKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProduct.KEYCOLUMN_NAME, nullable = false)
	private UUID m_Product_ID;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ApplyDate", nullable = false, length = 100)
	private Date applyDate;
	
	@Column(name = "BaseUnitPrice", nullable = false, length = 100)
	private float baseUnitPrice;
	
	@Column(name = "ExtendUnitPrice", nullable = false, length = 100)
	private float extendUnitPrice;
	
	@Column(name = "InputTax", nullable = false, length = 100)
	private float inputTax;
	
	@Column(name = "outputTax", nullable = false, length = 100)
	private float outputTax;
	
	public MProductPrice() {
		super();
	}

	public MProductPriceKey getKey() {
		return key;
	}

	public void setKey(MProductPriceKey key) {
		this.key = key;
	}

	public UUID getM_Product_ID() {
		return m_Product_ID;
	}

	public void setM_Product_ID(UUID m_Product_ID) {
		this.m_Product_ID = m_Product_ID;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public float getBaseUnitPrice() {
		return baseUnitPrice;
	}

	public void setBaseUnitPrice(float baseUnitPrice) {
		this.baseUnitPrice = baseUnitPrice;
	}

	public float getExtendUnitPrice() {
		return extendUnitPrice;
	}

	public void setExtendUnitPrice(float extendUnitPrice) {
		this.extendUnitPrice = extendUnitPrice;
	}

	public float getInputTax() {
		return inputTax;
	}

	public void setInputTax(float inputTax) {
		this.inputTax = inputTax;
	}

	public float getOutputTax() {
		return outputTax;
	}

	public void setOutputTax(float outputTax) {
		this.outputTax = outputTax;
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MProductPriceKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MProductPriceKey();

		key.setID(id);
	}

	@Override
	@Transient
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	@Transient
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}

	@Override
	@Transient
	public String getDisplay() {
		return getTableName() + "_" + getApplyDate().toString();
	}

	@Override
	public void setDisplay(String display) {
	}
}
