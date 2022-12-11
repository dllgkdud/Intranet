commit;

-- 결재번호, 결재제목, 결재내용, 결재자, 결재상태(현황 - 0:결재처리, 1:결재진행, 2:결재완료), 결재날짜
create table sign (
    sno number primary key ,
    title varchar2(100),
	content varchar2(1000),
	sid varchar2(50),
	state number default 0,
	regdate varchar2(50)
);
-- sno 자동 증가 시퀀스 생성
create sequence sseq start with 1 increment by 1;
drop sequence sseq;

-- sign table
insert into sign(sno, title, content) values(sseq.nextval, 'title', 'content');
select * from sign;
