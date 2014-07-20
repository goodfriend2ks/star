package com.viettel.web.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
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
import com.viettel.backend.domain.MUser;
import com.viettel.backend.service.BaseService;
import com.viettel.backend.service.CommonService;
import com.viettel.backend.service.TenantService;
import com.viettel.backend.service.UserService;
import com.viettel.dto.MUserDto;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.EntityUtil;
import com.viettel.util.ValuePairUtil;
import com.viettel.web.api.mvc.ResultSet;
import com.viettel.web.api.security.VOUser;
import com.viettel.web.api.util.EOUtil;
import com.viettel.web.api.util.Env;

@Controller
@RequestMapping(value = "/api/user")
public class UserController extends BasicController<MUserDto, UUID> {
	
	@Autowired
    private UserService dataService;
	
	@Autowired
    private TenantService tenantService;
	
	@Autowired
    private CommonService commonService;
	
	public UserController() {
		super("user");
	}
	
	@Override
	public BaseService getDataService() {
		return dataService;
	}
	
	/*@RequestMapping(value = "/current", method = RequestMethod.GET)
    public @ResponseBody MUserDto getCurrentUser(@RequestParam MultiValueMap<String, String> params) {
		VOUser currentUser = Env.getCurrentUser();
		
		MUser user = dataService.findById(currentUser.getAd_Client_ID(), currentUser.getAd_User_ID());
		MOrg org = clientService.getOrg(currentUser.getAd_Client_ID(), currentUser.getAd_Org_ID());
		MLanguage lang = commonService.findById(MLanguage.class, MLanguageKey.class, UUID.class, 
				MLanguage.ROOT_ID_VALUE, UUID.fromString("fc15c181-e577-11e3-a5bf-19b777468313"));
		return MUserMapper.INSTANCE.userToDto(user, org, lang);
	}*/
	
	@Override
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> list(@RequestParam MultiValueMap<String, String> params) {
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID user_Tenant_ID = EntityUtil.getTenant_ID(MUser.class, currentUser.getTenant_ID());
			UUID user_Org_ID = EntityUtil.getOrg_ID(MUser.class, currentUser.getOrg_ID());
			UUID user_App_ID = EntityUtil.getApp_ID(MUser.class, currentUser.getApp_ID());
			
			List<MUser> beans = dataService.getList(user_Tenant_ID, user_Org_ID, user_App_ID, null);
			
			// Load language
			Set<UUID> langIds = new HashSet<>();
			for (MUser bean : beans) {
				if (bean.getLanguage_ID() != null) {
					langIds.add(bean.getLanguage_ID());
				}
			}
			
			UUID lang_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, currentUser.getTenant_ID());
			UUID lang_Org_ID = EntityUtil.getOrg_ID(MLanguage.class, currentUser.getOrg_ID());
			UUID lang_App_ID = EntityUtil.getApp_ID(MLanguage.class, currentUser.getApp_ID());
			GenericQuery langQuery = commonService.query(commonService.criteria(MLanguage.KEY_PROPERTY).in(langIds));
			List<MLanguage> langs = commonService.getList(MLanguage.class, UUID.class, 
						lang_Tenant_ID, lang_Org_ID, lang_App_ID, langQuery);
			Map<UUID, MLanguage> languages = new HashMap<>();
			for (MLanguage lang : langs) {
				languages.put(lang.getId(), lang);
			}
			
			// Init dto
			List<MUserDto> beanDtos = new ArrayList<>();
			for (MUser bean : beans) {
				MLanguage language = null;
				if (bean.getLanguage_ID() != null) {
					language = languages.get(bean.getLanguage_ID());
				}
				
				beanDtos.add(new MUserDto(bean, null, language));
			}
			
			ResultSet<MUserDto> results = new ResultSet<>();
			results.setRows(beanDtos);
			
			return new ResponseEntity<ResultSet<?>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get users");
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
					"Cannot get user with id {" + id + "}", "Cannot get user");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID tenant_ID = EntityUtil.getTenant_ID(MUser.class, currentUser.getTenant_ID());
			
			MUser bean = dataService.findById(tenant_ID, beanId);
			if (bean != null) {
				MOrg org = tenantService.getOrg(bean.getTenant_ID(), bean.getOrg_ID());
				
				MLanguage lang = null;
				if (!DataTypeUtil.isEmpty(UUID.class, bean.getLanguage_ID())) {
					UUID lang_Tenant_ID = EntityUtil.getTenant_ID(MLanguage.class, bean.getTenant_ID());
					lang = commonService.findById(MLanguage.class, UUID.class, lang_Tenant_ID, bean.getLanguage_ID());
				}
				
				MUserDto beanDto = new MUserDto(bean, org, lang);
				return new ResponseEntity<MUserDto>(beanDto, HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get user with id {" + id + "}", "Cannot get user");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get user");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
    }
	
	@Override
	@RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@PathVariable String id, @RequestBody MUserDto bean) {
		if (bean == null) {
			Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_DTO, 
					"Cannot save user with id {" + id + "}", "Cannot save user");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		MUser updateItem = null;
		if (!"new".equalsIgnoreCase(id)) {
			UUID updateItemId = DataTypeUtil.fromObject(UUID.class, id);
			if (DataTypeUtil.isEmpty(UUID.class, updateItemId)) {
				Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_ID, 
						"Cannot get user with id {" + id + "}", "Cannot get user");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
			
			try {
				VOUser currentUser = Env.getCurrentUser();
				UUID tenant_ID = EntityUtil.getTenant_ID(MUser.class, currentUser.getTenant_ID());
				updateItem = dataService.findById(tenant_ID, updateItemId);
			} catch (Exception ex) {
				Map<String, String> message = errorException(ex, "Cannot get user");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
		} else {
			updateItem = new MUser();
		}
		
		boolean isNew = EOUtil.initBaseEO(updateItem);
		
		try {
			bean.toBean(updateItem);
			
			boolean resetPassword = MUserDto.toBoolean(bean.getResetPassword());
			if (isNew || resetPassword) {
	        	String password = MUser.DEFAULT_PASSWORD;
	        	Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
				String hashedPassword = passwordEncoder.encodePassword(password, updateItem.getUserName());
				updateItem.setPassword(hashedPassword);
	        }
			
			UUID saveItemID = null;
	        try {
	        	saveItemID = dataService.save(updateItem, true);
	        	
	        	Map<String, String> message = success(true);
	    		return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
	        } catch (Exception ex) {
	        	Map<String, String> message = errorException(ex, "Cannot save user");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        } finally {
	        	if (saveItemID == null) {
	        		Map<String, String> message = error(TYPE_ERROR, CODE_NOT_SAVE, 
							"Cannot save user with id {" + id + "}", "Cannot save user");
					return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        	}
	        }
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Error convert bean properties");
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
					"Cannot get user pair value with id {" + id + "}", "Cannot get user pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID tenant_ID = EntityUtil.getTenant_ID(MUser.class, currentUser.getTenant_ID());
			MUser bean = dataService.findById(tenant_ID, beanId);
			if (bean != null) {
				return new ResponseEntity<IValuePair<UUID>>(new ValuePair<>(bean), HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get user pair value with id {" + id + "}", "Cannot user get pair value");
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
			UUID user_Tenant_ID = EntityUtil.getTenant_ID(MUser.class, currentUser.getTenant_ID());
			UUID user_Org_ID = EntityUtil.getOrg_ID(MUser.class, currentUser.getOrg_ID());
			UUID user_App_ID = EntityUtil.getApp_ID(MUser.class, currentUser.getApp_ID());
			
			List<MUser> beans = dataService.getList(user_Tenant_ID, user_Org_ID, user_App_ID, null);
			List<IValuePair<UUID>> pairs = ValuePairUtil.fromEOs(beans);
			
			ResultSet<IValuePair<UUID>> results = new ResultSet<>();
			results.setRows(pairs);
			
			return new ResponseEntity<ResultSet<IValuePair<UUID>>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get user pair values");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
}
