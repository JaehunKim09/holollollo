--Table 삭제
drop table client;
drop table admin;
drop table product;
drop table product_order;
drop table review;
drop table mtm;

--Table 생성
create table client(
id      varchar2(15)  not null primary key, --PK
pw 	    varchar2(20)  not null,
name    varchar2(10)  not null,
email   varchar2(30)  not null,
address varchar2(100) not null,
Phone   varchar2(20)  not null
);
select * from client;

create table admin(
admin_id   varchar2(15) not null primary key, --PK
admin_name varchar2(10) not null,
admin_pw   varchar2(20) not null
);
select * from admin;

create table product(
pNum        number       not null primary key, --PK
pName       varchar2(30) not null,
pPrice      number       not null,
pImg        varchar2(100), --상품 이미지 주소
pShortInfo  varchar2(200), --상품 간략설명
pDetailInfo varchar2(4000), --상품 상세설명
pCategory   varchar2(10) --상품 카테고리명+번호
);
select * from product;

create table product_order(
pNum      number        references product(pNum), --FK : product(pNum)
id        varchar2(15)  references client(id), --FK : client(id)
oNum      number        not null primary key, --PK
oPrice    number        not null, --상품 가격 x 수량 (총 가격)
cnt       number        default 1 not null, --상품 수량
orderDate TimeStamp     default sysdate not null, --주문일자
oName     varchar2(10)  not null, --받는사람 이름
oAddress  varchar2(100) not null, --받는사람 주소
oPhone    varchar2(20) --받는사람 연락처
);
select * from product_order;

create table review(
pNum       number       references product(pNum), --FK : product(pNum)
id         varchar2(15) references client(id), --FK : client(id)
oNum       number       references product_order(oNum), --FK : product_order(oNum)
rNum       number       not null primary key, --PK
content    varchar2(1000),
rImg       varchar2(100),
reviewDate TimeStamp    default sysdate not null --리뷰 작성일
);
select * from review;

create table mtm(
id      varchar2(15)   references client(id), --FK : client(id)
mNum    number         not null primary key, --1:1문의 번호
title   varchar2(100)  not null,
content varchar2(4000) not null,
reply   varchar2(4000), --답변
mtmDate TimeStamp      default sysdate not null --1:1문의글 작성일
);
select * from mtm;

--Sequence 삭제
drop sequence pNum_seq;
drop sequence oNum_seq;
drop sequence rNum_seq;
drop sequence mNum_seq;

--Sequence 생성
create sequence pNum_seq start with 1 increment by 1;
create sequence oNum_seq start with 1 increment by 1;
create sequence rNum_seq start with 1 increment by 1;
create sequence mNum_seq start with 1 increment by 1;