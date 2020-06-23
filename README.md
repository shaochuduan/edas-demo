# edas-demo
ssm + hsf 案例部署到edas
1、下载启动轻量级配置及注册中心
https://help.aliyun.com/document_detail/44163.html?spm=a2c4g.11186623.2.17.4e98665dbHGApM

2、下载aliTomcat及Pandora
https://help.aliyun.com/document_detail/99410.html?spm=a2c4g.11186623.6.609.37325a300RQ7Bs

3、mysql建表语句
CREATE TABLE `mall_user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) DEFAULT NULL,
  `user_address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

insert into mall_user (user_name,user_address) values ('张三','广州');
insert into mall_user (user_name,user_address) values ('李四','广州');
insert into mall_user (user_name,user_address) values ('王五','广州');
insert into mall_user (user_name,user_address) values ('jack','佛山');

4、模块介绍
user-api：模块中定义了服务器接口及实体对象
user-service：模块中定义了服务的实现方法，并在此把服务注册到注册中心
user-consumer：服务消费模块，引用user-service中注册的能力。

5、最外层pom.xml文件统一对依赖版本进行管理，各模块中引用需要的jar
