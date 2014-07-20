package com.viettel.web.api.util;

import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.viettel.web.api.security.VOUser;

public class Env {
	
	public static VOUser getCurrentUser() throws AccountExpiredException {
		Authentication oauth = SecurityContextHolder.getContext().getAuthentication();
		if (oauth == null)
			throw new AccountExpiredException("Account Expired");
		
		Object principal = oauth.getPrincipal();
		if (principal == null || !(principal instanceof VOUser))
			throw new AccountExpiredException("Account Expired");
		
		return (VOUser)principal;
	}
	
	public static String getCurrentUserFullName() {
		try {
			VOUser user = getCurrentUser();
			if (user != null) {
				return user.getFullName();
			}
		} catch (Exception e) {}
		
		return "Anonymous";
	}
}