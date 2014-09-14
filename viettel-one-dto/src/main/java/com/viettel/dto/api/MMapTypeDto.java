package com.viettel.dto.api;

import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.api.MMapType;
import com.viettel.dto.BaseDto;
import com.viettel.util.StringUtils;

public class MMapTypeDto extends BaseDto<MMapType, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4498761197566263770L;

	private String code;
	
	private String name;
	
	private List<MMapDetailDto> details;
	
	public MMapTypeDto() {
		super();
	}

	public MMapTypeDto(MMapType eo, MOrg org) {
		super(eo, org);
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

	public List<MMapDetailDto> getDetails() {
		return details;
	}

	public void setDetails(List<MMapDetailDto> details) {
		this.details = details;
	}

	@Override
	public void fromBean(MMapType bean) {
		if (bean == null)
			return;
		
		this.code = bean.getCode();
		this.name = bean.getName();
	}

	@Override
	public void toBean(MMapType bean, boolean isNew) throws Exception {
		if (bean == null)
			return;
		
		if (!StringUtils.isEmpty(getStatus()))
			bean.setActive(toBoolean(this.getStatus(), true));
		
		if (!StringUtils.isEmpty(this.code))
			bean.setCode(this.code);
		
		if (!StringUtils.isEmpty(this.name))
			bean.setName(this.name);
	}
}
