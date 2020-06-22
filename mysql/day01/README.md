一、假设某建筑公司要设计一个数据库。公司的业务规则概括说明如下
公司承担多个工程项目，每一项工程有：工程号、工程名称、施工人员等
公司有多名职工，每一名职工有：职工号、姓名、性别、职务（工程师、技术员）等
公司按照工时和小时工资率支付工资，小时工资率由职工的职务决定（例如，技术员的小时工资率与工程师不同）
```
create database xxcompany;

use xxcompany;

create table project(
	projectid int,
    projectname varchar(30)
);

create table staff(
	staffid int,
    staffname varchar(20),
    post varchar(20)
);

create table post(
	post varchar(20),
    wagerate double
);

create table projectworkhour(
	projectid int,
    staffid int,
    workhour int
);
```