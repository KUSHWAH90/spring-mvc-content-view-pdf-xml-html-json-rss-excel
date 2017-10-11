/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.1.33-community : Database - santosh
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`santosh` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `santosh`;

/*Table structure for table `students` */

DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
  `studentId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `department` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=MyISAM AUTO_INCREMENT=156 DEFAULT CHARSET=latin1;

/*Data for the table `students` */

insert  into `students`(`studentId`,`name`,`department`,`email`) values (103,'Gourav','IT','gourav@gmail.com'),(104,'Gourav','IT','gourav@gmail.com'),(105,'Gourav','IT','gourav@gmail.com'),(106,'Gourav','IT','gourav@gmail.com'),(107,'Gourav','IT','gourav@gmail.com'),(108,'Gourav','IT','gourav@gmail.com'),(109,'Gourav','IT','gourav@gmail.com'),(110,'Gourav','IT','gourav@gmail.com'),(111,'Gourav','IT','gourav@gmail.com'),(112,'Gourav','IT','gourav@gmail.com'),(113,'Gourav','IT','gourav@gmail.com'),(114,'Gourav','IT','gourav@gmail.com'),(115,'Gourav','IT','gourav@gmail.com'),(116,'Gourav','IT','gourav@gmail.com'),(117,'Gourav','IT','gourav@gmail.com'),(118,'Gourav','IT','gourav@gmail.com'),(119,'Gourav','IT','gourav@gmail.com'),(120,'Gourav','IT','gourav@gmail.com'),(121,'Gourav','IT','gourav@gmail.com'),(122,'Gourav','IT','gourav@gmail.com'),(123,'Gourav','IT','gourav@gmail.com'),(124,'Gourav','IT','gourav@gmail.com'),(128,'SANTOSH','IT','gourav@gmail.com'),(126,'Gourav','IT','gourav@gmail.com'),(129,'SANTOSH','IT','gourav@gmail.com'),(130,'SANTOSH','IT','gourav@gmail.com'),(131,'SANTOSH','IT','gourav@gmail.com'),(132,'SANTOSH','IT','gourav@gmail.com'),(133,'SANTOSH','IT','gourav@gmail.com'),(134,'SANTOSH','IT','gourav@gmail.com'),(135,'SANTOSH','IT','gourav@gmail.com'),(136,'SANTOSH','IT','gourav@gmail.com'),(137,'SANTOSH','IT','gourav@gmail.com'),(138,'SANTOSH','IT','gourav@gmail.com'),(139,'SANTOSH','IT','gourav@gmail.com'),(140,'SANTOSH','IT','gourav@gmail.com'),(141,'SANTOSH','IT','gourav@gmail.com'),(142,'SANTOSH','IT','gourav@gmail.com'),(143,'SANTOSH','IT','gourav@gmail.com'),(144,'SANTOSH','IT','gourav@gmail.com'),(145,'GIRI','IT','gourav@gmail.com'),(146,'GIRI','IT','gourav@gmail.com'),(147,'GIRI','IT','gourav@gmail.com'),(148,'GIRI','IT','gourav@gmail.com'),(149,'GIRI','IT','gourav@gmail.com'),(150,'GIRI','IT','gourav@gmail.com'),(151,'GIRI','IT','gourav@gmail.com'),(152,'GIRI','IT','gourav@gmail.com'),(153,'GIRI','IT','gourav@gmail.com'),(154,'GIRI','IT','gourav@gmail.com'),(155,'GIRI','IT','gourav@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
