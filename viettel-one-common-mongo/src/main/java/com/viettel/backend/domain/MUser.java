package com.viettel.backend.domain;

/* 
 * Viettel.One Project Model Classes
 * Generated Feb 18, 2014 1:52:24 PM by Hibernate Tools 3.4.0.CR1 
 */

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.joda.time.DateTime;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.Password;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;

/**
 * User domain object
 */
@Entity(name = MUser.TABLE_NAME)
@Table(name = MUser.TABLE_NAME)
@Description("With MUser, AD_App_ID always is root, linked App with MUserRole, see MRole")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
	alwayRootOrg = true, alwayRootApp = true)
@Caption("user")
public class MUser extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4149073077917488670L;
	
	@Transient
	public static final String TABLE_NAME = "AD_User";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@Transient
	public static final String DEFAULT_PASSWORD = "123456a@";
	@Transient
	public static final int DEFAULT_TOKEN_EXPIRY_TIME_IN_MINS = 60 * 24; //24 hours
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
    private String name;
	
	@Index
	@Column(name = "UserName", nullable = false, length = EO.CODE_NORMAL_LENGTH)
    private String userName;
	
	@Column(name = "Password", nullable = false, length = 120)
	@Password(allowReset = true, defaultValue = DEFAULT_PASSWORD)
    private String password;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DOB", nullable = false)
    private Date dob;
    
	@Column(name = "BirthPlace", nullable = false, length = EO.ADDRESS_LENGTH)
    private String birthPlace;
	
	@Index
	@Column(name = "Email", nullable = false, length = EO.URL_LENGTH)
    private String email;
    
	@Index
	/*@Column(name = MLanguage.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MLanguage.class, pkClazz = UUID.class, 
			idProperty = MLanguageKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = true)*/
    private UUID c_Language_ID;
	
	@Column(name = "IsAccountNonExpired")
	@Description("Account Non Expired")
	private boolean isAccountNonExpired; 
	
	@Column(name = "IsCredentialsNonExpired")
	@Description("Credentials Non Expired")
	private boolean isCredentialsNonExpired;
	
	@Column(name = "IsAccountNonLocked")
	@Description("Account Non Locked")
	private boolean isAccountNonLocked;
	
	@Index
	@Column(name = "IsLocked")
	@Description("Locked Status if not isAccountNonLocked")
	private boolean isLocked;
	
	@Index
	@Column(name = "LoginFail")
	private int loginFail;
	
	@Index
	@Column(name = "SignKey", length = EO.NAME_LONG_LENGTH)
	private String signKey;
	
	@Index
	@Column(name = "VerificationToken")
	private String verificationToken;
	
	@Index
	@Column(name = "TokenExpiryDate")
	@Temporal(TemporalType.TIMESTAMP)
    private Date tokenExpiryDate;
	
	@Index
	@Enumerated
	@Column(name = "TokenType")
    private MUserTokenType tokenType;

	@Index
	@Column(name = "IsVerifiedToken")
    private boolean isVerifiedToken;
    
    public MUser() {
    	super();
    }

    public MUser(String name, String userName, String password, Date dob, String email) {
    	this();
    	
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.dob = dob;
        this.email = email;
    }
    
    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
        return this.name;
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

	public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return this.email;
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

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public int getLoginFail() {
		return loginFail;
	}

	public void setLoginFail(int loginFail) {
		this.loginFail = loginFail;
	}

	public String getSignKey() {
		return signKey;
	}

	public void setSignKey(String signKey) {
		this.signKey = signKey;
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

	public String getVerificationToken() {
		return verificationToken;
	}

	public void setVerificationToken(String verificationToken) {
		this.verificationToken = verificationToken;
	}

	public Date getTokenExpiryDate() {
		return tokenExpiryDate;
	}

	public void setTokenExpiryDate(Date tokenExpiryDate) {
		this.tokenExpiryDate = tokenExpiryDate;
	}

	public MUserTokenType getTokenType() {
		return tokenType;
	}

	public void setTokenType(MUserTokenType tokenType) {
		this.tokenType = tokenType;
	}

	public boolean isVerifiedToken() {
		return isVerifiedToken;
	}

	public void setVerifiedToken(boolean isVerifiedToken) {
		this.isVerifiedToken = isVerifiedToken;
	}
	
	@Override
	@Transient
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	@Transient
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}

	@Override
	@Transient
	public String getDisplay() {
		return name;
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
		this.name = display;
	}
	
	@Override
	public boolean beforeSave(boolean isNew) {
		this.setApp_ID(ROOT_ID_VALUE);
		
		return super.beforeSave(isNew);
	}
	
	@Transient
	public String setRandomToken(MUserTokenType tokenType, int expiryTimeInMinutes) {
		if (expiryTimeInMinutes <= 0)
			expiryTimeInMinutes = DEFAULT_TOKEN_EXPIRY_TIME_IN_MINS;
		
		this.verificationToken = UUID.randomUUID().toString();
		this.tokenType = tokenType;
		this.isVerifiedToken = false;
		setExpiryTimeInMinutes(expiryTimeInMinutes);
		
		return this.verificationToken;
	}
	
	@Transient
	public void setExpiryTimeInMinutes(int expiryTimeInMinutes) {
        DateTime now = new DateTime();
        setTokenExpiryDate(now.plusMinutes(expiryTimeInMinutes).toDate());
    }
	
	public boolean hasExpiredToken() {
		Date expiryDate = getTokenExpiryDate();
		if (expiryDate == null)
			return false;
		
        DateTime tokenDate = new DateTime(expiryDate);
        return tokenDate.isBeforeNow();
    }
	
	/*public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MUser))
	        return false;
	    
	    MUser castOther = (MUser) other;
	    return ad_User_ID.equals(castOther.ad_User_ID);
	}*/
	
//	public int hashCode() {
//	    final int prime = 31;
//	    int hash = 17;
//	    hash = hash * prime + this.ad_User_ID.hashCode();
//	    
//	    return hash;
//	}
//
//	@Override
//	public String toString() {
//		return "MUser [ad_User_ID=" + ad_User_ID + ", name=" + name
//				+ ", userName=" + userName + "]";
//	}
}
