package viettel.one.startup;

import java.util.Date;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MOrgType;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MTenant;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;

public class InitDB {
	
	private ApplicationContext ctx;
	private MongoOperations mongoOperation;
	
	UUID systemTenantID = EO.ROOT_ID_VALUE;
	UUID systemOrgID = EO.ROOT_ID_VALUE;
	UUID systemUserID = EO.ROOT_ID_VALUE;
	UUID systemRoleID = EO.ROOT_ID_VALUE;
	UUID systemAppID = EO.ROOT_ID_VALUE;
	
	public void open() {
		ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	}
	
	public void close(){
	}
	
	public void initData() {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(systemTenantID));
		MTenant systemTenant = mongoOperation.findOne(query, MTenant.class);
		if (systemTenant == null) {
			systemTenant = new MTenant();
			systemTenant.setId(systemTenantID);
			systemTenant.setOrg_ID(systemOrgID);
			systemTenant.setApp_ID(systemAppID);
			systemTenant.setCreated(new Date());
			systemTenant.setCreatedBy(systemUserID);
			systemTenant.setUpdated(new Date());
			systemTenant.setUpdatedBy(systemUserID);
			systemTenant.setVersion(1);
			systemTenant.setActive(true);
			systemTenant.setCode("SYSTEM");
			systemTenant.setName("System");
			systemTenant.setOfficeAddress("HN");
			systemTenant.setBillAddress("HN");
			systemTenant.setWebsite("http://viettelone.com.vn");
			mongoOperation.save(systemTenant);
		}
		
		query = new Query();
		query.addCriteria(Criteria.where("id").is(systemOrgID));
		MOrg systemOrg = mongoOperation.findOne(query, MOrg.class);
		if (systemOrg == null) {
			systemOrg = new MOrg();
			systemOrg.setTenant_ID(systemTenantID);
			systemOrg.setOrg_ID(systemOrgID);
			systemOrg.setApp_ID(systemAppID);
			systemOrg.setCreated(new Date());
			systemOrg.setCreatedBy(systemUserID);
			systemOrg.setUpdated(new Date());
			systemOrg.setUpdatedBy(systemUserID);
			systemOrg.setVersion(1);
			systemOrg.setActive(true);
			systemOrg.setCode("SYSTEM");
			systemOrg.setName("System");
			systemOrg.setAddress("HN");
			systemOrg.setOrgType(MOrgType.ROOT);
			mongoOperation.save(systemOrg);
		}
		
		query = new Query();
		query.addCriteria(Criteria.where("id").is(systemAppID));
		MApp systemApp = mongoOperation.findOne(query, MApp.class);
		if (systemApp == null) {
			systemApp = new MApp();
			systemApp.setId(systemAppID);
			systemApp.setTenant_ID(systemTenantID);
			systemApp.setOrg_ID(systemOrgID);
			systemApp.setCreated(new Date());
			systemApp.setCreatedBy(systemUserID);
			systemApp.setUpdated(new Date());
			systemApp.setUpdatedBy(systemUserID);
			systemApp.setVersion(1);
			systemApp.setActive(true);
			systemApp.setCode("PORTAL");
			systemApp.setName("ViettelOne Portal");
			systemApp.setViewAddress("192.168.140.10");
			systemApp.setServiceAddress("192.168.140.10");
			systemApp.setImageLink("https://cdn1.iconfinder.com/data/icons/windows-8-metro-style/26/voip_gateway.png");
			mongoOperation.save(systemApp);
		}
		
		query = new Query();
		query.addCriteria(Criteria.where("id").is(systemRoleID));
		MRole systemRole = mongoOperation.findOne(query, MRole.class);
		if (systemRole == null) {
			systemRole = new MRole();
			systemRole.setId(systemRoleID);
			systemRole.setTenant_ID(systemTenantID);
			systemRole.setOrg_ID(systemOrgID);
			systemRole.setApp_ID(systemAppID);
			systemRole.setCreated(new Date());
			systemRole.setCreatedBy(systemUserID);
			systemRole.setUpdated(new Date());
			systemRole.setUpdatedBy(systemUserID);
			systemRole.setVersion(1);
			systemRole.setActive(true);
			systemRole.setCode("ROLE_ADMIN");
			systemRole.setName("System Admin");
			systemRole.setDescription("System Administrator");
			mongoOperation.save(systemRole);
		}
		
		query = new Query();
		query.addCriteria(Criteria.where("id").is(systemUserID));
		MUser systemUser = mongoOperation.findOne(query, MUser.class);
		if (systemUser == null) {
			systemUser = new MUser();
			systemUser.setId(systemUserID);
			systemUser.setTenant_ID(systemTenantID);
			systemUser.setOrg_ID(systemOrgID);
			systemUser.setApp_ID(systemAppID);
			systemUser.setCreated(new Date());
			systemUser.setCreatedBy(systemUserID);
			systemUser.setUpdated(new Date());
			systemUser.setUpdatedBy(systemUserID);
			systemUser.setVersion(1);
			systemUser.setActive(true);
			systemUser.setName("System Admin");
			systemUser.setUserName("SystemAdmin");
			//systemUser.setPassword("$2a$10$gVuyTqzHADcrCC8eJL6bGOYJFYqYy6DTiA1GCAdV6Oa7sskGv2/8W");	//123456a@
			systemUser.setPassword("2da9ffbf08bf9e5598643eab59700a57");	// MD5: 123456a@
			systemUser.setEmail("viettelone@viettel.com.vn");
			systemUser.setDob(new Date());
			mongoOperation.save(systemUser);
			
			MUserRole systemUserRole = new MUserRole();
			systemUserRole.setId(UUID.randomUUID());
			systemUserRole.setTenant_ID(systemTenantID);
			systemUserRole.setApp_ID(systemAppID);
			systemUserRole.setRole_ID(systemRoleID);
			systemUserRole.setUser_ID(systemUserID);
			mongoOperation.save(systemUserRole);
		}
	}
	
	public static void main(String[] args) {
		InitDB data = new InitDB();
		
		data.open();
		data.initData();
		data.close();
	}

}
