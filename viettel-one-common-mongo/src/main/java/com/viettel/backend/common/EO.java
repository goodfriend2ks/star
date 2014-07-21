package com.viettel.backend.common;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.UUID;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.apache.commons.beanutils.PropertyUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.viettel.annotation.Description;
import com.viettel.util.DataTypeUtil;

@MappedSuperclass
public abstract class EO<PK extends Serializable> implements IValuePair<PK> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7526935139676798972L;
	
	@Transient
	public static final String EO_ID_PROPERTY = "id";
	
	@Transient
	public static final String TENANT_TABLE_NAME = "AD_Tenant";
	@Transient
	public static final String TENANT_KEYCOLUMN_NAME = TENANT_TABLE_NAME + "_ID";
	@Transient
	public static final String TENANT_ID_PROPERTY = "tenant_ID";
	
	@Transient
	public static final String ORG_TABLE_NAME = "AD_Org";
	@Transient
	public static final String ORG_KEYCOLUMN_NAME = ORG_TABLE_NAME + "_ID";
	@Transient
	public static final String ORG_ID_PROPERTY = "org_ID";
	
	@Transient
	public static final String APP_TABLE_NAME = "AD_App";
	@Transient
	public static final String APP_KEYCOLUMN_NAME = APP_TABLE_NAME + "_ID";
	@Transient
	public static final String APP_ID_PROPERTY = "app_ID";
	
	@Transient
	public static final String PARENT_COLUMN_NAME = "Parent_ID";
	@Transient
	public static final String PARENT_ID_PROPERTY = "parent_ID";
	
	@Transient
	public static final String ACTIVE_COLUMN_NAME = "IsActive";
	@Transient
	public static final String ACTIVE_PROPERTY = "isActive";
	
	@Transient
	@Description("Use as default ID for Portal App")
	public static final UUID ROOT_ID_VALUE = UUID.fromString("00000000-0000-0000-0000-000000000000");
	
	@Transient
	public static final UUID DEFAULT_PARENT_VALUE = ROOT_ID_VALUE;
	
	@Transient
	public static final String DEFAULT_PARENT_STRING_VALUE = "00000000-0000-0000-0000-000000000000";
	
	@Transient
	public static final Date EMPTY_DATE_VALUE = new Date(-2209014000000l);	// 01/01/1900
	
	@Transient
	public static final int TEXT_VERY_SHORT_LENGTH = 10;
	
	@Transient
	public static final int CODE_SHORT_LENGTH = 10;
	
	@Transient
	public static final int NAME_SHORT_LENGTH = 60;
	
	@Transient
	public static final int TEXT_SHORT_LENGTH = 60;
	
	@Transient
	public static final int CODE_NORMAL_LENGTH = 30;
	
	@Transient
	public static final int NAME_NORMAL_LENGTH = 120;
	
	@Transient
	public static final int TEXT_NORMAL_LENGTH = 120;
	
	@Transient
	public static final int NAME_LONG_LENGTH = 255;
	
	@Transient
	public static final int TEXT_LONG_LENGTH = 255;
	
	@Transient
	@Description("For website, email, link")
	public static final int URL_LENGTH = 120;
	
	@Transient
	public static final int PHONE_LENGTH = 15;
	
	@Transient
	public static final int BARCODE_LENGTH = 40;
	
	@Transient
	public static final int ADDRESS_LENGTH = 255;
	
	@Transient
	public static boolean isRootID(UUID uuid, boolean emptyValue)
	{
		boolean isEmpty = DataTypeUtil.isEmpty(UUID.class, uuid);
		if (isEmpty) {
			return emptyValue;
		}
		
		return DataTypeUtil.compare(UUID.class, uuid, DEFAULT_PARENT_VALUE) == 0;
	}
	
	@Transient
	public static boolean isEmptyDate(Date date) {
		return (date == null || date.compareTo(EMPTY_DATE_VALUE) <= 0);
	}
	
	@Transient
	public static <PK extends Serializable> 
		boolean initBaseEO(EO<?> eoSource, EO<PK> eo, Class<PK> pkClazz)
    {
		boolean isNew = DataTypeUtil.isEmpty(pkClazz, eo.getId());
    	return initBaseEO(eoSource, eo, pkClazz, isNew);
    }
	
	@Transient
	public static <PK extends Serializable> 
		boolean initBaseEO(EO<?> eoSource, EO<PK> eo, Class<PK> pkClazz, boolean isNew)
    {
    	if (isNew)
    	{
    		eo.setTenant_ID(eoSource.getTenant_ID());
    		eo.setOrg_ID(eoSource.getOrg_ID());
    		eo.setApp_ID(eoSource.getApp_ID());
    		eo.setId(DataTypeUtil.newValue(pkClazz));
    		eo.setCreated(new Date());
    		eo.setCreatedBy(eoSource.getUpdatedBy());
    		eo.setVersion(0);
    		eo.setActive(true);
    	}
    	
    	eo.setUpdated(new Date());
    	eo.setUpdatedBy(eoSource.getUpdatedBy());
    	
    	return isNew;
    }
	
	public abstract UUID getTenant_ID();
	
	public abstract void setTenant_ID(UUID tenant_ID);
	
	public abstract UUID getOrg_ID();
	
	public abstract void setOrg_ID(UUID org_ID);
	
	public abstract UUID getApp_ID();
	
	public abstract void setApp_ID(UUID app_ID);

	public abstract UUID getCreatedBy();
	
	public abstract void setCreatedBy(UUID createdBy);
	
	public abstract UUID getUpdatedBy();
	
	public abstract void setUpdatedBy(UUID updatedBy);
	
	public abstract boolean isActive();
	
	public abstract void setActive(boolean isActive);
	
	public abstract long getVersion();
	
	public abstract void setVersion(long version);
	
	public abstract Date getCreated();
	
	public abstract void setCreated(Date created);
	
	public abstract Date getUpdated();
	
	public abstract void setUpdated(Date updated);
	
	public abstract PK getParent_ID();
	
	public abstract boolean hasParent();
	
	@Transient
	public abstract void setId(PK id);
	
	@Transient
	public abstract PK getId();
	
	@Transient
	@JsonIgnore
	public abstract String getTableName();
	
	@Transient
	@JsonIgnore
	public abstract String getKeyColumn();
	
	@Transient
	public abstract boolean beforeSave(boolean isNew);
	
	@Transient
	public abstract boolean afterSave(boolean isNew);
	
	@Transient
	public abstract boolean beforeDelete();
	
	@Transient
	public abstract boolean afterDelete();
	
	@Transient
	public Object getProperty(String propertyName) {
		try {
			return PropertyUtils.getProperty(this, propertyName);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {}
		
		return null;
	}
	
	@Transient
	public boolean setProperty(String propertyName, Object value) {
		try {
			PropertyUtils.setProperty(this, propertyName, value);
			return true;
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {}
		
		return false;
	}
}
