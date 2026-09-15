-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tijian
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `checkitem`
--

DROP TABLE IF EXISTS `checkitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkitem` (
  `ciId` int NOT NULL AUTO_INCREMENT COMMENT '检查项编号',
  `ciName` varchar(30) NOT NULL COMMENT '检查项名称',
  `ciContent` varchar(200) NOT NULL COMMENT '检查项内容',
  `meaning` varchar(200) NOT NULL COMMENT '检查项意义',
  `remarks` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ciId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='检查项信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkitem`
--

LOCK TABLES `checkitem` WRITE;
/*!40000 ALTER TABLE `checkitem` DISABLE KEYS */;
INSERT INTO `checkitem` VALUES (1,'一般检查','身高、体重、血压、体重指数','了解体格基本状况',NULL),(2,'内科','心、肺、肝、脾、腹部触诊等','筛查内科常见疾病',NULL),(3,'外科','皮肤、浅表淋巴结、甲状腺、脊柱等','筛查外科常见疾病',NULL),(4,'血常规','白细胞、红细胞、血红蛋白、血小板等','筛查感染、贫血及血液系统疾病','重点项目'),(5,'肝功能','谷丙转氨酶、谷草转氨酶等','评估肝脏功能',NULL),(6,'肾功能','肌酐、尿素氮等','评估肾脏功能',NULL),(7,'血脂血糖','空腹血糖、总胆固醇、甘油三酯等','筛查糖尿病、高脂血症',NULL),(8,'胸部CT','胸部CT平扫','筛查肺部炎症、结节及占位性病变','影像项目');
/*!40000 ALTER TABLE `checkitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checkitemdetailed`
--

DROP TABLE IF EXISTS `checkitemdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkitemdetailed` (
  `cdId` int NOT NULL AUTO_INCREMENT COMMENT '检查项明细编号',
  `name` varchar(40) NOT NULL COMMENT '检查项明细名称',
  `unit` varchar(20) DEFAULT NULL COMMENT '检查项明细单位',
  `minrange` double DEFAULT NULL COMMENT '检查项明细正常值范围中的最小值',
  `maxrange` double DEFAULT NULL COMMENT '检查项明细正常值范围中的最大值',
  `normalValue` varchar(20) DEFAULT NULL COMMENT '检查项明细正常值（非数字型）',
  `normalValueString` varchar(20) DEFAULT NULL COMMENT '检查项验证范围说明文字',
  `type` int NOT NULL COMMENT '明细类型（1：数值范围验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）',
  `ciId` int NOT NULL COMMENT '所属检查项编号',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cdId`),
  KEY `idx_cid_ciId` (`ciId`),
  CONSTRAINT `fk_checkitemdetailed_checkitem` FOREIGN KEY (`ciId`) REFERENCES `checkitem` (`ciId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='检查项明细表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkitemdetailed`
--

LOCK TABLES `checkitemdetailed` WRITE;
/*!40000 ALTER TABLE `checkitemdetailed` DISABLE KEYS */;
INSERT INTO `checkitemdetailed` VALUES (1,'白细胞计数','10^9/L',3.5,9.5,NULL,NULL,1,4,'WBC'),(2,'红细胞计数','10^12/L',4.3,5.8,NULL,NULL,1,4,'RBC'),(3,'血红蛋白','g/L',130,175,NULL,NULL,1,4,'HGB'),(4,'血小板计数','10^9/L',125,350,NULL,NULL,1,4,'PLT'),(5,'中性粒细胞百分比','%',40,75,NULL,NULL,1,4,'NEUT%'),(6,'收缩压','mmHg',90,139,NULL,NULL,1,1,NULL),(7,'舒张压','mmHg',60,89,NULL,NULL,1,1,NULL),(8,'体重指数','kg/m2',18.5,23.9,NULL,NULL,1,1,'BMI'),(9,'谷丙转氨酶','U/L',9,50,NULL,NULL,1,5,'ALT'),(10,'谷草转氨酶','U/L',15,40,NULL,NULL,1,5,'AST'),(11,'肌酐','μmol/L',57,97,NULL,NULL,1,6,'CREA'),(12,'尿素氮','mmol/L',3.1,8,NULL,NULL,1,6,'BUN'),(13,'空腹血糖','mmol/L',3.9,6.1,NULL,NULL,1,7,'GLU'),(14,'总胆固醇','mmol/L',NULL,5.2,NULL,NULL,1,7,'TC'),(15,'甘油三酯','mmol/L',0.56,1.7,NULL,NULL,1,7,'TG'),(16,'心肺听诊',NULL,NULL,NULL,NULL,NULL,3,2,NULL),(17,'外科查体',NULL,NULL,NULL,NULL,NULL,4,3,NULL),(18,'胸部CT平扫',NULL,NULL,NULL,NULL,'双肺纹理清晰，未见实质性、占位性病变',4,8,'影像描述');
/*!40000 ALTER TABLE `checkitemdetailed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidetailedreport`
--

DROP TABLE IF EXISTS `cidetailedreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidetailedreport` (
  `cidrId` int NOT NULL AUTO_INCREMENT COMMENT '检查项明细报告编号',
  `name` varchar(40) NOT NULL COMMENT '检查项明细名称',
  `unit` varchar(20) DEFAULT NULL COMMENT '检查项明细单位',
  `minrange` double DEFAULT NULL COMMENT '检查项明细正常值范围中的最小值',
  `maxrange` double DEFAULT NULL COMMENT '检查项明细正常值范围中的最大值',
  `normalValue` varchar(20) DEFAULT NULL COMMENT '检查项明细正常值（非数字型）',
  `normalValueString` varchar(20) DEFAULT NULL COMMENT '检查项验证范围说明文字',
  `type` int NOT NULL COMMENT '明细类型（1：数值范围验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）',
  `value` varchar(100) DEFAULT NULL COMMENT '检查项具体到数值',
  `isError` int NOT NULL COMMENT '此项是否异常（0：无异常；1：异常）',
  `ciId` int NOT NULL COMMENT '所属检查项报告编号',
  `orderId` int NOT NULL COMMENT '所属预约编号',
  PRIMARY KEY (`cidrId`),
  KEY `idx_cidr_ciId` (`ciId`),
  KEY `idx_cidr_orderId` (`orderId`),
  CONSTRAINT `fk_cidetailedreport_cireport` FOREIGN KEY (`ciId`) REFERENCES `cireport` (`cirId`),
  CONSTRAINT `fk_cidetailedreport_orders` FOREIGN KEY (`orderId`) REFERENCES `orders` (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='体检报告检查项明细表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidetailedreport`
--

LOCK TABLES `cidetailedreport` WRITE;
/*!40000 ALTER TABLE `cidetailedreport` DISABLE KEYS */;
INSERT INTO `cidetailedreport` VALUES (1,'白细胞计数','10^9/L',3.5,9.5,NULL,NULL,1,'6.2',0,4,1),(2,'红细胞计数','10^12/L',4.3,5.8,NULL,NULL,1,'4.8',0,4,1),(3,'血红蛋白','g/L',130,175,NULL,NULL,1,'152',0,4,1),(4,'血小板计数','10^9/L',125,350,NULL,NULL,1,'220',0,4,1),(5,'中性粒细胞百分比','%',40,75,NULL,NULL,1,'58.3',0,4,1),(6,'谷丙转氨酶','U/L',9,50,NULL,NULL,1,'26',0,5,1),(7,'空腹血糖','mmol/L',3.9,6.1,NULL,NULL,1,'5.4',0,7,1),(8,'胸部CT平扫',NULL,NULL,NULL,NULL,'双肺纹理清晰，未见实质性、占位性病变',4,'双肺纹理清晰，纵隔居中，心影大小形态正常，未见明显异常密度影。',0,8,1),(9,'白细胞计数','10^9/L',3.5,9.5,NULL,NULL,1,'11.5',1,12,2),(10,'红细胞计数','10^12/L',4.3,5.8,NULL,NULL,1,'4.6',0,12,2),(11,'血红蛋白','g/L',130,175,NULL,NULL,1,'148',0,12,2),(12,'血小板计数','10^9/L',125,350,NULL,NULL,1,'256',0,12,2),(13,'中性粒细胞百分比','%',40,75,NULL,NULL,1,'82.6',1,12,2),(14,'空腹血糖','mmol/L',3.9,6.1,NULL,NULL,1,'6.8',1,13,2);
/*!40000 ALTER TABLE `cidetailedreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cireport`
--

DROP TABLE IF EXISTS `cireport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cireport` (
  `cirId` int NOT NULL AUTO_INCREMENT COMMENT '检查项报告主键',
  `ciId` int NOT NULL COMMENT '检查项编号',
  `ciName` varchar(30) NOT NULL COMMENT '检查项名称',
  `orderId` int NOT NULL COMMENT '所属预约编号',
  PRIMARY KEY (`cirId`),
  KEY `idx_cir_orderId` (`orderId`),
  CONSTRAINT `fk_cireport_orders` FOREIGN KEY (`orderId`) REFERENCES `orders` (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='体检报告检查项信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cireport`
--

LOCK TABLES `cireport` WRITE;
/*!40000 ALTER TABLE `cireport` DISABLE KEYS */;
INSERT INTO `cireport` VALUES (1,1,'一般检查',1),(2,2,'内科',1),(3,3,'外科',1),(4,4,'血常规',1),(5,5,'肝功能',1),(6,6,'肾功能',1),(7,7,'血脂血糖',1),(8,8,'胸部CT',1),(9,1,'一般检查',2),(10,2,'内科',2),(11,3,'外科',2),(12,4,'血常规',2),(13,7,'血脂血糖',2);
/*!40000 ALTER TABLE `cireport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `docId` int NOT NULL AUTO_INCREMENT COMMENT '医生编号',
  `docCode` varchar(20) NOT NULL COMMENT '医生编码（登录用）',
  `realName` varchar(20) NOT NULL COMMENT '真实姓名',
  `password` varchar(20) NOT NULL COMMENT '密码（登录用）',
  `sex` int NOT NULL COMMENT '性别（1：男；0：女）',
  `deptno` int NOT NULL COMMENT '所属科室（1：检验科；2：内科；3：外科）',
  PRIMARY KEY (`docId`),
  UNIQUE KEY `uk_doc_code` (`docCode`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='医生信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'D001','李建国','123456',1,1),(2,'D002','王秀兰','123456',0,2),(3,'D003','赵志强','123456',1,3);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital` (
  `hpId` int NOT NULL AUTO_INCREMENT COMMENT '医院编号',
  `name` varchar(30) NOT NULL COMMENT '医院名称',
  `picture` mediumtext NOT NULL COMMENT '医院图片',
  `telephone` varchar(20) NOT NULL COMMENT '医院电话',
  `address` varchar(100) NOT NULL COMMENT '医院地址',
  `businessHours` varchar(100) NOT NULL COMMENT '营业时间',
  `deadline` varchar(30) NOT NULL COMMENT '采血截止时间',
  `rule` varchar(30) NOT NULL COMMENT '预约人数规则',
  `state` int NOT NULL COMMENT '医院状态（1：正常；2：其他）',
  PRIMARY KEY (`hpId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='医院信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` VALUES (1,'东软市中心医院','','0371-88888888','郑州市金水区健康路1号','08:00-17:00','10:00','每日限约50人',1),(2,'郑州人民医院','','0371-66666666','郑州市二七区建设路2号','07:30-17:30','09:30','每日限约80人',1),(3,'河南省中医院','','0371-55555555','郑州市管城回族区文化路3号','08:00-16:30','10:30','每日限约40人',2);
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `orderDate` date NOT NULL COMMENT '预约日期',
  `userId` varchar(11) NOT NULL COMMENT '客户编号',
  `hpId` int NOT NULL COMMENT '所属医院编号',
  `smId` int NOT NULL COMMENT '所属套餐编号',
  `state` int NOT NULL COMMENT '订单状态（1：未归档；2：已归档）',
  PRIMARY KEY (`orderId`),
  KEY `idx_orders_userId` (`userId`),
  KEY `idx_orders_hpId` (`hpId`),
  KEY `idx_orders_smId` (`smId`),
  CONSTRAINT `fk_orders_hospital` FOREIGN KEY (`hpId`) REFERENCES `hospital` (`hpId`),
  CONSTRAINT `fk_orders_setmeal` FOREIGN KEY (`smId`) REFERENCES `setmeal` (`smId`),
  CONSTRAINT `fk_orders_users` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='体检预约订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2026-09-10','13800138000',1,1,2),(2,'2026-09-12','13900139000',1,2,2),(3,'2026-09-20','13700137000',2,3,1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `overallresult`
--

DROP TABLE IF EXISTS `overallresult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `overallresult` (
  `orId` int NOT NULL AUTO_INCREMENT COMMENT '总检结论项编号',
  `title` varchar(40) NOT NULL COMMENT '总检结论项标题',
  `content` varchar(400) NOT NULL COMMENT '总检结论项内容',
  `orderId` int NOT NULL COMMENT '所属预约编号',
  PRIMARY KEY (`orId`),
  KEY `idx_or_orderId` (`orderId`),
  CONSTRAINT `fk_overallresult_orders` FOREIGN KEY (`orderId`) REFERENCES `orders` (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='总检结论信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `overallresult`
--

LOCK TABLES `overallresult` WRITE;
/*!40000 ALTER TABLE `overallresult` DISABLE KEYS */;
INSERT INTO `overallresult` VALUES (1,'总检结论','本次体检各项指标基本正常：血常规、肝肾功能及胸部CT未见明显异常。建议保持规律作息与适量运动，每年定期体检。',1),(2,'总检结论','血常规提示白细胞计数及中性粒细胞百分比偏高，考虑可能存在细菌感染；空腹血糖6.8mmol/L偏高。建议清淡饮食、适量运动，一周后复查血常规及空腹血糖，必要时内科门诊就诊。',2);
/*!40000 ALTER TABLE `overallresult` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setmeal`
--

DROP TABLE IF EXISTS `setmeal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setmeal` (
  `smId` int NOT NULL AUTO_INCREMENT COMMENT '体检套餐编号',
  `name` varchar(225) NOT NULL COMMENT '体检套餐名称',
  `type` int NOT NULL COMMENT '体检套餐类型（1：男士套餐；0：女士套餐）',
  `price` int NOT NULL COMMENT '体检套餐价格',
  PRIMARY KEY (`smId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='体检套餐信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setmeal`
--

LOCK TABLES `setmeal` WRITE;
/*!40000 ALTER TABLE `setmeal` DISABLE KEYS */;
INSERT INTO `setmeal` VALUES (1,'男士尊享套餐',1,599),(2,'男士基础套餐',1,299),(3,'女士关爱套餐',0,699),(4,'女士基础套餐',0,329);
/*!40000 ALTER TABLE `setmeal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setmealdetailed`
--

DROP TABLE IF EXISTS `setmealdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setmealdetailed` (
  `sdId` int NOT NULL AUTO_INCREMENT COMMENT '体检套餐项目明细编号（无意义主键）',
  `smId` int NOT NULL COMMENT '体检套餐编号',
  `ciId` int NOT NULL COMMENT '体格检查项编号',
  PRIMARY KEY (`sdId`),
  KEY `idx_smd_smId` (`smId`),
  KEY `idx_smd_ciId` (`ciId`),
  CONSTRAINT `fk_setmealdetailed_checkitem` FOREIGN KEY (`ciId`) REFERENCES `checkitem` (`ciId`),
  CONSTRAINT `fk_setmealdetailed_setmeal` FOREIGN KEY (`smId`) REFERENCES `setmeal` (`smId`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='体检套餐项目明细表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setmealdetailed`
--

LOCK TABLES `setmealdetailed` WRITE;
/*!40000 ALTER TABLE `setmealdetailed` DISABLE KEYS */;
INSERT INTO `setmealdetailed` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,2,1),(10,2,2),(11,2,3),(12,2,4),(13,2,7),(14,3,1),(15,3,2),(16,3,3),(17,3,4),(18,3,5),(19,3,6),(20,3,7),(21,4,1),(22,4,2),(23,4,4),(24,4,7);
/*!40000 ALTER TABLE `setmealdetailed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userId` varchar(11) NOT NULL COMMENT '用户编号（手机号码）',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `realName` varchar(20) NOT NULL COMMENT '真实姓名',
  `sex` int NOT NULL COMMENT '用户性别（1：男；0：女）',
  `identityCard` varchar(18) NOT NULL COMMENT '身份证号',
  `birthday` date NOT NULL COMMENT '出生日期',
  `userType` int NOT NULL COMMENT '用户类型（1：普通用户；2：东软内部员工；3：其他）',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('13700137000','123456','王芳',0,'410101200211036789','2002-11-03',1),('13800138000','123456','张三',1,'410101200205121234','2002-05-12',1),('13900139000','123456','李四',1,'410101200308203456','2003-08-20',2);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-09-15 10:26:31
