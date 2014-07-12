package com.viettel.backend.common;

import java.io.Serializable;

import com.viettel.backend.common.IValuePair;

public class ValuePair<T extends Serializable> implements Comparable<ValuePair<T>>, IValuePair<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1644207545259974955L;
	
	private T id;
	private String value;
	private boolean isActive;
	
	public ValuePair(T id, String value) {
		super();
		this.id = id;
		this.value = value;
		this.isActive = true;
	}
	
	public ValuePair(IValuePair<T> value) {
		this(value.getId(), value.getDisplay());
		this.isActive = value.isActive();
	}
	
	@Override
	public T getId() {
		return this.id;
	}
	
	@Override
	public void setId(T id) {
		this.id = id;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String getDisplay() {
		return this.value;
	}

	@Override
	public void setDisplay(String display) {
		this.value = display;
	}

	@Override
	public String toString()
	{
		return value;
	}

	@Override
	public int compareTo(ValuePair<T> pair) {
		if (pair == null)
			return 1;
		
		return getValue().compareToIgnoreCase(pair.getValue());
	}

	@Override
	public boolean isActive() {
		return isActive;
	}
}
