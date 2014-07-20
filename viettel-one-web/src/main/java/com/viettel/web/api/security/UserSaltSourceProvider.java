package com.viettel.web.api.security;

import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.userdetails.UserDetails;

public class UserSaltSourceProvider implements SaltSource {

	@Override
	public Object getSalt(UserDetails user) {
		return user.getUsername();
	}
}
