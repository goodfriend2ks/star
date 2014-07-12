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
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.domain.key.MGatewayKey;
import com.viettel.backend.domain.key.MTaskKey;
import com.viettel.backend.domain.key.MWorkflowKey;

/**
 * <p>
 * Doi tuong luu thong tin task he thong hoac task nguoi dung
 * </p>
 *
 * @author khangpn
 */
@Entity(name = MTask.TABLE_NAME)
@Table(name = MTask.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "name"), 
//		@Index(name = "type"),
//		@Index(name = "status"),
//		@Index(name = "ad_Workflow_ID"), 
//		@Index(name = "ad_Gateway_ID"),
//		@Index(name = "parent_ID")
//})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false)
@Caption("role")
public class MTask extends BaseEO<MTaskKey, UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7946578372984181254L;
	
	@Transient
	public static final String TABLE_NAME = "AD_Task";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	//================ Task type ===============//
	@Transient
    public static final int TYPE_SCRIPT = 1;
	@Transient
    public static final int TYPE_USER = 2;
	
    //================ Task status ============//
	@Transient
    public static final String TASK_INIT = "init";
	@Transient
    public static final String TASK_PREPARE = "prepared";
	@Transient
    public static final String TASK_COMPLETED = "completed";
	@Transient
    public static final String TASK_FAIL = "failed";
	@Transient
    public static final String TASK_PROCESSING = "processing";

//    @Id
//    @Column(name = MTask.KEYCOLUMN_NAME, nullable = false)
//    private UUID ad_Task_ID;
    
    @EmbeddedId
    private MTaskKey key;
    
    @Index
    @Column(name = "Name", length = 100, nullable = false)
    private String name;
    
    @Index
    @Column(name = "Type", nullable = false)
    private int type;
    
    @Index
    @Column(name = "Status", length = 100, nullable = false)
    private String status = TASK_INIT;	//Mac dinh la init
    
    @Column(name = "ProcessPath", length = 200)
    private String processPath;			//Duong dan den method thuc thi neu nguoi dung tu chon process
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = MWorkflow.KEYCOLUMN_NAME)
//    private MWorkflow workflow;
    
    @Index
    @Column(name = MWorkflow.KEYCOLUMN_NAME)
    @EntityLinked(entityClazz = MWorkflow.class, keyClazz = MWorkflowKey.class, pkClazz = UUID.class, 
    		idProperty = MWorkflowKey.KEY_NAME, captionProperty = "poName", 
    		type = LinkedType.DROPDOWN, canNew = true)
    private UUID ad_Workflow_ID;
    
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = MGateway.KEYCOLUMN_NAME)
//    private MGateway gateway;			//Output la 1 gateway
    
    @Index
    @Column(name = MGateway.KEYCOLUMN_NAME)
    @EntityLinked(entityClazz = MGateway.class, keyClazz = MGatewayKey.class, pkClazz = UUID.class, 
    		idProperty = MGatewayKey.KEY_NAME, captionProperty = "name", 
    		type = LinkedType.DROPDOWN, canNew = true)
    private UUID ad_Gateway_ID;
    
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "ParentID")
//    private MTask parent;
    
    @Index
    @Column(name = MGateway.PARENT_COLUMN_NAME)
    private UUID parent_ID;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
//    private List<MTask> nextTask;//Tap hop cac task output tu task hien tai
    
	public MTask() {
		super();
	}

//	public UUID getAd_Task_ID() {
//		return ad_Task_ID;
//	}
//
//	public void setAd_Task_ID(UUID ad_Task_ID) {
//		this.ad_Task_ID = ad_Task_ID;
//	}

	public MTaskKey getKey() {
		return key;
	}

	public void setKey(MTaskKey key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public UUID getAd_Workflow_ID() {
		return ad_Workflow_ID;
	}

	public void setAd_Workflow_ID(UUID ad_Workflow_ID) {
		this.ad_Workflow_ID = ad_Workflow_ID;
	}

	public UUID getAd_Gateway_ID() {
		return ad_Gateway_ID;
	}

	public void setAd_Gateway_ID(UUID ad_Gateway_ID) {
		this.ad_Gateway_ID = ad_Gateway_ID;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
	}

//	public MWorkflow getWorkflow() {
//		return workflow;
//	}
//
//	public void setWorkflow(MWorkflow workflow) {
//		this.workflow = workflow;
//	}
//
//	public MGateway getGateway() {
//		return gateway;
//	}
//
//	public void setGateway(MGateway gateway) {
//		this.gateway = gateway;
//	}
//
//	public MTask getParent() {
//		return parent;
//	}
//
//	public void setParent(MTask parent) {
//		this.parent = parent;
//	}

//	public List<MTask> getNextTask() {
//		return nextTask;
//	}
//
//	public void setNextTask(List<MTask> nextTask) {
//		this.nextTask = nextTask;
//	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProcessPath() {
		return processPath;
	}

	public void setProcessPath(String processPath) {
		this.processPath = processPath;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MTaskKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_Task_ID;
//	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MTaskKey();
		
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
