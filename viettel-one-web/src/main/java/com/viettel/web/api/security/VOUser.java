package com.viettel.web.api.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;

import com.viettel.backend.domain.MLanguage;
import com.viettel.backend.domain.MUser;
import com.viettel.dto.BaseDto;

/**
 * Store details of an user who logged in to system
 * @author ThanhNV60
 */
public class VOUser extends org.springframework.security.core.userdetails.User 
        implements Serializable {

	private static final long serialVersionUID = 5425846097955142565L;

	private String email;
	private String fullName;
	private Date dob;
	private UUID user_ID;
	private UUID tenant_ID;
	private UUID org_ID;
	private UUID app_ID;
	
	private UUID language_ID;
	private String languageCode;
	private String languageFullCode;
	private String datePattern;
	private String dateTimePattern;
	private String timePattern;
	private String decimalPoint;
	
    public VOUser(MUser user, MLanguage language, UUID app_ID,
    		Collection<? extends GrantedAuthority> authorities) {
    	
    	super(user.getUserName(), user.getPassword(), user.isActive(), 
    			user.isAccountNonExpired(), user.isCredentialsNonExpired(), 
    			user.isAccountNonLocked(), authorities);
    	
    	this.tenant_ID = user.getTenant_ID();
    	this.org_ID = user.getOrg_ID();
    	this.user_ID = user.getId();
    	this.fullName = user.getName();
    	this.email = user.getEmail();
    	this.dob = user.getDob();
    	this.app_ID = app_ID;
    	
    	if (language != null) {
    		language_ID = language.getId();
    		languageFullCode = language.getCode();
    		languageCode = languageFullCode;
    		datePattern = language.getDatePattern();
    		dateTimePattern = language.getDateTimePattern();
    		timePattern = language.getTimePattern();
    		decimalPoint = BaseDto.fromBoolean(language.isDecimalPoint());
    		
    		if (languageCode.indexOf("-") > 0) {
    			languageCode = languageCode.substring(0, languageCode.indexOf("-"));
    		}
    	}
    }

	public String getEmail() {
		return email;
	}

	public String getFullName() {
		return fullName;
	}

	public Date getDob() {
		return dob;
	}

	public UUID getUser_ID() {
		return user_ID;
	}

	public UUID getTenant_ID() {
		return tenant_ID;
	}

	public UUID getOrg_ID() {
		return org_ID;
	}

	public UUID getApp_ID() {
		return app_ID;
	}

	public UUID getLanguage_ID() {
		return language_ID;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public String getLanguageFullCode() {
		return languageFullCode;
	}

	public String getDatePattern() {
		return datePattern;
	}

	public String getDateTimePattern() {
		return dateTimePattern;
	}

	public String getTimePattern() {
		return timePattern;
	}

	public String getDecimalPoint() {
		return decimalPoint;
	}
	
	public LinkedHashMap<String, Object> getInfo() {
		LinkedHashMap<String, Object> userInfo = new LinkedHashMap<>();
		userInfo.put("user_name", getUsername());
		userInfo.put("full_name", getFullName());
		userInfo.put("email", getEmail());
		userInfo.put("tenant_id", getTenant_ID());
		userInfo.put("org_id", getOrg_ID());
		userInfo.put("app_id", getApp_ID());
		userInfo.put("user_id", getUser_ID());
		userInfo.put("lang_id", getLanguage_ID());
		userInfo.put("lang_code", getLanguageCode());
		userInfo.put("lang_code_full", getLanguageFullCode());
		userInfo.put("date_pattern", getDatePattern());
		userInfo.put("datetime_pattern", getDateTimePattern());
		userInfo.put("time_pattern", getTimePattern());
		userInfo.put("decimal_point", getDecimalPoint());
		
		return userInfo;
	}
}
