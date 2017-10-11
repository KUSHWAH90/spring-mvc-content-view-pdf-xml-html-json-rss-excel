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

/*Table structure for table `information` */

DROP TABLE IF EXISTS `information`;

CREATE TABLE `information` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(10) NOT NULL,
  `lastname` varchar(10) NOT NULL,
  `address` varchar(20) NOT NULL,
  `city` varchar(10) NOT NULL,
  `mobile` varchar(12) NOT NULL,
  `email` varchar(25) NOT NULL,
  `pincode` int(6) NOT NULL,
  `dob` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `information` */

insert  into `information`(`id`,`firstname`,`lastname`,`address`,`city`,`mobile`,`email`,`pincode`,`dob`) values (10,'Bhaumik','Mevada','Palanpur','Palanpur','1234567809','mevadabhaumik09@gmailcom',458512,'1990-10-02'),(11,'admin','site','india','india','1252675620','admin@bm.com',5472,'1990-12-10'),(13,'Gourav','Malviya','MP','INdore','97856455455','gourav45@gmail.com',475265,'1991-12-12'),(14,'Giris','Juturu','HP','Hp','78965412365','girish@gmail.com',456893,'1990-05-15');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
