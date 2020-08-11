CREATE TABLE `t_employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `empname` varchar(50) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `login_account` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;