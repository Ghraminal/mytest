create table tbl_gest(
name varchar2(20) primary key,
p_number number,
vip varchar2(3),
room_id varchar2(20),
entrance_time varchar2(20),
departure_time varchar2(20)
);

create table tbl_room(
room_id varchar2(20) primary key,
location varchar2(3),
vip varchar2(3),
use_flag varchar2(3)
);