package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.LinkedEO;
import com.viettel.backend.domain.key.MViewPopupKey;

@Entity(name = MViewPopup.TABLE_NAME)
@Table(name = MViewPopup.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_View_ID"), 
//		@Index(name = "ad_Popup_ID"),
//		@Index(name = "ad_App_ID")})
@Description("With MViewPopup, AD_Client_ID always is root, see MView, MPopup")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootClient = true, alwayRootOrg = true, hasOrg = false)
public class MViewPopup extends LinkedEO<MViewPopupKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 764566083737298703L;

	@Transient
	public static final String TABLE_NAME = "AD_ViewPopup";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MViewPopupKey key;
	
	@Index
	@Column(name = MView.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_View_ID;
	
	@Index
	@Column(name = MPopup.KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Popup_ID;
	
	@Index
	@Column(name = APP_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_App_ID;
	
	public MViewPopup() {
		super();
	}

	public MViewPopupKey getKey() {
		return key;
	}

	public void setKey(MViewPopupKey key) {
		this.key = key;
	}

	public UUID getAd_View_ID() {
		return ad_View_ID;
	}

	public void setAd_View_ID(UUID ad_View_ID) {
		this.ad_View_ID = ad_View_ID;
	}

	public UUID getAd_Popup_ID() {
		return ad_Popup_ID;
	}

	public void setAd_Popup_ID(UUID ad_Popup_ID) {
		this.ad_Popup_ID = ad_Popup_ID;
	}
	
	@Override
	public UUID getAd_App_ID() {
		return ad_App_ID;
	}

	@Override
	public void setAd_App_ID(UUID ad_App_ID) {
		this.ad_App_ID = ad_App_ID;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MViewPopupKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MViewPopupKey();
		
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
	
	@Override
	public boolean beforeSave(boolean isNew) {
		this.setAd_Client_ID(ROOT_ID_VALUE);
		return super.beforeSave(isNew);
	}
}