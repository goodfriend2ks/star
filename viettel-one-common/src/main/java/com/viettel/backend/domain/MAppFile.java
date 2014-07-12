/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.key.MAppFileKey;

/**
 *
 * @author khangpn
 */
@Entity(name = MAppFile.TABLE_NAME)
@Table(name = MAppFile.TABLE_NAME)
//@IndexCollection(columns = { 
//	@Index(name = "ad_Org_ID"),
//	@Index(name = "ad_App_ID"),
//	@Index(name = "isActive"), 
//	@Index(name = "created"),
//	@Index(name = "createdBy"),
//	@Index(name = "updated"), 
//	@Index(name = "updatedBy"),
//	@Index(name = "version"),
//	@Index(name = "appName"), 
//	@Index(name = "realName")
//})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = false, 
		alwayRootOrg = true)
@Caption("appFile")
public class MAppFile extends BaseEO<MAppFileKey, UUID> {

    private static final long serialVersionUID = 54495516008919734L;
    
    @Transient
	public static final String TABLE_NAME = "AD_AppFile";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MAppFileKey key;
	
	@Index
    @Column(name = "FtpName", nullable = false, length = EO.URL_LENGTH)
    private String ftpFileName;
    
	@Index
    @Column(name = "ClientName", nullable = false, length = EO.URL_LENGTH)
    private String clientFileName;
    
	@Index
	@Column(name = "Type", nullable = false, length = EO.TEXT_VERY_SHORT_LENGTH)
	private String type;

	@Column(name = "Size", nullable = false)
	@Description("File size in KB")
	private double size;
	
    public MAppFile() {
		super();
	}

    public MAppFileKey getKey() {
		return key;
	}

	public void setKey(MAppFileKey key) {
		this.key = key;
	}
	
	public String getFtpFileName() {
		return ftpFileName;
	}

	public void setFtpFileName(String ftpFileName) {
		this.ftpFileName = ftpFileName;
	}

	public String getClientFileName() {
		return clientFileName;
	}

	public void setClientFileName(String clientFileName) {
		this.clientFileName = clientFileName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MAppFileKey();
		
		key.setID(id);
	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MAppFileKey();
		
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
		return clientFileName;
	}

	@Override
	@Transient
	public void setDisplay(String display) {
		this.clientFileName = display;
	}
}
