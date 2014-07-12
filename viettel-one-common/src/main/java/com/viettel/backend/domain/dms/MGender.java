package com.viettel.backend.domain.dms;

import java.io.Serializable;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("gender")
public enum MGender implements Serializable, IValuePair<Integer>  {
	MALE(true),
	FEMALE(true);
	
	private boolean isActive;
	
	private MGender(boolean isActive) {
		this.isActive = isActive;
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
