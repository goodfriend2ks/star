package com.viettel.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.viettel.backend.common.IValuePair;

public class MUserDto extends BaseDto {
	
	private String name;
	
	private String userName;
	
	private Date dob;
	
	private String email;
	
	private UUID c_Language_ID;
	
	private String languageName;
	
	private List<IValuePair<UUID>> languages;
	
	private boolean isAccountNonExpired; 
	
	private boolean isCredentialsNonExpired;
	
	private boolean isAccountNonLocked;

	public MUserDto() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UUID getC_Language_ID() {
		return c_Language_ID;
	}

	public void setC_Language_ID(UUID c_Language_ID) {
		this.c_Language_ID = c_Language_ID;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public List<IValuePair<UUID>> getLanguages() {
		return languages;
	}

	public void setLanguages(List<IValuePair<UUID>> languages) {
		this.languages = languages;
	}

	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}
}
