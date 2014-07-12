package com.viettel.backend.domain.dms.key;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Transient;

import com.viettel.backend.common.EOKey;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.dms.MEmployee;

public class MEmployeeKey extends EOKey<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8889306519447432800L;

	@Transient
	public static final String KEY_NAME = "c_Employee_ID";
	
	@Column(name = MClient.CLIENT_KEYCOLUMN_NAME, nullable = false)
	private UUID ad_Client_ID;
	
	@Column(name = MEmployee.KEYCOLUMN_NAME, nullable = false)
    private UUID c_Employee_ID;
	
	public MEmployeeKey()
	{
		super();
	}

	public MEmployeeKey(UUID ad_Client_ID, UUID c_Employee_ID)
	{
	   this.ad_Client_ID = ad_Client_ID;
	   this.c_Employee_ID = c_Employee_ID;
	}
	
	@Override
	public UUID getAd_Client_ID() {
		return ad_Client_ID;
	}

	@Override
	public void setAd_Client_ID(UUID ad_Client_ID) {
		this.ad_Client_ID = ad_Client_ID;
	}

	@Override
	public void setID(UUID id) {
		this.c_Employee_ID = id;
	}

	@Override
	public UUID getID() {
		return this.c_Employee_ID;
	}

	@Override
	@Transient
	public String getKeyName() {
		return KEY_NAME;
	}
}
