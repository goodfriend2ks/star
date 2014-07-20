package com.viettel.web.api.util;

import com.viettel.util.StringUtils;

public class URLUtil {

	public static String getThemeURL(String shortUrl) {
		shortUrl = StringUtils.stringRemoveStart(shortUrl, "/");
		
		return "VAADIN/themes/dashboard/" + shortUrl; 
	}
	
}
