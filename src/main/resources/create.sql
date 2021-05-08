상품명
가격
재고수량

create table web_product(
	name varchar2(1000) primary key,
	price int not null,
	stock int default 0
)

insert into web_product values('칸쵸',1000,100)

insert into web_product values('홈런볼',2400,100)

insert into web_product values('꽃게랑',850,300)

select * from WEB_PRODUCT

insert into WEB_PRODUCT values('스윙칩',1100,243)

create table web_user2(
	name varchar2(1000),
	id varchar2(1000),
	age int default 0,
	address varchar2(1000)
)

select * from web_user