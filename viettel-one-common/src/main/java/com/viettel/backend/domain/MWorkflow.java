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
import com.viettel.backend.domain.key.MTaskKey;
import com.viettel.backend.domain.key.MWorkflowKey;

/**
 * <p>
 * Doi tuong dinh nghia cac phuong thuc chinh khoi tao 1 workflow
 * </p>
 *
 * @author khangpn
 */
@Entity(name = MWorkflow.TABLE_NAME)
@Table(name = MWorkflow.TABLE_NAME)
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("workflow")
public class MWorkflow extends BaseEO<MWorkflowKey, UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2309336303754964316L;

	@Transient
	public static final String TABLE_NAME = "AD_Workflow";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	    
	@EmbeddedId
	private MWorkflowKey key;
	
	@Index
    @Column(name = "PoName", length = 100, nullable = false)
    private String poName;	// PO name la ten cua entity se cau hinh workflow
    
    @Column(name = "PoId", nullable = false)
    private Long poId;		// Khoa chinh cua PO
    
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(name = MWorkflow.TABLE_NAME + "_Role",
//		joinColumns = {
//			@JoinColumn(name = MWorkflow.KEYCOLUMN_NAME, nullable = false)
//	    },
//	    inverseJoinColumns = {
//			@JoinColumn(name = MRole.KEYCOLUMN_NAME, nullable = false)
//		}
//	)
//    private List<MRole> roles;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "workflow")
//    private List<MTask> tasks;	// Tap hop cac task trong workflow
    
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = MTask.KEYCOLUMN_NAME)
//    private MTask startTask;	// Task start
    
    @EntityLinked(entityClazz = MTask.class, keyClazz = MTaskKey.class, pkClazz = UUID.class, 
    		idProperty = MTaskKey.KEY_NAME, captionProperty = "name", type = LinkedType.DROPDOWN, canNew = false)
    @Column(name = MTask.KEYCOLUMN_NAME)
    private UUID ad_Task_ID;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "workflow")
//    private List<MTask> currentTasks;	// Task hien tai la gi

    public MWorkflow() {
		super();
	}

//	public UUID getAd_Workflow_ID() {
//		return ad_Workflow_ID;
//	}
//
//	public void setAd_Workflow_ID(UUID ad_Workflow_ID) {
//		this.ad_Workflow_ID = ad_Workflow_ID;
//	}

	public MWorkflowKey getKey() {
		return key;
	}

	public void setKey(MWorkflowKey key) {
		this.key = key;
	}

	public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }

    public Long getPoId() {
        return poId;
    }

    public void setPoId(Long poId) {
        this.poId = poId;
    }

//    public List<MRole> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<MRole> roles) {
//        this.roles = roles;
//    }
//
//    public List<MTask> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<MTask> tasks) {
//        this.tasks = tasks;
//    }

//    public MTask getStartTask() {
//        return startTask;
//    }
//
//    public void setStartTask(MTask startTask) {
//        this.startTask = startTask;
//    }
    
    public UUID getAd_Task_ID() {
		return ad_Task_ID;
	}

	public void setAd_Task_ID(UUID ad_Task_ID) {
		this.ad_Task_ID = ad_Task_ID;
	}

//    public List<MTask> getCurrentTasks() {
//        return currentTasks;
//    }
//
//    public void setCurrentTasks(List<MTask> currentTasks) {
//        this.currentTasks = currentTasks;
//    }

    @Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MWorkflowKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_Workflow_ID;
//	}

    @Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MWorkflowKey();
		
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
		return poName;
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
		this.poName = display;
	}
}
