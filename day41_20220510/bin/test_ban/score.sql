create table ban(
name varchar2(50) not null,
kor number(10) not null,
eng number(10) not null,
mat number(10) not null,
sum number(10) not null,
avg number(10,3) not null,
primary key (name)
);

select * from ban;

drop table ban;

insert into ban values('ȫ�浿',100,100,100);
