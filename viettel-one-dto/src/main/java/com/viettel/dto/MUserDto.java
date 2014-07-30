package com.viettel.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.viettel.backend.domain.MLanguage;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MUser;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.StringUtils;

public class MUserDto extends BaseDto<MUser, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4030462599981119893L;

	private String name;
	
	private String userName;
	
	private Date dob;
	
	private String email;
	
	private UUID language_ID;
	
	private String languageName;
	
	/*private List<IValuePair<UUID>> languages;*/
	
	private String accountNonExpired; 
	
	private String credentialsNonExpired;
	
	private String accountNonLocked;

	private String resetPassword;
	
	private List<MLanguageDto> languages;
	
	public MUserDto() {
		super();
		
		this.resetPassword = NO;
	}
	
	public MUserDto(MUser user, MOrg org, MLanguage lang) {
		super(user, org);
		
		this.resetPassword = NO;
		if (lang != null && DataTypeUtil.compare(UUID.class, lang.getId(), user.getLanguage_ID()) == 0) {
			this.languageName = lang.getName(); 
		}
	}

	@Override
	public void fromBean(MUser bean) {
		if (bean == null)
			return;
		
		this.name = bean.getName();
		this.userName = bean.getUserName();
		this.dob = bean.getDob();
		this.email = bean.getEmail();
		this.accountNonExpired = fromBoolean(bean.isAccountNonExpired());
		this.credentialsNonExpired = fromBoolean(bean.isCredentialsNonExpired());
		this.accountNonLocked = fromBoolean(bean.isAccountNonLocked());
		
		this.language_ID = bean.getLanguage_ID();
	}

	@Override
	public void toBean(MUser bean) throws Exception {
		if (bean == null)
			return;
		
		if (!StringUtils.isEmpty(getStatus()))
			bean.setActive(toBoolean(this.getStatus()));
		
		if (!StringUtils.isEmpty(this.name))
			bean.setName(this.name);
		
		if (DataTypeUtil.isEmpty(UUID.class, bean.getId())) {
			if (!StringUtils.isEmpty(this.userName))
				bean.setName(this.userName);
		}
		
		if (this.dob != null)
			bean.setDob(this.dob);
		
		if (!StringUtils.isEmpty(this.email))
			bean.setEmail(this.email);
		
		if (!StringUtils.isEmpty(this.accountNonExpired))
			bean.setAccountNonExpired(toBoolean(this.accountNonExpired));
		
		if (!StringUtils.isEmpty(this.credentialsNonExpired))
			bean.setCredentialsNonExpired(toBoolean(this.credentialsNonExpired));
		
		if (!StringUtils.isEmpty(this.accountNonLocked))
			bean.setAccountNonLocked(toBoolean(this.accountNonLocked));
		
		if (this.language_ID != null)
			bean.setLanguage_ID(this.language_ID);
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

	public UUID getLanguage_ID() {
		return language_ID;
	}

	public void setLanguage_ID(UUID language_ID) {
		this.language_ID = language_ID;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/*public List<IValuePair<UUID>> getLanguages() {
		return languages;
	}

	public void setLanguages(List<IValuePair<UUID>> languages) {
		this.languages = languages;
	}*/

	public String getAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(String accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public String getCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(String credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public String getAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(String accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public String getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
	}

	public List<MLanguageDto> getLanguages() {
		return languages;
	}

	public void setLanguages(List<MLanguageDto> languages) {
		this.languages = languages;
	}
}
