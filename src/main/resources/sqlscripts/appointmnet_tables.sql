/*
 * This is DDLscript for appointments application
 * Author : Rama
 * Date : 5/12/2017
 */

drop table if exists app_user;

create table app_user(
 app_user_id int not null AUTO_INCREMENT primary key,  
  user_name varchar(200) not null,
  gender varchar(10),
  age int,
  address1 varchar(500),
  address2 varchar(500),
  area varchar(200),
  vicinity_area varchar(200),
  city varchar(100),
  state varchar(100),
  pin int,
  user_id varchar(200),
  password varchar(200)
  
);
