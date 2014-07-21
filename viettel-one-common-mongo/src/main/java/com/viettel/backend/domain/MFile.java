/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.Description;
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;

@Entity(name = MFile.TABLE_NAME)
@Table(name = MFile.TABLE_NAME)
@EntityType(withRootTenant = true, withRootOrg = true, withRootApp = false, alwayRootOrg = true)
@Caption("appFile")
public class MFile extends BaseEO<UUID> {

    private static final long serialVersionUID = 54495516008919734L;
    
    @Transient
	public static final String TABLE_NAME = "AD_File";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = EO_ID_PROPERTY;
	@Transient
	public static final String DISPLAY_PROPERTY = "name";
	
	@Id
	private UUID id;
	
	@Index
    @Column(name = "Name", nullable = false, length = EO.URL_LENGTH)
    private String name;
    
	@Index
	@Column(name = "Type", nullable = false, length = EO.TEXT_VERY_SHORT_LENGTH)
	private String type;

	@Column(name = "Url", nullable = true, length = EO.URL_LENGTH)
	private String url;
	
	@Column(name = "Size", nullable = false)
	@Description("File size in KB")
	private double size;
	
    public MFile() {
		super();
	}

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
