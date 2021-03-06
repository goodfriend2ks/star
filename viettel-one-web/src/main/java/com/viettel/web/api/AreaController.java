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
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.common.MArea;
import com.viettel.backend.service.BaseService;
import com.viettel.backend.service.CommonService;
import com.viettel.backend.service.TenantService;
import com.viettel.dto.common.MAreaDto;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.EntityUtil;
import com.viettel.util.ValuePairUtil;
import com.viettel.web.api.mvc.ResultSet;
import com.viettel.web.api.security.VOUser;
import com.viettel.web.api.util.EOUtil;
import com.viettel.web.api.util.Env;

@Controller
@RequestMapping(value = "/api/area")
public class AreaController extends BasicController<MAreaDto, UUID> {
	@Autowired
    private TenantService tenantService;
	
	@Autowired
    private CommonService dataService;
	
	public AreaController() {
		super("area");
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
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MArea.class, currentUser.getTenant_ID());
			UUID bean_Org_ID = EntityUtil.getOrg_ID(MArea.class, currentUser.getOrg_ID());
			UUID bean_App_ID = EntityUtil.getApp_ID(MArea.class, currentUser.getApp_ID());
			
			List<MArea> beans = dataService.getList(MArea.class, UUID.class, 
					bean_Tenant_ID, bean_Org_ID, bean_App_ID, null);
			
			// Init dto
			List<MAreaDto> beanDtos = new ArrayList<>();
			for (MArea bean : beans) {
				MArea parent = null;
				
				UUID parent_ID = bean.getParent_ID(); 
				if (!DataTypeUtil.isEmpty(UUID.class, parent_ID)) {
					for (MArea o : beans) {
						if (DataTypeUtil.compare(UUID.class, parent_ID, o.getId()) == 0) {
							parent = o;
							break;
						}
					}
				}
				
				beanDtos.add(new MAreaDto(bean, null, parent));
			}
			
			ResultSet<MAreaDto> results = new ResultSet<>();
			results.setRows(beanDtos);
			
			return new ResponseEntity<ResultSet<?>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get areas");
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
					"Cannot get area with id {" + id + "}", "Cannot get area");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MArea.class, currentUser.getTenant_ID());
			
			MArea bean = dataService.findById(MArea.class, UUID.class, bean_Tenant_ID, beanId);
			if (bean != null) {
				MOrg org = tenantService.getOrg(bean.getTenant_ID(), bean.getOrg_ID());
				
				MArea parent = null;
				if (!DataTypeUtil.isEmpty(UUID.class, bean.getParent_ID())) {
					parent = dataService.findById(MArea.class, UUID.class, bean_Tenant_ID, bean.getParent_ID());
				}
				
				MAreaDto beanDto = new MAreaDto(bean, org, parent);
				return new ResponseEntity<MAreaDto>(beanDto, HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get area with id {" + id + "}", "Cannot get area");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get area");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
    }
	
	@Override
	@RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@PathVariable String id, @RequestBody MAreaDto bean) {
		if (bean == null) {
			Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_DTO, 
					"Cannot save area with id {" + id + "}", "Cannot save area");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		MArea updateItem = null;
		if (!"new".equalsIgnoreCase(id)) {
			UUID updateItemId = DataTypeUtil.fromObject(UUID.class, id);
			if (DataTypeUtil.isEmpty(UUID.class, updateItemId)) {
				Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_ID, 
						"Cannot get area with id {" + id + "}", "Cannot get area");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
			
			try {
				VOUser currentUser = Env.getCurrentUser();
				UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MArea.class, currentUser.getTenant_ID());
				updateItem = dataService.findById(MArea.class, UUID.class, bean_Tenant_ID, updateItemId);
			} catch (Exception ex) {
				Map<String, String> message = errorException(ex, "Cannot get area");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
		} else {
			updateItem = new MArea();
		}
		
		boolean isNew = EOUtil.initBaseEO(updateItem);
		try {
			bean.toBean(updateItem, isNew);
			
			UUID saveItemID = null;
	        try {
	        	saveItemID = dataService.save(MArea.class, UUID.class, updateItem, true);
	        	
	        	Map<String, String> message = success(true);
	    		return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
	        } catch (Exception ex) {
	        	Map<String, String> message = errorException(ex, "Cannot save area");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        } finally {
	        	if (saveItemID == null) {
	        		Map<String, String> message = error(TYPE_ERROR, CODE_NOT_SAVE, 
							"Cannot save area with id {" + id + "}", "Cannot save area");
					return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        	}
	        }
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Error convert area bean properties");
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
					"Cannot get area pair value with id {" + id + "}", "Cannot get area pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MArea.class, currentUser.getTenant_ID());
			MArea bean = dataService.findById(MArea.class, UUID.class, bean_Tenant_ID, beanId);
			if (bean != null) {
				return new ResponseEntity<IValuePair<UUID>>(new ValuePair<>(bean), HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get area pair value with id {" + id + "}", "Cannot get area pair value");
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
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MArea.class, currentUser.getTenant_ID());
			UUID bean_Org_ID = EntityUtil.getOrg_ID(MArea.class, currentUser.getOrg_ID());
			UUID bean_App_ID = EntityUtil.getApp_ID(MArea.class, currentUser.getApp_ID());
			
			List<MArea> beans = dataService.getList(MArea.class, UUID.class, 
					bean_Tenant_ID, bean_Org_ID, bean_App_ID, null);
			List<IValuePair<UUID>> pairs = ValuePairUtil.fromEOs(beans);
			
			ResultSet<IValuePair<UUID>> results = new ResultSet<>();
			results.setRows(pairs);
			
			return new ResponseEntity<ResultSet<IValuePair<UUID>>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get area pair values");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
}
