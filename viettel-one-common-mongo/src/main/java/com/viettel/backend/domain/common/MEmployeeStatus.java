package com.viettel.backend.domain.common;

import java.io.Serializable;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("employeestatus")
public enum MEmployeeStatus implements Serializable, IValuePair<Integer>  {
	PROBATIONARY(true),		// Tap su
	COLLABORATORS(true),	// Cong tac vien
	OFFICIAL_STAFF(true);	// Nhan vien chinh thuc
	
	private boolean isActive;
	
	private MEmployeeStatus(boolean isActive) {
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
