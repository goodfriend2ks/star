package com.viettel.backend.domain;

import java.io.Serializable;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("tokentype")
public enum MUserTokenType implements Serializable, IValuePair<Integer> {
    LOST_PASSWORD (true), 
    EMAIL_VERIFICATION (true), 
    EMAIL_REGISTRATION (true);
    
    private boolean isActive;
    
    private MUserTokenType(boolean isActive) {
		this.isActive = isActive;
	}
    
    public boolean isActive() {
		return isActive;
	}

	@Override
	public Integer getId() {
		return ordinal();
	}

	@Override
	public void setId(Integer id) {
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
