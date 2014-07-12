package com.viettel.backend.domain;

/* 
 * Viettel.One Project Model Classes
 * Generated Feb 18, 2014 4:00:18 PM by Hibernate Tools 3.4.0.CR1 
 */

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.viettel.annotation.Caption;
import com.viettel.annotation.CommonCaption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.key.MAppKey;
import com.viettel.backend.domain.key.MOrgKey;

/**
 * Application domain object
 */
@Entity(name = MApp.APP_TABLE_NAME)
@Table(name = MApp.APP_TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "code"), 
//		@Index(name = "name")
//})
@Description("With MApp, AD_Client_ID, AD_Org_ID and AD_Org_ID always is root")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootClient = true, alwayRootOrg = true)
@Caption("app")
public class MApp extends EO<MAppKey, UUID> {

	private static final long serialVersionUID = 5629134143348918230L;
	
	@EmbeddedId
	private MAppKey key;
	
	@Index
	@Column(name = "Code", nullable = false, length = 10)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = 255)
    private String name;
    
	@Column(name = "ViewAddress", nullable = false)
    private String viewAddress;
	
	@Column(name = "ServiceAddress", nullable = false)
    private String serviceAddress;
	
	@Column(name = "ImageLink", length = 512)
    private String imageLink;
	
	@Index
	@Column(name = ORG_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MOrg.class, keyClazz = MOrgKey.class, pkClazz = UUID.class,
			idProperty = MOrgKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID ad_Org_ID;

	@Index
	@CommonCaption("active")
	@Column(name = "IsActive")
	private boolean isActive;
	
	@Index
	@CommonCaption("created")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Created")
	private Date created;
	
	@Index
	@CommonCaption("createdBy")
	@Column(name = "CreatedBy")
	private UUID createdBy;
	
	@Index
	@CommonCaption("updated")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Updated")
	private Date updated;
	
	@Index
	@CommonCaption("updatedBy")
	@Column(name = "UpdatedBy")
	private UUID updatedBy;
	
	@Index
	@Version
	@CommonCaption("version")
	@Column (name = "Version")
	private long version;
    
    public MApp() {
    	super();
    }

    public MApp(String name, String code, String viewAddress,
            String serviceAddress) {
    	this();
    	
        this.name = name;
        this.code = code;
        this.viewAddress = viewAddress;
        this.serviceAddress = serviceAddress;
    }

    public MApp(String name, String code, String viewAddress,
            String serviceAddress, String imageLink) {
    	this();
    	
        this.name = name;
        this.code = code;
        this.viewAddress = viewAddress;
        this.serviceAddress = serviceAddress;
        this.imageLink = imageLink;
    }

    @Override
	public MAppKey getKey() {
		return key;
	}

    @Override
	public void setKey(MAppKey key) {
		this.key = key;
	}

    @Override
	public UUID getAd_Org_ID() {
		return ad_Org_ID;
	}

    @Override
	public void setAd_Org_ID(UUID ad_Org_ID) {
		this.ad_Org_ID = ad_Org_ID;
	}

    @Override
	public boolean isActive() {
		return isActive;
	}

    @Override
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	public UUID getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UUID createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdated() {
		return updated;
	}

	@Override
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public UUID getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UUID updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public long getVersion() {
		return version;
	}

	@Override
	public void setVersion(long version) {
		this.version = version;
	}

	public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getViewAddress() {
        return this.viewAddress;
    }

    public void setViewAddress(String viewAddress) {
        this.viewAddress = viewAddress;
    }

    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getImageLink() {
        return this.imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

//    public List<MWebService> getWebServices() {
//        return webServices;
//    }
//
//    public void setWebServices(List<MWebService> webServices) {
//        this.webServices = webServices;
//    }

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MAppKey();
		
		key.setID(id);
	}
	
	@Override
	@Transient
	public UUID getID() {
		if (key == null)
			return null;
		
		return key.getID();
	}
	
	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MAppKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public UUID getAd_Client_ID() {
		if (key == null)
			return null;
		
		return key.getAd_Client_ID();
	}
	
	@Override
    @Transient
    public UUID getAd_App_ID() {
		return getID();
	}

    @Override
    @Transient
	public void setAd_App_ID(UUID ad_App_ID) {
		setID(ad_App_ID);
	}
    
    @Override
    @Transient
	public UUID getParent_ID() {
		return null;
	}
    
	@Override
	@Transient
	public String getTableName() {
		return APP_TABLE_NAME;
	}

	@Override
	public boolean hasParent() {
		return false;
	}
	
	@Override
	@Transient
	public String getKeyColumn() {
		return APP_KEYCOLUMN_NAME;
	}
	
	@Override
	public boolean beforeSave(boolean isNew) {
		this.setAd_Client_ID(ROOT_ID_VALUE);
		this.setAd_Org_ID(ROOT_ID_VALUE);
		return true;
	}
	
	@Override
	@Transient
	public boolean afterSave(boolean isNew) {
		return true;
	}

	@Override
	@Transient
	public boolean beforeDelete() {
		return true;
	}

	@Override
	@Transient
	public boolean afterDelete() {
		return true;
	}
	
	/*public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MApp))
	        return false;
	    
	    MApp castOther = (MApp) other;
	    return ad_App_ID.equals(castOther.ad_App_ID);
	}*/

	public int hashCode() {
	    final int prime = 31;
	    int hash = 17;
	    hash = hash * prime + this.getID().hashCode();
	    
	    return hash;
	}

	@Override
	public String toString() {
		return "MApp [ad_App_ID=" + getID() + ", code=" + code + ", name=" + name + "]";
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
}
