package com.viettel.api;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;

import com.viettel.api.mvc.ResultSet;
import com.viettel.backend.common.EO;
import com.viettel.backend.common.IValuePair;

public abstract class BasicController<T extends EO<?, PK>, PK extends Serializable> {
	
	public static final String TAG_ERROR_MESSAGE = "error_msg";
	public static final String TAG_ERROR_DESCRIPTION = "error_desc";
	public static final String TAG_ERROR_TYPE = "error";
	
	public static final String TAG_SUCCESS = "success";
	
	@Autowired
    private ServletContext context;
	
	public ServletContext getServletContext() {
		return context;
	}
	
	public abstract ResultSet<T> list(MultiValueMap<String, String> params);
	
	public abstract T get(String id, MultiValueMap<String, String> params);
	
	public abstract Map<String, String> save(String id, MultiValueMap<String, String> params);
	
	public abstract Map<String, String> delete(String id, MultiValueMap<String, String> params);
	
	public abstract IValuePair<PK> getPair(String id, MultiValueMap<String, String> params);
	
	public abstract List<IValuePair<PK>> listPair(MultiValueMap<String, String> params);
	
	public void error(Map<String, String> message, String type, String msg, String description) {
		message.put(TAG_ERROR_TYPE, type);
		message.put(TAG_ERROR_MESSAGE, msg);
    	message.put(TAG_ERROR_DESCRIPTION, description);
	}
	
	public void errorException(Map<String, String> message, Exception ex, String description) {
		error(message, "exception", ex.getMessage(), description);
	}
	
	public void success(Map<String, String> message, boolean success) {
		message.put(TAG_SUCCESS, String.valueOf(success));
	}
}
