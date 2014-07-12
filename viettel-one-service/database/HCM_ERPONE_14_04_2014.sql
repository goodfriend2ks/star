-- MySQL dump 10.13  Distrib 5.6.16, for Win32 (x86)
--
-- Host: localhost    Database: viettelone
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `app_file`
--

DROP TABLE IF EXISTS `app_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_file`
--

LOCK TABLES `app_file` WRITE;
/*!40000 ALTER TABLE `app_file` DISABLE KEYS */;
INSERT INTO `app_file` VALUES (1,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/en_2.png',NULL),(2,'đính ước-như quỳnh,trường vũ[DQ1] - YouTube.MP4','2014-03-28',3016,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/đính ước-như quỳnh,trường vũ[DQ1] - YouTube.MP4',NULL),(3,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(4,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(5,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2fd17d4f-c965-48ea-8f62-49a039029f22png',NULL),(6,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/23618a66-5126-40a0-82d4-e02afe270672.png',NULL),(7,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/10292869-f795-4e89-b071-74b1a719b72d.png',NULL),(8,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/61901890-79e6-48fb-bfcd-c3d4cce2c925.png',NULL),(9,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e427739c-d2b0-4191-9dcd-b901e85fcb72.png',NULL),(10,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f6677bf3-a5d5-4386-8994-46e7c6f53771.png',NULL),(11,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/da656388-d5e1-41ac-9c70-f9817f570173.png',NULL),(12,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8390a422-691f-4e1f-aa71-c840cc074f00.png',NULL),(13,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/4ce368d3-bc3a-4615-8375-ab3bc563dbaf.png',NULL),(14,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d573de1e-efd3-436e-ad83-ab545be65c1e.png',NULL),(15,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/a8e1bf61-2646-464f-b8ca-18b96387577e.png',NULL),(16,'e_1.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/365107cf-2d8d-422b-b52c-b4c18f895966.png',NULL),(17,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d630ebe4-7b4d-4722-a169-98ba07fe12bf.png',NULL),(18,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/1a2f57fd-88ed-4ae3-94a4-4812e2592bb2.png',NULL),(19,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f7c2027f-f5ee-4b07-bb66-6bafd3c282be.png',NULL),(20,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/3bfb6364-6f53-4902-8a14-a3fd6147efbf.png',NULL),(21,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2ffb8e86-db86-4309-ba47-24b40a08ada7.png',NULL),(22,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/fc3271b2-1db0-4990-80bf-15b3acfd5eee.png',NULL),(23,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e5de3115-bded-4de2-8a49-d4a22524f0ee.png',NULL),(24,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/29c36de1-2c73-4849-adb1-baac6526a2d5.png',NULL),(25,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/42cf16ed-35f9-4782-8268-d9dbf5b3fe21.png',NULL),(26,'en_2.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e866f086-2cef-40b6-8f82-789ed5aaa14c.png',NULL),(27,'e_1.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/603d9cb0-9f6c-4508-a768-bf1c5f6e3e48.png',NULL),(28,'MyCompare.java','2014-04-02',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/5235223c-d5e3-442d-ba61-63c79bc11199.java',NULL),(29,'e_2.png','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/bc6d5811-9846-489c-bd86-f6e1b10b3f7a.png',NULL),(30,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/53923696-aad9-4c88-8181-e7845bcf0891.jpeg',NULL),(31,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8fe46fe5-d5a7-48e3-851d-fa2d464e1ff8.jpeg',NULL),(32,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/ffaeb9fd-abb7-4dcd-89ef-8213f5fd6d5c.jpeg',NULL),(33,'default.jpeg','2014-04-03',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/c5ad7812-de19-49c9-9f13-47f499af7d89.jpeg',NULL),(34,'viettel.jpeg','2014-04-08',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/5cb1f943-30fc-4564-bfa0-529bd2978e4e.jpeg',NULL),(35,'default.jpeg','2014-04-08',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/13802d96-a5f6-4976-b5ab-de3051d094a0.jpeg',NULL),(36,'e_1.png','2014-04-08',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e16678a4-9885-4c89-bde4-4813fb67f941.png',NULL);
/*!40000 ALTER TABLE `app_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application` (
  `ApplicationID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(1000) NOT NULL,
  `Code` varchar(20) NOT NULL,
  `ViewAddress` varchar(255) NOT NULL,
  `ServiceAddress` varchar(255) NOT NULL,
  `ImageLink` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`ApplicationID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
INSERT INTO `application` VALUES (1,'Portal','PORTAL','192.168.140.46','192.168.140.46','https://cdn1.iconfinder.com/data/icons/windows-8-metro-style/26/voip_gateway.png'),(2,'Human Resources','HRM','192.168.140.46','192.168.140.46','https://cdn2.iconfinder.com/data/icons/flat-ui-icons-24-px/24/man-24-24.png'),(3,'Customer Relationship Management','CRM','192.168.140.140','192.168.140.140','https://cdn0.iconfinder.com/data/icons/iphone-black-people-svg-icons/30/clients_client_user_male_earth_man_list_customer_windows-24.png'),(4,'Business Process Management','BMP','192.168.140.24','192.168.140.24','https://cdn2.iconfinder.com/data/icons/couds/512/cloud_reload_1-24.png'),(5,'Accounting And Inventory','ACC','192.168.140.147','192.168.140.147','https://cdn4.iconfinder.com/data/icons/aiga-symbol-signs/612/aiga_cashier_bg-24.png');
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Hà Nội','2154545','CUA',NULL,NULL,'a@jkdhfjdhf.com',NULL,NULL,'Ông A',NULL,NULL,NULL,NULL),(2,'ABC','5467567','CUB',NULL,NULL,'b@fkgjfkg.com',NULL,NULL,'Anh B',NULL,NULL,NULL,NULL),(3,'','','',NULL,NULL,'',NULL,NULL,'Nhà Phân phối bán lẻ điện thoại IPHONE 10',NULL,NULL,NULL,NULL),(4,'','','',NULL,NULL,'',NULL,NULL,'Bán Điện THoại',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department_position`
--

DROP TABLE IF EXISTS `department_position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department_position` (
  `DepartmentID` bigint(20) NOT NULL,
  `PositionID` bigint(20) NOT NULL,
  PRIMARY KEY (`DepartmentID`,`PositionID`),
  KEY `FK_e0b449a5f2a54d81914235aa07c` (`PositionID`),
  KEY `FK_0825892a1d2e4e82b81173567be` (`DepartmentID`),
  CONSTRAINT `FK_0825892a1d2e4e82b81173567be` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  CONSTRAINT `FK_e0b449a5f2a54d81914235aa07c` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department_position`
--

LOCK TABLES `department_position` WRITE;
/*!40000 ALTER TABLE `department_position` DISABLE KEYS */;
/*!40000 ALTER TABLE `department_position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departmentposition`
--

DROP TABLE IF EXISTS `departmentposition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departmentposition` (
  `DepartmentPositionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DepartmentID` bigint(20) DEFAULT NULL,
  `PositionID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`DepartmentPositionID`),
  KEY `FK_21b79627083c4a49aac8bf0b786` (`DepartmentID`),
  KEY `FK_de4adff0160340acb63424a6d31` (`PositionID`),
  CONSTRAINT `FK_21b79627083c4a49aac8bf0b786` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`),
  CONSTRAINT `FK_de4adff0160340acb63424a6d31` FOREIGN KEY (`PositionID`) REFERENCES `position` (`PositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departmentposition`
--

LOCK TABLES `departmentposition` WRITE;
/*!40000 ALTER TABLE `departmentposition` DISABLE KEYS */;
/*!40000 ALTER TABLE `departmentposition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_departmentposition`
--

DROP TABLE IF EXISTS `employee_departmentposition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_departmentposition` (
  `EmployeeID` bigint(20) NOT NULL,
  `DepartmentPositionID` bigint(20) NOT NULL,
  PRIMARY KEY (`EmployeeID`,`DepartmentPositionID`),
  KEY `FK_2d437efca5ad45d8b00127ab603` (`DepartmentPositionID`),
  KEY `FK_4c5073d2bec844ea89b15be6761` (`EmployeeID`),
  CONSTRAINT `FK_2d437efca5ad45d8b00127ab603` FOREIGN KEY (`DepartmentPositionID`) REFERENCES `departmentposition` (`DepartmentPositionID`),
  CONSTRAINT `FK_4c5073d2bec844ea89b15be6761` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_departmentposition`
--

LOCK TABLES `employee_departmentposition` WRITE;
/*!40000 ALTER TABLE `employee_departmentposition` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_departmentposition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enterprise`
--

DROP TABLE IF EXISTS `enterprise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enterprise`
--

LOCK TABLES `enterprise` WRITE;
/*!40000 ALTER TABLE `enterprise` DISABLE KEYS */;
INSERT INTO `enterprise` VALUES (3,'2014-04-08','VTT','��\0sr\0\"javax.sql.rowset.serial.SerialBlob��kQ���\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0�\0\0\0\0\0\0�pur\0[B���T�\0\0xp\0\0�����\0JFIF\0\0\0\0\0\0��\0�\0	\Z((!\Z%!2!%)1...383,7(-/+\n\n\n\r2% %5,,2742,-,/,,,,,,,,0/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,��\0\0�\0��\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0G\0	\0\0\0\0Q!1q2Aa��\"R���3BTbr���#CSU�����4s�$c���\0\Z\0\0\0\0\0\0\0\0\0\0\0\0��\04\0\0\0\0\0!1Q�2ARa���Bq���\"S�b3C��\0\0\0?\0�k,7 �\0�w `�!܁�d;�0�r��@�2�C�\0�w `�!܁�d;�0�r��@�2�C�\0�w `�!܁�d;�0�r��@�2�C�\0�w `�!܁�d;�0�r��@�2�%L\'s>(*��rA�	�������H$O�w3€|$          ��\0.M�h#��]7�T�q�4�=̹S�v�c=�Xi�ЉU�.��4�u�� �����<1�yM�ʬc��\\~�\0�F�|T[���Wͬ�*��o�\'�\0U���C�i�|�\0�#ʬ�Uo�?�;���Z}�7�?*޵\'t��;������<�\0��T�ON����Q�,�=)���I��:O��9=�o����N+Ǳ������u��/��f�x(LLuh��nu����$O�w3€|$        �޼QR��>�~��k�#����ⵙ3k���3��6��W%�;���w|����e��Kz�����ҕ��$�yāɼ�[����5�zӻQIP��������o- ��G\r��B�3�:��B�֘���e���K⫝̸U��z������vz�|����]��9��˪m�}�G�)<�y�z\n�gf8$kۛM��r=�S11��S%o�wl�&       �?I�ϊ\n���d��������]q���\\v��DӼe��h��e1͙5\Z�xyO9�|�X5®�����74��x�ۻ�j�*��g����gh�s��Al����6�\'ɞ�[���Fm�e1^��n�����:Ld}�����sV)�����Z%s����u��%�����{l�o���W�\0��\04��\0	�\0ߗ���JOѫ�m�Ɲ����?����>K��r��e�=�#��ފ�&%,����~�8�iN#��2��)q�ܥOw��*��ΣW|�o׷	�h��#�9��U��jۃ�\\�r���}���4>75��sM��,�=j�-�؎�$O�w3€|$    ��\r�\0��Ē��ϙk��2�QP��و�k�Y�8��l�~����GΜ�I$�I�\'y$�$�g~��/j��V���������8����w�k���f��x���<��Ac(ۿ7�o�s��l֗�������?���&����`9\0�n������+��j��!c��p��w�V�d��$�n���j��&��	��e;�����n�x+8�޳$ir`���/	�\0��C�T�0�9�H^,��h�i�p�Uv��x���c��RQZ    �?I�ϊ\n���d���\Z	q\0rN�\0�IG&v����k���a�%�4�<�u�������X�y�W����I�O��q���      .:�^�y?l��㽐��e�=��3{*�t~��ǖ?o�����\0\0\0�����PjVP2B�tdgBF�so�v����>����Zw���=ֳ��8ۃ�G�����(����耀�D�\'s>(*��rA�UM3%ad�k�9�dGZD����7�z�A���)q��Ov�����^��{��I�o�a�c�y�A�H=�$㷉ݰ���<נ���q����}��k�}Rv��8��wl>�|�5�>��o�v�;�v>G��T�ݷ�N;x���#�z�A���\'�N�ݏ�8ur��e,!�7i�G\r���]�>(���TQ\\                 �?I�ϊ\n���d����X�n0��xk\\p�������o�.��?ʄ�yl�a�����摸��W����>���֧�������\r�w�,p��v�aSj�gizxsW-8��ֽe�G���6d`غ�I=M����Rm*�:������դ��}��*���y�\0�O���(h)(��))��\\��;��w�F�v��[��]��^�\Zo�K��%����\'�b2X��q6\0�zW��f��gy�O���\Zɚ]�t��9�6�o�\'GY)�����ѱ瞒��/����ξ�}�7����x��H�\0J���\0Bvu�����S��0�^k�����\Z�N;�p.�*��Fu٢7�S��>i�4����${����6�������Dl�e��6�v\Z��u�űe3�\rî���i�;�{*rb�����4�ܱ^����Hs��\0q>��P��5N�4�O���ƚ��L�dq��q:��������6{��e�jn�Uӱ���nq4bq,\0�`}�sU���}�4�̔�������]&�{\Z8���d�r�1VzY���������ڴ�Uo�?�K��U~-�\0�?�R�\\��F9�p�\\H#1�N:��_]fkF���^����\0�Jvt���Y�\0�/n���颒���9�g��ַ����n\\�8���me�R-j�f�}Y��@�|K�s_��4�x d�|<1��i�#��Mv��*������D�\'s>(*��rA��&�|������h��?���\0��vJ�Y6�/7]��#������h\'8�a�t��GE�f8r<��)�3E��oϤ����zNm%W�4��(��-�����Nd�ֱJ��-�9�t\Z׫,�ѱ^�g��+�\0�%�߲>\'(R�Wj�ic�<w��;�?����������&��\0�S[�����1����\0��YS�\n8��������,,X�(d���F���g|�+�\0�������U�O������ۯ��\"1�Y�4�ŝG[��M��⪾��1�v�+���}׊�K�`mD���J�\0���/B�!�Y�l����<�������`/�d��=�F�F��U7��,\r��\r\0\r�����c�a��Ȉ�m�]����y�a��=d4�|��ި�����;9����`tR\0Ac������J�f�� �t�����#|;L\r���>j�L��\\�8�{]��\0j���������O�������\0���j�wS�GCg1bk���b}�͊���fzBԜt�m��oS룧��YN5����6��+2D�f!�I���V�����;�Qw����C������k��<o{�f���~\0�M-a*j1^xkh�UQ\\   �?I�ϊ\n���d�������\Z\n��N�GysK�I��\"紩�KGIfɤÒw��ݢun��⧁�w[��9đ�\\��n�b�b��CoI��jc��F��Ǩ���f���	��L��x��f�PS<>\Z88�<������\nS���Uc�a�;ּ��-O����,\0��\'9��d4�~Ԍ���$ɣÒ�V�6���\0F ��?R�m����9?g�3��I������~���m\r���Å4a��F����w8�m�wj��6�x�jF�J+�k�;G���)ۉ��-s���$��	�S�����}����\rP0G\Z�7�Z,;}��33=Z)J�6�m\r�Đ���P��d�\0^x�9�.��H��S���Q,�4�rO��GFh�i���6����Y̞$��J3i����8ڱ�6�\\M�?Pta$����a$�{\0;�+;[��΃O3��������y\'�N��.~��|������y\'�N��\'��w�O����A��~���~��|������y\'�N��\'��w�O����A��~���~��|忢5Z�����5��\"�<�x�6�.[%��n-.,S�#�ʃ@���D�\'s>(*��rA��1J{q��\"���3]p@@@@@@@@@A���������i��/\"��������Ϯ�-��,\Z(�|�~wVz��Q߳x�/�x�;�=v�\0��7����xwVz��;�o#���<����w��>Gs��y�Y���ټ|�����o�	߳x����ug����f��;�/���]��\'~���w<^�U欙�J�\0�=�\0���Y��\Z[f�q_���S\\T�\Zu_[D\'�;��AV>��jVҗzQ����pG���&�GU�w��:����:Z#�󏾍*}8���P���s�I���a�UWS<#�|�����3T���+K8��������~��0S޼_��{�!�N�N\\���?U���\'�N�$�7h�#���z�p漌�����>��L\Zj���QV�a�:�M��m��z�/}������o�Y>__���j�\0->Gn��D\'�;��AV>��j�C0J��՛Nm=EW�rW�О<��;�\\�Uu�i$C葋�f]��/:س�������7�&��O��6tZ�8O��7��~jT�\'/��g�O�To�.��[���Zk��ok=��c�ߋIӻ�4g�������Z>j��K�*c�����x��>]zR�sp����`�ZzCJ}b�g�~��۪���_��\0���e���\0�������?����z�3侺ϭ; i\rl��s\\#nL�����,y5�oӗ�ՏG��y�9ě�rx���ed�ݩ�ލѳT;,\'3������Vc�|��a�k�7�����S���䞱�Ϻ?���z�}q�r�ꭓ�r����@@@@A\"~���c�9 �m-�T�%�~�w���f�c�Ϥ�b��.��4��T�r��nm�{Xw�]y�tY)Ӝ=z�v��� ���8�,G0VI��ij�ߜ1�\\�,���\r���\'���G�}�#���d����^Lԧ�.�E�KcR�g�m�}��~�����;��u�<�:� dm\rcCZ8\0,�o�b��C�m;�ؤ�������D�\'s>(*��rA�\rj�f�6���9!B��Z7N�-OVvA�Ԛw|۟e�������ՙ�6�k��4z�H�o;7�Ov��Y�����b|�+�����ɵn��aq����7TN�4~Uѩ�?��&���(e���U8�k?)Y)=&>oI�Ë\\=�G�|�6n��&�����2�Wtcy��Wb���?$f���ڋA�;���������垕�\'>8�ho��}c�Mc>��\0mյ�枱���uV�⎜թ5\Zb{�|M��z:?5�L�����\\��{b����1}�ص���H��f��%�ʰZ$O�w3€|$                               �?I�ϊ\n���d������	�k\Z\\�\Zւ\\�l\ZI�ɘ��Piu�GK(���N8[v�����YY8�����൸b�ˡU�&�i�a�_��������8�\r�QY��U�V���Ym\n茻!#L���`��������6��O��\\;�l.$                 �?I�ϊ\n���d������n�hߕR�v#w;�C��7o�R��gu9������Uu\Z%�E]I�;)�x$�Nk�c�@=�����Yyt���Z�L{%��ZU��P�Y��ͱ�6����|g��7u�[��Wh��9���6���o�����UDh*��	�b��D=�sv��\0w�]�pD�X��j2W��i�\0�?���\\�zʊ�jj_#�.~#\'�����\Z7u�(d��D{Zt��[[$�/cn�G�4{#��d���\r��6\r��\'�)5�S��͎�<�E�Lt���C�0	�ߝ��bE�6�\r��\n�Lvqɗ;w�G�����kt��_�H�Hэ����w�_�_�eM&8��-Mo8��v��ϤC4�c펩��@g�{�&�.�+f�]�^}u7�8�I�z��߱�D��K�y[X�v���ˋn��b;��o��Kp�h�sk��[��#�}Sk����6�R%��Bea�ћ7�#�qw)F:�ɪ�8:��x�%�i�#3t�M��7��`6?�����w*�X��l˒ѩ�byL}ZO�WV�K5T�8%p�}79�Hߢ�3��]��!^�rd����&y*��UE1�����E ��1�X��9��(㈝�Wk/||9\"yD�r�z�W#fc��\Zh��Dx�n�s�����ë��-X�oW�����R61��:JX@���DH&I M�7���5�[���͸\"�ޱ�o�R?Z�j:���F�]��sq.pNE�XoY]��Uq���g��K��}#5m}L͑�%��Q����>��]��nJ��+X�kV�%�f���9C�U7�$O�w3€|$      �Ҕ-���<�6F�%��r+�;N�d�^�Y��z\'t����,҈�,c�0�pÇfଜ�0�OG㭢ffv{�5\Z�3�<��X��\Z����\\�c��H�;G$������߫KZ���訩\"|�x��bcˋ���[����6�z�<�Î7�\0��Ch�R�,�@�g��{I$�UV��v�X�\"��ji]_���	��SL\r��n�pOWR�o1d��%�y�5t���5[*���\ZZ^\Zl$�������c$�xP����7���z�B�9��Š������*����w!��@������.;�� \\{��v[�C�ӊ�����Ij<��H�/�67\0�ߎ�u߇���1\'�CKZm1�]�r�e!��+C��X���8c$�&۸p�s��S��8�/g��}���4S��Hx���nh��r����EJ�/�����t,{bsݴ~2]n6u�ݹr��u]�O\\11����eD/�N��-9�����أ��%\"��ϵ��N]N�4�v�69�aw�y�P�)�goW�n��إ�|̞x��Ҷ7a[~�oR���ʯ���7��߮�9��K��KI�����Knq�[��v��[�~)U����<q����GK#�E�s���{�rW{qN�:|Q�QUEx������D�\'s>(*��rA�	�������H$O�w3€|$                               �?I�ϊ\r�L�\r�H<흚�٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m���٠m��	��<���',NULL,NULL,'Viettel Telecom','',NULL),(4,'2014-04-08','VTICT','��\0sr\0\"javax.sql.rowset.serial.SerialBlob��kQ���\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0S\0\0\0\0\0\0Spur\0[B���T�\0\0xp\0\0S����\0JFIF\0\0\0\0\0\0��\0�\0	 \Z \Z( \"&%!1!1)+...+4:3-7(0.+\n\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++��\0\0�\0�\"\0��\0\0\0\0\0\0\0\0\0\0\0\0\0��\0L\0	\0\0\0\0\0!1A\"Qa�#2q��3BRr$4Sbs���7Cc�����%58t���������\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\0\0\0?\0�(��������M+`��g��H\0�O$�U�����LE��%��ݦ���?h\'͒T����?��o��&K�ݏr	u��T |�VG~Y��Ϊ7�-�ږ9�>=�� k���<6*MLa<�Zw��2|J�����H=+���\"���/����<�^?u9V����V��C�5?�\0�����I)�c�#�R4�� �8�Lu�D���� h�ɗ\'���Z��\"�F����pp���(UxL5��6組������ǑA5_�f���r��&���#l����؃�ػ퓚#�h͆p�O ����d�])\rh�M�RI<������EO�.�%�q��G��@�i�3$�<-�W�g:����s�n��<���Ht�LM�i������7��K���:���L�ִX5�\0pd@DDD@DDD@DD���W�ATp�Fs`���E�>ƍc<�m���\\�Qbbi�UM1Mk�w\'���O�E�`�l���l��%Sn9�H �Nk��tp ��3��m[��g<GFϠ ����xH;\'�\r6�n����������O3i�s�pkZ	s��\0�I�\0^�4c�ʜ���7vI^�����v~ӆnA���av3(������N��V�{c>��wj�;�DD@DDD@DDD@DDD@DD����pt �`NϺ�7�<���?���o�}��ᙶv��U��m�_�~���|yj��M�n{tD@DDE��PѺInCG!̞A�I$\0:��(�[R)i�ni�\r�c$��F���9��m��`�0��\0\0�K\0�����&��Yy��e�F�5�����N@DDD@DDD@DDD@DDD@DDDA����Ԯ��]�\r��#PA\0�59(�MS��ih�ygi�I\0�Ӑs\\�u`��\Z|�4��E|�^��;@Ȱ{G2Ym�D^X�#apG\";�􀈈\n����i��H@�����wY�#�!�Y��[wh����Pq���e:X��w�1O�PY�\"\" \",\r����d�/�!�7��A�\Z��R�\Z������?z̀�����0�վ*yct��;\Z��2��4���H������������*�o�&���Ώ�O�Q�݇5��X��j��Ū��}Wp��%!�O	F�\0r�@DD�C�p�y�����+͞G��;�eY�a������;ѭ�[�8�=�w���\" \"\"�ǵͅo>���I;^����%���Ӌ�l�1m��T�������_��]D7�ǌ�5E	�%�3|�:Ȏ�~�mU6�aBla��Z�w���h�\0� �~iډ��pi0|N���Y�=��à7��HWC���^�GZEp�WZ�I{��_�߀or��YO;\'�|�ᙘ_V�8��y��W�$�p�7h&�<7�&P]�w޺�q����F���_⃛l��o7���B���L��!i��������G!ӑ�Q�|>\nyK�>x�c�dfwZ�p���-�${�������\0�j˸�v�j�g����\r#P$�����6A��8���qK��[��\\�ٲ嶹��-�b6֛m(�&������{��H����E�wG[u�p���qc4��,;�e���u���s�1C�q�k&��<\Z\n\r��-��V��Ŏ�B�˃���㮖6�n�f���x���pK�΁��͚��cb�_?�{��z�I)�(cl�s2=�G��.p�.��S��R���~U�)\0ۣK��=��}�@�}�t��g��c�M�[0���6#i�m���l����B���6V�+C���\0\0yߡZN	\r8�d��e4�9׷���ߨxh�n�O¥|_��W��\08��d�~�����жk�\Z�|�(�ݛ���o�ijYYJ�)\\Ǵ9��\"���\n�.��۷���4rDMߟ��s����N���P��6���رi�0�r��q�l94�y �G�iEu�8���m�1qk���xª�n��sAs{�n�|�ǒ��0?Fg�7;���j>ky �DD�v��bya���]�VJ�9�:�z=��D��U�\" \"\"�pM�f�U8�r�Ψ,۹������\"\ro�c�b,�y�nBX�/v������+m�ت}��[\'��a�r2ٚM�k�6�l����ۤ�^:�~�z�Ene\'+ln�n����K�\" Ӷg`c������g��K��s�%Ѝt\"�&��36F��Zy]!�ps��l�K~����5K)��{[~Y���VT\Z���+6_\Z���g<Ի3���s���^6ww�`��mA�Ҋ���sFP���>�qD��s1RI$q�U\nY\r�N�e=3�l��ꃧ5�{O��QM[!���I%2Y�6�ó�̽�����R�����.:jڈU�R��8��\0��#��X�	�a;=<�f#,���\r0��-!�{\Z�{�ڷ�c~G�no�p���28��c�#�P�����w{��Ld�ڜͻG���-�	[,w�sH\ZvH#٢c��p\\R��I1�ǯ�\\����0�/��ȡs�lk3<����۸�d�R����%��jI�C3gm�pp�pA��2\"\"\" *�S�h\'h�c��d������Wz�A����\0����DD�f��W�[��_�VJ���q���/��Y�Z�@DDD@Z�7��7�#R���k$v_X�/�{��r\Z��v��\rU>�at�NY�*r����Аr�5$�� ��e$�:��g�h��ֽ�uV5�����\\\rN�6�T��j��C�Ŀ+���5Àp��E�7I��V��X�F9���F�{CF�P`x��kw��S�� ���28�%�plw���ۊC����p\"9_#�#@:i�h$�����o?�k�\rP��f�d���h=�Z���{��~�K�\rs�p�Y=(k���!�o�|�#�7�%^%���X�MI�E�JC��\0�}[6� ��6_�c�ÿ�?�]Wiv��e�i�gg�Qg8�s�X	�5���\0��l3	t��̔��[NJݷ���a��5-+k�	��\r�a���A���i`ے0�vgmh��G7�l�h�ak���W�H�j.5Z�\r-+w�,����&<���%��i�_P��oy祖��ESC�Jc�C<�]?�c��R.r��.��������F����<S����o����*���U�%�\r�G�lA,a�օ�sm�b��5�bYпl�W��T�����N�3��%�]��F��	�$j�(�}��M�H�#},�i�>����s.w�\r���]��F��!kC\\����X	�颃��K�=�4�f {i���Y�3e(�m��LN�9^�^��\Z���uq77�����㻷��	��F�Z�8_�/Ѓ�>�_��M�����\0�B���Hb���\'f��HZz_�;s}���\0Uyي��n�Ԥ���G�x�c��$y����O\n�ັ���0k�/��ܖ�+��np{aA�_���J�Cv���F6�J�������-��g�뻰����Zh���M\\��Z��\Z��҈�\n���m�|^�	V*��h�Ha�����\" ��𶉖\ZI�>,{G�Y��U�ߢ����c�����?uY�\"\"\" .MK�:��~��������3�.H\0A-����U�Q��\r�~��U�fl���%��=k�\\��]ʫk7Lq��dr��=�:h�uݒ��[MZ��J�h�U�>Ǎ����׉#u��-��q#�C��tlSu��=��9���Q@�n�es�`	��WcD�x���k����8�L�5���8��ͺz3�Yv�w���È��K`����ۡ6p�:��Awk~��9v�j����+[<��[��\\�fX�t\r\r-�)6X7�&*ea���;;0�M��.m��Q?ٍ�������X���0f�d���ɤy�u��\rD�`ؐ��c��^\\���l�e9s��h\0�ȃ�l��f�6:��Y�q�k���ј�@�a�RPn���~��B>(\"v��өѻ)sNB�mcv��nȈ4M���v{aj��d��9\Z�H����m�\\�m�N���Ǳ��N��a���3&��%�����a�5����D�\r�gg��>�ⱶ�Z.m�̓��s\'Gs~���0IK����8�5�k䵳�\0��uR�ny+j^�\\P֟�lL�� V<Et������FY��d�}�sOGH�+��yH,Q\n�Q]C$R��k�m����a��n\Z��`��A�%����y)����<m�Va�g�m�#{��7̒���\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\n����m����I��M�Ǿ���U�~9��O��7����q��h=^�\" (8�+�iA��2$��v�#)66is	�T�A�������������A�#�Y�M�j�5�ݧs&=;��˶3 V���������������������\n-Xh�=\0G��z�򽵰�s�F���j�ÏΕ�):�l�f���k4����~H(h�d��Wnq7s���ĸ��!\Z�f�S::�v�X���#Pz�5\nT�Li���`�\\@V^�Ŵ���$\0���D�hElB�+�sF�͎��$�:���^gq��L�Y���ͧ�t:�9V�V:Y�i��]�����y�e�gMb�ε&��m���\\DG8]�0�/k��FVٺ����4�:q`/�ܒM˜N��I$�I%g@DDD@DDDA���i�$o���}=ZnU��p�C���~��(��\'���2s6��q�X+)]NYT��wn#PA\0�\rA\Z�Ί��6������/+s���\0״ћ���w+*Z�U�J���E�㻧��2�\"\" \"\"\" \"\"\" \"�]_`�:�6h�.q��ִ8�\0\'E�.+�]��aޑ�\0�s}A�-$��\\�z���b�\r�Kd����е����O��|�##��R6����RI$�N��\'RORVH!m<!�45�\05�\0\0�\04\0w/h������������\nN�\'2S9�Hy�;v��H-~�� �9��\n���D?�1q\Z?����I/�4�}�e|u����vSg\0ui�g7�O��RTJ�6*�U\\������׎�|�A-`�d����@\0Ѳ�#|˭)�\0����,�^��3����\04U���Τ������������\\PX��8�?GO9���x��&�H�$��{$y� �EYz��*x���h��C��.�g���p�=� ������[�EB��ȸcAs��ll��(�j�ߠ`��jK:C�Ս��\\j	q#��:(�XEm`&�+@��6�|T����RH^.���y���&�땠6��DD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDDA��',NULL,NULL,'Viettel ICT','',3),(5,'2014-04-08','VTN','��\0sr\0\"javax.sql.rowset.serial.SerialBlob��kQ���\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0�[\0\0\0\0\0\0�[pur\0[B���T�\0\0xp\0\0�[�PNG\r\n\Z\n\0\0\0\rIHDR\0\0 \0\0`\0\0\0�Z�\0\0\0sBIT��O�\0\0\0tEXtSoftware\0gnome-screenshot��>\0\0 \0IDATx���wxU�3�}�{/$$�z�w��P�*E?�\n�bE\n�4iҤw!�ҳ�M������R!H��><<ɔ{��&gnc���ם?��q�\0\0\0V�=�q�P��ѡ�\"��Cw\0\0\r���TU�}�QT�>�\0\0\0\0\0\0\0\0��`\0\0\0\0\0\0Xl\0\0\0\0\0\0\0+>�\0\0\0\0�0��ex�{y۱D��aHo�����X�%\r�k�*u��D�E����ӊ2ՆB��q\0\0P[H�\0\0�P>6��\Z9Nk�\Z�\"+��`Z��(���G��������4rl�*\'\"Ǘ9\"j�&��]Ui�&䭹���5>��\0\0\0,�\0\0�I4��aI\'�Vβ���������Ō�\"�#���l[���\"�!:��[9)�w�\r��	r���\"���婃��*�#�\n\0\0�RH�\0\0�8#~��,�JkܛR_��q��e:������P�\0;�s���Ju\ZL/ۃCC�]�ܑ�*��\n��R����������_۬��cEu��T���V\"x��jt&�XF1��\0�L$،�(p�<բ�\"����1W,2���IvF����:d�\0\0\0�������!O�WR��(�EeI��u��K�N)�>:���6�^����\'����ns|D������.F%f��{eBVc�\"����$���cO���Cz�=�Y\\!\r���: �F�����q��Z1*\0\0hj��`l�NY��;<o�;CT�����qP�m�t�g��N�uP02��\0\0��6�	t�\n���G��e8\"�wd��~���\n(1���R�������u��T��_##�O=��.F����jR�5=��������Q�Ex��D��������ƪ�O1���ޥWau?�\nx�욈l��O��\0\04 �~��&ݔwQ�3\nKओw�r�tKࡶRx\0\0\0`MM�]<l�(�H?�d�y\"1����X�\"�s@�\\Ⱦ{>��D,36ȱb��ռ��5�N�7���X��m=mD촦����ӛ�6u��K�4u����	�5s\r���\Z���h\'~��g]��%�����O4\0\0O�{&�BN�-�~T2	-x�0b��3�.Y�>�>\0\0\0�F�9\nY�x:�QTi��;c#v�f�\\�¯��������K.��ak�Hł��\\y�	�$1L���9>�@�P�3��\ZK�&��hΥsuF\"z�Dj���\\�����Ʀ�h�g�K,=�lv	F_\0<�jL�\'�!�CDc�b���N\ny�t\"��\0\0\0�H3G)C���v&�W�{*���S�F�����T�5!���ł {��#	w�7�y5[g*�m�����In��F����\re�=q�%~x!������֛g�\Zo���3���}~U�!�r�Z=03W�P\"`�M��)�ΦK�k�t\\\0���g��C��U��-k��XͿ�S\0\0\0X�����ѵ\ZV�:�]�>6�������-��\\\rŃ����Uٖ��_I�%�2p����xs��R�����`���~}\\��>�4v����X�ڸʍ<5��F+�B�e5������ˮ+6�	4/�\r\0\0��׿����v�tq����?*�~E�JK�J�6GԨ���\0\0\0�0	jd\'���<��㋙���MbCD�7ςf]���9Zc�����wd��}�(�E�}`Ў���.2\"z�������*;X��)���uւm��M~jd�?�;c��V\Z+��6r���ʈ�����\Z��\r�5\0����Ҭ�`;<��y�z��ĶZ�)WP�S���ݥe�����V��T\"�ˤ%j�͸$Wg�\0_/�ɤ�h9��HDv6�ԴL�\\&m蛥��V��Qx%2���թ��$�������.N������2i˦�.N��D��ONS��������ުic?ϒ����Y����\0\0`)�z�x���;Z�R��k\"��cODEz.�Hg�HlElZ��,e��-h�EDm]��r\'7u57q���]����7u���#!�V�����Eu4�Z9.R�o}��V�u&}i�����Dt0�𵓩%��:y�h�&��H\0\0�1�p�s5	�$,W �J�1<�U�(���^�\'�Xb��!0R�8�@{��Ath�|���d)T�q/	�r٥k7�/^ٻk��/����F�I��B����n�╛�:ا[�E�_���ss����^w��!s�>�m��?���k������y���ӳ�,���m��׵}X��WQ��͏��=|�loD��L��<K��R�dR�k/��/(Z�a��m{�&�\0\0\0u�XF��m<�,32��k�zSMGv���&\'�����}�F��wz�����1r||��,��T�&#�Y���)E�YӤ.&Wk�\n�b7po��������\\O�H*`s�&�5�$\0\0��ԥ���MM{�ld��ԥ�������E%WN��Q��n��7qW��`H@��ę�k���s<ϻH]�1_�+b�图�$��םIW���Wn�o�r_/�����y{�{��{��N��R����t;=+8�w��������s�f�?��\'\"{;���ho���x����ԅkUwuo�!��Dbٺ\Z��9o-������Y�\":��͙[7�����\\�6�����o�&:;:����1�ߞ��B������\0\0��I/J(ԇ:H�8J��x�BF���Y�ǞB�1r�ь��yYK��k�&/���q{��@���\Z#�2JY�7Ѻ��\"��ӎ�Q�v�.T�J#���L�Vb�z`U�?�~2�����͝�_\\���b&}��k^k��<��S�%F���>� \0\0�\n{�{���i�q\"�9�t�`��Y�W�8��6�a��t��z�0�Vdg#��\Z���WO?�\0�Z�m�{:��}I������[�����+�~��U�5���E\'t�\Z3j\\�#;\'w�΃DD<���o�&m�sؼ+%=+%=�f\\�ıC�F�5��;`3�u�������c�6_K�bwW\'�PXPX��_h>�|��㈈�y\"bY�+7��`4˰Uw���\"7g\'�D��_�WPX~W�ZST�6\Z9���I/\n�O�����_����+U��l�q�z�/�>���Yg/^ON�$\"�r<�0d�������V��f+s�}��^��������dR����:\0\0\Z��*M��D�2��=�<�,RQd0�=�X�|m�+��5u�Q������R������T��3�r��r���u�޴2��t0�w�IX��V�GB�aYua��Ėβ�#B��>j��t�5q�Q;7����/g�9��瀠�\0\0�XL�9p�zFNހN--:�r�-����b��˿i/qx���y\Z��K�󴹗���Il����r�ר��>���j[�o��v�v�~�gݔ��5ƊO����H��\\���꺴kժY��7�˶�����z��%j\ry�:O9@$d)U=:�o�{�|�9�oD��M�5n$��S3�/\\�>v�RjF���g�.�w\'�n�x��ˤ�9{�\r\nh�$�U�`\"�8v�*�@(`�R�9m4����׽c�6-�����S2��\\�9p�lFV�_��,�r��h,=��N=:�=}1r��寑a��עw8���#F��-���\r�/*Vk��N�9�W�F�n��E#o�{�rԭ��%x{�\r��)�eO�N��r����^��f\0��Ȅ��c�J��Y�v^�}��VF�4Z�(tr����-�^BD�z��S�릕xsB�����8�s��}V�O:z}�Xx)��V��o =s89�X?1���p�Ϯdm�+]�dN+w\"ڛRXC�V`����9��p��S���9�.#f���}����U���\0\0\rD��1�����4O���~�/�r�-\n���˰7s��)/�tm�\"uۓ��C�X�n�qSu}u�2�F����]	���/�0�L>0���7�y�ڟ�S���k-p���(����:������O��[6��ˮވUk�Ddc#��!��Fަe�,��Ͽ������E|��|Un��W�S����A���<4�.N�F�k҈�څ5i�/��/^�y���� �I��ѨA=��H$������ΐ��hH�nK?zC�ӝ<wU�������S[�]�t����\'��y��9���Z�&�Ύ�;�Mͨ����.`�΃F�����-M�ڷn�48����{��O��Z�X����άI=:��x{I�hm\'���L?����bSD\"ሁ=�����_9u�j�;\0\0���X�����!Ε�w����ac�y���)���+�-���7���x��ZI,���f�t��b����؈VD�т�^��s���%���x.����w m�x$�(�� ��Z�������������ه8�k��2}}��m�1�Nu;�9\0\0X�0?��W,�8F��s��&Ň���RԾ�J�{�U1E�H����oQ��=|�\\˹�2L\'ψ\\�JmT;J�}�>��\\$���x#g�#f���om���U�^6�#��ح�����D\"��p-١A�\nU^Y�������ϟ��cA�݋��^���1���={9��\\��:q�!�qI�l��������I�����������S3�sT�{������;��m����֧e*�661�������729~�ÉsW����v��	Ӟu;5s��߉��R/n;[9�T��W��uz����P(\\�v��\\6k���ώ\nk2��ވ%\"�@�ћ�^;th�n�m�o��G�س�?���qsvN.uo����͙�����U��\0\0O\Z{�`YW������Wr��ȏ	r���aʲk�Ƹ51o]��RMu�]Q���k���[��:�P��<�H_6�Y�ޤ��ݥ�\Z�hu?��]����8I��q�X47x��D�7�\0\0\rJ^��_�^OH�vuj\\��6�LrfSM7�3��8����e�r���p\r��^k�4so�Pg�jTFP�Kg��85�+��k;9JrZfaqI��ޞn���ztlլ�-������y>-SAD&��3�Y��Ӟ����Ԕ�ey�*���U�Ft9��/�w�%�^�~k��a7���YaqI�͸��춭�?s��,�#�������\'\'�_5o)(,^���z���ќ`3�{��fYF\"�8�����z��h�I%1j�V���$�&�M;\\�ktm4���wl�3#��Ih�4�٧�8��%�ʊ�p5z��ޚ޲i0l\0\0�J�2+���Z!�^p)sY�B�0K#��\\d.R!C��V�����/Щ�`b�J�E*&����1���XU�ߣ����f���\\�6\'�K#:���p�/�f�L���.�5vN.�/����t6Sm𒋈�V�*;%S�(f_\0�G�����`W�2�֤�#vC_�AN�>}}m�d� ����y�]e��������#\'/�\Z�k��Gwf\'�!}����9u�<\0�<�aLw�d�ŢA��r&n���62�y#�s�6r���lm\Z��$���D\"\"	U�X\"�:��ȁ��hp�.=:�1_)O��\\fog�����db�aY�R�{/�ܙq��BLw���\'�\'c�H��oC\Z��4�+(,zcڳrYi4���GD�A�GO]�h��T)\0\04\\�Ͻ���3|���U7��M��x)G-��3r�^�򡩍ܸC�����+@*d~��y�d�y���-�|���5����D4������,3�$�����iʱ�[��.���M9vۊ!\0@CQ9��KD�]�w�N.�ԔV3�Cz����u:O�#H�\n�]e��b���d�)MY=m|�s�K��\n�\Zk���/(:{)jԠ^�-Bw8�`o�$8���[�JU�Ǘ�b�H&������8��ĕ�8����d���J��l�첕�U\'�vuv��˒�27�%�����,k����_�T��e�nb��z�A(�DտHD\"�0[�[�}Da��e��v�TBD�B\Z�zy���0��d�R�2�s�2v\0\0\0���N����s���,������\\Ui\"vƜ����\Z;�=���T�6{�D?����`����b�+�din\"ڗZ�[T/o[��Arl��;�Q�S7�?\0\0<;��呕�?�B&��`Yѵ�K�Ҏ���vc�j��VdW��WK�zt�̹,dy\"�y~Lȳ_]\\h/v(�:�\ZQ��nE�J�ئE����������?�)U��>�a�����9.-�@���h**.Q�r���,q�zu�/b��]���T��gG6	x鍅�̦��T,�/V�7h�:sN˲��P�d��XMDe�̕�x�K$�Lg�C��\Z�+E�0��[�޺��fm�atz�@�&$���#\0\0�X��]�>�Z~��� �@�sW�_�\"�l�_�!:gkb^T����C���hj3���]�(�P7�`�5U�Nm֕�5nK��/\0\0��d\'�v�3��n�e�`�Z���	�ᶭ8��BFX��=��oa��ו���	�<�,1��X=���+�s#����3��<U~\nq\"2�jN��Ĕțq��swujլ���ctlb����i�:��$.^�.�]����w�tw�ML!\"s[�Ɔ����fݖ=Uw�k֪Yc�eS�Ú�\\�S~�n�@0~D;�[��D�òL�.�7�\n�J���8~�rfvN�vs����ʤ��Ϛ���Y���Z/�~\'&�VϲLz��JTL��<\\���0zӎ���{�%\0\0x��(\Z�gOD��\\z}ˮ�n�k[�=���`���Ks����ĥ����%[�~��Sl@w-\0\0���\'�Qu����U�Iq��-,Z��rò1[^M��K���K�2O�KޕR�$a%DĲ����}s��Z��C�M��nh��ڑ�\r�St�-��Ǥ��R3D\"aX��6-Co�%�\'\0�ϓ9�5�������3�O�|�ݿ�`���]��\Z*7P��y��`^A�<z�l5i�a4\Z-C̞C\'X�����ź89�=�š����5�L1ϕ����ؙ���0�g��=:�ܻkvN�k�<�2�fC57��-�����2�oD��W�Þ3x��1n�(\0\0\0�hy��k��2��J[Q/�k3O��s����9���o�+\"U�H�����n�l��7~�u�k\0\0����&\"�t{�`_��k�ڂm���������0�0q���JEv��ݿ�������wy�x9CRa�֨0\Zc�*�Qeٚ����2r@��=�]?�zM\\Rj��慻�P 	�sr�wv�OHN[�~���]?|c��L�~�^\"j�8p�����ֽ�s�2�Y�a��8vV��vj�2S��WPHD��qc���3������e���M�/]��0���yg�K��<-\nW��JDA>��pt�[�v�894i����ho�$( )%]o0����ٮU��gNrwu^�e�B�\'�=h�cl��|���ODΎ�b�(�E�P h�,=K���M&S��W��7�yy��eR��Zt������/>��������\'���q\'�_K��f�M\0�M.dk3ѷ���M�XE��/1\Z��~��ۇ�J\r\0\0ꈹ��Ҷk3�+|P�M����������T}0�8�D�XA�ŉ��H}�S{�����5}�s��zÄW�=WnI-\"\n�]��{��6.�B�0�v�D,�1�e��Я{���}�����h����t�E+���{̭�B�`δgޜ�\\z��d��>�zͶ݇�&�\\&]������Q�<�]L&���݈I�y�g����;3�����[z�����V.[�n�/[v;9�}���^]ۉE\"�HTT��I��|�&�ك�t}w�K����ⓕ�<�\\֮U����Ͽ�u���!}���n�\\��\"QAaQn~�=�������ϵ:����F���/<���������=y������%�ʤ�� ��7b.������n���[-��\0\0P�M8�vZy��;��ѡ~�cwը��uu�o�����\0\0h�\\쥪��%.������ԥ���MM����~;pft�vF����V\\���ժ&�f��I�XWc��%8��`KcΒ1�f~�]ۇe)U�FW\Z�mok�6��P (*Q���\r�t��s�ڲip��O�&A��������Q~�/gG���!��^:�!)%�Zt\\��VA>�������۩��g>k\Z���޶U�Xt�fBBrZ|r�Z��ˤ�C���4\Z��h�ˤ&����P��H(��jЭc���G~A��3��R�ߌ/�LަeWG�F�7��X$L���T�t��Z�՗h4b���V�����GD�vM���4\n��V�rc�o�&��ef�\"^	l\0���C�%��Ի�����R}\rl]W���5��\0\0���	v�=7����㝫I�@|i\0\0 \0IDAT��H�W�0&�Һ�U�3���`����!�\0�O�2:gŭ��E�3��z���\\�l��S\0\0ܣH�v�t� ����ۘj�>�&���S��/�\"�\0\0�#s���q���ˋ���b<6��B6�Y:��S�]\0��T߂MD����Ȑ�z�������>DV�gNwV�z�sm�2���\Z��dY����\"��`�~qi�L*`Ys7u�8:�ɤ��h����	X�F.���z}�5��Ђ\r\0\0\0\0\0�1��`?5��\r���7iYY���k?�|����朇��k*��(?\0�Z��\\SvMD�]��&�E�Evn�LWX\\b�\0\0\0\0\0�R���ȪOy�m�&���%�zA�� Su�i\0\0\0\0\0\0�W��qC�}޺fҖ*I�|�c����3�It�N�(g^c�<�\0\0\0\0\0\0\0��ʄ��朧����Q/�T��DnZ��@D\\�Ȕ#�\'ٙ2S���!�\0\0\0\0\0�\'��0�\Z���l��k�\0\0\0\0\0\0���;\0\0\0\0\0\0\0��$�\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\n�`\0\0\0\0\0\0Xl\0\0\0\0\0\0\0+@�\r\0\0\0\0\0\0`H�\0\0\0\0\0\0�\0	6\0\0\0\0\0\0� �\0\0\0\0\0\0���\0{��\0\0\0\0\0���[��l\0\0\0\0\0\0\0+@�\r\0\0\0\0\0\0`H�\0\0\0\0\0\0�\0	6\0\0\0\0\0\0� �\0\0\0\0\0\0�$�\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\n�`\0\0\0\0\0\0Xl\0\0\0\0\0\0\0+@�\r\0\0\0\0\0\0`H�\0\0\0\0\0\0�\0	6\0\0\0\0\0\0�-=�e��Iㇵiل�����u�ޫ7b�\"2\0\0\0\0\0\0���\nT���<3r�[�Y�)�����o]��:�\r�&����\0\0\0\0\0��]��u�pn�욈�yg֤a�\"�\0\0\0\0\0\0@CbA������v���^�R<\0\0\0\0\0\0\0\rRmlG���Cj�����f��\0\0\0\0\0\0\0\Z�Z\'��v�>���>\0\0\0\0\0\0\0���6��+(�����A\Z������gۗ?�0���z��}��c\\+�*p��eۂ}a-�|g��nMw���\0\0\0\0\0�Zm��*(,NI����v�B���P=L��,:�obr\'�N���u����|���P\0\0\0\0\0\0�Głv���ִkߑ���L�~3!2:�쩣�,��+�f�=\\�\0\0\0\0\0\0\0�Jm[���M;\'�&U>�h2�ٸÚA�r�l�2gQ��{�Sy��AoO���߆%m�僟.��rO�]���n�/#}N����9����X��O�ӻ���$���%�w�ȼ��S+���&�dEm^��K�F\"�S�I��{���-iS.Y�j��[m�B�������^߫`�S\"���g��Tg�:�莣yЯ\0\0\0\0\0\0�,�Sҳ������o�nJJI�^HDD���rj�\"d�Z���0��-��Y��=ɡ#��)$�	������W5q����ٓ��DD\"�ƹ_X����?���͛���|�\"���6��u��o,�����f�(\"�ߔOfO�I^�`ɤ���s\Z�բ�ͥTS���\'��r���iZYЫ���^X8����6n��/,\0\0\0\0\0\0�Ĳ�p�O[�2�k�Ƴ,CDǯ^�m�߭g��H 2	w`돛��i�n��8r��\\H���Qf̻u31.���cIF������4G�[�񲆧��~�:jF���|>��ʏk�?�o\"�_�ھ��G�:�g�w���e����>���Ox���w�����D����Ȣ����D�m\'�pMZ���CJQڲ%���~+\0\0\0\0\0\0�A�,��y�����:�!�e����\'��EX���ti\Zޘsu�V��7�\ro$*�����ڔ2��5�&��\\��q���k�&VFdPE��y\"\"�F���I�\r�ӷ�L��My���60D�#�:wIugsn��t��&�̅j+5�}�T���H���K�}12��tcέ���6uq;\0\0\0\0\0��:u=gŶ��B����$�n_���h�H���O�B�ҥ9�vz�m+�	���	l�K����g���ǻ_9���ٓ�w9L|gqE����ߖ��N��w��l\\�m�}�\\ED<�񵨁b���e>S����*%\"2�%\\��<g0���sS-�\0\0\0\0�\'�ʭ1E����qr�b%Y#�Q�ݙ�nnS+����j��e{um���T�eԠ^F�/�����_��\"�uF 3R߱϶Ǟ>��xw�Ӧ��;K��z������\\����ع#�Kn�ݾ����~��ҧ�����ܻ5s(][`��Q};9.&]�����f�О>�����+-ŗ��&U|��5$Ԧ4Ogm}�=0���u��kW._�r5V��k\0\0\0\0���-�\n�\'�2_�����q���Cx�/?�\Z��Χ���u/5�[��|\"��I��HD}#:����Ԍy��<y���a0r��V�M���-��SÇ����{&��{�h����_?�%j�c���B���,)_�6�����7��>�zz�Rv��3dç�<�����\\`���\Z+7�JT����x��w�kמ��}�N~������s��&�U,�8�����o��%�۳��9x��&���ϐ����R��{��:,�q�\0\0\0\0�)<Y�e��5�8��$؃zw��w�M�}�u0\'��N�}l�2����#�@?�M�/���W;��4��/?�����W�}�|��d)���m۩/���DSaԑ]~�[����!W>��q���z�Q�D%Y�v�^r4�s��C��?G�����Gbȉٺd��Q�O�0�2��ŽlI�r�Л��\Z*]�W�Lm��ְs����E�!?����^�^9<~|����L!\"߱�����A%\\aԞ]����G�\0\0���ܨ������g}�x��i������?ˤ��L��5-zO��\r۴��篈h���_���Lԑ-��C�\rc�1ӓS3A�PK	gw?��1]¯��ؒ!{u͢>���7��]���I�mld�ǰ%�^	��:�\0\0\0@M���Gbc���ꚮDi�8�^��ZE5 �j�=�wYvMD6rY�v����\\���e�5�D�1C�|�z�u���K�m�ʳy�c��eD2\'π��\"��l�&�6�0)-[�#� t����c�d���\r�=�O�a/�;�m��D��G�E�%M^Z�j��\0�ߘ?ҷ�ϦIyx�g�6ȚO_4���~b,��w��s7��K8��GpXĠ���5�L��� \"�5�\\��8���cg�\'f�iX�������YT��<d�r��LE�g;����al<[t�ӿ{s�\Z�Գ�ˢ��p�G������W�K���Zu�ӯS���RᖄgL߳d��C��и\\5������H��|�jgY����~Z�e���u����{ð;���^#�u\r�#\0\0\0*m\Z~�A�BC���W����YiK�.m�&�}�w��%��\"�85*6N]q�kg�Z������6���-��o9}���U{���Z�﬩����8-Q�7�?���|�T�|=6�#a^YZ{\'�ܖ\ZS��M^����K%��Y�FFũ��[�7��qQW���{��%��&�1�DF�i��ړ4��%�V�ŞDCٖ���\\��ϜE��Wv�C�o��7d������v���_���Go\rk\\�j���eQu�:�.���[��ݦ�˧l��ѐ�����^.\n��㴙7o�)H�]\\1dF�|��C�K���_c*TݧFs����,X�zW\'�9\0\0\0��2����Y��+�f�ʿ����a��������mm��g�v�c�Y\0\Za�^��9��tE������Q�ş�\\ ^�xd����c�o�~�{l���5N�ܹtǠ�k$��Ѝ�|�7�\'x�woh��^��J����������*g����s��Y|(���&�]��r�2��٘<�:��<���7��Z����ߔ��W��8�ODdۨ}��^r�\"�⹘\\R����\"���������eau|I�Oo��g*�ħu����T�u�r�ژ��⹲�\'7�Y��(>���\\�~���������z�S#�E�O�IRS���~���?\0\0\0�\05�ĵ��Y�Y��Th���U��|��.ywft\\R�VM� 0x|zizȝ�M���wo.8�0D�����{:�M)��]=��߷����Cp����~1³��23���Q��7\'k��?����.�Ў�/6o[1��]_|uͲC9Dd�y����7^����ߜW�X���o\'�Z�ju����+W�\'\"�n��|� �y�Ay�۷��������;|5ܳ\\��z�yYX�.v��������>z�Yi�q^�������gl_sl�W��K�q�O�����L^e*:�O��mX��:\0\0\0���`�0����]����P�v�\'���~�3�ͫsO��]�D���\Z���hjzVՍ=�����0���֯J�p\"JJʹJpPݺM{s��.[��.�����q���=���̞[��*���\'Uܽy8���\"\"�ЖeM�B����l�Hw+��(��]�:���B\"��?��;�51��3�\"\"J9zVq������o����j\"r���ʲk\"�u{탉�D��ܼ;QW����yYT_p��=�D$�����������9އ��������`�v𨑣�*�3vP3;A�G\\�v�\'\"*��ƺ�\0\0\0P�2\\�?D�j�b���F�\n��H�j��y�F�>]ڵj�E�\"�3��rc��mֈ\r�	Fگ�́c%|�Tm?���8]���J\"r�2�G�?vo�Q��UԦsu,��\Z!޹+^s��_����>�\"\'?G�*8��/�_ӽ���!\"Y�)�?XBRw׊?���^s�GDn�G���У��n�y�_����U���r/O&\"�1�y����\'����\r^q�TƤ�F��]l���:M��k:\"��1�S�Ԅ>��睮%�@1OT�����j/�Z����!��C�\0\0�究-�<Qa&��.<&��|:�hZ�+���&��4�n\Z=����v��^	�V����G\n�_\"�`W:VB�,��\'s;�&��yD�Щo�}\0��i��<��W\n;��&\r�����9��|�iتiMk�KD����/�>lR�֪;�Ч�3�}u^c����뻾�5k֦M��.��V�E���`̉�4��?̳��`־I�~��x��kR���7���웵r��o��k�E72(�f��J���yYR�Q��%\"�Q�\0�^^���q��N����QʈتO���D�ڟFD��-�l\0\0\0�}�.OD|�����#�7�5|�]<�r��A�#B�2���V��M��i=��\rq��-�\"�<:�~݇~�^u��gdҷ^���C�6���}�����g�����m�`�_Y�xb[��{D�+�acE6������[)����\n�Ȯc�`I\Z���w����+��{9U�G�H�\'�|�}��?�������+>�z��\nT����e���qM�����_<�}-������16̱\\�}�K�Z\"\"��ܒ)\r��NcL�\"��w�@�bCDī�4ٲT_?/�3�sJ���N��k�qy��ywUr��D?��q���ʭ�qD1a��xy���^w,T��x3J�oR+�����o�FU��\0\0�\'�����j�a�M�8�!���wN�y��ԯ�����B����os����	Qz�`��Pm`�D�N��y��$Ф_��j_y�85:~�7���v���\'Oo�^Y���^�{6@)Π�����_���b\"b��\no\\�t�z��������^�a-c6if7\"J���C�:\Z���������=��d�Kc��o�, \"�N��7oS�1ɵ�F(�KtՄ�i�r�\neN~u;����g�6b\"\"C����9C��B����yվ:����Qo���w����������ɮ����xܣ��\0\0\0�5K�.�T�X�!�>H����(��l�]���R�!.�����l+�fb*I�$�ĭZ9��Gr>A1ϸ�D�$݃�������V��տ�y�����Vju<�`��j��L�!\"��v���w��]�����o�=��w�{u\r��C�i���/�j�\\����\Z�Hvyꛟ_\r)��gL���ԟS�fƱ�GRuBψQ�\Zw\Zظ��	DFU����V�*�����=/\\V�K:�;)I��2��Ԋ�O�4{�Y$����m��V���ȵ�+M!ULb!פʴ�ڴ�l\"\"�@O)Sۋ���?/��9:�.56��V.$x>�j�S���{��~S��ٵ���noo�g�M�{vw�.\"V$w�֭�;��\0\0\0O�`�o2�=X8�e��M�+�K�8���m��U~�c�-]R�N�8��c�������Ӳ��I`j܈M��+�mv�q�\Z�Q|1�]\"�������[��-4��$8\rl�?u����D���_pe�E]MG��9�<ҳډ��}g=�{ʺ����m�X�QԨ<�y�5y�{�t+ti>����Z�@%i�j>\\���X�&m=).������U���[W����[��k��T��DB����(EI�{�g��S��1�{a��[v��ϟ�Eձ-��Sl\n��?p��)�:^�E�Nݦ:�7pʬ{MrVq�.\0\0\0�\n,�]z�I�������-w����|���|w��|�L�����CŮ�b�uJ�ig������t�6�վ1��8e�q���og�����j0r�W*��&d�塋8�_|m��}D$�ڑ!��.�f$\"��+w�?���?;��LD���߬\Z\'���=Γ�t�\ZS�%�n�GD��gdq��\Zx]V���HhkonR��%��{\n \"J�m����2��+��KD�߻�G]���z���ā�F%��t{����\Z�����:\"r�?���[����,�N��w|[em�rõ�/���OkAx\0\0\0\0�����ۧ�s���D\"�8U�A-�JiJC�Ґ�H����1<��8M���cSa^��D��V$��L�W��*�,����\nKLS��4K3{����efa��<�xM��B6Tqg�eޤɽ}�������N���q9��D��Ƚ����-v�F{���]I)�d���_��4����0�ꁳ��Gw�}vV����Y#F�n�� Ԫ����r4����5�!���~�f\r���^���ϯ�\Z5zx��2}V��?�_�%\"�/�����3���7���5�x��W�]\Z>�w����;����)\"r�;��&R�.��p���:ֵ��3O[yE���i��<5�]���x���1�\\��\Z��Y�*�|�oi�g�a�5\0\0\0Ԇ�-�w�ൺm�4���$�\'��iE�\nܧ���h2XQ��Msr��x2���&��M��g8��n�҄�2�E�e+g�3N��^[��b�\'�^��7XR�	6TQݬˮ��}�\\���L��G�D�ٿo@��Bз����Y�~�H�ӓ�DT-�.|�k�N,>��v�s���>��ݷ��+�~����>�a�͎pb,�ƶ��%o���D.�u�ϵ���{�0d�ǯw���ȵt��_v=�?����E��)���_��.�ӥ��/fvrd�~^�V\'�\Z��ҒE�~�RR�����˝��.�U��.������\\~ۮ�8$�\0\0\0P+��M~�������җy�y^�߶!��;N�d\'%.�z�g{5��Fe���m~@3}���y�L0P{����%-���������l��^-$�pObG�f�z�?���ܼ4t��}qDD~���V��D����lސNYG%=3=����s��)-.~{��y���i�ʍ����ס�7�\Z�H�ܪK��������>���Y��M{����^h �87j�e�觇�������*��<�[�Y�6tۻyǡ3QI�z\"��o��FL��߼Zy}��,�����]����?��s�RL��c�.��=��\Zۋ�uҼ���\0\0\0\0��j߂�ӭ�,����Ⱥ�#e�h�l��R͙\\�����|S|3����\"N&��M�u���A�;�s	gw�� \0\0\0\0\0�/��]w��W�X1�#�;Y��-�\0\0�fR�ݼ�R��H\Z<��A��\0\0\0�i(�B7�8�1$�\0\0�fʿ����\n\"v��4l\0\0\0�TCI\\J��l\0\0\0\0\0�:d^��qGq\r%��	6\0����������\0\0\04\\\r�e���Y�!�\0\0\0\0\0�C,��X5�8�3$�\0\0\0\0\0\0u���7�8�1$�\0\0\0\0\0\0u��AR��3��qr?�k�vw�X��	6\0\0\0\0\0@�;5��#Uy�;�Z�F~��,�;)�\n5@H�\0\0\0\0\0�P���=�{>�(�Q`w\0\0\0\0\0\0\0\0�H�\0\0\0\0\0\0�\0	6\0\0\0\0\0\0� �\0\0\0\0\0\0�$�\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\n�`\0\0\0\0\0\0X��e�\0\0 \0IDATl\0\0\0\0\0\0\0+@�\r\0\0\0\0\0\0`�,�f$A��<��Y��\0\0\0\0\0\0�H�l�P0�W�U�Ϳ}~��U��A�.ˮ_�����?|���b�C��C�~2�_�X`|�R\0\0\0\0\0\0\0=�+|Pխ,�x���:;vo1�W爎�����}���+8�gfɻ3\'�R~����?s�J�B���PY�$�g�i\'��k���I��ݏ;\0\0\0\0\0����l�X�x��ύ�f������_�����S^~�)�Gn�u荏�>Tt�g�L6~��٦�*�<����i�a��ż�\n��`\0\0\0\0\0Ե껈����7���ɭ�˜K����ϏַlK%JU�/�k�ԉ�������!�r���{���y��V ��l\0\0\0\0\0\0��jL^o�%�~��\r+��U�F���P��;rz��Gn�$�����<��S�z�����Y$��B\"��\r�>Yy3��bk������}Ӕ�k�\0\0\0\0\0\0��j>q��/���W�{��+g.]O�TT:&:6):6i�}��;�m�)|`������3[�g/����H���7m���V�I;�KR�/_�~w�������?6�ERt{���^�yaR+��b��3g�y���H�yt��<s���{����Z����F\"\"YĢ�������\0\0\0\0\0�\'�}f�x-Z\";�ۺ�9�89��HgGwW\'G{[�D|1�U�$\"\"I��>��~5q����v�f�qa�$�S�x�=�pޢ��^�=6\\V�DYЫ���^X8����6n�[-:�?pu\0\0\0\0\0\0�D�O��Շs�q���Ft4�j*)�9uqǾ�GN]�y��zui7fh�>�mm�V��-����޴v��sk�m���)�߻���)<�i:p�{�W��>����*��G~�N�m6p�k��wwR��Җ-���Ww�\0\0\0\0\0���^	v����;�1Ͳ�\n�F�=zHo�ɴ�虁�:�]WҾu�nZ��p͚�\ZT�iz�ߜ�ȱ\"����J�n�W��KnG�*e���^�싑�����9�Ng��Uu\0\0\0\0\0\0������P xcڳ5���R.�acFVNM̙�L��w58��D\"���\\�D&$��Xa-��*��%01e���\"a��y\"�3�N�9�������V\0\0\0\0\0\0O�\ZlOws�j��}������}���<\\k��0)� \r����Ȃ[����x�3s��\rM�ڙ�d��VN�M��t�kH�M鵰���B\"\"N��#�����\\�̗kS\0\0\0\0\0\0<�jL��2O��^@�������Kj��`4��]���y}��֢5�<o0\Z�\Z��3�g��eP�㧿���U���w�����+��5�	j�����u\\�y*�p�3���[����C|[v��q�c���m���]�e�@�=d���<�+�z1�=�g{G���������\0|f{M/$$!�$@轗Ы��D�XA@DA�EP�����ҥ���PJB�\'�g�����M�4�??>,�3s�Μ;��3s�\'��������\0\0\0\0\0\0��J9���rr���:\'WU�˽c릝�6�k�>7�Z.Nɩi3����1���|��퇑�\n�����Z�-K\\^��I��}2z����&��cɯ�SJ9�Mĩ�����EK�0�m�-{���}z&u�_��}�ƺ�o�t�N�=��Ǎ�H����=&,\\�e��:�.�Ѥ�o\0\0\0\0\0\0^J�[�~��|�oW\'��GQa��/^�}�^��������_���ᄑo}�U�F�M��k��ߧ�_]����V�ު��yR�\0Q�ݘL��H��ƶo=������O�����ŽU\0\0\0\0\0���{��Tj�P����3�Wg�N��h�Tj�Z�W�3���X,\n|�q~��L���#���H��?}���?vrW�͵7r�V��[N=0��9n�%Ue4W%R��U\0\0\0\0\0�����{r������R�8O�_�������3y_��R�������o[JlN��=����V�k�ui��fK��J�U	gEU�\0\0\0\0\0\0PN1�9rAictY,W/����{���;�jP�[$��So0�}�(�r��b��!���Ww?�*��ǿ���\0\0\0\0\0�R�������q���M���tmߧ{{�X$����D��돞�t�ԅ����g��gV|�\0\0\0\0\0\0\0�K�6�r)i)i\"�v8ID-\Z��ԦY�J�fӞ��!�o�T|�\0\0\0\0\0\0\0�Z飈� ����\0\0\0\0\0��j�=ؕ7 \0\0\0\0\0\0�6\0\0\0\0\0\0�H�9:��䃝2��fޭ�߃\r\0\0\0\0\0\0P��{�щ+	�����|��}A1;OF�E��g����p\0\0\0\0\0\0j��p�j�fjf.�^��ݧ�w��&\"��=t>�ҢB�\r\0\0\0\0\0\05�P��v������8�����s&�pΖ\r*-*�\0\0\0\0\0\0P��y����~Rc���:����c�DC��5rq�TZTxL�K��\0\0\0\0����c��]s;\"6��Z(`tz��9���V0Sl<�\0\0\0\0\0\0��/&4��.7�.Z]/�Ҽ�����B��\0\0\0\0\0�\Zl�Mkl��S��9I+?�\0\0\0\0\0\0P��}�i���s�7����l\0\0\0\0\0\0x|1�����:nr\';qUŀ\0\0\0\0\0\0^��6\0\\\"\0\0\0\0\0\0`(�\0\0\0\0\0\0�\06\0\0\0\0\0\0���\0\0\0\0\0\0��\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+Tu\0\0\0\0\0\0\0\0����:�ҡ�\0\0\0\0\0�j��YQ�!X��\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+@�\r\0\0\0\0\0\0`���t:�Vk08���X�z��xB�P,3Sձ\0\0\0\0\0T_(���H�Vk4����)�e5\Z�^���娱\0\0\0\0L)[����6f؀����rv$�������uxdtń�A��i4\Z��\Zuvv�^��ꈠ\ZJ��H,6*�J&��gee����t��\r��	�B��\0\0\0\0�#ƭy?g>���s�ɤ�b�5Z�V�߾�ڱ����8h����\\�^������j�rp]<����YkkgGD����顡�nnnR��J��l*�*>>>  ��\0\0\0����AΆ�l����:7O���2��D���6�A T<��@D��)..�����@��⚖�Zl�N�{٪k\"�J�/�I{\0\0\0\0��EՔ���Y����b�����ǵo�d��1�ޞD4o���Wo=����`�bG5��t\"���c��H$i�ڪ�\0\0\0\0��������(�D����;�LLIKJM�s�̫��{MDb���ѯVP���Ӧ����w�vp������&����N\0\0\0\0\0\0Pv����Z_��������M���n��u?}ED]ڵ��z��l!H���s�@�	�̘�;�]�\'\"�͟bH	^��%Y�W\r��t�r\Z[⊞��N�\'4��::$.Zr+�\0\0\0\0\0�2)��R.suv$\"�^�Ɲgg�z3�x?��������,�w��ًߛ���/W�x����S\Z<M�ө9��ߎV��˵���IX{���!?-�taP�	��zr[�q������\r\0\0\0\0\0\0�i����E\"���4\Z]��fE�5Z�NG$��y|>�\\apy��\Z|/�N�ϻ�r���&dH:��<MFnO�[H�׬DDtt�G�\0\0\0\0\0�K������Ç��:�o�n|1l�0+�ֺ��ќ^�g�y:�����m���Z5����.��տ��?Jm��[`�hܔ�#ۺ)Hu������My���^���_�u{�o\'J�����Q�\'�9���0;j��?~8��7Մ��U�����S����L^�o\0\0\0\0\0���a\"Z�t駟~JD>���%���$gg�Ǐ{{{�X.ߚ�o%F��Ϸ|�y��i��B���Fa�,C�6\n�^�<9M�\ZX�BV0cg�H���j���Ȧ~���6םK��Ģ�[W���+t���۟ex����*\"�焅��\\�q��w�n\'�Y��?�����(��22�_��+�h��!+�&���ĿԾC\'Ν<��?��L4��^5c��OfOM];yCx���p\0\0\0\0\0^z��X�[�^=�9s�|����XmPPP׮]M5��w�}����X��es�Jq#s��^��Ϙ�PȌ���I%�Y��O��(�D$	����J��~�����q	���������\n��=���d�hݣ���OOݺr[�5o���q��V�h��?��a{���Q�w�b�;MͼRl���������(�߻�\Z\Zv,�{\'���]�����\"fHe����T\rk�K�O�B}\r�R/?�O�� �U}���Ы�|ys�߲�|�\0\0\0PS0c��r\\\\\\��ܥK��9Y]���_~򮛫S����Q���a�\\���fO{�w����ZG̮���4_�T�Ÿ	�a��^��1�z]?z�O�\0\'Y����G�w��-I�t-5��pCڃӱ�7�;��=u]�q7�8�ը�9Y�\Z����ktO��h^Rl֭���7\Z14\0m�\"Vw�J��=���ùn��=\0\0\0\0ʪ��y��7o�,��?���_�����ߧO�>u�T���6�؜ݻw�֭��E���k|�u9�(N�veY�S\'���?�=�x,�6�K��aי������_Ӗ�OSkō~�0��+��)�/�24��F��r���.P\rU�ʡ�1dd�\ZmseC��D��j�7,\0\0\0�\ZO�պ����\'88���7V������رc����?o�����.vc�)�N�*zM��U�s����U`W!��G,�	}\Z�w��b \"�����b���a��QM[9z�h \"��������em�d\0`-\\��p��\0[�}��Kڷ_����H����ߤ�u:��K{{��3\\X>_�y��=CDl����n�U��R���z!�e�����X�f2�\'�����!c��w�^I��n6�ǻ\rp��.={ݦ����*�y7q�`�cCDlnޖ�	�njrx��.3��z��r�\0\0\0\0�Pb��f]�]>���/TM\nlF��ݤ������w�wG���\'LC���h�c��n��b4���&����7\'��ָ/>��zu�}�c���-�ON��W��k�	\"Π%���o�����xw��O:�yWh�Zj��g�wt/O�>���=)�G���n	vmW7����l��ƳI�n��d<\"N3�l�t-O�Z�m��vS+w�3n��>�FЅۏӵ$��jԡK+�bW�s����z��%��V�v�;���M6ĩ�n���8]Ñ�ƳY��n�M��}wR�A��Ϝ$\r��K�y���;1Yz�{7�ԥ����3�u���;1���o���\Zؕ�t@DD���je���LH���gD��PD�Q��5v����Ol<���;w�q�~��r�_�!*��2\"���j6B.S���3%���Oc%��ܿ�J����~b�����{�^��Bwhkܲm��Smt�u���V8|����A�gk��	7L�uf5[~����4�S�]V����3y�5�dr\\�\0\0\0\0%��G�jR`����V.��r|�k�r9������̂�??2Z���xn������Ϧ�^3w�~򈏿� MԵ�ӿ�R���83M��a�������ۃ��_��t	ۼ:�������۸\nOm;{?I��!\"2d<�Ը��1QdȺs5�Y���lٔ{����6���C��݇xHU1�Ν9���\\Kdb�J^ʵ}�ɿc�n������}��s���ƞ;z=˷�+=(��ӧN:�z��4���QAG�g�w��I�}���3�u���\'\"ΐz�h\n�5jS�A�O����I���ԳcSB��W��/%\"CZp�M�N��I��=y�@_\n���%eL�|],%�w�2(k�K�z�܇)2�S>tt`�$Sǳ!�H�cגw�۹O��uE+�������e\\�zb\"wA_���YC�Q��z����<��o��ؿM���G��M�N����C$��˞�g�I��5�f���M�D$��ԍ]�vs����j7\0\0\0@\r�p��\Zw�����I]ՠ�V�-3i�ɷ\rI�N���Ʉ}�_��C�|7o��u�㏎v�����~ؿ���Ç�/�	6���!gW[�Q^,|�B!0<�\\��	�����$���Ȑ����CʰD�s�سm=9C�ر�&qK��~��r����MHDN�Ҝ������#.y�l���L�#�6R�\\�p�[�_�k����u��\'w����9����	��.�F�\ry\Z8�Z��s9H�����ѰD<\"2�j����ʁO����]�㠶�r�ȩc/-w[�2���HT�k��\"\"�����=��c�U��R3qQW3bD�)^|\"�ֶi)�<s^5��,%Z�q�il��Ӆ�^�֑�E�Hd������F���9��\\�J�/S�髹v=��#����Vѡ`����k�-8��ǰ���Ң�j��$�>{����Huf����2�D(���u��\0\0\0�2���/�Ν[�QT/�\nH������fL��R����Ľ�\'s�A�֣Vnd��V��R�r��6��u	O��!����LQ�e�]w���6ɹ�:���f��t6��ׄ327o[Ý�\\�ד$����:���.�k�����WKJ�I&\Zr�n�\"=6<8,195%1>U/jP�>c��c�ڛ�KI�+��/plڭ;KD|��m~�`�<�3԰�����Uiusf�}2�vF�J����91B����q�oV�Jz�и�L��>%}����C��v��<d_�OO�}�����J\ZK��98,�hW�I>2v���\0\0\0^U�엋!�fХ���oóD�޼������[;7��a�9�8�e�}\Z*��/Q���gkF��v�ۍS�bbc�^9x�V���6��b�B��$���W��Wv�-\\O,篞c9bL���,�J���<���4��-�����M��1g�Cn��Xr$���SADĪ4���:�׵kaH8~O� S��/�!.>8=X�z�s]�?��83�2��E�#���l��r�ǎY���ڣ��X~D�k#�Vi�R�1�~ǥLO>\0\0\0\0\0x��S@��g���k�:��K���Gw�Qx��v@����\r�Q�˱y�q�\"g�ZN\"U�Vjgoooooo�E]�p/��q<���0�q\\n��*!2���\"/R���/���.r��o֡׫C;8dE�g�]Kl�͊�\'i�+�mc�:�b�����La������du������:���ւBl؅�4[�7[��=%��[:��e�����8\r���u[�#5Ǫ5G�K�^��T6��=�+9��mc)�X�PZ��UDlޱ=��Ep�,m��.��s�+�[�wrP�:�A���Y�خ��du��8���6�d�:<<��ɷ%��E\0\0\0��8���(���3��e��e�l��c}_����\\�T#\\c������K��m\Zwq�ى)v�´�g˥�?w5���M�\\+��Z���p���SC\'J{p1(N�����\"3�����\'8Q���R63�Q߶�\\�Ҭ���XH9Q�Q^�6���XV���s-v�S���_���k��>J]��3�N?W��������#EM��u�zm���BQ��<���`E�AE;��_�z��Z��7q��x�Pи�]/�Ԅ��x�LpN�k2���Vn��Ʈ[��\'h��i�ނ-�+gۗ�2#�M���`s��St߯u���J�H(;Ń۔���T��rY����+\0\0\0\0����_�������e\Z��Y(�������XЮ-�}�\r�������!n\r���J|ۦ<�n�/C�W�7�=����ȱ���ܙ���I��ۮgOI�橕�4�w�����Z�z5�ק��ӹ)�ӵO�3�.�!�y5���_��%5�P���_=�+�\'s�oճ��x����u�&Z��~Pޙ�\'v]70\'�N:y���`��ӤF=~$��ę~�:��l����Le���;�?�r���O�r.|�hX{��\"�H$�߭7���=��/���P8U��c�����.6�>���L�;���	e�,\0\0\0\0P3=[N[^H��Nlƭy?S�]>𷇛���*������63�7T��ͼ���ID���mۮ���hcNl9#��Fgc����۵�V�ׇ5�ý/�˗.�oА�lmm�Sn޼Y�~�*\r�jܿ�Y�fU\0\0\0@u�0Lŝ�f��8��ݻ��c�8����z�-c��kz������+�l6�S����`�l�7�M�D,k�^1<O��/��S篕)��8]NfvF��(q�!���\0\0\0\0\0��(--�Bkl�cǎ_L�2���w���b��+�v>����J�36+���y��4E�]�\0\0 \0IDAT�/�h�\0\0\0\0\0�B���?z�h���1�<ߧ؋�����k~�{�M��H�߱��������Р��\0\0\0\0�%ѫW/c%���]���ׯ�j�J�шD�ypKE���x���P`\0\0\0\0\0��*�/������j5�x��6B�\r\0\0\0\0\0\0�Q�j�ʇ��\0\0\0\0\0\0�\06\0\0\0\0\0\0���\0\0\0\0\0\0�ؐ?�P(�j�UTGZ��|C>\0\0\0\0�TP`��|\"rtt�|�\Z��j��\"\"�M\n�*��JB�B*�J(Vu\0\0\0\0PMaq �H���mlm�(4�jl(J$988\Zӣhm������.�* \n===�:\n\0\0\0\0��P`	�B�X��hl��l��:���|�T*-����M@@@�\0\0\0\0Pݠ�\"\"�D\"4\Z��`xɟ\\���x�_a���\0\0\0\0@�P`C>�@  \0\0\0\0\0\0�I���U\0\0\0\0\0\0@��Q�\0\0\0\0\0\0�\06\0\0\0\0\0\0���\0\0\0\0\0\0��\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+Tu\0P]���Vu\0\0\0\0\0\0�Z��\03���\'|�ի�J����hgW�Q@\r���![��� Hח�;XQ�Ç�g�%�\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\np�8<�q\\U�`Ru�\r�-�\rX��<���A����ߡҔ��n�$��ȩ���a�jrފ��+�y\0\0\0\0\0\0@\rR����.?u��1��m� W���q��H�~h\0\0\0\0\0\0\05G\n�^�?w�`���}��=,S�=\"ú�A���T�ؠ�Bڀ�-�[j���	�*M9���c⭅mܭ\r\0\0\0\0\0\0@\re�l�����Ի��$�\nQt��JQA\r����hѢ��S34j�h�����Ε\0\0\0\0\0@e��������(�G�<w8���o��Z�H��Y�P��Z���F<���<�<�x(�E�yxx̚5��+��e����E�-]��jM�b�n:�z�jI���x��ӈ>���}�=F\r�\'5u�FYҮ��q��fث�l���<S�����vA�h�����\0\"\"]�����U2߁#z�L�rB�l\rJ��ھ>��]�v��Ec� �������^�}��:���hI�W�wt5�����z>����jUL�V�2\\ރ}�Og���Fg��B�����*�Ք\n:�aQ��S���#�<R1<��ֵn�vm\Z8��ړ_ȯ����J��j}||�(,,L*��uqK�|�Zo~���f0�/\\��v�X�홌U�OM�)��5�~���\rj���5캟�Y(^�N�����e�2#�j.����d�P�.g�/�rߝ2s�L3\'�G����o?��/ŗ�%�ݾ�ʳI�k�bxo�3��E�tq��3^>C��H�u��g�ڿ�?����6V<��Z�>����;�u݆�u,�G�Q	)�K��c�y\r)��t��i�!Ӑ����8rW��ܶ\\��l��,?�4�Բ�7T��G%�5}ܩm�oѾ{�����!\'����I��\r��Z1�[�˰�Ƕ�L��ah\'��B�������)t�7â.K���J���g���TA��;��y�_f���B~�W~�V�F&�H������?�XLD7n3f��Ǐ���6lha�mi���1<���U�|f0!O���pU�\"��_a(�cFa\'�U��\\�r��-��B��XZ�3��\rb�ߎb��S����<#X�q%��.���<������2�i��4����US\Z����}�ݳ��=��5�ҽ���!2�]ݹ㖰m�ڱ�Ct6�zw��(1dV{��ِ��O���#b\n����!��Gf�]�];8\n��������:x7�ڥ���t��0D�:�����MGb.`N|*�v��Ʒ�g��`C�׆66�Z�/����e���P��a3o��~I���+����һE�΍��#E���%���=�I[%CD���{�qE�-q��\0��g��/����6�!���7�m�\rij�#U���\'�}�����.�I�t�fT���U�N\r�dr�?���1�؝w������Wk~r&?�����=��>�Oں�>�`��ή\"6���ms�ѣ�����2�wI}��m�O����kS���%��+c�/k\'ma�R�rUE�\ZWky�\'*��ZH�V���~ڐSA���;�l�-/�_;%��5��YZ������s��?\ru�����Ug��[Qo��-���[�,��ݻקOOOϞ={^�tI*�r�v�����3g΄��=z�u�֖���cwd��M\\J|kg��!�j�-��(�a~ƴ���Y���c\r_���r\"�:6��9�Y�uw!4}8-8�q�+\nÔ�Ǟ%��B���<\"��b��86��?���f�f�߻�.Z:��ܐy{����v�W�����~��?q�ղ���x���Zd�o���Ů��|۴f���7�����=w�;?0m�xv�ʹ]L�h<��m[��l$&f�o��>gOl�T\"�Z�^�46�Z>������3qyw�����as�ޱ3�v����7�|7��ž�Q}e���ց<�F=��[���i�oCdы�-�2�o(C���;w}7��q���wFvm��3����6��p���^�2n�R�Q� v�i��qo��\r�]4GL$ge|	}��R�����%ڍ��W�Y��^ә�L�\rTB�)S�l�v}���9Dw~�nEס�k���}Q;)\n�Q��Z��/6��T�+`��+���?Hl<��o�F{�pL�p�Ǯ���t�\Z�	�b��{�xm��ɡ�<���{�;�s�Un�,�G4�P����k�.�\\.����ۻw�V���������w��$mIŬ��~�U��Lp�)�;R�°Nt,F�[� �?����ގ�=C�8�\'��눙�@����m��V���í6\"%��	�=���q��]l>u����h��j��wwz��)��r�<?���m��wz��n��t[o����/.��,Y���g9�eY�5&e�kͣ�K6���N[�߾m�\'��F��mw���?3i8k힃[�����#��ש~��#I���,�~h�?�z�o�8u��vE�ψ�6�ٽa�0o���ǭ\ZM�]wtv�l9tt�o{R�ͳ�j�L��Y���5�~�+j��o;�Y�Q[ÙYm��e9N�h[�\'Q����8���W���]v NW�V=�J9\"\"������{.$�9N��h\"�ul�����i1Ȗ>[J<�p�Z��\n���_?S�AV�p�O{b��\',�~p���z���n�|O�Y���}���|F�\Z^�po�ҽ1�Bpd29K�#$o:����O�h96�ֱ����+-mKj���V�.)j�іM��)���oǧ�$��(G�/{\'��R}ҵ�ݿ�o�~�6����0W\"����ڿaFs=>w#����.��UZ�����w�8�eY�e\rz�{K?��#Ru�*笗�5���O�^�$����P(�رc�Ν�b����X,�ҥ����qN*M\n�G��o��?;}����L���)��n��V�o����^҉�n�*�\0L��+�xnet;��Y,���ng]�P�����<����ٚ%�*��%�vym��fz�3�sSyS��~�,�m�/��/�p7����-�xa#�3C�|���MF�����\Z;Y�����>��b�E��֯��x�ԑ(��͔�4q�3��+� �k�F��T� ����i$�4v��T�ٷ\Z9�y��+���k�$�6qD>ߡ��I]e�x�F\n��o���|\"w����e���XÓ��L�XZ$�fӧ_I\"eױ��|��{:���Ǯ���DzΡ͛o7a�х�/���Cz9у}g�u�w���`^}rjQhv�@��4�bN)���o^K&Y�֓8�6�.X��g�j1�[��]_�1�Q�G�f�]�/VW�	L&����I�v�����b5Y!�CҶ��*L]5�l_(c���\Z���N��?�P��o0��N\n��Rӵ����w�[�!������рN�N���@��=3f��6�3�)^ 	D\"�c�UNV��jn��=�/_��dD4w��o���믿�?�@ �J�7n�ؾ}�Zm�p^e+��� �f5�e�Ո�h�����2㸳���b����,��S�N�1�_=�ES<y��f,Md�D��Y���?��ۜ[|5����������i�K!�Y�ͮ�d?�G��NCDĝ���G2�-�n$�����I�Ju_^V�WsD�Yw�۠®AXu����9�/��Ĭ��1�b>qDd(�]���z��H� #�#\"��p(ʀ��i���R2p���vR\"u�ڐ����T��y:;�(U��F^�-����XM��H,\Zϡ�B�����m��N̰Dı|�\\H��ղD5s ���\r�ؽ����/�	[����ڦ���W����zi�ŌR�9L��m�Gr;I���Sm/)O��O\nw}5ǈ��|Ĺi[����o��<M&���ǉ���rٷ�T�}���zE���2��uI���Mf��B��t-s�7����1,��8\"\"�!�%3G�9\\�u�ϩ	�QyD޵�<|�[=K�3___�a�R�@ hݺuǎ��m۶;v<~�xVV�����̙U���vI<G4�r\\�-!������n�5t֥Xk����\r�x���p�#w$֠*xK(��3����8�J:+U]��c�aW��x>]$z�A��`���R!p4~h�������X��D�v�J���L�9ڈ���^徦e+n�E�:�{H�f��#G�=�o���M[ui�*,��-�L�5	�}j�(9�~���8N�r/<�`�>�x�z�Z���8N{�z*��}�	\'w�T˻}�u�˿����ɊM�hI$�f�z�0����8N�t�jB)�=�:�l��7St�q�ȫ�Z�yx��J�3՚����\"|���R�V\\��;m��l(m��}Z���^�ly��S[ނ\rE��G��\r,�q��G)%sl�����8�3���f���-���Z���SCeYN�=rֈ����c�\'��d�c����զ��������4�O\\�U�%���wIӽ�<}ߑ_�N\n�ڤkY����\"�*z�`��>۴��������b&#�S�R.����o��\n|�sV���N�R˲�Gn6N����Y�%\"�a8~w*������}M��X�nS:o����I{�vL6G���c�\r0nr#p�g��3��Ձax5a�֪gI�Y2��i�F/�뇾�`օ�n������5�����l[��mw���/���o�{�KT�����x�����ú�r�A���q�����LQ��~]~�~�t$=8p�q����Z��U1���s�uH���˚�8YDDt����u�kxp�l\n�\Z>�����0�����Ц+��&��C\ZH�Go�%��!u�\Z���e�i�6���[L��ݨlſ�g{QIg��[�,����s�{�D(\'��Zs[��+��T(NPw��g?�\\0P���4��x.���_�D����)>B�ye�C��>Qv�����_��E�������LBɁ=O\'��RY�Z��o��r|���a��.�\\���N�]�HF����W�%���ƴ�.��Un�,-�T5t�֭���oÆ\r���W�^�z�j۶m�	�p�)�ʏ?�xԨQ��͢3�|���i�*}2�(_�q���(���e/���$c��ى�{Enaөu,��=�ߛ^{^^�>��?�\noѪt�X~g;�`�����}���IY�Lؤ��{;�/\nl0c�]��B����䥟�ޒ����۴�`N/g˯\\�5��t��\0�ŭkVoבy���?�F+Ǥ�ǎ]Jth5�˟�o$��������\'���nЯO����b�*��l����1����MpmZWL��-۶�7�k�kʹ�F�6��c�_�z�clZ\rm+&��g@]q���������d�&6�h9e������W���ص����m�M_�Q�����S�ǔE�RV��$��g���5��s������D�ҳO��>���]�Q6�ɉI�t`���g�/s�7���\\�*L%�kٺ���M�0��&�]�;E��}t��\'�\\��i�ڌ?��+!�W9Ui�V.���~�C�yyy,�~��7�}������W_�T����-Z����;�K�����ѩ�bUW�\0{ɔ����D��NrwD\0��~78UEDo�;���Լu<6�l�/\\�ͦ����bYN$Z�ݦ�]}.}a\'���j/��t�5����a��f��l���bY]��3���Bv����S�ۍ��^��v��Ko���cZԑ�X�Yq6cI6\'�Kv�?��A�����rS��S9��.�Crr?}�K���7�v�?�/�)�g�n�I-K�\'$4��ӳ|����<<<F�\ZU�ӰY�ݴiSLL�?�P��g��)M&4O(H�Q����B>�a���Vg bxB�X`���b��gЪ�%|E�\"���c��c���Uk1_ \n�q�N�7p1<�P$�3D˲��<�k4z��\"kY$�VE�\\���ȹw�gش�s���j�Y�v���ZF ��l��6�>��[7�?��3�q�A��={�GMc\"m�\"��oܩ_$�9�F�c9c\"�4j=kb�����g��361|�H(�1D����yT�1��	\"��j)֠�i\r��CV����}M���_Wf�P�K�Nv|ӽO��i���V��Fm~�9g�P_�.�c9�/��7�����v�N���+J�IW*s�����$\"��h�ig�xa&�M�J�՛��.������q�N�3l/|�����F$Ldd�رc���$�D\")�\Z<//O��(��\r64i҄�����YU)x��m��w]���^6��I���B��H?O\"��;����i��`�V�)�����)��K�2�p�YM�?Pn�v���3J�U{&4�#��v�������J�2�c�rz����LS�ʎrF���A�<@��)Q�fΜ�x�����sW�L�qJÆ\rgΜY1��:�J���Nc�==��\\z��؝E�k5%��q�����c�ZuI�hѲHL,�����u`����/���؆1�9��h%m��5jU5���������\"������Ȗ��3�6gr�==�ש����5]��_DO(S�i��h�_�+�֩8^��{��,W����%�3hժ��0*c�/k\'5�0T�*HW*s������\Z�̱�(39l��UJ���\Z�����r�Z��\0YYY���nnnݺu�u�Vff&�q\n��C�/^���z��)���M&���w�߁�J1��<����/����0��\\N�\r��&m�����a�\\K�S�ufn�Å������ܚt9y�?5�3v�f�\n->�>W������p������\rK.�}�Il姈}\\�H/;gg�r������8c��_�v�M�֧�ĩ�:�2�J�l�j��ɩ��r�R�c��ws`^���Ik�+T!%*��������bq������7w�\\\"�6m�رc���222\Z7nl���.��������N�?�HLV�Z��!�D�e���	9�\\���/:��k�__�Ƴ������J�x4�Hi���%�]��/��\"����1���7�)5<�+��f��͗O 	�Cı�^��{�\n�&�W�XiC�l���y�s�)9y\"����Sk�/ؓ���I�,��˩f��U^Y������W��n�vrr*6�s]\"^WY�y�}<�Gb��MXǦؔz6�k�8��!��Z2�Z��\r�w\rm��g�c�&�R�k�U�@��S�c�l���5_���Ty/�u\ZHd��-ϣ<[�L�iШj�09�a�N\n�A���j�A_啨0O�߿_l����Ϟ��i;�B�T�?���OD}<���;�����gԱ��zBr���܊\0\0\0\0\0\0^@e{�]����@_[��+�x�Jsj�\"���\0\0\0\0\0\0\0js�����.z��S!�T�����0�T\'����T[H���y`�A\r�t}9a�C�1W`�\Z��g+��X|ɷ���	9Kn&Y!4\0\0\0\0\0\0���\\��ҳ��P\0\0\0\0\0\0\0j��݃\r/���ت����\0j\"�\rX��<���A����ߡҠ��\'�?ҭ\n�%&���VuP� m�rȖ灭5����V\Zj~^��\0\0\0\0\0\0�bC�\r\0\0\0\0\0\0`(�\0\0\0\0\0\0�\06\0\0\0\0\0\0�����4iR�nݺv���i�)�&M\n�b������[ꢓr�|=��{;��ǧ��&Bg����j��������h���=������4��L���\0\0 \0IDATDQޥٽK2�xg����6\0�Ds����o��?5=������;�}�ճI{&��م��	��с%S^�8��뮤JY�.��o���w䧿����O7�]Y7{̀����æ.=�X�T�{��B����������M�P��x������z�㞁����z�+x�\0�tE�cɒ%ӧO��J�Նe�-[�,Y�d�ʕ�j�G�m�OEj�6�O�{p���gl�8�ې>�f~?ʻ4��ŮK7~ ~�u��w}1iy���q3\'4t�䐣���31��5_����/c�D���۬��q�>i)g�x\n/%S�ր��\\��Mx}�G�_yw���~�ur������^�\'_p�|��N����I\0?l��K�|e���W�L�����f��C��^�V\Zyhŏ�?��y�_lH8�����\\6�3����o���_SJL�[H���M�c6C��L�c.Nk,k�&_�*p=>t\"��qu�E߫�=\0�\"@�\r�q�޽�ӧ;;;��aĈ\'N�b�u{vv�q�t��\r|EDD�~t�JN�Q��$�>�ߊm�̐ph��7<\'�^6���Q��m�ߞ�ǿ�]>n�ؓ�(/ז��y5l��%R5���D�K��	�N�\r{�+�ύ��WY?EdyW�����ۿ����K���4��!��D~~�p���c����\Z����N]6���\Z��M�6n��q�>)A�B�_�}r��b\"��/�Y�7lB�&��-�*��O;����=cy�&c�=�ǐXr<i&�Xg��5$��{�aЬ^��;|����|#��=\0��%�`Ǖx����8k^�*����.�����k�4�O^�����UP��\\\"6��Ư�\r\n�5lڏG�4i�����ٗ�i{���7�_��O��4�	��S;�H{Nz����F�l����l.eqEo����D<�6�����-��8\'d�UA�������76|��+=�9{��,���׏4;����{��O_�-p����-[�l���ݓ�Y��F�\Z{䗈�ZM}D�7嚼�Y����k� ����I�hs5i�nǋ�Zy\Z�\'߱I����,�D�F��C?m��{��}�߂%/k2҆�1\"0p��T���y�-N��/̶C�v�:�$;�����Y\0��\nl��)�KՒy�@R�w��S��DD�ؠ󩞽;�z�]��YsvS��]����..�l��<��k>k*��9�����w��M_��4����417b����OM8�4��7�ƨ��6\0��g�z`�����w�r9!��	;����.��ҹ��[~��u��S\'tݒ]���rڈ�_����ꄡ����/�wvqqqv�󋴣p�s�Qi��!+:Q�f%嘺���������?�mH�|��������f��d�6��+]�����7�.�!���yoN��X�Rb6O�Ӿc���Dd*��8�g�b���?T�\r������!����E+l�{\0�e�j.�o�v��\'���D���g�{vv�Pʻ�϶��_|>�S#�F�F͙7�ptsp�@�R�Q��˝j��:����`)q�K%N��c)B�D5����[\rl�z�d���˹�S?��K�Y\r�;x�쉽��x�����O����_���.^���!�\\,����غW��=Kל�Wi�B���>���[2ؖ.�̲?ܮ����N�֓@�/�_�\'�Fg��C���kG|���dy]��n}>����-�&�aM��<�>Ms��cy���{�Q���_��m�{\0�e&�۰��c��7iGUGP!d�����:��JO���n=�<](�RBd�F4�@����S��%�Ooj�����2�63Sˑ�H��iS#�)���JPBUOH�Jĳk5(��5\'�ǌw��/X���b��=�s�1oF^;���w<��Q��:��ѳ����z�x��9K���H�3h«ko)���\"p���+�/ڙ�d��_��qB���ZCA���z�M�\"Ʀ�Z�&{蒁n�r=����bL�ó ��Y��t���7��/%\"�o�V��A��Mm�B�?��=\0�2��J��z����J2����ǣ��w�(~g��j�����EF�ښ�C���y%�+��ԝ�z!<�gk����{k>�8읍�Z�9Ng@EB�\0T\"�m���2V��p�MY�%���8�-}��YKn�ƫ��v|}��?��T�_�(Soy�����G��*���0���Bw���˾�n�2;}�b�\r��gDv�ܤ,=���Ȑ��MJ������gn$���{E��������,z�@�1e*�q>ϲD��#G�I��+=�L<�\'$�E��#��=\0�2�%�P���k!9t���H��݋JB�\0?yzd��W�:u�ԩ�f����qS�\"e�_P;p�_���{\"�ܖƦ^�v&�n�VN(��1�\r@%bl[j�y|���]��}Rx��O��5��w_�ݱ��B�S�1��,�sh�����w�J7��QЍ�:�똾b�˼���-�_V9�he+���M~5��?\r��o�(|}L>�O���U�cV{�C�y�~[ϢS�b(�T<���<�j8�$�8c�����Ȼ��V��K�M�Y\0��\Z\nl�KF��(�F�~͙�+�����Մ����ֺ�t��\'n?�yxŷko���x�����5��5����K �2s�Ī������7.���i��ھ��`<\0�ZC�\0T\"Ʀ��&7ܐw�\n㉕R.���w#�o]���;zMjl��<�\"����m�/�}�A؍}˿ݥ�<��3�H�/�Z}#����)�7���6=6�(�8��K���3v.�����{���aM�k���o-fĎu\nx�)B7���bK~0CјM�c2��Y�	���R���ի���=F�qR_��U��6�g\0^j�{��a�57�˲VE�خ�q�f�s��{�t���w�߲K~��ÍjR�����O��0D$�ۣ�r��)c�/ܻ����?�8��?�ľo.]���ʍ��?�e i�&ݧ-�4����VoH����4�J|�a�^u�v8�sϏ߿�`�)������S��p��l�r4�����[�t�g�rI��c��O:�1D��D\\<��壧fWG]�Х�̛p�ɴ�o�[7�[���¤�-���]\Z�}���7�A��e:�s珈�o\"S���X�P��}�3<���[�h�<�cǿ����S8�Ğ\0x�1n��UuP��n,u����F�nbҤI#F�(�i�,�nٲ%&&f�ʕ�Xy\\b���k�c���,�ly�|��w������MS/�j��PA����J-�p�cƌK�,�8q\"�q��T�4h�`ƌU\0\0��I��<���7��\0\0^(��:����wv\Z\0\0����;M_�[&�\0\0P9P`\0\0���e��\0\0`-E\0\0\0\0\0\0�\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+@�\r\0\0\0\0\0\0`����ͫ�L�αA����![��� Hח�;T\Z��\0\0\0\0\0\0��\0\0\0\0\0\0\0V�\0\0\0\0\0\0�\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+@�\r�;��O�?�����g�2��O��b���q�\\vGStR��E�}�7A�y����g\\W�����AD�)��(b�%6�\n�D��n��XbWb��Ɔ-�ޢ����^��.�;�7DD� ea���(�G�^_���Μ�o��0��ko��ږ>��^�����maڔ%�\ZӺ��c/�S?�0eP�6>-|}�t8u�?�֡�oa��}7=ФZg��Y|Z�~�3\\\'�x�d����ڧ����\n�@��=7~]�ΡF�J~*�>��޹C;���i��7֝}�Mgi!��xd�_�/|}Z|���eG���k��]7����>-Zw6�{j}��M�	�6�m�%��o�dpYC5�d�������	%G�k�������G��\Z>�ӓ����������BĜ�`�[���9�r������:T�L�[�N���?c�,Y[�S#��cG�K{�&N��~�\\l�U�U�/?k^�`�t�?�9=������4M��L�!�\'\\t�P�����\'_9�Ǻ	o\r�;�^��Y��?ֲM���a��_J-�l6�kW�P�V{e�ؕ�N����T��r�~��:9Ѐa�������^q5�3i���?s�~�R��}=�n�\\8o�/yO�q2��Q_�m������ͬdv���Q9��^�T�o�/�|?���ŉ3f�7-��w	S�M�y�gΪ+j����`\r)�3TOzu�X6��\'�w�lM��u(��N��)_㴆\\/\'�$\rv!�W�5mz�4�%V�L�a|(l�<t�P{{{C3�o߾w���X�n\r�m�GC��p3B{���(�/��7�b�{����І퟽�K�9S�,�p�-]����w��o�^�\"B�}�a{ت�K�1:xo������l���g��8�q.�UP!b��)�]J���N�{1�5r���C�ׄn�g�U�)/��==��θ~>�-�p�3�ѹ�7�иSa�W���u�ҽ�~Y�N)��w���;+q|Gp�3z��0���n�|�a׍.%�Tin7�����o�jV!���l�w��y��i�S♁:��,�j\r����6T�̌��}��-�2Nk�dO2�.��\Zߕ0�-A��%�C�ק9v�D�T��2�i1-R��ͣ��a��ب�9�¥^U{U�+�u/.�9�O{_�����Z/��-��v��ا;�����{�����Ӛ?S4aG�]1��÷H�\n�ҝ�oW�\\�B�m�&��?��*��+{�T�\Zy�s}o�i6�Á{k��=?�����[����m�{����:!��ކ>�Ɲ�~�ׁ�\Z�O�˱U��._�r��1�m�ó����±d�ď��c�\"&a��D:��c_D[�W�H�RZ�Y*���\".��C�r.	+2��*ku�v���v������:}]%oڿ�^�`\r\"���>-��0\\��:����4�\'v��S�^�Z������JZNk�d{O2]�JlȡP���jF�yfE���	=z:\\#���#\nzWwL���n\Z7a�h8d���he{j���bL̜ܺ�})�<uG-X��᫟��,o����:�Ņ�{�(Z�h�U��M[�*��Q������#	��飮��׸jw��l��f�.8�@:�o���S�~�V���yg�ԩP�os��$�t��7NYy�շ�oQ�T�42˛�������(y����B�����n�62�Z�\"<��}�\n��c���K��>9����HY\'}��\Z��I��\ZY9X���/5�+����T���|���\r� ��ҵJ�\Z�M��z�\r֙�e_�	;��U�ڮV.�U�}|x��	��\Z>�ݓ�H�����we�{��\"tBhw�W=�\rw1�6?�=th�j%�=����T{��.D���m͕F�vN�^��h�Ns�t����[�x�D�	g�z!�>.2Jkbei���Q��|���Buy�9��\r����׽�٤�\rdJ��_�ֻ5�5��w�\"��+4h�n\Z�������yʐ.�+g���|��>�9om`X��i�n��f�a[�/���˅�����B�*�����Hh��\r�ІZ�!�������X�*��}ǎ�V��`=:�ufe��4�gQ����0-\\��U��=�c�_洆�A��$3օ@.�=����=\ZV�{�³fuc�	s�[3�YQ�$�����{SLt��DS�*����J^�58}1vD��Sc��?,B(�-͕q/^��Eʯ �q�o=�tu�I��Ҧ|S�yk�������f�\'��(�ex 3��l�Ɓ2%��o��z�vw�=���+�oݸr�ڲq�r��v11��7�\n����Os�YU�&]|�v��$�Q�:��)��?��6ů���zc3���%]����i���`�W�����^�����J�7��3��\ZRR�G��:���\"�������]�La�V�������.U�� 5�5|��\'��.���;�\"`#73�hP�t�ߗ��zq8$��\n�~g�B�tl5ft�����8\Z��?&�مP��q+�4r���H\'�0-P�I���͘�,�gW_];��f��3&NP�)׸��Շ�6/��E͉EMŽ�}d�[�M\Z8�@&���5w���q��}�7�ڲK�5�$-fd���.�3)�h�\"ﾏǘ��7�����:�5�^^^7nt��j�Μ��a�0����V��ե�ڗ�^\n+{KC�%��c�ï�i�,iҐ6�}���г�Ӭ!%C�g�ά,+D�݃\n��	|�\'��y%�l�W3rZ�� [{�o�B��e��d\'.G�fQ�a9�+�<x׮V��ϊ*;Ow�gw��,T�P�B����Y������:zTε��GY�3�Mk��ӛ��t�S�.����S��׋C�vm�dY�~a����o6�\r���Ư	;��M��uk�]�L�ؗ)���=�C}c��Qˮ�[�;�[��?S�J!�4��Sޤk;��-R&[�RN�7����y�>�|[��Ǵd�9.J�7sP+[�s~�P4CC�jH�P=�3+˪o�=n^u��Y��$��6��e̩]_&_��i\r���If��܆�\r92�p�OO`�ٰ����5�65�y5�y��>��MYs�����_{�ܫ��B�(b޾���Z�������ߙ�`�]�o��7gӡ��ϟڿ~�)\'��Ӵ@�A��M���8oY��+��#�f�n8��[j�J+s}������}���UӖ^Ѩ#B�f���י8xX��<sᎠ�7��^�C]�]��J!4,����_����{��Q�/k�y\Z��Aȃ!�	�2���[���9+\\�y-��_��t������_��L�%v�*T��Je��ѥ@^ӌ|7`���5��`�YY6Y�}G\"�\Zu�W��+%�|Y�.���)6�5|��\'��.r�P(:]z�\"�N\'�)�	۵�jX�$��Fi%S�?���]�눍jaU����U�V!L]�T��2w�eF����4����n_N��~����f��j}3��o)�ԻAa]�iy�ӷ��-�Ũ��zK�yGh }\Z�2��=�L[�ː�3�-Ѱ��~f��/\r�Zs�m&6Q�߸��\Z;(ZX����UmB]ԝS�\'lk�I5������ϮL� y�s��:6vh�7&|��#���y�72�K��\rנO��F!���zM�ea�$1W�}^�U�)��mڤ�?v���s�4Nk�doO2�]�.\n��M���w�v�u�K�/����&����Ҿ}�4�\Z�N�������2��/#�XYg�6|�h6�8ZKV��}�u�\nG�Q��~&>19���=�C�;wn���JgF�!ǰa����{����_�N����9lذ�*\0�)҆Zs­�h��.\0�� `C�37:\r\0����[}����*.�\0|l\0\0�R[��}.\0\0d�)�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0����!���Ev���/#slmȱh6�8ZKV�����\\?Mw|H�`\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�q�q��5���`�^�P(R��0���sذa��������s~Q�,iRԩ��F>�nA�˃�-��huO7c)��?�? �꣮�Z�p����h��.\\�i�=�2UZ�B}�?�\\p,�P�UK:����6��ڬ�}Z���F�on}���^����%kw���$N��������j:\'�\Z{~J��{\"S�Q�٪��-\rl�A����k�����wKD�>k��wIq����a��H�A�Z9d�[~ݣ��z�az\r˄	��[��O_��J��¥Z��Gt���(�5ć��d��-�ś8Vh�gx�z�&B��8�fڜ��!1*;���F�o����v�hB6\r��9{M����`\r)�\'�:��l�^}�wp���\n�Z��S�ģ���,��dOO����.��Y��kB/P�=���5�O��X-L��lٽ�W5��Z��Uȝ��C��C�*�i�Z��t����/������6�����竮L��}gcܺ�pP�F�m���&�_�с~m�9�X?��4���B�}̀����<���ѳk[<����k\Z>��^\rX����/��8��Zdf���ͦ^�j�ݟk�1�\\��>epEK�J�����`�@�o���gA�k��#{y��=>�jt�s�Om������f�_��I�����B�02�mY�+�[��>l�!9I�p$\0\0 \0IDAT�E_�q<2�2@�~�����Q^ɓ������������m�=c�X�5�[;�娃����@�����޽p��˿)n�}�s��u�>#�+���_��4s]կ����&�<�1mɥ�<���`\r)�3TOzu�X6�.���˪|&wv�׮{�TA�}Y��������6���\n�tѳ����﷕�z_�q�������LW!w\"`C����C������}���{���Ţ\rj��t�н>��rL��^�����P��_q��J�����A�Mf�е��B��P���WS7��_���������,Z���������K�6\'��*�BBec��.\\�t�<\n!��>�h�@[�l�eᅢ�.���-�j�����{��5�~Q@%�\n���J;�Ksim��(*|��Ѓ�I��Q�w�ֹyX���*56\r�67X#Dʻ��\'��yOܪ��ߏ}x�ן{��t/b`�)6x�����t��_)<�F?9�}���݋�=>�����k\\�T7��\':��v�g�2�4��TU��Y��[V�9��\r���b[�v=^�4��l�\Z��_>ߑ\r��eϾ;�)�T�{8����=I�}�{ڂ�B����؋(W�j	�n���^{P��ivK��q\r����i�]\'Q*�z�^�M�\Z��v�xh��3�;�nX�Q%����o�q��x!�����c��z{{7l��޻j�P_����/06bk���M�l����cQi�o�-�Z�\"���|5��8����Bh��Z�c�����>]���׈���:�;�|��f�>�SoF:�Ɛttܭ��f�ӿ�[�W�\nS���7��i��4��>)�|U|���=�����ҎӪ��J�\'vuς֎�Ѳ����w�N~kν�!4w�t��;ru��oZ��;���rl��������\Z�MϚg�#�Si�Ĉh�T��$4�V���>�y��GU���)#�����(�^�\\5�T(�#mdW�B���o���n��ݳ6�w�S�6�߂i/k�wmQ{o��v=1\\��:����4aG�_��ѰZ�Z��{K���[�,�d{OR�����\r�MՋ�.�����ʛ�dv��a�!�k�]gz�w`�ި�M�߁a\Z!��9r�I�F�9�\nJ�9j�h�ü%�&��wr����M��\\�|xY�V�_�`���7���Jk~g8�Sݶ����u��Ӣ���+,\\�֩\\�\\!��V���g�)�\ZP5��QC�kw�u�Ṷj�Y�a��5)�k!s� =i6�>�\"����LK�*�ڸ��[����x�/G|ꔶ�}J<��w��M���v�1����<�U���3F�	�8`��K��p����݄��>����Knm��s�ԗ\\\Z���;88��LqU��*����݈�n��Ž0��ţ�Zu)�֙�~~���mm�?{n��*0��=������j�F֎�\"�Q���v�B�h����N�����;�e\r� ��ʭz���L��z�\r֙�e_�	�{�\r��E�ש�/���)v�G���\'��t_�V�=�Ge_���zE��*#`#�2/֨�՝����<8~8�@�ZR��/���q���R�>�j�8_���}��vp�3W\ZY�wrv�w|��S>�4�7���}\'�6w�o�g���ݮY��W�|/Dԅu��y�:�u����7�7qHٰ-k�b,�;ڙ+�,�;;9�wH�n��E�\\oo6�3x��1�b�����j�u>s�4&aDHc�W\r��<�m��t(m+�x>���x!�//l2���ǫ��tj}�}�z7*�Vģr�&�/�\"3q|xt�is~��U5���fdW��{��ˏ�ƨ#.�9k�M!t�7e�vxΰ�\\;���O������ѫs����Hh��,�>�?kM\\��\r�}��;� �ʹ��I?��`m���:��lj��vݱ�Ԡ��0-�]��ɡ��$���r���I��^�ԚX[���p6r1�M�Z����Ӗ\rb�9�\\�v�b���W�=�7�����XS�:��i�_��@*���z�n�K�Տ��ܵn��F�_�\"�fl����[J���m�����wI��lҒ��^���\\��ɛ�d�Ȉaak��\rf�������3�e��>|Ĕy+�z�\\~�^��/l�׬��b��C	��ֹ��3�-�x�ƵK箫����~�ҥA��o<Q� ���c�_��cǍB��|{�vYq��4�Q�:���	S�V���_y�\n�76S	M��UgX����������s�G~���\">�զ[CJ\n�(3PgV�B���k�}�����!̋5�d�����~e+���*�#��ړT[Y(�?���@}ܓ�7\"��s4#y�Rl�f%�V2�ׅ����߳�W���;�\n�S�I[�x���M:!C�G�9���߳��\Z��I%��4��]~t|���#G�7y#Aq��A��lRI�@�t�_�Q��ح�*�R�D�8\Z_����Bh�\ns7��NY�r1�M�Rϖ�ݪ�s���Mŝė4���=?�J�֟5����V���JZ����͋C�cR���5���ǘ�7�4���C�t�>����~{�ـ�3Z{&>�Wa�7�qԣ\Z!L�B�0RX;X�,��9����&M���H��kf�Y�i֐��z�3PgV�\"���}�B�C����m���B�Wg�t�,�kdgOR�,[@�ǉ��\r*��8���t���E��9�V\\\"�\\�ҳiե�ǎ�^��ϊ���<,�ގ�-�������=�l�ZCiW�.���??�珃!)ΰ���xafme��f��DPx�Ȧ.���{�E���B+gH�ټ&�mfV�Y+��;n����>�������E㷬�D(l*��~��[7]��Ӹhr�Ԅ����~5��^_4�Y��*�e\\�Ŕ��Ť����C^��vpv�c��u$(ڵ���+���O���j��1��L���:�_?}/�nc�A�����S=楿_��E#�[�k4n�̮�\Zz7TCJ���H�YYV}c��G5������#j[E��z>2�RW�G�E��\')T�}=�.�z3��\'\'7�,Z�R~�u�E��yB�ܧ�\'��jZ^���e����~�jB����Θ�������Y8i�y����\Z�(cBo޼�8V��������dU�[�b���:�σ��{�̑��Ǝߥ�ܮ~�2���o�蹻�]�~~��1��ulݥ����5�CJ�ټ&��R�bT�W|��=�Ϝ=�wݔ~�V�+�������E�r>e��ZdY/U\nS�Z���N�;q���s���<�F�$$,&3\'D�V�7N�����kA���Y]�s-{��н�~�4(2�Zu���?bT�S��!��$<�̡�祟�oڢ��_7}�u��-�Z�0�sq}�����8�sႶz���\ZR�l��ufe�d�Ww��$�.\r��t���������)��#�&�ؓ*�V#�.~sI����tr����\'����.t\"r1�P(:]zϓ��t��\"��]��M˙;aݬ~ZAɴX��t���>VX�7�3mp�<\n!�Y��լ\'��۵��m3<�����iw�Lݻ�Zd�bi�ډ[^��ֽ��%��:	��m�4լy�m�.��M������k�\Zf}�}��[��k�;��ԽÌ[�����>�c��5;N�ر�s�o>v�<�|+���Q��k��Ҿ��>�?��w�Q>��=�1�y悵�u��ebՆ��͌K�%�����6�F^�B�����G���j�ػ�7�^\Z�so��V��^�رٸ���Ι��f�Ҷds��=�8y�a�}B͵\n!��ch�.�&����гBm[K�M�[��lZ����I�Y 7�Ξ���:�X�j��\r�w��\ns�2������e���07S8�o��5�{���\\�|���W�7��ߺ���o�>Ϳ�����߿�x��L��AXXG�L׆O�GkɊ�����F,r\Z?��3�������	��541�\r9�\r���߻wo�^��Hu�OO�aÆeWy\0�O����eG�}�Uv\0�D�!���G�F�\0x_���\r���B��\0���\r\0\0>R\ncK���\0�,<E\0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6r��2�f����d{�����qǇD�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$Pew�A.]���%\0\0\0\0@nE�F�b���]B\Z�<{f�7ovW�\\�f����d{�����q�\\�o�H.\0\0\0\0@F��L��gw	i˱�!\'�� �h-Y��C.Bs�4q��!1�\r\0\0\0\0��`#Y��z/����f����d{�����qǇ�6\0\0\0\0\00��d9��[r2�\r2�֒�=�\"4�O�#�\0\0\0\0\0H�6��د�rla��h6�8ZKV�����\\?Mw|H�`\0\0\0\0 \0\0\0\0\0	�D�r��39�0�d4d�%+�{�Eh��&�;>$F�\0\0\0\0��l$˱_�����l�q���`�!��~�8����\0\0\0\0@F��,�~��cCNF�A��Z����\\���i��Cb\0\0\0\0\0	�F���^�-9�Gk�\n�r�막��l\0\0\0\0\0$`�dw	i{�� 7�� �h-Y��C.Bs�4q��!�����Wv�\0\0\0\0\0���\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0�H�秴�~M���_>�߿q��7����\Z��nڎ[1�,�U���M�����Z?�z-���~�k�6����w�����ko�%OS_��yþ{\"����{~J���6=Ծ}�A��\0\0\0\0�A�m���˟40hd�ja\ZZ�Uc�F����8c�`/�w؜^��ʞ���,�����ȢiS�z�j�N�~�����Q^o�����ˮ�:�;[�n������NFY*��J�}���\0\0\0�X\n���J�笿�W�l�\\YǇA�C�x�|p2/�ު}������k�H�be]��-�J|Y%�\"��җ�3��%�ךP�V!��\r��\0\0\0�v�����{��I]k����w����ߴl�w\"J�,h͏]}������0���8���m|�c#��k�=�X��N�4�2Uh�q�mH��s��v����nض�̽w�z��<1Ƨ��O/�������).�<9����-����}��-?�BhBz4�fˣ�w�Ϩ�_̸��ͷ�ւU��~Y�vR�Ư��yxh��r�W�Q�;[��\n����Ȝ��޸*<�}\"��{��{w[qM-�п��y���N��Ay��gAk��hY���ۻy\'�5�^�\'g�\rD_ڰrוg���66\0\0\0�l�}����~]:��n�h�â�����/�Y�u��ݵg�[RyМ����5��:y�s���/kb�`ª\rc*[�Ӛ�\\ٹj[��g9G��2�����Q[D��-�7�M��ӆ/�-�J�T2���b�^!Է�ՖkV�*i��k���X}ϳ��g\r�\Z���!˃c\r���y�֯��m���Y�~	�&�]/��.m��loe^������3���N5=�}�7�o0dP�����u�����2�G���=(I�/N��&����W.�����J��w5i�4�m�8����O�:�uۅ\'���q\0\0\0\0�B����u+��W�i�Qk\'�ʗF:�ߘ�UùI�-;~�:)_��n�|i77���q��ޣ�W1gU1ױ�57VY�:ٙ+�,�;9������mNU���~���SnHD����q�	��*k.���7�����Y�F�敌~�w%�v5����OŕP�J�z<Wԅu��y�mxkg#!J����y�ڠ�\n�]I��7�N�%wk׾�:c��ez\r�(�T��ծSg�h2��WS�/���>�i��`��=��~��a�.�:��\Z�w:(iЩ��Z��ֽQ13!��6�X>;,R��N3������^�㵃����m��wǯ���w0�ҥ�l\0\0\0\0Z|�_��-����m���y\r��\'����!gJ˂�B�H�ҥA��&B���ڣ]Q�i[�-Y�BŪu�6.c���I�S(�-\\�m�BhRmH����gO�\rl�3�r�=��,Rʧ��}W���}t�DT�o�X)���w�$�fl���KRڕ�](nӥ�������J�խ�M\ZO.j������;������;�1aR��}bml��`Hߝ���[��M�Sƌ�?������\\�z�ڥs��Vͅ>3;�(�G�o&��x���Usz�5�������M�l\0\0\0\0Z��3G.jJ�oҨf��{�\0\0�IDATtҵ\ns7��r�j����*�E�u�olms=���3\'.�[���ʽSTJcsonH(J�6�&�pN����Y%V�|*��u=�����.c����~Q�ӧ�v,3��.n���g�����*�3�����[~vī��\r�!�>����\Z�xt���n�K��m\0i�<�2����*�Z֤f��[-�;+��L��UѪ\r�ܽ�ߚ�����|��l\0\0\0\0�E���׉���U��{�{��s�P&f!���f�q�ңZ�}�-X������o���`�!U~/˧��l������:kO,[��V!����3�Ex5/c�\"��y��=8��Nu��3.�eoldl��j�	�Z���#�^��ѿ�|޹emǬ�i�TL��mi�{����z!���}����G���;�q��)��3|�y�iB��߿y���c�/\Z�,�f�2a�dj��nZ5�G������6`B�|YH�l\0\0\0\0��8�V��lX;�N��q�:_��r��ldn\Z�o�/󷟽v�֕�{�>P�7��Dz���Ǳ���9����Θ�������Y8i�y��.	w7[y5�����B<����BX��Ԧ��G��u����{����c�.�U6�<,�����F^ݶ`�-}�o������[�\Z���?�e���/\\��	ax��#�.��?O�a����}͈\rS�_S�w;(����.&�|녑��>��Wn^?�o���.j�OB�b���t���/��[��>)7pY����8�fm|�K�\0\0\0d�m�����t�o��+g�7qz+�L��*lj��c�%C�G\naU�z۟�6vP\n]��լ\'��۵��m�>��Q�i���\'���O�~}��vo�g���y��U����ǽ����ZT3��6c�jּ���D	�j�&O��i&�(�kx�q��\\����ݱ[�+���vޙ.�ؖ{^�*����Պ�5���p�?Ha`���s˧�T�����T(L����lי��.��N%��&�������A}^1���|^M{�b���k��~�6�~t���NmF��P�NV0V8�o*iUȹ���\0\0\0����Bi$;i{�l\0\0\0\09�B)�&a�-�G{�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H@�\0\0\0\0@6\0\0\0\0\0�\0\0\0\0���\r\0\0\0\0�l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	�\0\0\0\0\0H���8�fQ�\'\0\0\0\0IEND�B`�',NULL,NULL,'Viettel Net','',3);
/*!40000 ALTER TABLE `enterprise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gateway`
--

DROP TABLE IF EXISTS `gateway`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gateway` (
  `GatewayID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`GatewayID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gateway`
--

LOCK TABLES `gateway` WRITE;
/*!40000 ALTER TABLE `gateway` DISABLE KEYS */;
/*!40000 ALTER TABLE `gateway` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inout`
--

DROP TABLE IF EXISTS `inout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  CONSTRAINT `FK_6c25e504de8541adac371aced22` FOREIGN KEY (`EmployeeID`) REFERENCES `employee` (`EmployeeID`),
  CONSTRAINT `FK_cf8d7d29d4dd438f949d5ec1690` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`),
  CONSTRAINT `FK_d2f79c3c9c9b4324b1f793363d2` FOREIGN KEY (`WarehouseID`) REFERENCES `warehouse` (`WarehouseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inout`
--

LOCK TABLES `inout` WRITE;
/*!40000 ALTER TABLE `inout` DISABLE KEYS */;
/*!40000 ALTER TABLE `inout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inoutline`
--

DROP TABLE IF EXISTS `inoutline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  CONSTRAINT `FK_272797c566084a28a0bdc79bca8` FOREIGN KEY (`InOutID`) REFERENCES `inout` (`InOutID`),
  CONSTRAINT `FK_ab00bd3bb9d841428bf59ee0efb` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inoutline`
--

LOCK TABLES `inoutline` WRITE;
/*!40000 ALTER TABLE `inoutline` DISABLE KEYS */;
/*!40000 ALTER TABLE `inoutline` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mail_template`
--

DROP TABLE IF EXISTS `mail_template`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mail_template` (
  `MailTemplateID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(50) NOT NULL,
  `Content` longtext NOT NULL,
  `Description` longtext,
  `Name` varchar(100) DEFAULT NULL,
  `Subject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MailTemplateID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mail_template`
--

LOCK TABLES `mail_template` WRITE;
/*!40000 ALTER TABLE `mail_template` DISABLE KEYS */;
/*!40000 ALTER TABLE `mail_template` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measure_unit`
--

DROP TABLE IF EXISTS `measure_unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measure_unit` (
  `value` text NOT NULL,
  `name` text,
  `measureunit_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` longtext,
  PRIMARY KEY (`measureunit_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measure_unit`
--

LOCK TABLES `measure_unit` WRITE;
/*!40000 ALTER TABLE `measure_unit` DISABLE KEYS */;
/*!40000 ALTER TABLE `measure_unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `popup`
--

DROP TABLE IF EXISTS `popup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `popup` (
  `PopupID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `PopupClass` varchar(2000) NOT NULL,
  `Active` tinyint(1) NOT NULL DEFAULT '1',
  `Fragment` varchar(100) NOT NULL,
  PRIMARY KEY (`PopupID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `popup`
--

LOCK TABLES `popup` WRITE;
/*!40000 ALTER TABLE `popup` DISABLE KEYS */;
INSERT INTO `popup` VALUES (1,'new.user','com.viettel.webui.view.popup.NewUserPFS',1,'new'),(2,'detail.user','com.viettel.webui.view.popup.DetailUserPFS',1,'detail'),(3,'new.view','com.viettel.webui.view.PopupView',1,'detail'),(5,'new.enterprise','com.viettel.webui.view.PopupEnterprise',1,'detail'),(6,'new.viewgroup','com.viettel.webui.view.PopupGroupView',1,'detail'),(7,'detail.enterprise','com.viettel.webui.view.PopupEnterprise',1,'detail'),(8,'detail.department','com.viettel.webui.view.PopupDepartment',1,'detail'),(9,'detail.employee','com.viettel.webui.view.PopupEmployee',1,'detail'),(10,'new.inout','com.viettel.webui.view.PopupInOut',1,'detail'),(17,'new.customer','com.viettel.webui.view.PopupCustomer',1,'detail'),(18,'new.product','com.viettel.webui.view.PopupProduct',1,'detail'),(19,'new.warehouse','com.viettel.webui.view.PopupWarehouse',1,'detail'),(20,'app.detail','com.viettel.webui.view.popup.ApplicationDetailPopup',1,'detail'),(21,'detail.popup','com.viettel.webui.view.PopupChooser',1,'detail'),(22,'user.report','com.viettel.webui.report.view.UserReportView',1,'report'),(36,'new.product','com.viettel.webui.view.PopupProduct',1,'detail'),(37,'app.new','com.viettel.webui.view.popup.ApplicationDetailPopup',1,'new');
/*!40000 ALTER TABLE `popup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position` (
  `PositionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Code` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `NumberLimit` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`PositionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `report`
--

DROP TABLE IF EXISTS `report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `report` (
  `report_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `jasperfile` longtext NOT NULL,
  `name` longtext NOT NULL,
  `process` longtext NOT NULL,
  PRIMARY KEY (`report_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `report`
--

LOCK TABLES `report` WRITE;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
INSERT INTO `report` VALUES (20,'user.jasper','TestReport','com.viettel.webui.report.process.UserReportProc'),(21,'chart.jasper','Test Chart','com.viettel.webui.report.process.UserReportChartProc');
/*!40000 ALTER TABLE `report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportparameter`
--

DROP TABLE IF EXISTS `reportparameter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportparameter`
--

LOCK TABLES `reportparameter` WRITE;
/*!40000 ALTER TABLE `reportparameter` DISABLE KEYS */;
INSERT INTO `reportparameter` VALUES (6,0,1,'Ho Ten','NAME','1','com.vaadin.ui.TextField',20,0,0),(7,0,1,'Sinh nam','DATE','3','com.vaadin.ui.ComboBox',20,1,0),(8,0,1,'Tai khoan','USER','2','com.vaadin.ui.TextField',20,1,0);
/*!40000 ALTER TABLE `reportparameter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `RoleID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(200) NOT NULL,
  `Code` varchar(60) NOT NULL,
  `Description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Administrator','ROLE_ADMIN','Administrator'),(2,'User','ROLE_USER','Vai trò người dùng'),(4,'Người dùng thử nghiệm','ROLE_TEST','Người dùng thử nghiệm ngày hôm nay');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_view`
--

DROP TABLE IF EXISTS `role_view`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_view` (
  `RoleID` bigint(20) NOT NULL,
  `ViewID` bigint(20) NOT NULL,
  PRIMARY KEY (`RoleID`,`ViewID`),
  KEY `FK_c65cd2bcc8dd47a7ae482bbbf64` (`ViewID`),
  KEY `FK_6c26717b0ae1433c8414fce7d6e` (`RoleID`),
  CONSTRAINT `FK_6c26717b0ae1433c8414fce7d6e` FOREIGN KEY (`RoleID`) REFERENCES `role` (`RoleID`),
  CONSTRAINT `FK_c65cd2bcc8dd47a7ae482bbbf64` FOREIGN KEY (`ViewID`) REFERENCES `view` (`ViewID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_view`
--

LOCK TABLES `role_view` WRITE;
/*!40000 ALTER TABLE `role_view` DISABLE KEYS */;
INSERT INTO `role_view` VALUES (1,3),(2,3),(1,4),(2,4),(1,5),(2,5),(1,6),(2,6),(1,7),(2,7),(1,8),(2,8),(1,9),(2,9),(1,10),(1,11),(1,26),(1,27),(1,28),(1,29),(1,30),(1,33),(1,34),(1,35),(1,36),(1,37),(1,39),(1,40),(1,41),(1,42),(1,43);
/*!40000 ALTER TABLE `role_view` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task` (
  `TaskID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `ProcessPath` varchar(200) DEFAULT NULL,
  `Status` varchar(100) NOT NULL,
  `Type` int(11) NOT NULL,
  `GatewayID` bigint(20) DEFAULT NULL,
  `ParentID` bigint(20) DEFAULT NULL,
  `ChildrenID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`TaskID`),
  KEY `FK_060a1b758d8e48f0bd7e1673f72` (`GatewayID`),
  KEY `FK_cb9e8acd2f094996bbd43faa0d8` (`ParentID`),
  KEY `FK_e42a412e96d14b299d038c48393` (`ChildrenID`),
  KEY `In_Name` (`Name`),
  KEY `FK_d0c76ae7d4e74ab897e6615c710` (`GatewayID`),
  KEY `FK_c5ea1eb9887a42ac9c56a690453` (`ParentID`),
  KEY `FK_2a8d19cc418741fda1f2e1acd3d` (`ChildrenID`),
  KEY `FK_4b83b77ef62f4a298f1dd88ffa0` (`GatewayID`),
  KEY `FK_c5a77ae3d76344c6b9ff8b1d49a` (`ParentID`),
  KEY `FK_628d08422d3a4528989bf6cbb0f` (`ChildrenID`),
  KEY `FK_0bca7065c66e470f84d27a644bb` (`GatewayID`),
  KEY `FK_026f5e1adf084a6c867c65c0104` (`ParentID`),
  KEY `FK_cae5ad7ef0b242e5b43886e79ef` (`ChildrenID`),
  KEY `FK_98caca5811a94dfba1a0c4cde08` (`GatewayID`),
  KEY `FK_c10dd2b8e58d4ff58ca9672c907` (`ParentID`),
  KEY `FK_97fe7c378f39452e9c825c2a1f4` (`ChildrenID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `UserID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(1000) NOT NULL,
  `Username` varchar(256) NOT NULL,
  `Password` varchar(256) NOT NULL,
  `DOB` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Email` varchar(256) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=3062 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (9,'Vũ Việt Hưng','hungvv','e10adc3949ba59abbe56e057f20f883e','2013-12-20 08:39:23','hungvv@viettel.com.vn'),(3014,'Hoàng Phương Nhi','nhihp1','e10adc3949ba59abbe56e057f20f883e','2014-01-20 01:30:25','nhihp@viettel.com.vn'),(3015,'Nguyễn Đức Hải','haind','e10adc3949ba59abbe56e057f20f883e','2014-01-20 01:30:25','haind25@viettel.com.vn'),(3016,'Nguyễn Văn Thanh','thanhnv','e10adc3949ba59abbe56e057f20f883e','1991-09-30 17:00:00','thanhnv60@viettel.com.vn'),(3017,'Hung','hungvv','e10adc3949ba59abbe56e057f20f883e','2014-01-20 01:30:25','1'),(3021,'Nguyen Van Phuc','phucnv','e10adc3949ba59abbe56e057f20f883e','2014-01-05 17:00:00','phucnv18@viettel.com.vn'),(3026,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-30 17:00:00','trungkh'),(3027,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-20 17:00:00','trungkh'),(3028,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-20 17:00:00','trungkh'),(3029,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-30 17:00:00','trungkh'),(3030,'Kim Ha Trung','thanh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 08:54:03','trungkh'),(3031,'Tran Van Tho','thotvdeptrai','e10adc3949ba59abbe56e057f20f883e','2014-01-05 17:00:00','thotv@viettel.com.vn'),(3032,'Đỗ Thị Nhẫn','nhandt4','e10adc3949ba59abbe56e057f20f883e','2014-02-17 02:41:30','nhandt4@viettel.com.vn'),(3033,'khangpn','khangpn','e10adc3949ba59abbe56e057f20f883e','2014-02-15 17:00:00','khangpn'),(3034,'coucou','coucou','e10adc3949ba59abbe56e057f20f883e','2014-03-17 17:00:00','coucou@gmail.com'),(3035,'Hoàng Thị Thơm','thomht','81dc9bdb52d04dc20036dbd8313ed055','2014-03-04 17:00:00','thomht@viettel.com.vn'),(3036,'Kim Ha Trung','trungkh','123456','2014-03-06 08:09:28','trungkh@viettel.vn'),(3037,'Kim Ha Trung','trungkh','123456','2014-03-06 08:15:53','trungkh@viettel.vn'),(3038,'Kim Ha Trung','trungkh','123456','2014-03-06 08:19:09','trungkh@viettel.vn'),(3050,'aloa','alo','123456','2014-03-30 17:00:00','alo@alo.com'),(3053,'boday','alo','123456','2014-03-30 17:00:00','alo@alo.com'),(3054,'huyenlt','huyenlt','123456','2014-04-01 17:00:00','huyenlt14'),(3056,'Đặng Văn A','adv','123456','2014-03-30 17:00:00','adv@abc.com'),(3057,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3058,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3059,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3060,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3061,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (47,4,9,2),(68,3,9,1),(69,2,9,1),(70,5,9,1),(71,1,9,1),(72,1,3030,1),(73,1,3050,1),(74,1,3035,1),(75,1,3014,1),(76,1,3017,1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `v_config`
--

DROP TABLE IF EXISTS `v_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_config` (
  `VConfigID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PropertyName` varchar(100) NOT NULL,
  `Value` varchar(200) NOT NULL,
  PRIMARY KEY (`VConfigID`),
  KEY `In_PropertyName` (`PropertyName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_config`
--

LOCK TABLES `v_config` WRITE;
/*!40000 ALTER TABLE `v_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `v_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `view`
--

DROP TABLE IF EXISTS `view`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `view` (
  `ViewID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Active` tinyint(1) NOT NULL,
  `Code` varchar(60) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Icon` longtext,
  `SeqNo` int(11) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `view`
--

LOCK TABLES `view` WRITE;
/*!40000 ALTER TABLE `view` DISABLE KEYS */;
INSERT INTO `view` VALUES (3,1,'Warehouse',NULL,'img/user.svg',1,1,'Kho hàng',0,'com.viettel.webui.view.WarehouseView',43,3,'warehouse'),(4,1,'Customer',NULL,'img/user.svg',3,1,'Khách hàng',0,'com.viettel.webui.view.CustomerView',41,1,'customer'),(5,1,'Product',NULL,'img/user.svg',3,1,'Sản phẩm',0,'com.viettel.webui.view.ProductView',42,2,'product'),(6,1,'user4',NULL,'img/user.svg',4,1,'Mở rộng',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'more'),(7,1,'Department',NULL,'img/user.svg',4,1,'Phòng ban',0,'com.viettel.webui.view.DepartmentView',41,1,'department'),(8,1,'Enterprise',NULL,'img/user.svg',1,1,'Đơn vị',0,'com.viettel.webui.view.EnterpriseView',41,1,'enterprise'),(9,1,'Employee',NULL,'img/user.svg',1,1,'Nhân viên',0,'com.viettel.webui.view.EmployeeView',41,1,'employee'),(10,1,'dashboard',NULL,'img/user.svg',1,1,'Dashboard',0,'com.viettel.webui.view.UserView',NULL,NULL,'dashboard'),(11,1,'view','',NULL,2,1,'Chức năng',0,'com.viettel.webui.view.ViewDetail',27,NULL,'view'),(26,1,'application','Application menu summry','img/application24.png',5,1,'Ứng dụng',1,'',NULL,NULL,''),(27,1,'security','Security menu summary','img/lock-flat-24.png',3,1,'Bảo mật',1,'',NULL,NULL,''),(28,1,'applicationList','Application list menu',NULL,1,1,'Danh sách',0,'com.viettel.webui.view.ApplicationView',26,NULL,'apps/list'),(29,1,'applicationAccess','Application access',NULL,2,1,'Truy cập',0,'com.viettel.webui.view.ApplicationUserView',26,NULL,'apps/access'),(30,1,'role','Role list',NULL,1,1,'Vai trò',0,'com.viettel.webui.view.RoleView',27,NULL,'role'),(33,1,'InOut',NULL,'img/user.svg',4,1,'Nhập/Xuất kho',0,'com.viettel.webui.view.InOutView',43,3,'inout'),(34,1,'RP',NULL,'img/report.svg',5,1,'Báo cáo',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'report'),(35,1,'UDDRA',NULL,'img/report.svg',1,1,'Ngày sinh',0,'com.viettel.webui.view.UserByMonthDDR',34,4,'userbymonth'),(36,1,'reportdetail',NULL,'',1,0,'Chi tiết báo cáo',0,'com.viettel.webui.view.UserByMonthDDRDetail',NULL,NULL,'reportdetail'),(37,1,'popup',NULL,'',1,1,'Popup',0,'com.viettel.webui.view.PopupChooserView',27,NULL,'popup'),(39,1,'TestView',NULL,'img/user.svg',1,1,'TestView',0,'com.viettel.webui.view.TestView',43,3,'TestView'),(40,1,'popuplist',NULL,'img/user.svg',1,1,'Danh sách Popup',0,'com.viettel.webui.view.MenuView',NULL,NULL,'popuplist'),(41,1,'morong.nhom1',NULL,NULL,1,0,'Nhóm mở rộng 1',1,NULL,6,NULL,NULL),(42,1,'morong.nhom2',NULL,'img/report.svg',1,0,'Nhóm mở rộng 2',1,NULL,6,NULL,NULL),(43,1,'morong.nhom3',NULL,'img/report.svg',1,0,'Nhóm mở rộng 3',1,NULL,6,NULL,NULL);
/*!40000 ALTER TABLE `view` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `view_group`
--

DROP TABLE IF EXISTS `view_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `view_group`
--

LOCK TABLES `view_group` WRITE;
/*!40000 ALTER TABLE `view_group` DISABLE KEYS */;
INSERT INTO `view_group` VALUES (1,'gr1',1,'Cơ cấu - Tổ chức',6),(2,'gr2',3,'Mua bán',6),(3,'gr3',9,'Hàng hóa - Vật tư',6),(4,'gr4',1,'Người dùng',34);
/*!40000 ALTER TABLE `view_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `view_popup`
--

DROP TABLE IF EXISTS `view_popup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `view_popup` (
  `ViewID` bigint(20) NOT NULL,
  `PopupID` bigint(20) NOT NULL,
  PRIMARY KEY (`ViewID`,`PopupID`),
  KEY `FK_viewpopup_popup` (`PopupID`),
  CONSTRAINT `FK_viewpopup_popup` FOREIGN KEY (`PopupID`) REFERENCES `popup` (`PopupID`),
  CONSTRAINT `FK_viewpopup_view` FOREIGN KEY (`ViewID`) REFERENCES `view` (`ViewID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `view_popup`
--

LOCK TABLES `view_popup` WRITE;
/*!40000 ALTER TABLE `view_popup` DISABLE KEYS */;
INSERT INTO `view_popup` VALUES (10,1),(10,2),(36,2),(11,3),(8,7),(7,8),(9,9),(33,10),(4,17),(5,18),(3,19),(28,20),(37,21),(10,22),(28,37);
/*!40000 ALTER TABLE `view_popup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vo_condition`
--

DROP TABLE IF EXISTS `vo_condition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vo_condition` (
  `ConditionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `FieldName` varchar(100) DEFAULT NULL,
  `Level` int(11) DEFAULT NULL,
  `OperatorCompare` int(11) DEFAULT NULL,
  `ConditionType` int(11) DEFAULT NULL,
  `Value` varchar(255) DEFAULT NULL,
  `GatewayID` bigint(20) NOT NULL,
  PRIMARY KEY (`ConditionID`),
  KEY `FK_7b2eb87a56ef4e4cb76d9302873` (`GatewayID`),
  KEY `FK_6411425dfa5544b5bae1a489bef` (`GatewayID`),
  KEY `FK_c11bfd774bf44c89bcd8694eda9` (`GatewayID`),
  KEY `FK_1868c2a7fa3448048d77d5ef844` (`GatewayID`),
  KEY `FK_e368e85cd1674fbd9ba79609715` (`GatewayID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vo_condition`
--

LOCK TABLES `vo_condition` WRITE;
/*!40000 ALTER TABLE `vo_condition` DISABLE KEYS */;
/*!40000 ALTER TABLE `vo_condition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse`
--

DROP TABLE IF EXISTS `warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `warehouse` (
  `WarehouseID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Code` varchar(255) NOT NULL,
  PRIMARY KEY (`WarehouseID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse`
--

LOCK TABLES `warehouse` WRITE;
/*!40000 ALTER TABLE `warehouse` DISABLE KEYS */;
INSERT INTO `warehouse` VALUES (1,'Kho A','KA'),(2,'Kho B','KB');
/*!40000 ALTER TABLE `warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `web_service`
--

DROP TABLE IF EXISTS `web_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `web_service`
--

LOCK TABLES `web_service` WRITE;
/*!40000 ALTER TABLE `web_service` DISABLE KEYS */;
INSERT INTO `web_service` VALUES (1,1,'RoleServiceEndPointService','http://localhost:6080/viettel-one-service/ws/role?wsdl','com.viettel.ws.RoleWS','http://ws.backend.viettel.com/','RoleServiceEndPointPort');
/*!40000 ALTER TABLE `web_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workflow`
--

DROP TABLE IF EXISTS `workflow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workflow` (
  `WorkflowID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PoId` bigint(20) NOT NULL,
  `PoName` varchar(100) NOT NULL,
  `TaskID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`WorkflowID`),
  KEY `FK_fa8ef67b6af3434a86416b83eaa` (`TaskID`),
  KEY `In_PoId` (`PoId`),
  KEY `In_PoName` (`PoName`),
  KEY `FK_14a0fb4959514e5089f1c400cc5` (`TaskID`),
  KEY `FK_634e95090407477ab5f2d4b84b6` (`TaskID`),
  KEY `FK_f07bd2b2e0a24afcad391dc0dcb` (`TaskID`),
  KEY `FK_960cea3e2edc423f80961f8cb55` (`TaskID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workflow`
--

LOCK TABLES `workflow` WRITE;
/*!40000 ALTER TABLE `workflow` DISABLE KEYS */;
/*!40000 ALTER TABLE `workflow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workflow_role`
--

DROP TABLE IF EXISTS `workflow_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workflow_role` (
  `WorkflowID` bigint(20) NOT NULL,
  `RoleID` bigint(20) NOT NULL,
  PRIMARY KEY (`WorkflowID`,`RoleID`),
  KEY `FK_aba685035dde4bfb82d9b56a6a5` (`RoleID`),
  KEY `FK_91af73dffabd4c7991914b7953f` (`WorkflowID`),
  KEY `FK_94747a90b6e742c1ab8abb9c524` (`RoleID`),
  KEY `FK_73c1ec075d624e4cb8ea0760ced` (`WorkflowID`),
  KEY `FK_7939c747c3624418b1506b0ce48` (`RoleID`),
  KEY `FK_febbf720dfed4eef81f2819fa29` (`WorkflowID`),
  KEY `FK_68c7d3376884419b88a113026f4` (`RoleID`),
  KEY `FK_f9301c22529a4d18a524e2fad70` (`WorkflowID`),
  KEY `FK_71f0a118e1824a86ac7783f882c` (`RoleID`),
  KEY `FK_66f4547e4e444522b620a4d8c2c` (`WorkflowID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workflow_role`
--

LOCK TABLES `workflow_role` WRITE;
/*!40000 ALTER TABLE `workflow_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `workflow_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-14  9:45:09
