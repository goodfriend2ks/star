package com.viettel.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.criteria.Clause;
import javax.persistence.criteria.ClauseOp;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.api.converter.ConvertUtilsBean;
import com.viettel.api.mvc.ResultSet;
import com.viettel.api.security.VOUser;
import com.viettel.api.util.EOUtil;
import com.viettel.api.util.Env;
import com.viettel.backend.common.IValuePair;
import com.viettel.backend.common.ValuePair;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.common.MLanguage;
import com.viettel.backend.domain.common.key.MLanguageKey;
import com.viettel.backend.domain.key.MUserKey;
import com.viettel.backend.service.ClientService;
import com.viettel.backend.service.CommonService;
import com.viettel.backend.service.UserService;
import com.viettel.dto.MUserDto;
import com.viettel.mapper.MUserMapper;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.ValuePairUtil;

@Controller
@RequestMapping(value = "/api/user")
public class UserController extends BasicController<MUser, UUID> {
	
	@Autowired
    private UserService userService;
	
	@Autowired
    private ClientService clientService;
	
	@Autowired
    private CommonService commonService;
	
	@RequestMapping(value = "/current", method = RequestMethod.GET)
    public @ResponseBody MUserDto getCurrentUser(@RequestParam MultiValueMap<String, String> params) {
		VOUser currentUser = Env.getCurrentUser();
//		
//		Map<String, Object> message = new HashMap<>();
//		message.put("ClientID", user.getAd_Client_ID());
//		message.put("OrgID", user.getAd_Org_ID());
//		message.put("UserName", user.getUsername());
//		message.put("Email", user.getEmail());
//		message.put("Authorities", user.getAuthorities());
//		return message;
		
		MUser user = userService.findById(currentUser.getAd_Client_ID(), currentUser.getAd_User_ID());
		MOrg org = clientService.getOrg(currentUser.getAd_Client_ID(), currentUser.getAd_Org_ID());
		MLanguage lang = commonService.findById(MLanguage.class, MLanguageKey.class, UUID.class, 
				MLanguage.ROOT_ID_VALUE, UUID.fromString("fc15c181-e577-11e3-a5bf-19b777468313"));
		return MUserMapper.INSTANCE.userToDto(user, org, lang);
	}
	
	@Override
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody ResultSet<MUser> list(@RequestParam MultiValueMap<String, String> params) {
		List<MUser> results = userService.getList(null, null, null);
		
		ResultSet<MUser> restReturn = new ResultSet<>();
		restReturn.setRows(results);
		restReturn.setTotal(results.size());
		
		return restReturn;
    }
	
	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public @ResponseBody MUser get(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		UUID beanId = DataTypeUtil.fromObject(UUID.class, id);
		if (DataTypeUtil.isEmpty(UUID.class, beanId))
			return null;
		
		Clause clause = new Clause(MUserKey.KEY_NAME, ClauseOp.eq, beanId);
		return userService.getFirst(null, null, null, clause);
    }
	
	@RequestMapping(value = "/savex/{id}", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> savex(@PathVariable String id, @RequestBody MUser user) {
		Map<String, String> message = new HashMap<>();
		boolean success = false;
		
		success(message, success);
		
		return message;
	}
	
	@Override
	@RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> save(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		Map<String, String> message = new HashMap<>();
		boolean success = false;
		
		UUID updateItemId = null;
		if (!"new".equalsIgnoreCase(id)) {
			updateItemId = DataTypeUtil.fromObject(UUID.class, id);
		}
		
		MUser updateItem = null;
		if (!DataTypeUtil.isEmpty(UUID.class, updateItemId)) {
			VOUser oauthUser = Env.getCurrentUser();
			updateItem = userService.findById(oauthUser.getAd_Client_ID(), updateItemId);
		} else {
			updateItem = new MUser();
		}
		boolean isNew = EOUtil.initBaseEO(updateItem);
		
		try {
			BeanUtilsBean.setInstance(new BeanUtilsBean(new ConvertUtilsBean()));
			BeanUtils.populate(updateItem, params);
			
			boolean resetPassword = DataTypeUtil.fromObject(Boolean.class, params.get("resetPassword"));
			if (isNew || resetPassword) {
	        	String password = MUser.DEFAULT_PASSWORD;
	        	Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
				String hashedPassword = passwordEncoder.encodePassword(password, updateItem.getUserName());
				updateItem.setPassword(hashedPassword);
	        }
			
			UUID saveItemID = null;
	        try {
//	        	saveItemID = userService.save(updateItem, true);
//	        	success = true;
	        } catch (Exception ex) {
	        	errorException(message, ex, "Cannot save user");
	        } finally {
	        	if (saveItemID == null) {
	        		error(message, "error", "", "Cannot save user");
	        	}
	        }
		} catch (Exception e) {
			errorException(message, e, "Error convert bean properties");
		}
		
		success(message, success);
		
		return message;
	}
	
	@Override
	@RequestMapping(value = "/destroy/{id}", method = RequestMethod.DELETE)
    public @ResponseBody Map<String, String> delete(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		Map<String, String> message = new HashMap<>();
		success(message, true);
		
		return message;
    }

	@Override
	@RequestMapping(value = "/pair/{id}", method = RequestMethod.GET)
	public @ResponseBody IValuePair<UUID> getPair(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		UUID beanId = DataTypeUtil.fromObject(UUID.class, id);
		if (DataTypeUtil.isEmpty(UUID.class, beanId))
			return null;
		
		Clause clause = new Clause(MUserKey.KEY_NAME, ClauseOp.eq, beanId);
		MUser bean = userService.getFirst(null, null, null, clause);
		if (bean == null)
			return null;
		
		return new ValuePair<>(bean);
	}

	@Override
	@RequestMapping(value = "/listpair", method = RequestMethod.GET)
	public @ResponseBody List<IValuePair<UUID>> listPair(@RequestParam MultiValueMap<String, String> params) {
		List<MUser> results = userService.getList(null, null, null);
		
		return ValuePairUtil.fromEOs(results);
	}
}
