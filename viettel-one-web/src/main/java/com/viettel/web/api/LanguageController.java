package com.viettel.web.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.backend.common.IValuePair;
import com.viettel.backend.common.ValuePair;
import com.viettel.backend.domain.MLanguage;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.service.BaseService;
import com.viettel.backend.service.CommonService;
import com.viettel.backend.service.TenantService;
import com.viettel.dto.MLanguageDto;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.EntityUtil;
import com.viettel.util.ValuePairUtil;
import com.viettel.web.api.mvc.ResultSet;
import com.viettel.web.api.security.VOUser;
import com.viettel.web.api.util.EOUtil;
import com.viettel.web.api.util.Env;

@Controller
@RequestMapping(value = "/api/lang")
public class LanguageController extends BasicController<MLanguageDto, UUID> {
	
	@Autowired
    private TenantService tenantService;
	
	@Autowired
    private CommonService dataService;
	
	public LanguageController() {
		super("language");
	}

	@Override
	public BaseService getDataService() {
		return dataService;
	}
	
	@Override
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> list(@RequestParam MultiValueMap<String, String> params) {
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, currentUser.getTenant_ID());
			UUID bean_Org_ID = EntityUtil.getOrg_ID(MLanguage.class, currentUser.getOrg_ID());
			UUID bean_App_ID = EntityUtil.getApp_ID(MLanguage.class, currentUser.getApp_ID());
			
			List<MLanguage> beans = dataService.getList(MLanguage.class, UUID.class, 
					bean_Tenant_ID, bean_Org_ID, bean_App_ID, null);
			
			// Init dto
			List<MLanguageDto> beanDtos = new ArrayList<>();
			for (MLanguage bean : beans) {
				beanDtos.add(new MLanguageDto(bean, null));
			}
			
			ResultSet<MLanguageDto> results = new ResultSet<>();
			results.setRows(beanDtos);
			
			return new ResponseEntity<ResultSet<?>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get languages");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
    }
	
	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> edit(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		UUID beanId = DataTypeUtil.fromObject(UUID.class, id);
		if (DataTypeUtil.isEmpty(UUID.class, beanId))
		{
			Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_ID, 
					"Cannot get user with id {" + id + "}", "Cannot get language");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, currentUser.getTenant_ID());
			
			MLanguage bean = dataService.findById(MLanguage.class, UUID.class, bean_Tenant_ID, beanId);
			if (bean != null) {
				MOrg org = tenantService.getOrg(bean.getTenant_ID(), bean.getOrg_ID());
				
				MLanguageDto beanDto = new MLanguageDto(bean, org);
				return new ResponseEntity<MLanguageDto>(beanDto, HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get user with id {" + id + "}", "Cannot get language");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get language");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
    }
	
	@Override
	@RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@PathVariable String id, @RequestBody MLanguageDto bean) {
		if (bean == null) {
			Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_DTO, 
					"Cannot save user with id {" + id + "}", "Cannot save language");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		MLanguage updateItem = null;
		if (!"new".equalsIgnoreCase(id)) {
			UUID updateItemId = DataTypeUtil.fromObject(UUID.class, id);
			if (DataTypeUtil.isEmpty(UUID.class, updateItemId)) {
				Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_ID, 
						"Cannot get user with id {" + id + "}", "Cannot get language");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
			
			try {
				VOUser currentUser = Env.getCurrentUser();
				UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, currentUser.getTenant_ID());
				updateItem = dataService.findById(MLanguage.class, UUID.class, bean_Tenant_ID, updateItemId);
			} catch (Exception ex) {
				Map<String, String> message = errorException(ex, "Cannot get language");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
		} else {
			updateItem = new MLanguage();
		}
		
		EOUtil.initBaseEO(updateItem);
		try {
			bean.toBean(updateItem);
			
			UUID saveItemID = null;
	        try {
	        	saveItemID = dataService.save(MLanguage.class, UUID.class, updateItem, true);
	        	
	        	Map<String, String> message = success(true);
	    		return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
	        } catch (Exception ex) {
	        	Map<String, String> message = errorException(ex, "Cannot save language");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        } finally {
	        	if (saveItemID == null) {
	        		Map<String, String> message = error(TYPE_ERROR, CODE_NOT_SAVE, 
							"Cannot save user with id {" + id + "}", "Cannot save language");
					return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        	}
	        }
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Error convert language bean properties");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
	
	@Override
	@RequestMapping(value = "/destroy/{id}", method = RequestMethod.DELETE)
    public @ResponseBody ResponseEntity<?> delete(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		Map<String, String> message = success(true);
		return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
    }

	@Override
	@RequestMapping(value = "/pair/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getPair(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		UUID beanId = DataTypeUtil.fromObject(UUID.class, id);
		if (DataTypeUtil.isEmpty(UUID.class, beanId))
		{
			Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_ID, 
					"Cannot get user pair value with id {" + id + "}", "Cannot get language pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, currentUser.getTenant_ID());
			MLanguage bean = dataService.findById(MLanguage.class, UUID.class, bean_Tenant_ID, beanId);
			if (bean != null) {
				return new ResponseEntity<IValuePair<UUID>>(new ValuePair<>(bean), HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get language pair value with id {" + id + "}", "Cannot get language pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot user get pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	@RequestMapping(value = "/listpair", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> listPair(@RequestParam MultiValueMap<String, String> params) {
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, currentUser.getTenant_ID());
			UUID bean_Org_ID = EntityUtil.getOrg_ID(MLanguage.class, currentUser.getOrg_ID());
			UUID bean_App_ID = EntityUtil.getApp_ID(MLanguage.class, currentUser.getApp_ID());
			
			List<MLanguage> beans = dataService.getList(MLanguage.class, UUID.class, 
					bean_Tenant_ID, bean_Org_ID, bean_App_ID, null);
			List<IValuePair<UUID>> pairs = ValuePairUtil.fromEOs(beans);
			
			ResultSet<IValuePair<UUID>> results = new ResultSet<>();
			results.setRows(pairs);
			
			return new ResponseEntity<ResultSet<IValuePair<UUID>>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get language pair values");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
}
