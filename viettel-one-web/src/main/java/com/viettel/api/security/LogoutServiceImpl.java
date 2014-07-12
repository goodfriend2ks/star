package com.viettel.api.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.InMemoryTokenStore;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

public class LogoutServiceImpl implements LogoutSuccessHandler  {
	InMemoryTokenStore  tokenstore;
	
	public InMemoryTokenStore getTokenstore() {
		return tokenstore;
	}

	public void setTokenstore(InMemoryTokenStore tokenstore) {
		this.tokenstore = tokenstore;
	}
	
	public void removeaccess(HttpServletRequest req){
		String tokens=req.getHeader("Authorization");
		System.out.println(tokens);
		String value=tokens.substring(tokens.indexOf(" ")).trim(); 
		DefaultOAuth2AccessToken token= new DefaultOAuth2AccessToken(value);
		System.out.println(token);
		//System.out.println(tokenstore.readAccessToken(value).toString());
		
		tokenstore.removeAccessToken(value);
		System.out.println("\n\tAccess Token Removed Successfully!!!!!!!!");
		
	}

	public void onLogoutSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication auth) throws IOException,
			ServletException {
		removeaccess(request);
		response.getOutputStream().write("\n\tYou Have Logged Out successfully.".getBytes());
	}
}
