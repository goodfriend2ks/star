package com.viettel.api.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;

import com.viettel.backend.domain.MUser;

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
	private UUID ad_User_ID;
	private UUID ad_Client_ID;
	private UUID ad_Org_ID;
	
    public VOUser(MUser user, Collection<? extends GrantedAuthority> authorities) {
    	super(user.getUserName(), user.getPassword(), user.isActive(), 
    			user.isAccountNonExpired(), user.isCredentialsNonExpired(), 
    			user.isAccountNonLocked(), authorities);
    	
    	this.ad_Client_ID = user.getAd_Client_ID();
    	this.ad_Org_ID = user.getAd_Org_ID();
    	this.ad_User_ID = user.getID();
    	this.fullName = user.getName();
    	this.email = user.getEmail();
    	this.dob = user.getDob();
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

	public UUID getAd_Client_ID() {
		return ad_Client_ID;
	}

	public UUID getAd_Org_ID() {
		return ad_Org_ID;
	}

	public UUID getAd_User_ID() {
		return ad_User_ID;
	}
}
