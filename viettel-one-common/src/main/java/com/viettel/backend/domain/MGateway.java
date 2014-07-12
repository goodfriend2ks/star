/*
 * @Copyright Viettel-One
 */
package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.domain.key.MGatewayKey;

/**
 *
 * @author khangpn
 */
@Entity(name = MGateway.TABLE_NAME)
@Table(name = MGateway.TABLE_NAME)
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
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true)
@Caption("gateway")
public class MGateway extends BaseEO<MGatewayKey, UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4736401738217747880L;
	
	@Transient
	public static final String TABLE_NAME = "AD_Gateway";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MGatewayKey key;
	
	@Index
    @Column(name = "Name", length = 100)
    private String name;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "gateway")
//    private List<MTask> tasks;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gateway")
//    private List<MCondition> conditions;

    public MGateway() {
		super();
	}

	public MGatewayKey getKey() {
		return key;
	}

	public void setKey(MGatewayKey key) {
		this.key = key;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<MCondition> getConditions() {
//        return conditions;
//    }
//
//    public void setConditions(List<MCondition> conditions) {
//        this.conditions = conditions;
//    }
//
//    public List<MTask> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<MTask> tasks) {
//        this.tasks = tasks;
//    }

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MGatewayKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_Gateway_ID;
//	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MGatewayKey();
		
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
}
