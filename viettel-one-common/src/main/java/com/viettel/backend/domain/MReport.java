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
import com.viettel.backend.domain.key.MReportKey;

/**
 * @author      VUONGBD
 * @version     
 * @since       24-03-2014     
 */

@Entity(name = MReport.TABLE_NAME)
@Table(name = MReport.TABLE_NAME)
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
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("report")
public class MReport extends BaseEO<MReportKey, UUID> {
	
	private static final long serialVersionUID = -6269626602943685015L;
	
	@Transient
	public static final String TABLE_NAME = "AD_Report";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MReportKey key;
	
	@Index
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "JasperFile", nullable = false)
	private String jasperFile;
	
	@Column(name = "Process", nullable = false)
	private String process;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "report")
//	@OrderBy("sequence asc")
//	private List<MReportPara> parameters;

	public MReport() {
		super();
	}

	public MReport(String name, String process, String jasperfile) {
		this();
		
		this.name = name;
		this.process = process;
		this.jasperFile = jasperfile;		
	}
	
//	public MReport(String name, String process, String jasperfile, List<MReportPara> reportParameter) {
//		this();
//		
//		this.name = name;
//		this.process = process;
//		this.jasperFile = jasperfile;		
//		this.parameters = reportParameter;
//	}

//	public UUID getAd_Report_ID() {
//		return ad_Report_ID;
//	}
//
//	public void setAd_Report_ID(UUID ad_Report_ID) {
//		this.ad_Report_ID = ad_Report_ID;
//	}

	public MReportKey getKey() {
		return key;
	}

	public void setKey(MReportKey key) {
		this.key = key;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJasperFile() {
		return jasperFile;
	}

	public void setJasperFile(String jasperFile) {
		this.jasperFile = jasperFile;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

//	public List<MReportPara> getParameters() {
//		return parameters;
//	}
//
//	public void setParameters(List<MReportPara> parameters) {
//		this.parameters = parameters;
//	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MReportKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MReportKey();
		
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
