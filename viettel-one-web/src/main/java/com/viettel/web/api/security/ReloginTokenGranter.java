package com.viettel.web.api.security;

import java.util.Map;

import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.AbstractTokenGranter;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;

public class ReloginTokenGranter extends AbstractTokenGranter {
	private static final String GRANT_TYPE = "relogin_token";
	
	private final AuthenticationManager authenticationManager;
	
	public ReloginTokenGranter(AuthenticationManager authenticationManager, 
			AuthorizationServerTokenServices tokenServices, ClientDetailsService clientDetailsService) {
		super(tokenServices, clientDetailsService, GRANT_TYPE);
		
		this.authenticationManager = authenticationManager;
	}
	
	@Override
	protected OAuth2AccessToken getAccessToken(AuthorizationRequest authorizationRequest) {
		Map<String, String> parameters = authorizationRequest.getAuthorizationParameters();
		String refreshToken = parameters.get("refresh_token");
		String username = parameters.get("username");
		String password = parameters.get("password");
		
		Authentication userAuth = new UsernamePasswordAuthenticationToken(username, password);
		try {
			userAuth = authenticationManager.authenticate(userAuth);
		}
		catch (AccountStatusException ase) {
			//covers expired, locked, disabled cases (mentioned in section 5.2, draft 31)
			throw new InvalidGrantException(ase.getMessage());
		}
		catch (BadCredentialsException e) {
			// If the username/password are wrong the spec says we should send 400/bad grant
			throw new InvalidGrantException(e.getMessage());
		}
		if (userAuth == null || !userAuth.isAuthenticated()) {
			throw new InvalidGrantException("Could not authenticate user: " + username);
		}
		
		return getTokenServices().refreshAccessToken(refreshToken, authorizationRequest);
	}
}
