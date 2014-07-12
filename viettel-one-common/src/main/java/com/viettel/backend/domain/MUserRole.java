package com.viettel.backend.domain;

/* 
 * Viettel.One Project Model Classes
 * Generated Feb 18, 2014 1:52:24 PM by Hibernate Tools 3.4.0.CR1 
 */

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.EntityType;
import com.viettel.backend.common.LinkedEO;
import com.viettel.backend.domain.key.MUserRoleKey;

/**
 * UserRole domain object
 */
@Entity(name = MUserRole.TABLE_NAME)
@Table(name = MUserRole.TABLE_NAME)
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false, 
	alwayRootOrg = true, hasOrg = false, hasApp = false)
public class MUserRole extends LinkedEO<MUserRoleKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8539695172968633180L;
	
	@Transient
	public static final String TABLE_NAME = "AD_UserRole";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
//	@Id
//	@Column(name = MUserRole.KEYCOLUMN_NAME, nullable = false)
//	private UUID ad_UserRole_ID;
	
	@EmbeddedId
	private MUserRoleKey key;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = MApp.KEYCOLUMN_NAME, nullable = false)
//    private MApp app;
//    
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = MUser.KEYCOLUMN_NAME, nullable = false)
//    private MUser user;
//    
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = MRole.KEYCOLUMN_NAME, nullable = false)
//    private MRole role;
    
//	@Column(name = MApp.APP_KEYCOLUMN_NAME, nullable = false)
//	private UUID ad_App_ID;
	
	@Index
	@Column(name = MRole.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Role_ID;
	
	@Index
	@Column(name = MUser.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_User_ID;
	
    public MUserRole() {
    	super();
    }

//    public MUserRole(MApp app, MUser user, MRole role) {
//    	this();
//    	
//        this.app = app;
//        this.user = user;
//        this.role = role;
//    }

	public MUserRole(/*UUID ad_App_ID,*/ UUID ad_Role_ID, UUID ad_User_ID) {
		this();
		
		if (key == null)
			key = new MUserRoleKey();
		
//		this.ad_App_ID = ad_App_ID;
		this.ad_User_ID = ad_User_ID;
		this.ad_Role_ID = ad_Role_ID;
	}

//	public UUID getAd_UserRole_ID() {
//		return ad_UserRole_ID;
//	}
//
//	public void setAd_UserRole_ID(UUID ad_UserRole_ID) {
//		this.ad_UserRole_ID = ad_UserRole_ID;
//	}

//	public MApp getApp() {
//		return app;
//	}
//
//	public void setApp(MApp app) {
//		this.app = app;
//	}
//
//	public MUser getUser() {
//        return this.user;
//    }
//
//    public void setUser(MUser user) {
//        this.user = user;
//    }
//
//	public MRole getRole() {
//		return role;
//	}
//
//	public void setRole(MRole role) {
//		this.role = role;
//	}
    
    public MUserRoleKey getKey() {
		return key;
	}

	public void setKey(MUserRoleKey key) {
		this.key = key;
	}
	
//	public UUID getAd_App_ID() {
//		return ad_App_ID;
//	}
//
//	public void setAd_App_ID(UUID ad_App_ID) {
//		this.ad_App_ID = ad_App_ID;
//	}

	public UUID getAd_Role_ID() {
		return ad_Role_ID;
	}

	public void setAd_Role_ID(UUID ad_Role_ID) {
		this.ad_Role_ID = ad_Role_ID;
	}

	public UUID getAd_User_ID() {
		return ad_User_ID;
	}

	public void setAd_User_ID(UUID ad_User_ID) {
		this.ad_User_ID = ad_User_ID;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MUserRoleKey();
		
		key.setID(id);
	}
	
	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MUserRoleKey();
		
		key.setAd_Client_ID(ad_Client_ID);
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
	
	/*public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MUserRole))
	        return false;
	    
	    MUserRole castOther = (MUserRole) other;
	    return ad_UserRole_ID.equals(castOther.ad_UserRole_ID);
	}*/

//	public int hashCode() {
//	    final int prime = 31;
//	    int hash = 17;
//	    hash = hash * prime + this.ad_UserRole_ID.hashCode();
//	    
//	    return hash;
//	}
//
//	@Override
//	public String toString() {
//		return "MUserRole [ad_UserRole_ID=" + ad_UserRole_ID + "]";
//	}
}
