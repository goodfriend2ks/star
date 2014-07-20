package com.viettel.backend.domain.dms;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

@Entity(name = MRouteHistory.TABLE_NAME)
@Table(name = MRouteHistory.TABLE_NAME)
@EntityType(withRootTenant = false, withRootOrg = false, withRootApp = false)
@Caption("routehistory")
public class MRouteHistory extends LinkedEO<UUID> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2612356596676227686L;
	
	@Transient
	public static final String TABLE_NAME = "M_RouteHistory";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	@Transient
	public static final String KEY_PROPERTY = "id";
	
	@Id
	private UUID id;
	
	@Index
	@Column(name = MRoute.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MRoute.class, pkClazz = UUID.class, 
			idProperty = MRoute.KEY_PROPERTY, captionProperty = MRoute.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
    private UUID route_ID;
	
	@Index
	@Column(name = MPartner.KEYCOLUMN_NAME, nullable = false)
	@EntityLinked(entityClazz = MPartner.class, pkClazz = UUID.class, 
			idProperty = MPartner.KEY_PROPERTY, captionProperty = MPartner.DISPLAY_PROPERTY, 
			type = LinkedType.DROPDOWN, canNew = false)
    private UUID partner_ID;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "StartedDate", nullable = false)
	private Date startedDate;
	
	@Index
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FinishedDate", nullable = true)
	private Date finishedDate;
	
	@Index
	@Column(name = "IsCurrent", nullable = true)
	private boolean isCurrent;
	
    public MRouteHistory() {
    	super();
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getRoute_ID() {
		return route_ID;
	}

	public void setRoute_ID(UUID route_ID) {
		this.route_ID = route_ID;
	}

	public UUID getPartner_ID() {
		return partner_ID;
	}

	public void setPartner_ID(UUID partner_ID) {
		this.partner_ID = partner_ID;
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
	
	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
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
