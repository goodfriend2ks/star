package com.viettel.api.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.service.AppService;
import com.viettel.backend.service.RoleService;
import com.viettel.backend.service.UserService;

public class UserAuthenticationService implements UserDetailsService, Serializable {

    private static final long serialVersionUID = 9023800905639036547L;

    @Autowired
    private UserService userService;
    
    @Autowired
    private RoleService roleService;

    @Autowired
    private AppService appService;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	MUser user = userService.getByUserName(userName);
    	
    	if (user != null) {
    		/*user.setAccountNonExpired(true);
    		user.setAccountNonLocked(true);
    		user.setLocked(false);
    		user.setCredentialsNonExpired(true);
    		user.setLoginFail(0);
    		user.setSignKey(UUID.randomUUID().toString());
    		user.setVerificationToken(UUID.randomUUID().toString());
    		user.setTokenExpiryDate(new Date());
    		user.setTokenType(MUserTokenType.EMAIL_REGISTRATION);
    		user.setVerifiedToken(true);
    		userService.save(user, true);*/
    		
        	MApp currentApp = appService.getCurrentApp();
        	if (currentApp != null)
        	{
	            List<MRole> accessedRoles = roleService.getAccessedRoles(user.getAd_Client_ID(), user.getID(), currentApp.getID()); 
	            if (accessedRoles == null || accessedRoles.isEmpty()) {
	                throw new BadCredentialsException("No role with username '"
	                        + userName + "' found!");
	            }
	            
	            MRole role = accessedRoles.get(0);
	            
	            List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
	        	
	            roles.add(new SimpleGrantedAuthority(role.getCode()));
	            roles.add(new SimpleGrantedAuthority("ROLE_LOGGEDIN"));
	
	            User securityUser = new VOUser(user, roles);
	
	            return securityUser;
        	} else {
        		throw new UsernameNotFoundException("Current application isn't defined!");
        	}
        } else {
            throw new UsernameNotFoundException("No user with username '" + userName + "' found!");
        }
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
