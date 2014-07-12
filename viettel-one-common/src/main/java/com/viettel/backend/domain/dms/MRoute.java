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
import com.viettel.annotation.EntityType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.common.EO;
import com.viettel.backend.domain.dms.key.MRouteKey;

@Entity(name = MRoute.TABLE_NAME)
@Table(name = MRoute.TABLE_NAME)
@Description("With MRoute, AD_Org_ID always is root")
@EntityType(withRootClient = false, withRootOrg = false, withRootApp = false)
@Caption("route")
public class MRoute extends BaseEO<MRouteKey, UUID>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8787270723992184385L;
	
	@Transient
	public static final String TABLE_NAME = "M_Route";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MRouteKey key;

	@Index
	@Column(name = "Code", nullable = false, length = EO.CODE_SHORT_LENGTH)
	private String code;
	
	@Index
	@Column(name = "Name", nullable = false, length = EO.NAME_NORMAL_LENGTH)
	private String name;

	public MRoute() {
		super();
	}

	public MRouteKey getKey() {
		return key;
	}

	public void setKey(MRouteKey key) {
		this.key = key;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDisplay() {
		return this.name;
	}

	@Override
	public void setDisplay(String display) {
		this.name = display;
	}

	@Override
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MRouteKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	public void setID(UUID id) {
		if (key == null)
			key = new MRouteKey();
		
		key.setID(id);
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	public String getKeyColumn() {
		return KEYCOLUMN_NAME;
	}
}
