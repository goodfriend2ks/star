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
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.key.MViewKey;

/**
 * View domain object
 */
@Entity(name = MView.TABLE_NAME)
@Table(name = MView.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "code"), 
//		@Index(name = "name"),
//		@Index(name = "seqNo"),
//		@Index(name = "parent_ID"), 
//		@Index(name = "isMenu"),
//		@Index(name = "isSummary")})
@Description("With MView, AD_Client_ID, AD_Org_ID always is root, see MApp")
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootClient = true, alwayRootOrg = true)
@Caption("view")
public class MView extends BaseEO<MViewKey, UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7287233340973250415L;
	
	@Transient
	public static final String TABLE_NAME = "AD_View";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MViewKey key;
	
	@Index
	@Column(name = "Code", nullable = false, length = 60)
    private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = 120)
    private String name;
	
    @Column(name = "Description", nullable = true)
    private String description;
    
    @Column(name = "Icon", nullable = true)
    private String icon;
    
    @Index
    @Column(name = "SeqNo", nullable = false)
    private int seqNo;
    
    @Index
    @Column(name = "Menu", nullable = false)
    private boolean isMenu;
    
    @Index
    @Column(name = "Summary", nullable = false)
    private boolean isSummary;
    
    @Column(name = "ViewClass", nullable = true, length = 255)
    private String viewClass;
    
    @Column(name = "Fragment", nullable = true, length = 100)
    private String fragment;
    
    @Column(name = "Param", nullable = true, length = 100)
    private String param;
    
    @Column(name = "AddFragment", nullable = true, length = 100)
    private String addFragment;
    
    @Column(name = "DetailFragment", nullable = true, length = 100)
    private String detailFragment;
    
    @Index
    @Column(name = "SimplePopup", nullable = false)
    private boolean isSimplePopup = true;
    
    @Index
    @Column(name = "Tree", nullable = false)
    private boolean isTree = false;
    
    @Index
    @Column(name = MView.PARENT_COLUMN_NAME, nullable = true)
    @EntityLinked(entityClazz = MView.class, keyClazz = MViewKey.class, pkClazz = UUID.class, 
    		idProperty = MViewKey.KEY_NAME, captionProperty = "name", emptyValue = DEFAULT_PARENT_STRING_VALUE, 
    		type = LinkedType.DROPDOWN, condition = "ad_App_ID={ad_App_ID} AND isSummary=true", 
    		checkApp = false, canNew = false)
	private UUID parent_ID = DEFAULT_PARENT_VALUE;
    
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ParentID")
//    private MView parent;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
//    @OrderBy("seqNo ASC")
//    private List<MView> views;
    
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = MViewGroup.KEYCOLUMN_NAME)
//    private MViewGroup viewGroup;
//    
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "view")
//    @OrderBy("level ASC")
//    private Set<MViewGroup> viewGroups;
    
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = MView.TABLE_NAME + "_Role",
//		joinColumns = {
//			@JoinColumn(name = MView.KEYCOLUMN_NAME, nullable = false)
//	    },
//	    inverseJoinColumns = {
//			@JoinColumn(name = MRole.KEYCOLUMN_NAME, nullable = false)
//		}
//	)
//    private List<MRole> roles;
    
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = MView.TABLE_NAME + "_Popup",
//		joinColumns = {
//			@JoinColumn(name = MView.KEYCOLUMN_NAME, nullable = false)
//	    },
//	    inverseJoinColumns = {
//			@JoinColumn(name = MPopup.KEYCOLUMN_NAME, nullable = false)
//		}
//	)
//    private List<MPopup> popups;
    
    public MView() {
    	super();
    }
    
    public MView(String code, String name) {
		this();
		this.code = code;
		this.name = name;
    }

	public MView(boolean active, String code, boolean menu, String name, boolean summary) {
    	this();
    	
        this.code = code;
        this.isMenu = menu;
        this.name = name;
        this.isSummary = summary;
        
        this.setActive(active);
    }

//    public MView(MView parent, /*MViewGroup viewGroup,*/ boolean active, String code,
//            String description, String icon, int seqNo, boolean menu,
//            String name, boolean summary, String viewClass, String fragment
//            /*, List<MViewGroup> viewGroups*/ /*,List<MView> views*/ /*,List<MRole> roles*/
//            /*,List<MPopup> popups*/) {
//    	this();
//    	
//        //this.parent = parent;
//    	if (parent == null)
//    		this.parent_ID = null;
//    	else
//    		this.parent_ID = parent.getID();
//    	
//        //this.viewGroup = viewGroup;
//        this.code = code;
//        this.description = description;
//        this.icon = icon;
//        this.seqNo = seqNo;
//        this.isMenu = menu;
//        this.name = name;
//        this.isSummary = summary;
//        this.viewClass = viewClass;
//        this.fragment = fragment;
//        //this.viewGroups = viewGroups;
//        //this.views = views;
//        //this.roles = roles;
//        //this.popups = popups;
//        
//        this.setActive(active);
//    }

//    public UUID getAd_View_ID() {
//		return ad_View_ID;
//	}
//
//	public void setAd_View_ID(UUID ad_View_ID) {
//		this.ad_View_ID = ad_View_ID;
//	}

//	public MView getParent() {
//		return parent;
//	}
//
//	public void setParent(MView parent) {
//		this.parent = parent;
//	}

//	public MViewGroup getViewGroup() {
//        return this.viewGroup;
//    }
//
//    public void setViewGroup(MViewGroup viewGroup) {
//        this.viewGroup = viewGroup;
//    }

    public MViewKey getKey() {
		return key;
	}

	public void setKey(MViewKey key) {
		this.key = key;
	}

	public UUID getParent_ID() {
		return parent_ID;
	}

	public void setParent_ID(UUID parent_ID) {
		this.parent_ID = parent_ID;
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
    
    public boolean isMenu() {
		return isMenu;
	}

	public void setMenu(boolean isMenu) {
		this.isMenu = isMenu;
	}

	public boolean isSummary() {
		return isSummary;
	}

	public void setSummary(boolean isSummary) {
		this.isSummary = isSummary;
	}

	public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getViewClass() {
        return this.viewClass;
    }

    public void setViewClass(String viewClass) {
        this.viewClass = viewClass;
    }

    public String getFragment() {
        return this.fragment;
    }

	public void setFragment(String fragment) {
        this.fragment = fragment;
    }

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
    
	public String getAddFragment() {
		return addFragment;
	}

	public void setAddFragment(String addFragment) {
		this.addFragment = addFragment;
	}

	public String getDetailFragment() {
		return detailFragment;
	}

	public void setDetailFragment(String detailFragment) {
		this.detailFragment = detailFragment;
	}

	public boolean isSimplePopup() {
		return isSimplePopup;
	}

	public void setSimplePopup(boolean isSimplePopup) {
		this.isSimplePopup = isSimplePopup;
	}
	
	public boolean isTree() {
		return isTree;
	}

	public void setTree(boolean isTree) {
		this.isTree = isTree;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MViewKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MViewKey();
		
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
	
	@Transient
	public boolean hasParent()
	{
		return !EO.isRootID(parent_ID, true);
	}
	/*public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    
	    if (!(other instanceof MView))
	        return false;
	    
	    MView castOther = (MView) other;
	    return ad_View_ID.equals(castOther.ad_View_ID);
	}*/

//	public int hashCode() {
//	    final int prime = 31;
//	    int hash = 17;
//	    hash = hash * prime + this.ad_View_ID.hashCode();
//	    return hash;
//	}
//
//	@Override
//	public String toString() {
//		return "MView [ad_View_ID=" + ad_View_ID + ", code=" + code + ", name="
//				+ name + "]";
//	}
}
