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
-- Table structure for table `t_blankQuestion`
--

DROP TABLE IF EXISTS `t_blankQuestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_blankQuestion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(300) NOT NULL,
  `answer` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_blankQuestion`
--

LOCK TABLES `t_blankQuestion` WRITE;
/*!40000 ALTER TABLE `t_blankQuestion` DISABLE KEYS */;
INSERT INTO `t_blankQuestion` VALUES (1,'What season comes right after winter','Spring'),(2,'What is the median of 2, 3, 7','3'),(3,'What is the closest planet to Earth?','moon'),(4,'Is a pencil a good or a service?','good'),(5,'Who is the first president of the United States?','George Washington'),(6,'What is 80 minus 50?','30'),(7,'What is the smallest prime number?','2'),(8,'How do you write the number sixty-one using digits?','61'),(9,'The superhero rescued 54 boys and 1 girl. How many people did he rescue in total?','55'),(10,'What is the biggest value of all coins?','1 dollar'),(11,'What is the mode of 2,2,2,4,6?','2'),(12,'What is the range of 1,2,4,8?','7'),(13,'What is the average number of 3,7?','5'),(14,'Tomorrow is Tuesday. What day is today?','Monday'),(15,'How many days does July have?','31'),(16,'How many minutes are in an hour?','60'),(17,'What month is just after April?','May'),(18,'Christmas is a holiday in which religion?','Christianity'),(19,'What Dr. Martin Luther King, Jr. want to be when he was in college?','minister'),(20,'What is the capital of Texas?','Austin'),(21,'What is the closest star to Earth?','sun');
/*!40000 ALTER TABLE `t_blankQuestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-12 16:15:08
