commit;

-- 결재번호, 결재제목, 결재내용, 결재자, 결재상태(현황 - 0:결재처리, 1:결재진행, 2:결재완료), 결재날짜
create table sign (
    sno number primary key ,
    title varchar2(100),
	content varchar2(1000),
	sid varchar2(50),
	state number default 0,
	regdate date default sysdate
);
select* from sign;

-- sno 자동 증가 시퀀스 생성
create sequence sseq start with 1 increment by 1;
drop sequence sseq;

-- dummy
insert into sign values(sseq.nextval, 'title', 'content', 'admin', 0, sysdate);


-- 로그인 겸 사원테이블(사원번호, 이메일, 비밀번호, 이름, 부서번호, 생일, 입사일)
create table emp (
    empno number,
    email varchar2(100) not null,
    pw varchar2(2000) not null,
    ename varchar2(50),
    deptno number,
    birth varchar2(10),
    empdate date,
    constraint pk_emp primary key(empno),
    constraint fk_deptno foreign key(deptno) references dept(deptno)
);
select * from emp;
drop table emp cascade CONSTRAINTS;

-- empno 자동 증가 시퀀스 생성
create sequence emp_seq start with 1 increment by 1;
drop sequence emp_seq;

-- dummy
insert into emp values(1, 'admin@naver.com', '1234', '관리자', 100, '2022-12-24', sysdate);
insert into emp values(emp_seq.nextval, 'lhy@naver.com', '1111', '이하영', 99, '2022-12-24', sysdate);

-- 부서테이블(부서번호, 부서명(1~100 - 인사부, 101~200 - 경영부, 201~300 - 전략기획부, 301~400 - 마케팅부), 직위(부장, 차장, 과장, 대리, 주임, 사원))
create table dept(
    deptno number,
    dname varchar2(20),
    pos varchar2(10),
    constraint pk_dept primary key(deptno)
);
select * from dept;

-- dummy
insert into dept values(100, '인사부', '사원');