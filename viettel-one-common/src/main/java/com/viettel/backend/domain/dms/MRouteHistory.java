package com.viettel.backend.domain.dms;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.viettel.annotation.Caption;
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.LinkedEO;
import com.viettel.backend.domain.common.MPartner;
import com.viettel.backend.domain.common.key.MPartnerKey;
import com.viettel.backend.domain.dms.key.MRouteHistoryKey;
import com.viettel.backend.domain.dms.key.MRouteKey;

@Entity(name = MRouteHistory.TABLE_NAME)
@Table(name = MRouteHistory.TABLE_NAME)
@EntityType(withRootClient = false, withRootOrg = false, withRootApp = false)
@Caption("routehistory")
public class MRouteHistory extends LinkedEO<MRouteHistoryKey, UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2612356596676227686L;
	
	@Transient
	public static final String TABLE_NAME = "M_RouteHistory";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@EmbeddedId
	private MRouteHistoryKey key;
	
	@Index
	@Column(name = MRoute.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MRoute.class, keyClazz = MRouteKey.class, pkClazz = UUID.class, 
			idProperty = MRouteKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
    private UUID m_Route_ID;
	
	@Index
	@Column(name = MPartner.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MPartner.class, keyClazz = MPartnerKey.class, pkClazz = UUID.class, 
			idProperty = MPartnerKey.KEY_NAME, captionProperty = "name", 
			type = LinkedType.DROPDOWN, canNew = false)
    private UUID c_Partner_ID;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "StartedDate", nullable = false)
	private Date startedDate;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FinishedDate", nullable = true)
	private Date finishedDate;
	
    public MRouteHistory() {
    	super();
    }

	public MRouteHistoryKey getKey() {
		return key;
	}

	public void setKey(MRouteHistoryKey key) {
		this.key = key;
	}

	public UUID getM_Route_ID() {
		return m_Route_ID;
	}

	public void setM_Route_ID(UUID m_Route_ID) {
		this.m_Route_ID = m_Route_ID;
	}

	public UUID getC_Partner_ID() {
		return c_Partner_ID;
	}

	public void setC_Partner_ID(UUID c_Partner_ID) {
		this.c_Partner_ID = c_Partner_ID;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Date getFinishedDate() {
		return finishedDate;
	}

	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
	}

	@Override
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MRouteHistoryKey();
		
		key.setAd_Client_ID(ad_Client_ID);
	}

	@Override
	public void setID(UUID id) {
		if (key == null)
			key = new MRouteHistoryKey();
		
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
