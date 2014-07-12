package com.viettel.backend.domain;

/* 
 * Viettel.One Project Model Classes
 * Generated Mar 7, 2014 2:44:46 PM by Hibernate Tools 3.4.0.CR1 
 */

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.domain.key.MPopupKey;

/**
 * Popup domain object
 */
@Entity(name = MPopup.TABLE_NAME)
@Table(name = MPopup.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "name")
//})
@Description("With MPopup, AD_Client_ID always is root, see MApp")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootClient = true, alwayRootOrg = true)
@Caption("popup")
public class MPopup extends BaseEO<MPopupKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8462829566283264062L;
	
	@Transient
	public static final String TABLE_NAME = "AD_Popup";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
		
	@EmbeddedId
	private MPopupKey key;
	
	@Index
	@Column(name = "Name", nullable = false, length = 255)
	private String name;
	
	@Column(name = "PopupClass", nullable = false, length = 255)
	private String popupClass;
	
	@Column(name = "Fragment", nullable = false, length = 100)
	private String fragment;
	
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "popups")
//	private List<MView> views;

	public MPopup() {
		super();
	}

	public MPopup(String name, String popupClass, boolean active, String fragment) {
		this();
		
		this.name = name;
		this.popupClass = popupClass;
		this.fragment = fragment;
		
		this.setActive(active);
	}

//	public MPopup(String name, String popupClass, boolean active, String fragment, List<MView> views) {
//		this();
//		
//		this.name = name;
//		this.popupClass = popupClass;
//		this.fragment = fragment;
//		this.views = views;
//		
//		this.setActive(active);
//	}
	
//	public UUID getAd_Popup_ID() {
//		return ad_Popup_ID;
//	}
//
//	public void setAd_Popup_ID(UUID ad_Popup_ID) {
//		this.ad_Popup_ID = ad_Popup_ID;
//	}
	
	public MPopupKey getKey() {
		return key;
	}

	public void setKey(MPopupKey key) {
		this.key = key;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopupClass() {
		return this.popupClass;
	}

	public void setPopupClass(String popupClass) {
		this.popupClass = popupClass;
	}
	
	public String getFragment() {
		return this.fragment;
	}

	public void setFragment(String fragment) {
		this.fragment = fragment;
	}

//	public List<MView> getViews() {
//		return this.views;
//	}
//
//	public void setViews(List<MView> views) {
//		this.views = views;
//	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MPopupKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_Popup_ID;
//	}
	
	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MPopupKey();
		
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
		this.setAd_Client_ID(ROOT_ID_VALUE);
		this.setAd_Org_ID(ROOT_ID_VALUE);
		return super.beforeSave(isNew);
	}
	/*public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MPopup))
	        return false;
	    
	    MPopup castOther = (MPopup) other;
	    return ad_Popup_ID.equals(castOther.ad_Popup_ID);
	}*/

//	public int hashCode() {
//	    final int prime = 31;
//	    int hash = 17;
//	    hash = hash * prime + this.ad_Popup_ID.hashCode();
//	    
//	    return hash;
//	}
//
//	@Override
//	public String toString() {
//		return "MPopup [ad_Popup_ID=" + ad_Popup_ID + ", name=" + name + "]";
//	}
}
