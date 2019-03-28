/*
Navicat MySQL Data Transfer

Source Server         : 333
Source Server Version : 50722
Source Host           : 47.107.64.250:3306
Source Database       : mgzf_system

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-01-02 17:50:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for area
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `ar_id` int(11) NOT NULL AUTO_INCREMENT,
  `ar_name` varchar(20) NOT NULL,
  `ar_ct_id` int(11) NOT NULL,
  PRIMARY KEY (`ar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of area
-- ----------------------------
INSERT INTO `area` VALUES ('1', '中原区', '3');
INSERT INTO `area` VALUES ('2', '二七区', '3');
INSERT INTO `area` VALUES ('3', '管城区', '3');
INSERT INTO `area` VALUES ('4', '金水区', '3');
INSERT INTO `area` VALUES ('5', '惠济区', '3');
INSERT INTO `area` VALUES ('6', '巩义市', '3');
INSERT INTO `area` VALUES ('7', '上街区', '3');
INSERT INTO `area` VALUES ('8', '东城区', '1');
INSERT INTO `area` VALUES ('9', '西城区', '1');
INSERT INTO `area` VALUES ('10', '崇文区', '1');
INSERT INTO `area` VALUES ('11', '朝阳区', '1');
INSERT INTO `area` VALUES ('12', '丰台区', '1');
INSERT INTO `area` VALUES ('13', '海淀区', '1');
INSERT INTO `area` VALUES ('14', '房山区', '1');
INSERT INTO `area` VALUES ('15', '黄埔区', '2');
INSERT INTO `area` VALUES ('16', '卢湾区', '2');
INSERT INTO `area` VALUES ('17', '徐汇区', '2');
INSERT INTO `area` VALUES ('18', '长宁区', '2');
INSERT INTO `area` VALUES ('19', '静安区', '2');
INSERT INTO `area` VALUES ('20', '普陀区', '2');
INSERT INTO `area` VALUES ('21', '虹口区', '2');
INSERT INTO `area` VALUES ('22', '杨浦区', '2');
INSERT INTO `area` VALUES ('23', '宝山区', '2');
INSERT INTO `area` VALUES ('24', '浦东新区', '2');

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `ct_id` int(11) NOT NULL AUTO_INCREMENT,
  `ct_name` varchar(20) NOT NULL,
  PRIMARY KEY (`ct_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '北京');
INSERT INTO `city` VALUES ('2', '上海');
INSERT INTO `city` VALUES ('3', '郑州');

-- ----------------------------
-- Table structure for hotarea
-- ----------------------------
DROP TABLE IF EXISTS `hotarea`;
CREATE TABLE `hotarea` (
  `ha_id` int(11) NOT NULL AUTO_INCREMENT,
  `ha_ar_id` int(11) NOT NULL,
  PRIMARY KEY (`ha_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotarea
-- ----------------------------
INSERT INTO `hotarea` VALUES ('1', '2');
INSERT INTO `hotarea` VALUES ('2', '4');
INSERT INTO `hotarea` VALUES ('3', '11');
INSERT INTO `hotarea` VALUES ('4', '13');
INSERT INTO `hotarea` VALUES ('5', '17');
INSERT INTO `hotarea` VALUES ('6', '18');
INSERT INTO `hotarea` VALUES ('7', '23');

-- ----------------------------
-- Table structure for hotbrand
-- ----------------------------
DROP TABLE IF EXISTS `hotbrand`;
CREATE TABLE `hotbrand` (
  `hb_id` int(11) NOT NULL AUTO_INCREMENT,
  `hb_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`hb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotbrand
-- ----------------------------
INSERT INTO `hotbrand` VALUES ('1', '净月花苑');
INSERT INTO `hotbrand` VALUES ('2', '盛世佳苑');
INSERT INTO `hotbrand` VALUES ('3', '观山');
INSERT INTO `hotbrand` VALUES ('4', '梦境');

-- ----------------------------
-- Table structure for hotbrand_house
-- ----------------------------
DROP TABLE IF EXISTS `hotbrand_house`;
CREATE TABLE `hotbrand_house` (
  `hh_id` int(11) NOT NULL AUTO_INCREMENT,
  `hh_hb_id` int(11) DEFAULT NULL,
  `hh_h_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`hh_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotbrand_house
-- ----------------------------
INSERT INTO `hotbrand_house` VALUES ('1', '1', '1');
INSERT INTO `hotbrand_house` VALUES ('2', '1', '3');
INSERT INTO `hotbrand_house` VALUES ('3', '2', '2');
INSERT INTO `hotbrand_house` VALUES ('4', '3', '4');
INSERT INTO `hotbrand_house` VALUES ('5', '4', '5');

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `h_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `h_lk_id` int(11) NOT NULL,
  `h_space` int(11) DEFAULT NULL COMMENT '面积',
  `Date` date NOT NULL COMMENT '"上架时间"',
  `h_ct_id` int(11) DEFAULT NULL,
  `h_ar_id` int(11) DEFAULT NULL,
  `h_sb_id` int(11) DEFAULT NULL,
  `h_sbs_id` int(11) DEFAULT NULL,
  `h_pw_id` int(11) DEFAULT NULL,
  `h_ht_id` int(11) DEFAULT NULL,
  `h_rt_id` int(11) DEFAULT NULL,
  `h_dr_num` int(11) DEFAULT NULL COMMENT '"客厅数量"',
  `h_toilet_num` int(11) DEFAULT NULL COMMENT '"卫生间"',
  `h_info` varchar(888) DEFAULT NULL,
  `h_statuts` int(11) NOT NULL,
  `h_price` int(11) DEFAULT NULL,
  `h_st_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '净月花苑', '1', '20', '2018-12-12', '1', '14', '1', '1', '1', '1', '1', '1', '1', '一块钱，一块钱，您租不了吃亏住不了上当社区介绍：环境优美，楼间距较大，采光效果特别好，小区治安好，物业管理完善，绿化率较高，让您拥有花园一样的居住环境。周边步行300米~500米就到世纪联华超市、菜场、美容SPA馆，KFC,足浴，,娱乐中心健身会所等应有尽有！地铁7号线大华三路站步行700米左右。', '1', '1', '1');
INSERT INTO `house` VALUES ('2', '净日花苑', '1', '34', '2018-12-18', '2', '24', '4', '5', '2', '2', '1', '2', '1', '两块钱，两块钱，您租不了吃亏租不了上当社区介绍：环境优美，楼间距较大，采光效果特别好，小区治安好，物业管理完善，绿化率较高，让您拥有花园一样的居住环境。周边步行300米~500米就到世纪联华超市、菜场、美容SPA馆，KFC,足浴，,娱乐中心健身会所等应有尽有！地铁7号线大华三路站步行700米左右。', '1', '2', '1');
INSERT INTO `house` VALUES ('3', '盛世佳苑', '1', '140', '2018-12-29', '1', '8', '6', '2', '2', '4', '1', '2', '2', '三块钱，三块钱，您租不了吃亏住不了上当社区介绍：环境优美，楼间距较大，采光效果特别好，小区治安好，物业管理完善，绿化率较高，让您拥有花园一样的居住环境。周边步行300米~500米就到世纪联华超市、菜场、美容SPA馆，KFC,足浴，,娱乐中心健身会所等应有尽有！地铁7号线大华三路站步行700米左右。', '1', '3', '3');
INSERT INTO `house` VALUES ('4', '净花苑', '1', '10', '2018-12-12', '1', '12', '1', '1', '1', '1', '2', '1', '1', '一块钱，一块钱，您租不了吃亏住不了上当社区介绍：环境优美，楼间距较大，采光效果特别好，小区治安好，物业管理完善，绿化率较高，让您拥有花园一样的居住环境。周边步行300米~500米就到世纪联华超市、菜场、美容SPA馆，KFC,足浴，,娱乐中心健身会所等应有尽有！地铁7号线大华三路站步行700米左右。', '1', '1', '4');
INSERT INTO `house` VALUES ('5', '净苑', '1', '40', '2018-12-18', '2', '19', '4', '5', '2', '2', '1', '2', '1', '两块钱，两块钱，您租不了吃亏租不了上当社区介绍：环境优美，楼间距较大，采光效果特别好，小区治安好，物业管理完善，绿化率较高，让您拥有花园一样的居住环境。周边步行300米~500米就到世纪联华超市、菜场、美容SPA馆，KFC,足浴，,娱乐中心健身会所等应有尽有！地铁7号线大华三路站步行700米左右。', '1', '2', '2');
INSERT INTO `house` VALUES ('6', '盛世苑', '1', '140', '2018-12-29', '1', '8', '6', '2', '2', '4', '1', '2', '2', '三块钱，三块钱，您租不了吃亏住不了上当社区介绍：环境优美，楼间距较大，采光效果特别好，小区治安好，物业管理完善，绿化率较高，让您拥有花园一样的居住环境。周边步行300米~500米就到世纪联华超市、菜场、美容SPA馆，KFC,足浴，,娱乐中心健身会所等应有尽有！地铁7号线大华三路站步行700米左右。', '1', '3', '5');

-- ----------------------------
-- Table structure for houseimg
-- ----------------------------
DROP TABLE IF EXISTS `houseimg`;
CREATE TABLE `houseimg` (
  `hi_id` int(11) NOT NULL AUTO_INCREMENT,
  `hi_h_id` int(11) DEFAULT NULL,
  `hi_imgurl` varchar(255) DEFAULT NULL,
  `h_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`hi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of houseimg
-- ----------------------------
INSERT INTO `houseimg` VALUES ('1', '1', 'images/fang1.jpg', '1');
INSERT INTO `houseimg` VALUES ('2', '2', 'images/fang2.jpg', '2');
INSERT INTO `houseimg` VALUES ('3', '3', 'images/fang3.jpg', '3');
INSERT INTO `houseimg` VALUES ('4', '4', 'images/fang4.jpg', '4');
INSERT INTO `houseimg` VALUES ('5', '5', 'images/fang5.jpg', '5');
INSERT INTO `houseimg` VALUES ('6', '6', 'images/fang6.jpg', '6');
INSERT INTO `houseimg` VALUES ('7', '1', 'images/fang7.jpg', '1');

-- ----------------------------
-- Table structure for housetype
-- ----------------------------
DROP TABLE IF EXISTS `housetype`;
CREATE TABLE `housetype` (
  `ht_id` int(11) NOT NULL AUTO_INCREMENT,
  `ht_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ht_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of housetype
-- ----------------------------
INSERT INTO `housetype` VALUES ('1', '一室');
INSERT INTO `housetype` VALUES ('2', '二室');
INSERT INTO `housetype` VALUES ('3', '三室');
INSERT INTO `housetype` VALUES ('4', '四室');
INSERT INTO `housetype` VALUES ('5', '五室');

-- ----------------------------
-- Table structure for house_config
-- ----------------------------
DROP TABLE IF EXISTS `house_config`;
CREATE TABLE `house_config` (
  `hc_id` int(11) NOT NULL COMMENT '所有配置 1 拥有 0 未拥有',
  `hc_h_id` int(11) DEFAULT NULL,
  `hc_air` int(2) DEFAULT NULL,
  `hc_bed` int(2) DEFAULT NULL,
  `hc_table` int(2) DEFAULT NULL,
  `hc_chest` int(2) DEFAULT NULL,
  `hc_toilet` int(2) DEFAULT NULL,
  `hc_wifi` int(2) DEFAULT NULL,
  `hc_calorifier` int(2) DEFAULT NULL,
  `hc_kv` int(2) DEFAULT NULL,
  `hc_balcony` int(2) DEFAULT NULL,
  `hc_washer` int(2) DEFAULT NULL,
  `hc_refrigerator` int(2) DEFAULT NULL,
  `hc_tv` int(2) DEFAULT NULL,
  `hc_pansonic` int(2) DEFAULT NULL,
  `hc_gasstove` int(2) DEFAULT NULL,
  `hc_Cooker` int(2) DEFAULT NULL,
  `hc_sofa` int(2) DEFAULT NULL,
  PRIMARY KEY (`hc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house_config
-- ----------------------------
INSERT INTO `house_config` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '0', '1', '1');
INSERT INTO `house_config` VALUES ('2', '2', '1', '1', '1', '1', '1', '0', '0', '0', '0', '1', '1', '0', '0', '1', '0', '1');
INSERT INTO `house_config` VALUES ('3', '3', '1', '1', '1', '1', '0', '0', '0', '1', '0', '0', '0', '1', '1', '0', '1', '0');
INSERT INTO `house_config` VALUES ('4', '4', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1', '0', '0', '1', '0', '1', '0');
INSERT INTO `house_config` VALUES ('5', '5', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1', '0', '0', '1', '0', '1', '0');
INSERT INTO `house_config` VALUES ('6', '6', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1', '0', '0', '1', '0', '1', '0');

-- ----------------------------
-- Table structure for linkman
-- ----------------------------
DROP TABLE IF EXISTS `linkman`;
CREATE TABLE `linkman` (
  `lk_id` int(11) NOT NULL AUTO_INCREMENT,
  `lk_name` varchar(20) DEFAULT NULL,
  `lk_tel` varchar(20) DEFAULT NULL,
  `lk_password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`lk_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of linkman
-- ----------------------------
INSERT INTO `linkman` VALUES ('1', '悠哈', '1201321324', '123');

-- ----------------------------
-- Table structure for payway
-- ----------------------------
DROP TABLE IF EXISTS `payway`;
CREATE TABLE `payway` (
  `pw_id` int(11) NOT NULL AUTO_INCREMENT,
  `pw_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pw_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payway
-- ----------------------------
INSERT INTO `payway` VALUES ('1', '一次性支付');
INSERT INTO `payway` VALUES ('2', '分期支付');

-- ----------------------------
-- Table structure for renttype
-- ----------------------------
DROP TABLE IF EXISTS `renttype`;
CREATE TABLE `renttype` (
  `rt_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of renttype
-- ----------------------------
INSERT INTO `renttype` VALUES ('1', '整租');
INSERT INTO `renttype` VALUES ('2', '合租');

-- ----------------------------
-- Table structure for street
-- ----------------------------
DROP TABLE IF EXISTS `street`;
CREATE TABLE `street` (
  `st_id` int(11) NOT NULL AUTO_INCREMENT,
  `st_name` varchar(20) NOT NULL,
  `st_ar_id` int(11) NOT NULL,
  PRIMARY KEY (`st_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of street
-- ----------------------------
INSERT INTO `street` VALUES ('1', '棉织路', '1');
INSERT INTO `street` VALUES ('2', '冠云路', '1');
INSERT INTO `street` VALUES ('3', '王屋路', '1');
INSERT INTO `street` VALUES ('4', '白河路', '2');
INSERT INTO `street` VALUES ('5', '湖西路', '2');
INSERT INTO `street` VALUES ('6', '太白路', '3');
INSERT INTO `street` VALUES ('7', '五彩路', '3');
INSERT INTO `street` VALUES ('8', '兴商路', '3');
INSERT INTO `street` VALUES ('9', '丹心路', '4');

-- ----------------------------
-- Table structure for subway
-- ----------------------------
DROP TABLE IF EXISTS `subway`;
CREATE TABLE `subway` (
  `sb_id` int(11) NOT NULL AUTO_INCREMENT,
  `sb_name` varchar(20) NOT NULL,
  `sb_ct_id` int(11) NOT NULL,
  PRIMARY KEY (`sb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subway
-- ----------------------------
INSERT INTO `subway` VALUES ('1', '1号线', '2');
INSERT INTO `subway` VALUES ('2', '2号线', '2');
INSERT INTO `subway` VALUES ('3', '3号线', '2');
INSERT INTO `subway` VALUES ('4', '4号线', '2');
INSERT INTO `subway` VALUES ('5', '5号线', '2');
INSERT INTO `subway` VALUES ('6', '浦江线', '2');
INSERT INTO `subway` VALUES ('7', '1号线', '1');

-- ----------------------------
-- Table structure for subwaystation
-- ----------------------------
DROP TABLE IF EXISTS `subwaystation`;
CREATE TABLE `subwaystation` (
  `sbs_id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `sbs_name` varchar(20) DEFAULT NULL,
  `sbs_sb_id` int(11) NOT NULL,
  PRIMARY KEY (`sbs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subwaystation
-- ----------------------------
INSERT INTO `subwaystation` VALUES ('00000000001', '富锦路', '1');
INSERT INTO `subwaystation` VALUES ('00000000002', '友谊西路', '1');
INSERT INTO `subwaystation` VALUES ('00000000003', '上海马戏城', '1');
INSERT INTO `subwaystation` VALUES ('00000000004', '中山北路', '1');
INSERT INTO `subwaystation` VALUES ('00000000005', '上海火车站', '1');
INSERT INTO `subwaystation` VALUES ('00000000006', '锦江乐园', '1');
INSERT INTO `subwaystation` VALUES ('00000000007', '浦东国际机场站', '2');
INSERT INTO `subwaystation` VALUES ('00000000008', '华夏东路站', '2');
INSERT INTO `subwaystation` VALUES ('00000000009', '张江高科站', '2');
INSERT INTO `subwaystation` VALUES ('00000000010', '人民广场站', '2');
INSERT INTO `subwaystation` VALUES ('00000000011', '江杨北路站', '3');
INSERT INTO `subwaystation` VALUES ('00000000012', '赤峰路站', '3');
INSERT INTO `subwaystation` VALUES ('00000000013', '漕溪路站', '3');
INSERT INTO `subwaystation` VALUES ('00000000014', '石龙路站', '3');
INSERT INTO `subwaystation` VALUES ('00000000015', '江杨北路站', '4');
INSERT INTO `subwaystation` VALUES ('00000000016', '浦东国际机场站', '4');
INSERT INTO `subwaystation` VALUES ('00000000017', '上海火车站', '4');
INSERT INTO `subwaystation` VALUES ('00000000018', '上海马戏城', '4');
INSERT INTO `subwaystation` VALUES ('00000000019', '东方明珠站', '4');
INSERT INTO `subwaystation` VALUES ('00000000020', '漕溪路站', '5');
INSERT INTO `subwaystation` VALUES ('00000000021', '人民广场站', '5');
INSERT INTO `subwaystation` VALUES ('00000000022', '富锦路', '5');
INSERT INTO `subwaystation` VALUES ('00000000023', '赤峰路站', '5');
INSERT INTO `subwaystation` VALUES ('00000000024', '浦东国际机场站', '5');
