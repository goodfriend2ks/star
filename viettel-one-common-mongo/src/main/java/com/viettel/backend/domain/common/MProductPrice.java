package com.viettel.backend.domain.common;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity(name = MProductPrice.TABLE_NAME)
@Table(name = MProductPrice.TABLE_NAME)
@Description("With MProductType, AD_App_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, alwayRootOrg = true)
@Caption("producttype")
public class MProductPrice extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductPrice";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = "id";
	/*@Transient
	public static final String DISPLAY_PROPERTY = "name";*/
	
	@Id
	private UUID id;
	
	@Index
	@EntityLinked(entityClazz = MProduct.class, pkClazz = UUID.class, 
			idProperty = MProduct.KEY_PROPERTY, captionProperty = MProduct.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	@Column(name = MProduct.KEYCOLUMN_NAME, nullable = false)
	private UUID product_ID;
	
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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(UUID product_ID) {
		this.product_ID = product_ID;
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
