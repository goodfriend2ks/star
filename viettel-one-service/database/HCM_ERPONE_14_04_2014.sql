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
INSERT INTO `app_file` VALUES (1,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/en_2.png',NULL),(2,'Ä‘Ã­nh Æ°á»›c-nhÆ° quá»³nh,trÆ°á»ng vÅ©[DQ1] - YouTube.MP4','2014-03-28',3016,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/Ä‘Ã­nh Æ°á»›c-nhÆ° quá»³nh,trÆ°á»ng vÅ©[DQ1] - YouTube.MP4',NULL),(3,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(4,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e_3.png',NULL),(5,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2fd17d4f-c965-48ea-8f62-49a039029f22png',NULL),(6,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/23618a66-5126-40a0-82d4-e02afe270672.png',NULL),(7,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/10292869-f795-4e89-b071-74b1a719b72d.png',NULL),(8,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/61901890-79e6-48fb-bfcd-c3d4cce2c925.png',NULL),(9,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e427739c-d2b0-4191-9dcd-b901e85fcb72.png',NULL),(10,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f6677bf3-a5d5-4386-8994-46e7c6f53771.png',NULL),(11,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/da656388-d5e1-41ac-9c70-f9817f570173.png',NULL),(12,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8390a422-691f-4e1f-aa71-c840cc074f00.png',NULL),(13,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/4ce368d3-bc3a-4615-8375-ab3bc563dbaf.png',NULL),(14,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d573de1e-efd3-436e-ad83-ab545be65c1e.png',NULL),(15,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/a8e1bf61-2646-464f-b8ca-18b96387577e.png',NULL),(16,'e_1.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/365107cf-2d8d-422b-b52c-b4c18f895966.png',NULL),(17,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/d630ebe4-7b4d-4722-a169-98ba07fe12bf.png',NULL),(18,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/1a2f57fd-88ed-4ae3-94a4-4812e2592bb2.png',NULL),(19,'e_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/f7c2027f-f5ee-4b07-bb66-6bafd3c282be.png',NULL),(20,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/3bfb6364-6f53-4902-8a14-a3fd6147efbf.png',NULL),(21,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/2ffb8e86-db86-4309-ba47-24b40a08ada7.png',NULL),(22,'en_2.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/fc3271b2-1db0-4990-80bf-15b3acfd5eee.png',NULL),(23,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e5de3115-bded-4de2-8a49-d4a22524f0ee.png',NULL),(24,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/29c36de1-2c73-4849-adb1-baac6526a2d5.png',NULL),(25,'e_3.png','2014-03-28',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/42cf16ed-35f9-4782-8268-d9dbf5b3fe21.png',NULL),(26,'en_2.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e866f086-2cef-40b6-8f82-789ed5aaa14c.png',NULL),(27,'e_1.png','2014-03-31',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/603d9cb0-9f6c-4508-a768-bf1c5f6e3e48.png',NULL),(28,'MyCompare.java','2014-04-02',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/5235223c-d5e3-442d-ba61-63c79bc11199.java',NULL),(29,'e_2.png','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/bc6d5811-9846-489c-bd86-f6e1b10b3f7a.png',NULL),(30,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/53923696-aad9-4c88-8181-e7845bcf0891.jpeg',NULL),(31,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/8fe46fe5-d5a7-48e3-851d-fa2d464e1ff8.jpeg',NULL),(32,'default.jpeg','2014-04-03',3033,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/ffaeb9fd-abb7-4dcd-89ef-8213f5fd6d5c.jpeg',NULL),(33,'default.jpeg','2014-04-03',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/c5ad7812-de19-49c9-9f13-47f499af7d89.jpeg',NULL),(34,'viettel.jpeg','2014-04-08',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/5cb1f943-30fc-4564-bfa0-529bd2978e4e.jpeg',NULL),(35,'default.jpeg','2014-04-08',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/13802d96-a5f6-4976-b5ab-de3051d094a0.jpeg',NULL),(36,'e_1.png','2014-04-08',3026,NULL,NULL,'/home/khangpn/Data/ViettelOne/_svn/viettel-one-webui/target/viettel-one-webui-0.0.1-SNAPSHOT/uploads/e16678a4-9885-4c89-bde4-4813fb67f941.png',NULL);
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
INSERT INTO `customer` VALUES (1,'HÃ  Ná»™i','2154545','CUA',NULL,NULL,'a@jkdhfjdhf.com',NULL,NULL,'Ã”ng A',NULL,NULL,NULL,NULL),(2,'ABC','5467567','CUB',NULL,NULL,'b@fkgjfkg.com',NULL,NULL,'Anh B',NULL,NULL,NULL,NULL),(3,'','','',NULL,NULL,'',NULL,NULL,'NhÃ  PhÃ¢n phá»‘i bÃ¡n láº» Ä‘iá»‡n thoáº¡i IPHONE 10',NULL,NULL,NULL,NULL),(4,'','','',NULL,NULL,'',NULL,NULL,'BÃ¡n Äiá»‡n THoáº¡i',NULL,NULL,NULL,NULL);
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
INSERT INTO `enterprise` VALUES (3,'2014-04-08','VTT','¬í\0sr\0\"javax.sql.rowset.serial.SerialBlobøkQŒ’ç\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0Ô\0\0\0\0\0\0Ôpur\0[B¬óøTà\0\0xp\0\0ÔÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0„\0	\Z((!\Z%!2!%)1...383,7(-/+\n\n\n\r2% %5,,2742,-,/,,,,,,,,0/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ÿÀ\0\0Ã\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\0G\0	\0\0\0\0Q!1q2Aa‘±\"R“¡3BTbr’ÑÒ#CSU¢Á‚²â4sÂ$c£ÿÄ\0\Z\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\04\0\0\0\0\0!1Q¡2ARa‘ÑğBq±á\"SÁb3CÿÚ\0\0\0?\0ûk,7 Ë\0Èw `ä!Ü€d;0‡rî@À2ÈC¹\0Èw `ä!Ü€d;0‡rî@À2ÈC¹\0Èw `ä!Ü€d;0‡rî@À2ÈC¹\0Èw `ä!Ü€d;0‡rî@À2È%L\'s>(*ÇÀrA’	ôÌø «ÉH$OÒw3â‚¬|$          ğç\0.M†h#Öë]7ÚTÇqÄ4ã=Ì¹SŒvŸc=õXiÖĞ‰Uå.½4Ÿu€ï üã™íé<1ÓyMŸÊ¬cæé\\~ô¾\0©F|T[ÒÕöWÍ¬ï*Ïê¥o½\'ÿ\0UŞïñCñi÷|ÿ\0¦#Ê¬ŸUo¼?¥;¿ÄüZ}ß7º?*Şµ\'tßàµ;¿ÅØô·<ÿ\0¦üT©ON›Ë‡ˆQì,º=)‹Û­I¯š:Oãà9=®oÆÖø¨N+Ç±¢ºìüËÔuğÌ/ŒfÇx(LLuh­ënuÛ‰ˆ$OÒw3â‚¬|$        æ´Ş¼QRÜí>„~•kº#¾ıŠÊâµ™3k°âå3¼ü6–ò™W%Å;ÏçŞw|õÁÕæeô¦Kz‘·›“¯Ò•óË$ŸyÄÉ¼±[ˆèÁ“5òzÓ»QIP€€€€€€ƒÌo- ´G\rˆäBã±3¼:®úBÖ˜ÈÑôeıç÷Kâ«œU–¼zìÔöïúóvzÊ|°ª‰Ñ]›9‘ÒËªm‚}G¥)<¯y»z\nøgf8$kÛ›MíØr=…S11ÕéS%oÖwl®&       ‘?IÜÏŠ\n±ğd€€€€€ƒÖ]q¦¡»\\v’õDÓ¼eŒğhøöe1Í™5\ZÌxyO9ğ|³X5Â®²áïÁş74´x»Û»±j®*ÕâgÖåËÊghğsêÆAlĞèéç6‚\'É—[™‡µFmÕe1^ş¬nèèüé:Ld}ãÁ˜Š®sV)èÜöëÉZ%sœ©¿u…Ş%ª¨ñè›{lÙo’×Wÿ\0ãÿ\04ïÿ\0	ÿ\0ß—öÁşJOÑ«ØmñÆãàçá?ûòşÚ>KëórÂşeÌ=Ö#â¥êªŞŠÉ&%,êö•¡~Ò8¥iN#ã´2÷„)qÒÜ¥OwÔá*ÄşÎ£W|¥o×·	áµhàû#â9åUğûjÛƒÒ\\ørÇïõ}¡’4>75ÂísMÁ„,ó=jÚ-ÃØˆ$OÒw3â‚¬|$    Åï\r’\0äÀÄ’„ÎÏ™k”2ìQPŸ­ÙˆòkY­8ğûlñµ~‘ü˜¾GÎœâI$’I¹\'y$ñ$­g~¯®/jî¨ÕVØÆÜõÊıÍíÂ8¸òİÚwÉkÓèòfç´x¾“¡<ÑAc(Û¿7ôoÙsºÍlÖ—±‡Ñø±õç?£«Š&´´À`9\0ªnˆˆåÑÑí+ éj…ª!cşÑpäñ¼w©VÓdÁ$”næãÕj­ã&Œ—	»ée;÷ÔîÓnÒx+8âŞ³$ir`ğÏ/	ÿ\0Cé†T‚0º9ºH^,øÏhëiêpÜUv®Íx²ÅşcïùRQZ    ‘?IÜÏŠ\n±ğd€€ƒ\Z	q\0rNà\0âIG&vêøö½k›ªÜa§%°4ï<ÄuŸ±öœ†¼X¸yÏW­ÖÎIà§Oçúqª÷š      .:ú^¥y?lÕíã½¡Ôeı=ùÙ3{*öt~åÇ–?o¯Ñô–´\0\0\0¸À‚ÎöPjVP2B×tdgBFîsoÄv´õ´î>À»²¤Zwö½Ğ=Ö³ÀÄ8Ûƒ»GåÕÛÄñ(™ö½¨è€€‚Dı\'s>(*ÇÀrA’UM3%adk·9®dGZDìå«¥7ÍzªAîÛù)qÛÅOvÃîÇÈó^ƒê{¶şIÇo»a÷cäy¯AõH=Û$ã·‰İ°û±ò<× ú¤í¿’qÛÄîØ}ØùkĞ}RvßÉ8íâwl>ì|5è>©»oäœvñ;¶v>GšôTƒİ·òN;xÛ»#ÍzªAîÛù\'¼Ní‡İ“8ur‰e,!Í7i´G\r¸§¼]>(â±òTQ\\                 ‘?IÜÏŠ\n±ğd€€ƒÓXén0µ®xk\\p‡‹º¹®ÇÅo·.¯?Ê„Œyl´a¥¤µÍÚæ‘¸‹ñWöô—“>”šÎÖ§Ÿôî´˜Š²Í\rìw,pâ×vşaSjÍgizxsW-8ªÔÖ½e‹GÄñï6d`ØºÜI=M·ö…ÚRm*õ:šà®óÕÅşÕ¤ú«}éı*îïñyÿ\0‹O¹çı(h)(¨))ğí\\×â±;…ÁwµFØv÷[‡Ò]¥â“^¿\ZoÊK©ê%‰´ÁÂ\'–b2X¸·q6\0ÛzWñ¾îfôŸgy¯O‹Å”\ZÉš]t€Ç9À6¸oá\'GY)é—ë¿Ñ±ç’ş•/÷ş…ÎÎ¾ò}÷7ú§ïöxóÏHÿ\0J—ûÿ\0Bvu÷û›ıS÷û0Ÿ^kØÒçèÉ\ZòN;Òp.Æ*ÏæFuÙ¢7œS÷û>i¤4Œ³Èé${‹œâî‘6¹½…øÔ˜¬Dlñ²e½í6™v\Z¥®u‘Å±e3ê‹\rÃ®òæ´ği°;¯{*rb¬Îûìô4ºÜ±^¯ëõÛHs¢å\0q>ŸèPì«ï5N·4ùOßìùÆšÓÕLùdqôÃq:šÛõ¢´ŠÆÏ6{ä¼ÚeÑjn·UÓ±ĞÇênq4bq,\0`}ÒsUäÇÏ}›4šÌ”¯¡©×Úèš]&{\Z8¹Åàd·r®1VzY®ÚüµçışÍÚ´ŸUo½?¥K»üU~-ÿ\0Ÿ?éR›\\ôŒ¬F9Íp»\\H#1è¨N:Çæ_]fkFñ“Ûç^”ş”ÿ\0ÄJvt÷’ïYÿ\0Õ/n™×èé¢’¢“³9Ãg´ÜÖ·¬¸¼Ün\\®8´íîme±R-jóŸfí}Yò…òº–@ú|Kás_ŠÄ4»x d¥|<1¾èiı#ÚäŠMvİİ*€€€€‚Dı\'s>(*ÇÀrA’Ê&¨|¥¦¢¿¾hôÚ?ŒÑÿ\0¸ãvJüY6å/7]£í#—¨ÚÊh\'8îa“tìGEàf8r<•Ù)Å3EªìoÏ¤ıîÓÓzNm%Wˆ4’ó‚(Æü-¿¢ÑÛÖNd®Ö±J¡›-õ9ˆt\Z×«, Ñ±^ÆgÌÓ+ÿ\0Ñ%˜ß²>\'(RüWjÕic<wçò—;ª?÷ôßù™şà¬ÉêË&“ÿ\0µS[ïêó¿ıÅ1ú°æ«ÿ\0µ¿YSÕ\n8¤øô“©ĞÀ,,î¿Xö(d™‰é»F’•µg|œ+ÿ\0ôªëÎ÷ßóUñO¸×ØÓışÛ¯Õƒ\"1ÅYò§4âsÌ‚G[€ÜM‡£âª¾ûï1³vš+á­ø¿}×ŠƒKó®˜`mDÁ¢ÀJğ\0êæÀ/B½!òY£l–ˆñ—Ö<”Æ¸î•äœí`/ìdÍë=ïFÄF›²U7¾®,\r¯©\r\0\r«·İçâ·cõaòÚÈˆÏm¼]ï‘èÛòyİaˆÊ=d4|®ãŞ¨ÏÖ¯¢¢;9Ÿ‹¹¯`tR\0Ac‚©¯Jñ½fœô îtôñ“¥İ#|;L\rÎà‡>j‹Lïê½\\é8â{]¾ÿ\0jôªëÎ÷Ãõ¨ñO¸·±§ûüÿ\0¶Ÿ”jºwSÒGCg1bkœãè´b}ºÍŠ–æfzBÔœt­m¾ÎoSë£§®†YN5Çµì×6ö¤+2DÍf!‹I’¸óVÖèûú;ëQw¬¼CŞğûĞ÷ÑkïÃ<o{¯fƒ¼Ø~\0®M-a*j1^xkh™UQ\\   ‘?IÜÏŠ\n±ğd€€€€‚’Õ\Z\n‡ËNÜGysK˜IÌà\"ç´©ÆKGIfÉ¤Ã’wµãİ¢un”â§­w[Üà9Ä‘ì\\µín©bÓbÅêCoIèÈjcÙÔFÛŞÇ¨æŞó¼f¹˜ç	äÅL‘ÃxŞôf©PS<>\Z88—<·µ¸‰±í\nS’ÓÖUcÒaÇ;Ö¼Øé-O ¨É,\0½İ\'9˜d4~ÔŒ–ˆÚ$É£Ã’ÜV¯6§ìÿ\0F ûÉ?Rïm‡éıß9?gú3ùŞIú“¶¿‰ø~Ÿİó•m\r ©¨Ã…4a˜ºFåÅÖáw8“mçwj­6ê¿x£jFÊJ+kõ;GÎòù)Û‰Æî-s™ˆ$†	íSŒ–’Ë}Îöªµ\rP0G\ZÆ7ƒZ,;}½ª33=Z)JÒ6¬m\r…Äô©PÔÈdš\0^x¸9Ì.ûØH¹íSŒ–Q,Ù4˜rO«ÍGFhÈi™‚6±·½‡YÌ$îÎJ3i«±ã¦8Ú±´6ˆ\\MÍ?Pta$ü×ßa$€{\0;¹+;[ø±ÎƒO3¿œ±ıŸèÏäy\'êNÚş.~§÷|äıŸèÏäy\'êNÚş\'áúwÎOÙşŒşA÷’~¤í¯â~§÷|äıŸèÏäy\'êNÚş\'áúwÎOÙşŒşA÷’~¤í¯â~§÷|å¿¢5ZŠ‘øà„5ö¶\"ç<€xÛ6ö.[%­Õn-.,S½#šÊƒ@€€‚Dı\'s>(*ÇÀrA’±1J{qˆë\"¹»³3]p@@@@@@@@@AáÆÂç©§µÁÁøiÂŞ/\"øÙ«·¯ÇÊÏ®-±½,\Z(Û|‰~wVzíüQß³xù/îx¼;«=vş\0û7‘ÜñxwVzíü;öo#¹âğ<î¬õÛøwìŞ>GsÅàyİYë·ğïÙ¼|ç‹Àóº³×oà	ß³xùÏçug®ßÀ¿fñò;/ÎêÏ]¿€\'~Íãäw<^¯Uæ¬™»J‡\0Â=á\0»í†Yøú\Z[f¼q_§±ƒS\\T\Zu_[D\'é;™ñAV>’jVÒ—zQ»ƒƒ­pGªöı&üGU•w¤Ï:ÎÓ÷Õ:Z#”ó¾*}8Ğı•PØÉÕsèIÚÇğ·a±UWS<#†|§ô•¶Á3TçºÀ+K8€€€€€€€‚~”Ó0SŞ¼_©ƒ{!şNåN\\ôÅå?U¸ğß\'«Në$µ7hô#õŞï¾zùpæ¼Œú»ååÒ>ú½L\ZjãçÖQV‘a«:¨M¥ªm‡Äzò/}ü—¥¥ÑoşY>__£ÏÔjÿ\0->GnªóD\'é;™ñAV>’jéC0JĞáÕ›Nm=EW“rW†Ğ<–Ç;Ö\\Uuúi$Cè‘‹íf]­ø/:Ø³éùãë÷ìú7×&ü¯Oßß6tZô8OûÌ7ş×~jTô¿\'/ ÷gæ³O­Toş.“š[ñáñZk¬Ãok=´™cØß‹IÓ»£4g“Ûù««›ºZ>j§ã¬KÜ*cõÛø‚—x£Ã>]zR°sp“’‘Ö`ŠZzCJ}b£gØ~ï§şÛª­ªÃ_Íÿ\0…µÓeŸËÿ\0ªõŞüÓó™³ù?ş¤z±3ä¾ºÏ­; i\rlª—s\\#nLãøşë,y5¹oÓ—èÕG½y¡9Ä›“rx“¼ed™İ©áŞÑ³T;,\'3Á­ûÎêñVcÅ|“µa™k7´»İªñSÙïıä±àÏº?ÉßÉzú}qórò³ê­“”r…õ±”@@@@A\"~“¹Ÿcà9 Ém-«Tõ%¸~›w÷‡â³fÒcÉÏ¤´bÔß.°ä4–©TÅrÁµnmé{Xw÷]y™tY)Óœ=zÌvëÉì ÙÀ‚8‚,G0VI§ij‰ßœ1°\\Ú,ƒÊë‚\rí¡ê\'ù¨ÜG¬}ş#ş¸ğdÉêÇÑ^LÔ§­.¯EêKcRìgÔmÃ}®â~ÑÅèúÇ;ÎìuÓ<©:¨ dm\rcCZ8\0,±o­b±´CÚm;ËØ¤à€€€€€‚Dı\'s>(*ÇÀrA’\rjÊf–6¿˜Ş9!BøéZ7N™-OVvA¬Ôšw|ÛŸeñã¿â±ßÑøçÕ™6ªk¯·4zH¨oÍ¾7ó»OvññY­èü‘Òb|š+®¤õ‰„Éµn±œaqû¥®ğ7TN“4~UÑ©Å?™§&½(eØïÉU8¯k?)Y)=&>oI‰Ã‹\\=…G†|Ş6nÈ÷&Óàîğö2’WtcyäÒWb–‘?$fõ²Ú‹AÕ;£ÖáøºÊÈÓå•”\'>8ëhoÓê}cºMc>óÿ\0mÕµĞæ±·ßÃuVÖâœÕ©5\Zb{Û|Müšz:?5¾Lö×Ïå…Ê\\¤‡{búÏôÏ1}ÃØµãÒâ§Hùóf¾§%úÊ°Z$OÒw3â‚¬|$                               ‘?IÜÏŠ\n±ğd€€€€€ƒ	¥k\Z\\ò\ZÖ‚\\âl\ZIàÉ˜ˆŞPiuÛGK(“ŒN8[v¹¡ÄğÄYY8­¾ÌÕÖàµ¸bßË¡Uµ&×i¨a_÷³†ìÈáş8›\rêQY˜İUóV–ŠÏYm\nèŒ»!#L¸Œ`‚àİÛÈêÇ×6·O¼\\;ól.$                 ‘?IÜÏŠ\n±ğd€€€€€‚n²hß•RËv#w;¨C…û7oìR¥¸gu9ñö˜æ›í»ç”Uu\Z%ĞE]Iã;)šx$úNkÇcà@=ªùˆ¾óYyt½ôÓZä¬L{%µ­ZUòÍPêYëøÍ±Ù6ĞÆöƒ|gÍÈ7u·[¬ÊWhâ9§©Ë6µ¦“oñğèñ°UDh*ç•Æ	Úb™¿D=®sv„²\0wú]špDïXêäj2W³Ëiÿ\0å?¯ı\\ÔzÊŠ¹jj_#ö.~#\'Ñ¶ô€êÜ\Z7u—(dˆ¬D{Zt—¾[[$Ï/cnÒG¤4{#‘ÍdôÚ\rƒı6\rùî\'½)5“S’ÕÍ±<¥EĞLtôÍùC±0	àßğ»bE÷6Î\r¿Ù\nËLvqÉ—;wÛGÇõéÉÚkt¾_“HöHÑ¥†ÅØw–_´_ÛeM&8¹½-Mo8§‚v—²Ï¤C4cí©íÜ@g¢{À&Ü.ö+f‘]æ^}u7Ï8éIÚzÏßß±çDü»Kºy[XúvÆüÄË‹n¸Çb;ÍîoÂÖKpÓhÛsk©›[†#¤}Skµª±ú6æR%Š¨Bea¶Ñ›7#´qw)F:ñªÉªË8:ó‰Ûxı%ÔiÍ#3t½M‘Â7²ï`6?¼Şá×Àw*ëXà™lË’Ñ©¥byL}ZOŸWV÷K5T†8%p’}79¿Hß¢¬3ºî]«Ê!^†rd™µ­Ê&y*ëİUE1§©‰ïÙE Æç1ÄX‘Ş9¹¹(ãˆâWk/||9\"yDórµzëW#fcÚê©\ZhÈÜDxğnís•±Š±·Ã«µ¹-XëoWôèßÓõR61Ô×:JX@”ÀßDH&I Mî7¸½ê5[íÖæ´Í¸\"ÖŞ±Ïo‹R?ZÚj:×Ê÷FÉ]íêsq.pNEÏXoY]à®óUq¨Ëé–g–ûK Õ}#5m}LÍ‘ß%‹÷Q²ş‹Ü>•¹]ßënJ»Ö+XkVŸ%³fµâÆ9C³U7ˆ$OÒw3â‚¬|$      ÕÒ”-¨…ñ<¸6Fá%§¬r+±;Nèd¤^³Yö¹z\'tÑÈÇÉ,ÒˆÈ,cÜ0‹pÃ‡fà¬œÓ0ÇOGã­¢ffv{ë5\ZË3Û<ñ¶¢æXØà\Z÷Şû¸\\“c™êHË;G$­¡¬ÚÓ˜ß«KZ´‘èè¨©\"|×xôİbcË‹‰¶÷[‡®Òñ6â•z<ÆÃ7ÿ\0¯ChæRÁ,á@¾g‹œ{I$ûUVçvÜXã\"‘ìji]_¢¢	Şç‡SL\rµœn¥pOWR•o1dÓ×%ëyö5t–¨Á5[*±ÈÉ\ZZ^\Zl$µƒº÷€±àc$ÅxP¾’–É7˜Ÿåz¢BÖ9Á¥Å ÑÅÄˆí*¶™£w!äó@¾´õìåä.;ŞÃ \\{šÕv[ï´C‡ÓŠö¦‡»Ij<²¾Håš/Î67\0×ßëuß‡ÅÈË1\'“CKZm1¿]›rêe!£ù+CšÌXñƒéí8c$î&Û¸pÉs´·S£Å8»/gí}¨ĞÃ4S§’Hx¸‹¼nhØÒrÌÆÈÓEJŞ/¼ÌÂ­êüt,{bsİ´~2]n6u€İ¹r÷›u]ƒO\\11Öö’¢eD/ŠNŒ-9‹õÑÇØ£´î³%\"õšÏµ¨íN]Nì4—vÜ69õawŠyüPì)½goW¢n‘ÔØ¥¨|ÌxŒ¢Ò¶7a[~î»oRŒ“¶Ê¯£­¯7‰˜ß®Í9 İK¢İKI“—ºÛìKnq›[…·v¥[ï~)U›ãÓÎ<qºş«è‘GK#‹EŞs‘ÛŞ{÷rW{qNí:|Q‹QUEx€€€€€‚Dı\'s>(*ÇÀrA’	ôÌø «ÉH$OÒw3â‚¬|$                               ‘?IÜÏŠ\r¶Lë\rıH<íšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mšÙÙ mš	ò¼â<ÊÿÙ',NULL,NULL,'Viettel Telecom','',NULL),(4,'2014-04-08','VTICT','¬í\0sr\0\"javax.sql.rowset.serial.SerialBlobøkQŒ’ç\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0S\0\0\0\0\0\0Spur\0[B¬óøTà\0\0xp\0\0SÿØÿà\0JFIF\0\0\0\0\0\0ÿÛ\0„\0	 \Z \Z( \"&%!1!1)+...+4:3-7(0.+\n\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++ÿÀ\0\0á\0á\"\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\0L\0	\0\0\0\0\0!1A\"Qa#2q‘¡3BRr$4Sbs‚±²7Cc’¢³´Ã%58t„“ÁÂÄÑãÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÄ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ÿÚ\0\0\0?\0î(ˆ€ˆˆˆ€ˆ¼M+`ˆºg´’H\0òO$ÑUüèú¿õLEãó%‘ùİ¦ †å?h\'Í’Tô”ï?£âo¶í&Kşİr	u˜„T |¶VG~YÜüÎª7Ï-Ú–9¤>= û kõ”Š<6*MLa<ËZw‹2|J”‚µµÓH=+ÛúÉ\"À÷¯/®ş<ê^?u9Vˆ‚±•VôCû5?¾\0¾»•‡µI)ñcá#ûR4ü’ ­8ÜLuªD‘÷—Å höÉ—\'ö”ÊZ¸ë\"ÍFö½½ìpp÷‚³(UxL5’ç6çµ„ìÈ„³Ç‘A5_Èf¥ü‚ráö&…»›#lñ÷ŸØƒæØ»í“š#ì”hÍ†pÂO ‚Ñ™dÄ])\rh’M€RI<‚©¼˜Ñì—EOŞ.Ù%öq³ÇG™@íiñ3$æ<-¼Wƒg:ö‡¨sìnïĞ<¯”¤Ht‚LMÜiˆ¸³£ä7­œK­³:ÒÀLĞÖ´X5 \0pd@DDD@DDD@DDğ‹WÔATp£Fs`®÷ÄEâ>Æc<õm…ÍË\\³Qbbi¸UM1Mkäw\'ÌÆîOÍEÆ`Òl§¬´l®ƒ%Sn9H Nk¤tp ˆ3¢¨m[ğ§†âg<GFÏ  ı™€ĞxH;\'‘\r6Ïn€ˆˆˆ€ˆˆˆ€¼O3iásçpkZ	s‰°\0’Iä\0^Õ4cçÊœÎü7vI^Óëø±¤v~Ó†nA¤‡Øav3(–µ¥°´ƒN¨’VŸ{c>®wjÂ;„DD@DDD@DDD@DDD@DDĞöñpt ª`NÏºÏ7¥<‰ç?šñşoî}Òøá™¶v¡ÔU„ám‚_¡~»ì|yjÃÜMˆn{tD@DDE¾¬PÑºInCG!ÌA­I$\0:’‚(ó[R)iÉniœ\r‹c$€ĞF¡Òæ‚9¸‚mìã`0ØÀ\0\0€K\0¡á¥¦&ªÆYyå˜ØeÃF´5ƒÁ‚úİN@DDD@DDD@DDD@DDD@DDDA‚¶‘µÔ® ]®\rˆê#PA\0‚59(ØMS¤Íih¬ygi¾I\0èÓs\\íu`ªñ¦\Z|µ4à—E|À^îˆÛ;@È°{G2YmŠD^Xñ#apG\";Âô€ˆˆ\n®§ñìi‘ıH@•ıÅæíŒwYï#˜!…Y¹Ù[wh­Ùö—Pq¤©Üe:XÙÖw¶1O‹PY¢\"\" \",\r¬óädŒ/û!Ã7º÷A\ZŠ¦R´\Z—µ€òÌà?zÌ€ˆˆ¢Óâ0ÔÕ¾*yct‘Û;\Zö—2ü³4‹ø©Hˆ€ˆˆˆ€ˆˆˆ€ˆˆ*°oÅ&’˜òÎõO¾QÊİ‡5ì£XŞõjªñÅªàœ}WpŸ÷%!£O	Fı\0r´@DD›CépÓyÌæÅÎÇ+ÍGˆ;¿eYa¢¬¬ô¸í;Ñ­–[÷8Ä=âwû•š\" \"\"üÇµÍ…o>º¿çI;^áŞ×ò%Á‡ï¯Ó‹‹l½1mîãTõ¢ñËØáà_ÓÇ]D7ó‰ÇŒì5E	»%“3|ã:Èğº~ÕmU6ÉaBlaä£ZÑw¼Úöhÿ\0© ¥~iÚ‰¤Ápi0|NåôÕYã=ÇŞÃ 7àHWCß¦Ş^ÌGZEpïWZ‹I{éê†_Áß€or‹ÅYO;\'§|–á™˜_VÄ8óèyõĞWü$Ûpª7h&â<7¿&P]îwŞºıq¡å¾FæöØ_âƒ›lğ×o7ù••B«ÒñL¥œ!iÚÃÊâîÓìíG!Ó‘“Q¾|>\nyK›>xŞcádfwZ÷p³ÈÊ-©${¯ºå›öÔÿ\0‹jË¸šv¿jñg½ ¹¯\r#P$¥À¿İ6A¾Œ8à‚ qKóğ[ÅĞ\\ºÙ²å¶¹¯ñ-‹b6Ö›m(Ÿ&™¥„Æğ›{ØèH±±±¿EÍwG[uŠpØÑÃqc4–ñ,;‡e¾åçuÁ¶Ûsû1CÅqk&è<\Z\n\r£ß-¯üVµñ±Å”BĞËƒ”‹¹ã®–6Õn˜fĞÓâx¬¥”pKËÎ¡·Íšü­cbä_?â{ÁÙzêŠI)é(cl¬s2=ÀGÍ.pû.¡—S ÑRà’¼~U¼)\0Û£K©î=„}¥@‡}¸tµå™gŞÂcÈM‰[0½´¸6#iÙm±§Úlõ”ÁñBÂàã6VÛ+Cœã•Î\0\0yß¡ZN	\r8üdà†e4Ó9×·Òö¹ß¨xhÁn‹OÂ¥|_ƒ½Wâõ\08²d„~ƒÍüıôĞ¶k¶\Z£|Ÿ(üİ›–¶¶oÑijYYJÙ)\\Ç´9®ˆ\"àƒâ\nâ.‹ãÛ·Š—4rDMßŸÖÍs­³‡‚Nµ×PİÖ6±´ôØ±i–0ğr›‹qæ€l94´y ÙGÄiEu‘8‘®mÇ1qkÏÉxÂªn’®sAs{nÓ|Ç’–«0?Fgˆ7;üø™j>ky ³DD°v¶ŠbyaÀ—Ì]ğVJ»9±:’z=÷DÇŞUŠ\" \"\"ÕpM‰f¶U8Œr¹Î¨,Û¹®ĞóúŸµ\"\ro÷cÚb,ynBXÌ/vÜ¢î×ÇÀ+m¶Øª}³Ã[\'™®a¼r2ÙšM¯k‚6¨l¨ƒ›àÛ¤^:Œ~®z×Ene\'+lnĞnçÖ×¼K¤\" Ó¶g`cÙı­©¯†g½ÕK°€sÊ%Ğt\"Ë&Äì36F¾ªZy]!©psƒ€lç»K~°û–Ñ5K)íÇ{[~Yˆ÷ûVT\ZÇì+6_\Zª¨‚g<Ô»3šæ€Ûsô·Ş^6wwñ`¸İmA‘ÒŠÌùãsFPòòµ>±qDº‹s1RI$q×U\nY\rİN×e=3láËêƒ§5³{O±ûQM[!šÜI%2Y¦6µÃ³ÒÌ½ù­µ•’RØŞÒáÌ.:jÚˆU™RĞö8¹®\0‚±#¢ÏXö	‚a;=<˜f#,ùÚã\r0”Ä-!{\ZĞ{ƒÚ·«c~G noİp‹ì¨28±×c»#ÇPÜÀø‚ûw{…ÓLdùÚœÍ»Gì¸åø-š	[,w§sH\ZvH#Ù¢cçËp\\R²I1µÇ¯‹\\Ñı•Ò0ª/›°È¡sølk3<İÎÊĞÛ¸dÛR¤½Á%æÀjIè¼C3gmàppåpAıÈ2\"\"\" *ÚS—h\'häc…şdÌÃğªÉWz»A÷¡şÿ\0ôø ±DD¸f˜Wë[ıÄ_úVJ¶•ÙqéÛı/÷™YşZ²@DDD@Z–7¼œ7Ä#RÑÍk$v_XÒ/á{­µr\Z­¦vÒí\rU>ÅatÕNYê*r¸êÎĞĞr5$È è‘íe$»:êèg¦h»Ö½ÙuV5¥à‹‹‹\\\rN‹6´TØÆjğéCàÄ¿+…²ß5Ã€pµEÈ7IòÚV»XÎF9 éÛFë{CF¾P`xËökwØÖSëÇ ºó28Á%‡plwı¤ÃÛŠC–®– p\"9_#™#@:iÛh$ö›ÊüÂƒ…o?ÅkÛ\rPÎãfædŒôÏh=õZí©·{¹è~„KÄ\rs¡p’Y=(kƒ…»! o¤|#Ï7¡%^%³”õX–MIEŸJC˜ç\0ë}[6ö ˆ6_ÂcÖÃ¿â?È]Wiv¶“e£iÇgg¾Qg8›s³X	ê5åªãÿ\0„†l3	t†åÌ”“â[NJİ·µ‘a¸õ5-+kœ	‰¯\r´aæ×ÌAÔäÔi`Û’0Ùvgmh¶¦G7¨lh¹ak­ ¾W€HÔj.5Zµ\r-+wÑ,Œ¯‘Õ&<¦—‡%‡£iú_P´Ğoyç¥–„ESC¿Jc‹C<²]?©c×R.rëâ.­ğÏö‘ŸîãFƒÆí—<SîÔ‰‰o¸®óğ¼*½ĞÖUì%®\rGlA,a¥Ö…»smùb·û5âbYĞ¿lŸWÄáT¯‚îâÔNĞ3¹×%Ö]˜êF¤	·$j±(±}ÛÖM†HÙ#},å®i¸>ÃŞ„s.wº\r²¢Ù]‚œFçÏ!kC\\ç•‚ùX	Äé¢ƒºÉK·=Œ4f {iµıÁYî3e(ñm‹šLN9^ù^Âç´\ZË“«uq77ööĞâğã»·­Ÿ	‘²FêZ‹8_ó/Ğƒ¨>µ_ÁÏM†—ıéÿ\0İB´İØHbÙ ‚\'f‰HZz_…;s} Æÿ\0UyÙŠ×Ğn½Ô¤‚ê’ÂGÙx§c½í$y êÒïO\n‹àº±™¯—0kË/úÀÜ–ı+ÛÅnp{aAˆ_ğúJœCví£¡Àó¶F6¤JÌÅäæú¹¼-›—g’ë»°¥¨¡ØZh±¶–M\\Â×Zá¡î\Z±•Òˆˆ\n¹ÚímÒ|^Û	V*¶›hå¿Ha·›ç¿ğµ’\" ­ğ¶‰–\ZIÁ>,{GºY’²U˜ß¢Ëù¹™cï¿€âæ?uY \"\"\" .MK»:ü¨~Éâ§‚ İ÷3Ú.H\0A-Ìà™§UÖQƒ»\r€~ÃÕU™fl¬˜³%¯˜=k‹\\‡]Ê«k7Lqí¸ùdr±°=Ñ:hˆuİ’ÁÀ[MZÑæJêhƒUŞ>ÇµÙï“‡ğŞ×‰#u®€-³‡q#ÃC­¬tlSu¸=€Ç9ˆÆşQ@Ğn÷es­`	úêWcD×x›¹›k°êàš8İLÇ5ÅÁÄ8¹±Íºz3ïYvûwõÎÒÃˆìÍK`©ŒöÅÛ¡6p°:ÙÄAwk~Šˆ9v»j¸öæŸÅ+[<ŒÖ[°·\\¯fXÃt\r\r-î¹¹ê­)6X7§&*eaâÜ;;0ôMŸ.mºßQ?Ù€“ÛúÊú™Xøê 0fåd‚äéÉ¤yªuµø\rDĞ`ØcÛì^\\¼´»l×e9s‡ûh\0ëÈƒ›l†îfÀ6:¾ŠY£q©kÃ¬ÜÑ˜û@aÑRPn¯À°~ÎâB>(\"vàÓ©Ñ»)sNBĞmcvóånÈˆ4MœİÓv{aj¨©dš¦9\ZùH°ÌèÌmĞ\\åmüN¤õ²Ç±›ºNÃÔaØãÛ3&‘Î%€‹ÈÀ¶aë5Ñæ¾ËD—\rØgg¡ù>Îâ±¶œZ.mÍÍƒ˜ûs\'Gs~«§á0IK…ÄÊù8²5käµ³¸\0­âuRÑny+j^î\\PÖŸÑlLÜó V<Et†À“ÜªÏFYƒÆd®}åsOGHã+‡‘yH,Q\núQ]C$RŞÏkšmÎÄ§½aÁên\ZÇÍ`û¼Aí%Øö¸y)ª®Ÿñ<mñŸVaÅgŞm™#{†œ7Ì’óÑ¢\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\" \"\"\n½¡ôÔmƒ¬îúIìôM’Ç¾İêÑUÓ~9¾O«á7ÅÎÊùqµ£h=^¢\" (8Å+ªiA¥·2$úv€#)66is	èTäA‚Š©µ´’ÙÂú‹ŞèA¸#¡YÕMşjÅ5Òİ§s&=;€“Ë¶3 VÈˆ€ˆˆˆ€ˆˆˆ€ˆˆˆ€ˆˆˆ€ˆˆ\n-Xhé=\0GÈÚz¼ò½µ°±sF´Šj¨ÃÎ•Ÿ):ÆlÄf—»µk4ëÙÒ‚~H(h›dœ£Wnq7sº¹Ä¸ø•!\ZºfÖS::v¸X‹‘î#Pz‚5\nTæLiëÍå`»\\@V^ÙÅ´¸¸Ö$\0æŞÍDÄhElBÇ+ÚsFñÍ±ñ$Ô: –Š^gq¬LÏY½èöÍ§àt:…9V×V:YøiôŸ]ö¸ˆ§¡y¿e¾gMb¯Îµ&šØm¸îÄ\\DG8]Ô0ô/k…³FVÙº††‘´4¢:q`/ÌÜ’MËœN¤’I$êI%g@DDD@DDDA ­åi»$o¬Óá}=ZnU‚‡pœC‰€É~©É(ù£\'‘¶¦2s6ÇÖq²X+)]NYTĞæ›wn#PA\0‡\rA\Z ÎŠ£‰6ôù§‡£š/+sšÑé\0×´Ñ›Êãw+*Z–UÀJàöE¦ã»§ˆ2¢\"\" \"\"\" \"\"\" \"]_`Õ:×6h±.qµìÖ´8Ø\0\'Eƒ.+ù]á‡óaŞ‘ÿ\0¬s}Aú-$›¸\\±z××ÊbÂ\r¬KdÀµ–Ğµ€è÷ßO²Ó|×##§ÑR6†”âÃRI$’N¥Î\'RORVH!m<!45­\05­\0\0€\04\0w/hˆ€ˆˆˆ€ˆˆˆ€ˆˆ\nNÙ\'2S9ÑHy¾;v¹ÛH-~‚× 9§¢\n¯–ÍD?Ò1q\Z?œ€æèI/À4È}Še|uÀü‘ívSg\0uiçg7›O±RTJÌ6*×U\\æú®äæı×Ó|ˆA-`Ãd§ü†¢@\0Ñ²#|Ë­)ÿ\0˜™êâ°,‚^÷¾3äÂ×ÿ\04U§•¦Î¤˜øµĞñ”‚ûó¡´Øø\\PX¢®8¡?GO9ı–ãxàÄ&“Hé$½ï„{$yø ²EYz¹‡*x¼ä—áh­ñC…¿.g²×pÚ=œ ×ÛÀ¸ Ï[ŠEBüµÈ¸cAsÈïllçÈ(üjŠß `ŸjK:C¯Õ¤´\\j	q#«Ê:(èXEm`&ç+@¹ï6æ|T„¨°ÆRH^.ù³¤y»Èî¿&‹ë• 6ıÔDD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDD@DDDAÿÙ',NULL,NULL,'Viettel ICT','',3),(5,'2014-04-08','VTN','¬í\0sr\0\"javax.sql.rowset.serial.SerialBlobøkQŒ’ç\0J\0lenJ\0origLenL\0blobt\0Ljava/sql/Blob;[\0buft\0[Bxp\0\0\0\0\0\0Å[\0\0\0\0\0\0Å[pur\0[B¬óøTà\0\0xp\0\0Å[‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0 \0\0`\0\0\0ˆZ¤\0\0\0sBITÛáOà\0\0\0tEXtSoftware\0gnome-screenshotï¿>\0\0 \0IDATxœìİwxUà3³}Ó{/$$ôz½w¤ÚP¤*E?ì\nˆbE\n‚4iÒ¤w!Ò³›MÏöùşØR!Hä÷><<É”{ÏÌ&gnc¼Âü×?¸õq‡\0\0\0Væ·=öq‡PÔÑ¡Ì\"©£Cw\0\0\r•‹½TU¨}ÜQTÀ>î\0\0\0\0\0\0\0\0ş`\0\0\0\0\0\0Xl\0\0\0\0\0\0\0+>î\0\0\0\0à±0Œˆexâ{yÛ±D…î‚¢„aHoâùÇ½Xà%\rğµkë*u”²DÉEúÓÙÅÓŠ2Õ†B½éq\0\0P[H°\0\0P>6¢§\Z9Nkê\Zæ\"+¿ı`ZáÊ(å‰Ìâ‚G˜ĞÚÙ×ÃÜÇ4rlã*\'\"Ç—9\"jç&º±]Ui¶&ä­¹™“£5>²¨\0\0\0,‚\0\0àI4ÄßaI\'ïVÎ²ª»øÚğµß›ûáÅŒä\"ı#¦µ‹l[ÿ Æ\"ú!:çÇ[9)Åwë\r°	ršîî\"›ÒÔå©ƒ‰‘*Í#ˆ\n\0\0ÀRH°\0\08#~éà,‘JkÜ›R_ Óqœˆe:»Ûğ³³ÌÄPç\0;ñs‡“ÒJu\ZL/ÛƒCCí¾]ğÜ‘ä¢*Íæ\nñ‚RıÁ…Œ­ıƒ†úÛ_Û¬÷î¸cEu’«TØËÛV\"x©jt&îXF1šÙ\0L$ØŒÄ(pÔ<Õ¢€\"‘›–±1W,2åÈôIvF…ŒËó:dì\0\0\0õšèçÎ!OôWRşŠ(åEeI±uÙKşN)ü>:ç‡ş¾6¢^¶¿öì»\'®î‚éèns|D¨‘ã§ı›².F%f™ò{eBVcä\"ÈÄó£$¼êòcOÿ£ÃCzíŠ=Y\\!\rö³ß: ÈFøàÁ–¹q÷¥Z1*\0\0hjõğ`l²NYÏÄ;<oÛ;CTÄÚ––öqP¡mßtÇgâNuP02¼²\0\0¨¿6ö	t‘\n‰èï”‚‰G’e8\"úwdèæ~Öõ\n(1˜íËRˆ¨»—íÜÖu‰«T¸¥_##ÇO=².Fµ°ƒ·jRë5=ı‰¨¥³ìæ„æQãšExÚòD¶óÊ©õšş¿Æª¦O1ñüºŞ¥Wau?õ\nx˜ìšˆl„ìO½¬\0\04 ÷~ˆ&İ”wQï3\nKà¤“wËrœtKà¡¶Rx\0\0\0`MM¥]<l‰(©H?ódªy\"1³¸ƒXæ\"ûs@\\È¾{>ƒˆD,36È±b»²Õ¼ÜÌ5ĞN¼7¥ğ×Xñüm=mDì´¦®íÜäÓ›¹6u”ÙK¦4uñ‰´÷²	¦5s\r¶—ü\Z«Ú—h\'~·g]Äå%÷ ³¨›O4\0\0Oš{&ØBNŞ-Ã~T2	-xÈ0b“ã3ñ².YÄ>–>\0\0\0 F£9\nYâx:–QTi³î;c#vÆf”\\¤Â¯ºøş£ÊÖˆÈK.êêakõHÅ‚©Í\\y¢	ÿ$1LÖÈ9>¡@—P¨3¦Ô\ZKŒ&¥ÖhÎ¥suF\"zåDjÖğ\\ˆ““¤®Æ¦åhg³K,=ëlv	F_\0<ÉjL°\'ï™!ëCDcÁbóÁòN\nyït\"äØ\0\0\0õH3G)CŒãv&çWİ{*«øåSÔF®‡—­«T¸5!ŸˆìÅ‚ {±Õ#	w•7²y5[g*ım¡õ¶›ÏIn¼ùF¾Şôİ\re¿=qã%~x!³ØÀµÿóÖ›gÒ\Zoº‘§3‘ÆÈ}~Uá!µr–Z=03W©P\"`æM¯ı)óÎ¦KŒkİt\\\0€¡Æg€´C¶¬UîÃ-k•ËXÍ¿ŞS\0\0\0X‘‰ç‰ÈÈÑµ\ZVº:]¼>6·§—­ãÍ-Øã\\\rÅƒıì‰èçUÙ–ÌÃ_Iù%2pü©¬xsúR¬ÿö†Ò`ºûâ~}\\î’Î>Ï4v®£©ÎX†Ú¸Ê<5İıF+÷Be5ÌÖ¹õ±¹Ë®+6ô	4/â\r\0\0õÓ×¿ï·ô”çvötq¬ıñÕ?*„~EòJKë®JŞ6GÔ¨àáË\0\0\0«0	jd\'©ö€<éã‹™öÆêMbCD7Ï‚f]íİä9ZcùÕ´óúwdèç}ˆ(ÜE¶}`ĞÁá.2\"z§çÑá¡´ó*;XÏñ)Åú–uÖ‚mÖÁM~jdè?é…;c¿V\Z+Ì6rü÷ÑÊˆ±ÿ¤\ZÚÁ\rÙ5\0À“®šÒ¬Ü`;<™çy‹z†×Ä¶ZÁ)WPıSÜÌÓİ¥e“àÂâVÇó¼T\"‘Ë¤%jÍÍ¸$WgÇ\0_/“É¤Öh9—HDv6ò¸¤Ô´L…\\&mè›¥ÌÍVªîQx%2©ÄİÕ© ¨$¿ òú™ö¶.N©Ùƒ£§ä2iË¦Á.Nƒ±D­‰ONSªòÊèëåëíŞªic?Ï’ÍÕ±éYŠ±‰Õ\0\0`)ÅzxËôñ±;ZÃRÒæ†k\"êëcODEz.¹HgõHlElZ‰¡,eõ±-hïEDm]åãr\'7u57q§—è]Îú´£7uõ°ù#!ïV¾–ˆ¯ÔEu4ıZ9.Ráo}­V¾u&}i¤â»¿¾öDt0­ğµ“©%†Ï:yÏhî&®ûH\0\0à1°pĞs5	¶$,W æ‰JŸ1<ñU¿(û¶´^\'†XbùŠ!0R“8¤@{ÑıAthİ|õçïd)TÏq/	årÙ¥k7ç/^Ù»k»é/Œ‘ŠÅF“IÀ²B¡ÀÑÁnşâ•›ÿ:Ø§[ûEó_ùçßss­àùÚ^wëæ!s¦>³mïá?÷©´kÔÀ£‡ôyõÏÓ³µ,ˆìmÇï×µ}X€¯WQ‰úÍ—ï=|²loDÇğ¹¯LìŞ<K¡ÊRªdRÉk/Ë/(Z½aûúm{«&ù\0\0\0uêXFÑÛm<„,32Ğá«kÙzSMGvñ°éè&\'¢­ñŒåÓ}ÕFùÇwz‰ÁÄó†1r||¡®,ÉÏTò´&#ÇYÆÄó)E÷YÓ¤.&Wk’\nØb7poü³‰è÷ø\\O¹H*`sµ&¡5Ú$\0\0à‘Ô¥•‹½MM{íld«·Ô¥•‹³£E%WN°‰QÒän¬‰7qWúÔ`H@ÏñÄ™³k–ÖÄs<Ï»H]œ1_Ÿ+bÄå›¾–$Íò´×IWãğ­óWnüoÁr_/÷ñÃûùy{ü{öòŸ{ÜNÏÊR¨¾t;=+8Àwæäñ®ÎëşØsıfü?ÿ\'\"{;ƒÁàhoÙûûxöìÒöÔ…kUwuoÑ!¼¹DbÙº\Z™Ù9o-üÆÍÅéİY“\":…İÍ™[7ùú£×İ\\œ6ş¹ï÷ûoÄ&:;:ŒØãù1ƒßù¢B•»ù¯ƒÕ\0\0ğşI/J(Ô‡:Hš8Jç¶öxÿBFµ‡‰YæÇB–1rüÑŒ¢ò«yYK±kç&/ßğÛq{ÌÈ@‡É\Z#·2JY¨7Ñº˜Ü\"ƒ©Ó˜Qvß.T›J#²Œ›L˜Vb°z`UÍ?—~2«øàĞÆÍ¤_\\Ëşøb&}ÜŞk^kè<íÌS©%FîËÎ> \0\0°\n{›{Œ¬şi×q\"â9òtµ`ôµYå¤Wà¨8•¾6ñ¦aÆtôêz»0ÉVdg#²Ù\Z»±‹WO?û\0•Zémç{:ãß}I…»µ›Ôò[‘­‰ã²Õ+¯~•§U–5€‘ĞE\'tÑ\Z3j\\á#;\'wËÎƒDD<ÿæŒçoÄ&mİsØ¼+%=+%=ëf\\òÄ±CŒFã²5¿›;`3³uÏáÜüÂË×cª6_KÄbwW\'¡PXPX”›_h>Ş|˜‰ãˆˆãy\"bY†+7˜Ê`4Ë°Uw™‰Å\"7g\'‰D”—_”WPX~W‰ZST¢6\Z9¾ôI/\n§OíçíñéŠ_¾ıåÒ+UªÖlÜqùzÌ/Ë>üü½Yg/^ONË$\"Ër<Ï0d®ÔÅÉÁÁŞV­Ñf+sÍ}õ«^££ƒ£½ÉdRªò´ºÇğ:\0\0\Z¨ë*M¨ƒDÌ2óÃ=Œ<¿,RQd0•=ôX†|mÄ+»ù5u”Q¶ÆøåµìºãRº³T¨¼3ûrúrÚüu¡Ş´2êît0åw™IXÆßVüGB…aYuaÌÁÄ–Î²ã#BÍï>jçõt°5q”Q;7ùñ¡‹/g9˜øç€ º\0\0‰XL¤9pîzFNŞ€N--:·r‚-ô¸ûôbˆ‰Ë¿i/qx±ÅËy\ZÕÒK‹ó´¹—²ÏÚIl§†ÍÜrë×¨œ«>½¿è±j[ìoû’váœvï~×gİ”ƒã5ÆŠOÁ¦ù÷H°Ë\\½«Ñêº´kÕªYãë7ãË¶÷èîãé¶zıŸ%j\ry¸:O9@$d)U=:…oÛ{¤|ş9´oD»ÖM›5n$•ˆS3³/\\>vúRjF¶¿g¯.íºw\'¢nÂx“Ë¤Ù9{Ÿ\r\nhÙ$¨UÓ`\"š8vˆ*¯@(`ã’R÷9m4•öë×½c§6-›†ÚÙÈS2²®\\9pülFVé³_À²,ËrœÉh,=¾ÏN=:·=}1rçãå¯‘a˜‹×¢w8şÒÓ#Fê¹â§-£‡ô\rò/*Vk´ºNœ9°WóFînÎùE#oş{örÔ­„ò%x{º\rèÑ)¼eON›˜ròüÕÏ^Ñé‘f\0À½È„ìšşc‚JßÇYæ£v^ı}íˆVFª4Zï(tr·™İÒ-È^BDùzÓôSÒë¦•xsBŞÜÖ“š8¿s®´}V÷O:z}©Xx)Ó×V¼©o =s89­X?1ÔùípÏÏ®dmŒ+]âdN+w\"Ú›RXCñV`äøÕÑ9¯¶pëëS¡»œ9µ.#f™í½§}¥œÑÜUˆÁØ\0\0\rDó1¥Ùåõ„4O‡°Æ~µ/³r‚-\n¸»ÖË°7s£®)/µtmí\"uÛ“´ÃCî™XïnãqSu}uä2¥F¹¤ûÊ]	Û/Ù0ÄL>0öäÓ7ºy÷ÚŸ¼SÈŞík-p¨Õä(—¯Çì:øï„ı›‡•O°Ã[6±‘Ë®ŞˆUk´Ddc#ëÖ!ÌÖFŞ¦e“,…êÏ¿”å×ÃúE|÷Ù|UnÁÉWS ¿÷¨A½¶ì<4ï“.NãFôkÒˆˆÚ…5iä/•ˆ/^»yôôÅĞ ÿI†úÑ¨A=õƒH$ÚûÏÉıÇÎ‰ˆhHßnK?zC£Ó<wU™“çãåöÁS[·]¸t­¹…œ\'çyã9®´ëZË&ÁÎö;öMÍ¨ğâßü.`ÓÎƒFˆè¾òç-M‚Ú·nŞ48ÀÑÁ®{§ğ¦O¿ZXìáæüÎ¬I=:…Ïx{IÙhm\'û¹¯L?¼ßåë·bSD\"áˆ=Æíóú‡_9u¡j«;\0\0€™ƒX°¼«ïó!Î•¶wõ°éêacây¥Æè)¿ûì+Ğ-¼”¹7¥€±x†—ZI,ĞÅèf·tÿøb¦ÎÄûØˆVDøÑ‚ö^›âsßóˆğ´%¢÷Ûx.¾’µ¾w mèx$£(£Ä °³Zº¥•®©Ô÷ªãáÄèúÙ‡8Ük¢Ö2}}ìümÅ1ºNu;±9\0\0XÃ0?ïşW,ª8F˜ásóï&Å‡ÎßÈRÔ¾»J¶{…U1E¬HÀş¹½oQ·¥=|ú\\Ë¹Ì2L\'Ïˆ\\JmT;Jœ}í>¿ğ¡\\$—°x#gü#fı«áom‰ıÕUê^6á#«ÕØ­¼‚ÂèØD\"òñp-Ù¡Aş\nU^Y¦š”’ñæ‚åÏŸÚùcAÑİ‹ôó^ğÖô1‰—®={9Šˆ\\œæ¾:qâ˜!ÑqI¿lŞõ¿–¾ôôˆIã‡íıçäÖİÿØÚÈS3²sTù{ˆº•ğé;¯µmÕäóïÖ§e*„661ÅÜíîâ´ô£729~ùÃ‰sWˆÈÁŞvÖä	Óu;5sÙÚß‰ˆç©R/n;[9•TÿàWªòuz½§›‹P(\\¾v“\\6kòø©Ï\nk2ù¯Şˆ%\"¡@ğÑ›Ó^;thßn¿mßo¾ãGôØ³óº?ö¬øqsvN.uo¾ê³ùïÍ™›˜’’U›û\0\0O\Z{±`YWß›¸”ßøWr¾ÖÈ	r±Œ€aÊ²k…Æ¸51o]Œê¢RMu“]Q¾Şôk¬ê“Ş[ú:P¾<¹H_6ÉYŞ¤ĞÜİ¥Ò\Z‰hu?¹]©È×Õ8IÛÃqX47xˆƒD7İ\0\0\rJ^Ñı_Ô^OHóvuj\\«¹6ªLrfSM7°3ÿš8ãÈÆÎer•»·p\rÛ³^kÔ4so©PgæjTFP–Kg§†85Ñ+”Ãk;9JrZfaqIë¡ŞnæØıztlÕ¬ñº-»ÓïôÇæy>-SAD&§¿3æYÀ²ÓéæêôÔ”¹ey¦*¯àËUúFt9 Ç/›wÅ%¥^¹~kÒøa7ã’Í¸YaqIäÍ¸´Ìì¶­š?s¹Ò,â#õ´·³™úÖ\'\'Ï_5o)(,^¶æ÷zôëÑÑœ`3™{˜ÿfYF\"›8®¦µ¸ôzƒÁh’I%1jV­ÑÆ$Ü&¢M;\\½ktm4™şÚwlÊ3#–öIhÙ4øÙ§8õ½%«ÊŠºp5zÍÆŞšŞ²i0l\0\0¨JÌ2+ºù¾Z!»^p)sY¤BÀ0K#³Ã\\d.R!CÄñ”V¢¿‘§/Ğ©ë`b³J–E*&…ºõ·1Ôå×XU£ß£æ¶öøáfã—\\Í6\'«K#:¾íæ¼p/®fëLü‹¡.Ï5vN.Ò/»®¨‹t6Smğ’‹ˆèVŞ*;%Sı(f_\0€GãÀ¹ë˜`WÅ2¬Ö¤ù#vC_ÿANç>}}mÎdœ †Œçyó’]eÇó÷¦ûÂÕè#\'/Œ\ZÔkûßGwf\'¢!}ºÙÛÚ9uÑ<\0»<†aLwºd‹Å¢A½»r&nôŞ62™y#Çs¶6rãílm\Zùû$¥¤‹D\"\"	U«X\"ª:‹øÈ½ˆhpï.=:·1_)O¼\\fog£Õé„ÑdbˆaY¶Rş{/ÆÜ™q­ìBLwîòò\'š\'c“HÄæoC\Zù…4ò+(,zcÚ³rYi4ƒÑäGD¡AşGO]Ôh­¿T)\0\04\\ÑÏ½«Ø3|æÉÔU7”æ‡M®Òx)G-¸ó3rµ^úò¡©Ü¸C‰††üÜ+@*d~ˆÎyídªy—ÆÈ-¾|÷­ñ5•æ¹ÃÉD4½¹ë·İü„,3áŸ$•¶ú·ØiÊ±Û[ÙÙ.¡ÄÈM9vÛŠ!\0@CQ9ÁæKDŒ]åw®N.óÔ”V3ƒCzúö»u:O›#H“\nã]eîöb‡´âd–)MY=m|¢s®K…â\nÅ\Zkû”Ê/(:{)jÔ ^á-Bw8î`oÛ$8àÒõ[ÙJUµÇ—å¢b±H&•°öÅñÃ8ÓİÄ•ã8ø˜„dóøíJìílœì²•¹U\'âvuv´•Ë’Ó27ò%¢½º°,k®ÎÜÂœ›_›Tº…eönbÌñzƒA(ˆDÕ¿ÂHD\"¡0[™[é}Da¹ïeÊòv™TBDÍB\Zùzy”ÕÅ0ŒÑdÊR¨2³sÊ2v\0\0\0³ñÁN•²ë¢s¾»¡,¿…ãé¦Õ\\Ui\"vÆœÙä»¿ç\Z;=”¨ĞTŸ6{ÈD?÷òäç`àø¾»bÏ+êdin\"Ú—Zø[T/o[‰àArl‰;–QœS7É?\0\0<;µªå‘•Ó?£B&®’`YÑµœK§ÒæÖvcôj£ÚVdW ËWKÚztŠÌ¹,dy\"ây~LÈ³_]\\h/v(Ÿ:ò\ZQ—£nEİJèØ¦E Ÿ·Ÿ·‡¯—ûÆ?÷)Uù÷>‹aøÔô¬9.-ß@Íñ¼Ñh**.Qªr‰¨Ò,qƒzuÚ/bé¿]‹«TàÔgG6	xé…æÌ¦ÏûT,•/V¯7h´:sNË²¬€P¹d¸¨XMDeíÌ•øxºK$â´Lg°CÏó•\Z½+EË0Çñ[÷Şºûéfm†atzƒ@À&$§ÕÔ#\0\0X•Æ]Ï>•Z~ù«ú ®@×sWì_ƒ\"¼l³_û!:gkb^T®Öü‹CŒŸhj3×éÍ]‰(¡P7æ`â5UåNmÖ•£5nK¼Ï/\0\0ğàd\'¯v’3ƒénËe«`ßZö§ª	¶á¶­8¸òŠBFX Ë=’ºoa·¥×•—¦	Ä<ñ,1¿ŞX=¿ãÂŒâ´+Šs#˜öº‰3Ë<U~\nq\"2ÔjN³ØÄ”È›qã†õswujÕ¬±«³ctlbµíÏåiµ:ƒÑ$.^‹.¿]À²Ãúw÷tw‰ML!\"s[–Æ†ù÷èÜfİ–=UwµkÖªYc–eSÒÃš…\\¹S~n¡@0~D;›[ñÉDÄÃ²Lù.â7ã’\n‹J†ö8~ærfvNÙvsë÷‹ã‡Ê¤’ÇÏš¸ÒÙY„ÕõZ/í‘~\'&­VÏ²Lz–âJTLùÃ<\\§¿0zÓª¼‚{ß%\0\0xÒË(\ZìgODû\\z}Ë®Ínåk[ü=­™ë„`§éÍKsé½‰ˆÄ¥ÏÇÓÙ%[ò~¼•Sl@w-\0\0°ç\'ïQuûÆ§³U¥Iqÿ-,Z¦«rÃ²1[^MÅÄK…ò«ÊKç2OíKŞ•R˜$a%DÄ²‚­±¿}sùó—Z¾òCÿM«únhäüÚ‘‹\r•Stİ-ÇÚÇ¤×’R3D\"aX³6-CoÆ%›\'\0«Ï“9ï5Œûö÷ñ3´Où|½İ¿ü`ÎàŞ]Íß\Z*7PœãyÎ`^AÚ<z¹l5i†a4\Z-CÌC\'X–™úì¨òÅº89¼=óÅ¡ıº›¿5™L1Ï•­›½ÿØ™ç¯ôè0°gçŠó=:·Ü»kvNî‘“¥kñ<Ï2ŒfC57—-ı—”›˜2´oD ¯WùÃ3xÆÄ1nÚ(\0\0\0ˆhy¤â«kÙÇ2ŠæœJ[Q/³k3O«£s†í‹÷Ş9ùØío®+\"UšH•æ›ëŠÉÇnûlˆ´7~ùu²k\0\0°–êÁ&\"¾t{«`_‹²kªÚ‚mÊ›òÄ§Ê’…Œ0¹0qş‰×JEv’»İ¿…¬ğ×èÕ“wyØx9CRa¼Ö¨0\Zc*‰QeÙšÿ½2r@ÂŒ‰£=İ]?şzM\\Rjù½æ…»P 	òsr°wv²OHN[½~ûàŞ]?|cªL¶~Û^\"jÚ8páÜéûëÖ½æsÓ2éYŠaı»8vV£ÑvjÓ2S‘“WPHD‘Ñqc†ô™3åé÷¿ø¾e“à–M‚/]¿É0Ì»ÿygöK³§<-\nW­ÛJDA>çÎpt°[¾v¹894iäåáêho×$( )%]o0êõ†ßÙ®U³·gNrwu^·e·B•\'=húclä²Ù|•“›ODÎöb±(¼E¨P hÖ,=K¡ÕêM&S€ŸW Ÿ7ùyyØÈeR‰øZtÜæ¿¾÷úä/>˜³ø›ŸÌİÚ\'Œğê¤q\'Ï_K¸fÑM\0€M.dk3Ñ·ãçMñXE‰‘/1\Z‰©~â•ÿÛ‡˜J\r\0\0êˆ¹ÍÕÒ¶k3Æ+|P¥M²ÎÙòÎÙÕÍñËT}0™8ÎDÄXAùÅ‰ˆçH}ÚS{ÑİÒÈ¼5}Ús£ôzÃ„WŞ=WnI-\"\nô]ûå{ö¶6.ÎB¡0ñvºD,ê1úe½ŞĞ¯{ÇÏŞ}ÍÇÓıâµh£‰óñt‹E+Úòë{Ì­ÁB`Î´gŞœş\\z–Âdâì>şzÍ¶İ‡&“\\&]·ü£ˆáQ·<İ]L&ÓÄÙİˆIäy¾g—¶Ÿ½;3Ğ×ëÒõ[z½ÁËÃÕV.[µnÛ/[v;9Ú}ğú”^]Û‰E\"±HTT¢I¸½|í&óŠÙƒût}wÖKÁ¾·â“•ª<¹\\Ö®UÓü‚¢Ï¿ûuãŸûÌ!}ñşìnÂ\\œÅ\"QAaQn~á¶=‡¹üçÚÏµ:½‡›³F«ËÍ/<ôï¹÷–¬²·³™=yÂôÆäæÄ%¥Ê¤’Ğ ÿ«7b.ûñúÍøšnæùƒ[-½ÿ\0\0PÏM8‘vZyÿÕ;±ÔÑ¡~ÛcwÕ¨Ÿuu“oéîû¸£\0\0h¨\\ì¥ªÂû%.ïëß÷›¿Ô¥•‹½MM‡ÙÙÈ~;pft¯vFƒÉÙÁV\\ÃÄÕÕª&ÁfåûI·XWc‹¹%8µ `KcÎ’1Øf~Ş]Û‡e)U®FW\Z€mokÓ6¬©P (*Q‘½\rñtääs¾Ú²ip¿O‹&A–½›—”’”’Q~‰/gGû°æ!¾^:½!)%ıZt\\ÙÒVA>ıı¼²”ªÛ©™åg>k\ZäëåŞ¶U±XtıfBBrZ|rªZ£•Ë¤ÍCƒœí4\Z­Ñh’Ë¤&»›¤På‘H(ôójĞ­c¸¿G~AÑñ3—ã’R¯ßŒ/ëLŞ¦eWGF«7¥‰X$LÍÈÎTätëĞZ«Õ—h4b‘ÈÎV©Œ¼GDvM‚š‡4\nôóV¨rcâoÇ&¦¤ef—\"^	l\0€ÿC™%“ÏÔ»¦éú™ÇR}\rl]WŸ¾5ş†\0\0÷öÀ	ví=7 ³§«ã«I¯@|i\0\0 \0IDAT°‰HèWä0&ÉÒº«U¸3Àä`•¢à!Á\0øOú2:gÅ­ÜÇEõ3¥zØëÍ\\Şl†ùS\0\0Ü£H°vöt± Á®¾±Û˜j§>ï&ïø°S¡¨/»\"»\0\0¨#s›»¶q–­Ë‹ÌÓ×b<6Ô¶B6ÜY:­±S´]\0üçTß‚MDŒˆ“õÈµzğ÷âšëÎêÃ>DVègNwV·z°smä2†¡â’\Z×ÌdY¦¦şÕ\"¡Ğ`¬~qi¹L*`Ys7u‹8:ØÉ¤ƒÁhäìá	XÖF.Óêõz}å5ÌÍĞ‚\r\0\0\0\0\0ÿ1–¶`?5×æ\r¬ú¸7iYY‡çk?Û|°úœ»æœ‡µ²k*·ô(?\0»Z÷½\\SvMD÷]š»&ùEùEvnµLWX\\bÅ\0\0\0\0\0ÀR÷œÍÈªOyÒmí†&“¨¶%òzAÁö Suëi\0\0\0\0\0\0üWİÂqC²}ŞºfÒ–*I³|cåõ±Ë3åItÑNÚ(g^cÁ<æ\0\0\0\0\0\0\0ÿµÊ„ù‘æœ§öª«ÀQ/ğT‹ŠDnZÆÆ@D\\±È”#Ó\'Ù™2S¾˜×!µ\0\0\0\0\0€\'‘ù0¯\Z³…Æl¹îškİ\0\0\0\0\0\0Ğ±;\0\0\0\0\0\0\0€ÿ$Ø\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\n`\0\0\0\0\0\0Xl\0\0\0\0\0\0\0+@‚\r\0\0\0\0\0\0`H°\0\0\0\0\0\0¬\0	6\0\0\0\0\0\0€ Á\0\0\0\0\0\0°áã\0{éã\0\0\0\0\0ÀÊê[¦ƒl\0\0\0\0\0\0\0+@‚\r\0\0\0\0\0\0`H°\0\0\0\0\0\0¬\0	6\0\0\0\0\0\0€ Á\0\0\0\0\0\0°$Ø\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\n`\0\0\0\0\0\0Xl\0\0\0\0\0\0\0+@‚\r\0\0\0\0\0\0`H°\0\0\0\0\0\0¬\0	6\0\0\0\0\0\0€-=¡eÓàIã‡µiÙ„ˆ‰ŒıuëŞ«7bë\"2\0\0\0\0\0\0€„ñ\nTû£§<3rÁ[ÓY–)ÛÂóü’o]ùó–:ˆ\r¬&áìîÇ\0\0\0\0\0Àœ]Äûuï¸pn…ìšˆ†ygÖ¤aı\"¬\0\0\0\0\0\0@CbA‚ıæŒç†©v×ü×^´R<\0\0\0\0\0\0\0\rRmlG»ÖÍCjÚèëíéf¥\0\0\0\0\0\0\0\ZZ\'Øöv÷>ÀÉá>\0\0\0\0\0\0\0ü‡Õ6ÁÎ+(¼÷ª¼‚A\ZòÁÆÎî¼ógÛ—?š0¢±üzõÿ}Ûûc\\+Ÿ*p‰øeÛ‚}a-‰|g¬ùnMwÛê»Ñ\0\0\0\0\0ÀZm—é*(,NIÏò÷ñ¬v¯B•—¥P=L»×,:•obr\'ŸN‡¼ûu‹à÷–|¥æ¦P\0\0\0\0\0\0€GÅ‚vâÇÎÖ´kß‘Ó¯ÎL¾~3!2:öì©£ß,øì“+Îfõ=\\©\0\0\0\0\0\0\0Jm[°‰è§M;\'&U>Åh2­Ù¸ÃšA™rl¿2gQ»{âSy§°AoOë×İß†%mÚåƒŸ.ıûrO¬]û±çní/#}NÂîõë¾9®àˆˆX—öO­Ó»£»¨$åüò%ëw§È¼½íS+ôêè&ÒdEm^³á§KùF\"¡S‹I¯{º£—-iS.Y±jÏÉ[m¥B¿¡¿´êıİ^ß«`İS\"õígÎóTg‘:óè£yĞ¯\0\0\0\0\0\0ş,ÈSÒ³–®ù­êöoÖnJJI·^HDDºŒørjâ\"dìZ½ıî0ŸÈ-¯ÎYğâ‚=É¡#Şâ)$²	›ğÙÓîçW5qÎÓĞÙ“¹±DD\"ŸÆ¹_XûõÄù?îæÚÍ›ÑÆÅ|‰\"÷ñÏ6ŠıuÙóo,ıúªÓÄf¿(\"±ß”OfOöI^½`É¤÷¶œs\ZøÕ¢‘Í¥TS¥æò\'Î”rü‡İiZYĞ«‹¦^X8ÑŸÌí6n´›/,\0\0\0\0\0\0à¿Ä²„pÅO[ä2ék“Æ³,CDÇ¯^¿méšß­gĞèH 2	w`ë›ÎÅi‰nş8r®»\\HŒØŞQfÌ»u31.Û—úcIF¨ÖÀˆ4G¿[·ñ²†§¤Ÿ~ï:jF§ğ|>‘éÊk¿?‘o\"Š_³Ú¾ÉÂGî:Ñg¼wòÒ¶e›ˆ’â>¥ÆßOx©Õşw’ª­”ŒDŒÈÉöÈ¢‰›ÓôD¶m\'ŒpMZşîÎCJQÚ²%ò°Õã¬~+\0\0\0\0\0\0 A°,Áæyş³•ë¶ì:Ñ!œe™“ç¯Å\'§ÖEX©œti\ZŞ˜suİVïƒ7ó\ro$*ş‡â®ìÚ”2ëı5Ë&ÇÄ\\Š¼qäèÙkù&VFdPE¦éy\"\"âF±æI½\rÊÓ·ŠLæÒMy¯ä½Ú60Dá#Í:wIugsnìñtÑø&ÎÌ…j+5š}àT¦ˆHàÚØK’}12¿ôtcÎ­ÓÙÆ6uq;\0\0\0\0\0 Á:u=gÅ¶˜ÜBİãäş$¶n_ˆ‹½hÖHŸö¡OâBÎÒ¥9ñvzâm+÷	¯ˆ±	lêKÊíÙ¡gÏåËÇ»_9´õÜÙ“»w9L|gqE±ßÍıß– ĞN­›w¹l\\ÿmï}²\\ED<Çñµ¨b«®§e>SäÙó‹ê*%\"2©%\\ÙÁ<g0”ÕÆsS-ª\0\0\0\0€\'ÉÊ­1E™ÄÆşqrºb%Y#¡Q¾İ™¾nnS+”ÕĞÔj¶€e{umçæâT¶eÔ ^Fô/ûÖÉÁ¾_÷\"¡uF 3Rß±Ï¶Ç>›ÇxwëÓ¦àÀ;KÿÚzìÚåµÌÆ\\…À«ûØ¹#½Knìİ¾õ½¹Ÿ~“ìÒ§»—ô…ŠÜ»5s(][`ÖÊQ};9.&]ëÖÎåÎf§Ğ>ÆÄØ·ê+-Å—æ×&U|ºÎ5$Ô¦4Ogm}Ã=0»âuŠ˜kW._¹r5V©Ãk\0\0\0\0°¢œ-Ã\nù\'‰2_ÿ¸ïúãqÿ„°Cxó/?˜\ZäÿÎ§ßşºu/5ô[õÙ|\"ŠŠI¸“HD}#:¬øä­äÔŒyŸ¬<yşªåa0r¯ÀVÍMŒĞÖ-°ÏSÃ‡ù¥¬{&ÃÄ{”h·–ƒÚ_?%jÜcøëÍBµ»‡,)_ï6è…Éõ¦í7‹Ä>ízzšRvßû3dÃ§¾<ÓøçßÉ\\`¯±³\Z+7¯JT¦ªÿÈxïõwÇk×ˆá}‡N~¶­òè”È­sµ•&¦U,±8úÀÜùo¼Ü%éÛ³Éä9xê¸ö&Òò‹‡ÇÏºıı™Rˆì{¿»:,ôq‡\0\0\0\0ÿ)<Y¥e¸Î5”8ë±û$Øƒzwùá‹wÍMÓ}ºu0\'ØÎN¥}lä2ó½»µ#¢@?ïMß/ışW;öµ4ïá/?œˆˆ…ñW}¼|ÏÁd)ÿşmÛ©/¿ıöDSaÔ‘]~¯[ôÊØÉ!W>¼°qî¦çßzñQ¶D%Y§v­^r4—s¯¹Cöï?GùŸµÁGbÈ‰ÙºdùÚQêOï¯0¾2áõÅ½lI—réĞ›Ÿî¹¡å˜\Z*]˜W±LmòêÖ°sÆÿ²ùE±!?òèÉª^–^9<~|ÁùŸÿL!\"ß±¿ŞÍ‹­A%\\aÔ]•ÕÓGò¸\0\0€†ÅÜ¨û¸£¸¿†g}Æx…ªiŸ‡«óéİ?Ë¤¥¿L–¨5-zOĞë\rÛ´øëç¯ˆhÔä·Î_¹Á²LÔ‘-¥CØ\rcÏ1Ó“S3AôPK	gw?îê1]Â¯¯ÌØ’!{uÍ¢>¢ÇÔ7†ô]¾ºòš¸I˜mld¦Ç°%«^	·«:ƒ\0\0\0@MúÎúGbc…ÉÃêš®DiÅ8ÿ^ÒÚZE5 ÷jÁ=¤wYvMD6rY—v­Ÿ¹\\é°ğ¡eÙ5‰DÂ1Cû|½z£u…º§KømáÊ³y¥cÌ†eD2\'Ï€¦í\"úölá&®6£0)-[²#Å tëõæÛcªd§ºø\r¾=ŸO¶a/¼;½mù¬DıãGßEª%M^ZğjéÒ\0ß˜?Ò·ÜÏ¦IyxùgŞ6ÈšO_4£¥ü~b,ˆùwÿás7’³K8±½GpXÄ ä5´Lë’÷Ì \"§5Ö\\¦©8áÌácg¯\'fæiX÷€æûèŞÌYTş®<dürÿ‰LEñg;•”•§al<[tèÓ¿{sç\ZŞÔ³ÏË¢êÊpê”Gœ¸š•WÌK½‚ZuíÓ¯S ­ Rá–„gLß³dé“Cç™¼Ğ¸\\5¯ŞğñÊH÷á|öjgYâöÅó~Zôe“Õõu”¯…»{Ã°;÷À°^#‡u\r#\0\0\0*m\Z~ÜAÔBC‰³»W‚íçãYiKÏ.m«&Ø}»w¬´%Ğ¥\"®85*6N]qãkgïZ·¶ı”óÇ6³©œ-³o9}›ˆâU{’†½Z¹ï¬©èöõØ8-QÜ7»?£Åİ|ÃT˜|=6#a^YZ{\'€Ü–\ZS…ŸM^§ˆK%’ŞY­FFÅ©ïß[²7ùîqQWÎŞö{ø´%®&İ1æDFæi¢şÚ“4²ê%§VğÅDCÙ–è«í\\¿¾ÏœEÿèWvÂCÆoùı7dûîƒ¥û“ï¾ˆ¾vñèÎ_éşÊGo\rk\\õjëÛçeQuæ:ó.ÿòñ§[£Ëİ¦ÈË§lû±ÑùŸÌèî^.\n‹Âã´™7oÆ)Hæ]\\1dFŞ|òÚC“K¿óé_c*Tİ§Fsıò‰İû,XúzW\'Œ9\0\0\0€†2¶¹¡ÄYİ+Áf˜Ê¿Ÿ÷éÖaáÒ¥’ÒßÊímmˆ¨gçv•c«Y\0\Za£^ÃÚ9ˆçtE™±—ÎÆäQŞÅŸŞ\\ ^»xdÅÔÆôcûo—~{lü”Ğ5Nå®Ü¹tÇ ïŸk$®ËĞé»|º7™\'x†wohÏ¦^ù÷J†±äêÚ¿¶üá•æ²*gÜç¸üsßÌY|(‡ˆÈ&°]§Şr£2îüÙ˜<Ê:òÍ<‘ÛÚ7ÛÚZõ¾–÷ß”óïW³¾8ODdÛ¨}Çæ^rƒ\"îâ¹˜\\RøşÍ\"úîÓá¾›¨ëİçeau|IÔOo¾ÿg*‘Ä§u—ÖşöT”uşrŠÚ˜ô÷â¹²å«\'7•YñÃ(>ù¿ñŸ\\¯~Ÿÿ´µ«Æû”ızçS#âE×OIRSöÁ¯~êµŞÚ?\0\0\0Ğ\05”Äµ¡ÄYY¶¬Thÿ¦U‹ƒ|Ìß.ywft\\RÛVMê 0x|ÂŸzizÈ¶M£òäwo.8 0Dıüİé‹{:İM)‡ß]=ÿäß·¦¶¯¹CpÊæ•ûû~1Â³îÖ23¤ÛËQğ´ï–÷7\'kÆÉ?š²ü’.çĞ›/6o[1¾û]_|uÍ²C9DdÛyÎó‡šÓ7^—¶áëßœWçX³÷éo\'øZóšjuÿùüÓ+WÏ\'\"‡nÿû|î ©y»AyêÛ·ı©»úÃ×û;|5Ü³\\¿éz÷yYX.vÃ×¦‘¸åäÏ>zºYiÏq^¿õãÿ­Ògl_slÄWƒİK‹qÅOÍôÜßïL^e*:÷O¢¶mXå×:\0\0\0ğ„±`ò0±èÕÎ]ŠŠßÙP’v§\'ŸÄÛ~é3ÂÍ«sO”Ô]ŒD˜äÌ\Zîõ«hjzVÕ=»´õóö0ííéÖ¯Jÿp\"JJÍ´JpPİºM{s é.î¾”[îœ.ùŸ²ˆÈqÀ«Ã=ˆ¨øÌ[Å÷*Êıã\'UÜ½y8Æüô\"\"‡Ğ–eM¡BˆñİlˆHw+§Ò(ëû]§:óûáB\"²ï?ÿ­;Ù51ßş3Ÿ\"\"J9zVq±Û­úûoÌøç·Ój\"röÎÿÊ²k\"¹u{íƒ‰şDÄİÜ¼;QW®¤ú÷yYT_pù÷=ÙD$íôú»šİ—ÍÈ9Ş‡ˆøèı×òëè‘`ßvğ¨‘£*û3vP3;AG\\Ûvõ\'\"*ÉÈÆºê\0\0\0PÚ2\\Ë?Däjûb ÒF‹\n©H÷jœúyó®Fş>]ÚµjşE²\"3¿rcõúmÖˆ\rê	FÚ¯Íc%|ò¥Tm?—Òæ8]ÂÁ£J\"rè2¤GÛ?voÏQŸÛUÔ¦su,û\Z!Ş¹+^sîû_®¶¯³>³\"\'?G¢*8ôí/Í_Ó½¹›”!\"YÓ)‹?XBRw×Š?É÷»^süGDnıG·ª³Ğ£ïœín«y©_•¡éÖUÍıçr/O&\"ò1ºyåêÅƒ\'´Øøå\r^qæTÆ¤F¢Ú]læó²¨:MÜák:\"²ï1¡Så¥Ô„>Ãç½ç®%Û@1OTÑúö›ôj/‡Z—Ìëµæ!û¬C°\0\0€ç©¶-Ã<Qa&ÚÓ.<&ï¢Ú|:ÿhZ—+Åéç&”Õ4Ón\Z=Ÿª¬Ëv§â^	¶V§Ÿ»è›G\nÔ_\"÷`W:VBê,•\'s;®&îïyDäĞ©o}\0ÛÉiûŞ<íå½W\n;õ¨&\rù™õô¥9›Ò|»iØªiMkûKDº¬›—/–>lR¦Öª;ŒĞ§ß3·}u^cŒÛõõë»¾»5kÖ¦M§ˆ.­ÚVEü¾—`Ì‰Ï4‘Ğ?Ì³Êà`Ö¾I÷~ÕxàøkRåşë7³‰ˆì›µr«úo˜±kîE72(ûfšJìúøyYRQ—ª%\"¦Qû\0ó^^§ˆ½q»øN“·ÔŞQÊˆØªO«÷ÇDîÚŸFDäâ-Ál\0\0\0¨}‹.OD|æåü„ç#Ä7ê5|¹]<±rñĞAö#B…2‹¿VôÃM¦i=Úı\rqÁ¬-Ú\"<:º~İ‡~ı^u¨€gdÒ·^±ÏÿC¹6­Öé}¹•ù¦ïg»‹„÷ÿmÆ`ä_Y¡xb[­Ë{DÃ+¡acE6æÁ¥œáÎ[)õ­½§\n‰È®cŸ`I\Zõêä¸w¾şÊî+ùİ{9UıGÈHƒ\'Ì|ğ}ª¬?—íøí—š«+>³zÁ™\nTàÖ÷ıeìºïÙqMÉé•ñÄ_<²}-ãÙõÅÿ½16Ì±\\–}ÿKà´Z\"\"©ƒÜ’)\rªÜNcLî\"¯®w‰@æbCDÄ«‹4Ù²T_?/ª3©sJˆˆäN¥k£qy§¾ywUr…£D?ÙöqûŠãÊ­óqD1aÀå¾xyıÊÑ^w,T‡¾x3JÆoR+’Ò‰ˆÈoà FU§¥\0\0€\'­ÏæÖja×MÄ8‡!—•ÛwNåyçÔ¯°øûõºBÉĞşöosÆù‡ô	QzÓ`‰¯Pm`ıDîN‡òy‘‹$Ğ¤_­àj_yù85:~Æ7ÙßÏv‹îÕ\'Ooà^Y¡Ğê‘^İ{6@)Î Ö‘¨´“_õ÷¹b\"b¼¼\no\\¸tñz¾›§€ˆŒ×ö^¨a-c6if7\"JüíÛCŠ:\ZÚËÈüû¼òÙú=¿ıdÎKcû¶oì, \"â³N¯›7oS¹1Éµ¹F(éKtÕ„Ëiòr”\neN~u;­ªÊıgÄ6b\"\"C±¾ºº9C±ùB…ÒúşyÕ¾:ÖüÿºQo¬Ÿÿw§ÇÇÅÇÅÅÇÅßÉ®»ÌúxÜ£š†\0\0\0ê5K‡.óT”X´!‘>HîÁÜİ(õµl§]µ»øRš!.¦øû¿Ôl+Ûfb*IÓ$‹Ä­Z9›Gr>A1Ï¸ŠDš$İƒ£Öêøÿ­VêôÕ¿àyÒéùÿ­Vju<Æ`›¡jÁ LÈ!\"²÷vñÅ×w—‰]ÿéûååoì=›Ów˜{u\r«ŒC—iÓÂÏ/¿jˆ\\³æÌô\Z—Hvyê›Ÿ_\r)×ğgLÛôÚÔŸSïfÆ±GRuBÏˆQı\Zw\ZØ¸ÓÀ	DFUô•‹VŸ* ¤¿¶İ=/\\VëK:ú;)IŸ§2¶¯ÔŠ­OŞ4{æY$êøñ¦Åm­ÍVéş“Èµ±+M!ULb!×¤Ê´ÙÚ´èl\"\"‡@O)SÛ‹­ª®?/‹ª9:å.56×ØV.$x>µjÿS¥—‘{ğÏ~S‡áÙµĞËïnoo‘g¨M…{vw™.\"V$wëÖ­…;º‡\0\0\0O´`—o2=X8ğeû‰MÕ+óK÷8ùˆìm…¼U~‰c-]RéNç8ôõc¶éÄÁ¤ûíÓ²ØI`jÜˆM¹¤+®mvõqæ\Zç­Q|1İ]\"ªü«ŞÈÏ[£È-4ÖÍ$8\rl¸?uÂáËÅDÄ¶ñ‘_peÏE]MGÇì9£<Ò³Ú‰ñî}g=·{Êº„’ÓßmX»QÔ¨<³yã5yñ{Şt+ti>ü•çZ•@%i™j>\\ÆÔöX‡&m=).‹ÒÏû¼ùU¥¹ü[W³ˆˆ¼[ûÜk€²T¾ÿDB·¶íİ(EI±{göëSáß1—{açÉ[võ¯ÏŸ—EÕ±-ºøSl\n¥î?pû©)Á:^óE·Nİ¦:å7pÊ¬{MrVq™.\0\0\0€\n,ƒ]z¼I¥şéŒÍâşö-wßİÈ”|½¥¤|w¿¢|L¦¨›¦§CÅ®…bûuJ“igÓÈŞØÎÑtæ6ÏÕ¾1¹ú8e¾qöÊìog»‹ÊÍßj0r³W*ŠÔ&d×å¡‹8Ü_|mÓò}D$ØÚ‘!âó.ì½f$\"çá+wì?ô÷?;¾åLD”°ïß¬\Z\'ù˜=Î“ˆtÊ\ZS¾%ñníGD”¹gdq¹ÿ\Zx]V¢ŠˆHhkonR¬í%ˆü{\n \"Jûmùíİ2ùÂ+¿ıKDäß»‹G]¾§ªzÿ‰ˆÄƒF%ü´t{¼¦ÜÅ\Z²şùö»:\"ré?º•­[­ºü¼,«NèÓw|[emşrÃµòŸ/—î—ïOkAx\0\0\0\0„·Èİ¸Û§ósòÉİD\"8UªA-ÊJiJCšÒÍHÆ÷—¹1<ÏóŠ8M«´cSa^¼¾D­¿V$èÔLêW¢‰*â,«½†˜\nKLS¿Ì4K3{ƒ‘›úefa‰É<ñxM×ñB6TqgÖeŞ¤É½}õèİ×òˆˆüÆNíêÌq9çöD™ˆÈ½÷À ò-v’F{¹ıµ]I)dŒè_Ã—4ô™™½0ßê³®Gw–}vV“»ïíY#Fõníç ÔªâÏïÙr4Ÿˆ¤í5·!²ä„~Ãf\rİûÖ^¥ñÖÏ¯¼\Z5zxÏŞ2}VÔá?·_È%\"Û/öµò¿¢ûÜ3¡ÏĞ7Æœµ5ÕxóçW¦]\Z>²w˜¯§Š;½çÏã)\"rê;ëù&R‹.¶úpêîó²°:Öµ×ë3O[yE—²í­i·†<5 ]€——xñÀ1÷\\ĞÛ\ZÒşY·*¦|oiğgúa„5\0\0\0Ô†¥-Øw¾àµºmû4İÆË$¤\'´iE‡\nÜ§±çh2XQïöMsr×ê‰x2ª´‘&×áM¹£g8“‰n¥Ò„®2ÕE¥e+gİ3N½^[½b¶\'Í^‘­7XRò	6TQİ¬Ë®½æ}ü\\ˆ„ˆLŠ³GóDäÙ¿o@ÅôBĞ·¯çöÍY”~ğHÊÓ“‚DT-Æ.|ÒkN,>§±väŒs·×ß>ÿƒİ·ùÜ+»~¾²«ü>ÿaïÍpb,¼Æ¶õ´%oÎıêD.ŸuşÏµçÿ¼{°0dÂÇ¯w®ıÚÈµtïû_v=ò¦?ı èíEûÓ)÷Úî_®í.·Ó¥ëì/fvrd©~^–V\'ô\ZôÁÒ’Eó~¾RRõ÷º¨¿Ëåì.ÊUèë.¬ÂËûşº\\~Û®Í8$Ø\0\0\0P+´è–M~çø‚˜üÉÒ—yây^¯ß¶!‡†;N›d\'%.åzÁg{5…æFe½áìm~@3}¤ŠãyÊL0P{ñõ›½%-É÷³°ÄøŞÚlóè^-$ØpObGÿfz?²«¿Ü¼4tö©}qDD~ƒúúVÎÈD¾½ûûlŞNYG%=3=´¦©¬sÄô)-.~{£Æy³ëØiÆÊşŞü×¡³7•\ZHæÜªKÿÑ‡»›ãµôÄ>ßş±YÄöM{¿•^h ’87jÙeĞè§‡…»‰ëöÿ•*÷¿<¡[Y«6tÛ»yÇ¡3QI¹z\"¡oóıFLİÅß¼Zy}ÿ¼,­‘‡]¼¡ÍÑ?şØsìRL–šc¤.Áá=†Œ\ZÛ‹ıuÒ¼ƒæ\0\0\0\0€…jß‚­Ó­ü,½Â“éÈºô#eßh·lÌÚRÍ™\\ôöŒ§ï|S|3çùë\"N&½´MÙuõ¯ğA;¨s	gwßÿ \0\0\0\0\0¨/ìË]w÷§WçX1Î#«;Y«¨-Ø\0\0÷fRİ¼íR®‰H\Z<òùAşè\0\0\0–i(ëB7”8ë1$Ø\0\0÷fÊ¿ş÷Îİ\n\"vèô4l\0\0\0°TCI\\Jœõl\0\0\0\0\0€:d^ÊêqGq\r%Îú	6\0À½‰ƒ§ıö÷´Ç\0\0\04\\\r¥e¸¡ÄY!Á\0\0\0\0\0¨C,ÓõX5”8ë3$Ø\0\0\0\0\0\0u©¡´7”8ë1$Ø\0\0\0\0\0\0uÈÅAR Ñ3¬èqr?ÖkÁvw–X¥œ	6\0\0\0\0\0@š;5ìË#Uy;Z°F~íî,™;)Ø\n5@H°\0\0\0\0\0êPö=Ú{>î(àQ`w\0\0\0\0\0\0\0\0ÿH°\0\0\0\0\0\0¬\0	6\0\0\0\0\0\0€ Á\0\0\0\0\0\0°$Ø\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\n`\0\0\0\0\0\0Xšùeã\0\0 \0IDATl\0\0\0\0\0\0\0+@‚\r\0\0\0\0\0\0`õ,Áf$A½†<×ÑYø¸\0\0\0\0\0\0°H­l¡P0°W—UŸÍ¿}~÷¦U‹…AÙ.Ë®_±àöùİ?|ñî€ÅbÑCÃÈC†~2Ñ_™X`|ˆR\0\0\0\0\0\0\0=Æ+|PÕ­,Ëx¸¹¸:;vo1°Wçˆáå÷ş¶}ÿüÅ+8gfÉ»3\'R~ïÉó×?sşJ´B•›¥PY‹$¨gÏi\'öÆk¸º¨IÂÙİ;\0\0\0\0\0€ÿ¸êl±X´xş«Ï®fÏóÃüøû_—şøşëS^~ş)ó–ªGnÙuè–>Tt·g—L6~õÕÙ¦‡*§<‘ïŒïŞi»aşôÅ¼Õ\n­ï`\0\0\0\0\0Ôµê»ˆëõ†Ÿ7ïÊÎÉ­ºËœKÒçÍÏÖ·lK%JUŞ/›k—Ô‰¼§®şáĞë!²r•¸ö{çìÎy…V Á€l\0\0\0\0\0\0¨÷jL^oÆ%Í~ÿ«\r+˜‡UŒFƒÁ¨Påí;rzûßGnÄ$ÑçßıÚ<´ÑSƒzí×ÍİÕY$Š„B\"Òë\ró>Yy3îábkôú²÷¥Š}Ó”Ök¾\0\0\0\0\0\0¨÷j>qîÊ/ûôíWş{îä¹+g.]OËTT:&:6):6iñŠŸ}½Ü;·mÑ)|`ÏÎ½æÀ±3[üg/ı¯šˆHèÕı7mşüæV÷I;»KRÎ/_²~wºˆ„®á¯Ì?6ÌERt{çïç^èyaî‚ŸR+ääbÏö3gyª…³HytÇÑ<s³½È{êÊ÷ûZğüŸÙF\"\"YÄ¢¯–¬¶ä¦şáª\0\0\0\0\0€\'Ğ}f¿x-Z\";ÚÛº»9»89ÜãHgGwW\'G{[‰D|1ò¦Uƒ$\"\"Iğô‰>—Ö~5qş»¹vóf´qa‰$şSÎxŠ=·pŞ¢—–^°=6\\VåDYĞ«‹¦^X8ÑŸÌí6n´[-:?pu\0\0\0\0\0\0ğDºOªùÕ‡s¤qÿúFt4½j*)Ñ9uqÇ¾£GN]äyˆzui7fhŸ>ímmäVÀ²-ûø“Ş´v¨šskÖm¼¬á)é§ß»šä)<¯i:p¬{ÜWïï>œË¥º*°ÃG~•N³m6p„kÒòwwRšˆÒ–-‘‡­WwÕ\0\0\0\0\0À“é^	v‡ğæİ;µ1Í²Ë\nìFé=zHo£É´ÿè™½:›]WÒ¾uónZŸºpÍš‘\ZT‘izó¼ßœÁÈ±\"–¸†øJçnšWõâKnG§*e¼×Æ^’ì‹‘ù¥½¸9·NgÛÔUu\0\0\0\0\0\0ğ„ª±‹¸P xcÚ³5íÍÈR.ıacFVNMÌ™úLµ¹w58“ÎD\"™¨Ü\\ä¬D&$“ÁXa-ã*¯«%01e×À°\"a•Íy\"3ÊNå9ƒ‰¿³£Â‘ïÅV\0\0\0\0\0\0O¦\ZlOwsïjı¶}ÿ­øÛ·ÿ}¢½<\\k‚©0)Ã \rñİÙÂÈ‚[¹‘ò¶ÂxŸ3s’²\rM›Ú™ãdš†VNêMªøtkH¨Méµ°¶¾áB\"\"N›¯#™ƒ¤ô‚\\÷Ì—kS\0\0\0\0\0\0<¡jL°Ó2O¿ò^@Çá³ŞÿòØéKjÖ`4šÇ]—¬üy}÷ËÖ¢5ñ<o0\ZÕ\Zíñ3—g½÷ePç‘ã§¿’U»´—wœÌöüé+½»5ñ	jÒÿ™Éïu\\Ùy*ÙpŸ3‹¯Ü[úæœÁİC|[vöñ”qÕc¢ìÈmöÆË]‚e¬@æ=dê¸öæ<š+¼z1×=¢g{GıŸ½ûŒ¢êâ\0|f{M/$$!„$@è½—Ğ«ˆ‚D¤XA@DAåEPÁ‚€€‚Ò¥÷¡×PJBé½\'ÛgŞ›„²›MØ4ø??>,³3sÏÎœ;›³3s‡\'­ß÷õ‘µ­Ğ\0\0\0\0\0\0¼œJ9«Óé³rrçÿ¸:\'WU×Ë½cë¦Û6ûkë>7—Z.NÉ©i3¾ùù½1¯½|áÚí‡‘Ñ\n¹¬‡›Z£-K\\^èöIßæ}2zÀÿå&„ûcÉ¯‡SJ9MÄ©Â—¹ùèõEK†0·mØ-{¯‹}z&uä_®â}ôÆºÍo‹t·N=œÚÇˆHÿğ¿ÕË=&,\\÷e§ß:¸.´Ñ¤ço\0\0\0\0\0\0^JŒ[ó~æç¸|àoW\'‡°GQa¢/^»}û^øõÛ÷ÿşùë_ÿÚúá„‘o}ğUóFşMúµkÙÈß§_]ÏÔôÌVıŞªœèyR—\0Qôİ˜L–ˆHì÷Æ¶o=–½ûÓñ¬â·O×Äæ¬èáÅ½U\0\0\0\0\0À®ô{ˆóTj¡Pàïàï3°WgN¯ÖhòTj•ZãW×3äÔ‰X,\n|¾q~¶L§¯Ÿ#ó™òõHı¦?}”©¬?vrWÙÍµ7rÊVîÊ[N=0‹9nÅ%Ue4W%R³ÔU\0\0\0\0\0À®ô›Ï{rŸ¶€ÏğùR‰8O•_°ÙÛÚ›ŸÇ3y_·ÕR¯ÌûŸë¬ñïo[JlNøù=Óÿ¸‘VÆk¶ui÷fK¿İJÍU	gEU‡\0\0\0\0\0\0PN1É9rAictY,W/¬ ©ô{ÿñ³İ;¶jPÏ[$šŸSo0Ü}ğ(èr°•b³„!ùêîWw?Ï*´‘Ç¿ÿ½òš\0\0\0\0\0€Réöâß×ÿ¹q·ƒMãõútmß§{{‰X$‰†‹„D¤Óë¾tøÔ…Û÷¦¦g¦¥gV|Ø\0\0\0\0\0\0\0ÕKé6Ër)i)i\"¢v8ID-\Z×ïÔ¦YJ½fÓËÁ!—o„T|œ\0\0\0\0\0\0\0ÕZé£ˆÃ îÆÁª\0\0\0\0\0 œjÊ=Ø•7 \0\0\0\0\0\0À6\0\0\0\0\0\0ÔH™9:Şäƒ2²µfŞ­¥ßƒ\r\0\0\0\0\0\0Pİü{ğÑ‰+	¶âÅµ|öİ}A1;OF‹E¼ßg·«´p\0\0\0\0\0\0jµÆpêj¥fjf.»^ìİİ§¢wŒ&\"–=t>®Ò¢B\r\0\0\0\0\0\05ŒPÈóvÏ¨¬°Ææ8ˆÛs&¦pÎ–\r*-*Ø\0\0\0\0\0\0PÃğyÌšøÔ~RcÏşå:½¿íØcãDC³Ç5rqTZTxL×Ké\0\0\0\0€šËÌcº¾]s;\"6ÇøZ(`tz®ğ­9ãûÔV0Sl<¦\0\0\0\0\0\0 ¸/&4©ë.7¾.Z]/œÒ¼‡òÙêºB¡À\0\0\0\0\0€\Zlî»Mkl£…Sš»9I+?Ø\0\0\0\0\0\0P³Í}·iáıØsÆ7®’êšğl\0\0\0\0\0\0x|1¡ÉÕĞÔ:nr\';qUÅ€\0\0\0\0\0\0^­«6\0\\\"\0\0\0\0\0\0`(°\0\0\0\0\0\0¬\06\0\0\0\0\0\0€ À\0\0\0\0\0\0°Ø\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+Tu\0\0\0\0\0\0\0\0¥ÈÕ«:„Ò¡À\0\0\0\0\0€jÍÃYQÕ!X—ˆ\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+@\r\0\0\0\0\0\0`¸òét:­Vk08«êX záñxB¡P,3SÕ±\0\0\0\0\0T_(°ˆH­Vk4šªª)–e5\Z^¯—Ëå¨±\0\0\0\0L)[ííá6fØ€ÛÔrv$¢ä´ôÓ®ÿ½uxdtÅ„•A§Ói4\Zã´\Zuvv¶^¯¯êˆ \ZJ¥H,6*•J&“§geeÅÄÄètºª\r¯’	…B›ª\0\0\0\0ª#Æ­y?g>¨ç÷s¦É¤’bÓ5Zí¼V­ß¾ßÚ±ÕÄİ8hæİÜÜ\\½^Ÿ™‘ÁãójÕrp]<¡×ëâYkkgGD¶¶¶Æé¡¡¡nnnR©´J£«l*•*>>>   ª\0\0\0€êÈÒAÎ†ê¹lÁŒÂê:7O•“«2¾‹D‹¾˜6îA T<ƒÁ@D©©)..®¨®¡@àââš––ZlºN§{Ùªk\"’J¥/ÛI{\0\0\0\0°œEÕ”§»ë‚Y“¯£bÿ¾şÜå›ÇµoÕdÆä1¾ŞD4oúÄóWo=ˆˆªÀ`¡bG5Óét\"‘¨ªcêH$iµÚª\0\0\0\0 º³èöÛÃÚ(äD—øêø;œLLIKJMßsäÌ«ïÌ{MDb‘èİÑ¯VP”·öÓ¦ıú³w§vp¨°¬ı&ô®£ÀN\0\0\0\0\0\0Pv•«Z_üğû†„¤§®MËÈúnùºu?}ED]Úµğùzƒ¡l!Hü¾üsÆ@å“	úÌ˜Ó;ş]´\'\"›ÍŸbH	^ùû%Yó·W\röİtér\Z[âŠ‹¨Nï¯\'4Óê::$.Zr+ª\0\0\0\0\0€2)ı¶R.suv$\"^éÆgg¸z3Ôx?¶£½­­òÙ,·wÕäÙ‹ß›½øı/WüxÎĞíÉS\Z<MÓ©9·ßVÿòËµŠ¨®IX{ô”Ö!?-ÿtaP	¯¶zr[ÒqŞòı“ëØ\r\0\0\0\0\0\0ài¥ŸÁ‹E\"¡ˆ4\Z]áÀfE©5Z­NG$åóy|>¿\\apyñ‘·ï¦\Z|/£N»Ï»´r†Æ&dH:ÿå<MFnO[Hû×¬DDttÚGÒ\0\0\0\0\0ÀKâÀ¹¹¹Ã‡·â:·oßn|1lØ0+®ÖºªåÑœ^¥gµy:ˆˆïŞmøÌ×Z5÷¶‘.ñî…Õ¿ÿ·?Jm¼„[`ßhÜ”á#Ûº)HuíÄòß÷Myª¸õ^¿¬å_ïu{»o\'Jº±ïËÕQí\'¾9¦…ƒ0;j÷ª?~8“ª7Õ„¸îŒU³‡ÙÑìSıÌµôL^åo\0\0\0\0\0€ša\"Zºté§Ÿ~JD>ôõõ%¢¤¤$ggçÇ{{{‡X.ßš•o%FóçÏ·|æyóæ•iå¥ØB¡ÀÖFaü,C¶6\n½^Ï<9MÍ\ZX…BV0cg£HÏÌÒjËÿÈ¦~àÀÁ6×KÑñÄ¢ì‹[Wÿ™š+tíüÆÛŸexüÁæÛ*\"‘ç„…¾Í\\øqşßw´n\'ŒY²€?ş“¡ê§×(ö™22å_ÿ÷+Óhúœ!+—&ÛøïÄ¿Ô¾C\'Î<ôè•?¯ªL4¡^5cÁıOfOM];yCx¼º¤p\0\0\0\0\0^zÆ¸Xİ[¯^=ã”9sæ|ÿı÷åXmPPP×®]M5÷İwß}şùçåX­…es™Jq#sö ^çÏ˜¤PÈŒ¿–I%ÿYöìOÃØ(åD$	÷üı£J­ù~ùº ËÁq	É‡Áø¾÷İÙ÷\nÿË=Ú÷ë©dã¹hİ££ûåOOİºr[·5oôõÚqû¾VÑhÀî‘?¾¿a{¢èQØwä»bÄ;MÍ¼Rlˆ²ì¿ÿ³õ†(ùß»ƒ\Z\Zv,Ù{\'ƒ£ˆ]—Şíìï\"fHe²‰¬ä”T\rkÈKOÊB}\rğœR/?ñOç ŸU}ÄÂçĞ«×|ys°ß²–|ç\0\0\0PS0cş”r\\\\\\ùÖÜ¥K—ç9Y]ùÌØ_~ò®›«Sá†±µQ˜™Ÿa¥\\¦”ËfO{ÛwŸç·Ë×ZGÌ®ßæÉ4_äT·Å¸	¬a–Œ^–Ë1Šz]?z·OÏ\0\'Yş¼µœGÄwô«-I¸t-5ÿšpCÚƒÓ±Â7ê;®ä=u]—q7Á8Õ¨õ9Y™\ZˆˆÕktO½›h^RlÖ­ÿ¶…7\Z14\0m³\"Vwñ¬J ä=¾”ÓÃ¹nµ¼=\0\0\0\0ÊªÔêºyóæ7oŞ,ßÊ?øàƒ_ıÕÌ–”ß§OŸ>uêTá‹¾6¯Øœİ»wïÖ­›ùEÌı‘k|öu9Ø(NveY‚S\'ÅŞ˜?È=ˆx,Ø6¬Kıõa×™úŸÎÕüâ_Ó–ŞOSkÅ~Ü0…Ç+¹ì)ç/Ò24ñ’ÑFüçŒrĞÈÎ.P\rUèÊ¡Ú1ddï\ZmseCæÑDÇ÷jã7,\0\0\0€\ZO«Õº»»›Ÿ\'88¸Üë7V×ÇõîİûØ±cÇıóÏ?o½õ–±®.vc¶)§N*zM¸å·U›sşüùÏU`W!€G,Ë	}\ZËwí¼šb \"¡«—bˆˆ©a±êQM[9z”h \"¾½·ÚúˆÓôemËd\0`-\\â­Ìp™ò£\0[‘}êñKÚ·_“ˆ‰ˆH›’µêß¤½u:©¸K{{ˆ3\\X>_ã¶yª=CDlğ†ğ¯ÔnßUèÃR—ş—z!e‰çàøÙX§f2Ò\'§½÷¿¬!cäçw¥^Iãän6“Ç»\rpå‘.={İ¦¤İ÷´*ây7qü`”cCDlnŞ–Í	›njrx‚€.3‡Úz‰ªrë\0\0\0\0ÔPb±¸f]Â]>¥¥/TM\nlFææİ¤¡ˆw«wG¸¦ÿ\'LC†¬¸h­c§ÖnÛãb4Šº£&öò üê7\'äÀÖ¸/>ó†zuĞ}ÎcàøÑ-“ON¸•WÖİk¦	\"Î %©‹‡oíô‡ñªŠxwµ¥O:»yWhíZjëíg×wt/O‘>ùü–=)­Gôàn	vmW7ãö˜lƒÀÆ³IÇn­¼d<\"N3èlğ£t-OæZ¿m·şvS+wï3n—>æFĞ…ÛÓµ$²õjÔ¡K+¯bWésê¸§ÏŞzœ¡%¾¼Vıvİ;øÚğM6Ä©ân»ı8]Ã‘ĞÆ³Y·Àn†M¿¾}wR›Aõ¢Ïœ$\rÕßKyõÌÅ;1YzÛ{7éÔ¥…»Ôø3›uùÀÍ;1Ù‘½oûŞİ\ZØ•ït@DDİéóje€«·LH›¯gDªÕPD¤Q­ş5v¿ãìOl<õêı;w§q~“rÑ_™!*›Î2\"­æäj6B.SåÌû3%¡ÛOc%’¬Ü¿şJüñŒòÏ~b†ˆ´ªµ{£^¯óBwhkÜ²mÊöSmtêu¿ÆìV8|ú‘—Aµgküç	7L±uf5[~Şíà4ëS¹]VîÖíñ3yÂ5Ãdr\\¶\0\0\0\0%±üG„jR`“ûà÷V.ø›r|ıkÃr9¢¬ÛÿûùÌ‚÷??2Z‘‘xnïîËş¯çÏ¦^3w¹~òˆ¿í® MÔµ£Ó¿ÛRö±È83MîaĞíìÏÆüùÛƒ™£_²Çt	Û¼:ÌéäÎËòƒÛ¸\nOm;{?Iëé!\"2d<ŒÔ¸¶ñ”1QdÈºs5±Y—ílÙ”{çƒàÚÒ6ëæÁC¡Šİ‡xHU1·Î9ÀØë\\KdbåJ^Êµ}‚É¿cÿn®üŒÏÚÇ}½s‘ôÔÆ;z=Ë·Û+=(ãá¥Ó§N:Õz¥4£ä†ÔQAG®gûwÜÓI}õøÅ3¡u‡·´\'\"Îzóh\n¹5jSÏA O¾ºÿÈI³®¯Ô³cSBƒ‚WŒè/%\"CZp°MëNƒÛI²œ=yî¬—×@_\n°òÒ%eLà·|],%w¹2(k´KÃz¼Ü‡)2¤S>tt`ˆ$SÇ³!‰Hîc×’wäÛ¹O›”uE+›êÃã´äÛÑe\\Ûzb\"wA_ÏäŸÓYCşQŒßz˜ûˆ†<†¤o÷ÏØ¿M•¤·G¤ìM“NıÀ¥§C$úËÒgêI™²5Ófş‡MÅD$™­Ô]‘vs¬£´j7\0\0\0@\r³páÂ\Zwúºƒ—éI]Õ ÀV‡-3iÉ·\rI·Nº¸õÉ„}Ç_êÓC×|7oéuëãv´°¥‹ß~Ø¿ğ­èıÃ‡í/­	6åìê!gW[øQ^,|±B!0<‘\\©”	„µéôı$­‡‡È©­ÕÆCÊ°DÄsëØ³m=9CäØ±&qKğ­ä~¡·rëõÔÜMHDNÒœÍƒãÛô«#.yålÌùLç#»6Ròˆ\\ûp©[Î_kŞ×ëÉu®\'wªåâ¨ä9Ú÷ÙÄ	øœ.áF‰\ry\Z8ÇZµös9Hı®ËÑ°D<\"2äjı‡½ŞÊO¤¹š]«ã ¶¾r†È©c/-w[¥2”ˆHT·k÷æ\"\"—–­îß=›˜cğ•UƒîR3qQW3bD²)^|\"’Ö¶i)É<s^5¹,%Z«q´il“ÿÓ…À^ÖÖ‘¹EÄHdüéû«ªÜF²äÛ9¹õ\\šJ‰/Sé«¹v=õÈ#ÕÃÕÍVÑ¡`ä°‘kş-8ŒÇ°¬ãÒ¢µj›Â‘ê$µ>{“ˆ¸¨Huf–öãÏ2ŠD(ºŸÎu”â\0\0\0€2øòË/çÎ[ÕQT/¨\nHü¾üó÷ßfL¾ğR§¶˜Ä½‘\'sâA²Ö£Vnd¤¦VÛÚR†r‰ø6®u	Oîî!¿”ªLQçeì]w¯Èò6É¹†:â¯²fó’Ót6¾î×„327o[ÃÄ\\ƒ×“$­›Ú:½é¯ë.µk×ö¬ëïWKJ™I&\ZrğnÑ\"=6<8,195%1>U/jPğ>cëëc¼Ú›ÍKIÓ+ë†/plÚ­;KD|¥«m~ï`ø<†3Ô°ŸæªæÈUiusfİ}2ñvF¨JæÊÃã91Bãø‚¯q÷oV„JzËĞ¸¿LÁ>%}öâÄäCšØvèæ<d_äOOä}®—ÁÀJ\ZKá98,œhWëI>2v¨®\0\0\0^Uóì—‹!ëfĞ¥¨ü‡oÃ³D®Ş¼£÷“Õò¤µ[;7‰‰aÛ9â8†eã¾}\Z*‹†/Q–áægkFìŞvèÛSâbbc¢^9xãV£Á¯6¢’b³Bî¸ëÑ$ ¿WãÖWv-\\O,ç¯c9bLÏğ,“J¥Ë<Îï4Êã-üı¤M™³1gÏCn¶§Xr$ï¡ÚÑSADÄª4·Óò‡:×µkaH8~Oü Sö¦/Ÿ!.>8=Xá¸z¬s]§?¢â83Í2µE‚#¹÷óœ¼lˆˆrïÇYËÍúÚ£©·X~D“k#öViãRì1Œ~Ç¥LO>\0\0\0\0\0x”S@—¸gåß‡kª:êKèÜÀGwïQx„¦v@­‚‹·\r™QñË±y‰q¹\"g§ZN\"UºVjgooooooÃE]¹p/Ûäq<™³ƒ0ëq\\nşœ*!2“çà\"/R‘³Ù/½•.ròôoÖ¡×«C;8dE„gŠ]KlˆÍŠ¸\'iÖ+°mc¿:îbö©óÏLa»¶¼ìØduş›ÚØëÿ:¥µÊÖ‚BlØ…Ì4[Û7[Éü=%Æ[:õ±e¯œËÕû8\r²Íıu[Æ#5Çª5GşK¼^ø—T6ÀŸ=¶+9¶mc)‘XÊPZÎÑUDlŞ±=±¿EpÚ,m’é.«ğsì+Ï[öwrP¤:üAúòÍYÔØ®‘„du†8äş¸6éd„:<<óõÉ·%ÒÚE\0\0\0 Œ8¯ê(ªœÁ3ŸÑe¥¦eÊläc}_ÁÎÁâº\\T#\\Â…cùíü˜ŒğK—’m\Zwq‘Ù‰)v»Â´­gË¥Ş?w5Á¾·Mñ\\+²òZÍÛî¸pø¼ SC\'J{p1(NÑøÕÚâ\"3ó„ü¬ğË\'8Q§†®R63âQß¶±\\âÒ¬¤†½XH9QáQ^¾6†Ôğ«XV”•£s-v¾SìÖÌ_²÷ì‰k‚¶>J]Âí3©N?W‘©¡òØì°óç#EMº¶u›zmíşBQ«÷<íê­`EâAE;¦_×zŸZ›ı7qòÌx­PĞ¸]/ÛÔ„ü™xäLpNÀk2†ˆçVn“îÆ®[¹™\'hØÎiîŞ‚-‰+gÛ—Ü2#‘Mş ¶`sÒÂStß¯u­ÅÃJ†H(;ÅƒÛ”´äçTñêµrYü†Ò×+\0\0\0\0”ŸŸ_çÌÈÔåße\ZÒìY(°Áƒ¯—øXĞ®-î}Æ\ròñíıü”Á!n\rŸÔJ|Û¦<³nú/CÇW¸7ê=°µ“€È±åÀ¾Ü™ó§÷ëIìèÛ®gOIñæ©•·4€wöü…½¡ZÚz5í×§•ËÓ¹)©ÓµO«3ç.í¿«!Ùy5éİÅ_Áğ%5ÄP½Îí¢_=º+˜\'sñoÕ³‹ğxĞÅëÉu»&ZäÖ~PŞ™Ë\'v]70\'ßN:yŠ÷`—ˆÓ¤F=~$óîÄ™~:­‰lö¢†ÏLe¼û×;‘?ä ròÊÉOŞr.|¥hX{ïò\"ËH$Ãß­7üÉû=Œ/ÖşèP8UŞĞcÿ·ù¯Å.6Ó>´™öLó;å„ÉÊ	eı,\0\0\0\0P3=[N[^H—éNlÆ­y?Sï]>ğ·‡›‹åë*”˜’ößş63¼7Tª¸Í¼›™™ID÷ïİmÛ®½ùõhcNl9#êûFgcõËåŞÛµùVİ×‡5·Ã½/¸Ë—.ÖoĞˆlmmSnŞ¼Y¿~ı*\rªjÜ¿¿Y³fU\0\0\0@uÁ0LÅÄf†ˆ8ëİ»÷±cÇ8ûçŸŞzë-c‹åkzşüùóæÍ+µl6ÎSÖÚæÎ`»lí7ŸM‹D,kò”^1<O§×/ıãŸSç¯•)¨æ8]NfvFÄÕ(qı!¸î\0\0\0\0\0ˆˆ(--­Bkl£cÇ_L™2Åø¢wïŞÚbù˜+•v>½ûğéJª36+ôĞÁyÎÍ4Eø]ğ\0\0 \0IDAT±/Ãhà\0\0\0\0\0ğB³··?zôhÕØÇ1Ã<ß§Ø‹¯¿şºÜk~Î{­MÁ¹H°ß±íÈ÷Ú›ÈÈĞ Äù\0\0\0\0à%Ñ«W/c%ìáá]ìİë×¯·jÕJ£ÑˆDåypKEÔíåxÀµ…P`\0\0\0\0\0Àó*¼/ºØôœœœj5Òx»6B\r\0\0\0\0\0\0ÖQ­jéÊ‡ÁŸ\0\0\0\0\0\0¬\06\0\0\0\0\0\0€ À\0\0\0\0\0\0°Ø?P(ÔjµUTGZ­¶|C>\0\0\0\0¼TP`ñù|\"rttŠ|\ZŠÑjµ\"\"‹M\n…*•ªJBªB*•J(Vu\0\0\0\0PMaq ‘H¤×ëmlm‰(4äjl(J$988\ZÓ£hméáá£Óéª.´* \n===«:\n\0\0\0\0¨¦P`	…B±X¬Ñhlíìlíìª:¨¦ø|¾T*-ü¯M@@@Æ\0\0\0\0Pİ À\"\"‰D\"4\ZÁ`xÉŸ\\ÏâñxÆ_aŒ·ë\0\0\0\0@‰P`C>@  \0\0\0\0\0\0ÊIÿş·U\0\0\0\0\0\0@‡QÄ\0\0\0\0\0\0¬\06\0\0\0\0\0\0€ À\0\0\0\0\0\0°Ø\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+Tu\0P]„„†Vu\0\0\0\0\0\0ÕZ£€\03ï¢À†\'|ëÕ«êJ–š‘áhgWÕQ@\rƒ´Ë![¶Ô H×—ö;XQøÃ‡ægÀ%â\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\np‰8<Áq\\U‡`Ru\rª-¤\rXÙò<°õ Aº¾œ°ß¡Ò”¹Àná$›ÒÈ©­³œaèjrŞŠä+Éy\0\0\0\0\0\0@\rR¶ûÃÆ.?uôà1ùÿmâ Wßñ‹ËqßßH°~h\0\0\0\0\0\0\05G\nì^¶?wò`È}×Ö=,S½=\"Ãº‘Aå«ÎÏTçØ ÚBÚ€å-Ï[j¤ëË	û*M9ûºµcâ­…mÜ­\r\0\0\0\0\0\0@\reél± µ³ÌÔ»õí$\nQtÖJQA\r“œœ¼hÑ¢S34jÔhöìÙÎÎÎ•\0\0\0\0\0@e²¸À–ğÍÏà(æGç<w8æñùoúËZˆH˜§YøP›ÌZºœÂF<Á™ö<Ò<²x(“E‹yxxÌš5‹Ç+áš–eÿı÷ßE‹-]ºÔjMêbn:¡zæjIİ£úxŠ¬Óˆ>şÔæ}ö=F\r¨\'5uùFYÒ®îØq“ßfØ«Íl­ø”<S«å²ïìÚvAÛhèëíœğÌ\0\"\"]ìñÍûÃU2ß#zÖLårB÷l\rJàœÚ¾>´…]¹v²åEcú Óûµİ»¡^„}¤:ôïÁhI“W†wt5ÆÊå„ìŞz>·ŞàİjULôVë2\\Şƒ}›Ogû¿òFg×ÒB­ˆ¾•­*ÒÕ”\n:ò›aQ—¥SÔÚè#›<R1<¡ÌÖµn“vm\Z8‰¬Ú“_È¯òÊÏÒJ¦Õj}||ˆ(,,L*•–uqK·|ªZo~†äÒf0‰/\\ĞÍv¬Xÿí™ŒU¹OMÿ)Ğö5¡~îÉÌ\rjˆˆ5ìºŸ½Y(^ÑNÒø‘ö¤eÕ2#Îj.«¯£ŞdöP¯.g”/…rß2sæL3\'¨GıöÛo?Ïİ/Å—Õ%œİ¾ëÊ³IÇkÙbxoá3ÓËE›tq×Î3^>CûùH¬uøĞgÜÚ¿ã?¡¼÷à¦6V<€›Z­>ëÁ‘í;³uİ†´u,åG²Q	)§K¼°c×y\r)³›tø´iş!Óôçªí÷8rWôÜÜ¶\\ùƒl©é,?È4éÔ²¢7TÛG%ô5}Ü©m»oÑ¾{Ò‹†Ô‘!\'üèöIİÛ\ríêZ1Ñ[­Ë°¹Ç¶ïLèÕah\'—ÒB­ˆ¾ªš¤«)tä7Ã¢.K§¨JÚïñg¶í¾şTAñ›²Å;ßÌyÍ_fµŞüB~•W~–VF&‘H¼¼¼şûï?±XLD7n3fÌãÇ³³³6lha±mi®1<ÊÖÖU–|f0!O›«³pU¦\"îÊ_a(ücFa\'éUìÏ\\rÁÇ-¤B²ÎXZÎ3íı\rb²ßb¦·S¼—”¹<#XÇq%».Äãñ¬<¶„¬å—ÿí2°i¬œ4ëÛûûUS\Zˆ‰áñ}Úİ³§¯=Ê¹5íÒ½¹›„!2¤]İ¹ã–°m—Ú±×Ct6¾zwª§(1dV{ıÔÙO€#b\nÇÍç´É!çÎGf]İ];8\nïèÒîº‘¢:x7ïÚ¥±£Ğt‹Ã0Dœ:öêÁó÷MGb.`N|*èv¼ÖÆ·¹gÊå`C‹×†66±Z†/±±‘óe‚‚ÏPÂÆa3oïŞ~IçßÖ+çîıÒ»E·Î­ô#Eõ“¿%²Ïí¹=±I[%CDú„Ó{îqEß-qŸ–\0Ùòg‹éƒ/íÈîÒ6”!íêÎ7ùm‡\rijË#UÄşÍ\'Ò}Œìæşì·.§I¼töfTÏÁ§U·N\rìdr×?³ª1ÎØw×ü´¯õ¢Wk~r&?ø’’³…=¯„>¢OÚºï>Ó`ğğÎ®\"6ëöîmsêÑ£öÓ•˜ë2–wI}Òùm›OÆå„îúkSúĞá%œ°+cß/k\'maR½rUEº\ZWky÷\'*õäZH¯V‹Àî~ÚSA·öõ;õlï-/Ë_;%»†5ŒÜYZ§¨‰Œûİsìï?\ruãò’œşç§UgÖÍ[Qoõ§-¾Êó[ş,­îİ»×§OOOÏ={^ºtI*•r·víÚĞĞĞ3gÎ„……=z´uëÖ–¬ªİcwdÆÇM\\J|kgäó!—jğ¨-®ó(ïa~Æ´ôò²õYŠ§çc\r_ÏÌÖr\"Ÿ:6ÓÔ9ÓY³uw!4}8-8‡qÎ+\nÃ”şÇ%ó”ÇBÃ‰…<\"ŠÅb±˜86ïî?ŸÏŞfüfëß»†.Z:¾‰Üy{ÿÎÿ’vşW°ü¦ƒÃ~şå?q±Õ²™—ùxş‘¤Zd³o®™ùÅ®¨ü|Û´fÛë‹ş7®±‚İ=wêª;?0mÚxvÖÊ¹]Lµh<øÄm[°Àl$&f³o®>gOlşT\"¢ZÂ^¯46±Z>«ÎÊÊÍÉ3qywÿóìÆasîŞ±3šv¶õ÷7—|7ÊïÅ¾ÚQ}e×ÕôÖ<ÒF=ğ¸è[ú’÷iñoCdÑ‹œ-¦2¥o(Cæíı;w}7µåqÚè“ÛwFvmóú3öÓûˆ6şÕpüòï^÷2nÍRöQ v–iî®ıqo›ÿ\r­]4GL$ge|	}¤‹RüèĞÎó%Úñ²WÿY³ã^Ó™ÃLÜ\rTB—)S—l—v}ßáÛ9Dw~ïnE×¡Åk‰²÷}Q;)\nìªQÉéZÆî/6ñİTü+`ëß+ù¤É?Hl<ôæoËF{¯pLçpÉÇ®Á®¥tŠ\Z	…b±{´xmú—É¡î<³óö{Í;ÈsğUn­,­G4¡Pèîîœœ¼k×.¹\\.†ÉËËÛ»w¯V«õòò’Ëå®ªŸwùí$mIÅ¬å~ºUÒ×LpÉ)ê;Rñ€Â°Â‘Nt,FŸ[Ø ? ÍéŞÁ=Cú8î«\'°óëˆ™¢@¨ìmÓÏV¼¸“Ã­6\"%Ãç	°=ÛÇéq§Û]l>uâ¹ôh»·jÉÖwwzÜß)¤‹r„<?¥„Ñmî÷wzÜËn‘—t[oûŠù/.®¼,YÖêëg9eY–5&eşkÍ£­K6…‰ÛN[ñß¾mË\'µ”Fïümw´Ë?3i8kíƒ[ôµ§ØÇ#ÕÅ×©~°ñ—#I‚†ï,Û~hÿ?†zäoâ8uøæŸvE‘Ïˆï6ìÙ½aÁ0oŠüïÇ­\ZMä‘]wtv½l9ttïo{RŞÍ³‘jÎL‹ÄY‰©Å5Û~Ş+jòŞo;îYıQ[Ã™Ymş¾e9Nóh[‰\'Q“‰¿ì8´ÃüWÜôş]v NWîV=˜J9\"\"îÍåú›{.$é9N¶ÿh\"¹ul¢Èï¦öi1È–>[J<ÈpËZ°¡\n¯†È_?SòAVópËO{b…\',ß~pÿ¿ózÛëînÙ|OÅY²ª}ˆˆ|FÍ\Z^ÛpoíÒ½1…Bpd29Kî#$o:¤“’âOÅh96ãÖ±»œ¨å+-mKj´ÄíV¶.)jğÑ–MŸø)ûü´oÇ§$ÅÚ(Gß/{\'…ŠR}Òµ¬İ¿”o§~ó6ìÛùó0W\"´ã§îÚ¿aFs=>w#ù™´™.ùØUZ§¨şÌíwâ8eYe\rz{K?éã#Ruø*ç¬—¥5‚O¯^½$‰P(ìØ±cçÎÅb±X,îÒ¥‹···qN*M\nìGÙÚo®Å?;}áõ„°Låë)«ÕnÊä½V‹oüÍÆ^Ò‰ÓnË*ü\0L»¶+¼xnet;“ñY,ÛÄßng]öPª¡øÏø<ÁäòúÙš%*†×%Àvymúïfz×3™sSySÛØ~¬,øm†/˜á/¸p7³ÿ…ì-œxa#‘3CÄ|ÜÖæMFıé…ôÁÁ\Z;YÛèº—€>åê…bìE‘‡Ö¯şçx¬Ô‘(úüÍ”ü4qí3¬£+Ï ókîF¤ÊTï ú¤›Ái$ë4v°ŸTÏÙ·\Z9®yÁí+úäàkÉ$ë6qD>ß¡õèI]e”xåF\nãŞoö‚£|\"wı¾øûeû¢‰XÃ“ßÿLµXZ$¦fÓ§_I\"e×±ıëŠ|÷£{:˜¿Ç®ÇøõDzÎ¡Í›o7aèÑ…û/òíÒCz9Ñƒ}gâu¹wöÉ`^}rjQhvŸ@¶¼4ÙbN)ªôÅo^K&Yç·Ö“8»6ï.XøÕgƒj1ù[ÓÂ]_­1ßQ³GÔfï¯]º/VWğ	L&§‰ŞÇIüv³§øÓçb5Y!ÇCÒ¶ƒš*L]5ñl_(c—äô\Z­ñìN£Ñ?µP¾o0˜ùN\n•­RÓµÌİßüw“[ß!­‘›¿‘°Ñ€NîNáíç@¤×=3f‘™63ß)^ 	D\"–cğUNVÏÒjnïŞ=—/_–ÉdD4wîÜo¾ùæë¯¿?¾@ J¥7nÜØ¾}»ZmÑp^e+¿» ğf5¯e¼ÕˆåhÉÍÄ«î2ã¸³Ñú¾bŸˆ¼û,ÓÆS¨NÌ1ä_=ÁES<y·îf,MdõD‘¡Yµìí?ÉËÛœ[|5§ŒÉè®×ñÄâiî¼K!ËYßÍ®ãd?ÑG°â¦NCDÄ¹›ıG2Ç-n$¬ÍÓäÙIÇJu_^VíWsDªYwÛ Â®AXu®†ˆ‹9»/æÉÄ¬Ä½1Ób>qDd(ü]ºØâz•Hî #–#\"–¯p(Ê€Õæiˆ¤¶R2p‘¤vR\"u®Úú÷·ÜT¼êy:;Ê(UÿäF^“-–‰©ÙXM¶ŠH,\ZÏ¡±B™Èìü–m‘ÄNÌ°DÄ±|¹\\H¤ÉÕ²D5s ˆ¼ú\rğØ½şÀá›/æ	[½ÖÖşÚ¦ü÷éWÍìÓÈzi²ÅŒR9LıÜmÜGr;Işé±Sm/)OÆÏO\nw}5Çˆêü|Ä¹i[Öı¸·oşÓ<M&§©ŞÇ‰½ûõrÙ·íTĞ}ˆÛzE—²2ô…òuIÊÕ÷Mf¾“Bå«Ät-s÷7ÿİÄã1,Çñ8\"\"†!%3GÓ9\\Œu‡Ï©	‘QyDŞµ•<|•[=K«3___†a¤R©@ hİºuÇˆ¨mÛ¶;v<~üxVVÖüùóçÌ™UêÚÊvI<G4çr\\Ã-!“ƒ¢¦n´5tÖ¥Xkõ½´õ\r±x°‚¡p”#w$Ö *xK(Ôå±3¸ü¡Í8öJ:+U]İcœaW‚Şx>]$zóA¬¡`©‹é¬R!p4~h–½–“Ÿ‡–X†øD®v™J¬ÉÿLÙ9Úˆ—éÉ^å¾¦Â’e+nıE¢:ú{HÔfîÖ#G=ºoÅøÎM[uiã*,œ‹-ºLñ5	í}jñ(9ô~ºã8N—r/<§`Í>µx”zãZœ†ã8N{õz*ñÜ}”	\'wßTË»}»uóŸË¿›ÖİåÉŠMµhI$¦fÚz»0”’¦ã8N—tãjB)Í=Ù:¥lœ„7StÇqêÈ«áZ’yxÚğJİ3Õš‰´Éß\"|×¯øRòŸV\\×É;m¦äl(mŒÉ}Z²…ã^ülyòîS[Ş‚\rEŒGÄê\r,ÇqÚÔG)%sl½œˆ’ï„¦é83¤úfü»ï-½ÃZ°ªSCeYNà=rÖˆÚìÃıcÍ\'§Îdïc…½ûÕ¦øı«ş¾ª³ë4ÀO\\òUò%÷…²wIÓ½­<}ß‘_æN\n¥Ú¤kY»¿™ï¦\"Ç*zŒ`æ>Û´éæÌ»ªãÑÇb&#êSéR.ş»å‘o·†\n|•sVÍÒêN¥RË²ÃGn6N§‚¡šY–%\"†a8~w*ÏéÙ™šÏ}Mø³X­nS:o–›àŸI{vL6Gå¸ù™cŠ\r0nr#p†gŞâ3ÄùÕax5a¨ÖªgIªY2Ïó³iöF/‡ë‡¾ı`Ö…Ön†ˆ³§îæ5ùÈİâá—l[èmwóğŠ/—¤ôoÈ{°KT‘·ŞìçxëÀ†éÓÃºøráA—¢ÉqÀèÖö’LQüµ~]~Î~ît$=8pøqƒññˆìZ½ÑU1ïôês´uH¼ô°ËšÜ8YDDtåôÏïuªkxpêl\nÕ\Z>¬´¦0³ŒÀ¡ÓĞ¦+¸¥&ûC\ZH˜Goğ¤¶%ïÓ!u\Z‘Ùòe‹i¦6ßÑÏ[L÷¯İ¨lÅ¿³g{QIgˆì[ï,ÿæìÊsîµ¯{ûD(\'ïúZs[†Ò+ı“T(NPwäì‘g?Ø\\0P‰ä4×ûx.İù¬_‘D¯ô÷)>B¥yeí’C¼ø>Qvğµ›Ó_ÖÉEğôÚÊÚ÷•LBÉ=O\'…ŠRYéZÆîo²¹r|ƒ˜Éa“Ç.Æ\\§¨ÙN¬]şHFúœø»Wï%³äõÆ´.†ğUn½,-öT5tëÖ­ÿşûoÃ†\r¹¹¹W¯^½zõjÛ¶m†	¾pá)•Ê?şxÔ¨Q–¬Í¢3Ø|†éëiã*}2á(_ûqõÿë(ô²ò³e/ÄèÜ$c¼…Ù‰ê{EnaÓ©u,¯=“ß›^{^^>©¤?è\noÑªtX~g;¿`©öö¼ì}ªé“ÒIY­LØ¤àâ{;¡/\nl0cü]ÇãB•Š¼ñä¥Ÿ¿Ş’ÿøş§Û´³`N/gË¯\\•5›²tæà\0ÍÅ­kVo×‘y«ñû?õF+Ç¤‹Ç]Jth5üËŸßo$á»öúøıÎ†»\'ö¼®nĞ¯O€’ÒÂbó*à££lõñ’ûø1¡§MpmZWLÄò-Û¶æ7k€kÊ¹ÏFÙ6öÕcë‰_ğz‰clZ\rm+&ªÕg@]q‘¯¾‹…ûÙòòd‹&6£h9eúÀú¼ëÛW­ÚóØµ©‰ÅmÚM_òQß‚§»–S·Ç”E¶RVê¨$œÀgÄì‘ÿ5‘œs½ïÜé•úDäÒ³O²>õ¥¬]’Q6ĞÉ‰I¾t`ÏõÔgî¨/sß7ùı÷\\*L%¥kÙº¿ÅßM–0Ã&]æ;E¦}tñä‰\'Ï\\××iûÚŒ?¿ã+!ÂW9Ui–V.‡·ß~»C‡yyy,Ë~óÍ7ß}÷İ÷ßÿÕW_©Tª¼¼¼-Z¼ùæ›Æ;´KÅĞ×ÌÏÑ©–bUW¯\0{É” è¡ÉDÔÀNrwD\0µØ~78UEDoù;¬ôÏÔ¼u<6»lˆ/\\ĞÍ¦Éıô×bYN$ZÛİ¦Ÿ]}.}a\'±•Ÿj/üítæ5µ°ßêaøåfÎÖl¦±—bY]æï3Ê¡Bv´“ğ×S™Ûç×^·ÆvëİKoäîÊcZÔ‘ÿX‡Yq6cI6\'Kv¯?¹AÍ‘ÂÙærSö­S9×á‚.¶Crr?} K‘ˆ¦7’v³?¥/Ë)Ûgªn¸I-K\'$4ÔËÓ³|ëÿì³Ï<<<F\ZUâÓ°Y–İ´iSLLÌ?üP¾õgçå)M&4O(H¯QãÁã…B>aˆãVg bxB±X`šƒˆb©gĞª´%|Eğ\"¡€Ïcˆˆc‰á«Uk1_ \nøq½N§7p1<P$ä3DË²ñø<Òk4z”Ø\"kY$¦VEî\\ºâšıÈ¹w´gØ´“sßúîjıYëv¶•¼ZF ‘Ÿl’6>î¿Şÿ[7ò?Ç×3Äq¬A§Õ={GMc\"mø\"©ˆoÜ©_$ñ9½F£c9c\"é4j=kbŸêÖÙò‚g‹Ñ361|¡H(à1D¬åñyTò1‡á	\"¡ñj)Ö Õi\r¬™CV±¦«³}M§Òä_WfüP™KÎNv|Ó½Oµéƒi›˜·VüúFm~‰9gæP_¦.©c9†/‹ø7öóöı²vÒN¶¨±+JõIW*s÷·à„á‹$\"«Õhùigêxa&‡M»JéÕ›©ı.–ŠŠüåÊqƒN¯3l/|•“•²´F$LddäØ±cãââ$‰D\")¼\Z<//O£Ñ(•Ê\r64iÒ„ˆ¢¢£˜YU)x¼êm·µw]ã©éş^6ÆÛI’¿”B˜ÿH?O\"òµè;öÄãáiåû`œV¿)•ë¡ÔìÌ)¶¸K÷2§pŠYMí?Pn®vÍõœ3JÛU{&4ó#ƒâ³vÓù”•£ııJÎ2³cİrzİÂËÙLSùÊrF£ûëA<@¢«)QÅfÎœ¹xñâñãÇsWìLµqJÃ†\rgÎœY1³:µJ÷ÔƒNcĞ==÷ô\\zªØE×k5%¿Éq¶øš‰cõZuI˜hÑ²HL,²¯¥¸u`Ñª­í“/î½¢•´ØØ†1ù9½ºh%mœÂ5jU5ú›½¢´ª‚á¸\"¯‹î“ûôÈ–—Â3Ë6grû==«×©õ–²Š5]­í_DO(SÉiªhï_·+øÖ©8^£{¹›,WÌêËØ%‰3hÕª’Ş0*cß/k\'5İ0T*HW*s÷·à¤è÷\Z÷Ì±«(39lâØUJ§¨‘\Z•¹„¯r²Z–Ö\0YYY¡¡¡nnnİºu»uëVff&Çq\n…¢C‡/^ËÊÊz¶Ò)‘¹ÛM&ü·§wá…ßîJ1ŸÑ<óóÉ/°‰ˆÏ0ëë\\NÎ\r·ü&mƒîË©ÿa\\K­SğufnûÃ…ïößÍÜ×Üšt9yİ?5…3v…fî\n->§>WÕûğ“•“œpœˆˆÇçˆ\rK.¦}ÁIlå§ˆ}\\úH/;ggçrŸ†²±ë8cáø_ßvê¿MÏÖ§ÛÄ©Ó:Ù2øJ‚lj«¬É©»rüR’c»©ws`^ şÑIk¤+T!%*‹¿¿ÿşıûÅbqıúõ÷íÛ7wî\\\"š6mÚØ±c£¢¢222\Z7nlá¯æ.ŸÑÌõ‡öµ‹Né»?üHLVçZŠ !şDÔe÷ƒ³	9í\\ä‡Ö/:Ûükñ__µÆ³»¬ÄÅÃöJšx4óHi¿¨ğ%â]ºğ¬/¢õ\"áäæÊ1ªìî7´)5<+úñŠföêÍ—O 	øCÄ±½^«Ş{¡\n®&ªWğXiC„l±²åy”së•)9y\"‰˜Ï«Skõ/Ø“ƒ¬ŞIÁ,¤ëË©fäñU^YŠ ö÷÷W©ònÜvrr*6Ûs]\"^WYüyŒ}<•Gb²ŠMXÇ¦Ø”z6Õk¤8ƒ!–ÕZ2§ZóÑ\rÁw\rmÎÔgˆcï&ä½Rã«kËUÎ@ßåSc«lÆô5_åÁéTy/æu\ZHd‹å-Ï£<[¯LÉiĞ¨jÂ09åaõN\n¥Aº¾œjğA_å•¨0Oîß¿_lŠåÌØÏïïi;ãB¬T?€­ˆOD}<ŠØÏ;š¸µ¥ÆgÔ±ø„zBrîøäÜŠ\0\0\0\0\0\0^@e{Š]€½äğ@_[‰ñ¿+ºxŞJsjç\"¯€À\0\0\0\0\0\0\0jsö£¬®ª.z¾ÚS!òT¿ŒœˆÊ0ÂT\'Õùâ™êT[H°²åy`ëA\r‚t}9a¿C¥1W`ÿ\Z’ìg+îæ®X|É·£³	9Kn&Y!4\0\0\0\0\0\0€šÃ\\­Ò³ï‰ª´P\0\0\0\0\0\0\0j®²İƒ\r/¶˜ØØªÁ¤ôª\0j\"¤\rXÙò<°õ Aº¾œ°ß¡Ò À†\'Ì?Ò­\nÅ%&º»ºVuPÃ mÀrÈ–ç­5Òõå„ıV\Zj~^åÄ\0\0\0\0\0\0ğbC\r\0\0\0\0\0\0`(°\0\0\0\0\0\0¬\06\0\0\0\0\0\0€ Àë›4iR·nİºvíÚíiÆ)“&M\n³b‹¿¿øêâ[ê¢“r¯|=°Ç{;âõÇ§õ½&Bg­¶¸ÂjÃşÑã­õõïhâÏÿ=ÿıáıû›4ı…L³Ÿ¤\0\0 \0IDATDQŞ¥Ù½K2íxg­¨ 6\0•Ds÷ç×Ço‰Ñ?5=ïÆ÷¯¾·;‰}Õ³I{&¿òÙ…ÜÂ	œêÑ%S^ï8ğ­Ùë®¤JYƒ.şÔoèØwä§¿ŸŠ×æO7¤]Y7{Ì€ÀÀÀŞÃ¦.=ôXóTï{¦İBúØÓúøõ¾Æò˜MÆP”©xÌÇùüË—zäããşz²+xÏ\0ÔtE¬cÉ’%Ó§OçñJøÕ†eÙ-[¶,Y²dåÊ•Öj±GÇm§OEjš6çOÉ{pôºÊgl8»Û>¶f~?Ê»4ûõÅ®K7~ ~êuÙè¢w}1iyˆ×Àq3\'4t¤ä£ÿ¬›31ü‹5_¶ŸúË/côD¤ºóÛ¬•šq‹>i)gˆx\n/%SÎÖ€´¨\\Mx}¤Gá_yw÷ŸÏ~Îurš¤Ûÿ·ò^î“\'_p–|¼äN›ş÷I\0?lÏÏKç|e¿şçWİLş•£¹·fÆüCî¾^ÑV\ZyhÅó?¸¯yÏ_lH8ğõœ³Î\\6Ï3óìßıo–¤Î_SJL´[H·ñªµMËc6CÑåLÅc.Nk,kÄ&_Ü*p=>t\"úqu…Eß«ˆ=\0ğ\"@\rÖqïŞ½éÓ§;;;›šaÄˆ\'N´b‹u{vvØqştôû\r|EDD¤~tâJNİQœù$ğ>ÕßŠm•Ìphñï7<\'®^6ÚÇøQ³ÖmëßñÇ¿á]>nØØ“ˆ(/×–Ïäy5lÜØ%R5€´¨DŒK‹Ú	‡NÇ\r{Ó+ÿÏÜĞWY?EdyW©ÛñÁÛ¿ÜÓ½K»¸ñ4¸è“!­äD~~•pıİí‡có–¼\Zõ½’›N]6º£\ZøÌM½6nÏñ¨qş>)A»Bì_û}rŸúb\"ŸÙ/ŒY¿7lBÃ&‚Û-Œ*şÀO;”¯´¶=cyÌ&cğ=™ÇXr<i&â”XgÙü5$ß{ßaĞ¬^—¿;|ôñè÷|#«€=\0ğ¢À%â`Ç•xîºÇã8k^æ*öéÕÑ.ñìùøükÔ4O^ÊôêÕÑUPäÒ\\\"6óæÆ¯Æ\r\nì5lÚG¢4iîşüúÀÙ—Ôi{¦öì7¼_áëOÎå–4¿	úøS;îH{NzÕçÉéFÙlÜçÓßl.eqEoõ„´¨D<‡6ı“œ-¸–8\'dÿUAÇşõ¥ù¿±76|ùÎ+=¼9{ıÍ,ˆô×4;èÁ‘Ş{å•ÙO_-píÿİÆ-[¶lø¶İ“âYŸ“Fµ\Z{ä—ˆÂZM}Dñ7åš¼òY™«ğkÛ ÿŠ¾ÜIÎhs5iânÇ‹üZy\Zû\'ß±I§œğˆ,ÖD»F†„C?m“{¿½}Éß‚%/k2Ò†ı1\"0pòÁTÓñ˜Œóy–-NŸ´/Ì¶C¯vİ:»$;ò¨ÈÅï¥îY\0€—\nl°†)ıKÕ’yÊ@R¯wÛØS—õDDºØ ó©½;Õzêª]äæYsvSßÏ]õëü×..şlÅí<‘ï„k>k*²í9ÿ¯ÿşwÁëM_¶”4¿‰¿Ğ417bŸõ¤OM8·4´»7şÆ¨®6\0•ˆgßz`ı”£§Œwër9!û¯	;ôóËÏ.ëâÒ¹ëã[~ğóšu«¿S\'tİ’]ù÷úrÚˆ_¯Š¨ûê„¡õ¾ƒ/µwvqqqvó‹´£p’séQiùå!+:QÃf%å˜º›±ëúíÆßŞÌ?¿mH¾|ø¡À§…»ˆÓf¤édÎ6«æ+]•””­7Ñ.‘!éÈÏyoNëêXìRb6OáÓ¾c—–µDd*É8ŸgÙbôñ§ö?T¶\r¬«ôêÚŞ!ùÄÁ‡E+l³{\0àe†j.©oïvŠÇ\'®¦²Dú¸ógİ{vvªPÊ»ıÏ¶”î_|>ªS#¿FFÍ™7Èptsp@éRËQÊãËj¹¹:»¼®å`)qşK%N›•c)BÔD5Ò ñì[\rlzìd´ˆË¹½ï†¸S?¿‚K‘Y\rç;xÊì‰½›úxûµîÓ×Oœ“˜_ë’óú.^öùø!í\\,¸™ïØºW½´=K×œWiÒB¶ÿ´>‚ˆÕ[2Ø–.ñÌ²?Ü®óæûN§Ö“@Ä/è _Ä\'½FgúâCÒñŸÖkG|ÔËÅdy]Æˆn}>ùö›‰-”&ãaMÆù<Ë>Msâàcy«¾{¶Q¦Ş_õäm³{\0àe&ğÛ°°ªc€Š7iGUGP!dõû¶•Ï:œşJOõå“ñn=º<](éRBd¤F4à@‘‰î÷Sô•%®OojşöÏÎÌ263SË‘¬H±ÄiS#¦)êúºJPBUOH€JÄ³k5(àÇ5\'¢ÇŒw¾½/XÒù¾bæ´ñ=¾s§1oF^;ñïïw<¹®Q ü:çÑ³»—Èôz‹xıò³°9K¾½Hà3hÂ«ko)ÄæÏ\"pšØÓ+ç/Ú™ØdâÏ_òqB‰€ôZCA±ÉéµzˆMş\"Æ¦œZ¶&{è’n¢r=àÙŠbLÄÃ³ ÎçY–ˆt7Ÿê/%\"©oÏV²ÃAûîMmÚB–?ƒ¹=\0ğ2ääªJŸ z’Õï×J2÷Øí´¦™Ç£»wó(~gÃğj½şíÂÁEF’ÚšùCÈÔüy%Ì+©İÔÛz!<¯gkù“©š{k>ı8ì¼Zë9Ng@EBÚ\0T\"m‹2VÒpïMY—%õÄô8ÿ-}ÜîYKnóÆ«úv|}ü?§üT¸_á¬(SoyöŸ»¾÷GÉÉ*‰“³0äû‘Bw¥™›Ë¾½næŒ2;}°bé«\ròêgDvÂÜ¤,=‘˜ˆÈMJ…©“èêÇgn$…œÛ{Eá¤÷û½úÛú,z¼@‰1e*¡q>Ï²DÚÈ#GãIÿù+=L<·\'$§E›‚#¦™=\0ğ2Ã%âP£Éôk!9tîìÑH§îİ‹JB§\0?yzd®½W:uêÔ©ãf¸ğçŠıqSç\"eš_P;p_îÉÕ{\"Ü–Æ¦^Üv&»nVN(“ª1¤\r@%bl[jœy|ç·å]ûÔ}RxêãOí¶5ÿ‹w_ëİ±¹BSô1Ğ¯,—shÂşşìÓw´J7¡æQĞ¼:íë˜¾b™Ë¼ğóÜ-ì¨_V9´he+®İÔM~5ÚØ?\r©·o¤(|}L>½OÚøÃUøcV{¥Cïy«~[Ï¢Sï¦b(ÊT<–Äù<Ëj8$ë8cùÊ¿Ìì¢È»¸çVö“KÉMîY\0€—\Z\nl°KF·î(âFò€~Í™Ë+ÿµëøìÕ„²€‘¯Öº¾tşŸ\'n?»yxÅ·koÉò‡™å‹xªøˆˆ˜5÷ä5¯¡ÉùK ğ2s¼Äª©ı°ùø¥7.úëëióÏÚ¾öá`<\0¯ZCÚ\0T\"Æ¦ÙÀ&7Üwª\nã‰•R.ñâÑw#Âo]µà×;zMjl¢ª<ß\"×úŠğmß/Û}õAØ}Ë¿İ¥é<¦³3Hä§/¾Z}#û©µ²)ç7ñ»¿ÙÕ6=6Æ(Ö8”™K—¡3v.şãÈíğ{çÿıaM¸kŸÁ¦o-fÄu\nx¹)B7¯ÚöbK~0CÑ˜MÅc2ÎçYö	õƒ§Rú½Õ«‰Æ=F÷qR_ŞœU¤Â6±g\0^jø{¬ƒa–57Ë²VEÜØ®¢q¿f¢s”ı{”t·Øwìß²K~ûáÃjRÖëùşâOÚÛ0D$©Û£rşÒ)c›/Ü»´Á“×?•8¿©?÷Ä¾o.]åú×Ê›¾?e i­&İ§-Ÿ4´‰÷ÑVoH€ÊÄØ4ÔJ|ña^uŠv8sÏß¿´`í¼)›øıŞùòSé‚ßp¯ël‡r4ÑîÓïŞ[ºtõg“rIéÓcÊâO:Ø1DÄæD\\<äĞå£§fWG]ŠĞ¥‡Ì›päÉ´Úo¯[7Î[èÚŞÂ¤ÿ-ûñÃ]\Z}Ã³ÿ7¡AÅİe:Îsçˆˆo\"SÓÙçX¶PŞİ}§3<‡½â[´h×<ĞcÇ¿»¯¥¿S8ÍÄ\0x©1nÍûUuPáân,uĞĞFånbÒ¤I#FŒ(ñiØ,ËnÙ²%&&fåÊ•åXy\\b¢»«k¹cƒ—Ò,‡lyÕ|ëâwÌü£Ö×óMS/™j®PA°ßÁŠJ-šp¬cÆŒK–,™8q\"ÇqÅÎT§4hĞ`ÆŒU\0\0¼ŒIÇÿ<ëûÚ7Šª\0\0^(°Á:üüüÊwv\Z\0\0 ¢ğì;M_Ü[&À\0\0P9P`\0\0ÀŠÊe¥Ï\0\0`-E\0\0\0\0\0\0À\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+@\r\0\0\0\0\0\0`äÈÉÍ«êLªÎ±Aµ…´Ë![¶Ô H×—ö;T\ZœÁ\0\0\0\0\0\0°Ø\0\0\0\0\0\0\0V€\0\0\0\0\0\0À\nP`\0\0\0\0\0\0X\nl\0\0\0\0\0\0\0+@\rÖ;ıÓOè? ¿úıgœ2ıÓOâãb­Øâšqß\\vGStRŞõEÃ}¼7AŸyúÿíİg\\WßÇá³ËÒAD¤)Š‚(bï%6ì\n–D£ÆnÔÄXbWb¬‰Æ†-öŞ¢†˜ÇÛ^£Æ.±;±7DD± eaËó¤(‹Gı^_àì”ÿÎœÎoÏÌ0üókoÇËÚ–>ÍÆ^œİÁ÷ûmaÚ”%œ\ZÓºÅÈc/—S?Ü0eP÷6>-|}Út8uÃ?Ö¡şoaŸ¾}7=Ğ¤ZgÌùY|Zø~¿3\\\'«x¤d°ÙìÛÚ§…ï›ÿ†\nã@ïî=7~]øÎ¡FŸJ~*°>öÎŞ¹C;·öõiñå7Ö}ªMgi!„ˆxd™_÷/|}Z|ÑãÇeGÂâ§kŸ]7¾÷—¾>-Zw6ï¯{j}ºÛM¢	İ6¬m%×Ôo¾dpYC5¤d¨ôëÌú²	%GğkåëÓ÷ûÉG‘Ó\Z>ÙÓ“Œ»±²‡ï·î½úüèBÄœ`¨[òÜĞ9¦røûû»¸¸:T©Lã[Nàïï?cæ,Y[¬S#ßæcGïªK{˜&N‰¹~à\\l‘UìU¦/?k^¿`t¾?Š9=¾ó¯“–öõ4Mõ³Lñ!Û\'\\t¥P“»–È\'_9ğÇº	o\rŸ;²^şÄYîì?Ö²MÁ¤ÏaÌ»_J-©l6µkW®Pô…V{eéØ•êNãú•³T¡°r±~”î:9Ğ€aï£ñëÔá¶Î^q5Ú3i’şù?sı~½Rñ»ñ}=nì\\8oÂ/yOöq2ØËQ_ımô”¿œ»úÍ¬dv÷¯ó§ŒQ9Ïí^ÌT¶oò„/›|?ÕÏåÅ‰3f7-´ w	SÛM¢y¸gÎª+jëâ¯Ù`\r)—3TOzuÊX6±ê\'§w«lMîıu(äóN®Æ)_ã´†\\/\'ô$\rv!†Wé5mz»4»%VŠL¾a|(lÈ<tèP{{{C3´oß¾wïŞ·X¸n\rÛmGC¾öp3B{çğÙ(×/«æ7ªb­{“¸­ÌĞ†íŸ½ì¼K÷9S¾,’pº-]¡’‡ñw£—o¼^ã»\"B…}Ùa{ØªKâ1:xo®ˆ»åİl«ú£g°Ù8äq.àUP!b¢ò)¢]J”ô²Nø{1½5r ƒŞCã×„nÑgÉU)/ÂÓ==µñ˜®Î¸~>å-„pï3âÑ¹ï7ïĞ¸Saã´W£¾¶uï“Ò½§~YÕN)ŠÔw×ß÷;+q|GpŞ3zÖ÷0¢Èànÿ|³a×.%¼Tin7©ª‡ûæoµjV!ÏñŒ×l°w“äy´ái×Sâ™:Íä,ûj\r»¯Ù6TïÌŒıï}Ùİ-©2NkødO2.ÄÍ\Zß•0Ğ-AÇ%âC¯×§9vD©Têõ2¯i1-R¯ªÍ£“a‰×Ø¨ï9ıÂ¥^U{Uª+ºu/.ü9©O{_Ÿ­ºŸà¾Z/Ôÿ-ìÒvÂéØ§;‡¶õı¢{›¤Ÿı£Óš?S4aG·]1«ÛÃ·Hò—™\n«Ò÷oWÆ\\§B¥mÅ&Åï?úê*¡¨+{ƒTÕ\Zy˜s}oÒi6™Ã{kã×=?ÿû¤¾í[úú´ğmÛ{ü†‹‘:!„æŞ†>íÆ¸~à×í¿\ZÿOªË±UÆ._±rÕâ1õm’Ã³öùƒ§Â±dÁÄ¡±c©\"&açïD:ëc_D[ºWòHRZØY*â¢ãô\".ôòC÷r.	+2²õ*kuóv¤ÎÀv·şè¯ù›Í:}]%oÚ¿Ó^Ö`\r\"îÆÊ>-†ì‹0\\Á:³²ìë4á\'vßÈSµ^åZÕíÃ¸“âJZNkød{O2]äJlÈ¡P¼ı—jFæyfE½«æ	=z:\\#„ñ¡Ç#\nzWwL”âïn\Z7a§h8dú¯Óhe{jöØå—bLÜºÌœÿ})“<uG-X¶Èá«Ÿ—,o”Öü™:ÃÅ…œ{ (ZµhêUşŠM[Ô*œØQä­ĞØãÉÁ#	÷±é£®ìù×¸jwóÌl”‘fó.8Ğ@:ÒoüúÈSó~ŞV®ÏäygÿÔ©Pğos·‡$ôtõñ·7NYyÛÕ·‹oQ“T«42Ë›ßŞŞŞÎÖÒ(y¢ÒÒÎBÿìşÓÄn²62ä‘Z÷\"<ÊĞ}Ø\n›šc—ù·KßÖ>9»ÿ–ªHY\'}Üó§\ZóüI—…\ZY9X‰—á/5¶+„ÚğÿT¶ûæ³|¯½ğ–š\rÕ „ÒÒµJµ\ZåM„¡zâ\rÖ™•e_£	;ºç–U¥Ú®V.ŸU¶}|xßí	›Ó\Z>Ùİ“ÌH¹¹—¹›weË{‡‚\"tBhwªW=õ\rw1—6?©=thÛj%İ=«·ê×T{ğÿ.D©¬ìmÍ•F–vNù^ıìh«Nsşt¶şÖâ¯[§xøDû	gµz!„>.2JkbeiœîéQ™·|“â‰BuyÏ9Óê\rİåŞ×½½Ù¤…\rdJº_§Ö»5ë5¨›w©\"…İ+4hàn\Z™˜‰ãÇÔÿyÊ.Í+gäú£|¼‹>İ9om`X¬úiğ–n¡Ófäa[ñ/úñ×Ë…¾üº†­B«*å«´ÂÈÄHhââ\rÿĞ†Z°!î‹ïêÚŒ×ïXƒ*§ú}ÇêVÖÊ`=:ƒufeÙÔ4í»gQ¾®»©0-\\§¢UÄÑ=×c’_æ´†Aöö$3Ö…@.Ä=ØÈÅÌ=\ZV²{èÂ³fucÏ	s¬[3õYQó$øÚóˆ¿¶{SLt¾öDSÕ*Íõœ¿J^ƒ58}1vD»¤Scì¥ù?,B(Œ-Í•q/^ÄéEÊ¯ õq·o=µtu³Iø¿Ò¦|SÏyk‡´ïœÿÒîófÕ\'¸™(ex 3ŞÖlÒÆ2%½Æo”¿z»vwÿ=üÇò+×oİ¸rñ¦Ú²qÒrëÖv11´Ö7¨\nøÿşúOsêµYU‘&]|üvÑÒ$ıQ½:ôèª)³¶?òê6Å¯»©zc3•ĞÄ%]š©×Äi„ÊÄ`÷W÷äèÂß^¶ø¹±“Jˆ7†€3âÍ\ZRR¨G™:³²¬\"şŞßû˜–í]ÌLaæV¯¼ùş»¯õ.UöÕ 5§5|²µ\'ù¶.„ƒÉ;—\"`#73÷hPŞtÒß—–zq8$­Ï\n¼~gœB¡tl5ft³—û¨ò8\Zîš?&íÙ…P˜Ûq+æ˜4rıÔÊH\'„0-PÚI¿éÔÍ˜º,’gW_];Êïfçå3&NPæ)×¸äÜÕ‡î6/¾ë¢EÍ‰EMÅ½¿}dÎ[›M\Z8Ğ@&¥Óø5wŒ°ôqÅÏ}ª7¨Ú²Kó5ƒ$-fd™ßò.²3)ØhÄ\"ï¾Ç˜Ùå7ñµÊŞÉ:5è^^^7ntÀójßÎœäãa•0§ÂÄÆVşâÕ¥åÚ—^\n+{KC%õ½cçÃ¯öi½,iÒ6Ç}ü÷ÉĞ³„Ó¬!%Cõg Î¬,+DÜİƒ\nõÃ	|“\'Üy%ªlÅW3rZÃÇ [{’oéBø˜eáÂd\'.G®fQ¼a9£+<x×®V­×ÏŠ*;Ow‹gw¢ò,T¨P¡B…µÿ¬Y¾ç¡ÎĞ‚ï:zTÎµ›¸GY½3ÅMkºˆÓ›¿t­SŞ.ùŒ©ÈS¶©×‹CÛvm»dY³~a®¯ûÒo6ï†\r¼…ÁÆ¯	;²í‚MÛ†uká]­LËØ—)ÿäì»=µC}cıØQË®Ä[Ù;Ù[«ï?S¸J!Ã4ı‹SŞ¤k;ı×-R&[çRNñ7ÿ½ŸğyÖ>½|î‰¥[ƒªÇ´dŸ9.Jø7sP+[ï‘s~éP4CCï†jHÉP=©3+Ëªoí=n^uÀ´Y³ç$ü›6°¦eÌ©]_&_êÊi\rƒììIf´Ü†€\r92ò„p¹OO`áÙ°ŒâÌÊ5Á65ê¼y5¡y‰¶>çæMYsøò­÷¯ğ_{ÉÜ«€©B™(bŞ¾óà‰ZŸü³²¸Áùß™ª`ó]Üo¯æ7gÓ¡ÓçÏŸÚ¿~òˆ)\'ò´èÓ´@ªAëÒM¼ï8oY«¾+ı“#ıfón8ĞÀ[jüJ+s}ø©ƒ§ş»}óÂÁUÓ–^Ñ¨#BÅfäÎé×™8xXŞÜ<sá ë7Îï^ä¿C]½]üJ!4,øé—Õç_¦úı£{¸ñ„Q­/kæy\ZòàAÈƒ!¡	2³¯é[òùö9+\\¾y-ğ_×Üt¨ßÌı¿_•ôLó%v£*TÈÉJeœÇÑ¥@^ÓŒ|7`°†”5ªÇ`YY6Yì}G\"ì\Zu¨WªØ+%ë|Yß.öì®ó‘)6§5|²³\'™Ñ.räP(:]z½\"N\'ù)â	ÛµôjXÆ$ğ«Fi%S·?ÕÍ]úëˆjaU´î×úU¶V!L]ëT±2wè·eFüâ‘üó”4çÏÜ¦n_Nšã°~åÎÜ©f¥j}3­‡o)ËÔ»Aa]¦iyÓÓ·êÔ-”Å¨‡ŒzK³yGh }\Z¿2½¾=ÎL[÷Ëÿ3²-Ñ°óğ~fÓç/\r¸Zsm&6Q©ß¸óæ®\Z;(ZX©Óëç¾UmB]ÔS\'lköI5»úşéÛñÏ®Lî yšsÇù:6vhè7&|öÂ#¶«•y‹72¾Kñ÷\r× O¨¹F!„‘zM×eaÙ$1W÷}^°Uó¢)§šmÚ¤à¶?vüû¬sÒ4NkødoO2ƒ]ä.\nçòM³»¼w‚v½uK—/»ºÉô&†ìââÒ¾}û4ÿ\Z¶N§¸ÿşŒ™³2±ò/#óXYgº6|šh6È8ZKVäğ½§}¸uÜ\nG¿QÕÒ~&>19¼¹â=á¸C¢;wn—òòJgF°!Ç°aÃüıı{÷î­×ë_©N˜âéé9lØ°ì*\0ğ)Ò†ZsÂ­åhËì.\0ğ‰ `Cç37:\r\0Àû¢Ì[}ÀÏŞæ*.·\0|l\0\0ğ‘R[˜¿}.\0\0dá)â\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€‡œ!™•¥Ev—¶/#slmÈ±h6È8ZKV°÷‹Ğ\\?Mw|HŒ`\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0ğqÈqíÚ5ÿàà`½^¯P(R¾”0ÅÓÓsØ°a²¶¸ ÷ŞÊs~QÖ,iRÔ©ñíF>è¹nAıËƒÚ-¯°huO7c)ÛÒ?Û? ­ê£®íZºpı¾ h¡°.\\¹i×=ë2UZB}ç?\\p,¬P¯UK:¹òüĞ6›¯Ú¬}Zóæ¥Fÿon}ãë†´^ıàØú%kwœ¸ú$N˜Ø¯éÛõ›¯j:\'¼\Z{~J»{\"S­QáÙªÔõ-\rl«AŞôÚk¨¯ÌîØwKDÑ>k—´wIq®‹šÜaÈŞHA‹Z9dş[~İ£­ızéºaz\rË„	ú˜[»æO_¾ûJ„ÖÂ¥ZÛïGt­’Ï(½5Ä‡ş½dêÂ-çÅ›8VhÕgx¯zÎ&B¡8µfÚœ!1*;¯¦½Fôoâšâ¬şÆv“hB6\rêà9{Mÿ¦¬Ù`\r)ª\'ı:³¾lÂ^}²wp»Éç\nõZ½¬SáÄ£ø,ğÁdOOÒåö¢.ßóY¹²kB/P¯=ñû’5ÛOü÷X-LìŠ×lÙ½ÏW5ãıZùÒUÈèßC—¡C‡*•iüZÕétşşş‹/–µÅúµí6úû¶º¬ç«®LôÕ}gcÜºÖpP™FÖmÕØÅ&_ğÑ~m¦9ÎX?ØË4ÕÏïBº}Ì€™÷«ô<­¼ƒÑ³k[<±„ùêk\Z>ïÅ^\rX˜§‹ÿ/õ‹8©ıZdf»ÈƒÍ¦^½j•İŸk„1ç\\¬î>epEK…J«Âæ·ÿ`ğ@«oÿé×gA°kóî#{yæÓ=>°jtsıOmëúª£ìÜfœ_½üIÍÑÈÒÎBİ02ÍmYó+™[»>lÓ!9IÁp$\0\0 \0IDAT‡E_Ùq<2½2@¯~ôçÔÅÁQ^É“ğä±ÊÀ©ƒ½Œ®m=cÔXÛ5³[;ìå¨ƒ—›°»@Ïñ«šßŞ½pæ„áªË¿)nª}¸sü¨u‘>#æŒ+ôüè¢_¦4s]Õ¯¤™í&Ñ<Ø1mÉ¥Ø<¯Ù`\r)—3TOzuÊX6.üäÖËª|&wv¸×®{ÑTAã}YàƒÊş¤ñ÷6ÿøí¯—\nûtÑ³¤¿´ï·•£z_ÿqù˜êıæÎíLW!w\"`Cààà¡C‡ÚÛÛš¡}ûö½{÷–¸Å¢\rjåÛtüĞ½>ÅrLì­§^ıª†½‘Pÿ²_q‰ÛJ“öÑÑÍA¦MfıĞµ¼…B”­PÊæÁWS7í_£¾Á„­‹‹Š·,Z¾”›‹™ˆ¾ş¾KÄ6\'›‚*›BBec¤ˆ.\\²té<\n!„Ğ>Øhğ@[…lşeá…¢ß.™İÁ-á—jùªµªĞ{á”í5ç~Q@%„\n‹¥J;¥Ksimø¸(*|¸ûĞƒ¶I£ŸQ—wÖ¹yXİÎì*56\rè67X#DÊ»Üô\'×ÒyOÜª’¥ß}x¶×Ÿ{îût/b`ğ)6xÓÎğ²ıæt¬™_)<İF?9Ó}ëş»İ‹»=>²ù’í¾k\\ÂT7¿Ş\':¯Ùv­gÉ2ª4·›TUèÎY›¬[V¶9œñš\rÖà‘b[–v=^ê4“³lâ\Zßö_>ß‘\rÿùeÏ¾;¿)–TÙ{8²À—í=I¡}¸{Ú‚ B½—Îé˜Ø‹(W¹j	ãnÃ­»^{PÉÒivKóq\räĞëõi]\'Q*•z½^âMİ\ZÖÌvôxhâå3ê;ŸnXÓQ%ôÏö÷oÜqùÍx!„îù¹õc»ûz{{7lÛæŞ»j½P_™İÆÇ/06bk¿¦ŞM¿lšôóàcQiÍoè-ë´Zù\"îÕŠ|5¿Ÿ8¦“‡©BhœZıc÷ŞŞŞŞ>]ü–Ÿ×ˆø›Ë:ú;õ|ïÀfŞ>íSoF:ÍÆttÜ­ÿ»fëÓ¿µ[òWÖ\nS·Ïû7É¼iïı4®ì>)Ê|U|Š‡ï=òêÃğòÒÓªšÍJ˜\'vuÏ‚ÖéÑ²¾···wóN~kÎ½Ğ!4wÖtõõ;ruïôoZ¶ô;‘ê©rlöËú€€€µ“\ZçMÏšg÷#„Si—ÄˆhìTÖÍ$4èV”¡¸>öy”•GUÏÄá)#Ëü–Š¸(µ^¨\\5ñ¨T(á#mdW¦Bş—×o¾ĞØníÃİ³6šwïSİ6íß‚i/k°wmQ{oïïv=1\\Á:³²ìë4aG¶_³©Ñ°ZİZÿÚ{KüÒ[,d{ORú÷¦‹æ\r¾MÕ‹°.×ı‡¡Ê›ëdvšña°!Çk÷]gzw`æŞ¨†MÈßa\Z!„ˆ9rüI¡FŸ9¥\nJñ·9j‹hòÃ¼%ó&´ÉwrÚğ…¢MŠõ\\¸|xY›V­_½`õ«Ÿ7Œ©¬Jk~g8•Sİ¶•õÇÇuïûÓ¢¾+,\\«Ö©\\È\\!Ô×V±úgÏ)Ï\ZP5â÷QC–kwøuÅUÌ­jY±aåü5)¶k!sÇ =i6©>Ğ\"òú¿LKÕ*úÚ¸…[­ÆÎÜxÉ/G|ê”¶•}J<Ş÷wÂ×Mú——vœ1®ÑÔÃ<áUı‹“3F¯	­8`öò•K¦õp½¼Òóİ„®>îæúñKnmİós÷Ô—\\\Z™ÛÚ;88Øç³LqUˆÒ*¿¥şéİˆÄn²öÅ½0µîÅ£—Zu)òÖ™´~~§Äñmmø?{n¨Ü*0ÑÇ=‹ˆ·°ÏójÕFÖÖ\"òQ¤ÆÀv…BûhïìõÊNıëØ¼å;Íe\rÕ „ÒÊ­zÍÚL„¡zâ\rÖ™•e_£	ı{Ç\rëªŞE­×©/üÀ®)vºGÈ²»\'©¾t_áVÓ=õGe_Å÷ózEø¶*#`#÷2/Ö¨šÕ§Ÿè„Ğ<8~8¬@ƒZR£/ü¶ñq½øê³R¥>ûjÔ8_í¾ßÿ}©²vp²3W\ZYæwrv´w|õ³S>í¥4ç7”°}\'ÿ6w„o¡g¦ïİ®Yóî£W|/DÔ…u›îy˜:¼uµ’ÅË7í7qHÙ°-kƒb,ó;Ú™+,ò;;9äwHŞnºEƒ\\oo6¯3x µ1Ïb„•Õ½j•u>sı4&aDHcîW\r½“<ÄmŠøt(m+ùx>ùëà½x!ô//l2ı¬©Ç«¯¤tj}±}ız7*ëVÄ£rã&¦/Ã\"3q|xt“is~øºU5‡ÜÌfdW¹¡{ÄÖË‡Æ¨#.ı9kÍM!tš7eßvxÎ°é\\;õ©•O¡Õ•‰Ñ«s²ÂÈÄHhÔñ†¿,Ó>Ú?kM\\û\rÒ}¢Ú;Ô „Ê¹ñàI?õ®`m°Á:³²ljšûvİ±¬Ô ˜™0-â]ÅúÉ¡ÿÅ$¿œî‘r‰ìíIêã^¼ÔšX[ÓüØp6r1‹MªZÜÿïÓ–\rbÿ9ê\\¿vê³büãËWŸ=¹7°ùÎü÷XSÓ:ÍõiÍ_ÃÖ@*»ÒÍz•nÖKèÕ¯ÜµnÁŠFÍ_Ò\"øfl†íû[J»òµÅmº®©á”ùwIŞÖlÒ’ö^ŞŞÆ\\ÿòÉ›ƒdšÈˆaakø\rfö“ÆÔõ3¥eÁ×>|Ä”y+ùzÍ\\~à^ç¯í/lÿ×¬ÖÔb¦ŠC	¯ÙÖ¹Óí3Ö-¸xõÆµKç®«­š‹Ä~¨Ò¥A½Âo<QÛ •Ëçc†_åÿcÇB¨Ü|{¶vYqŞÊ4ıQ½:äĞâ	SşV¦÷ì±_y˜\n¡76S	MœöUgX¯‰Ó•©Áî¯îñßs–G~îïã¬\">ÃÕ¦[CJ\nõ(3PgV–BÄßùkÏ}ÓòıŠ›!Ì‹5¨d±çÈöà~e+¼ºâ*½#äÙÚ“T[Y(ã?Ó‹@}Ü“›7\"¬Šs4#yçRläf%šV2ı×…ˆ²Ï÷ß³¯W×åõ;ã\n¥S›I[¤x’¬±M:!CóG¿9«öñß³ıË\ZÚØI%„Â4‰º]~t|Şù»#Gî7y#AqŠÌAŞÚlRIç@‡t«_ŞQ½÷Ø­Ø*¥RÜDß8\Z_ µ»¥Bh…\ns7âNYŞr1¥MŸRÏ–î¿İªä¶sµıİMÅÄ—4¶Œì=?¼J»ÖŸ5©ÙæëVËúÎJZÌÈÊşÍ‹CÒcR¨Ùè5†‡Ç˜å·7¾4¹ƒ±Cët¶>òÂÊÃ~{şÙ€…3Z{&>•Wa’7ŸqÔ£\Z!L…Bù0RX;Xê,ÅŞ9ôèÒñ®&MêÓôHëùkfèYÂiÖ’¡zŒ3PgV–\"îöŞ}¡BúCËúÉm½ô²B•WgÌt,kdgOR˜,[@ÿÇ‰ëÑ\r*§è8ªƒ—t­ÇúE­é9äV\\\"\\ÍÒ³iÕ¥İÇî»¿^½×ÏŠÆù½<,ŸŞ²-ìêêêêêê¬=±láZCiWõ.ó™™??¿çƒ!)Î°ÚØèxafmeïéföàDPxâÈ¦.âÜÑ{ÆE½ìùB+gH¿Ù¼&mfV´Y+·§;n»—ôš>öÚÿÍÛéùEã·¬øD(l*ø–~¾ÿ[7]°¬Ó¸hrğÔ„şı¿ó~5áÇ^_4ªYŞÍ*öe\\ÊÅ”ïòÅ¤úÚêáC^Œ³vpvÈc¬¾u$(Úµº«á+–õÏOÌ ûjîÒ1Ÿ§L¶¦Ë:Ç_?}/áncí“A­Š¹üS=æ¥¿_²ê•E#«[çk4nÉÌ®î\Zz7TCJ†êÉHYYV}cçşG5‡ıºø•¹#j[EŸÜz>2ùRWƒGÈE²±\')T½}=¢.İz3ùº\'\'7,Z¿R~ÒuîEÀ†yB¸Ü§ˆ\'°ôjZ^ñÏâe—óÖö~ójB¯­ÎÎ˜°ìÀ…×ÎíY8iÅy‹ÄÇÌ\Z™(cBoŞ¼ÿ8VŸü³²¤ÁùßdU¾[‡b·–ô:ûÏƒÿü{îÌ‘­‹Æß¥®Ü®~›2Úúoşè¹»Î]¿~~ïÂ1³şulİ¥âë¨”5àCJ¿Ù¼&­RşbTïW|Ûòº=ÇÏœ=±wİ”~ıVÜ+ß×Ï÷íŸEr>eíZdY/U\nSšZ›ëÃNî;qåæõsû–ü<ï¢Fı$$,&3\'DÇV×7N³åôÕkAÛ´Y]«s-{¥šĞ½³~»4(2ÕZu¯?bT¯S›§!÷„$<ÊÌ¡öç¥ŸıoÚ¢½®_7}ùuÇÆ-ßZ¬0µsq}¥°³µÊ8sá‚¶z®†Á\ZRÖl¨ƒufeÙd±Wwşı$Ó.\rË¥tıóÇş³õß)¶#ä&ÙØ“*—V#¾.~sI¿Óßtr÷ªñı\'µùâû.t\"r1äP(:]zÏ“Ñét’Ÿ\"°]«ÒMË™;aİ¬~ZAÉ´X×é“tşó§¿>VX»7è3mpõ<\n!„YÑúÕ¬\'ÌèÛµüÄm3<“•æüiw÷Lİ»ÌZd¿biÀÚ‰[^è„ÊÖ½ºï¸%ë:	áÑmÆ4Õ¬yóm‰.ÕÚMØÍóõÓkÊ\Zf}Æ}¹Ğ[šÍkÒ;ĞÂÔ½ÃŒ[²öÿü÷>Õc»â5;NšØ±†sÆo>vŠ<å|+™¼Q¿¡kÊ†Ò¾Á >?¯×wƒQ>¯¦=Æ1ÿyæ‚µÁuüòebÕ†üòÍŒK‡%¬İê÷6¸F^…B÷òæÉãGòÕ˜jöØ»7ãŸ^\Z×soò´‚İV®ì^ÄØ±Ù¸‰¦Î™ùıfµÒ¶ds¿©=ß8yËa¸}BÍµ\n!ŒÔchº.Ë&‰¾²ıĞ³Bm[KšMİ[ø¸lZ·åÌÓIÓY 7ÉÎ¤¦Å:ÍXâ¸jñú\r“w¾Ğ\ns§2õúÿúíçe¬¸·07S8—ošİ5à½{´ë­ó\\º|¹”—W¦7ñí·ßº¸¸´oß>Í¿†­Óéîß¿¿xñâL¬üAXXGÇL×†OÍGkÉŠ¾÷´¡›F,r\Z?ÁÀ3‰ğ‰ÉáÍï	Ç½541‚\r9†\ræïïß»wo½^ÿÚHuÂOOÏaÃ†eWy\0€O‘öÑşeG‹}ñ“Uv\0øD°!‡‡‡GæF§\0x_”¶Ÿ\rÖÈBÅå–\0€ƒ€\r\0\0>R\ncK‹·Ï\0€,<E\0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6rş²2fƒŒ£µd{¹ÍõÓÄqÇ‡DÀ\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$PewÈA.]¾œİ%\0\0\0\0@nEÀF²bîîÙ]B\Z<{f—7ovW\\†fƒŒ£µd{¹ÍõÓÄq‡\\×oÜH.\0\0\0\0@F°‘L¯×gw	iË±…!\'£Ù ãh-YÁŞC.Bsı4qÜñ!1‚\r\0\0\0\0€Œ`#Yız/Ç†œŒfƒŒ£µd{¹ÍõÓÄqÇ‡Ä6\0\0\0\0\00‚d9öë½[r2š\r2Ö’ì=ä\"4×OÇ#Ø\0\0\0\0\0HÀ6’åØ¯÷rlaÈÉh6È8ZKV°÷‹Ğ\\?Mw|HŒ`\0\0\0\0 \0\0\0\0\0	¸DÉrìõ39¶0äd4d­%+Ø{ÈEh®Ÿ&;>$F°\0\0\0\0€l$Ë±_ïåØÂ“Ñlq´–¬`ï!¡¹~š8îøÁ\0\0\0\0@F°‘,Ç~½—cCNF³AÆÑZ²‚½‡\\„æúiâ¸ãCb\0\0\0\0\0	ÁF²ûõ^-9ÍGkÉ\nöršë§‰ã‰l\0\0\0\0\0$`Éî‡„dw	i{šİ 7¢Ù ãh-YÁŞC.Bsı4qÜñ!°‘¨”—Wv—\0\0\0\0\0¹—ˆ\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0äH±ç§´ô~Mı¡Ç_>Ûß¿qÇå7ãß÷æ\Z¶ùnÚ[1ú,­UÿªM—îÑÖïZ?õz-‘ÇÇ~Ùk˜6ıÙˆùw¢¯·÷×koÅ%OS_šñyÃ¾{\"²¶Ò{~JËú½6=Ô¾}ÖA•İ\0\0\0\0€AÎmÆùÕËŸ40hdíja\ZZ·Uc›Fúµ™æ8cı`/ÓwØœ^óøÊå‹ıı,Ü×ô÷ÌÈ¢iS˜z—j³N¯~ôçÔÅÁQ^o¼òìÔæË®­:¥;[ún­™½§ÑÌNFY*òİJ–}¸Í°\0\0\0äX\n‹¥J¿ç¬¿ìWül®\\YÇ‡AıCûxÉ|p2/şŞª}ƒæÁ¦İæk„Hãbe]øñ-·J|Y%Ÿ\"İÙÒ—×3ßÅ%×šPÛV!£â\r—ˆ\0\0\0ÈvºÈÖı¡{û¬I]kî¬éêëwäêŞéß´léw\"J÷,hÍ]}¼½½½›´0û¯8õ•Ùm|üc#¶ökê=øX¯…N¢4µ2Uhâ´q¯mHİósëÇv÷õöönØ¶ÿÌ½wÕz¡<1Æ§ñıO/—ú¥µï˜‘).×<9µúÇî-¼½½½}ºø-?®BhBz4şfË£ÄwıÏ¨æ_Ì¸¤âÍ·óÖ‚UÍ~Y°vRã¼Æ¯½¦yxhÛÃrŸW°Q¤;[úŒ\n·ÒÆêÈœ•ç¢Ş¸*<}\"´á{ıš{w[qM-„Ğ¿œüyÃ‹¶NÍÊAyµµgAkÇôhYßÛÛÛ»y\'¿5ç^è\'g¸\rD_Ú°r×•gšÌ66\0\0\0€l¤}şßŞÅ~]:ŒÜnçhñÃ¢ú¸›ëÇ/¹Y´uÏÏİµgç[RyĞœ¥Ëæú5Òï:yßs·—/kbÓ`Âª\rc*[¼ÓšŸ\\Ù¹j[¨¹g9GãÔ2¿ıûÈQ[D“æ-™7¡M¾“Ó†/¼-¬JûT2¾²ïb¤^!Ô·Õ–kVÚ*iêk«‡X}Ï³ç”‹g\r¨\Zñû¨!Ëƒc\rıæÛyôÖ¯ŒÌmíìóY¾~	·&ä¯]/ªµ.m™şloe^²óàÆÚí3ÿ¸¡N5=Í}¢7²o0dPµÇë§ıßuä™ÅÓäë2ºG³¾™=(Iô/NÎ½&´â€ÙËW.™ÖÃõòJÿÍw5iî4ÃmÀ8Ÿ³úÀO:şuÛ…\'’î‘çq\0\0\0\0ÙBóôÒŞu+×ìºW i—Qk\'–Ê—F:Ñß˜ûUÃ¹Iÿ-;~ëœ:)_n²|i77¡¶ÿq´ÊŞ£´W1gU1×±ÿ57VYÛ:Ù™+,ó;9åËÀı·¯mNU´åØ~•¬÷SnHDŸ¸ñq½	³¾*k.„ğ•7¬óˆßÿíY¦F©æ•Œ~Şw%ªv5«¸»‡OÅ•PÆJ¼z<WÔ…u›îyømxkg#!J›¨¿ŞyîÚ \n§]IÜó7ßNæŸ%wk×¾ø:c‹›ez\r¯(òTş¦Õ®Sgïh2û»WS£/ü–æ>©iíĞ`ÈÀ=ü~şéa›.‹:¸›\Z‡w:(iĞ©õÅZôíÖ½Q13!ŠÚ6ñX>;,R›öN3ØŒëõ™^»ãµƒ¿¯˜Úmµ­wÇ¯»ø–w0ÉÒ¥ïl\0\0\0\0Z|È_‹¦-ŞîæÛmüºy\rç’í\'©ÿê!gJË‚–B¼Hñ²Ò¥A½Â&B¡°©Ú£]Q¿i[¬-Y±BÅªuš6.cûÎ´I›S(Œ-\\œmŒBhRmHóøòÕgOî\rl¾3årÿ=ÖÔ,RÊ§¢ò—}W£«•}tìDT™oËX)ÄóÄwü$øfl†íKRÚ•¯](nÓ¥ğø´¶œ·óJìÕ­‡M\ZO.j’Ù¤¤´«; ç¦îËç®;Ú1aR¼Á}bmläĞ`Hßüóµ[ÔŞMÎSÆŒì?ëÜéö™ë\\¼zãÚ¥s×ÕVÍ…>3;Í(GÃo&×ïxóğÆUsz®5¯ıõ°¾îæ™MÙl\0\0\0\0Zü£3G.jJ´oÒ¨fñô{Ê\0\0¦IDATtÒµ\ns7â©r–j×ÈÊŞ*ñE…uùolms=èô™3\'.÷[ğùì¥Ê½STJcsonH(J§6“&¶pN®ÜØÆY%V¥|*ê§şu=Òáò‘¥¿.c•îÆÓ~Q¯Ó§÷v,3ı¢.nşÇÆg¶‹¬ø§*è3ø«ÍßÌ[~vÄ«›\rí!„>òÚÙÛ\Z¥xtäÀõnÅK½ëm\0iÑ<Ø2²÷üğ*íZÖ¤f›¯[-ë;+¡ŠL¶¥UÑª\ršÜ½ñßšã§îõòÉ|Àæl\0\0\0\0šE…ëÆ×‰Şâ÷U¿Å{ÿ{é¿s¬P&f!ÍÃ‹fÿqÛÒ£Z“}Ç-XÔ×íáßûo¿ıÁ`ï¼!U~/Ë§·£l»ººººº:kO,[¸ãV!¶öÌş3ÇEx5/c\"¦Ûyº™=8øNuçŞ3.êeoldl¤Ğjµ	±ZóôÎ#µ^îÛÑ¿Ú|Ş¹emÇ¬ıi­TLİÛmi´{öú«±z!„±á}¢ñÏÂG¿›;©qÌÆ)ëş3|×yÆiBÿşß¿y¿šğc¯/\ZÕ,ïfû2aÇdj§é¢nZ5®G‡¿…–¶6`B½|YHÉl\0\0\0\0Â8¹VƒælX;ªNüŞq:_°ër–èldn\Z²oé/ó·Ÿ½vçÖ•ã{>Pò´7ÂÈDzóæıÇ±™¿…9¯­ÎÎ˜°ìÀ…×ÎíY8iÅy‹Ò.	w7[y5¯û×ÂßB<›¥Ê×BX–éÔ¦ĞóGÏİuîúõó{™õ¯cë.­U6Å<,îîŞ©ÕF^İ¶`Ã-}ºoçéŸş³ùª[ë\Zù¥†?…eÙîëª/\\‹Õ	axŸè#Ï.™¾?O‡a­¼ªó}Íˆ\rSÖ_S‹w;(úèÁ—.&»|ë…‘µ¹>ìä¾Wn^?·oÉÏó.jÔOBÂb”ïÖt‘×÷/û±[‡á>)7pYÀ‚‘íª8›fm|KÄ\0\0\0d•m©æıı›tùoÿï+gü7qz+çL³*ljÔcæœ%C·G\naU¸zÛŸ†6vP\n]ÑúÕ¬\'ÌèÛµüÄm³>³”Q´i±®Ó\'éüçOÿ~}¬°voĞgÚàêyƒ™U©æÅßÇ½ú—ÍóZT3õè6cšjÖ¼ùƒ¶D	—jí&Oìæi&„(Õkx«qÓ´\\©Ìãîİ±[½+¿¥óvŞ™.üØ–{^*ÙÈş»ÕŠ¼5úô©pÌ?Ha`Ÿˆ¨sË§íTµÛŞÍT(Lëôÿ®l×™“ê.ìüN%ôÿ&ü¿ÿ÷ñçôA}^1®ï£|^M{ŒbşóÌkƒëŒ~‡6 ~tòÄíNmF¬šPÆNV0V8—o*iUÈ¹íÊî\0\0\0€·Ğë´Bi$;i{íl\0\0\0\09‚B)ñ&aà-ŞG{ãl\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0H@À\0\0\0\0@6\0\0\0\0\0°\0\0\0\0€€\r\0\0\0\0€l\0\0\0\0\0$ `\0\0\0\0 \0\0\0\0\0	Ø\0\0\0\0\0Hğÿù8»fQ‹\'\0\0\0\0IEND®B`‚',NULL,NULL,'Viettel Net','',3);
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
INSERT INTO `role` VALUES (1,'Administrator','ROLE_ADMIN','Administrator'),(2,'User','ROLE_USER','Vai trÃ² ngÆ°á»i dÃ¹ng'),(4,'NgÆ°á»i dÃ¹ng thá»­ nghiá»‡m','ROLE_TEST','NgÆ°á»i dÃ¹ng thá»­ nghiá»‡m ngÃ y hÃ´m nay');
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
INSERT INTO `user` VALUES (9,'VÅ© Viá»‡t HÆ°ng','hungvv','e10adc3949ba59abbe56e057f20f883e','2013-12-20 08:39:23','hungvv@viettel.com.vn'),(3014,'HoÃ ng PhÆ°Æ¡ng Nhi','nhihp1','e10adc3949ba59abbe56e057f20f883e','2014-01-20 01:30:25','nhihp@viettel.com.vn'),(3015,'Nguyá»…n Äá»©c Háº£i','haind','e10adc3949ba59abbe56e057f20f883e','2014-01-20 01:30:25','haind25@viettel.com.vn'),(3016,'Nguyá»…n VÄƒn Thanh','thanhnv','e10adc3949ba59abbe56e057f20f883e','1991-09-30 17:00:00','thanhnv60@viettel.com.vn'),(3017,'Hung','hungvv','e10adc3949ba59abbe56e057f20f883e','2014-01-20 01:30:25','1'),(3021,'Nguyen Van Phuc','phucnv','e10adc3949ba59abbe56e057f20f883e','2014-01-05 17:00:00','phucnv18@viettel.com.vn'),(3026,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-30 17:00:00','trungkh'),(3027,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-20 17:00:00','trungkh'),(3028,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-20 17:00:00','trungkh'),(3029,'Kim Ha Trung','trungkh','e10adc3949ba59abbe56e057f20f883e','2014-01-30 17:00:00','trungkh'),(3030,'Kim Ha Trung','thanh','e10adc3949ba59abbe56e057f20f883e','2014-01-21 08:54:03','trungkh'),(3031,'Tran Van Tho','thotvdeptrai','e10adc3949ba59abbe56e057f20f883e','2014-01-05 17:00:00','thotv@viettel.com.vn'),(3032,'Äá»— Thá»‹ Nháº«n','nhandt4','e10adc3949ba59abbe56e057f20f883e','2014-02-17 02:41:30','nhandt4@viettel.com.vn'),(3033,'khangpn','khangpn','e10adc3949ba59abbe56e057f20f883e','2014-02-15 17:00:00','khangpn'),(3034,'coucou','coucou','e10adc3949ba59abbe56e057f20f883e','2014-03-17 17:00:00','coucou@gmail.com'),(3035,'HoÃ ng Thá»‹ ThÆ¡m','thomht','81dc9bdb52d04dc20036dbd8313ed055','2014-03-04 17:00:00','thomht@viettel.com.vn'),(3036,'Kim Ha Trung','trungkh','123456','2014-03-06 08:09:28','trungkh@viettel.vn'),(3037,'Kim Ha Trung','trungkh','123456','2014-03-06 08:15:53','trungkh@viettel.vn'),(3038,'Kim Ha Trung','trungkh','123456','2014-03-06 08:19:09','trungkh@viettel.vn'),(3050,'aloa','alo','123456','2014-03-30 17:00:00','alo@alo.com'),(3053,'boday','alo','123456','2014-03-30 17:00:00','alo@alo.com'),(3054,'huyenlt','huyenlt','123456','2014-04-01 17:00:00','huyenlt14'),(3056,'Äáº·ng VÄƒn A','adv','123456','2014-03-30 17:00:00','adv@abc.com'),(3057,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3058,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3059,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3060,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email'),(3061,'nguyen van a','usernam','123456','2014-04-01 17:00:00','email');
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
INSERT INTO `view` VALUES (3,1,'Warehouse',NULL,'img/user.svg',1,1,'Kho hÃ ng',0,'com.viettel.webui.view.WarehouseView',43,3,'warehouse'),(4,1,'Customer',NULL,'img/user.svg',3,1,'KhÃ¡ch hÃ ng',0,'com.viettel.webui.view.CustomerView',41,1,'customer'),(5,1,'Product',NULL,'img/user.svg',3,1,'Sáº£n pháº©m',0,'com.viettel.webui.view.ProductView',42,2,'product'),(6,1,'user4',NULL,'img/user.svg',4,1,'Má»Ÿ rá»™ng',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'more'),(7,1,'Department',NULL,'img/user.svg',4,1,'PhÃ²ng ban',0,'com.viettel.webui.view.DepartmentView',41,1,'department'),(8,1,'Enterprise',NULL,'img/user.svg',1,1,'ÄÆ¡n vá»‹',0,'com.viettel.webui.view.EnterpriseView',41,1,'enterprise'),(9,1,'Employee',NULL,'img/user.svg',1,1,'NhÃ¢n viÃªn',0,'com.viettel.webui.view.EmployeeView',41,1,'employee'),(10,1,'dashboard',NULL,'img/user.svg',1,1,'Dashboard',0,'com.viettel.webui.view.UserView',NULL,NULL,'dashboard'),(11,1,'view','',NULL,2,1,'Chá»©c nÄƒng',0,'com.viettel.webui.view.ViewDetail',27,NULL,'view'),(26,1,'application','Application menu summry','img/application24.png',5,1,'á»¨ng dá»¥ng',1,'',NULL,NULL,''),(27,1,'security','Security menu summary','img/lock-flat-24.png',3,1,'Báº£o máº­t',1,'',NULL,NULL,''),(28,1,'applicationList','Application list menu',NULL,1,1,'Danh sÃ¡ch',0,'com.viettel.webui.view.ApplicationView',26,NULL,'apps/list'),(29,1,'applicationAccess','Application access',NULL,2,1,'Truy cáº­p',0,'com.viettel.webui.view.ApplicationUserView',26,NULL,'apps/access'),(30,1,'role','Role list',NULL,1,1,'Vai trÃ²',0,'com.viettel.webui.view.RoleView',27,NULL,'role'),(33,1,'InOut',NULL,'img/user.svg',4,1,'Nháº­p/Xuáº¥t kho',0,'com.viettel.webui.view.InOutView',43,3,'inout'),(34,1,'RP',NULL,'img/report.svg',5,1,'BÃ¡o cÃ¡o',1,'com.viettel.webui.main.MenuPanelView',NULL,NULL,'report'),(35,1,'UDDRA',NULL,'img/report.svg',1,1,'NgÃ y sinh',0,'com.viettel.webui.view.UserByMonthDDR',34,4,'userbymonth'),(36,1,'reportdetail',NULL,'',1,0,'Chi tiáº¿t bÃ¡o cÃ¡o',0,'com.viettel.webui.view.UserByMonthDDRDetail',NULL,NULL,'reportdetail'),(37,1,'popup',NULL,'',1,1,'Popup',0,'com.viettel.webui.view.PopupChooserView',27,NULL,'popup'),(39,1,'TestView',NULL,'img/user.svg',1,1,'TestView',0,'com.viettel.webui.view.TestView',43,3,'TestView'),(40,1,'popuplist',NULL,'img/user.svg',1,1,'Danh sÃ¡ch Popup',0,'com.viettel.webui.view.MenuView',NULL,NULL,'popuplist'),(41,1,'morong.nhom1',NULL,NULL,1,0,'NhÃ³m má»Ÿ rá»™ng 1',1,NULL,6,NULL,NULL),(42,1,'morong.nhom2',NULL,'img/report.svg',1,0,'NhÃ³m má»Ÿ rá»™ng 2',1,NULL,6,NULL,NULL),(43,1,'morong.nhom3',NULL,'img/report.svg',1,0,'NhÃ³m má»Ÿ rá»™ng 3',1,NULL,6,NULL,NULL);
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
INSERT INTO `view_group` VALUES (1,'gr1',1,'CÆ¡ cáº¥u - Tá»• chá»©c',6),(2,'gr2',3,'Mua bÃ¡n',6),(3,'gr3',9,'HÃ ng hÃ³a - Váº­t tÆ°',6),(4,'gr4',1,'NgÆ°á»i dÃ¹ng',34);
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
