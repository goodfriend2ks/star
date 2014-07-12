package com.viettel.backend.domain.dms;

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
import com.viettel.backend.domain.MAppFile;
import com.viettel.backend.domain.dms.key.MProductFileKey;
import com.viettel.backend.domain.dms.key.MProductKey;
import com.viettel.backend.domain.key.MAppFileKey;

@Entity(name = MProductFile.TABLE_NAME)
@Table(name = MProductFile.TABLE_NAME)
@Description("With MProductFile, AD_App_ID always is root")
@EntityType(withRootClient = false, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("productfile")
public class MProductFile extends BaseEO<MProductFileKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 95662898035550047L;

	@Transient
	public static final String TABLE_NAME = "M_ProductFile";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";

	@EmbeddedId
	private MProductFileKey key;

	@Index
	@Column(name = MProduct.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MProduct.class, keyClazz = MProductKey.class, pkClazz = UUID.class, 
					idProperty = MProductKey.KEY_NAME, captionProperty = "name", 
					type = LinkedType.SEARCH, canNew = false)
    private UUID m_Product_ID;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;
	
	@Index
	@Column(name = "SeqNo", nullable = false)
	private int seqNo;

	@Column(name = "Url", nullable = true, length = EO.URL_LENGTH)
	private String url;

	@Index
	@Column(name = MAppFile.KEYCOLUMN_NAME, nullable = true)
	@EntityLinked(entityClazz = MAppFile.class, keyClazz = MAppFileKey.class, pkClazz = UUID.class, 
					idProperty = MAppFileKey.KEY_NAME, captionProperty = "clientFileName", 
					type = LinkedType.SEARCH, canNew = false)
    protected UUID ad_AppFile_ID;
	
//	@Index
//	@Column(name = "Type", nullable = false, length = EO.TEXT_VERY_SHORT_LENGTH)
//	private String type;

	public MProductFile() {
		super();
	}
	
	public MProductFileKey getKey() {
		return key;
	}

	public void setKey(MProductFileKey key) {
		this.key = key;
	}

	public UUID getM_Product_ID() {
		return m_Product_ID;
	}

	public void setM_Product_ID(UUID m_Product_ID) {
		this.m_Product_ID = m_Product_ID;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public UUID getAd_AppFile_ID() {
		return ad_AppFile_ID;
	}

	public void setAd_AppFile_ID(UUID ad_AppFile_ID) {
		this.ad_AppFile_ID = ad_AppFile_ID;
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MProductFileKey();

		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MProductFileKey();

		key.setID(id);
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
