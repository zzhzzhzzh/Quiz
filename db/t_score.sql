# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: QUESTION
# Generation Time: 2020-03-12 23:49:38 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_Score
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_Score`;

CREATE TABLE `t_Score` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(11) unsigned NOT NULL,
  `time` timestamp NULL DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `type1score` int(11) DEFAULT NULL,
  `type2score` int(11) DEFAULT NULL,
  `type3score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_Score` WRITE;
/*!40000 ALTER TABLE `t_Score` DISABLE KEYS */;

INSERT INTO `t_Score` (`id`, `userId`, `time`, `score`, `type1score`, `type2score`, `type3score`)
VALUES
	(1,1,'2020-03-11 18:56:19',2,NULL,NULL,NULL),
	(2,1,'2020-03-11 19:48:20',8,4,5,0),
	(3,1,'2020-03-11 19:53:38',8,4,5,0),
	(4,1,'2020-03-11 19:54:19',6,2,5,0),
	(5,1,'2020-03-11 19:56:45',6,1,5,0),
	(6,1,'2020-03-12 09:24:45',0,0,0,0),
	(7,1,'2020-03-12 10:05:30',0,0,0,0),
	(8,1,'2020-03-12 10:36:22',6,1,5,0),
	(9,1,'2020-03-12 10:36:38',16,1,15,0),
	(10,1,'2020-03-12 10:44:44',0,0,0,0),
	(11,1,'2020-03-12 11:31:26',6,1,5,0),
	(12,2,'2020-03-12 13:13:11',3,3,0,0);

/*!40000 ALTER TABLE `t_Score` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
