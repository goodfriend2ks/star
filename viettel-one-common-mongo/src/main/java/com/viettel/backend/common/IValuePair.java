package com.viettel.backend.common;

import java.io.Serializable;

public interface IValuePair<T extends Serializable> extends Serializable {
	public T getId();
	
	public void setId(T id);
	
	public String getDisplay();
	
	public void setDisplay(String display);
	
	public boolean isActive();
}
