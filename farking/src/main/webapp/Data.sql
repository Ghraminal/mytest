drop table car;

create table car(
car_number char(10) not null primary key,
car_name varchar2(15),
owner_name varchar2(20)
);

insert into CAR
values('11가1111','그랜저','박선수');
insert into CAR
values('22가2222','k3','백선수');
insert into CAR
values('33가3333','셀토스','채선수');
insert into CAR
values('44가4444','sm5','임선수');
insert into CAR
values('55가5555','티볼리','한선수');

drop table parking;

create table parking(
car_number char(10) not null,
location char(4),
entrance_time varchar2(6),
departure_time varchar2(6),
primary key(car_number, location)
);

insert into parking
values('11가1111','A001','11:22','');

drop table parking_lot;

create table parking_lot(
location char(4) not null primary key,
hourly_parking_fee varchar2(10)
);

insert into parking_lot
values('A001','1000');
insert into parking_lot
values('A002','1000');
insert into parking_lot
values('A003','1000');
insert into parking_lot
values('A004','1000');
insert into parking_lot
values('A005','1000');