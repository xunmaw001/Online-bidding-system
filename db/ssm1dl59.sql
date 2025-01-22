-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm1dl59
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssm1dl59`
--

/*!40000 DROP DATABASE IF EXISTS `ssm1dl59`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm1dl59` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm1dl59`;

--
-- Table structure for table `biaoshuxinxi`
--

DROP TABLE IF EXISTS `biaoshuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `biaoshuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoshubianhao` varchar(200) DEFAULT NULL COMMENT '标书编号',
  `biaoshumingcheng` varchar(200) NOT NULL COMMENT '标书名称',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `biaoshuwenjian` varchar(200) DEFAULT NULL COMMENT '标书文件',
  `biaoshuneirong` longtext COMMENT '标书内容',
  `shangchuanriqi` date DEFAULT NULL COMMENT '上传日期',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `biaoshubianhao` (`biaoshubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='标书信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biaoshuxinxi`
--

LOCK TABLES `biaoshuxinxi` WRITE;
/*!40000 ALTER TABLE `biaoshuxinxi` DISABLE KEYS */;
INSERT INTO `biaoshuxinxi` VALUES (71,'2022-04-26 09:58:11','1111111111','标书名称1','upload/biaoshuxinxi_fengmian1.jpg','','标书内容1','2022-04-26','2022-04-26 17:58:11',1),(72,'2022-04-26 09:58:11','2222222222','标书名称2','upload/biaoshuxinxi_fengmian2.jpg','','标书内容2','2022-04-26','2022-04-26 17:58:11',2),(73,'2022-04-26 09:58:11','3333333333','标书名称3','upload/biaoshuxinxi_fengmian3.jpg','','标书内容3','2022-04-26','2022-04-26 17:58:11',3),(74,'2022-04-26 09:58:11','4444444444','标书名称4','upload/biaoshuxinxi_fengmian4.jpg','','标书内容4','2022-04-26','2022-04-26 17:58:11',4),(75,'2022-04-26 09:58:11','5555555555','标书名称5','upload/biaoshuxinxi_fengmian5.jpg','','标书内容5','2022-04-26','2022-04-26 17:58:11',5),(76,'2022-04-26 09:58:11','6666666666','标书名称6','upload/biaoshuxinxi_fengmian6.jpg','','标书内容6','2022-04-26','2022-04-26 17:58:11',6);
/*!40000 ALTER TABLE `biaoshuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,21,'招标账号1','zhaobiaozhe','招标者','veaz12wn4xpef1l1smh8d9xdyttap0oe','2022-04-26 09:59:31','2022-04-26 10:59:58'),(2,11,'账号1','yonghu','用户','x9j34w6tzckl6ecn1ohaiy4cccxqxmsz','2022-04-26 09:59:47','2022-04-26 10:59:48');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-26 09:58:11');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmufenlei`
--

DROP TABLE IF EXISTS `xiangmufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmufenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmufenlei` (`xiangmufenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='项目分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmufenlei`
--

LOCK TABLES `xiangmufenlei` WRITE;
/*!40000 ALTER TABLE `xiangmufenlei` DISABLE KEYS */;
INSERT INTO `xiangmufenlei` VALUES (41,'2022-04-26 09:58:11','项目分类1'),(42,'2022-04-26 09:58:11','项目分类2'),(43,'2022-04-26 09:58:11','项目分类3'),(44,'2022-04-26 09:58:11','项目分类4'),(45,'2022-04-26 09:58:11','项目分类5'),(46,'2022-04-26 09:58:11','项目分类6');
/*!40000 ALTER TABLE `xiangmufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmutoubiao`
--

DROP TABLE IF EXISTS `xiangmutoubiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmutoubiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `toubiaobianhao` varchar(200) DEFAULT NULL COMMENT '投标编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `toubiaowenjian` varchar(200) DEFAULT NULL COMMENT '投标文件',
  `zhaobiaojine` int(11) DEFAULT NULL COMMENT '招标金额',
  `toubiaojine` int(11) NOT NULL COMMENT '投标金额',
  `toubiaoneirong` longtext COMMENT '投标内容',
  `toubiaoriqi` date DEFAULT NULL COMMENT '投标日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaobiaozhanghao` varchar(200) DEFAULT NULL COMMENT '招标账号',
  `zhaobiaoxingming` varchar(200) DEFAULT NULL COMMENT '招标姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `toubiaobianhao` (`toubiaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='项目投标';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmutoubiao`
--

LOCK TABLES `xiangmutoubiao` WRITE;
/*!40000 ALTER TABLE `xiangmutoubiao` DISABLE KEYS */;
INSERT INTO `xiangmutoubiao` VALUES (61,'2022-04-26 09:58:11','1111111111','项目名称1','',1,1,'投标内容1','2022-04-26','账号1','姓名1','手机1','招标账号1','招标姓名1','联系电话1','是','地方是发送到发送到','已支付'),(62,'2022-04-26 09:58:11','2222222222','项目名称2','',2,2,'投标内容2','2022-04-26','账号2','姓名2','手机2','招标账号2','招标姓名2','联系电话2','是','','未支付'),(63,'2022-04-26 09:58:11','3333333333','项目名称3','',3,3,'投标内容3','2022-04-26','账号3','姓名3','手机3','招标账号3','招标姓名3','联系电话3','是','','未支付'),(64,'2022-04-26 09:58:11','4444444444','项目名称4','',4,4,'投标内容4','2022-04-26','账号4','姓名4','手机4','招标账号4','招标姓名4','联系电话4','是','','未支付'),(65,'2022-04-26 09:58:11','5555555555','项目名称5','',5,5,'投标内容5','2022-04-26','账号5','姓名5','手机5','招标账号5','招标姓名5','联系电话5','是','','未支付'),(66,'2022-04-26 09:58:11','6666666666','项目名称6','',6,6,'投标内容6','2022-04-26','账号6','姓名6','手机6','招标账号6','招标姓名6','联系电话6','是','','未支付');
/*!40000 ALTER TABLE `xiangmutoubiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-04-26 09:58:11','账号1','123456','姓名1',1,'男','13823888881','773890001@qq.com','upload/yonghu_zhaopian1.jpg'),(12,'2022-04-26 09:58:11','账号2','123456','姓名2',2,'男','13823888882','773890002@qq.com','upload/yonghu_zhaopian2.jpg'),(13,'2022-04-26 09:58:11','账号3','123456','姓名3',3,'男','13823888883','773890003@qq.com','upload/yonghu_zhaopian3.jpg'),(14,'2022-04-26 09:58:11','账号4','123456','姓名4',4,'男','13823888884','773890004@qq.com','upload/yonghu_zhaopian4.jpg'),(15,'2022-04-26 09:58:11','账号5','123456','姓名5',5,'男','13823888885','773890005@qq.com','upload/yonghu_zhaopian5.jpg'),(16,'2022-04-26 09:58:11','账号6','123456','姓名6',6,'男','13823888886','773890006@qq.com','upload/yonghu_zhaopian6.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhaobiaoxiangmu`
--

DROP TABLE IF EXISTS `zhaobiaoxiangmu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhaobiaoxiangmu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) NOT NULL COMMENT '项目名称',
  `xiangmufenlei` varchar(200) NOT NULL COMMENT '项目分类',
  `zhaobiaojine` int(11) DEFAULT NULL COMMENT '招标金额',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `xiangmuxiangqing` longtext COMMENT '项目详情',
  `zhaobiaozhanghao` varchar(200) DEFAULT NULL COMMENT '招标账号',
  `zhaobiaoxingming` varchar(200) DEFAULT NULL COMMENT '招标姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='招标项目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhaobiaoxiangmu`
--

LOCK TABLES `zhaobiaoxiangmu` WRITE;
/*!40000 ALTER TABLE `zhaobiaoxiangmu` DISABLE KEYS */;
INSERT INTO `zhaobiaoxiangmu` VALUES (51,'2022-04-26 09:58:11','1111111111','项目名称1','项目分类1',1,'upload/zhaobiaoxiangmu_fengmian1.jpg','2022-04-26','项目详情1','招标账号1','招标姓名1','联系电话1','是','','2022-04-26 17:58:11',1),(52,'2022-04-26 09:58:11','2222222222','项目名称2','项目分类2',2,'upload/zhaobiaoxiangmu_fengmian2.jpg','2022-04-26','项目详情2','招标账号2','招标姓名2','联系电话2','是','','2022-04-26 17:58:11',2),(53,'2022-04-26 09:58:11','3333333333','项目名称3','项目分类3',3,'upload/zhaobiaoxiangmu_fengmian3.jpg','2022-04-26','项目详情3','招标账号3','招标姓名3','联系电话3','是','','2022-04-26 17:58:11',3),(54,'2022-04-26 09:58:11','4444444444','项目名称4','项目分类4',4,'upload/zhaobiaoxiangmu_fengmian4.jpg','2022-04-26','项目详情4','招标账号4','招标姓名4','联系电话4','是','','2022-04-26 17:58:11',4),(55,'2022-04-26 09:58:11','5555555555','项目名称5','项目分类5',5,'upload/zhaobiaoxiangmu_fengmian5.jpg','2022-04-26','项目详情5','招标账号5','招标姓名5','联系电话5','是','','2022-04-26 17:58:11',5),(56,'2022-04-26 09:58:11','6666666666','项目名称6','项目分类6',6,'upload/zhaobiaoxiangmu_fengmian6.jpg','2022-04-26','项目详情6','招标账号6','招标姓名6','联系电话6','是','','2022-04-26 17:58:11',6);
/*!40000 ALTER TABLE `zhaobiaoxiangmu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhaobiaozhe`
--

DROP TABLE IF EXISTS `zhaobiaozhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhaobiaozhe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaobiaozhanghao` varchar(200) NOT NULL COMMENT '招标账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhaobiaoxingming` varchar(200) NOT NULL COMMENT '招标姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhaobiaozhanghao` (`zhaobiaozhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='招标者';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhaobiaozhe`
--

LOCK TABLES `zhaobiaozhe` WRITE;
/*!40000 ALTER TABLE `zhaobiaozhe` DISABLE KEYS */;
INSERT INTO `zhaobiaozhe` VALUES (21,'2022-04-26 09:58:11','招标账号1','123456','招标姓名1',1,'男','13823888881','upload/zhaobiaozhe_zhaopian1.jpg'),(22,'2022-04-26 09:58:11','招标账号2','123456','招标姓名2',2,'男','13823888882','upload/zhaobiaozhe_zhaopian2.jpg'),(23,'2022-04-26 09:58:11','招标账号3','123456','招标姓名3',3,'男','13823888883','upload/zhaobiaozhe_zhaopian3.jpg'),(24,'2022-04-26 09:58:11','招标账号4','123456','招标姓名4',4,'男','13823888884','upload/zhaobiaozhe_zhaopian4.jpg'),(25,'2022-04-26 09:58:11','招标账号5','123456','招标姓名5',5,'男','13823888885','upload/zhaobiaozhe_zhaopian5.jpg'),(26,'2022-04-26 09:58:11','招标账号6','123456','招标姓名6',6,'男','13823888886','upload/zhaobiaozhe_zhaopian6.jpg');
/*!40000 ALTER TABLE `zhaobiaozhe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanjia`
--

DROP TABLE IF EXISTS `zhuanjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanjiabianhao` varchar(200) DEFAULT NULL COMMENT '专家编号',
  `zhuanjiaxingming` varchar(200) NOT NULL COMMENT '专家姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `gerentezhang` longtext COMMENT '个人特长',
  `xiangxijieshao` longtext COMMENT '详细介绍',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhuanjiabianhao` (`zhuanjiabianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='专家';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanjia`
--

LOCK TABLES `zhuanjia` WRITE;
/*!40000 ALTER TABLE `zhuanjia` DISABLE KEYS */;
INSERT INTO `zhuanjia` VALUES (31,'2022-04-26 09:58:11','1111111111','专家姓名1','男','13823888881','773890001@qq.com','upload/zhuanjia_zhaopian1.jpg','地址1','个人特长1','详细介绍1','2022-04-26 17:58:11',1),(32,'2022-04-26 09:58:11','2222222222','专家姓名2','男','13823888882','773890002@qq.com','upload/zhuanjia_zhaopian2.jpg','地址2','个人特长2','详细介绍2','2022-04-26 17:58:11',2),(33,'2022-04-26 09:58:11','3333333333','专家姓名3','男','13823888883','773890003@qq.com','upload/zhuanjia_zhaopian3.jpg','地址3','个人特长3','详细介绍3','2022-04-26 17:58:11',3),(34,'2022-04-26 09:58:11','4444444444','专家姓名4','男','13823888884','773890004@qq.com','upload/zhuanjia_zhaopian4.jpg','地址4','个人特长4','详细介绍4','2022-04-26 17:58:11',4),(35,'2022-04-26 09:58:11','5555555555','专家姓名5','男','13823888885','773890005@qq.com','upload/zhuanjia_zhaopian5.jpg','地址5','个人特长5','详细介绍5','2022-04-26 17:58:11',5),(36,'2022-04-26 09:58:11','6666666666','专家姓名6','男','13823888886','773890006@qq.com','upload/zhuanjia_zhaopian6.jpg','地址6','个人特长6','详细介绍6','2022-04-26 17:58:11',6);
/*!40000 ALTER TABLE `zhuanjia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-27 15:09:15
