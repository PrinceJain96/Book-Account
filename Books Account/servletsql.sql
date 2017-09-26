/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.0.67-community-nt : Database - library
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`library` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `library`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bid` int(5) NOT NULL,
  `bname` varchar(10) NOT NULL,
  `bcol` varchar(10) default NULL,
  `baut` varchar(10) default NULL,
  `year` int(4) default NULL,
  `tno` int(4) default NULL,
  `isno` int(4) default NULL,
  PRIMARY KEY  (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `book` */

insert  into `book`(`bid`,`bname`,`bcol`,`baut`,`year`,`tno`,`isno`) values (1,'11','11','11',11,11,10),(2,'22','22','22',22,22,2),(4,'ds','1','1',1,1,0);

/*Table structure for table `issue` */

DROP TABLE IF EXISTS `issue`;

CREATE TABLE `issue` (
  `sid` int(5) NOT NULL,
  `bid` int(5) NOT NULL default '0',
  `rs` int(1) default NULL,
  `doi` date default NULL,
  PRIMARY KEY  (`bid`),
  CONSTRAINT `FK_issue` FOREIGN KEY (`bid`) REFERENCES `book` (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `issue` */

insert  into `issue`(`sid`,`bid`,`rs`,`doi`) values (1,1,1,'0000-00-00');

/*Table structure for table `lib` */

DROP TABLE IF EXISTS `lib`;

CREATE TABLE `lib` (
  `lname` char(20) NOT NULL,
  `lid` int(5) NOT NULL,
  `mob` int(10) default NULL,
  `pass` varchar(10) default NULL,
  PRIMARY KEY  (`lid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `lib` */

insert  into `lib`(`lname`,`lid`,`mob`,`pass`) values ('1',1,11,'admin'),('qq',2,11,'lib'),('2121',111,111111,'11');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
