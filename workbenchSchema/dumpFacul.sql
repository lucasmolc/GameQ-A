CREATE DATABASE  IF NOT EXISTS `trabalho_java_una` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `trabalho_java_una`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: trabalho_java_una
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alternatives`
--

DROP TABLE IF EXISTS `alternatives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alternatives` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Question` int(11) DEFAULT NULL,
  `ID_Player` int(11) DEFAULT NULL,
  `right_Aswer` tinyint(4) NOT NULL COMMENT '1 - CORRETA, 0 - ERRADA',
  `alternatives` varchar(27) DEFAULT NULL,
  `quantity_Question_right` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Question` (`ID_Question`),
  KEY `ID_Player` (`ID_Player`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alternatives`
--

LOCK TABLES `alternatives` WRITE;
/*!40000 ALTER TABLE `alternatives` DISABLE KEYS */;
/*!40000 ALTER TABLE `alternatives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `erro`
--

DROP TABLE IF EXISTS `erro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `erro` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Question` int(11) DEFAULT NULL,
  `ID_Player` int(11) DEFAULT NULL,
  `name_Error` varchar(30) DEFAULT NULL,
  `msg_Error` varchar(30) DEFAULT NULL,
  `date_error` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Question` (`ID_Question`),
  KEY `ID_Player` (`ID_Player`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erro`
--

LOCK TABLES `erro` WRITE;
/*!40000 ALTER TABLE `erro` DISABLE KEYS */;
/*!40000 ALTER TABLE `erro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilities`
--

DROP TABLE IF EXISTS `habilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habilities` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Person` int(11) DEFAULT NULL,
  `name_Hability` varchar(20) DEFAULT NULL,
  `utility_Hability` tinyint(4) DEFAULT NULL COMMENT '1 - Caso tenha habilidade de cura, 0 - Caso não tenha habilidade de cura',
  `damage_Hability` tinyint(4) DEFAULT NULL COMMENT '1 - Caso tenha habilidade de dar dano em outro player, 0 - Caso não tenha habilidade de dar dano em outro player',
  `countdown_Hability` int(11) DEFAULT NULL COMMENT 'Para setar o tempo de recarga da habilidade',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Person` (`ID_Person`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilities`
--

LOCK TABLES `habilities` WRITE;
/*!40000 ALTER TABLE `habilities` DISABLE KEYS */;
/*!40000 ALTER TABLE `habilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Habilities` int(11) DEFAULT NULL,
  `ID_Player` int(11) DEFAULT NULL,
  `name_Person` varchar(10) DEFAULT NULL,
  `life_Person` int(11) DEFAULT NULL,
  `force_Person` int(11) DEFAULT NULL,
  `inteligence_Person` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Player` (`ID_Player`),
  KEY `ID_Habilities` (`ID_Habilities`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,NULL,NULL,'Bolsonaro',100,100,0);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Error` int(11) DEFAULT NULL,
  `ID_Question` int(11) DEFAULT NULL,
  `ID_alternatives` int(11) DEFAULT NULL,
  `ID_Person` int(11) DEFAULT NULL,
  `name_Player` varchar(27) NOT NULL,
  `nick_Player` varchar(10) DEFAULT NULL COMMENT 'MAXIMO DE CARACTERES NO NOME É 10',
  `email_Player` varchar(16) DEFAULT NULL,
  `tell_Player` varchar(17) DEFAULT NULL,
  `data_Player_Created` datetime DEFAULT NULL,
  `last_Player_Login` time DEFAULT NULL,
  `estagio_Player_Question` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Error` (`ID_Error`),
  KEY `ID_Question` (`ID_Question`),
  KEY `ID_alternatives` (`ID_alternatives`),
  KEY `ID_Person` (`ID_Person`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Rules` int(11) DEFAULT NULL,
  `ID_Error` int(11) DEFAULT NULL,
  `ID_utterance` int(11) DEFAULT NULL,
  `ID_Alternatives` int(11) DEFAULT NULL,
  `ID_Player` int(11) DEFAULT NULL,
  `name_Question` varchar(10) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Rules` (`ID_Rules`),
  KEY `ID_Error` (`ID_Error`),
  KEY `ID_utterance` (`ID_utterance`),
  KEY `ID_Alternatives` (`ID_Alternatives`),
  KEY `ID_Player` (`ID_Player`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rules`
--

DROP TABLE IF EXISTS `rules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rules` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Question` int(11) DEFAULT NULL,
  `rule_Date_Created` datetime DEFAULT NULL,
  `rule_Name` varchar(10) NOT NULL,
  `rule_Description` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Question` (`ID_Question`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rules`
--

LOCK TABLES `rules` WRITE;
/*!40000 ALTER TABLE `rules` DISABLE KEYS */;
/*!40000 ALTER TABLE `rules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utterance`
--

DROP TABLE IF EXISTS `utterance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utterance` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Question` int(11) DEFAULT NULL,
  `utterance` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ID_Question` (`ID_Question`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utterance`
--

LOCK TABLES `utterance` WRITE;
/*!40000 ALTER TABLE `utterance` DISABLE KEYS */;
/*!40000 ALTER TABLE `utterance` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-27 21:41:42
