package com.viettel.api.util;

import java.text.Normalizer;

import org.apache.commons.beanutils.PropertyUtils;

public class TextUtils {
	
	public static boolean filterByProperty(String propertyName,
			Object item, String text) {
		String str = null;
		try {
			if(text == null || text.trim().length() == 0){
				return true;
			}
			str = Normalizer.normalize(text, Normalizer.Form.NFD)
            		.toLowerCase().replaceAll("\u0111", "d")
                    .replaceAll("\\P{InBasic_Latin}", "");
			String value = PropertyUtils.getProperty(item, propertyName).toString();
            return Normalizer.normalize(value,
                    Normalizer.Form.NFD)
                    .toLowerCase().replaceAll("\u0111", "d")
                    .replaceAll("\\P{InBasic_Latin}", "")
                    .contains(str);
		} catch (Exception e) {
		}
		return false;
	}

}
