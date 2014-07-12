/*
 * @Copyright Viettel-One
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
import com.viettel.annotation.EntityLinked;
import com.viettel.annotation.EntityType;
import com.viettel.annotation.LinkedType;
import com.viettel.backend.common.BaseEO;
import com.viettel.backend.domain.key.MConditionKey;
import com.viettel.backend.domain.key.MGatewayKey;

/**
 *
 * @author khangpn
 */
@Entity(name = MCondition.TABLE_NAME)
@Table(name = MCondition.TABLE_NAME)
//@IndexCollection(columns = { 
//		@Index(name = "ad_Org_ID"),
//		@Index(name = "ad_App_ID"),
//		@Index(name = "isActive"), 
//		@Index(name = "created"),
//		@Index(name = "createdBy"),
//		@Index(name = "updated"), 
//		@Index(name = "updatedBy"),
//		@Index(name = "version"),
//		@Index(name = "type"), 
//		@Index(name = "level")})
@EntityType(withRootClient = true, withRootOrg = true, withRootApp = true)
@Caption("condition")
public class MCondition extends BaseEO<MConditionKey, UUID> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4247917694103803227L;
	
	//=========== Gateway type ===============//
	@Transient
    public static final int TYPE_SCRIPT = 1;
	@Transient
    public static final int TYPE_USER = 2;
	
    //=========== Operator type =============//
	@Transient
    public static final int OPERATOR_AND = 1;
	@Transient
    public static final int OPERATOR_OR = 1;
    
    @Transient
	public static final String TABLE_NAME = "AD_Condition";
	@Transient
	public static final String KEYCOLUMN_NAME = TABLE_NAME + "_ID";
    
	@EmbeddedId
	private MConditionKey key;
	
	@Index
    @Column(name = "ConditionType")
    private int type;
    
	@Index
    @Column(name = "Level")
    private int level;			// Level to order by clause
    
    @Column(name = "OperatorCompare")
    private int operator;		// Toan tu logic sau gateway neu co
    
    @Column(name = "FieldName", length = 100)
    private String fieldName;	//Field name to compare with value
    
    @Column(name = "Value")
    private String value;
    
    @EntityLinked(entityClazz = MGateway.class, keyClazz = MGatewayKey.class, pkClazz = UUID.class, 
    		idProperty = MGatewayKey.KEY_NAME, captionProperty = "name", 
    		type = LinkedType.DROPDOWN, canNew = true)
    @Column(name = MGateway.KEYCOLUMN_NAME)
    private UUID ad_Gateway_ID;
    
    @Transient
    private BaseEO<?, ?> po;
    
    public MCondition() {
		super();
	}

	public MConditionKey getKey() {
		return key;
	}

	public void setKey(MConditionKey key) {
		this.key = key;
	}

	public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

//    public MGateway getGateway() {
//        return gateway;
//    }
//
//    public void setGateway(MGateway gateway) {
//        this.gateway = gateway;
//    }

    public UUID getAd_Gateway_ID() {
		return ad_Gateway_ID;
	}

	public void setAd_Gateway_ID(UUID ad_Gateway_ID) {
		this.ad_Gateway_ID = ad_Gateway_ID;
	}

	public boolean getResult() {
        // TODO(KhangPN): Fix this
//        if (this.type == TYPE_SCRIPT) {
//
//        } else {
//            if (this.po == null) {
//                throw new IllegalArgumentException("PO must be set");
//            }
//            try {
//                Object fieldValue = PropertyUtils.getProperty(po, fieldName);
//                return fieldValue.equals(value);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(Condition.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InvocationTargetException ex) {
//                Logger.getLogger(Condition.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (NoSuchMethodException ex) {
//                Logger.getLogger(Condition.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        return true;
    }

	@Override
	@Transient
	public void setID(UUID id) {
		if (key == null)
			key = new MConditionKey();
		
		key.setID(id);
	}

//	@Override
//	@Transient
//	public UUID getID() {
//		return this.ad_Condition_ID;
//	}

	@Override
	@Transient
	public void setAd_Client_ID(UUID ad_Client_ID) {
		if (key == null)
			key = new MConditionKey();
		
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
		return fieldName;
	}
	
	@Override
	@Transient
	public void setDisplay(String display) {
		this.fieldName = display;
	}
}
