package com.viettel.dto.api;

import java.util.UUID;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.api.MMapDetail;
import com.viettel.dto.BaseDto;
import com.viettel.util.StringUtils;


public class MMapDetailDto extends BaseDto<MMapDetail, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4540498051001211648L;

	/*private String name;*/
	
	private String propertyName;
	
	private String propertyType;
	
	private String inputPropertyName;
	
	private String inputPropertyType;
	
	private String javaCode;

	public MMapDetailDto() {
		super();
	}

	public MMapDetailDto(MMapDetail eo, MOrg org) {
		super(eo, org);
	}
	
	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getInputPropertyName() {
		return inputPropertyName;
	}

	public void setInputPropertyName(String inputPropertyName) {
		this.inputPropertyName = inputPropertyName;
	}

	public String getInputPropertyType() {
		return inputPropertyType;
	}

	public void setInputPropertyType(String inputPropertyType) {
		this.inputPropertyType = inputPropertyType;
	}

	public String getJavaCode() {
		return javaCode;
	}

	public void setJavaCode(String javaCode) {
		this.javaCode = javaCode;
	}

	@Override
	public void fromBean(MMapDetail bean) {
		if (bean == null)
			return;
		
		/*this.name = bean.getName();*/
		this.propertyName = bean.getPropertyName();
		this.propertyType = bean.getPropertyType();
		this.inputPropertyName = bean.getInputPropertyName();
		this.inputPropertyType = bean.getInputPropertyType();
		this.javaCode = bean.getJavaCode();
	}

	@Override
	public void toBean(MMapDetail bean, boolean isNew) throws Exception {
		if (bean == null)
			return;
		
		if (!StringUtils.isEmpty(getStatus()))
			bean.setActive(toBoolean(this.getStatus(), true));
		
		/*if (!StringUtils.isEmpty(this.name))
			bean.setName(this.name);*/
		
		if (!StringUtils.isEmpty(this.propertyName))
			bean.setPropertyName(this.propertyName);
		
		if (!StringUtils.isEmpty(this.propertyType))
			bean.setPropertyType(this.propertyType);
		
		if (!StringUtils.isEmpty(this.inputPropertyName))
			bean.setInputPropertyName(this.inputPropertyName);
		
		if (!StringUtils.isEmpty(this.inputPropertyType))
			bean.setInputPropertyType(this.inputPropertyType);
		
		if (!StringUtils.isEmpty(this.javaCode))
			bean.setJavaCode(this.javaCode);
	}
}
