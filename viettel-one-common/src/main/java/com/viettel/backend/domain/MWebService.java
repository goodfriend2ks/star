package com.viettel.backend.domain;

/* 
 * Viettel.One Project Model Classes
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
import com.viettel.backend.domain.key.MWebServiceKey;

/**
 * ApplicationService domain object
 */
@Entity(name = MWebService.TABLE_NAME)
@Table(name = MWebService.TABLE_NAME)
@Description("With MWebService, AD_Client_ID always is root, see MApp")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootClient = true, alwayRootOrg = true)
@Caption("webservice")
public class MWebService extends BaseEO<MWebServiceKey, UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7221565934461277522L;
	
	@Transient
	public static final String TABLE_NAME = "AD_WebService";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
		
	@EmbeddedId
	private MWebServiceKey key;
	
	@Index
    @Column(name = "Name", nullable = false, length = 120)
    private String name;
    
    @Column(name = "Path", nullable = false, length = 512)
    private String path;
    
    @Column(name = "ServiceInterface", nullable = false, length = 512)
    private String serviceInterface;
    
    @Column(name = "Namespace", nullable = false, length = 120)
    private String namespace;
    
    @Column(name = "PortName", nullable = false, length = 120)
    private String portName;
    
    @Index
    @Column(name = "SeqNo", nullable = false)
    private int seqNo = 1;
    
//    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    @JoinColumn(name = MApp.KEYCOLUMN_NAME, nullable = false)
//    private MApp app;
//    
//    @Column(name = MApp.KEYCOLUMN_NAME, nullable = false)
//	private UUID ad_App_ID;
    
    public MWebService() {
    	super();
    }

    public MWebService(MApp app, String name, String path, 
    		String serviceInterface, String namespace, String portName) {
    	this();
    	
        //this.ad_App_ID = app.getID();
        this.name = name;
        this.path = path;
        this.serviceInterface = serviceInterface;
        this.namespace = namespace;
        this.portName = portName;
        this.setAd_App_ID(app.getID());
    }

//    public UUID getAd_WebService_ID() {
//		return ad_WebService_ID;
//	}
//
//	public void setAd_WebService_ID(UUID ad_WebService_ID) {
//		this.ad_WebService_ID = ad_WebService_ID;
//	}

	public MWebServiceKey getKey() {
		return key;
	}

	public void setKey(MWebServiceKey key) {
		this.key = key;
	}

//	public MApp getApp() {
//		return app;
//	}
//
//	public void setApp(MApp app) {
//		this.app = app;
//	}

//	public UUID getAd_App_ID() {
//		return ad_App_ID;
//	}
//
//	public void setAd_App_ID(UUID ad_App_ID) {
//		this.ad_App_ID = ad_App_ID;
//	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getServiceInterface() {
        return serviceInterface;
    }

    public void setServiceInterface(String serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MWebServiceKey();
		
		key.setID(id);
	}

//	@Override
//	public UUID getID() {
//		return this.ad_WebService_ID;
//	}
	
	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MWebServiceKey();
		
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
		return super.beforeSave(isNew);
	}
	
/*	public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MWebService))
	        return false;
	    
	    MWebService castOther = (MWebService) other;
	    return ad_WebService_ID.equals(castOther.ad_WebService_ID);
	}*/

//	public int hashCode() {
//	    final int prime = 31;
//	    int hash = 17;
//	    hash = hash * prime + this.ad_WebService_ID.hashCode();
//	    
//	    return hash;
//	}
//
//	@Override
//	public String toString() {
//		return "MWebService [ad_WebService_ID=" + ad_WebService_ID + ", name="
//				+ name + "]";
//	}
}