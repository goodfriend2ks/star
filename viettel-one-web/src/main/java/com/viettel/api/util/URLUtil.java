package com.viettel.api.util;

public class URLUtil {

	public static String getThemeURL(String shortUrl) {
		shortUrl = Utils.stringRemoveStart(shortUrl, "/");
		
		return "VAADIN/themes/dashboard/" + shortUrl; 
	}
	
}
