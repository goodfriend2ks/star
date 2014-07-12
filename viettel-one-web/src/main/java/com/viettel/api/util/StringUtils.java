package com.viettel.api.util;

import java.util.HashMap;
import java.util.Map;

/**
 * vuongbd
 * 26/03/2014
 * Su dung lai cua thanhnv60
 */

public class StringUtils {
	private final static int MAX_LENGTH = 100; 
	
	public static Map<String, String> setParams(String allParams) {
		Map<String, String> paramMap = new HashMap<String, String>();
		if (allParams.startsWith("/")) {
			allParams = allParams.substring(1);
		}

		if (allParams.startsWith("?")) {
			allParams = allParams.substring(1);
		}

		String[] params = allParams.split("\\?");
		for (String param : params) {
			if (param.contains("=")) {
				String[] values = param.split("=");

				if (values.length > 1) {
					paramMap.put(values[0].toUpperCase(),
							values[1] == null ? "" : values[1]);
				} else {
					paramMap.put(values[0].toUpperCase(), null);
				}
			}
		}
		return paramMap;
	}
	
	public static String getSortString(String value, int maxLength){
		String val = value;
		if (value != null && value.length() > maxLength) {
			val = value.substring(0, maxLength) + " ...";
		}
		return val;
	}
	
	public static String getSortString(String value){
		return getSortString(value, MAX_LENGTH);
	}
	
}
