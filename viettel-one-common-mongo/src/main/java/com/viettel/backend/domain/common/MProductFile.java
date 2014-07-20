package com.viettel.backend.domain.common;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
import com.viettel.backend.domain.MFile;

@Entity(name = MProductFile.TABLE_NAME)
@Table(name = MProductFile.TABLE_NAME)
@Description("With MProductFile, AD_App_ID always is root")
@EntityType(withRootTenant = false, withRootOrg = true, withRootApp = false, alwayRootOrg = true)
@Caption("productfile")
public class MProductFile extends BaseEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductFile";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = "id";
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;

	@Index
	@Column(name = MProduct.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MProduct.class, pkClazz = UUID.class, 
			idProperty = MProduct.KEY_PROPERTY, captionProperty = MProduct.DISPLAY_PROPERTY, 
			type = LinkedType.SEARCH, canNew = false)
    private UUID product_ID;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Index
	@Column(name = "SeqNo", nullable = false)
	private int seqNo;

	@Index
	@Column(name = MFile.KEYCOLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MFile.class, pkClazz = UUID.class, 
			idProperty = MFile.KEY_PROPERTY, captionProperty = MFile.DISPLAY_PROPERTY, 
			type = LinkedType.SEARCH, canNew = false)
    private UUID file_ID;
	
	public MProductFile() {
		super();
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(UUID product_ID) {
		this.product_ID = product_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	
	public UUID getFile_ID() {
		return file_ID;
	}

	public void setFile_ID(UUID file_ID) {
		this.file_ID = file_ID;
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
