create table ban(
name varchar2(50) not null,
kor varchar2(10) not null,
eng varchar2(10) not null,
mat varchar2(10) not null,
primary key (name)
);
drop table ban
drop table ban2
insert into ban values('부모이름','부모가','부모나','부모다')
insert into ban2 values('자식이름','자식가','자식나','자식다')

create table ban2(
ban_name varchar2(50) not null,
kor varchar2(10) not null,
eng varchar2(10) not null,
mat varchar2(10) not null,
primary key (ban_name)
);
select name from name join 

join 

select * from ban;

drop table ban;

insert into ban values('홍길동',100,100,100);
