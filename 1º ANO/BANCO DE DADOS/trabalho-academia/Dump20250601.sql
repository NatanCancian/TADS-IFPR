CREATE DATABASE  IF NOT EXISTS `academia` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `academia`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: academia
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Natan Cancian','2002-09-22',1,'natan_cancian','natan01','(45)998225362','111.222.343-01','22.567.980-9','natanzaleski@hotmail.com',1,'2020-12-06',1),(2,'admin','2020-01-01',1,'admin','admin','(45)99822-5362','222.444.221-00','33.221.345-0','admin@gmail.com',2,'1111-11-11',1),(14,'tetet','2020-12-04',1,'teste','teset','teste','teset','teset','teste',5,'2020-08-01',5),(15,'testetcc2','1111-11-11',1,'teste1','teste01','(35)78992-0909','112.331.211-09','21.321.898-0','teste@gmail.com',4,'2020-02-10',3);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `avaliacao_fisica`
--

LOCK TABLES `avaliacao_fisica` WRITE;
/*!40000 ALTER TABLE `avaliacao_fisica` DISABLE KEYS */;
INSERT INTO `avaliacao_fisica` VALUES (1,'Out 31, 2020','18:00 PM','R$ 30,00',1,1,'concluída'),(2,'Nov 26, 2020','06:00 AM','R$ 30,00',1,1,'concluída'),(3,'Nov 29, 2020','06:10 PM','R$ 30,00',2,2,'concluída'),(4,'Nov 28, 2020','04:40 PM','R$ 30,00',2,2,'concluída'),(5,'Nov 30, 2020','08:00 AM','R$ 30,00',2,2,'concluída'),(9,'Dec 04, 2020','08:00 AM','R$ 30,00',1,2,'concluída'),(11,'Dec 02 2020','08:00 PM','R$30,00',2,2,'não concluída'),(13,'Dec 02 2020','08:00 PM','R$30,00',2,2,'não concluída'),(14,'Aug 31, 2022','12:00 AM','R$ 30,00',1,2,'não concluída'),(15,'Aug 13, 2022','10:00 PM','R$ 30,00',1,2,'concluída');
/*!40000 ALTER TABLE `avaliacao_fisica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'Zé',2,'Zezao','ZaoZé','122.332.244-09','23.568.123-0','zezao@hotmail.com','(41)99881-0992','Zelador','R$ 500,00','06:00 á 00:00'),(2,'Cleitin',2,'Cleitin','cleitinrasta','132.435.212-00','11.233.121-9','cleitin@gmail.com','(44)98974-2215','Professor de educação física','R$ 3000,00','17:00 á 00:00');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `plano`
--

LOCK TABLES `plano` WRITE;
/*!40000 ALTER TABLE `plano` DISABLE KEYS */;
INSERT INTO `plano` VALUES (1,'anual','R$ 55,00','dinheiro',1),(2,'semestral','R$ 65,00','dinheiro',1),(3,'trimestral','R$ 75,00','dinheiro',1),(4,'mensal','R$ 100,00','dinheiro',1),(5,'entrada','0','0',5);
/*!40000 ALTER TABLE `plano` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `treinamento`
--

LOCK TABLES `treinamento` WRITE;
/*!40000 ALTER TABLE `treinamento` DISABLE KEYS */;
INSERT INTO `treinamento` VALUES (1,'musculação','hipertrofia muscular'),(2,'zumba','perda de peso'),(3,'muay thai','condicionamento físico'),(5,'0','0');
/*!40000 ALTER TABLE `treinamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `treino_aluno`
--

LOCK TABLES `treino_aluno` WRITE;
/*!40000 ALTER TABLE `treino_aluno` DISABLE KEYS */;
INSERT INTO `treino_aluno` VALUES (1,'hipertrofia 3x por semana',1,1,1,NULL,'A - Peito e ombro\n Supino reto - 3X10\n Supino inclinado - 3X10\n Crucifixo - 4X12\n Elevação Lateral - 4X12 Dropset\n Elevação Frontal - 3X15 \n Desenvolvimento Arnold - 4X15 Supersérie',' B - Costas e bíceps\n Barra fixa - até falha 3x\n Remada alta - 3X12\n Remada curvada - 4X15\n Rosca Scott - 3X12\n Rosca Direta - 3X10',' C- Pernas e tríceps\n Agachamento - 4X12\n Legpress - 4X15\n Extensora - 4X12\n Francês - 3X10\n Pulley barra reta - 4X12\n Tríceps corda - 3X10\n',NULL,NULL),(2,'hipertrofia 3x por semana',2,1,1,NULL,'A -  Peito// Supino reto – 4X6 força  Pullhover 3X8 carga alta','B - Braços//  Rosca direta - 4X6, Tríceps corda 4X8, Rosca Invertida 3X10','C -  Pernas e Costas// Agachamento 5X10, Legpress 4X10 Pirâmida - Slow,  Levantamento Terra 4X12, Remada curvada 4X10','D - Ombros// Elevação frontal 3X10, Elevação lateral 3x12, Desenvolvimento Militar 4X12 Pick Contraction','E- Panturlhas// Banco 4x20, Elevação 5X12'),(3,'musculação',1,2,1,NULL,'A - Peito e ombro//  Supino reto - 3X10,  Supino inclinado - 3X10,  Crucifixo - 4X12,  Elevação Lateral - 4X12 Dropset,  Elevação Frontal - 3X15,  Desenvolvimento\r Arnold - 4X15 Supersérie, ',' B - Costas e bíceps//  Barra fixa - até falha 3x,  Remada alta - 3X12,  Remada curvada - 4X15,  Rosca Scott - 3X12,  Rosca Direta - 3X10, ','C - Pernas e tríceps//  Agachamento - 4X12,  Legpress - 4X15,  Extensora - 4X12,  Francês - 3X10,  Pulley barra reta - 4X12,  Tríceps corda - 3X10',NULL,NULL),(4,'treinar bem',2,2,1,'treinao ','treino 1','treino','treino 2','treino dnv','treino 3'),(6,'treinar pra crl',2,2,2,'nenhuma','perna e tríceps','peito e costas','braço','','');
/*!40000 ALTER TABLE `treino_aluno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-01 19:05:22
