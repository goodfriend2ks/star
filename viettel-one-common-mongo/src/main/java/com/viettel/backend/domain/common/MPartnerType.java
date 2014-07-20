package com.viettel.backend.domain.common;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("partnertype")
public enum MPartnerType implements IValuePair<Integer> {
	VENDOR(1, true),			// Nha cung cap
	CUSTOMER(2, true),			// Khach hang
	VENDOR_CUSTOMER(3, true);	// Nha cung cap va khach hang
	
	private int level;
	private boolean isActive;
	
	private MPartnerType(int level, boolean isActive) {
		this.level = level;
		this.isActive = isActive;
	}
	
	public int getLevel() {
		return level;
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
