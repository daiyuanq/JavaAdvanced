/*
MySQL Data Transfer
Source Host: localhost
Source Database: test
Target Host: localhost
Target Database: test
Date: 2017/8/24 ������ 16:35:11
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
CREATE TABLE `bookinfo` (
  `ID` int(10) NOT NULL auto_increment,
  `bookNo` varchar(10) NOT NULL,
  `bookname` varchar(40) NOT NULL,
  `author` varchar(20) default NULL,
  `publisher` varchar(20) default NULL,
  `price` double(4,0) default NULL,
  `publishtime` varchar(8) default NULL,
  `ISBN` varchar(20) default NULL,
  `amount` int(4) default NULL,
  PRIMARY KEY  (`ID`,`bookNo`),
  UNIQUE KEY `indexbookNo` (`bookNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `bookinfo` VALUES ('2', '0204', 'Java高级程序设计', '戴远泉', '电子工业出版社', '49', null, null, null);
INSERT INTO `bookinfo` VALUES ('3', '0203', '操作系统', '戴远泉', '清华大学出版社', '0', '10170801', null, '0');
INSERT INTO `bookinfo` VALUES ('4', '0205', '数据结构', '戴远泉', null, null, null, null, null);
