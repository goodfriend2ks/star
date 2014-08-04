package com.viettel.dto;

import java.util.UUID;

import com.viettel.backend.domain.MLanguage;
import com.viettel.backend.domain.MOrg;
import com.viettel.util.StringUtils;

public class MLanguageDto extends BaseDto<MLanguage, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8005606946391904029L;

	private String code;
	
	private String name;
	
	private String datePattern;
	
	private String timePattern;
	
	private String decimalPoint;

	public MLanguageDto() {
		super();
	}

	public MLanguageDto(MLanguage eo, MOrg org) {
		super(eo, org);
	}

	@Override
	public void fromBean(MLanguage bean) {
		if (bean == null)
			return;
		
		this.code = bean.getCode();
		this.name = bean.getName();
		this.datePattern = bean.getDatePattern();
		this.timePattern = bean.getTimePattern();
		this.decimalPoint = fromBoolean(bean.isDecimalPoint());
	}

	@Override
	public void toBean(MLanguage bean, boolean isNew) throws Exception {
		if (!StringUtils.isEmpty(getStatus()))
			bean.setActive(toBoolean(this.getStatus(), true));
		
		if (!StringUtils.isEmpty(this.code))
			bean.setCode(this.code);
		
		if (!StringUtils.isEmpty(this.name))
			bean.setName(this.name);
		
		if (!StringUtils.isEmpty(this.datePattern))
			bean.setDatePattern(this.datePattern);
		
		if (!StringUtils.isEmpty(this.timePattern))
			bean.setTimePattern(this.timePattern);
		
		if (isNew || !StringUtils.isEmpty(this.decimalPoint))
			bean.setDecimalPoint(toBoolean(this.decimalPoint, false));
		
		bean.setDateTimePattern(bean.getDatePattern() + " " + bean.getTimePattern());
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

	public String getDatePattern() {
		return datePattern;
	}

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

	public String getTimePattern() {
		return timePattern;
	}

	public void setTimePattern(String timePattern) {
		this.timePattern = timePattern;
	}

	public String getDecimalPoint() {
		return decimalPoint;
	}

	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
	}
}
