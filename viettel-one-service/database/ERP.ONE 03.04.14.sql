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

/*Table structure for table `app_file` */

DROP TABLE IF EXISTS `app_file`;

CREATE TABLE `app_file` (
  `AppFileID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AppName` varchar(255) DEFAULT NULL,
  `Created` date DEFAULT NULL,
  `CreatedBy` bigint(20) DEFAULT NULL,
  `Modified` date DEFAULT NULL,
  `ModifiedBy` bigint(20) DEFAULT NULL,
  `RealName` varchar(255) DEFAULT NULL,
  `Value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AppFileID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `app_file` */

insert  into `app_file`(`AppFileID`,`AppName`,`Created`,`CreatedBy`,`Modified`,`ModifiedBy`,`RealName`,`Value`) values (1,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/en_2.png',NULL),(2,'Ä‘Ã­nh Æ°á»›c-nhÆ° quá»³nh,trÆ°á»ng vÅ©[DQ1] - YouTube.MP4','2014-03-28',3016,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/Ä‘Ã­nh Æ°á»›c-nhÆ° quá»³nh,trÆ°á»ng vÅ©[DQ1] - YouTube.MP4',NULL),(3,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(4,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(5,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2fd17d4f-c965-48ea-8f62-49a039029f22png',NULL),(6,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/23618a66-5126-40a0-82d4-e02afe270672.png',NULL),(7,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/10292869-f795-4e89-b071-74b1a719b72d.png',NULL),(8,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/61901890-79e6-48fb-bfcd-c3d4cce2c925.png',NULL),(9,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e427739c-d2b0-4191-9dcd-b901e85fcb72.png',NULL),(10,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f6677bf3-a5d5-4386-8994-46e7c6f53771.png',NULL),(11,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/da656388-d5e1-41ac-9c70-f9817f570173.png',NULL),(12,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8390a422-691f-4e1f-aa71-c840cc074f00.png',NULL),(13,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/4ce368d3-bc3a-4615-8375-ab3bc563dbaf.png',NULL),(14,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d573de1e-efd3-436e-ad83-ab545be65c1e.png',NULL),(15,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/a8e1bf61-2646-464f-b8ca-18b96387577e.png',NULL),(16,'e_1.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/365107cf-2d8d-422b-b52c-b4c18f895966.png',NULL),(17,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d630ebe4-7b4d-4722-a169-98ba07fe12bf.png',NULL),(18,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/1a2f57fd-88ed-4ae3-94a4-4812e2592bb2.png',NULL),(19,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f7c2027f-f5ee-4b07-bb66-6bafd3c282be.png',NULL),(20,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/3bfb6364-6f53-4902-8a14-a3fd6147efbf.png',NULL),(21,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2ffb8e86-db86-4309-ba47-24b40a08ada7.png',NULL),(22,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/fc3271b2-1db0-4990-80bf-15b3acfd5eee.png',NULL),(23,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e5de3115-bded-4de2-8a49-d4a22524f0ee.png',NULL),(24,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/29c36de1-2c73-4849-adb1-baac6526a2d5.png',NULL),(25,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/42cf16ed-35f9-4782-8268-d9dbf5b3fe21.png',NULL),(26,'en_2.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e866f086-2cef-40b6-8f82-789ed5aaa14c.png',NULL),(27,'e_1.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/603d9cb0-9f6c-4508-a768-bf1c5f6e3e48.png',NULL),(28,'MyCompare.java','2014-04-02',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/5235223c-d5e3-442d-ba61-63c79bc11199.java',NULL),(29,'e_2.png','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/bc6d5811-9846-489c-bd86-f6e1b10b3f7a.png',NULL),(30,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/53923696-aad9-4c88-8181-e7845bcf0891.jpeg',NULL),(31,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8fe46fe5-d5a7-48e3-851d-fa2d464e1ff8.jpeg',NULL),(32,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/ffaeb9fd-abb7-4dcd-89ef-8213f5fd6d5c.jpeg',NULL),(33,'default.jpeg','2014-04-03',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/c5ad7812-de19-49c9-9f13-47f499af7d89.jpeg',NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

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
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`CustomerID`,`Address`,`BankAccount`,`Code`,`created`,`createdBy`,`Email`,`modified`,`modifiedBy`,`Name`,`PhoneNumber`,`TaxNo`,`Type`,`value`) values (1,'HÃ  Ná»™i','2154545','CUA',NULL,NULL,'a@jkdhfjdhf.com',NULL,NULL,'Ã”ng A',NULL,NULL,NULL,NULL),(2,'ABC','5467567','CUB',NULL,NULL,'b@fkgjfkg.com',NULL,NULL,'Anh B',NULL,NULL,NULL,NULL),(3,'','','',NULL,NULL,'',NULL,NULL,'NhÃ  PhÃ¢n phá»‘i bÃ¡n láº» Ä‘iá»‡n thoáº¡i IPHONE 10',NULL,NULL,NULL,NULL),(4,'','','',NULL,NULL,'',NULL,NULL,'BÃ¡n Äiá»‡n THoáº¡i',NULL,NULL,NULL,NULL);

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
  PRIMARY KEY (`DepartmentID`),
  KEY `FK_4732b0f318bc40628f47eb2ce61` (`EnterpriseID`),
  KEY `FK_2d9206cfc6ca45f6b2068c0b8cd` (`Parent_ID`),
  CONSTRAINT `FK_2d9206cfc6ca45f6b2068c0b8cd` FOREIGN KEY (`Parent_ID`) REFERENCES `department` (`DepartmentID`),
  CONSTRAINT `FK_4732b0f318bc40628f47eb2ce61` FOREIGN KEY (`EnterpriseID`) REFERENCES `enterprise` (`EnterpriseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `department_position` */

DROP TABLE IF EXISTS `department_position`;

CREATE TABLE `department_position` (
  `DepartmentID` bigint(20) NOT NULL,
  `PositionID` bigint(20) NOT NULL,
  PRIMARY KEY (`DepartmentID`,`PositionID`),
  KEY `FK_e0b449a5f2a54d81914235aa07c` (`PositionID`),
  KEY `FK_0825892a1d2e4e82b81173567be` (`DepartmentID`),
  CONSTRAINT `FK_0825892a1d2e4e82b81173567be` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  CONSTRAINT `FK_e0b449a5f2a54d81914235aa07c` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department_position` */

/*Table structure for table `departmentposition` */

DROP TABLE IF EXISTS `departmentposition`;

CREATE TABLE `departmentposition` (
  `DepartmentPositionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DepartmentID` bigint(20) DEFAULT NULL,
  `PositionID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`DepartmentPositionID`),
  KEY `FK_21b79627083c4a49aac8bf0b786` (`DepartmentID`),
  KEY `FK_de4adff0160340acb63424a6d31` (`PositionID`),
  CONSTRAINT `FK_de4adff0160340acb63424a6d31` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`),
  CONSTRAINT `FK_21b79627083c4a49aac8bf0b786` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `departmentposition` */

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
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `employee_departmentposition` */

DROP TABLE IF EXISTS `employee_departmentposition`;

CREATE TABLE `employee_departmentposition` (
  `EmployeeID` bigint(20) NOT NULL,
  `DepartmentPositionID` bigint(20) NOT NULL,
  PRIMARY KEY (`EmployeeID`,`DepartmentPositionID`),
  KEY `FK_2d437efca5ad45d8b00127ab603` (`DepartmentPositionID`),
  KEY `FK_4c5073d2bec844ea89b15be6761` (`EmployeeID`),
  CONSTRAINT `FK_4c5073d2bec844ea89b15be6761` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmployeeID`),
  CONSTRAINT `FK_2d437efca5ad45d8b00127ab603` FOREIGN KEY (`DepartmentPositionID`) REFERENCES `departmentposition` (`DepartmentPositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee_departmentposition` */

/*Table structure for table `enterprise` */

DROP TABLE IF EXISTS `enterprise`;

CREATE TABLE `enterprise` (
  `EnterpriseID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ActiveDate` date NOT NULL,
  `Code` varchar(255) NOT NULL,
  `Content` longblob,
  `ExpireDate` date DEFAULT NULL,
  `Image` varchar(255) DEFAULT NULL,
  `Name` varchar(255) NOT NULL,
  `Slogan` varchar(255) DEFAULT NULL,
  `ParentID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`EnterpriseID`),
  KEY `FK_ee3c2101c64942a596d2409e6aa` (`ParentID`),
  CONSTRAINT `FK_ee3c2101c64942a596d2409e6aa` FOREIGN KEY (`ParentID`) REFERENCES `enterprise` (`EnterpriseID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `enterprise` */

insert  into `enterprise`(`EnterpriseID`,`ActiveDate`,`Code`,`Content`,`ExpireDate`,`Image`,`Name`,`Slogan`,`ParentID`) values (1,'2014-04-03','dfgdfg','¬í\0sr\0\"javax.sql.rowset.serial.SerialBlobŽøkQŒ’ç\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0Ô\0\0\0\0\0\0Ôpur\0[B¬óøTà\0\0xp\0\0ÔÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0„\0	\Z((!\Z%!2!%)1...383,7(-/+\n\n\n\r2% %5,,2742,-,/,,,,,,,,0/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ÿÀ\0\0Ã\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\0G\0	\0\0\0\0Q!1q2Aa‘±\"R“¡3BTbr’ÑÒ#CSU¢Á‚²â4sÂ$c£ÿÄ\0\Z\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\04\0\0\0\0\0!1Q¡2ARa‘ÑðBq±á\"SÁb3CÿÚ\0\0\0?\0ûk,7 Ë\0Èw `ä!Ü€d;0‡rî@À2ÈC¹\0Èw `ä!Ü€d;0‡rî@À2ÈC¹\0Èw `ä!Ü€d;0‡rî@À2ÈC¹\0Èw `ä!Ü€d;0‡rî@À2È%L\'s>(*ÇÀrA’	ôÌø «ÉH$OÒw3â‚¬|$          ðç\0.M†h#Öë]7ÚTÇqÄ4ã=Ì¹SŒvŸc=õXiÖÐ‰Uå.½4Ÿu€ï üã™íé<1ÓyMŸÊ¬cæé\\~ô¾\0©Fž|T[ÒÕöWÍ¬ï*Ïê¥o½\'ÿ\0UÞïñCñi÷|ÿ\0¦#Ê¬ŸUo¼?¥;¿ÄüZ}ß7º?*Þµ\'tßàµ;¿ÅØô·<ÿ\0¦üT©ON›Ë‡ˆQì,º=)‹Û­I¯š:Oãà9=®oÆÖø¨N+Ç±¢ºìüËÔuðÌ/ŒfÇx(LLuh­ënuÛ‰ˆ$OÒw3â‚¬|$        æ´Þ¼QRÜí>„~•kº#¾ýŠÊâµ™3k°âå3¼ü6–ò™W%Å;ÏçÞw|õÁÕæeô¦Kz‘·›“¯Ò•óË$ŸyÄÉ¼±[ˆèÁ“5òzÓ»QIP€€€€€€ƒÌo- ´G\rˆäBã±3¼:®úBžÖ˜ÈÑôeýç÷Kâ«œU–¼zìÔöïúóvzÊ|°ª‰Ñ]ž›9‘ÒËªm‚}G¥)<¯y»z\nøgf8$kÛ›MíØr=…S11ÕéS%oÖwl®&       ‘?IÜÏŠ\n±ðd€€€€€ƒÖ]q¦¡»\\v’õDÓ¼eŒðhøöe1Í™5\ZÌxyO9ð|³X5Â®²áïÁþ74´x»Û»±j®*ÕâgÖåËÊghðsêÆAlÐèéç6‚\'Éž—[™‡µFmÕe1^þ¬nèèüé:Ld}ãÁ˜Š®sV)èÜöëÉZ%sœ©¿u…Þ%ª¨ñè›{lÙo’×Wÿ\0ãÿ\04ïÿ\0	ÿ\0ß—öÁþJOÑ«ØmñÆãàçá?ûòþÚ>KëórÂþeÌ=Ö#â¥êªÞŠÉ&%,êö•¡~Ò8¥iN#Žã´2÷„)qÒÜ¥OwÔáž*ÄþÎ£W|¥o×·	áµhàû#â9ŽåUðûjÛƒÒ\\ørÇïõ}ž¡’4>75ÂísMÁ„,ó=jÚ-ÃØŽˆ$OÒw3â‚¬|$    Åï\r’\0äÀÄ’„ÎÏ™k”2ìQPŸ­ÙˆòkŽY­8ðûlñµ~‘ü˜¾GÎœâI$’I¹\'y$ñ$­g~¯®/jî¨ÕVØÆÜõÊýÍíÂ8¸òÝÚwÉkÓèòfç´x¾“¡<žÑAc(Û¿7ôoÙsºÍlÖ—±‡Ñø±õç?£«Š&´´À`9\0ªnˆˆåÑÑí+ éj…ª!cþÑpäñ¼w©VÓdÁ$”næãÕj­ã&Œ—	»ée;÷ÔîÓnÒx+8âÞ³$ir`ðÏ/	ÿ\0ŽCé†T‚0º9ºH^,øÏhëiêpÜUv®Íx²ÅþcïùRQZ    ‘?IÜÏŠ\n±ðd€€ƒ\Z	q\0rNà\0âIG&vêøö½k›ªÜa§%°4ï<ÄuŸ±öœ†¼X¸yÏW­ÖÎIà§Oçúqª÷š      .:ú^¥y?lÕíã½¡Ôeý=ùÙ3{*öt~åÇ–?o¯Ñô–´\0\0\0¸À‚ÎöPjVP2B×tdgBFîsoÄv´õ´î>À»²¤Zwö½Ð=Ö³ÀÄ8Ûƒ»GåÕÛÄñ(™ö½¨è€€‚Dý\'s>(*ÇÀrA’UM3%adk·9®dGZDìå«¥7ÍzªAîÛù)qÛÅOvÃîÇÈó^ƒê{¶þIÇo»a÷cäy¯AõH=Û$ã·‰Ý°û±ò<× ú¤í¿’qÛÄîØ}ØùkÐ}RvßÉ8íâwl>ì|5è>©»oäœvñ;¶v>GšôTƒÝ·òN;xÛ»#ÍzªAîÛù\'¼Ní‡Ý“8ur‰Že,!Í7i´G\r¸§¼]>(â±òTQ\\                 ‘?IÜÏŠ\n±ðd€€ƒÓXén0µ®xk\\p‡‹º¹®ÇÅo·.¯?Ê„Œyl´a¥¤µÍÚæ‘¸‹ñWöô—“>”šÎÖ§Ÿôî´˜Š²Í\rìwž,pâ×vþaSjÍgizxsW-8ªÔÖ½e‹GÄñï6d`ØºÜI=M·ö…ÚRm*õ:šà®óÕÅþÕ¤ú«}éý*îïñyÿ\0‹O¹çý(h)(¨Ž))ðí\\×â±;…ÁwµFØv÷[‡Ò]¥â“^¿\ZoÊK©ê%‰´ÁÂ\'–b2X¸·q6\0ÛzWñ¾îfôŸgy¯O‹Å”\ZÉš]Žt€Ç9À6¸oá\'GY)é—ë¿Ñ±çž’þ•/÷þ…ÎÎ¾ò}÷7ú§ïöxóÏHÿ\0J—ûÿ\0Bvu÷Žû›ýS÷û0Ÿ^kØÒçèÉ\ZòN;Òp.Æ*ÏæFuÙ¢7œS÷û>i¤4Œ³Èé${‹œâî‘6¹½…øÔ˜¬Dlñ²e½í6™v\Z¥®u‘Å±e3ê‹\rÃ®òæ´ði°;¯{*rb¬Îûìô4ºÜ±^¯ëõÛHs¢å\0q>ŸèPì«ï5N·4ùOßìùÆšÓÕLùdqôÃq:šÛõ¢´ŠÆÏ6{ä¼ÚeÑjn·UÓ±ÐÇênq4bq,\0`}ÒsUäÇÏ}›4šÌ”Ž¯¡©×Úèš]&{\Z8¹Åàd·r®1VzY®ÚüµçýþÍÚ´ŸUo½?¥K»üU~-ÿ\0Ÿ?éR›\\ôŒ¬F9Íp»\\H#1è¨N:Çæ_]fkFñ“Ûç^”þ”ÿ\0ÄJvt÷’ïYÿ\0Õ/n™×èé¢’¢“³9Ãg´ÜÖ·¬¸¼Ün\\®8´íîme±R-jóŸfí}Yò…òº–@ú|Kás_ŠÄ4»x d¥|<1¾èiý#ÚäŠMvÝÝ*€€€€‚Dý\'s>(*ÇÀrA’Ê&¨|¥¦¢¿¾hôÚ?ŒÑÿ\0¸ãvJüY6å/7]£í#Ž—¨ÚÊh\'8îa“tìGEàf8r<•Ù)Å3EªìoÏ¤ýîÓÓzNm%Wˆ4’ó‚(Æü-¿¢ÑÛÖNd®Ö±J¡›-õ9ˆt\Z×«, Ñ±^ÆgÌÓ+ÿ\0Ñ%˜ß²>\'(RüWjÕicž<wçò—;ª?÷ôßù™þà¬ÉêË&“ÿ\0µS[ïêó¿ýÅ1ú°æ«ÿ\0µ¿YSÕ\n8¤øô“©ÐÀ,,î¿Xö(d™‰é»F’•µg|œ+ÿ\0ôªëÎ÷ßóUñO¸×ØÓýþÛ¯Õƒ\"1ÅYò§4âsÌ‚G[€ÜM‡£âª¾ûï1³vš+á­ø¿}×ŠƒKó®˜`mDÁ¢ÀJð\0êæÀ/B½!òY£l–ˆñ—Ö<”Æ¸î•äœí`/ìdÍë=ïFÄF›²U7¾®,\r¯©\r\0\r«·Ýçâ·cõaòÚÈˆÏm¼]ï‘èÛòyÝaˆÊ=d4|®ãÞ¨ÏÖ¯¢¢;9Ÿ‹¹¯`tR\0Ac‚©Ž¯Jñ½fœô îtôñ“¥Ý#|;L\rÎà‡>j‹Lïê½\\é8â{]¾ÿ\0jôªëÎ÷Ãõ¨ñO¸·±§ûüÿ\0¶Ÿ”jºwSÒGCg1bkœãè´b}ºÍŠ–æfzBÔœt­m¾ÎoSë£§®†YN5Çµì×6ö¤+2DÍf!‹I’¸óVÖèûú;ëQw¬¼CÞðûÐ÷ÑkïÃ<o{¯fƒ¼Ø~\0®M-a*j1^xkh™UQ\\   ‘?IÜÏŠ\n±ðd€€€€‚’Õ\Z\n‡ËNÜGysK˜IÌà\"ç´©ÆKGIfÉ¤Ã’wµãÝ¢unŽ”â§­w[Üà9Ä‘ì\\µín©bÓbÅêCoIèÈjcÙÔFÛÞÇ¨æÞó¼f¹˜ç	äÅL‘ÃxÞôf©PS<>\Z88—<·µ¸‰±í\nS’ÓÖUcÒaÇ;Ö¼Øé-O ¨É,\0½Ý\'9˜Žd4~ÔŒ–ˆÚ$É£Ã’ÜV¯6§ìÿ\0F ûÉ?Rïm‡éýß9?gú3ùÞIú“¶¿‰ø~ŸÝó•m\r ©¨Ã…4a˜ºFåÅÖáw8“mçwj­6ê¿x£jFÊJ+kõ;GÎòù)Û‰Æî-s™ˆž$†	íSŒ–Ž’Ë}Îöªµ\rP0G\ZÆ7ƒZ,;}½ª33=Z)JÒ6¬m\r…Äôž©PÔÈdš\0^x¸9Ì.ûØH¹íSŒ–ŽQ,Ù4˜rO«ÍGFhÈi™‚ž6±·½‡YÌž$îÎJ3iž«±ã¦8Ú±´6ˆ\\MÍ?Pta$üž×ßa$€{\0;¹+;[ø±ÎƒO3¿œ±ýŸèÏäy\'êNÚþ.~§÷|äýŸèÏäy\'êNÚþ\'áúwÎOÙþŒþA÷’~¤í¯â~§÷|äýŸèÏäy\'êNÚþ\'áúwÎOÙþŒþA÷’~¤í¯â~§÷|å¿¢5ZŠ‘øà„5ö¶\"ç<€xÛ6ö.[%­Õn-.,S½#šÊƒ@€€‚Dý\'s>(*ÇÀrA’±1J{qˆë\"¹»³3]p@@@@@@@@@AáÆÂç©§µÁÁøiÂÞ/\"øÙ«·¯ÇÊÏ®ž-±½,\Z(Û|‰~wVzíüQß³xù/îx¼;«=vþ\0û7‘ÜñxwVzíü;öo#¹âð<î¬õÛøwìÞ>GsÅàyÝYë·ðïÙ¼|Žç‹Àóº³×oà	ß³xùÏçug®ßÀ¿fñò;ž/ÎêÏ]¿€\'~Íãäw<^¯Uæ¬™»J‡\0Â=á\0»í†Yøú\Z[f¼q_§±ƒS\\Tž\Zu_[D\'é;™ñAV>’jVÒ—zQ»ƒƒ­pGªöý&üGU•w¤Ï:ÎÓ÷Õ:Z#”ó¾*}8Ðý•PØÉÕsèIÚÇð·a±UWS<#†|§ô•¶Á3TçºÀ+K8€€€€€€€‚~”Ó0SÞ¼_©ƒ{!þNåN\\ôÅå?U¸ðß\'«Në$µ7hô#õÞï¾zùpæ¼Œú»ååÒ>ú½L\ZjãçÖQV‘a«:¨M¥ªm‡Äzò/}žü—¥¥ÑoþY>__£ÏÔjÿ\0->GnªóD\'é;™ñAV>’jéC0JÐáÕ›Nm=EW“rW†Ðž<–Ç;Ö\\Uuúi$Cè‘‹íf]­ø/:Ø³éùãë÷ìú7×&ü¯Oßß6tZô8OûÌ7þ×~jTô¿\'/ ÷gæ³O­Toþ.“š[ñáñZk¬Ãok=´™cØß‹IÓ»£4g“Ûù««›ºZ>j§ã¬KÜ*cõÛø‚—x£Ã>]zR°sp“’‘Ö`ŠZzCJ}b£gØ~ï§þÛª­ªÃ_Íÿ\0…µÓeŸËÿ\0ªõÞüÓó™³ù?žþ¤z±3ä¾ºÏ­; i\rlª—s\\#nLãøŽþë,y5¹oÓ—èÕGŽ½y¡9Ä›“rx“¼žed™Ý©áÞÑ³T;,\'3Á­ûÎêñVcÅ|“µa™kŽ7´»ÝªñSÙïýäž±àÏº?ÉßÉzú}qóžrò³ê­“”r…õ±”@@@@A\"~“¹Ÿcà9 Ém-«Tõ%¸~›w÷‡â³fÒcÉÏ¤´bÔß.°ä4–©TÅrÁµnmé{Xw÷]y™tY)Óœ=zÌvëÉì ÙÀ‚8‚,G0VI§ij‰ßœ1°\\Ú,ƒÊë‚\rí¡ê\'ù¨ÜG¬}þ#þ¸ðdÉêÇÑ^LÔ§­.¯EêKcRìgÔmÃ}®â~ÑÅèúÇ;ÎìuÓ<©:¨ dm\rcCZ8\0,±o­b±´CÚm;ËØ¤à€€€€€‚Dý\'s>(*ÇÀrA’\rjÊf–6¿˜Þ9!BøéZ7N™-OVvA¬Ôšw|ÛŸeñŽã¿â±ßÑøçÕ™6ªk¯·4zH¨oÍ¾7ó»OvññY­èü‘Òb|š+®¤õ‰„Éµn±œaqû¥®ð7TN“4~UÑ©Å?™§&Ž½(eØïÉU8¯k?)Y)=&>oI‰Ã‹\\=…G†|Þ6nÈ÷&Óàîðö2’WtcyäÒWb–ž‘?$fõŽ²Ú‹AÕ;£žÖáøºÊÈÓåž•”\'>8ëhoÓê}cºMc>óÿ\0mÕµÐæž±·ßÃuVÖâŽœÕ©5\Zb{Û|Müšz:?5¾Lö×Ïå…Ê\\¤‡{búÏôÏ1}ÃØµãÒâ§Hùóf¾§%úÊ°Z$OÒw3â‚¬|$                               ‘?IÜÏŠ\n±ðd€€€€€ƒ	¥k\Z\\ò\ZÖ‚\\âl\ZIàÉ˜ˆÞPiuÛGK(“ŒN8[v¹¡ÄðÄYY8­¾ÌÕÖàµ¸bßË¡Uµ&×i¨až_÷³†ìÈáþ8›\rêQY˜ÝUóV–ŠÏYm\nèŒ»!#L¸Œ`‚àÝÛÈêÇ×6·OŽ¼\\;ól.$                 ‘?IÜÏŠ\n±ðd€€€€€‚n²hß•RËv#w;¨C…û7oìR¥¸gu9ñö˜æ›í»ç”Uu\Z%ÐE]Iã;)šx$úNkÇcà@=ªùˆ¾óYyt½ôÓZä¬L{%µ­ZUòÍPêYëøÍ±Ù6ÐÆöƒ|gÍÈ7u·[¬ÊWhâ9§©Ë6µ¦“oñðèñ°UDh*ç•Æ	Úb™¿D=®sv„²\0wú]špDïXêäj2W³Ëiÿ\0å?¯ý\\ÔzÊŠ¹jj_#ö.~#\'Ñ¶ô€êÜ\Z7u—(dˆ¬D{Zt—¾[[$Ï/cnÒG¤4{#‘ÍdôÚ\rƒý6\rùî\'½)5“S’ÕÍŽ±<¥EÐLtôÍùC±0	àßŽð»bE÷6Î\r¿Ù\nËLvqÉ—;wÛGÇõéÉÚkt¾Ž_“HöHÑ¥†ÅØw–_´_ÛeM&8¹½-Mo8§‚v—²Ï¤C4cíŽ©íÜ@g¢{À&Ü.ö+f‘]æ^}u7Ï8éIÚzÏßß±çDü»Kºy[XúvÆüÄË‹n¸Çb;ÍîoÂÖKpÓhÛsk©›[†#¤}Skµª±ú6æR%Š¨Bea¶Ñ›7ž#´qw)F:ñªÉªË8:ó‰Ûxý%ÔiÍ#3t½M‘Â7²ï`6?¼Þá×Àw*ëXà™lË’Ñ©¥byL}ZOŸWV÷K5T†8%p’}79¿Hß¢¬3ºî]«Ê!^†rd™µ­Ê&y*ëÝUE1§©‰ïÙE Æç1ÄX‘Þ9¹¹(ãˆâWk/||9\"yDórµzëW#fcÚê©\ZhÈÜDxðnís•±Š±·Ã«µ¹-XëoWôèßÓõR61Ô×:JX@”ÀßDH&I Mî7¸½ê5Ž[íÖæ´Í¸\"ÖÞ±Ïo‹R?ZÚj:×Ê÷FÉ]íêsq.pNEÏXoY]à®óUq¨Ëé–g–ûK Õ}#5m}LÍ‘ß%‹÷Q²þ‹Ü>•¹]ßënJ»Ö+XkVŸ%³fµâÆ9C³U7ˆ$OÒw3â‚¬|$      ÕÒ”-¨…ñ<¸6Fá%§¬r+±;Nèd¤^³Yö¹z\'tÑÈÇÉ,ÒˆÈ,cÜ0‹pÃ‡fà¬œÓ0ÇOGã­¢ffv{ë5\ZË3Û<ñ¶¢æXØà\Z÷Þû¸\\“c™êHË;G$­¡¬ÚÓ˜ß«KZ´‘èè¨©\"|×xôÝbcË‹‰¶÷[‡®Òñ6â•z<ÆÃŽ7ÿ\0Ž¯ChæRÁ,á@¾g‹œ{I$ûUVçvÜXã\"‘ìji]_Ž¢¢	Þç‡SL\rµœn¥pOWR•o1dÓ×%ëyö5t–¨Á5[*±ÈÉ\ZZ^\Zl$µƒº÷€±àc$ÅxP¾’–É7˜Ÿåz¢BÖ9Á¥Å ÑÅÄˆí*¶™£w!äó@¾´õìåä.;ÞÃ \\{šÕv[ï´C‡ÓŠö¦‡»Ij<²¾Håš/Î67\0×ßŽëuß‡ÅÈË1\'“CKZm1¿]›rêe!£ù+CšÌXñƒéí8c$î&Û¸pÉs´·S£Å8»/gží}¨ÐÃ4S§’Hx¸‹¼nhØÒrÌÆÈÓEJÞ/¼ÌÂž­êüt,{bsÝ´~2]n6u€Ý¹r÷›u]ƒO\\11Öö’¢eD/ŠNŒ-9‹õŽÑÇØ£´î³%\"õšÏµ¨íN]Nì4—vÜ69õawŠyüPì)½goW¢n‘ÔØ¥¨|ÌžxŒ¢Ò¶7a[~î»oRŒ“¶Ê¯£­¯7‰˜ß®Í9 ÝK¢ÝKI“—ºÛìKnq›[…·v¥[ï~)U›ãÓÎ<qºþ«è‘GK#‹EÞs‘ÛÞ{÷rW{qNí:|Q‹QUEx€€€€€‚Dý\'s>(*ÇÀrA’	ôÌø «ÉH$OÒw3â‚¬|$                               ‘?IÜÏŠ\r¶Lë\rýH<íšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mš	ò¼â<ÊÿÙ',NULL,'dfgdfg','egfffsgdfg','',NULL),(2,'2014-04-03','VT','¬í\0sr\0\"javax.sql.rowset.serial.SerialBlobŽøkQŒ’ç\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0S\0\0\0\0\0\0Spur\0[B¬óøTà\0\0xp\0\0SÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0„\0	 \Z \Z( \"&%!1!1)+...+4:3-7(0.+\n\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++ÿÀ\0\0á\0á\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\0L\0	\0\0\0\0\0!1A\"Qa#2q‘¡3BRr$4Sbs‚±²7Cc’¢³´Ã%58t„“ÁÂÄÑãÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÚ\0\0\0?\0î(ˆ€ˆˆˆ€ˆ¼M+`ˆºg´’H\0òO$ÑUüèú¿õLEãó%‘ùÝ¦ †å?h\'Í’Tô”ï?£âo¶í&KþÝr	u˜„T |¶VG~YÜüÎª7Ï-Ú–9¤>= û kõ”Š<6*MLa<ËZw‹2|J”‚µµÓH=+ÛúÉ\"À÷¯/ž®þŽ<ê^?u9Vˆ‚±•VôCû5?¾\0¾»•‡µI)ñcá#ûR4ü’ ­8ÜLuªD‘÷—Å höÉ—\'ö”ÊZ¸ë\"ÍFö½½ìpp÷‚³(UxL5’çž6çµ„ìÈ„³Ç‘A5_Èf¥ü‚ráö&…»›#lñ÷ŸØƒæØ»í“š#ì”hÍ†pÂO ‚Ñ™dÄ])\rh’M€RI<‚©¼˜Ñì—EOÞ.Ù%öq³ÇGž™@íiñ3$æ<-¼Wƒg:ö‡¨sìnïÐ<¯”¤Ht‚LMÜiˆ¸³£Žä7­œK­³:žÒÀLÐÖ´X5 \0pd@DDD@DDD@DDð‹WÔATp£Fs`®÷ÄEâ>Æc<õm…ÍË\\³Qbbi¸UM1Mkäw\'ÌÆîOÍEÆ`Òl§¬´l®ƒ%Sn9H ŽNk¤tp Žˆ3¢¨m[ð§†âg<GFÏ  ý™€ÐxH;\'‘\r6Ïn€ˆˆˆ€ˆˆˆ€¼O3iásçpkZ	s‰°\0’Iä\0^Õ4cçÊœÎüž7vI^Óëø±¤v~Ó†nA¤‡Øav3(–µ¥°´ƒN¨’VŸ{c>®ŽwjÂ;„DD@DDD@DDD@DDD@DDÐöñpt ª`NÏºÏ7¥<‰ç?šñþoî}Òøá™¶v¡ÔU„ám‚_¡~»ìž|yjÃÜMˆn{tD@DDE¾¬PÑºInCG!ÌžA­I$\0:’‚(ó[R)iÉniœ\r‹c$€ÐF¡Òæ‚9¸‚mìã`Ž0ØÀ\0\0€K\0¡áŽ¥¦&ªÆYyå˜ØeÃF´5ƒÁ‚úÝN@DDD@DDD@DDD@DDD@DDDA‚¶‘µÔ®Ž ]®\rˆê#PA\0‚59(ØMS¤Íih¬ygi¾I\0èÓs\\íu`ªñ¦\Z|µ4à—E|À^îˆÛ;@È°{G2YmŠD^Xñ#apG\";Âô€ˆˆ\n®§ñìi‘ýH@•ýÅæíŒwYï#˜!…Y¹Ù[wh­Ùö—Pq¤©Üe:XÙÖw¶1O‹PY¢\"\" \",\r¬óädŒ/û!Ã7º÷A\ZŠ¦R´\Z—µ€òÌà?zÌ€ˆˆ¢Óâ0ÔÕ¾*yct‘Û;\Zö—2ü³4‹ø©Hˆ€ˆˆˆ€ˆˆˆ€ˆˆ*°oÅ&’˜òŽÎõO¾QÊÝ‡5ì£XÞõjªñÅªàœ}WpŸ÷%!£O	Fý\0r´@DD›CépÓyÌæÅÎÇ+ÍžGˆ;¿eYa¢¬¬ô¸í;Ñ­–[÷8Ä=âwû•š\" \"\"üÇµÍ…o>º¿çI;^áÞ×ò%Á‡ï¯Ó‹‹l½1mîãTõ¢ñËØáà_ÓÇ]D7ó‰ÇŒì5E	»%“3|ã:ÈŽðº~ÕmU6ÉaBlaä£ZÑw¼Úöhÿ\0© ¥~iÚ‰¤Ápi0|NåôÕYã=ÇÞÃ 7àHWCß¦Þ^ÌGZEpïWZ‹I{éê†_Áß€or‹ÅYO;\'§|–á™˜_VÄ8óèyõÐWü$Ûpª7h&â<7¿&P]îwÞºýq¡å¾FæöØ_âƒ›lð×o7ù••B«ÒñL¥œ!iÚÃÊâîÓìíG!Ó‘“Q¾|>\nyK›>xÞcádfwZ÷p³ÈÊ-©${¯ºå›öÔÿ\0‹jË¸šv¿jñg½ ¹¯\r#P$¥À¿Ý6A¾Œ8à‚ qKóð[ÅÐ\\ºÙ²å¶¹¯ñ-‹b6Ö›m(Ÿ&™¥„Æð›{ØèH±±±¿EÍwG[uŠpØÑÃqc4–ñž,;‡e¾åçuÁ¶Ûsû1CÅqk&è<\Z\n\r£ß-¯üVµñ±ÅŽ”BÐËƒ”‹¹ã®–6Õn˜fÐÓâx¬¥”pKËÎ¡·Íšü­cbä_?â{ÁÙzêŠI)é(cl¬s2=ÀGÍ.pû.¡—S ÑRà’¼~U¼)\0Û£K©î=„}¥@‡}¸tµå™gÞÂcÈM‰[0½´¸6#iÙm±§Úlõ”ÁñBÂàã6VÛ+Cœã•Î\0\0yß¡ZN	\r8üdà†e4Ó9×·Òö¹ß¨xhÁn‹OÂ¥|_ƒ½Wâõ\08²d„~ƒÍüýôÐ¶k¶\Z£|Ÿ(üÝ›–¶¶oÑijYYJÙ)\\Ç´9®ˆ\"àƒâ\nâ.‹ãÛ·Š—4rDMßŸÖÍs­³‡‚Nžµ×PÝÖ6±´ôØ±i–0ðr›‹qæ€l94´y ÙGÄiEu‘8‘®mÇ1qkÏÉxÂªn’®sAs{nÓ|Ç’–«0?Fgˆ7;üø™j>ky ³DD°v¶ŠbyaÀ—Ì]ðVJ»9±:’z=÷DÇÞUŠ\" \"\"ÕpM‰f¶U8Œr¹Î¨,Û¹®ÐóúŸµ\"\ro÷cÚb,žynBXÌ/vÜ¢î×ÇÀ+m¶Øª}³Ã[\'™®a¼r2ÙšM¯k‚6¨l¨ƒ›àÛ¤Ž^:Œ~®z×Ene\'+lnÐnçÖ×¼K¤\" Ó¶g`cÙý­©¯†g½ÕK°€sÊ%Ðt\"Ë&Äì36F¾ªZy]!©psƒ€lç»K~°û–Ñ5K)íÇ{[~Yˆ÷ûVT\ZŽÇì+6_\Zª¨‚g<Ô»3šæ€Ûsô·Þ^6wwñ`¸ÝmA‘ÒŠÌùãsFPòòµ>±qDº‹s1RI$q×U\nY\rÝN×e=3láËêƒ§5³{O±ûQM[!šÜI%2Y¦6µÃ³ÒÌ½ù­µ•’RØÞÒáÌ.:jÚˆU™RÐö8¹®\0‚±#¢ÏXö	‚a;=<˜f#,ùÚã\r0”Ä-!Ž{\ZÐ{ƒÚ·«c~G noÝp‹Žì¨28±×c»#ÇPÜÀø‚ûw{…ÓLdùÚœÍ»Gì¸åø-š	[,w§sH\ZvH#Ù¢cçËp\\R²žI1µÇ¯‹\\Ñý•Ò0ª/›°È¡sølk3<ÝÎÊÐÛ¸ŽdÛR¤½Á%æÀjIè¼C3gmàppåpAýÈ2\"\"\" *ÚS—h\'häc…þdÌÃðªÉWz»A÷¡þÿ\0ôø ±DD¸f˜Wë[ýÄ_úVJ¶•ÙqéÛý/÷™YþZ²@DDD@Z–7¼œ7Ä#RÑÍk$v_XÒ/á{­µr\Z­¦vÒí\rU>ÅatÕNYê*r¸êÎÐÐr5$È è‘íe$»:êèg¦h»žÖ½ÙuV5¥à‹‹‹\\\rN‹6´TØÆjðéCàÄ¿+…²ß5Ã€pµEÈ7IòÚVŽ»XÎF9 éÛFë{CF¾P`xËökwØÖSëÇ ºó28Á%‡plwý¤ÃÛŠC–®– p\"9_#™#@:iÛh$ö›ÊüÂƒ…o?ÅkÛ\rPÎãfædŒôÏh=õZí©·{¹è~„KÄ\rs¡p’Y=(kƒ…»! o¤|#Ï7¡%^%³”õX–MIžEŸJC˜ç\0ë}[6ö Žˆ6_ÂcÖÃ¿â?È]Wiv¶“e£iÇgg¾Qg8›s³X	ê5åªãÿ\0„†l3	t†åÌ”“â[NJÝ·µ‘a¸õ5-+kœ	‰¯\r´aæ×ÌAÔäÔi`Û’0Ùvgmh¶¦G7¨lh¹ak­ ¾W€HÔj.5Zµ\r-+wÑ,Œ¯‘Õ&<¦—‡%‡£iú_P´Ðoyç¥–„ESC¿Jc‹C<²]?©c×R.rëâ.­ðÏö‘ŸîãFƒÆí—<SîÔ‰‰o¸®óð¼*½ÐÖUì%®\rŽGlA,a¥Ö…»smùb·û5âbYÐ¿lŸWÄáT¯‚îâÔNÐ3¹×%Ö]˜êF¤	·$j±(±}ÛÖM†HÙ#},å®i¸>ÃÞ„s.wº\r²¢Ù]‚œFçÏ!kC\\ç•‚ùX	Äé¢ƒºÉK·=Œ4f {iµýÁYî3e(ñm‹šLNž9^ù^Âç´\ZË“«uq77ööÐâðã»·­Ÿ	‘²FêZ‹8_ó/Ðƒ¨>µ_ÁÏM†—ýéÿ\0ÝB´ÝØHbÙ ‚\'f‰HZz_…;s} Æÿ\0UyÙŠ×Ðn½Ô¤‚ê’ÂGÙx§c½í$y êÒïO\n‹àº±™¯—0kË/úÀÜ–ý+ÛÅnp{aAˆ_žðúJœCví£¡Àó¶F6¤JÌÅäæú¹¼-›—g’ë»°¥¨¡ØZh±¶–M\\Â×Zá¡î\Z±•Òˆˆ\n¹ÚímÒ|^Û	V*¶›hå¿Ha·›ç¿ðµ’\" ­ð¶‰–\ZIÁ>,{GºY’²U˜ß¢Ëù¹™cï¿€âæ?uY \"\"\" .MK»:ü¨~Éâ§‚ Ý÷3Ú.H\0A-Ìà™§UÖQƒ»\r€~ÃÕU™fl¬˜³%¯˜=k‹\\‡Ž]Ê«k7Lqí¸ùdr±°=Ñ:hˆuÝ’ÁÀ[MZÑæJêhƒUÞ>ÇµÙï“‡ðÞ×‰#u®€-³‡q#ÃC­¬tlSu¸ž=€Ç9ˆÆþQ@Ðn÷es­`	úêWcD×x›¹›k°êàš8ÝLÇ5ÅÁÄ8¹±Íºz3ïYvûwõÎÒÃˆìÍK`©ŒöÅÛ¡6p°:ÙÄAwk~Šˆ9v»j¸öæŸÅ+[<ŒÖ[°·\\¯fXÃt\r\r-î¹¹ê­)6X7§&*eaâÜ;;0ôMŸ.mºßQ?Ù€“ÛúÊú™Xøê 0fåd‚äéÉ¤yªuµø\rDÐ`ØŽŽcÛì^\\¼´»l×e9s‡ûh\0ëÈƒ›l†îfÀ6:¾ŠY£q©kÃ¬ÜÑ˜û@aÑRPn¯À°~ÎâB>(\"vàÓ©Ñ»)sNBÐmcvóånÈˆ4MœÝÓv{aj¨©dš¦9\ZùH°ÌèÌmÐ\\åmüN¤õ²Ç±›ºNÃÔaØãÛ3&‘Î%€‹ÈÀ¶aë5Ñæ¾ËD—\rØgg¡ù>Îâ±¶œZ.mÍÍƒ˜ûs\'Gs~«§á0IK…ÄÊù8²5käµ³¸\0­âuRÑny+j^î\\PÖŸÑlLÜó V<Et†À“ÜªÏFYƒÆd®}åsOGHã+‡‘yH,Q\núQ]C$RÞÏkšmÎÄ§½aÁên\ZÇÍ`û¼Aí%Øö¸y)ª®Ÿñ<mñŸVaÅgÞm™#{†œ7Ì’óÑ¢\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\n½¡ôÔmƒ¬îúIìôM’Ç¾ÝêÑUÓ~9¾O«á7ÅÎÊùqµ£h=^¢\" (8Å+ªiA¥·2$Žúv€#)66is	èTäA‚Š©µ´’ÙÂú‹ÞèA¸#¡YÕMþjÅ5ÒÝ§s&=;€“Ë¶3 VÈˆ€ˆˆˆ€ˆˆˆ€ˆˆˆ€ˆˆˆ€ˆˆ\n-Xhé=\0GÈÚz¼ò½µ°±sF´žŠj¨ÃÎ•Ÿ):ÆlÄf—»µk4ëÙÒ‚~H(h›dœ£Wnq7sº¹Ä¸ø•!\ZºfÖS::v¸X‹‘î#Pz‚5\nTæLiëÍå`»\\@V^ÙÅ´¸¸Ö$\0æÞÍDÄhElBÇ+ÚsFñÍŽ±ñ$Ô: –Š^gqŽ¬LÏY½èöÍ§àt:…9V×V:YøiôŸ]ö¸ˆ§¡y¿e¾gMb¯Îµ&šØm¸îÄ\\DG8]Ô0ô/k…³FVÙº††‘´4¢:q`/ÌÜ’MËœN¤’I$êI%g@DDD@DDDA ­åi»$o¬Óá}=ZnU‚‡pœC‰€É~©É(ù£\'‘¶¦2s6ÇÖq²X+)]NYTÐæ›wn#PA\0‡\rA\Z ÎŠ£‰6ôù§‡£š/+sšÑé\0×´Ñ›Êãw+*Z–UÀJàöžE¦ã»§Žˆ2¢\"\" \"\"\" \"\"\" \"]_`Õ:×6h±.qµìÖ´8Ø\0\'Eƒ.+ù]á‡óaÞ‘ÿ\0¬s}Aú-$›¸\\±z××ÊbÂ\r¬KdžÀµ–Ðµ€è÷ßO²Ó|×##§ÑR6†”âÃRI$’N¥Î\'RORVH!m<!45­\05­\0\0€\04\0w/hˆ€ˆˆˆ€ˆˆˆ€ˆˆ\nNÙ\'2S9ÑHy¾;v¹ÛH-~‚× 9§¢\n¯–ÍD?Ò1q\Z?œ€æèI/À4È}Še|uÀü‘ívSg\0uiçg7›O±RTJÌ6*×U\\æú®äæý×ŽÓ|ˆA-`Ãd§ü†¢@\0Ñ²#|Ë­)ÿ\0˜™êâ°,‚^÷¾3äÂ×ÿ\04U§•¦Î¤˜øµÐñ”‚ûó¡´Øø\\PX¢®8¡?GO9ý–ãxàÄ&“Hé$½ï„{$yø ²EYz¹‡*x¼ä—áh­ñC…¿.žg²×pÚ=œ ×ÛÀ¸ Ï[ŠEBüµÈ¸cAsÈïllçÈ(üjŠß `ŸjK:C¯Õ¤´\\j	q#«Ê:(èXEm`&ç+@¹ï6æ|T„¨°ÆRH^.ù³¤y»Èî¿&‹ë• 6ýÔDD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDDAÿÙ',NULL,NULL,'Viettel','',1);

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
  KEY `FK_cf8d7d29d4dd438f949d5ec1690` (`CustomerID`),
  KEY `FK_6c25e504de8541adac371aced22` (`EmployeeID`),
  KEY `FK_d2f79c3c9c9b4324b1f793363d2` (`WarehouseID`),
  CONSTRAINT `FK_d2f79c3c9c9b4324b1f793363d2` FOREIGN KEY (`WarehouseID`) REFERENCES `warehouse` (`WarehouseID`),
  CONSTRAINT `FK_6c25e504de8541adac371aced22` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmployeeID`),
  CONSTRAINT `FK_cf8d7d29d4dd438f949d5ec1690` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `inout` */

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
  KEY `FK_272797c566084a28a0bdc79bca8` (`InOutID`),
  KEY `FK_ab00bd3bb9d841428bf59ee0efb` (`ProductID`),
  CONSTRAINT `FK_ab00bd3bb9d841428bf59ee0efb` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  CONSTRAINT `FK_272797c566084a28a0bdc79bca8` FOREIGN KEY (`InOutID`) REFERENCES `inout` (`InOutID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `inoutline` */

/*Table structure for table `measure_unit` */

DROP TABLE IF EXISTS `measure_unit`;

CREATE TABLE `measure_unit` (
  `value` text NOT NULL,
  `name` text,
  `measureunit_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` longtext,
  PRIMARY KEY (`measureunit_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `measure_unit` */

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
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `popup` */

insert  into `popup`(`PopupID`,`Name`,`PopupClass`,`Active`,`Fragment`) values (1,'new.user','com.viettel.webui.view.popup.NewUserPFS',1,'new'),(2,'detail.user','com.viettel.webui.view.popup.DetailUserPFS',1,'detail'),(3,'new.view','com.viettel.webui.view.PopupView',1,'detail'),(5,'new.enterprise','com.viettel.webui.view.PopupEnterprise',1,'detail'),(6,'new.viewgroup','com.viettel.webui.view.PopupGroupView',1,'detail'),(7,'detail.enterprise','com.viettel.webui.view.PopupEnterprise',1,'detail'),(8,'detail.department','com.viettel.webui.view.PopupDepartment',1,'detail'),(9,'detail.employee','com.viettel.webui.view.PopupEmployee',0,'detail'),(10,'new.inout','com.viettel.webui.view.PopupInOut',1,'detail'),(17,'new.customer','com.viettel.webui.view.PopupCustomer',1,'detail'),(18,'new.product','com.viettel.webui.view.PopupProduct',1,'detail'),(19,'new.warehouse','com.viettel.webui.view.PopupWarehouse',1,'detail'),(20,'app.detail','com.viettel.webui.view.popup.ApplicationDetailPopup',1,'detail'),(21,'detail.popup','com.viettel.webui.view.PopupChooser',1,'detail'),(22,'user.report','com.viettel.webui.report.view.UserReportView',1,'report'),(23,'detail.department','com.viettel.webui.view.PopupDepartment',0,'detail'),(24,'detail.employee','com.viettel.webui.view.PopupEmployee',1,'detail'),(25,'detail.employee','com.viettel.webui.view.PopupEmployee',1,'detail'),(26,'detail.department','com.viettel.webui.view.PopupDepartment',0,'detail');

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `PositionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `NumberLimit` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`PositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `position` */

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
  PRIMARY KEY (`ProductID`),
  KEY `FK_e64ea045d12a419c8a030727177` (`DepartmentID`),
  CONSTRAINT `FK_e64ea045d12a419c8a030727177` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

/*Table structure for table `report` */

DROP TABLE IF EXISTS `report`;

CREATE TABLE `report` (
  `report_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `jasperfile` longtext NOT NULL,
  `name` longtext NOT NULL,
  `process` longtext NOT NULL,
  PRIMARY KEY (`report_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `report` */

insert  into `report`(`report_id`,`jasperfile`,`name`,`process`) values (20,'user.jasper','TestReport','com.viettel.webui.report.process.UserReportProc');

/*Table structure for table `reportparameter` */

DROP TABLE IF EXISTS `reportparameter`;

CREATE TABLE `reportparameter` (
  `reportparameter_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ishidden` tinyint(1) NOT NULL,
  `ismadatory` tinyint(1) NOT NULL,
  `label` longtext NOT NULL,
  `name` longtext NOT NULL,
  `sequence` longtext NOT NULL,
  `type` longtext NOT NULL,
  `report_id` bigint(20) NOT NULL,
  `IsSmeLine` tinyint(1) NOT NULL,
  `NewLine` tinyint(1) NOT NULL,
  PRIMARY KEY (`reportparameter_id`),
  KEY `FK_8ec8f206e06047ce8c5f033537d` (`report_id`),
  CONSTRAINT `FK_8ec8f206e06047ce8c5f033537d` FOREIGN KEY (`report_id`) REFERENCES `report` (`report_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `reportparameter` */

insert  into `reportparameter`(`reportparameter_id`,`ishidden`,`ismadatory`,`label`,`name`,`sequence`,`type`,`report_id`,`IsSmeLine`,`NewLine`) values (6,0,1,'Ho Ten','NAME','1','com.vaadin.ui.TextField',20,0,0),(7,0,1,'Sinh nam','DATE','3','com.vaadin.ui.ComboBox',20,1,0),(8,0,1,'Tai khoan','USER','2','com.vaadin.ui.TextField',20,1,0);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `RoleID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(200) NOT NULL,
  `Code` varchar(60) NOT NULL,
  `Description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`RoleID`,`Name`,`Code`,`Description`) values (1,'Administrator','ROLE_PORTAL_ADMIN','Administrator'),(2,'User','ROLE_PORTAL_USER','Vai trÃ² ngÆ°á»i dÃ¹ng'),(4,'NgÆ°á»i dÃ¹ng thá»­ nghiá»‡m','ROLE_PORTAL_TEST','NgÆ°á»i dÃ¹ng thá»­ nghiá»‡m ngÃ y hÃ´m nay');

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

insert  into `role_view`(`RoleID`,`ViewID`) values (1,3),(2,3),(1,4),(2,4),(1,5),(2,5),(1,6),(2,6),(1,7),(2,7),(1,8),(2,8),(1,9),(2,9),(1,10),(1,11),(1,26),(1,27),(1,28),(1,29),(1,30),(1,33),(1,34),(1,35),(1,36),(1,37),(1,39),(1,40);

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
) ENGINE=InnoDB AUTO_INCREMENT=3062 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`UserID`,`Name`,`Username`,`Password`,`DOB`,`Email`) values (9,'VÅ© Viá»‡t HÆ°ng','hungvv','e10adc3949ba59abbe56e057f20f883e','2013-12-20 15:39:23','hungvv@viettel.com.vn'),(3014,'HoÃ ng PhÆ°Æ¡ng Nhi','nhihp1','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','nhihp@viettel.com.vn'),(3015,'Nguyá»…n Äá»©c Háº£i','haind','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','haind25@viettel.com.vn'),(3016,'Nguyá»…n VÄƒn Thanh','thanhnv','e10adc3949ba59abbe56e057f20f883e','1991-10-01 00:00:00','thanhnv60@viettel.com.vn'),(3017,'Hung','hungvv','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','1'),(3021,'Nguyen Van Phuc','phucnv','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','phucnv18@viettel.com.vn'),(3026,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-31 00:00:00','trungkh'),(3027,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 00:00:00','trungkh'),(3028,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 00:00:00','trungkh'),(3029,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-31 00:00:00','trungkh'),(3030,'Kim Ha Trung','thanh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 15:54:03','trungkh'),(3031,'Tran Van Tho','thotvdeptrai','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thotv@viettel.com.vn'),(3032,'Äá»— Thá»‹ Nháº«n','nhandt4','e10adc3949ba59abbe56e057f20f883e','2014-02-17 09:41:30','nhandt4@viettel.com.vn'),(3033,'khangpn','khangpn','e10adc3949ba59abbe56e057f20f883e','2014-02-16 00:00:00','khangpn'),(3034,'coucou','coucou','e10adc3949ba59abbe56e057f20f883e','2014-03-18 00:00:00','coucou@gmail.com'),(3035,'HoÃ ng Thá»‹ ThÆ¡m','thomht','81dc9bdb52d04dc20036dbd8313ed055','2014-03-05 00:00:00','thomht@viettel.com.vn'),(3036,'Kim Ha Trung','trungkh','123456','2014-03-06 15:09:28','trungkh@viettel.vn'),(3037,'Kim Ha Trung','trungkh','123456','2014-03-06 15:15:53','trungkh@viettel.vn'),(3038,'Kim Ha Trung','trungkh','123456','2014-03-06 15:19:09','trungkh@viettel.vn'),(3050,'alo','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3051,'aloa','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3052,'aloa','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3053,'boday','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3054,'huyenlt','huyenlt','123456','2014-04-02 00:00:00','huyenlt14'),(3055,'alo','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3056,'Äáº·ng VÄƒn A','adv','123456','2014-03-31 00:00:00','adv@abc.com'),(3057,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3058,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3059,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3060,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3061,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email');

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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`UserRoleID`,`ApplicationID`,`UserID`,`RoleID`) values (47,4,3016,2),(48,4,3016,2),(50,4,3016,2),(68,3,3016,1),(69,2,3016,1),(70,5,3016,1);

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
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

/*Data for the table `view` */

insert  into `view`(`ViewID`,`Active`,`Code`,`Description`,`Icon`,`Level`,`Menu`,`Name`,`Summary`,`ViewClass`,`ParentViewId`,`ViewGroupID`,`Fragment`) values (3,1,'Warehouse',NULL,'img/user.svg',1,1,'Kho hÃ ng',0,'com.viettel.webui.view.WarehouseView',6,3,'warehouse'),(4,1,'Customer',NULL,'img/user.svg',3,1,'KhÃ¡ch hÃ ng',0,'com.viettel.webui.view.CustomerView',6,1,'customer'),(5,1,'Product',NULL,'img/user.svg',3,1,'Sáº£n pháº©m',0,'com.viettel.webui.view.ProductView',6,2,'product'),(6,1,'user4',NULL,'img/user.svg',4,1,'Má»Ÿ rá»™ng',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'more'),(7,1,'Department',NULL,'img/user.svg',4,1,'PhÃ²ng ban',0,'com.viettel.webui.view.DepartmentView',6,1,'department'),(8,1,'Enterprise',NULL,'img/user.svg',1,1,'ÄÆ¡n vá»‹',0,'com.viettel.webui.view.EnterpriseView',6,1,'enterprise'),(9,1,'Employee',NULL,'img/user.svg',1,1,'NhÃ¢n viÃªn',0,'com.viettel.webui.view.EmployeeView',6,1,'employee'),(10,1,'dashboard',NULL,'img/user.svg',1,1,'Dashboard',0,'com.viettel.webui.view.UserView',NULL,NULL,'dashboard'),(11,1,'view','',NULL,2,1,'Chá»©c nÄƒng',0,'com.viettel.webui.view.ViewDetail',27,NULL,'view'),(26,1,'application','Application menu summry','img/application24.png',5,1,'á»¨ng dá»¥ng',1,'',NULL,NULL,''),(27,1,'security','Security menu summary','img/lock-flat-24.png',3,1,'Báº£o máº­t',1,'',NULL,NULL,''),(28,1,'applicationList','Application list menu',NULL,1,1,'Danh sÃ¡ch',0,'com.viettel.webui.view.ApplicationView',26,NULL,'apps/list'),(29,1,'applicationAccess','Application access',NULL,2,1,'Truy cáº­p',0,'com.viettel.webui.view.ApplicationUserView',26,NULL,'apps/access'),(30,1,'role','Role list',NULL,1,1,'Vai trÃ²',0,'com.viettel.webui.view.RoleView',27,NULL,'role'),(33,1,'InOut',NULL,'img/user.svg',4,1,'Nháº­p/Xuáº¥t kho',0,'com.viettel.webui.view.InOutView',6,3,'inout'),(34,1,'RP',NULL,'img/report.svg',5,1,'BÃ¡o cÃ¡o',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'report'),(35,1,'UDDRA',NULL,'img/report.svg',1,1,'NgÃ y sinh',0,'com.viettel.webui.view.UserByMonthDDR',34,4,'userbymonth'),(36,1,'reportdetail',NULL,'',1,0,'Chi tiáº¿t bÃ¡o cÃ¡o',0,'com.viettel.webui.view.UserByMonthDDRDetail',NULL,NULL,'reportdetail'),(37,1,'popup',NULL,'',1,1,'Popup',0,'com.viettel.webui.view.PopupChooserView',27,NULL,'popup'),(39,1,'TestView',NULL,'img/user.svg',1,1,'TestView',0,'com.viettel.webui.view.TestView',6,3,'TestView'),(40,1,'popuplist',NULL,'img/user.svg',1,1,'Danh sÃ¡ch Popup',0,'com.viettel.webui.view.PopupView',NULL,NULL,'popuplist');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `view_group` */

insert  into `view_group`(`ViewGroupID`,`Code`,`Level`,`Name`,`ViewID`) values (1,'gr1',1,'CÆ¡ cáº¥u - Tá»• chá»©c',6),(2,'gr2',3,'Mua bÃ¡n',6),(3,'gr3',9,'HÃ ng hÃ³a - Váº­t tÆ°',6),(4,'gr4',1,'NgÆ°á»i dÃ¹ng',34);

/*Table structure for table `view_popup` */

DROP TABLE IF EXISTS `view_popup`;

CREATE TABLE `view_popup` (
  `ViewID` bigint(20) NOT NULL,
  `PopupID` bigint(20) NOT NULL,
  PRIMARY KEY (`ViewID`,`PopupID`),
  KEY `FK_viewpopup_popup` (`PopupID`),
  CONSTRAINT `FK_viewpopup_popup` FOREIGN KEY (`PopupID`) REFERENCES `popup` (`PopupID`),
  CONSTRAINT `FK_viewpopup_view` FOREIGN KEY (`ViewID`) REFERENCES `view` (`ViewID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `view_popup` */

insert  into `view_popup`(`ViewID`,`PopupID`) values (10,1),(10,2),(36,2),(11,3),(8,7),(7,8),(9,9),(33,10),(4,17),(5,18),(3,19),(28,20),(37,21),(10,22);

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `web_service` */

insert  into `web_service`(`WebServiceID`,`ApplicationID`,`Name`,`Path`,`ServiceInterface`,`Namespace`,`PortName`) values (1,1,'RoleServiceEndPointService','http://localhost:6080/viettel-one-service/ws/role?wsdl','com.viettel.backend.ws.api.RoleWS','http://ws.backend.viettel.com/','RoleServiceEndPointPort');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
