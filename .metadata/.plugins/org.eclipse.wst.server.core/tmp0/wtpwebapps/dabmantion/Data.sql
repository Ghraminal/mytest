create table DMT_RESV(
	resv_no varchar2(20) not null primary key,
	resv_date char(8),
	cust_no char(11)
);


insert into DMT_RESV values('홍길동', '20250821', '01011112222');
insert into DMT_RESV values('루이지', '20250824', '01011114444');

select * from DMT_RESV;