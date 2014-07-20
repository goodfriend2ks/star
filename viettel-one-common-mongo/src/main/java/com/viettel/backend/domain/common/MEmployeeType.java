package com.viettel.backend.domain.common;

import java.io.Serializable;

import com.viettel.annotation.Caption;
import com.viettel.backend.common.IValuePair;

@Caption("employeetype")
public enum MEmployeeType implements Serializable, IValuePair<Integer>  {
	RSM(1, true), 	// - Giam doc mien
	ASM(2, true), 	// - Truong ban hang vung
	SSU(3, true),	// - Giam sat
	DAA(4, true),	// - Ke toan
	DES(5, true), 	// - Nhan vien giao hang
	CMS(6, true),	// - Nhan vien thu tien
	SMP(7, true), 	// - Nhan vien Vansale
	SMV(8, true)	// - Nhan vien Ban hang
	;

	private int level;
	private boolean isActive;
	
	private MEmployeeType(int level, boolean isActive) {
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
