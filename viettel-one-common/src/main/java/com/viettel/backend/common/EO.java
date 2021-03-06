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
public abstract class EO<KT extends EOKey<PK>, PK extends Serializable> implements IValuePair<PK> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7526935139676798972L;

	@Transient
	public static final String CLIENT_TABLE_NAME = "AD_Client";
	@Transient
	public static final String CLIENT_KEYCOLUMN_NAME = CLIENT_TABLE_NAME + "_ID";
	@Transient
	public static final String CLIENT_FIELD_NAME = "ad_Client_ID";
	
	@Transient
	public static final String ORG_TABLE_NAME = "AD_Org";
	@Transient
	public static final String ORG_KEYCOLUMN_NAME = ORG_TABLE_NAME + "_ID";
	@Transient
	public static final String ORG_FIELD_NAME = "ad_Org_ID";
	
	@Transient
	public static final String APP_TABLE_NAME = "AD_App";
	@Transient
	public static final String APP_KEYCOLUMN_NAME = APP_TABLE_NAME + "_ID";
	@Transient
	public static final String APP_FIELD_NAME = "ad_App_ID";
	
	@Transient
	public static final String PARENT_COLUMN_NAME = "Parent_ID";
	@Transient
	public static final String PARENT_FIELD_NAME = "parent_ID";
	
	@Transient
	public static final String ACTIVE_FIELD_NAME = "isActive";
	
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
	public static <KT extends EOKey<PK>, PK extends Serializable> 
		boolean initBaseEO(EO<?, ?> eoSource, EO<KT, PK> eo, Class<PK> pkClazz)
    {
		boolean isNew = DataTypeUtil.isEmpty(pkClazz, eo.getID());
    	return initBaseEO(eoSource, eo, pkClazz, isNew);
    }
	
	@Transient
	public static <KT extends EOKey<PK>, PK extends Serializable> 
		boolean initBaseEO(EO<?, ?> eoSource, EO<KT, PK> eo, Class<PK> pkClazz, boolean isNew)
    {
    	if (isNew)
    	{
    		eo.setAd_Client_ID(eoSource.getAd_Client_ID());
    		eo.setAd_Org_ID(eoSource.getAd_Org_ID());
    		eo.setAd_App_ID(eoSource.getAd_App_ID());
    		eo.setID(DataTypeUtil.newValue(pkClazz));
    		eo.setCreated(new Date());
    		eo.setCreatedBy(eoSource.getUpdatedBy());
    		eo.setVersion(0);
    		eo.setActive(true);
    	}
    	
    	eo.setUpdated(new Date());
    	eo.setUpdatedBy(eoSource.getUpdatedBy());
    	
    	return isNew;
    }
	
	public abstract void setKey(KT id);
	
	public abstract KT getKey();
	
	public abstract UUID getAd_Client_ID();
	
	public abstract void setAd_Client_ID(UUID ad_Client_ID);
	
	public abstract UUID getAd_Org_ID();
	
	public abstract void setAd_Org_ID(UUID ad_Org_ID);
	
	public abstract UUID getAd_App_ID();
	
	public abstract void setAd_App_ID(UUID ad_App_ID);

	public abstract UUID getCreatedBy();
	
	public abstract void setCreatedBy(UUID createdBy);
	
	public abstract UUID getUpdatedBy();
	
	public abstract void setUpdatedBy(UUID updatedBy);
	
	public abstract boolean isActive();
	
	public abstract void setActive(boolean isActive);
	
	public abstract long getVersion();
	
	public abstract void setVersion(long version);
	
	public abstract void setCreated(Date created);
	
	public abstract void setUpdated(Date updated);
	
	public abstract PK getParent_ID();
	
	public abstract boolean hasParent();
	
	@Transient
	public abstract void setID(PK id);
	
	@Transient
	public abstract PK getID();
	
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
