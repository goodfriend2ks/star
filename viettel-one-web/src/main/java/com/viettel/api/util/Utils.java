package com.viettel.api.util;

public class Utils {
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
}
