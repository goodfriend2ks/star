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
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.viettel.backend.domain.common.MLanguage;
import com.viettel.backend.domain.common.key.MLanguageKey;
import com.viettel.backend.domain.key.MUserKey;
import com.viettel.backend.service.CommonService;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.ValuePairUtil;

@Controller
@RequestMapping(value = "/api/lang")
public class LanguageController extends BasicController<MLanguage, UUID> {

	@Autowired
    private CommonService dataService;
	
	@Override
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody ResultSet<MLanguage> list(@RequestParam MultiValueMap<String, String> params) {
		List<MLanguage> results = dataService.getList(MLanguage.class, MLanguageKey.class, UUID.class, 
				null, null, null);
		
		ResultSet<MLanguage> restReturn = new ResultSet<>();
		restReturn.setRows(results);
		restReturn.setTotal(results.size());
		
		return restReturn;
	}

	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public @ResponseBody MLanguage get(@PathVariable String id, @RequestParam MultiValueMap<String, String> params) {
		UUID beanId = DataTypeUtil.fromObject(UUID.class, id);
		if (DataTypeUtil.isEmpty(UUID.class, beanId))
			return null;
		
		Clause clause = new Clause(MLanguageKey.KEY_NAME, ClauseOp.eq, beanId);
		return dataService.getFirst(MLanguage.class, MLanguageKey.class, UUID.class, 
				null, null, null, clause);
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
		
		MLanguage updateItem = null;
		if (!DataTypeUtil.isEmpty(UUID.class, updateItemId)) {
			VOUser oauthUser = Env.getCurrentUser();
			updateItem = dataService.findById(MLanguage.class, MLanguageKey.class, UUID.class, 
					oauthUser.getAd_Client_ID(), updateItemId);
		} else {
			updateItem = new MLanguage();
		}
		boolean isNew = EOUtil.initBaseEO(updateItem);
		
		try {
			BeanUtilsBean.setInstance(new BeanUtilsBean(new ConvertUtilsBean()));
			BeanUtils.populate(updateItem, params);
			
			UUID saveItemID = null;
	        try {
	        	saveItemID = dataService.save(MLanguage.class, MLanguageKey.class, UUID.class, 
	        			updateItem, isNew);
	        	success = true;
	        } catch (Exception ex) {
	        	errorException(message, ex, "Cannot save language");
	        } finally {
	        	if (saveItemID == null) {
	        		error(message, "error", "", "Cannot save language");
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
		MLanguage bean = dataService.getFirst(MLanguage.class, MLanguageKey.class, UUID.class, 
				null, null, null, clause);
		if (bean == null)
			return null;
		
		return new ValuePair<>(bean);
	}

	@Override
	@RequestMapping(value = "/listpair", method = RequestMethod.GET)
	public @ResponseBody List<IValuePair<UUID>> listPair(@RequestParam MultiValueMap<String, String> params) {
		List<MLanguage> results = dataService.getList(MLanguage.class, MLanguageKey.class, UUID.class, 
				null, null, null);
		
		return ValuePairUtil.fromEOs(results);
	}
}
