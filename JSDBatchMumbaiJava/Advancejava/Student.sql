use ecart;

create table Student(
sid int primary key,
sname varchar(20) not null,
semail varchar(20) not null,
saddress varchar(20) not null,
sedu varchar(20) not null,
sphone bigint not null unique
);

delete Student from ecart;