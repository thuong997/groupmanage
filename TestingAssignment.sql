-- create database
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;

-- create table: Group
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	id 				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name` 			NVARCHAR(30) NOT NULL UNIQUE KEY
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data Group
INSERT INTO `Group`	(`name`) 
VALUES
					(N'Marketing'	),
					(N'Sale'		),
					(N'Bảo vệ'		),
					(N'Nhân sự'		),
					(N'Kỹ thuật'	),
					(N'Tài chính'	),
					(N'Phó giám đốc'),
					(N'Giám đốc'	),
					(N'Thư kí'		),
					(N'Bán hàng'	);