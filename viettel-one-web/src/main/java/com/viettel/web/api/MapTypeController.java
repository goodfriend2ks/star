package com.viettel.web.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

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
import com.viettel.backend.domain.api.MMapDetail;
import com.viettel.backend.domain.api.MMapType;
import com.viettel.backend.service.BaseService;
import com.viettel.backend.service.CommonService;
import com.viettel.backend.service.TenantService;
import com.viettel.dto.BaseDto;
import com.viettel.dto.api.MMapDetailDto;
import com.viettel.dto.api.MMapTypeDto;
import com.viettel.util.DataTypeUtil;
import com.viettel.util.EntityUtil;
import com.viettel.util.ValuePairUtil;
import com.viettel.web.api.mvc.ResultSet;
import com.viettel.web.api.security.VOUser;
import com.viettel.web.api.util.EOUtil;
import com.viettel.web.api.util.Env;

@Controller
@RequestMapping(value = "/api/maptype")
public class MapTypeController extends BasicController<MMapTypeDto, UUID> {
	
	@Autowired
    private TenantService tenantService;
	
	@Autowired
    private CommonService dataService;
	
	public MapTypeController() {
		super("maptype");
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
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MMapType.class, currentUser.getTenant_ID());
			UUID bean_Org_ID = EntityUtil.getOrg_ID(MMapType.class, currentUser.getOrg_ID());
			UUID bean_App_ID = EntityUtil.getApp_ID(MMapType.class, currentUser.getApp_ID());
			
			List<MMapType> beans = dataService.getList(MMapType.class, UUID.class, 
					bean_Tenant_ID, bean_Org_ID, bean_App_ID, null);
			
			// Init dto
			List<MMapTypeDto> beanDtos = new ArrayList<>();
			for (MMapType bean : beans) {
				beanDtos.add(new MMapTypeDto(bean, null));
			}
			
			ResultSet<MMapTypeDto> results = new ResultSet<>();
			results.setRows(beanDtos);
			
			return new ResponseEntity<ResultSet<?>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get map types");
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
					"Cannot get map type with id {" + id + "}", "Cannot get map type");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MMapType.class, currentUser.getTenant_ID());
			
			MMapType bean = dataService.findById(MMapType.class, UUID.class, bean_Tenant_ID, beanId);
			if (bean != null) {
				MOrg org = tenantService.getOrg(bean.getTenant_ID(), bean.getOrg_ID());
				
				MMapTypeDto beanDto = new MMapTypeDto(bean, org);
				
				GenericQuery query = dataService.query(dataService.criteria("mapType_ID").is(bean.getId()));
				List<MMapDetail> details = dataService.getList(MMapDetail.class, UUID.class, bean.getTenant_ID(), bean.getOrg_ID(), bean.getApp_ID(), query);
				List<MMapDetailDto> dtoDetails = new ArrayList<>();
				for (MMapDetail detail : details) {
					dtoDetails.add(new MMapDetailDto(detail, org));
				}
				beanDto.setDetails(dtoDetails);
				
				return new ResponseEntity<MMapTypeDto>(beanDto, HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get map type with id {" + id + "}", "Cannot get map type");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get map type");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
    }
	
	@Override
	@RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@PathVariable String id, @RequestBody MMapTypeDto bean) {
		if (bean == null) {
			Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_DTO, 
					"Cannot save map type with id {" + id + "}", "Cannot save map type");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		MMapType updateItem = null;
		if (!"new".equalsIgnoreCase(id)) {
			UUID updateItemId = DataTypeUtil.fromObject(UUID.class, id);
			if (DataTypeUtil.isEmpty(UUID.class, updateItemId)) {
				Map<String, String> message = error(TYPE_INVALID_DATA, CODE_INVALID_ID, 
						"Cannot get map type with id {" + id + "}", "Cannot get map type");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
			
			try {
				VOUser currentUser = Env.getCurrentUser();
				UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MMapType.class, currentUser.getTenant_ID());
				updateItem = dataService.findById(MMapType.class, UUID.class, bean_Tenant_ID, updateItemId);
			} catch (Exception ex) {
				Map<String, String> message = errorException(ex, "Cannot get map type");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
			}
		} else {
			updateItem = new MMapType();
		}
		
		boolean isNew = EOUtil.initBaseEO(updateItem);
		try {
			bean.toBean(updateItem, isNew);
			
			UUID saveItemID = null;
	        try {
	        	saveItemID = dataService.save(MMapType.class, UUID.class, updateItem, true);
	        	
	        	if (saveItemID != null) {
	        		List<MMapDetailDto> mapDetails = bean.getDetails();
	        		if (mapDetails != null) {
	        			for (MMapDetailDto mapDetailDto : mapDetails) {
	        				UUID detailId = mapDetailDto.getId();
	        				if (!DataTypeUtil.isEmpty(UUID.class, detailId)) {
	        					if (BaseDto.ACTION_EDIT.equalsIgnoreCase(mapDetailDto.getAction())) {
		        					MMapDetail mapDetail = dataService.findById(MMapDetail.class, UUID.class, updateItem.getTenant_ID(), detailId);
			        				
		        					EOUtil.initBaseEO(mapDetail);
			        				mapDetailDto.toBean(mapDetail, false);
			        				dataService.save(MMapDetail.class, UUID.class, mapDetail, true);
	        					} else if (BaseDto.ACTION_DELETE.equalsIgnoreCase(mapDetailDto.getAction())) {
		        					dataService.delete(MMapDetail.class, UUID.class, updateItem.getTenant_ID(), detailId, true);
		        				}
	        				} else if (BaseDto.ACTION_ADDNEW.equalsIgnoreCase(mapDetailDto.getAction())) {
	        					MMapDetail mapDetail = new MMapDetail();
	        					mapDetail.setMapType_ID(saveItemID);
	        					
	        					EOUtil.initBaseEO(mapDetail);
		        				mapDetailDto.toBean(mapDetail, true);
		        				dataService.save(MMapDetail.class, UUID.class, mapDetail, true);
	        				}
	        			}
	        		}
	        	}
	        	
	        	Map<String, String> message = success(true);
	    		return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
	        } catch (Exception ex) {
	        	Map<String, String> message = errorException(ex, "Cannot save map type");
				return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        } finally {
	        	if (saveItemID == null) {
	        		Map<String, String> message = error(TYPE_ERROR, CODE_NOT_SAVE, 
							"Cannot save map type with id {" + id + "}", "Cannot save map type");
					return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
	        	}
	        }
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Error convert map type bean properties");
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
					"Cannot get map type pair value with id {" + id + "}", "Cannot get map type pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
		
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MMapType.class, currentUser.getTenant_ID());
			MMapType bean = dataService.findById(MMapType.class, UUID.class, bean_Tenant_ID, beanId);
			if (bean != null) {
				return new ResponseEntity<IValuePair<UUID>>(new ValuePair<>(bean), HttpStatus.OK);
			}
			
			Map<String, String> message = error(TYPE_ERROR, CODE_NOT_FOUND, 
					"Cannot get map type pair value with id {" + id + "}", "Cannot get map type pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot map type get pair value");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	@RequestMapping(value = "/listpair", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> listPair(@RequestParam MultiValueMap<String, String> params) {
		try {
			VOUser currentUser = Env.getCurrentUser();
			UUID bean_Tenant_ID = EntityUtil.getTenant_ID(MMapType.class, currentUser.getTenant_ID());
			UUID bean_Org_ID = EntityUtil.getOrg_ID(MMapType.class, currentUser.getOrg_ID());
			UUID bean_App_ID = EntityUtil.getApp_ID(MMapType.class, currentUser.getApp_ID());
			
			List<MMapType> beans = dataService.getList(MMapType.class, UUID.class, 
					bean_Tenant_ID, bean_Org_ID, bean_App_ID, null);
			List<IValuePair<UUID>> pairs = ValuePairUtil.fromEOs(beans);
			
			ResultSet<IValuePair<UUID>> results = new ResultSet<>();
			results.setRows(pairs);
			
			return new ResponseEntity<ResultSet<IValuePair<UUID>>>(results, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = errorException(ex, "Cannot get map type pair values");
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
}
