-- MySQL dump 10.13  Distrib 5.7.26, for macos10.14 (x86_64)
--
-- Host: localhost    Database: QUESTION
-- ------------------------------------------------------
-- Server version	5.7.26

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
-- Table structure for table `t_ChoiceQuestion`
--

DROP TABLE IF EXISTS `t_ChoiceQuestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_ChoiceQuestion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(300) NOT NULL,
  `choice1` varchar(100) DEFAULT NULL,
  `choice2` varchar(100) DEFAULT NULL,
  `choice3` varchar(100) DEFAULT NULL,
  `choice4` varchar(100) DEFAULT NULL,
  `answer` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_ChoiceQuestion`
--

LOCK TABLES `t_ChoiceQuestion` WRITE;
/*!40000 ALTER TABLE `t_ChoiceQuestion` DISABLE KEYS */;
INSERT INTO `t_ChoiceQuestion` VALUES (1,'Which traits does the bear have?','It has six legs.','It sometimes eats animals.','It sometimes eats plants.','It has brown feathers.','It sometimes eats animals.'),(2,'How long does it take to watch a movie at the theater?','2 seconds','2 hours','3 seconds','3 minutes','2 hours'),(3,'Governments help keep people safe. They also help people work together. How do governments do that?','by growing food','by writing newspapers','by leaving people alone','by making laws','by making laws'),(4,'Sometimes it is not clear whether a person has broken the law. Which part of government helps decide?','the fire department','the school district','the court system','the post office','the court system'),(5,'Where is the Lincoln Memorial?','Wabash, Indiana','Springfield, Illinois','Hodgenville, Kentucky','Washington, D.C.','Washington, D.C.'),(6,'The Empire State Building was built during what important time in American history?','the Revolutionary War','World War I','the Great Depression','the civil rights movement','the Great Depression'),(7,'When was the Golden Gate Bridge built?','in the 1850s','in the 1890s','in the 1910s','in the 1930s','in the 1930s'),(8,'What is a natural resource?','scissors','cameras','computers','trees','trees'),(9,'In an election, people choose their representatives and leaders by what means?','passing laws','voting','drawing names randomly','giving speeches','voting'),(10,'Bill Gates is a business leader. He became famous for doing what?','working with computers','making movies','running for president','playing sports','working with computers'),(11,'When is Thanksgiving celebrated in the U.S.?','on December 5','on the fourth Thursday of November','on January 12','on the second Sunday of September','on the fourth Thursday of November'),(12,'What profession Thomas Edison was famous for?','athlete','composer','inventor','soldier','inventor');
/*!40000 ALTER TABLE `t_ChoiceQuestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-12 20:42:51
