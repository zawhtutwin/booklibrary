/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : book_library

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2016-09-21 17:41:43
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `cover` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'To Kill A Moking Bird', 'Harper Lee', '5000', null);
INSERT INTO `book` VALUES ('2', 'A Knief of Never Letting Go', 'Patrick Ness', '5000', null);
