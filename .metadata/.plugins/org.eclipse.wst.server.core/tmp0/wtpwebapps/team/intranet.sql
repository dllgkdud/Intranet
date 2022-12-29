create table member(
    id varchar(30) primary key,
    pw varchar(300) not null,
    name varchar(50) not null,
    tel varchar(13),
    email varchar(100),
    addr varchar(150),
    regdate date default sysdate
);
desc member;
select * from member;
drop table member;

insert into member values('admin','1111','관리자','010-1111-1111','admin@intranet.com','서울',sysdate);
insert into member values('hsy','1234','한시연','010-1234-1234','hsy@intranet.com','인천',sysdate);
insert into member values('ihy','5678','이하영','010-5678-5678','ihy@intranet.com','김포',sysdate);
insert into member values('hth','9101','한태헌','010-9101-9101','hth@intranet.com','파주',sysdate);

create table board(
    no int primary key,
    title varchar(200) not null,
    content varchar(1000) not null,
    author varchar(20) not null,
    regdate date default sysdate
);

desc board;
select * from board;
drop table board;

create sequence nseq increment by 1 start with 1;
drop sequence nseq;

insert into board values(nseq.nextval,'제목1','내용1','admin',sysdate);
insert into board values(nseq.nextval,'제목2','내용2','admin',sysdate);
insert into board values(nseq.nextval,'제목3','내용3','admin',sysdate);
insert into board values(nseq.nextval,'제목4','내용4','admin',sysdate);


commit

create table email(
	
)

