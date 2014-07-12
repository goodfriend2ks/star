package com.viettel.backend.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = EmptyEO.TABLE_NAME)
@Table(name = EmptyEO.TABLE_NAME)
public class EmptyEO {
	
	@Transient
	public static final String TABLE_NAME = "EmptyEO";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
	
	@Id
	private UUID id;
	
	public EmptyEO() {
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
