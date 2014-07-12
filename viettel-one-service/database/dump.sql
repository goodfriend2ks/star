/*
SQLyog Ultimate v8.32 
MySQL - 5.1.47-community : Database - viettelone
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`viettelone` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `viettelone`;

/*Table structure for table `application` */

DROP TABLE IF EXISTS `application`;

CREATE TABLE `application` (
  `ApplicationID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(1000) NOT NULL,
  `Code` varchar(20) NOT NULL,
  `ViewAddress` varchar(255) NOT NULL,
  `ServiceAddress` varchar(255) NOT NULL,
  `ImageLink` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`ApplicationID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `application` */

insert  into `application`(`ApplicationID`,`Name`,`Code`,`ViewAddress`,`ServiceAddress`,`ImageLink`) values (1,'Portal','POT','192.168.140.46','192.168.140.46','https://cdn1.iconfinder.com/data/icons/windows-8-metro-style/26/voip_gateway.png'),(2,'Human Resources','HRM','192.168.140.46','192.168.140.46','https://cdn2.iconfinder.com/data/icons/flat-ui-icons-24-px/24/man-24-24.png'),(3,'Customer Relationship Management','CRM','192.168.140.140','192.168.140.140','https://cdn0.iconfinder.com/data/icons/iphone-black-people-svg-icons/30/clients_client_user_male_earth_man_list_customer_windows-24.png'),(4,'Business Process Management','BMP','192.168.140.24','192.168.140.24','https://cdn2.iconfinder.com/data/icons/couds/512/cloud_reload_1-24.png'),(5,'Accounting And Inventory','ACC','192.168.140.147','192.168.140.147','https://cdn4.iconfinder.com/data/icons/aiga-symbol-signs/612/aiga_cashier_bg-24.png');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `CustomerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Address` varchar(255) DEFAULT NULL,
  `BankAccount` varchar(255) DEFAULT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `createdBy` bigint(20) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `modified` date DEFAULT NULL,
  `modifiedBy` bigint(20) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `PhoneNumber` varchar(255) DEFAULT NULL,
  `TaxNo` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`CustomerID`,`Address`,`BankAccount`,`Code`,`created`,`createdBy`,`Email`,`modified`,`modifiedBy`,`Name`,`PhoneNumber`,`TaxNo`,`Type`,`value`,`id`) values (1,'Hanoi','70678578567','CUS01',NULL,NULL,'',NULL,NULL,'Tran Quoc Hung','098888888','MGFKF0968495','NORMAL',NULL,0),(2,'Hanoi','345346346565','CUS02',NULL,NULL,'quanph@viettel.com',NULL,NULL,'Pham Hong Quan','2140254545','569784596','GOLDEN',NULL,0);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `DepartmentID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ActiveDate` date NOT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `ExpiredDate` date DEFAULT NULL,
  `Image` varchar(255) DEFAULT NULL,
  `Name` varchar(255) NOT NULL,
  `EnterpriseID` bigint(20) DEFAULT NULL,
  `Parent_ID` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `enterprise_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`DepartmentID`),
  KEY `FK_209b1b8e9e3049aaa7f09a714c8` (`EnterpriseID`),
  KEY `FK_244f6ea4e0704e07aa39df83a45` (`Parent_ID`),
  CONSTRAINT `FK_209b1b8e9e3049aaa7f09a714c8` FOREIGN KEY (`EnterpriseID`) REFERENCES `enterprise` (`EnterpriseID`),
  CONSTRAINT `FK_244f6ea4e0704e07aa39df83a45` FOREIGN KEY (`Parent_ID`) REFERENCES `department` (`DepartmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`DepartmentID`,`ActiveDate`,`Code`,`ExpiredDate`,`Image`,`Name`,`EnterpriseID`,`Parent_ID`,`id`,`enterprise_id`) values (1,'2014-03-19','IT',NULL,'','IT',2,NULL,0,NULL);

/*Table structure for table `department_position` */

DROP TABLE IF EXISTS `department_position`;

CREATE TABLE `department_position` (
  `DepartmentID` bigint(20) NOT NULL,
  `PositionID` bigint(20) NOT NULL,
  `department_id` bigint(20) NOT NULL,
  `positions_id` bigint(20) NOT NULL,
  PRIMARY KEY (`DepartmentID`,`PositionID`),
  KEY `FK_f2fc1a26a670475ead5671e7dc5` (`PositionID`),
  KEY `FK_b7fb011c60534846b5448179b28` (`DepartmentID`),
  CONSTRAINT `FK_b7fb011c60534846b5448179b28` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  CONSTRAINT `FK_f2fc1a26a670475ead5671e7dc5` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department_position` */

insert  into `department_position`(`DepartmentID`,`PositionID`,`department_id`,`positions_id`) values (1,1,0,0),(1,2,0,0),(1,3,0,0);

/*Table structure for table `departmentposition` */

DROP TABLE IF EXISTS `departmentposition`;

CREATE TABLE `departmentposition` (
  `DepartmentPositionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DepartmentID` bigint(20) DEFAULT NULL,
  `PositionID` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  `position_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`DepartmentPositionID`),
  KEY `FK_34e9fdfca91848c0a00dd902059` (`DepartmentID`),
  KEY `FK_bd995983487e4deab0a1ba9c1d2` (`PositionID`),
  CONSTRAINT `FK_34e9fdfca91848c0a00dd902059` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  CONSTRAINT `FK_bd995983487e4deab0a1ba9c1d2` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `departmentposition` */

insert  into `departmentposition`(`DepartmentPositionID`,`DepartmentID`,`PositionID`,`id`,`department_id`,`position_id`) values (1,NULL,NULL,0,NULL,NULL),(2,NULL,NULL,0,NULL,NULL),(3,1,1,0,NULL,NULL),(4,1,2,0,NULL,NULL),(5,1,3,0,NULL,NULL);

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `EmployeeID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Address` varchar(255) DEFAULT NULL,
  `Birth` date DEFAULT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `createdBy` bigint(20) DEFAULT NULL,
  `modified` date DEFAULT NULL,
  `modifiedBy` bigint(20) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `enterprise_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`EmployeeID`,`Address`,`Birth`,`Code`,`created`,`createdBy`,`modified`,`modifiedBy`,`Name`,`value`,`id`,`enterprise_id`) values (1,'Hanoi','1988-01-01','VN01',NULL,NULL,NULL,NULL,'Nguyen Van A',NULL,0,NULL);

/*Table structure for table `employee_departmentposition` */

DROP TABLE IF EXISTS `employee_departmentposition`;

CREATE TABLE `employee_departmentposition` (
  `EmployeeID` bigint(20) NOT NULL,
  `DepartmentPositionID` bigint(20) NOT NULL,
  `employee_id` bigint(20) NOT NULL,
  `departmentPosition_id` bigint(20) NOT NULL,
  PRIMARY KEY (`EmployeeID`,`DepartmentPositionID`),
  KEY `FK_7e8b02171a194159af3b4049bcb` (`DepartmentPositionID`),
  KEY `FK_3d18d93d2fcc4ab99918d16687c` (`EmployeeID`),
  CONSTRAINT `FK_3d18d93d2fcc4ab99918d16687c` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmployeeID`),
  CONSTRAINT `FK_7e8b02171a194159af3b4049bcb` FOREIGN KEY (`DepartmentPositionID`) REFERENCES `departmentposition` (`DepartmentPositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee_departmentposition` */

insert  into `employee_departmentposition`(`EmployeeID`,`DepartmentPositionID`,`employee_id`,`departmentPosition_id`) values (1,3,0,0),(1,4,0,0),(1,5,0,0);

/*Table structure for table `enterprise` */

DROP TABLE IF EXISTS `enterprise`;

CREATE TABLE `enterprise` (
  `EnterpriseID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ActiveDate` date NOT NULL,
  `Code` varchar(255) NOT NULL,
  `ExpireDate` date DEFAULT NULL,
  `Image` varchar(255) DEFAULT NULL,
  `Name` varchar(255) NOT NULL,
  `Slogan` varchar(255) DEFAULT NULL,
  `ParentID` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `expiredDate` date DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`EnterpriseID`),
  KEY `FK_5747c4776143486ca6c8b1ff934` (`ParentID`),
  CONSTRAINT `FK_5747c4776143486ca6c8b1ff934` FOREIGN KEY (`ParentID`) REFERENCES `enterprise` (`EnterpriseID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `enterprise` */

insert  into `enterprise`(`EnterpriseID`,`ActiveDate`,`Code`,`ExpireDate`,`Image`,`Name`,`Slogan`,`ParentID`,`id`,`expiredDate`,`parent_id`) values (1,'2014-03-19','ViettelICT',NULL,'vtict.svg','ViettelICT','',NULL,0,NULL,NULL),(2,'2014-03-19','VTHCM',NULL,'','Viettel HCM','',1,0,NULL,NULL),(3,'2014-03-19','VTSOFT',NULL,'','Viettel Soft','',1,0,NULL,NULL);

/*Table structure for table `inout` */

DROP TABLE IF EXISTS `inout`;

CREATE TABLE `inout` (
  `InOutID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(255) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `createdBy` bigint(20) DEFAULT NULL,
  `DateExecute` datetime DEFAULT NULL,
  `modified` date DEFAULT NULL,
  `modifiedBy` bigint(20) DEFAULT NULL,
  `OnlinePayment` tinyint(1) DEFAULT NULL,
  `Type` int(11) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `CustomerID` bigint(20) DEFAULT NULL,
  `EmployeeID` bigint(20) DEFAULT NULL,
  `WarehouseID` bigint(20) NOT NULL,
  PRIMARY KEY (`InOutID`),
  KEY `FK_21edf01bb324464ea4774a00cd0` (`CustomerID`),
  KEY `FK_02decb11a5934c4e9100d9bbbac` (`EmployeeID`),
  KEY `FK_4b1ef8dd3d034c9a8900d19abb0` (`WarehouseID`),
  CONSTRAINT `FK_4b1ef8dd3d034c9a8900d19abb0` FOREIGN KEY (`WarehouseID`) REFERENCES `warehouse` (`WarehouseID`),
  CONSTRAINT `FK_02decb11a5934c4e9100d9bbbac` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmployeeID`),
  CONSTRAINT `FK_21edf01bb324464ea4774a00cd0` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `inout` */

insert  into `inout`(`InOutID`,`Code`,`created`,`createdBy`,`DateExecute`,`modified`,`modifiedBy`,`OnlinePayment`,`Type`,`value`,`CustomerID`,`EmployeeID`,`WarehouseID`) values (1,'IN01',NULL,NULL,'2014-03-20 09:04:30',NULL,NULL,1,1,NULL,2,1,1),(3,'IN02',NULL,NULL,'2014-03-20 15:12:07',NULL,NULL,0,1,NULL,2,1,2);

/*Table structure for table `inoutline` */

DROP TABLE IF EXISTS `inoutline`;

CREATE TABLE `inoutline` (
  `InOutLineID` bigint(20) NOT NULL AUTO_INCREMENT,
  `created` date DEFAULT NULL,
  `createdBy` bigint(20) DEFAULT NULL,
  `Discount` decimal(19,2) DEFAULT NULL,
  `modified` date DEFAULT NULL,
  `modifiedBy` bigint(20) DEFAULT NULL,
  `Quantity` decimal(19,2) DEFAULT NULL,
  `RatioWithDefault` decimal(19,2) DEFAULT NULL,
  `UnitMoney` varchar(255) DEFAULT NULL,
  `UnitPrice` decimal(19,2) NOT NULL,
  `UnitProduct` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `InOutID` bigint(20) DEFAULT NULL,
  `ProductID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`InOutLineID`),
  KEY `FK_080a62323a554fbdb4e1398a4ab` (`InOutID`),
  KEY `FK_f3f9258ff25f4b1d8ead3d8d918` (`ProductID`),
  CONSTRAINT `FK_f3f9258ff25f4b1d8ead3d8d918` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  CONSTRAINT `FK_080a62323a554fbdb4e1398a4ab` FOREIGN KEY (`InOutID`) REFERENCES `inout` (`InOutID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `inoutline` */

insert  into `inoutline`(`InOutLineID`,`created`,`createdBy`,`Discount`,`modified`,`modifiedBy`,`Quantity`,`RatioWithDefault`,`UnitMoney`,`UnitPrice`,`UnitProduct`,`value`,`InOutID`,`ProductID`) values (4,NULL,NULL,NULL,NULL,NULL,'1.00','1.00',NULL,'1000.00',NULL,NULL,1,1),(9,NULL,NULL,NULL,NULL,NULL,'1.00','1.00',NULL,'10000.00',NULL,NULL,3,13);

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `MenuID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(10) NOT NULL,
  `Description` longtext,
  `IsActive` tinyint(1) NOT NULL,
  `IsSummary` tinyint(1) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `ViewClass` longtext,
  `ParentMenuId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`MenuID`),
  KEY `FK_3735c2544d664c59a7960e99f13` (`ParentMenuId`),
  CONSTRAINT `FK_3735c2544d664c59a7960e99f13` FOREIGN KEY (`ParentMenuId`) REFERENCES `menu` (`MenuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `menu` */

/*Table structure for table `popup` */

DROP TABLE IF EXISTS `popup`;

CREATE TABLE `popup` (
  `PopupID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `PopupClass` varchar(2000) NOT NULL,
  `Active` tinyint(1) NOT NULL DEFAULT '1',
  `Fragment` varchar(100) NOT NULL,
  PRIMARY KEY (`PopupID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `popup` */

insert  into `popup`(`PopupID`,`Name`,`PopupClass`,`Active`,`Fragment`) values (1,'new.user','com.viettel.webui.view.popup.NewUserPFS',1,'new'),(2,'detail.user','com.viettel.webui.view.popup.DetailUserPFS',1,'detail'),(3,'new.view','com.viettel.webui.view.PopupView',1,'detail'),(5,'new.enterprise','com.viettel.webui.view.PopupEnterprise',1,'detail'),(6,'new.viewgroup','com.viettel.webui.view.PopupGroupView',1,'detail'),(7,'detail.enterprise','com.viettel.webui.view.PopupEnterprise',1,'detail'),(8,'detail.department','com.viettel.webui.view.PopupDepartment',1,'detail'),(9,'detail.employee','com.viettel.webui.view.PopupEmployee',0,'detail'),(10,'new.inout','com.viettel.webui.view.PopupInOut',1,'detail'),(17,'new.customer','com.viettel.webui.view.PopupCustomer',1,'detail'),(18,'new.product','com.viettel.webui.view.PopupProduct',1,'detail'),(19,'new.warehouse','com.viettel.webui.view.PopupWarehouse',1,'detail'),(20,'app.detail','com.viettel.webui.view.popup.DetailApplicationPFS',1,'detail');

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `PositionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `NumberLimit` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`PositionID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `position` */

insert  into `position`(`PositionID`,`Code`,`Name`,`NumberLimit`,`id`) values (1,'NV','Nhan vien',9223372036854775807,0),(2,'GD','Giam Doc',9223372036854775807,0),(3,'TP','Truong phong',9223372036854775807,0);

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `ProductID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(255) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `createdBy` bigint(20) DEFAULT NULL,
  `DateExpire` date DEFAULT NULL,
  `DateOfManufacture` date DEFAULT NULL,
  `modified` date DEFAULT NULL,
  `modifiedBy` bigint(20) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `Vender` varchar(255) DEFAULT NULL,
  `DepartmentID` bigint(20) DEFAULT NULL,
  `vendor` varchar(255) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  `enterprise_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ProductID`),
  KEY `FK_64056ce8e02641a29567db4ed93` (`DepartmentID`),
  CONSTRAINT `FK_64056ce8e02641a29567db4ed93` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`ProductID`,`Code`,`created`,`createdBy`,`DateExpire`,`DateOfManufacture`,`modified`,`modifiedBy`,`Name`,`value`,`Vender`,`DepartmentID`,`vendor`,`department_id`,`enterprise_id`) values (1,'IP3G',NULL,NULL,'2014-03-19','2014-03-19',NULL,NULL,'iPhone 3G',NULL,'Apple',1,NULL,NULL,NULL),(2,'IP4',NULL,NULL,'2014-03-19','2014-03-19',NULL,NULL,'iPhone4',NULL,'Apple',1,NULL,NULL,NULL),(3,'GLX3',NULL,NULL,'2014-03-19','2014-03-19',NULL,NULL,'Galaxy Note 3',NULL,'',NULL,NULL,NULL,NULL),(4,'IP5S',NULL,NULL,'2014-03-20','2014-03-20',NULL,NULL,'IP5 S',NULL,'Viettel',NULL,NULL,NULL,NULL),(13,'IPD3',NULL,NULL,'2014-03-18','2014-03-02',NULL,NULL,'IPad3',NULL,'Apple',NULL,NULL,NULL,NULL);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `RoleID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(200) NOT NULL,
  `Code` varchar(60) NOT NULL,
  `Description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`RoleID`,`Name`,`Code`,`Description`) values (1,'Administrator','ROLE_PORTAL_ADMIN','Administrator'),(2,'User','ROLE_PORTAL_USER','Vai trò người dùng'),(4,'Người dùng thử nghiệm','ROLE_PORTAL_TEST','Người dùng thử nghiệm ngày hôm nay');

/*Table structure for table `role_view` */

DROP TABLE IF EXISTS `role_view`;

CREATE TABLE `role_view` (
  `RoleID` bigint(20) NOT NULL,
  `ViewID` bigint(20) NOT NULL,
  PRIMARY KEY (`RoleID`,`ViewID`),
  KEY `FK_c65cd2bcc8dd47a7ae482bbbf64` (`ViewID`),
  KEY `FK_6c26717b0ae1433c8414fce7d6e` (`RoleID`),
  CONSTRAINT `FK_6c26717b0ae1433c8414fce7d6e` FOREIGN KEY (`RoleID`) REFERENCES `role` (`RoleID`),
  CONSTRAINT `FK_c65cd2bcc8dd47a7ae482bbbf64` FOREIGN KEY (`ViewID`) REFERENCES `view` (`ViewID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_view` */

insert  into `role_view`(`RoleID`,`ViewID`) values (1,1),(2,1),(1,3),(2,3),(1,4),(2,4),(1,5),(2,5),(1,6),(2,6),(1,7),(2,7),(1,8),(2,8),(1,9),(2,9),(1,10),(1,11),(1,26),(1,27),(1,28),(1,29),(1,30),(1,31),(1,33);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `UserID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(1000) NOT NULL,
  `Username` varchar(256) NOT NULL,
  `Password` varchar(256) NOT NULL,
  `DOB` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Email` varchar(256) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=3047 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`UserID`,`Name`,`Username`,`Password`,`DOB`,`Email`) values (9,'Vũ Việt Hưng','hungvv','e10adc3949ba59abbe56e057f20f883e','2013-12-20 15:39:23','hungvv@viettel.com.vn'),(3013,'123456','nhihp','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','nhihp@viettel.com.vn'),(3014,'Hoàng Phương Nhi','nhihp1','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','nhihp@viettel.com.vn'),(3015,'Nguyễn Đức Hải','haind','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','haind25@viettel.com.vn'),(3016,'Nguyễn Văn Thanh','thanhnv','e10adc3949ba59abbe56e057f20f883e','1991-10-01 00:00:00','thanhnv60@viettel.com.vn'),(3017,'Hung','hungvv','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','1'),(3018,'Kim Ha Triung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-08 00:00:00','trungkh@viettel.com.vn'),(3019,'Luong Thi Huyen','huyenlt','e10adc3949ba59abbe56e057f20f883e','2014-01-15 00:00:00','huyenlt14'),(3020,'Luong Thi Huyen','huyenlt','e10adc3949ba59abbe56e057f20f883e','2014-01-15 00:00:00','huyenlt14'),(3021,'Nguyen Van Phuc','phucnv','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','phucnv18@viettel.com.vn'),(3022,'Nguyen Ngoc Thuan','thuannn','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thuannn'),(3023,'Nguyen Ngoc Thuan','thuannn','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thuannn'),(3024,'Nguyen Ngoc Thuan','thuannn','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thuannn'),(3025,'Nguyen Ngoc Thuan','thuannn','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thuannn'),(3026,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-31 00:00:00','trungkh'),(3027,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 00:00:00','trungkh'),(3028,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 00:00:00','trungkh'),(3029,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-31 00:00:00','trungkh'),(3030,'Kim Ha Trung','thanh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 15:54:03','trungkh'),(3031,'Tran Van Tho','thotvdeptrai','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thotv@viettel.com.vn'),(3032,'Đỗ Thị Nhẫn','nhandt4','e10adc3949ba59abbe56e057f20f883e','2014-02-17 09:41:30','nhandt4@viettel.com.vn'),(3033,'khangpn','khangpn','e10adc3949ba59abbe56e057f20f883e','2014-02-16 00:00:00','khangpn'),(3034,'coucou','coucou','e10adc3949ba59abbe56e057f20f883e','2014-03-18 00:00:00','coucou@gmail.com'),(3035,'Hoàng Thị Thơm','thomht','81dc9bdb52d04dc20036dbd8313ed055','2014-03-05 00:00:00','thomht@viettel.com.vn'),(3036,'Kim Ha Trung','trungkh','123456','2014-03-06 15:09:28','trungkh@viettel.vn'),(3037,'Kim Ha Trung','trungkh','123456','2014-03-06 15:15:53','trungkh@viettel.vn'),(3038,'Kim Ha Trung','trungkh','123456','2014-03-06 15:19:09','trungkh@viettel.vn'),(3039,'test','test','e10adc3949ba59abbe56e057f20f883e','2014-03-17 00:00:00','test@viettel.com.vn'),(3040,'test_2','test_2','e10adc3949ba59abbe56e057f20f883e','2014-03-17 00:00:00','test_2@viettel.com'),(3041,'Nguyen Thi Doan','doannt1','e10adc3949ba59abbe56e057f20f883e','2014-03-17 00:00:00','doannt1@viettel.com'),(3042,'test_4','test_4','e10adc3949ba59abbe56e057f20f883e','2014-03-18 00:00:00','test@viettel.com.vn'),(3043,'test_5','test_5','e10adc3949ba59abbe56e057f20f883e','2014-03-18 00:00:00','test_5@viettel.com.vn'),(3044,'nguyen doan','doannt11','e10adc3949ba59abbe56e057f20f883e','2014-03-21 00:00:00','doannt@viettel.com'),(3045,'test','test','098f6bcd4621d373cade4e832627b4f6','2014-03-21 00:00:00','test'),(3046,'Totoro','totoro','e10adc3949ba59abbe56e057f20f883e','2014-03-21 00:00:00','totoro@viettel.com.vn');

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `UserRoleID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ApplicationID` bigint(20) NOT NULL,
  `UserID` bigint(20) NOT NULL,
  `RoleID` bigint(20) NOT NULL,
  PRIMARY KEY (`UserRoleID`),
  KEY `FK_userrole_role` (`ApplicationID`),
  KEY `FK_user_role_user` (`UserID`),
  CONSTRAINT `FK_user_role_application` FOREIGN KEY (`ApplicationID`) REFERENCES `application` (`ApplicationID`),
  CONSTRAINT `FK_user_role_user` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`UserRoleID`,`ApplicationID`,`UserID`,`RoleID`) values (47,4,3016,2),(48,4,3016,2),(50,4,3016,2),(68,3,3016,1),(69,2,3016,1),(70,5,3016,1),(72,1,3016,1);

/*Table structure for table `view` */

DROP TABLE IF EXISTS `view`;

CREATE TABLE `view` (
  `ViewID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Active` tinyint(1) NOT NULL,
  `Code` varchar(60) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Icon` longtext,
  `Level` int(11) DEFAULT NULL,
  `Menu` tinyint(1) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `Summary` tinyint(1) NOT NULL,
  `ViewClass` varchar(255) DEFAULT NULL,
  `ParentViewId` bigint(20) DEFAULT NULL,
  `ViewGroupID` bigint(20) DEFAULT NULL,
  `Fragment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ViewID`),
  KEY `FK_6e67d5f5c80c43c5ae24489244c` (`ParentViewId`),
  KEY `FK_e55d2229df9349419c034d59b43` (`ViewGroupID`),
  KEY `FK_b93abcc5098b4db2826ca87fc99` (`ViewGroupID`),
  CONSTRAINT `FK_6e67d5f5c80c43c5ae24489244c` FOREIGN KEY (`ParentViewId`) REFERENCES `view` (`ViewID`),
  CONSTRAINT `FK_e55d2229df9349419c034d59b43` FOREIGN KEY (`ViewGroupID`) REFERENCES `view_group` (`ViewGroupID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `view` */

insert  into `view`(`ViewID`,`Active`,`Code`,`Description`,`Icon`,`Level`,`Menu`,`Name`,`Summary`,`ViewClass`,`ParentViewId`,`ViewGroupID`,`Fragment`) values (1,1,'user','User View','img/user.svg',2,1,'Người dùng',1,'',NULL,NULL,''),(3,1,'Warehouse',NULL,'img/user.svg',1,1,'Kho hàng',0,'com.viettel.webui.view.WarehouseView',6,3,'warehouse'),(4,1,'Customer',NULL,'img/user.svg',3,1,'Khách hàng',0,'com.viettel.webui.view.CustomerView',6,1,'customer'),(5,1,'Product',NULL,'img/user.svg',3,1,'Sản phẩm',0,'com.viettel.webui.view.ProductView',6,2,'product'),(6,1,'user4',NULL,'img/user.svg',3,1,'Mở rộng',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'more'),(7,1,'Department',NULL,'img/user.svg',4,1,'Phòng ban',0,'com.viettel.webui.view.DepartmentView',6,1,'department'),(8,1,'Enterprise',NULL,'img/user.svg',1,1,'Đơn vị',0,'com.viettel.webui.view.EnterpriseView',6,1,'enterprise'),(9,1,'Employee',NULL,'img/user.svg',1,1,'Nhân viên',0,'com.viettel.webui.view.EmployeeView',6,1,'employee'),(10,1,'dashboard',NULL,'img/user.svg',1,1,'Dashboard',0,'com.viettel.webui.view.UserView',NULL,NULL,'dashboard'),(11,1,'view','',NULL,2,1,'Chức năng',0,'com.viettel.webui.view.ViewDetail',27,NULL,'view'),(26,1,'application','Application menu summry','img/application24.png',5,1,'Ứng dụng',1,NULL,NULL,NULL,NULL),(27,1,'security','Security menu summary','img/lock-flat-24.png',6,1,'Bảo mật',1,NULL,NULL,NULL,NULL),(28,1,'applicationList','Application list menu',NULL,1,1,'Danh sách',0,'com.viettel.webui.view.ApplicationView',26,NULL,'apps/list'),(29,1,'applicationAccess','Application access',NULL,2,1,'Truy cập',0,'com.viettel.webui.view.ApplicationUserView',26,NULL,'apps/access'),(30,1,'role','Role list',NULL,1,1,'Vai trò',0,'com.viettel.webui.view.RoleView',27,NULL,'role'),(31,1,'viewgroup',NULL,NULL,3,1,'Nhóm chức năng',0,'com.viettel.webui.view.GroupViewDetail',27,NULL,'viewgroup'),(33,1,'InOut',NULL,'img/user.svg',4,1,'Nhập/Xuất kho',0,'com.viettel.webui.view.InOutView',6,3,'inout');

/*Table structure for table `view_group` */

DROP TABLE IF EXISTS `view_group`;

CREATE TABLE `view_group` (
  `ViewGroupID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(255) DEFAULT NULL,
  `Level` int(11) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `ViewID` bigint(20) NOT NULL,
  PRIMARY KEY (`ViewGroupID`),
  KEY `FK_viewgroup_view` (`ViewID`),
  CONSTRAINT `FK_viewgroup_view` FOREIGN KEY (`ViewID`) REFERENCES `view` (`ViewID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `view_group` */

insert  into `view_group`(`ViewGroupID`,`Code`,`Level`,`Name`,`ViewID`) values (1,'gr1',1,'Cơ cấu - Tổ chức',6),(2,'gr2',3,'Mua bán',6),(3,'gr3',9,'Hàng hóa - Vật tư',6);

/*Table structure for table `view_popup` */

DROP TABLE IF EXISTS `view_popup`;

CREATE TABLE `view_popup` (
  `ViewID` bigint(20) NOT NULL,
  `PopupID` bigint(20) NOT NULL,
  PRIMARY KEY (`ViewID`,`PopupID`),
  KEY `FK_viewpopup_popup` (`PopupID`),
  CONSTRAINT `FK_viewpopup_view` FOREIGN KEY (`ViewID`) REFERENCES `view` (`ViewID`),
  CONSTRAINT `FK_viewpopup_popup` FOREIGN KEY (`PopupID`) REFERENCES `popup` (`PopupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `view_popup` */

insert  into `view_popup`(`ViewID`,`PopupID`) values (10,1),(10,2),(11,3),(31,6),(8,7),(7,8),(9,9),(33,10),(4,17),(5,18),(3,19),(28,20);

/*Table structure for table `warehouse` */

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `WarehouseID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Code` varchar(255) NOT NULL,
  PRIMARY KEY (`WarehouseID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `warehouse` */

insert  into `warehouse`(`WarehouseID`,`Name`,`Code`) values (1,'Kho A','KA'),(2,'Kho B','KB');

/*Table structure for table `web_service` */

DROP TABLE IF EXISTS `web_service`;

CREATE TABLE `web_service` (
  `WebServiceID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ApplicationID` bigint(20) NOT NULL,
  `Name` varchar(500) NOT NULL,
  `Path` varchar(2000) DEFAULT NULL,
  `ServiceInterface` varchar(5000) DEFAULT NULL,
  `Namespace` varchar(2000) DEFAULT NULL,
  `PortName` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`WebServiceID`),
  KEY `FK_applicationservice_application` (`ApplicationID`),
  CONSTRAINT `FK_applicationservice_application` FOREIGN KEY (`ApplicationID`) REFERENCES `application` (`ApplicationID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `web_service` */

insert  into `web_service`(`WebServiceID`,`ApplicationID`,`Name`,`Path`,`ServiceInterface`,`Namespace`,`PortName`) values (1,1,'RoleServiceEndPointService','http://localhost:6080/viettel-one-service/ws/role?wsdl','com.viettel.backend.ws.api.RoleWS','http://ws.backend.viettel.com/','RoleServiceEndPointPort');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
