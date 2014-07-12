package com.viettel.backend.service.external.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Component;

import com.viettel.backend.domain.MWebService;
import com.viettel.backend.service.AppService;

/**
 * Proxy to get a service instance for approciate application
 * @author ThanhNV60
 */
@Component
@Scope("singleton")
public class WebServiceProxyFactory {
    
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private Map<UUID, Map<String, JaxWsPortProxyFactoryBean>> mapService;
    
    @Autowired
    private AppService applicationService;
    
    public WebServiceProxyFactory() {
        mapService = new HashMap<>();
    }
    
    @SuppressWarnings("unchecked")
    public <T> T getService(Class<T> clazz, UUID applicationId) {
        // Check if contains app
        Map<String, JaxWsPortProxyFactoryBean> servicesOfApp
                = mapService.get(applicationId);
        if (servicesOfApp == null) {
            // Load service list for app
            // Get lock
            synchronized (mapService) {
                // Recheck to ensure no one loaded while this thread waiting
                // for the lock
                servicesOfApp = mapService.get(applicationId);
                if (servicesOfApp == null) {
                    loadServices(applicationId);
                }
            }
        }
        
        JaxWsPortProxyFactoryBean proxy = mapService.get(applicationId).get(clazz.getName());
        if (proxy != null) {
            return (T) proxy.getObject();
        }
        throw new IllegalArgumentException("This application donot have this service"
                + "[applicationId=" + applicationId + ", service=" + clazz.getName() + "]");
    }

    /**
     * Donot direct invoke this method because of thread-safe
     */
    private void loadServices(UUID applicationId) {
        List<MWebService> services = applicationService.getServices(applicationId);
        Map<String, JaxWsPortProxyFactoryBean> proxies = new HashMap<>();
        for (int i = 0; i < services.size(); i++) {
            MWebService ws = services.get(i);
            JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
            proxy.setNamespaceUri(ws.getNamespace());
            proxy.setPortName(ws.getPortName());
            proxy.setServiceName(ws.getName());
            try {
                proxy.setWsdlDocumentUrl(new URL(ws.getPath()));
                proxy.setServiceInterface(Class.forName(ws.getServiceInterface()));

                proxy.afterPropertiesSet();
                proxies.put(ws.getServiceInterface(), proxy);
            } catch (MalformedURLException e) {
                logger.error("Service url not valid [" + ws.getPath() + "]. Service is not loaded!", e);
            } catch (ClassNotFoundException e) {
                logger.error("Service Interface [" + ws.getServiceInterface() + "] not exits in the class path. Service is not loaded!", e);
            }
        }
        mapService.put(applicationId, proxies);
    }
}
