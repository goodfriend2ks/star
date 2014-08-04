package com.viettel.dto.common;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.common.MArea;
import com.viettel.dto.BaseDto;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.StringUtils;

public class MAreaDto extends BaseDto<MArea, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3030017271124190614L;

	private String code;
	
	private String name;
	
	private double longitude;
	
	private double latitude;
	
	private UUID parent_ID;
	
	private String parentCode;
	
	private String parentName;

	public MAreaDto() {
		super();
	}

	public MAreaDto(MArea eo, MOrg org, MArea parent) {
		super(eo, org);
		
		if (parent != null && DataTypeUtil.compare(UUID.class, eo.getParent_ID(), parent.getId()) == 0) {
			this.parentCode = parent.getCode();
			this.parentName = parent.getName();
		}
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
	@JsonIgnore(false)
	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Override
	public void fromBean(MArea bean) {
		if (bean == null)
			return;
		
		this.code = bean.getCode();
		this.name = bean.getName();
		this.parent_ID = bean.getParent_ID();
		this.latitude = bean.getLatitude();
		this.longitude = bean.getLongitude();
	}

	@Override
	public void toBean(MArea bean, boolean isNew) throws Exception {
		if (!StringUtils.isEmpty(getStatus()))
			bean.setActive(toBoolean(this.getStatus(), true));
		
		if (!StringUtils.isEmpty(this.code))
			bean.setCode(this.code);
		
		if (!StringUtils.isEmpty(this.name))
			bean.setName(this.name);
		
		bean.setParent_ID(this.parent_ID);
	}
}
