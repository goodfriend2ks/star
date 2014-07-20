package com.viettel.util;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

public class StringUtils {
	private final static int MAX_LENGTH = 100; 
	
	/**
	 * Check whether the given String is empty.
	 * <p>This method accepts any Object as an argument, comparing it to
	 * {@code null} and the empty String. As a consequence, this method
	 * will never return {@code true} for a non-null non-String object.
	 * <p>The Object signature is useful for general attribute handling code
	 * that commonly deals with Strings but generally has to iterate over
	 * Objects since attributes may e.g. be primitive value objects as well.
	 * @param str the candidate String
	 * @since 3.2.1
	 */
	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}
	
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

	/**
     * Returns a new string that is a substring of the <code>target</code> string.
     * <p>
     * Examples:
     * <blockquote><pre>
     * Utils.stringRemoveStart("AD_Client","AD_") returns "Client"
     * Utils.stringRemoveStart("/detail","/") returns "detail"
     * </pre></blockquote>
     *
     * @param      target   the target string
     * @param      prefixToRemove     the prefix to be removed from start.
     * @return     the specified substring.
     */
	public static String stringRemoveStart(String target, String prefixToRemove) {
		if (target != null && prefixToRemove!= null && target.startsWith(prefixToRemove)) {
			target = target.substring(prefixToRemove.length());
		}
		return target;
	}
	
	/**
     * Returns a new string that is a substring of the <code>target</code> string.
     * <p>
     * Examples:
     * <blockquote><pre>
     * Utils.stringRemoveEnd("AD_Client_ID","_ID") returns "AD_Client"
     * Utils.stringRemoveEnd("detail/","/") returns "detail"
     * </pre></blockquote>
     *
     * @param      target   the target string
     * @param      prefixToRemove     the prefix to be removed from end.
     * @return     the specified substring.
     */
	public static String stringRemoveEnd(String target, String suffixToRemove) {
		if (target != null && target.endsWith(suffixToRemove)) {
			target = target.substring(0, target.length() - suffixToRemove.length());
		}
		return target;
	}
	
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