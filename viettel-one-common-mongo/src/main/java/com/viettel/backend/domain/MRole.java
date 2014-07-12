package com.viettel.backend.domain;

/* 
 * Viettel.One Project Model Classes
 * Generated Mar 7, 2014 2:44:46 PM by Hibernate Tools 3.4.0.CR1 
 */

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;

/**
 * Role domain object
 */
@Entity(name = MRole.TABLE_NAME)
@Table(name = MRole.TABLE_NAME)
//@Description("With MRole, AD_App_ID always is root, linked App with MUserRole, see MUser")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("role")
public class MRole extends BaseEO<UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6514207455735244363L;
	
	@Transient
	public static final String TABLE_NAME = "AD_Role";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = "Code", nullable = false, length = 30)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = 120)
    private String name;
    
	@Column(name = "Description")
    private String description;
	
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "roles")
//    private List<MView> views;

//	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="roles")
//	private List<MWorkflow> workflows;
	
    public MRole() {
    	super();
    }

    public MRole(String name, String code) {
    	this();
    	
        this.name = name;
        this.code = code;
    }

    public MRole(String name, String code, String description /*, List<MView> views*/) {
    	this();
    	
        this.name = name;
        this.code = code;
        this.description = description;
        //this.views = views;
    }
    
//	public UUID getAd_Role_ID() {
//		return ad_Role_ID;
//	}
//
//	public void setAd_Role_ID(UUID ad_Role_ID) {
//		this.ad_Role_ID = ad_Role_ID;
//	}

    @Override
	public UUID getId() {
		return id;
	}

    @Override
	public void setId(UUID id) {
		this.id = id;
	}

	public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<MView> getViews() {
//        return this.views;
//    }
//
//    public void setViews(List<MView> views) {
//        this.views = views;
//    }
//
//	public List<MWorkflow> getWorkflows() {
//		return workflows;
//	}
//
//	public void setWorkflows(List<MWorkflow> workflows) {
//		this.workflows = workflows;
//	}
	
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
	
//	@Override
//	public boolean beforeSave(boolean isNew) {
//		this.setAd_App_ID(ROOT_ID_VALUE);
//		return super.beforeSave(isNew);
//	}
	
	/*public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MRole))
	        return false;
	    
	    MRole castOther = (MRole) other;
	    return this.ad_Role_ID.equals(castOther.ad_Role_ID);
	}*/

//	public int hashCode() {
//	    final int prime = 31;
//	    int hash = 17;
//	    hash = hash * prime + this.ad_Role_ID.hashCode();
//	    
//	    return hash;
//	}
//
//	@Override
//	public String toString() {
//		return "MRole [ad_Role_ID=" + ad_Role_ID + ", code=" + code + ", name="
//				+ name + "]";
//	}
}
