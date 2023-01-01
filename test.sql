commit;

-- 결재번호, 결재제목, 결재내용, 결재자, 결재상태(현황 - 0:결재처리, 1:결재진행, 2:결재완료), 결재날짜
create table sign (
    sno number primary key ,
    title varchar2(100),
	content varchar2(1000),
	email varchar2(100),
	state number default 0,
	regdate date default sysdate
);
select* from sign where sno=1;
drop table sign cascade CONSTRAINTS;

-- sno 자동 증가 시퀀스 생성
create sequence sseq start with 1 increment by 1;
drop sequence sseq;

-- dummy
insert into sign values(sseq.nextval, '결재부탁드립니다.', '결재내용 수정사항입니다. 대리님. 이후 추가사항 있으시면 답변부탁드립니다.', 'admin@naver.com', 0, sysdate);


-- 로그인 겸 사원테이블(사원번호, 이메일, 비밀번호, 이름,
--  부서(인사부, 경영부, 전략기획부, 마케팅부), 직위(부장, 차장, 과장, 대리, 주임, 사원), 생일, 입사일)
create table emp (
    empno number,
    email varchar2(100) not null,
    pw varchar2(2000) not null,
    ename varchar2(50),
    dept varchar2(50),
    pos varchar2(10),
    birth varchar2(10),
    empdate date,
    constraint pk_emp primary key(empno)
);
select * from emp;
drop table emp cascade CONSTRAINTS;

-- empno 자동 증가 시퀀스 생성
create sequence emp_seq start with 1 increment by 1;
drop sequence emp_seq;

-- dummy
insert into emp values(emp_seq.nextval, 'admin@naver.com', '1234', '관리자', '인사부', '과장', '2022-12-24', sysdate);
insert into emp values(emp_seq.nextval, 'test@naver.com', '1111', '테스터', '마케팅부', '사원', '2022-12-24', sysdate);

-- 공지테이블(공지번호, 제목, 내용, 작성자, 작성일)
create table bboard(
    no int primary key,
    title varchar(200) not null,
    content varchar(1000) not null,
    email varchar(100) not null,
    regdate date default sysdate
);

desc bboard;
select * from bboard;
drop table bboard;

create sequence nseq increment by 1 start with 1;
drop sequence nseq;

insert into bboard values(nseq.nextval,'제목1','내용1','admin@naver.com',sysdate);
