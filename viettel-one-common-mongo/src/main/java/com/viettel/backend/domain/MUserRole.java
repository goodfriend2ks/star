package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.EntityType;
import com.viettel.backend.common.LinkedEO;

/**
 * UserRole domain object
 */
@Entity(name = MUserRole.TABLE_NAME)
@Table(name = MUserRole.TABLE_NAME)
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, 
	alwayRootOrg = true, hasOrg = false, hasApp = false)
public class MUserRole extends LinkedEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8539695172968633180L;
	
	@Transient
	public static final String TABLE_NAME = "AD_UserRole";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String USER_ID_PROPERTY = "user_ID";
	@Transient
	public static final String ROLE_ID_PROPERTY = "role_ID";
	
	@Id
	private UUID id;
	
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
	private UUID role_ID;
	
	@Index
	@Column(name = MUser.KEYCOLUMN_NAME, nullable = false)
	private UUID user_ID;
	
    public MUserRole() {
    	super();
    }

	public MUserRole(/*UUID ad_App_ID,*/ UUID role_ID, UUID user_ID) {
		this();
		
		this.user_ID = user_ID;
		this.role_ID = role_ID;
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
    
	@Override
    public UUID getId() {
		return id;
	}

	@Override
	public void setId(UUID id) {
		this.id = id;
	}
	
//	public UUID getAd_App_ID() {
//		return ad_App_ID;
//	}
//
//	public void setAd_App_ID(UUID ad_App_ID) {
//		this.ad_App_ID = ad_App_ID;
//	}

	public UUID getRole_ID() {
		return role_ID;
	}

	public void setRole_ID(UUID role_ID) {
		this.role_ID = role_ID;
	}

	public UUID getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(UUID user_ID) {
		this.user_ID = user_ID;
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
