package viettel.one.startup;

import java.util.Date;
import java.util.UUID;

import org.easycassandra.persistence.cassandra.spring.CassandraTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.viettel.backend.common.EO;
import com.viettel.backend.domain.MApp;
import com.viettel.backend.domain.MClient;
import com.viettel.backend.domain.MOrg;
import com.viettel.backend.domain.MPopup;
import com.viettel.backend.domain.MRole;
import com.viettel.backend.domain.MUser;
import com.viettel.backend.domain.MUserRole;
import com.viettel.backend.domain.MView;
import com.viettel.backend.domain.MViewPopup;
import com.viettel.backend.domain.MViewRole;
import com.viettel.backend.domain.common.MLanguage;
import com.viettel.backend.domain.key.MAppKey;
import com.viettel.backend.domain.key.MClientKey;
import com.viettel.backend.domain.key.MOrgKey;
import com.viettel.backend.domain.key.MRoleKey;
import com.viettel.backend.domain.key.MUserKey;

public class InitDB {
	
//	EntityManagerFactory emf;
//	EntityManager em;
//	CommonRepository commonRepo;
	
	CassandraTemplate cassandraTemplate;
	
	UUID systemClientID = EO.ROOT_ID_VALUE;
	UUID systemOrgID = EO.ROOT_ID_VALUE;
	UUID systemUserID = EO.ROOT_ID_VALUE;
	UUID systemRoleID = EO.ROOT_ID_VALUE;
	UUID systemAppID = EO.ROOT_ID_VALUE;
	
	public void open()
	{
		System.out.println("Start connection");
		
//		HashMap<String, String> emProperties = new HashMap<String, String>();
//		emProperties.put(CassandraConstants.CQL_VERSION, CassandraConstants.CQL_VERSION_3_0);
	    
//		emf = Persistence.createEntityManagerFactory("ViettelOne", emProperties);
//	    em = emf.createEntityManager();
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
//		commonRepo = ctx.getBean(CommonRepository.class);
		cassandraTemplate = ctx.getBean(CassandraTemplate.class);
	}
	
	public void close()
	{
//		em.clear();
//    	em.close();
//    	emf.close();
    	
    	System.out.println("Finish connection");
	}
	
	public void initData()
	{
		System.out.println("Start init data");
		/* System Client */
//		MClient systemClient = em.find(MClient.class, new MClientKey(systemClientID));
//		MClient systemClient = commonRepo.findById(MClient.class, MClientKey.class, UUID.class, new MClientKey(systemClientID));
		MClient systemClient = cassandraTemplate.findOne(new MClientKey(systemClientID), MClient.class);
		if (systemClient == null)
		{
			systemClient = new MClient();
			systemClient.setID(systemClientID);
			systemClient.setAd_Org_ID(systemOrgID);
			systemClient.setAd_App_ID(systemAppID);
			systemClient.setCreated(new Date());
			systemClient.setCreatedBy(systemUserID);
			systemClient.setUpdated(new Date());
			systemClient.setUpdatedBy(systemUserID);
			systemClient.setVersion(1);
			systemClient.setActive(true);
			systemClient.setCode("SYSTEM");
			systemClient.setName("System");
			systemClient.setOfficeAddress("HN");
			systemClient.setBillAddress("HN");
			systemClient.setWebsite("http://viettelone.com.vn");
//			em.persist(systemClient);
//			commonRepo.save(MClient.class, MClientKey.class, UUID.class, systemClient, true);
			cassandraTemplate.save(systemClient);
		}
		
		/* System Org */
		//MOrg systemOrg = em.find(MOrg.class, new MOrgKey(systemClientID, systemOrgID));
//		MOrg systemOrg = commonRepo.findById(MOrg.class, MOrgKey.class, UUID.class, new MOrgKey(systemClientID, systemOrgID));
		MOrg systemOrg = cassandraTemplate.findOne(new MOrgKey(systemClientID, systemOrgID), MOrg.class);
		if (systemOrg == null)
		{
			systemOrg = new MOrg();
			systemOrg.setAd_Client_ID(systemClientID);
			systemOrg.setAd_Org_ID(systemOrgID);
			systemOrg.setAd_App_ID(systemAppID);
			systemOrg.setCreated(new Date());
			systemOrg.setCreatedBy(systemUserID);
			systemOrg.setUpdated(new Date());
			systemOrg.setUpdatedBy(systemUserID);
			systemOrg.setVersion(1);
			systemOrg.setActive(true);
			systemOrg.setCode("SYSTEM");
			systemOrg.setName("System");
			systemOrg.setAddress("HN");
//			em.persist(systemOrg);
//			commonRepo.save(MOrg.class, MOrgKey.class, UUID.class, systemOrg, true);
			cassandraTemplate.save(systemOrg);
		}
		
		/* System App */
//		MApp systemApp = em.find(MApp.class, new MAppKey(systemClientID, systemAppID));
//		MApp systemApp = commonRepo.findById(MApp.class, MAppKey.class, UUID.class, new MAppKey(systemClientID, systemAppID));
		MApp systemApp = cassandraTemplate.findOne(new MAppKey(systemClientID, systemAppID), MApp.class);
		if (systemApp == null)
		{
			systemApp = new MApp();
			systemApp.setID(systemAppID);
			systemApp.setAd_Client_ID(systemClientID);
			systemApp.setAd_Org_ID(systemOrgID);
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
//			em.persist(systemApp);
//			commonRepo.save(MApp.class, MAppKey.class, UUID.class, systemApp, true);
			cassandraTemplate.save(systemApp);
		}
		
		/* System Role */
//		MRole systemRole = em.find(MRole.class, new MRoleKey(systemClientID, systemRoleID));
//		MRole systemRole = commonRepo.findById(MRole.class, MRoleKey.class, UUID.class, new MRoleKey(systemClientID, systemRoleID));
		MRole systemRole = cassandraTemplate.findOne(new MRoleKey(systemClientID, systemRoleID), MRole.class);
		if (systemRole == null)
		{
			systemRole = new MRole();
			systemRole.setID(systemRoleID);
			systemRole.setAd_Client_ID(systemClientID);
			systemRole.setAd_Org_ID(systemOrgID);
			systemRole.setAd_App_ID(systemAppID);
			systemRole.setCreated(new Date());
			systemRole.setCreatedBy(systemUserID);
			systemRole.setUpdated(new Date());
			systemRole.setUpdatedBy(systemUserID);
			systemRole.setVersion(1);
			systemRole.setActive(true);
			systemRole.setCode("ROLE_ADMIN");
			systemRole.setName("System Admin");
			systemRole.setDescription("System Administrator");
//			em.persist(systemRole);
//			commonRepo.save(MRole.class, MRoleKey.class, UUID.class, systemRole, true);
			cassandraTemplate.save(systemRole);
		}
		
		/* System User */
//		MUser systemUser = em.find(MUser.class, new MUserKey(systemClientID, systemUserID));
//		MUser systemUser = commonRepo.findById(MUser.class, MUserKey.class, UUID.class, new MUserKey(systemClientID, systemUserID));
		MUser systemUser = cassandraTemplate.findOne(new MUserKey(systemClientID, systemUserID), MUser.class);
		if (systemUser == null)
		{
			systemUser = new MUser();
			systemUser.setID(systemUserID);
			systemUser.setAd_Client_ID(systemClientID);
			systemUser.setAd_Org_ID(systemOrgID);
			systemUser.setAd_App_ID(systemAppID);
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
			//em.persist(systemUser);
//			commonRepo.save(MUser.class, MUserKey.class, UUID.class, systemUser, true);
			cassandraTemplate.save(systemUser);
			
			MUserRole systemUserRole = new MUserRole();
			systemUserRole.setID(UUID.randomUUID());
			systemUserRole.setAd_Client_ID(systemClientID);
			systemUserRole.setAd_App_ID(systemAppID);
			systemUserRole.setAd_Role_ID(systemRoleID);
			systemUserRole.setAd_User_ID(systemUserID);
//			em.persist(systemUserRole);
//			commonRepo.save(MUserRole.class, MUserRoleKey.class, UUID.class, systemUserRole, true);
			cassandraTemplate.save(systemUserRole);
		}
		
		/* User View */
		MView userView = new MView();
		userView.setID(UUID.randomUUID());
		userView.setAd_Client_ID(systemClientID);
		userView.setAd_Org_ID(systemOrgID);
		userView.setAd_App_ID(systemAppID);
		userView.setCreated(new Date());
		userView.setCreatedBy(systemUserID);
		userView.setUpdated(new Date());
		userView.setUpdatedBy(systemUserID);
		userView.setVersion(1);
		userView.setActive(true);
		userView.setCode("user");
		userView.setName("Người sử dụng");
		userView.setDescription("Quản lý người sử dụng");
		userView.setFragment("user");
		userView.setAddFragment("new");
		userView.setDetailFragment("detail");
		userView.setSimplePopup(true);
		userView.setIcon("img/user.svg");
		userView.setSeqNo(1);
		userView.setMenu(true);
		userView.setSummary(false);
		userView.setViewClass("com.viettel.webui.view.CommonView");
//		em.persist(userView);
//		commonRepo.save(MView.class, MViewKey.class, UUID.class, userView, true);
		cassandraTemplate.save(userView);
		
		// User View_Role
		MViewRole newUserViewRole = new MViewRole();
		newUserViewRole.setID(UUID.randomUUID());
		newUserViewRole.setAd_Client_ID(systemClientID);
		newUserViewRole.setAd_Org_ID(systemOrgID);
		newUserViewRole.setAd_App_ID(systemAppID);
		newUserViewRole.setAd_View_ID(userView.getID());
		newUserViewRole.setAd_Role_ID(systemRoleID);
//		em.persist(newUserViewRole);
//		commonRepo.save(MViewRole.class, MViewRoleKey.class, UUID.class, newUserViewRole, true);
		cassandraTemplate.save(newUserViewRole);
		
		// User Popup
//		MPopup newUserPopup = new MPopup();
//		newUserPopup.setID(UUID.randomUUID());
//		newUserPopup.setAd_Client_ID(systemClientID);
//		newUserPopup.setAd_Org_ID(systemOrgID);
//		newUserPopup.setAd_App_ID(systemAppID);
//		newUserPopup.setCreated(new Date());
//		newUserPopup.setCreatedBy(systemUserID);
//		newUserPopup.setUpdated(new Date());
//		newUserPopup.setUpdatedBy(systemUserID);
//		newUserPopup.setVersion(1);
//		newUserPopup.setActive(true);
//		newUserPopup.setFragment("new");
//		newUserPopup.setName("Thêm mới người sử dụng");
//		newUserPopup.setPopupClass("com.viettel.webui.view.popup.NewUserPFS");
//		em.persist(newUserPopup);
		
//		MPopup detailUserPopup = new MPopup();
//		detailUserPopup.setID(UUID.randomUUID());
//		detailUserPopup.setAd_Client_ID(systemClientID);
//		detailUserPopup.setAd_Org_ID(systemOrgID);
//		detailUserPopup.setAd_App_ID(systemAppID);
//		detailUserPopup.setCreated(new Date());
//		detailUserPopup.setCreatedBy(systemUserID);
//		detailUserPopup.setUpdated(new Date());
//		detailUserPopup.setUpdatedBy(systemUserID);
//		detailUserPopup.setVersion(1);
//		detailUserPopup.setActive(true);
//		detailUserPopup.setFragment("detail");
//		detailUserPopup.setName("Thông tin chi tiết");
//		detailUserPopup.setPopupClass("com.viettel.webui.view.popup.DetailUserPFS");
//		em.persist(detailUserPopup);
		
		// User View Popup
//		MViewPopup newUserViewPopup = new MViewPopup();
//		newUserViewPopup.setID(UUID.randomUUID());
//		newUserViewPopup.setAd_Client_ID(systemClientID);
//		newUserViewPopup.setAd_Org_ID(systemOrgID);
//		newUserViewPopup.setAd_App_ID(systemAppID);
//		newUserViewPopup.setAd_View_ID(userView.getID());
//		newUserViewPopup.setAd_Popup_ID(newUserPopup.getID());
//		em.persist(newUserViewPopup);
//		
//		MViewPopup detailUserViewPopup = new MViewPopup();
//		detailUserViewPopup.setID(UUID.randomUUID());
//		detailUserViewPopup.setAd_Client_ID(systemClientID);
//		detailUserViewPopup.setAd_Org_ID(systemOrgID);
//		detailUserViewPopup.setAd_App_ID(systemAppID);
//		detailUserViewPopup.setAd_View_ID(userView.getID());
//		detailUserViewPopup.setAd_Popup_ID(detailUserPopup.getID());
//		em.persist(detailUserViewPopup);
		
		/* Role View */
		MView roleView = new MView();
		roleView.setID(UUID.randomUUID());
		roleView.setAd_Client_ID(systemClientID);
		roleView.setAd_Org_ID(systemOrgID);
		roleView.setAd_App_ID(systemAppID);
		roleView.setCreated(new Date());
		roleView.setCreatedBy(systemUserID);
		roleView.setUpdated(new Date());
		roleView.setUpdatedBy(systemUserID);
		roleView.setVersion(1);
		roleView.setActive(true);
		roleView.setCode("role");
		roleView.setName("Quyền truy cập");
		roleView.setDescription("Quản lý quyền truy cập");
		roleView.setFragment("role");
		roleView.setAddFragment("new");
		roleView.setDetailFragment("detail");
		roleView.setSimplePopup(true);
		roleView.setIcon("img/user.svg");
		roleView.setSeqNo(1);
		roleView.setMenu(true);
		roleView.setSummary(false);
		roleView.setViewClass("com.viettel.webui.view.CommonView");
//		em.persist(roleView);
//		commonRepo.save(MView.class, MViewKey.class, UUID.class, roleView, true);
		cassandraTemplate.save(roleView);
		
		// Role View_Role
		MViewRole newRoleViewRole = new MViewRole();
		newRoleViewRole.setID(UUID.randomUUID());
		newRoleViewRole.setAd_Client_ID(systemClientID);
		newRoleViewRole.setAd_Org_ID(systemOrgID);
		newRoleViewRole.setAd_App_ID(systemAppID);
		newRoleViewRole.setAd_View_ID(roleView.getID());
		newRoleViewRole.setAd_Role_ID(systemRoleID);
//		em.persist(newRoleViewRole);
//		commonRepo.save(MViewRole.class, MViewRoleKey.class, UUID.class, newRoleViewRole, true);
		cassandraTemplate.save(newRoleViewRole);
		
		/* App View */
		MView appView = new MView();
		appView.setID(UUID.randomUUID());
		appView.setAd_Client_ID(systemClientID);
		appView.setAd_Org_ID(systemOrgID);
		appView.setAd_App_ID(systemAppID);
		appView.setCreated(new Date());
		appView.setCreatedBy(systemUserID);
		appView.setUpdated(new Date());
		appView.setUpdatedBy(systemUserID);
		appView.setVersion(1);
		appView.setActive(true);
		appView.setCode("apps");
		appView.setName("Ứng dụng");
		appView.setDescription("Quản lý ứng dụng");
		appView.setFragment("apps/list");
		appView.setAddFragment("new");
		appView.setDetailFragment("detail");
		appView.setSimplePopup(false);
		appView.setIcon("img/application24.png");
		appView.setSeqNo(2);
		appView.setMenu(true);
		appView.setSummary(false);
		appView.setViewClass("com.viettel.webui.view.AppView");
//		em.persist(appView);
//		commonRepo.save(MView.class, MViewKey.class, UUID.class, appView, true);
		cassandraTemplate.save(appView);
		
		// App View_Role
		MViewRole newAppViewRole = new MViewRole();
		newAppViewRole.setID(UUID.randomUUID());
		newAppViewRole.setAd_Client_ID(systemClientID);
		newAppViewRole.setAd_Org_ID(systemOrgID);
		newAppViewRole.setAd_App_ID(systemAppID);
		newAppViewRole.setAd_View_ID(appView.getID());
		newAppViewRole.setAd_Role_ID(systemRoleID);
//		em.persist(newAppViewRole);
//		commonRepo.save(MViewRole.class, MViewRoleKey.class, UUID.class, newAppViewRole, true);
		cassandraTemplate.save(newAppViewRole);
		
		// App Popup
		MPopup newAppPopup = new MPopup();
		newAppPopup.setID(UUID.randomUUID());
		newAppPopup.setAd_Client_ID(systemClientID);
		newAppPopup.setAd_Org_ID(systemOrgID);
		newAppPopup.setAd_App_ID(systemAppID);
		newAppPopup.setCreated(new Date());
		newAppPopup.setCreatedBy(systemUserID);
		newAppPopup.setUpdated(new Date());
		newAppPopup.setUpdatedBy(systemUserID);
		newAppPopup.setVersion(1);
		newAppPopup.setActive(true);
		newAppPopup.setFragment("new");
		newAppPopup.setName("Thêm mới ứng dụng");
		newAppPopup.setPopupClass("com.viettel.webui.view.popup.AppDetailPopup");
//		em.persist(newAppPopup);
//		commonRepo.save(MPopup.class, MPopupKey.class, UUID.class, newAppPopup, true);
		cassandraTemplate.save(newAppPopup);
		
		MPopup detailAppPopup = new MPopup();
		detailAppPopup.setID(UUID.randomUUID());
		detailAppPopup.setAd_Client_ID(systemClientID);
		detailAppPopup.setAd_Org_ID(systemOrgID);
		detailAppPopup.setAd_App_ID(systemAppID);
		detailAppPopup.setCreated(new Date());
		detailAppPopup.setCreatedBy(systemUserID);
		detailAppPopup.setUpdated(new Date());
		detailAppPopup.setUpdatedBy(systemUserID);
		detailAppPopup.setVersion(1);
		detailAppPopup.setActive(true);
		detailAppPopup.setFragment("detail");
		detailAppPopup.setName("Thông tin chi tiết ứng dụng");
		detailAppPopup.setPopupClass("com.viettel.webui.view.popup.AppDetailPopup");
//		em.persist(detailAppPopup);
//		commonRepo.save(MPopup.class, MPopupKey.class, UUID.class, detailAppPopup, true);
		cassandraTemplate.save(detailAppPopup);
		
		// App View Popup
		MViewPopup newAppViewPopup = new MViewPopup();
		newAppViewPopup.setID(UUID.randomUUID());
		newAppViewPopup.setAd_Client_ID(systemClientID);
		newAppViewPopup.setAd_Org_ID(systemOrgID);
		newAppViewPopup.setAd_App_ID(systemAppID);
		newAppViewPopup.setAd_View_ID(appView.getID());
		newAppViewPopup.setAd_Popup_ID(newAppPopup.getID());
//		em.persist(newAppViewPopup);
//		commonRepo.save(MViewPopup.class, MViewPopupKey.class, UUID.class, newAppViewPopup, true);
		cassandraTemplate.save(newAppViewPopup);
		
		MViewPopup detailAppViewPopup = new MViewPopup();
		detailAppViewPopup.setID(UUID.randomUUID());
		detailAppViewPopup.setAd_Client_ID(systemClientID);
		detailAppViewPopup.setAd_Org_ID(systemOrgID);
		detailAppViewPopup.setAd_App_ID(systemAppID);
		detailAppViewPopup.setAd_View_ID(appView.getID());
		detailAppViewPopup.setAd_Popup_ID(detailAppPopup.getID());
//		em.persist(detailAppViewPopup);
//		commonRepo.save(MViewPopup.class, MViewPopupKey.class, UUID.class, detailAppViewPopup, true);
		cassandraTemplate.save(detailAppViewPopup);
		
		/* View View */
		MView viewView = new MView();
		viewView.setID(UUID.randomUUID());
		viewView.setAd_Client_ID(systemClientID);
		viewView.setAd_Org_ID(systemOrgID);
		viewView.setAd_App_ID(systemAppID);
		viewView.setCreated(new Date());
		viewView.setCreatedBy(systemUserID);
		viewView.setUpdated(new Date());
		viewView.setUpdatedBy(systemUserID);
		viewView.setVersion(1);
		viewView.setActive(true);
		viewView.setCode("view");
		viewView.setName("Chức năng");
		viewView.setDescription("Quản lý danh mục chức năng");
		viewView.setFragment("view");
		viewView.setAddFragment("new");
		viewView.setDetailFragment("detail");
		viewView.setSimplePopup(false);
		viewView.setIcon("img/user.svg");
		viewView.setSeqNo(1);
		viewView.setMenu(true);
		viewView.setSummary(false);
		viewView.setViewClass("com.viettel.webui.view.ViewView");
//		em.persist(viewView);
//		commonRepo.save(MView.class, MViewKey.class, UUID.class, viewView, true);
		cassandraTemplate.save(viewView);
		
		// View View_Role
		MViewRole newViewViewRole = new MViewRole();
		newViewViewRole.setID(UUID.randomUUID());
		newViewViewRole.setAd_Client_ID(systemClientID);
		newViewViewRole.setAd_Org_ID(systemOrgID);
		newViewViewRole.setAd_App_ID(systemAppID);
		newViewViewRole.setAd_View_ID(viewView.getID());
		newViewViewRole.setAd_Role_ID(systemRoleID);
//		em.persist(newViewViewRole);
//		commonRepo.save(MViewRole.class, MViewRoleKey.class, UUID.class, newViewViewRole, true);
		cassandraTemplate.save(newViewViewRole);
		
		// View Popup
		MPopup newViewPopup = new MPopup();
		newViewPopup.setID(UUID.randomUUID());
		newViewPopup.setAd_Client_ID(systemClientID);
		newViewPopup.setAd_Org_ID(systemOrgID);
		newViewPopup.setAd_App_ID(systemAppID);
		newViewPopup.setCreated(new Date());
		newViewPopup.setCreatedBy(systemUserID);
		newViewPopup.setUpdated(new Date());
		newViewPopup.setUpdatedBy(systemUserID);
		newViewPopup.setVersion(1);
		newViewPopup.setActive(true);
		newViewPopup.setFragment("new");
		newViewPopup.setName("Thêm mới chức năng");
		newViewPopup.setPopupClass("com.viettel.webui.view.popup.ViewDetailPopup");
//		em.persist(newViewPopup);
//		commonRepo.save(MPopup.class, MPopupKey.class, UUID.class, newViewPopup, true);
		cassandraTemplate.save(newViewPopup);
		
		MPopup detailViewPopup = new MPopup();
		detailViewPopup.setID(UUID.randomUUID());
		detailViewPopup.setAd_Client_ID(systemClientID);
		detailViewPopup.setAd_Org_ID(systemOrgID);
		detailViewPopup.setAd_App_ID(systemAppID);
		detailViewPopup.setCreated(new Date());
		detailViewPopup.setCreatedBy(systemUserID);
		detailViewPopup.setUpdated(new Date());
		detailViewPopup.setUpdatedBy(systemUserID);
		detailViewPopup.setVersion(1);
		detailViewPopup.setActive(true);
		detailViewPopup.setFragment("detail");
		detailViewPopup.setName("Thông tin chi tiết");
		detailViewPopup.setPopupClass("com.viettel.webui.view.popup.ViewDetailPopup");
//		em.persist(detailViewPopup);
//		commonRepo.save(MPopup.class, MPopupKey.class, UUID.class, detailViewPopup, true);
		cassandraTemplate.save(detailViewPopup);
		
		// View View Popup
		MViewPopup newViewViewPopup = new MViewPopup();
		newViewViewPopup.setID(UUID.randomUUID());
		newViewViewPopup.setAd_Client_ID(systemClientID);
		newViewViewPopup.setAd_Org_ID(systemOrgID);
		newViewViewPopup.setAd_App_ID(systemAppID);
		newViewViewPopup.setAd_View_ID(viewView.getID());
		newViewViewPopup.setAd_Popup_ID(newViewPopup.getID());
//		em.persist(newViewViewPopup);
//		commonRepo.save(MViewPopup.class, MViewPopupKey.class, UUID.class, newViewViewPopup, true);
		cassandraTemplate.save(newViewViewPopup);
		
		MViewPopup detailViewViewPopup = new MViewPopup();
		detailViewViewPopup.setID(UUID.randomUUID());
		detailViewViewPopup.setAd_Client_ID(systemClientID);
		detailViewViewPopup.setAd_Org_ID(systemOrgID);
		detailViewViewPopup.setAd_App_ID(systemAppID);
		detailViewViewPopup.setAd_View_ID(viewView.getID());
		detailViewViewPopup.setAd_Popup_ID(detailViewPopup.getID());
//		em.persist(detailViewViewPopup);
//		commonRepo.save(MViewPopup.class, MViewPopupKey.class, UUID.class, detailViewViewPopup, true);
		cassandraTemplate.save(detailViewViewPopup);
		
		System.out.println("Finish init data");
	}
	
	public void clean()
	{
//		String sql = "DROP COLUMN FAMILY AD_View_Popup";
//		em.createNamedQuery(sql).executeUpdate();
//		
//		sql = "DROP COLUMN FAMILY AD_Role_View";
//		em.createNamedQuery(sql).executeUpdate();
		
//		String sql = "DELETE FROM MView";
//		em.createQuery(sql).executeUpdate();
//		
//		sql = "DELETE FROM MPopup";
//		em.createQuery(sql).executeUpdate();
//		
//		em.flush();
	}
	
	public void valid()
	{
		//em.createQuery("UPDATE MViewPopup eo SET eo.ad_App_ID=?1").setParameter(1, EO.ROOT_ID_VALUE).executeUpdate();
//		MView v = em.find(MView.class, new MViewKey(systemClientID, UUID.fromString("1f7d4ec9-2a31-49d3-bcf0-e7fd7287d777")));
//		v.setViewClass("com.viettel.webui.view.CommonView");
//		em.merge(v);
	}
	
	public void test()
	{
//		MView v = em.find(MView.class, UUID.fromString("e549d01a-7136-43df-ab51-d6f2acf90cb9"));
//		System.out.println(v.getName());
//		
//		//MPopup p = em.find(MPopup.class, UUID.fromString("9da41390-aca6-4707-84a0-c9db0f98d522"));
//		//System.out.println(p.getName());
//		
//		List<UUID> viewIds = new ArrayList<>();
//		viewIds.add(UUID.fromString("e549d01a-7136-43df-ab51-d6f2acf90cb9"));
//		
//		String sql = "SELECT eo FROM MView eo WHERE eo.ad_View_ID IN ?1";
//		Query query0 = em.createQuery(sql);
//		query0.setParameter(1, viewIds);
//		@SuppressWarnings("unchecked")
//		List<MUser> results0 = query0.getResultList();
//		System.out.println(results0.size());
		
//		MUserRole r = em.find(MUserRole.class, systemUserRoleID);
//		System.out.println(r.getAd_User_ID());
		
//		MUser u = em.find(MUser.class, UUID.fromString("628541d3-61b8-44a4-a8eb-a6cb95e3dbf9"));
//		System.out.println(u.getName());
//		
//		ArrayList<UUID> userIds = new ArrayList<>();
//		userIds.add(UUID.fromString("628541d3-61b8-44a4-a8eb-a6cb95e3dbf9"));
		
//		String sql0 = "SELECT eo FROM MUser eo WHERE eo.userName = ?1";
//		Query query0 = em.createQuery(sql0);
//		query0.setParameter(1, "SystemAdmin");
//		List<MUser> results0 = query0.getResultList();
//		System.out.println(results0.size());
//		
//		String sql = "SELECT eo FROM MUserRole eo WHERE eo.ad_User_ID = ?1";
//		Query query = em.createQuery(sql);
//		query.setParameter(1, systemUserID);
//		List<MUserRole> results = query.getResultList();
//		System.out.println(results.size());
		
//		String sql2 = "SELECT eo FROM MViewPopup eo WHERE eo.ad_View_ID = ?1";
//		Query query2 = em.createQuery(sql2);
//		query2.setParameter(1, UUID.fromString("7d50f120-f71f-4e57-a7dd-7b96e065b19c"));
//		List<MViewRole> results2 = query2.getResultList();
//		System.out.println(results2.size());
		//System.out.println(results.get(0).getAd_User_ID());
	}
	
	public static void main(String[] args) {
		InitDB vt1 = new InitDB();
		vt1.open();
		//vt1.clean();
//		vt1.initData();
		//vt1.test();
		vt1.valid();
		vt1.close();
		
//        System.out.println(UUIDs.startOf(0));
	}
}
