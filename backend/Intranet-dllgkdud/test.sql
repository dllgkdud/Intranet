commit;
-- �����ȣ, ��������, ���系��, ������, �������(��Ȳ - 0:����ó��, 1:��������, 2:����Ϸ�), ���糯¥
create table sign (
    sno number primary key ,
    title varchar2(100),
	content varchar2(1000),
	email varchar2(100),
	state number default 0,
	regdate date default sysdate
);
select* from sign;
drop table sign cascade CONSTRAINTS;

-- sno �ڵ� ���� ������ ����
create sequence sseq start with 1 increment by 1;
drop sequence sseq;

-- dummy
insert into sign values(sseq.nextval, '�����Ź�帳�ϴ�.', '���系�� ���������Դϴ�. �븮��. ���� �߰����� �����ø� �亯��Ź�帳�ϴ�.', 'admin@naver.com', 0, sysdate);


-- �α��� �� ������̺�(�����ȣ, �̸���, ��й�ȣ, �̸�, �μ���ȣ, ����, �Ի���)
create table emp (
    empno number,
    email varchar2(100) not null,
    pw varchar2(2000) not null,
    ename varchar2(50),
    deptno number,
    birth varchar2(10),
    empdate date
);
select * from emp;
drop table emp cascade CONSTRAINTS;

-- empno �ڵ� ���� ������ ����
create sequence emp_seq start with 1 increment by 1;
drop sequence emp_seq;

-- dummy
insert into emp values(1, 'admin@naver.com', '1234', '������', 100, '2022-12-24', sysdate);
insert into emp values(emp_seq.nextval, 'lhy@naver.com', '1111', '���Ͽ�', 99, '2022-12-24', sysdate);

-- �μ����̺�(�μ���ȣ, �μ���(1~100 - �λ��, 101~200 - �濵��, 201~300 - ������ȹ��, 301~400 - �����ú�), ����(����, ����, ����, �븮, ����, ���))
create table dept(
    deptno number,
    dname varchar2(20),
    pos varchar2(10),
    constraint pk_dept primary key(deptno)
);
select * from dept;

-- dummy
insert into dept values(100, '�λ��', '���');

-- �ٿ�ε� �Խ���
select * from downBoard;
create sequence upno_seq start with 1 increment by 1;
delete from downBoard where title='�ٿ�ε�Խ��Ǳ�4';
create table downBoard (
upno number primary key, 
email varchar2(100) not null, 
title varchar2(100) not null, 
filename varchar2(500) not null, 
uploaddate date default sysdate
);
insert into downBoard values(upno_seq.nextval, 'lhy@naver.com', '�ٿ�ε�Խ��Ǳ�1', 'filename1', sysdate);
insert into downBoard values(upno_seq.nextval, 'lhy@naver.com', '�ٿ�ε�Խ��Ǳ�2', 'filename2', sysdate);
insert into downBoard values(upno_seq.nextval, 'lhy@naver.com', '�ٿ�ε�Խ��Ǳ�3', 'filename3', sysdate);
insert into downBoard values(upno_seq.nextval, 'lhy@naver.com', '�ٿ�ε�Խ��Ǳ�4', 'filename4', sysdate);