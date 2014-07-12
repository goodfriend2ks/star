package com.viettel.backend.domain;

import java.io.Serializable;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("orgtype")
public enum MOrgType implements Serializable, IValuePair<Integer> {
	DOMAIN(1, true),			// Mien
	REGION(2, true),			// Vung
	DISTRIBUTOR(3, true),		// Nha phan phoi
	BRANCH(4, false),			// Chi nhanh
	DEPARTMENT(5, false);		// Phong ban
	
	private int level;
	private boolean isActive;
	
	private MOrgType(int level, boolean isActive) {
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
