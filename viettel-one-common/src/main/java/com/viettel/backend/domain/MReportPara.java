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
import com.viettel.backend.domain.key.MReportKey;
import com.viettel.backend.domain.key.MReportParaKey;

/**
 * @author      VUONGBD
 * @version     
 * @since       26-03-2014     
 */
@Entity(name = MReportPara.TABLE_NAME)
@Table(name = MReportPara.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "ad_Report_ID"), 
//		@Index(name = "name"),
//		@Index(name = "seqNo")})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("reportpara")
public class MReportPara extends BaseEO<MReportParaKey, UUID> {

	private static final long serialVersionUID = -4593521569669743060L;

	@Transient
	public static final String TABLE_NAME = "AD_ReportPara";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MReportParaKey key;
	
	@Index
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "Label", nullable = false)
	private String label;
	
	@Index
	@Column(name = "Type", nullable = false)
	private String type;
	
	@Column(name = "IsMadatory", nullable = false, length = 1)
	private boolean isMadatory;
	
	@Column(name = "IsHidden", nullable = false, length = 1)
	private boolean isHidden;
	
	@Column(name = "IsNewLine", nullable = false, length = 1)
	private boolean isNewLine;
	
	@Index
	@Column(name = "SeqNo", nullable = false)
	private int seqNo;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = MReport.KEYCOLUMN_NAME, nullable = false)
//	private MReport report;
	
	@Index
	@Column(name = MReport.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MReport.class, keyClazz = MReportKey.class, pkClazz = UUID.class, 
			idProperty = MReportKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = true)
	private UUID ad_Report_ID;
	
	public MReportPara() {
		super();
	}

	public MReportPara(String name, String label, String type,
			boolean madatory, boolean hidden, int seqNo) {
		this();
		
		this.name = name;
		this.label = label;
		this.type = type;
		this.isMadatory = madatory;
		this.isHidden = hidden;
		this.seqNo = seqNo;
	}

//	public UUID getAd_ReportPara_ID() {
//		return ad_ReportPara_ID;
//	}
//
//	public void setAd_ReportPara_ID(UUID ad_ReportPara_ID) {
//		this.ad_ReportPara_ID = ad_ReportPara_ID;
//	}

	public MReportParaKey getKey() {
		return key;
	}

	public void setKey(MReportParaKey key) {
		this.key = key;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isMadatory() {
		return isMadatory;
	}

	public void setMadatory(boolean isMadatory) {
		this.isMadatory = isMadatory;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public boolean isNewLine() {
		return isNewLine;
	}

	public void setNewLine(boolean isNewLine) {
		this.isNewLine = isNewLine;
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

//	public MReport getReport() {
//		return report;
//	}
//
//	public void setReport(MReport report) {
//		this.report = report;
//	}

	public UUID getAd_Report_ID() {
		return ad_Report_ID;
	}

	public void setAd_Report_ID(UUID ad_Report_ID) {
		this.ad_Report_ID = ad_Report_ID;
	}
	
	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MReportParaKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_ReportPara_ID;
//	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MReportParaKey();
		
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
