package com.viettel.backend.service;


import java.util.UUID;

/**
 *
 * @author khangpn
 *
 */
public interface ConfigService //extends GenericService<MConfig, UUID> 
{
//    public MConfig getByProperty(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, String property);
    
    public String getValueByProperty(UUID AD_Client_ID, UUID AD_Org_ID, UUID AD_App_ID, String property);
}
