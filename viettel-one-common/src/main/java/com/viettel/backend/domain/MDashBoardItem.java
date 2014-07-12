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
import com.viettel.backend.domain.key.MDashBoardItemKey;

@Entity(name = MDashBoardItem.TABLE_NAME)
@Table(name = MDashBoardItem.TABLE_NAME)
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
//		@Index(name = "seqNo")})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true, 
		alwayRootOrg = true)
@Caption("dashboard")
public class MDashBoardItem extends BaseEO<MDashBoardItemKey, UUID> {

	private static final long serialVersionUID = 4648454028772699519L;

	@Transient
	public static final String TABLE_NAME = "AD_DashBoardItem";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MDashBoardItemKey key;
	
	@Index
	@Column(name = "Name", nullable = false, length = 255)
	private String name;
	
	@Column(name = "RowSpan")
	private int rowSpan = 1;
	
	@Column(name = "ColSpan")
	private int colSpan = 1;
	
	@Column(name = "Width")
	private String width;
	
	@Column(name = "Height")
	private String height;
	
	@Column(name = "IsNewLine")
	private boolean isNewline;
	
	@Column(name = "ContentBuilder")
	private String contentBuilder;
	
	@Index
	@Column(name = "SeqNo")
    private int seqNo;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "app")
//	private List<MRole> roles;

	public MDashBoardItem() {
		super();
	}

	public MDashBoardItemKey getKey() {
		return key;
	}

	public void setKey(MDashBoardItemKey key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRowSpan() {
		return rowSpan;
	}

	public void setRowSpan(int rowSpan) {
		this.rowSpan = rowSpan;
	}

	public int getColSpan() {
		return colSpan;
	}

	public void setColSpan(int colSpan) {
		this.colSpan = colSpan;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public boolean isNewline() {
		return isNewline;
	}

	public void setNewline(boolean isNewline) {
		this.isNewline = isNewline;
	}

	public String getContentBuilder() {
		return contentBuilder;
	}

	public void setContentBuilder(String contentBuilder) {
		this.contentBuilder = contentBuilder;
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

//	public List<MRole> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(List<MRole> roles) {
//		this.roles = roles;
//	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MDashBoardItemKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MDashBoardItemKey();
		
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
