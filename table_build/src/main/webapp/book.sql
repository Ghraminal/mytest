create table tbl_student(
student_id char(8) primary key,
name varchar2(20),
department varchar2(30),
phone varchar2(15)
);

create table tbl_loan(
loan_id number primary key,
student_id char(8),
book_title varchar2(50),
loan_date date,
due_date date
);