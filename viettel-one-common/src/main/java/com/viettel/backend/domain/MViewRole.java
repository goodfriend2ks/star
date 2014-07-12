package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.EntityType;
import com.viettel.backend.common.LinkedEO;
import com.viettel.backend.domain.key.MViewRoleKey;

@Entity(name = MViewRole.TABLE_NAME)
@Table(name = MViewRole.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_View_ID"), 
//		@Index(name = "ad_Role_ID")})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootClient = true, alwayRootOrg = true, hasOrg = false, hasApp = false)
public class MViewRole extends LinkedEO<MViewRoleKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -161463594191444345L;
	
	@Transient
	public static final String TABLE_NAME = "AD_ViewRole";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MViewRoleKey key;
	
	@Index
	@Column(name = MView.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_View_ID;
	
	@Index
	@Column(name = MRole.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Role_ID;
	
	public MViewRole() {
		super();
	}
	
	public MViewRoleKey getKey() {
		return key;
	}

	public void setKey(MViewRoleKey key) {
		this.key = key;
	}

	public UUID getAd_View_ID() {
		return ad_View_ID;
	}

	public void setAd_View_ID(UUID ad_View_ID) {
		this.ad_View_ID = ad_View_ID;
	}

	public UUID getAd_Role_ID() {
		return ad_Role_ID;
	}

	public void setAd_Role_ID(UUID ad_Role_ID) {
		this.ad_Role_ID = ad_Role_ID;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MViewRoleKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return ad_View_Role_ID;
//	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MViewRoleKey();
		
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
}