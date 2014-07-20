package com.viettel.web.api.converter;

import java.util.Date;

import org.apache.commons.beanutils.ConvertUtilsBean2;
import org.apache.commons.beanutils.Converter;

public class ConvertUtilsBean extends ConvertUtilsBean2 {
	private static final DateConverter DATE_CONVERTER = new DateConverter();

	@Override
	public Converter lookup(Class<?> clazz) {
		if (Date.class.isAssignableFrom(clazz))
			return DATE_CONVERTER;
		
		return super.lookup(clazz);
	}
}
