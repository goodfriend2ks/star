package com.viettel.web.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import com.viettel.backend.common.EO;
import com.viettel.backend.service.BaseService;

public abstract class BasicController<T extends EO<PK>, PK extends Serializable> {
	
	public static final String TAG_ERROR_TYPE = "error";
	public static final String TAG_ERROR_MESSAGE = "error_message";
	public static final String TAG_ERROR_DESCRIPTION = "error_description";
	public static final String TAG_ERROR_CODE = "error_code";
	
	public static final String TAG_SUCCESS = "success";
	
	public static final String TYPE_ERROR = "error";
	public static final String TYPE_INVALID_DATA = "invalid_data";
	
	public static final String CODE_NOT_FOUND = "not_found";
	public static final String CODE_NOT_SAVE = "not_save";
	public static final String CODE_INVALID_ID = "invalid_id";
	public static final String CODE_INVALID_DTO = "invalid_dto";
	
	@Autowired
    private ServletContext context;
	
	public BasicController(String beanName) {
		super();
	}
	
	public ServletContext getServletContext() {
		return context;
	}
	
	public abstract BaseService getDataService();
	
	public abstract ResponseEntity<?> list(MultiValueMap<String, String> params);
	
	public abstract ResponseEntity<?> edit(String id, MultiValueMap<String, String> params);
	
	/*public abstract ResponseEntity<?> get(String id, MultiValueMap<String, String> params);*/
	
	public abstract ResponseEntity<?> save(String id, T bean);
	
	public abstract ResponseEntity<?> delete(String id, MultiValueMap<String, String> params);
	
	public abstract ResponseEntity<?> getPair(String id, MultiValueMap<String, String> params);
	
	public abstract ResponseEntity<?> listPair(MultiValueMap<String, String> params);
	
	public Map<String, String> error(String type, String code, String msg, String description) {
		Map<String, String> message = new HashMap<String, String>();
		
		message.put(TAG_ERROR_TYPE, type);
		message.put(TAG_ERROR_CODE, code);
		message.put(TAG_ERROR_MESSAGE, msg);
    	message.put(TAG_ERROR_DESCRIPTION, description);
    	message.put(TAG_SUCCESS, "false");
    	
    	return message;
	}
	
	public Map<String, String> errorException(Exception ex, String description) {
		return error("exception", "", ex.getMessage(), description);
	}
	
	public Map<String, String> success(boolean success) {
		Map<String, String> message = new HashMap<String, String>();
		message.put(TAG_SUCCESS, String.valueOf(success));
		
		return message;
	}
}
