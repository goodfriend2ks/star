package com.viettel.backend.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

/**
 * Application domain object
 */
@Entity(name = MApp.APP_TABLE_NAME)
@Table(name = MApp.APP_TABLE_NAME)
@Description("With MApp, AD_Client_ID, AD_Org_ID and AD_Org_ID always is root")
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = true, 
		alwayRootTenant = true, alwayRootOrg = true)
@Caption("app")
public class MApp extends EO<UUID> {

	private static final long serialVersionUID = 5629134143348918230L;
	
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
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
	@Column(name = "Oauth2ClientId", length = 120, nullable = true)
	private String oauth2ClientId;
	
	@Index
	@Column(name = "Oauth2ClientSecret", length = 120, nullable = true)
	private String oauth2ClientSecret;
	
	@Index
	@Column(name = TENANT_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MTenant.class, pkClazz = UUID.class,
			idProperty = MTenant.KEY_PROPERTY, captionProperty = MTenant.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID tenant_ID;
	
	@Index
	@Column(name = ORG_KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MOrg.class, pkClazz = UUID.class,
			idProperty = MOrg.KEY_PROPERTY, captionProperty = MOrg.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
	private UUID org_ID;

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
	public UUID getId() {
		return id;
	}

    @Override
	public void setId(UUID id) {
		this.id = id;
	}
    
    @Override
	public UUID getTenant_ID() {
		return tenant_ID;
	}

    @Override
	public void setTenant_ID(UUID tenant_ID) {
		this.tenant_ID = tenant_ID;
	}
    
    @Override
	public UUID getOrg_ID() {
		return org_ID;
	}

    @Override
	public void setOrg_ID(UUID org_ID) {
		this.org_ID = org_ID;
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
	
    public String getOauth2ClientId() {
		return oauth2ClientId;
	}

	public void setOauth2ClientId(String oauth2ClientId) {
		this.oauth2ClientId = oauth2ClientId;
	}

	public String getOauth2ClientSecret() {
		return oauth2ClientSecret;
	}

	public void setOauth2ClientSecret(String oauth2ClientSecret) {
		this.oauth2ClientSecret = oauth2ClientSecret;
	}

	@Override
    @Transient
    public UUID getApp_ID() {
		return getId();
	}

    @Override
    @Transient
	public void setApp_ID(UUID app_ID) {
		setId(app_ID);
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
		this.setTenant_ID(ROOT_ID_VALUE);
		this.setOrg_ID(ROOT_ID_VALUE);
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
	    hash = hash * prime + this.getId().hashCode();
	    
	    return hash;
	}

	@Override
	public String toString() {
		return "MApp [ad_App_ID=" + getId() + ", code=" + code + ", name=" + name + "]";
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
