package com.viettel.backend.domain.common;

import java.io.Serializable;
import java.util.Date;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("attributetype")
public enum MAttributeType implements Serializable, IValuePair<Integer>  {
	
	SINGLE_LINE ("SLI", String.class, false, true),
	MULTI_LINE ("MLI", String.class, false, true),
	SINGLE_CHOICE ("SCH", String.class, false, true),
	MULTI_CHOICE ("MCH", String.class, true, true),
	INTEGER ("INT", Integer.class, false, true),
	NUMBER ("NUM", Double.class, false, true), 
	DATE ("DAT", Date.class, false, true),
	COLOR ("COL", String.class, false, true),
	RICHTEXT ("RTX", String.class, false, true),
	TAG ("TAG", String.class, true, true);
	
	private String code;
	private Class<?> clazz;
	private boolean multi;
	private boolean isActive;
	
	private MAttributeType(String code, Class<?> clazz, boolean multi, boolean isActive) {
		this.code = code;
		this.clazz = clazz;
		this.multi = multi;
		this.isActive = isActive;
	}

	public String getCode() {
		return code;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public boolean isMulti() {
		return multi;
	}

	public boolean isActive() {
		return isActive;
	}

	@Override
	public Integer getID() {
		return ordinal();
	}

	@Override
	public void setID(Integer id) {
	}

	@Override
	public String getDisplay() {
		return toString();
	}

	@Override
	public void setDisplay(String display) {
	}

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
