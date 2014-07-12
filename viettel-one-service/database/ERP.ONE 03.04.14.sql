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

insert  into `app_file`(`AppFileID`,`AppName`,`Created`,`CreatedBy`,`Modified`,`ModifiedBy`,`RealName`,`Value`) values (1,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/en_2.png',NULL),(2,'đính ước-như quỳnh,trường vũ[DQ1] - YouTube.MP4','2014-03-28',3016,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/đính ước-như quỳnh,trường vũ[DQ1] - YouTube.MP4',NULL),(3,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(4,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(5,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2fd17d4f-c965-48ea-8f62-49a039029f22png',NULL),(6,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/23618a66-5126-40a0-82d4-e02afe270672.png',NULL),(7,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/10292869-f795-4e89-b071-74b1a719b72d.png',NULL),(8,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/61901890-79e6-48fb-bfcd-c3d4cce2c925.png',NULL),(9,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e427739c-d2b0-4191-9dcd-b901e85fcb72.png',NULL),(10,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f6677bf3-a5d5-4386-8994-46e7c6f53771.png',NULL),(11,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/da656388-d5e1-41ac-9c70-f9817f570173.png',NULL),(12,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8390a422-691f-4e1f-aa71-c840cc074f00.png',NULL),(13,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/4ce368d3-bc3a-4615-8375-ab3bc563dbaf.png',NULL),(14,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d573de1e-efd3-436e-ad83-ab545be65c1e.png',NULL),(15,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/a8e1bf61-2646-464f-b8ca-18b96387577e.png',NULL),(16,'e_1.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/365107cf-2d8d-422b-b52c-b4c18f895966.png',NULL),(17,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d630ebe4-7b4d-4722-a169-98ba07fe12bf.png',NULL),(18,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/1a2f57fd-88ed-4ae3-94a4-4812e2592bb2.png',NULL),(19,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f7c2027f-f5ee-4b07-bb66-6bafd3c282be.png',NULL),(20,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/3bfb6364-6f53-4902-8a14-a3fd6147efbf.png',NULL),(21,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2ffb8e86-db86-4309-ba47-24b40a08ada7.png',NULL),(22,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/fc3271b2-1db0-4990-80bf-15b3acfd5eee.png',NULL),(23,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e5de3115-bded-4de2-8a49-d4a22524f0ee.png',NULL),(24,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/29c36de1-2c73-4849-adb1-baac6526a2d5.png',NULL),(25,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/42cf16ed-35f9-4782-8268-d9dbf5b3fe21.png',NULL),(26,'en_2.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e866f086-2cef-40b6-8f82-789ed5aaa14c.png',NULL),(27,'e_1.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/603d9cb0-9f6c-4508-a768-bf1c5f6e3e48.png',NULL),(28,'MyCompare.java','2014-04-02',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/5235223c-d5e3-442d-ba61-63c79bc11199.java',NULL),(29,'e_2.png','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/bc6d5811-9846-489c-bd86-f6e1b10b3f7a.png',NULL),(30,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/53923696-aad9-4c88-8181-e7845bcf0891.jpeg',NULL),(31,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8fe46fe5-d5a7-48e3-851d-fa2d464e1ff8.jpeg',NULL),(32,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/ffaeb9fd-abb7-4dcd-89ef-8213f5fd6d5c.jpeg',NULL),(33,'default.jpeg','2014-04-03',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/c5ad7812-de19-49c9-9f13-47f499af7d89.jpeg',NULL);

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

insert  into `customer`(`CustomerID`,`Address`,`BankAccount`,`Code`,`created`,`createdBy`,`Email`,`modified`,`modifiedBy`,`Name`,`PhoneNumber`,`TaxNo`,`Type`,`value`) values (1,'Hà Nội','2154545','CUA',NULL,NULL,'a@jkdhfjdhf.com',NULL,NULL,'Ông A',NULL,NULL,NULL,NULL),(2,'ABC','5467567','CUB',NULL,NULL,'b@fkgjfkg.com',NULL,NULL,'Anh B',NULL,NULL,NULL,NULL),(3,'','','',NULL,NULL,'',NULL,NULL,'Nhà Phân phối bán lẻ điện thoại IPHONE 10',NULL,NULL,NULL,NULL),(4,'','','',NULL,NULL,'',NULL,NULL,'Bán Điện THoại',NULL,NULL,NULL,NULL);

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

insert  into `enterprise`(`EnterpriseID`,`ActiveDate`,`Code`,`Content`,`ExpireDate`,`Image`,`Name`,`Slogan`,`ParentID`) values (1,'2014-04-03','dfgdfg','��\0sr\0\"javax.sql.rowset.serial.SerialBlob��kQ���\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0�\0\0\0\0\0\0�pur\0[B���T�\0\0xp\0\0�����\0JFIF\0\0\0\0\0\0��\0�\0	\Z((!\Z%!2!%)1...383,7(-/+\n\n\n\r2% %5,,2742,-,/,,,,,,,,0/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,��\0\0�\0��\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0G\0	\0\0\0\0Q!1q2Aa��\"R���3BTbr���#CSU�����4s�$c���\0\Z\0\0\0\0\0\0\0\0\0\0\0\0��\04\0\0\0\0\0!1Q�2ARa���Bq���\"S�b3C��\0\0\0?\0�k,7 �\0�w `�!܁�d;�0�r��@�2�C�\0�w `�!܁�d;�0�r��@�2�C�\0�w `�!܁�d;�0�r��@�2�C�\0�w `�!܁�d;�0�r��@�2�%L\'s>(*��rA�	�������H$O�w3€|$          ��\0.M�h#��]7�T�q�4�=̹S�v�c=�Xi�ЉU�.��4�u�� �����<1�yM�ʬc��\\~�\0�F�|T[���Wͬ�*��o�\'�\0U���C�i�|�\0�#ʬ�Uo�?�;���Z}�7�?*޵\'t��;������<�\0��T�ON����Q�,�=)���I��:O��9=�o����N+Ǳ������u��/��f�x(LLuh��nu����$O�w3€|$        �޼QR��>�~��k�#����ⵙ3k���3��6��W%�;���w|����e��Kz�����ҕ��$�yāɼ�[����5�zӻQIP��������o- ��G\r��B�3�:��B�֘���e���K⫝̸U��z������vz�|����]��9��˪m�}�G�)<�y�z\n�gf8$kۛM��r=�S11��S%o�wl�&       �?I�ϊ\n���d��������]q���\\v��DӼe��h��e1͙5\Z�xyO9�|�X5®�����74��x�ۻ�j�*��g����gh�s��Al����6�\'ɞ�[���Fm�e1^��n�����:Ld}�����sV)�����Z%s����u��%�����{l�o���W�\0��\04��\0	�\0ߗ���JOѫ�m�Ɲ����?����>K��r��e�=�#��ފ�&%,����~�8�iN#��2��)q�ܥOw��*��ΣW|�o׷	�h��#�9��U��jۃ�\\�r���}���4>75��sM��,�=j�-�؎�$O�w3€|$    ��\r�\0��Ē��ϙk��2�QP��و�k�Y�8��l�~����GΜ�I$�I�\'y$�$�g~��/j��V���������8����w�k���f��x���<��Ac(ۿ7�o�s��l֗�������?���&����`9\0�n������+��j��!c��p��w�V�d��$�n���j��&��	��e;�����n�x+8�޳$ir`���/	�\0��C�T�0�9�H^,��h�i�p�Uv��x���c��RQZ    �?I�ϊ\n���d���\Z	q\0rN�\0�IG&v����k���a�%�4�<�u�������X�y�W����I�O��q���      .:�^�y?l��㽐��e�=��3{*�t~��ǖ?o�����\0\0\0�����PjVP2B�tdgBF�so�v����>����Zw���=ֳ��8ۃ�G�����(����耀�D�\'s>(*��rA�UM3%ad�k�9�dGZD����7�z�A���)q��Ov�����^��{��I�o�a�c�y�A�H=�$㷉ݰ���<נ���q����}��k�}Rv��8��wl>�|�5�>��o�v�;�v>G��T�ݷ�N;x���#�z�A���\'�N�ݏ�8ur��e,!�7i�G\r���]�>(���TQ\\                 �?I�ϊ\n���d����X�n0��xk\\p�������o�.��?ʄ�yl�a�����摸��W����>���֧�������\r�w�,p��v�aSj�gizxsW-8��ֽe�G���6d`غ�I=M����Rm*�:������դ��}��*���y�\0�O���(h)(��))��\\��;��w�F�v��[��]��^�\Zo�K��%����\'�b2X��q6\0�zW��f��gy�O���\Zɚ]�t��9�6�o�\'GY)�����ѱ瞒��/����ξ�}�7����x��H�\0J���\0Bvu�����S��0�^k�����\Z�N;�p.�*��Fu٢7�S��>i�4����${����6�������Dl�e��6�v\Z��u�űe3�\rî���i�;�{*rb�����4�ܱ^����Hs��\0q>��P��5N�4�O���ƚ��L�dq��q:��������6{��e�jn�Uӱ���nq4bq,\0�`}�sU���}�4�̔�������]&�{\Z8���d�r�1VzY���������ڴ�Uo�?�K��U~-�\0�?�R�\\��F9�p�\\H#1�N:��_]fkF���^����\0�Jvt���Y�\0�/n���颒���9�g��ַ����n\\�8���me�R-j�f�}Y��@�|K�s_��4�x d�|<1��i�#��Mv��*������D�\'s>(*��rA��&�|������h��?���\0��vJ�Y6�/7]��#������h\'8�a�t��GE�f8r<��)�3E��oϤ����zNm%W�4��(��-�����Nd�ֱJ��-�9�t\Z׫,�ѱ^�g��+�\0�%�߲>\'(R�Wj�ic�<w��;�?����������&��\0�S[�����1����\0��YS�\n8��������,,X�(d���F���g|�+�\0�������U�O������ۯ��\"1�Y�4�ŝG[��M��⪾��1�v�+���}׊�K�`mD���J�\0���/B�!�Y�l����<�������`/�d��=�F�F��U7��,\r��\r\0\r�����c�a��Ȉ�m�]����y�a��=d4�|��ި�����;9����`tR\0Ac������J�f�� �t�����#|;L\r���>j�L��\\�8�{]��\0j���������O�������\0���j�wS�GCg1bk���b}�͊���fzBԜt�m��oS룧��YN5����6��+2D�f!�I���V�����;�Qw����C������k��<o{�f���~\0�M-a*j1^xkh�UQ\\   �?I�ϊ\n���d�������\Z\n��N�GysK�I��\"紩�KGIfɤÒw��ݢun��⧁�w[��9đ�\\��n�b�b��CoI��jc��F��Ǩ���f���	��L��x��f�PS<>\Z88�<������\nS���Uc�a�;ּ��-O����,\0��\'9��d4�~Ԍ���$ɣÒ�V�6���\0F ��?R�m����9?g�3��I������~���m\r���Å4a��F����w8�m�wj��6�x�jF�J+�k�;G���)ۉ��-s���$��	�S�����}����\rP0G\Z�7�Z,;}��33=Z)J�6�m\r�Đ���P��d�\0^x�9�.��H��S���Q,�4�rO��GFh�i���6����Y̞$��J3i����8ڱ�6�\\M�?Pta$����a$�{\0;�+;[��΃O3��������y\'�N��.~��|������y\'�N��\'��w�O����A��~���~��|������y\'�N��\'��w�O����A��~���~��|忢5Z�����5��\"�<�x�6�.[%��n-.,S�#�ʃ@���D�\'s>(*��rA��1J{q��\"���3]p@@@@@@@@@A���������i��/\"��������Ϯ�-��,\Z(�|�~wVz��Q߳x�/�x�;�=v�\0��7����xwVz��;�o#���<����w��>Gs��y�Y���ټ|�����o�	߳x����ug����f��;�/���]��\'~���w<^�U欙�J�\0�=�\0���Y��\Z[f�q_���S\\T�\Zu_[D\'�;��AV>��jVҗzQ����pG���&�GU�w��:����:Z#�󏾍*}8���P���s�I���a�UWS<#�|�����3T���+K8��������~��0S޼_��{�!�N�N\\���?U���\'�N�$�7h�#���z�p漌�����>��L\Zj���QV�a�:�M��m��z�/}������o�Y>__���j�\0->Gn��D\'�;��AV>��j�C0J��՛Nm=EW�rW�О<��;�\\�Uu�i$C葋�f]��/:س�������7�&��O��6tZ�8O��7��~jT�\'/��g�O�To�.��[���Zk��ok=��c�ߋIӻ�4g�������Z>j��K�*c�����x��>]zR�sp����`�ZzCJ}b�g�~��۪���_��\0���e���\0�������?����z�3侺ϭ; i\rl��s\\#nL�����,y5�oӗ�ՏG��y�9ě�rx���ed�ݩ�ލѳT;,\'3������Vc�|��a�k�7�����S���䞱�Ϻ?���z�}q�r�ꭓ�r����@@@@A\"~���c�9 �m-�T�%�~�w���f�c�Ϥ�b��.��4��T�r��nm�{Xw�]y�tY)Ӝ=z�v��� ���8�,G0VI��ij�ߜ1�\\�,���\r���\'���G�}�#���d����^Lԧ�.�E�KcR�g�m�}��~�����;��u�<�:� dm\rcCZ8\0,�o�b��C�m;�ؤ�������D�\'s>(*��rA�\rj�f�6���9!B��Z7N�-OVvA�Ԛw|۟e�������ՙ�6�k��4z�H�o;7�Ov��Y�����b|�+�����ɵn��aq����7TN�4~Uѩ�?��&���(e���U8�k?)Y)=&>oI�Ë\\=�G�|�6n��&�����2�Wtcy��Wb���?$f���ڋA�;���������垕�\'>8�ho��}c�Mc>��\0mյ�枱���uV�⎜թ5\Zb{�|M��z:?5�L�����\\��{b����1}�ص���H��f��%�ʰZ$O�w3€|$                               �?I�ϊ\n���d������	�k\Z\\�\Zւ\\�l\ZI�ɘ��Piu�GK(���N8[v�����YY8�����൸b�ˡU�&�i�a�_��������8�\r�QY��U�V���Ym\n茻!#L���`��������6��O��\\;�l.$                 �?I�ϊ\n���d������n�hߕR�v#w;�C��7o�R��gu9������Uu\Z%�E]I�;)�x$�Nk�c�@=�����Yyt���Z�L{%��ZU��P�Y��ͱ�6����|g��7u�[��Wh��9���6���o�����UDh*��	�b��D=�sv��\0w�]�pD�X��j2W��i�\0�?���\\�zʊ�jj_#�.~#\'�����\Z7u�(d��D{Zt��[[$�/cn�G�4{#��d���\r��6\r��\'�)5�S��͎�<�E�Lt���C�0	�ߝ��bE�6�\r��\n�Lvqɗ;w�G�����kt��_�H�Hэ����w�_�_�eM&8��-Mo8��v��ϤC4�c펩��@g�{�&�.�+f�]�^}u7�8�I�z��߱�D��K�y[X�v���ˋn��b;��o��Kp�h�sk��[��#�}Sk����6�R%��Bea�ћ7�#�qw)F:�ɪ�8:��x�%�i�#3t�M��7��`6?�����w*�X��l˒ѩ�byL}ZO�WV�K5T�8%p�}79�Hߢ�3��]��!^�rd����&y*��UE1�����E ��1�X��9��(㈝�Wk/||9\"yD�r�z�W#fc��\Zh��Dx�n�s�����ë��-X�oW�����R61��:JX@���DH&I M�7���5�[���͸\"�ޱ�o�R?Z�j:���F�]��sq.pNE�XoY]��Uq���g��K��}#5m}L͑�%��Q����>��]��nJ��+X�kV�%�f���9C�U7�$O�w3€|$      �Ҕ-���<�6F�%��r+�;N�d�^�Y��z\'t����,҈�,c�0�pÇfଜ�0�OG㭢ffv{�5\Z�3�<��X��\Z����\\�c��H�;G$������߫KZ���訩\"|�x��bcˋ���[����6�z�<�Î7�\0��Ch�R�,�@�g��{I$�UV��v�X�\"��ji]_���	��SL\r��n�pOWR�o1d��%�y�5t���5[*���\ZZ^\Zl$�������c$�xP����7���z�B�9��Š������*����w!��@������.;�� \\{��v[�C�ӊ�����Ij<��H�/�67\0�ߎ�u߇���1\'�CKZm1�]�r�e!��+C��X���8c$�&۸p�s��S��8�/g��}���4S��Hx���nh��r����EJ�/�����t,{bsݴ~2]n6u�ݹr��u]�O\\11����eD/�N��-9�����أ��%\"��ϵ��N]N�4�v�69�aw�y�P�)�goW�n��إ�|̞x��Ҷ7a[~�oR���ʯ���7��߮�9��K��KI�����Knq�[��v��[�~)U����<q����GK#�E�s���{�rW{qN�:|Q�QUEx������D�\'s>(*��rA�	�������H$O�w3€|$                               �?I�ϊ\r�L�\r�H<흚�٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m��	��<���',NULL,'dfgdfg','egfffsgdfg','',NULL),(2,'2014-04-03','VT','��\0sr\0\"javax.sql.rowset.serial.SerialBlob��kQ���\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0S\0\0\0\0\0\0Spur\0[B���T�\0\0xp\0\0S����\0JFIF\0\0\0\0\0\0��\0�\0	 \Z \Z( \"&%!1!1)+...+4:3-7(0.+\n\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++��\0\0�\0�\"\0��\0\0\0\0\0\0\0\0\0\0\0\0\0��\0L\0	\0\0\0\0\0!1A\"Qa�#2q��3BRr$4Sbs���7Cc�����%58t���������\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0\0\0?\0�(��������M+`��g��H\0�O$�U�����LE��%��ݦ���?h\'͒T����?��o��&K�ݏr	u��T |�VG~Y��Ϊ7�-�ږ9�>=�� k���<6*MLa<�Zw��2|J�����H=+���\"���/����<�^?u9V����V��C�5?�\0�����I)�c�#�R4�� �8�Lu�D���� h�ɗ\'���Z��\"�F����pp���(UxL5��6組������ǑA5_�f���r��&���#l����؃�ػ퓚#�h͆p�O ����d�])\rh�M�RI<������EO�.�%�q��G��@�i�3$�<-�W�g:����s�n��<���Ht�LM�i������7��K���:���L�ִX5�\0pd@DDD@DDD@DD���W�ATp�Fs`���E�>ƍc<�m���\\�Qbbi�UM1Mk�w\'���O�E�`�l���l��%Sn9�H �Nk��tp ��3��m[��g<GFϠ ����xH;\'�\r6�n����������O3i�s�pkZ	s��\0�I�\0^�4c�ʜ���7vI^�����v~ӆnA���av3(������N��V�{c>��wj�;�DD@DDD@DDD@DDD@DD����pt �`NϺ�7�<���?���o�}��ᙶv��U��m�_�~���|yj��M�n{tD@DDE��PѺInCG!̞A�I$\0:��(�[R)i�ni�\r�c$��F���9��m��`�0��\0\0�K\0�����&��Yy��e�F�5�����N@DDD@DDD@DDD@DDD@DDDA����Ԯ��]�\r��#PA\0�59(�MS��ih�ygi�I\0�Ӑs\\�u`��\Z|�4��E|�^��;@Ȱ{G2Ym�D^X�#apG\";�􀈈\n����i��H@�����wY�#�!�Y��[wh����Pq���e:X��w�1O�PY�\"\" \",\r����d�/�!�7��A�\Z��R�\Z������?z̀�����0�վ*yct��;\Z��2��4���H������������*�o�&���Ώ�O�Q�݇5��X��j��Ū��}Wp��%!�O	F�\0r�@DD�C�p�y�����+͞G��;�eY�a������;ѭ�[�8�=�w���\" \"\"�ǵͅo>���I;^����%���Ӌ�l�1m��T�������_��]D7�ǌ�5E	�%�3|�:Ȏ�~�mU6�aBla��Z�w���h�\0� �~iډ��pi0|N���Y�=��à7��HWC���^�GZEp�WZ�I{��_�߀or��YO;\'�|�ᙘ_V�8��y��W�$�p�7h&�<7�&P]�w޺�q����F���_⃛l��o7���B���L��!i��������G!ӑ�Q�|>\nyK�>x�c�dfwZ�p���-�${�������\0�j˸�v�j�g����\r#P$�����6A��8���qK��[��\\�ٲ嶹��-�b6֛m(�&������{��H����E�wG[u�p���qc4��,;�e���u���s�1C�q�k&��<\Z\n\r��-��V��Ŏ�B�˃���㮖6�n�f���x���pK�΁��͚��cb�_?�{��z�I)�(cl�s2=�G��.p�.��S��R���~U�)\0ۣK��=��}�@�}�t��g��c�M�[0���6#i�m���l����B���6V�+C���\0\0yߡZN	\r8�d��e4�9׷���ߨxh�n�O¥|_��W��\08��d�~�����жk�\Z�|�(�ݛ���o�ijYYJ�)\\Ǵ9��\"���\n�.��۷���4rDMߟ��s����N���P��6���رi�0�r��q�l94�y �G�iEu�8���m�1qk���xª�n��sAs{�n�|�ǒ��0?Fg�7;���j>ky �DD�v��bya���]�VJ�9�:�z=��D��U�\" \"\"�pM�f�U8�r�Ψ,۹������\"\ro�c�b,�y�nBX�/v������+m�ت}��[\'��a�r2ٚM�k�6�l����ۤ�^:�~�z�Ene\'+ln�n����K�\" Ӷg`c������g��K��s�%Ѝt\"�&��36F��Zy]!�ps��l�K~����5K)��{[~Y���VT\Z���+6_\Z���g<Ի3���s���^6ww�`��mA�Ҋ���sFP���>�qD��s1RI$q�U\nY\r�N�e=3�l��ꃧ5�{O��QM[!���I%2Y�6�ó�̽�����R�����.:jڈU�R��8��\0��#��X�	�a;=<�f#,���\r0��-!�{\Z�{�ڷ�c~G�no�p���28��c�#�P�����w{��Ld�ڜͻG���-�	[,w�sH\ZvH#٢c��p\\R��I1�ǯ�\\����0�/��ȡs�lk3<����۸�d�R����%��jI�C3gm�pp�pA��2\"\"\" *�S�h\'h�c��d������Wz�A����\0����DD�f��W�[��_�VJ���q���/��Y�Z�@DDD@Z�7��7�#R���k$v_X�/�{��r\Z��v��\rU>�at�NY�*r����Аr�5$�� ��e$�:��g�h��ֽ�uV5�����\\\rN�6�T��j��C�Ŀ+���5Àp��E�7I��V��X�F9���F�{CF�P`x��kw��S�� ���28�%�plw���ۊC����p\"9_#�#@:i�h$�����o?�k�\rP��f�d���h=�Z���{��~�K�\rs�p�Y=(k���!�o�|�#�7�%^%���X�MI�E�JC��\0�}[6� ��6_�c�ÿ�?�]Wiv��e�i�gg�Qg8�s�X	�5���\0��l3	t��̔��[NJݷ���a��5-+k�	��\r�a���A���i`ے0�vgmh��G7�l�h�ak���W�H�j.5Z�\r-+w�,����&<���%��i�_P��oy祖��ESC�Jc�C<�]?�c��R.r��.��������F����<S����o����*���U�%�\r�G�lA,a�օ�sm�b��5�bYпl�W��T�����N�3��%�]��F��	�$j�(�}��M�H�#},�i�>����s.w�\r���]��F��!kC\\����X	�颃��K�=�4�f {i���Y�3e(�m��LN�9^�^��\Z���uq77�����㻷��	��F�Z�8_�/Ѓ�>�_��M�����\0�B���Hb���\'f��HZz_�;s}���\0Uyي��n�Ԥ���G�x�c��$y����O\n�ັ���0k�/��ܖ�+��np{aA�_���J�Cv���F6�J�������-��g�뻰����Zh���M\\��Z��\Z��҈�\n���m�|^�	V*��h�Ha�����\" ��𶉖\ZI�>,{G�Y��U�ߢ����c�����?uY�\"\"\" .MK�:��~��������3�.H\0A-����U�Q��\r�~��U�fl���%��=k�\\��]ʫk7Lq��dr��=�:h�uݒ��[MZ��J�h�U�>Ǎ����׉#u��-��q#�C��tlSu��=��9���Q@�n�es�`	��WcD�x���k����8�L�5���8��ͺz3�Yv�w���È��K`����ۡ6p�:��Awk~��9v�j����+[<��[��\\�fX�t\r\r-�)6X7�&*ea���;;0�M��.m��Q?ٍ�������X���0f�d���ɤy�u��\rD�`ؐ��c��^\\���l�e9s��h\0�ȃ�l��f�6:��Y�q�k���ј�@�a�RPn���~��B>(\"v��өѻ)sNB�mcv��nȈ4M���v{aj��d��9\Z�H����m�\\�m�N���Ǳ��N��a���3&��%�����a�5����D�\r�gg��>�ⱶ�Z.m�̓��s\'Gs~���0IK����8�5�k䵳�\0��uR�ny+j^�\\P֟�lL�� V<Et������FY��d�}�sOGH�+��yH,Q\n�Q]C$R��k�m����a��n\Z��`��A�%����y)����<m�Va�g�m�#{��7̒���\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\n����m����I��M�Ǿ���U�~9��O��7����q��h=^�\" (8�+�iA��2$��v�#)66is	�T�A�������������A�#�Y�M�j�5�ݧs&=;��˶3 V���������������������\n-Xh�=\0G��z�򽵰�s�F���j�ÏΕ�):�l�f���k4����~H(h�d��Wnq7s���ĸ��!\Z�f�S::�v�X���#Pz�5\nT�Li���`�\\@V^�Ŵ���$\0���D�hElB�+�sF�͎��$�:���^gq��L�Y���ͧ�t:�9V�V:Y�i��]�����y�e�gMb�ε&��m���\\DG8]�0�/k��FVٺ����4�:q`/�ܒM˜N��I$�I%g@DDD@DDDA���i�$o���}=ZnU��p�C���~��(��\'���2s6��q�X+)]NYT��wn#PA\0�\rA\Z�Ί��6������/+s���\0״ћ���w+*Z�U�J���E�㻧��2�\"\" \"\"\" \"\"\" \"�]_`�:�6h�.q��ִ8�\0\'E�.+�]��aޑ�\0�s}A�-$��\\�z���b�\r�Kd����е����O��|�##��R6����RI$�N��\'RORVH!m<!�45�\05�\0\0�\04\0w/h������������\nN�\'2S9�Hy�;v��H-~�� �9��\n���D?�1q\Z?����I/�4�}�e|u����vSg\0ui�g7�O��RTJ�6*�U\\������׎�|�A-`�d����@\0Ѳ�#|˭)�\0����,�^��3����\04U���Τ������������\\PX��8�?GO9���x��&�H�$��{$y� �EYz��*x���h��C��.�g���p�=� ������[�EB��ȸcAs��ll��(�j�ߠ`��jK:C�Ս��\\j	q#��:(�XEm`&�+@��6�|T����RH^.���y���&�땠6��DD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDDA��',NULL,NULL,'Viettel','',1);

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

insert  into `user`(`UserID`,`Name`,`Username`,`Password`,`DOB`,`Email`) values (9,'Vũ Việt Hưng','hungvv','e10adc3949ba59abbe56e057f20f883e','2013-12-20 15:39:23','hungvv@viettel.com.vn'),(3014,'Hoàng Phương Nhi','nhihp1','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','nhihp@viettel.com.vn'),(3015,'Nguyễn Đức Hải','haind','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','haind25@viettel.com.vn'),(3016,'Nguyễn Văn Thanh','thanhnv','e10adc3949ba59abbe56e057f20f883e','1991-10-01 00:00:00','thanhnv60@viettel.com.vn'),(3017,'Hung','hungvv','e10adc3949ba59abbe56e057f20f883e','2014-01-20 08:30:25','1'),(3021,'Nguyen Van Phuc','phucnv','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','phucnv18@viettel.com.vn'),(3026,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-31 00:00:00','trungkh'),(3027,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 00:00:00','trungkh'),(3028,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 00:00:00','trungkh'),(3029,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-31 00:00:00','trungkh'),(3030,'Kim Ha Trung','thanh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 15:54:03','trungkh'),(3031,'Tran Van Tho','thotvdeptrai','e10adc3949ba59abbe56e057f20f883e','2014-01-06 00:00:00','thotv@viettel.com.vn'),(3032,'Đỗ Thị Nhẫn','nhandt4','e10adc3949ba59abbe56e057f20f883e','2014-02-17 09:41:30','nhandt4@viettel.com.vn'),(3033,'khangpn','khangpn','e10adc3949ba59abbe56e057f20f883e','2014-02-16 00:00:00','khangpn'),(3034,'coucou','coucou','e10adc3949ba59abbe56e057f20f883e','2014-03-18 00:00:00','coucou@gmail.com'),(3035,'Hoàng Thị Thơm','thomht','81dc9bdb52d04dc20036dbd8313ed055','2014-03-05 00:00:00','thomht@viettel.com.vn'),(3036,'Kim Ha Trung','trungkh','123456','2014-03-06 15:09:28','trungkh@viettel.vn'),(3037,'Kim Ha Trung','trungkh','123456','2014-03-06 15:15:53','trungkh@viettel.vn'),(3038,'Kim Ha Trung','trungkh','123456','2014-03-06 15:19:09','trungkh@viettel.vn'),(3050,'alo','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3051,'aloa','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3052,'aloa','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3053,'boday','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3054,'huyenlt','huyenlt','123456','2014-04-02 00:00:00','huyenlt14'),(3055,'alo','alo','123456','2014-03-31 00:00:00','alo@alo.com'),(3056,'Đặng Văn A','adv','123456','2014-03-31 00:00:00','adv@abc.com'),(3057,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3058,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3059,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3060,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email'),(3061,'nguyen van a','usernam','123456','2014-04-02 00:00:00','email');

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

insert  into `view`(`ViewID`,`Active`,`Code`,`Description`,`Icon`,`Level`,`Menu`,`Name`,`Summary`,`ViewClass`,`ParentViewId`,`ViewGroupID`,`Fragment`) values (3,1,'Warehouse',NULL,'img/user.svg',1,1,'Kho hàng',0,'com.viettel.webui.view.WarehouseView',6,3,'warehouse'),(4,1,'Customer',NULL,'img/user.svg',3,1,'Khách hàng',0,'com.viettel.webui.view.CustomerView',6,1,'customer'),(5,1,'Product',NULL,'img/user.svg',3,1,'Sản phẩm',0,'com.viettel.webui.view.ProductView',6,2,'product'),(6,1,'user4',NULL,'img/user.svg',4,1,'Mở rộng',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'more'),(7,1,'Department',NULL,'img/user.svg',4,1,'Phòng ban',0,'com.viettel.webui.view.DepartmentView',6,1,'department'),(8,1,'Enterprise',NULL,'img/user.svg',1,1,'Đơn vị',0,'com.viettel.webui.view.EnterpriseView',6,1,'enterprise'),(9,1,'Employee',NULL,'img/user.svg',1,1,'Nhân viên',0,'com.viettel.webui.view.EmployeeView',6,1,'employee'),(10,1,'dashboard',NULL,'img/user.svg',1,1,'Dashboard',0,'com.viettel.webui.view.UserView',NULL,NULL,'dashboard'),(11,1,'view','',NULL,2,1,'Chức năng',0,'com.viettel.webui.view.ViewDetail',27,NULL,'view'),(26,1,'application','Application menu summry','img/application24.png',5,1,'Ứng dụng',1,'',NULL,NULL,''),(27,1,'security','Security menu summary','img/lock-flat-24.png',3,1,'Bảo mật',1,'',NULL,NULL,''),(28,1,'applicationList','Application list menu',NULL,1,1,'Danh sách',0,'com.viettel.webui.view.ApplicationView',26,NULL,'apps/list'),(29,1,'applicationAccess','Application access',NULL,2,1,'Truy cập',0,'com.viettel.webui.view.ApplicationUserView',26,NULL,'apps/access'),(30,1,'role','Role list',NULL,1,1,'Vai trò',0,'com.viettel.webui.view.RoleView',27,NULL,'role'),(33,1,'InOut',NULL,'img/user.svg',4,1,'Nhập/Xuất kho',0,'com.viettel.webui.view.InOutView',6,3,'inout'),(34,1,'RP',NULL,'img/report.svg',5,1,'Báo cáo',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'report'),(35,1,'UDDRA',NULL,'img/report.svg',1,1,'Ngày sinh',0,'com.viettel.webui.view.UserByMonthDDR',34,4,'userbymonth'),(36,1,'reportdetail',NULL,'',1,0,'Chi tiết báo cáo',0,'com.viettel.webui.view.UserByMonthDDRDetail',NULL,NULL,'reportdetail'),(37,1,'popup',NULL,'',1,1,'Popup',0,'com.viettel.webui.view.PopupChooserView',27,NULL,'popup'),(39,1,'TestView',NULL,'img/user.svg',1,1,'TestView',0,'com.viettel.webui.view.TestView',6,3,'TestView'),(40,1,'popuplist',NULL,'img/user.svg',1,1,'Danh sách Popup',0,'com.viettel.webui.view.PopupView',NULL,NULL,'popuplist');

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

insert  into `view_group`(`ViewGroupID`,`Code`,`Level`,`Name`,`ViewID`) values (1,'gr1',1,'Cơ cấu - Tổ chức',6),(2,'gr2',3,'Mua bán',6),(3,'gr3',9,'Hàng hóa - Vật tư',6),(4,'gr4',1,'Người dùng',34);

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
