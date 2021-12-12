create sequence seq_board;

create table tbl_board(
    bno number(10,0),
    title varchar2(200) not null,
    content varchar2(2000) not null,
    writer varchar2(50) not null,
    regdate date default sysdate,
    updatedate date default sysdate
);

alter table tbl_board add constraint pk_board
primary key (bno);


----------더미 데이터 추가
insert into tbl_board(bno, title, content, writer) 
values(seq_board.nextval, 'test title','test content', 'user00');

select * from tbl_board;

select * from tbl_board where bno>0;
commit;
-----------------377
create table tbl_reply(
	rno number(10,0),
	bno number(10,0),
	reply varchar2(1000) not null,
	replyer varchar2(50) not null,
	replyDate date default sysdate,
	updateDate date default sysdate
	
);

create sequence seq_reply;

alter table tbl_reply add constraint pk_reply primary key(rno);
ALTER TABLE tbl_reply DROP CONSTRAINT fk_reply_board;
alter table tbl_reply add constraint fk_reply_board
foreign key(bno) references tbl_board(bno) on delete cascade;

select * from tbl_board where rownum<10 order by bno desc;

select * from tbl_reply order by rno desc;

---- aop 테스트
create table tbl_sample1(col1 varchar2(500));

create table tbl_sample2(col2 varchar2(50));

select * from tbl_sample1;
delete from tbl_sample1;

select * from tbl_sample2;
commit;

--480P 20 댓글과 댓글수에 대한 처리
alter table tbl_board add (replycnt number default 0); --replyCnt 칼럼 추가(댓글의 수)

    --기존댓글이 존재했다면 replyCnt에 반영해둬야함.
update tbl_board set replycnt= (select count(rno) from tbl_reply where tbl_reply.bno=tbl_board.bno);

select * from tbl_board;

--550p
--첨부파일을 보관하는 테이블
create table tbl_attach(
    uuid varchar2(100) not null,
    uploadPath varchar2(200) not null,
    fileName varchar2(100) not null,
    filetype char(1) default 'I',
    bno number(10,0)
);

alter table tbl_attach add constraint pk_attach primary key(uuid);

ALTER TABLE tbl_attach DROP CONSTRAINT fk_board_attach;
alter table tbl_attach add constraint fk_board_attach foreign key (bno) references tbl_board(bno) on delete cascade;

commit;
delete from tbl_attach where bno=113;

---part7 645P 지정된 테이블
create table users(
    username varchar2(50) not null primary key,
    password varchar2(50) not null,
    enabled char(1) default '1'
);

create table authorities(
    username varchar2(50) not null,
    authority varchar2(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username, authority);

insert into users(username, password) values ('user00','pw00');
insert into users(username, password) values ('member00','pw00');
insert into users(username, password) values ('admin00','pw00');

insert into authorities (username, authority) values ('user00','ROLE_USER');
insert into authorities (username, authority) values ('member00','ROLE_MANAGER');
insert into authorities (username, authority) values ('admin00','ROLE_MANAGER');
insert into authorities (username, authority) values ('admin00','ROLE_ADMIN');

commit;
-- 651P 일반적인 회원 테이블과 권한 테이블
create table tbl_member(
    userid varchar2(50) not null primary key,
    userpw varchar2(100) not null,
    username varchar2(100) not null,
    regdate date default sysdate,
    updatedate date default sysdate,
    enabled char(1) default '1'
);

create table tbl_member_auth(
    userid varchar2(50) not null,
    auth varchar2(50) not null,
    constraint fk_member_auth foreign key(userid) references tbl_member(userid)
);

select * from tbl_member;

delete from tbl_member;
delete from tbl_member_auth;
commit;

SELECT mem.userid, userpw, username, enabled, regdate, updatedate, auth
		FROM tbl_member mem LEFT OUTER JOIN tbl_member_auth auth on mem.userid=auth.userid
		WHERE mem.userid='manager84';
        
--자동로그인을 위한 지정된 형식의 테이블 677P
create table persistent_logins(
    username varchar(64) not null,
    series varchar(64) primary key,
    token varchar(64) not null,
    last_used timestamp not null
);






----teamproject pre-test
-- 게시물 테이블
create table tbl_board_team(
    fno int, --전체게시글 번호
	BCATAGORY varchar2(20) not null, --전체게시판 유형(자유게시판, 공지사항, Q&A)
	BNO int not null, -- 게시판별 게시글번호(시퀀스 따로 설정)
	PCATAGORY varchar2(20) not null, -- 게시판 내 카테고리 저장
	title varchar2(200) not null, --제목
	tbl_contents varchar2(2000) not null, -- 내용
	regdate date default sysdate, --등록일 
	updateDate date default sysdate, --수정일 
	views int default 0, --조회수 
	user_id varchar2(20) -- 외래키(사용자ID)
);

create sequence seq_fno; --전체게시글 시퀀스
create sequence seq_bno; --게시판별 게시글 시퀀스

alter table tbl_board_team add constraint pk_board_team
primary key (fno);

insert into tbl_board_team(fno,BCATAGORY, bno,PCATAGORY, title, tbl_contents, user_id) 
values(seq_fno.nextval,'자유게시판',seq_bno.nextval,'독서토론','test title','test content', 'user00');
commit;
select * from tbl_board_team;

select seq_fno.nextval as fno, seq_bno.nextval as bno from dual;


select * from tbl_board_team where bno=37and bcatagory='자유게시판';
select views from tbl_board_team where bno=37 and bcatagory='자유게시판';
update tbl_board_team set views=views+1 where bno=37 and bcatagory='자유게시판';
commit;

--댓글테이블
create table tbl_reply_team(
	rno number(10,0),
	fno number(10,0), -- 전체 게시글번호
	reply varchar2(1000) not null, --댓글내용
	replyer varchar2(50) not null, --댓글작성자
	replyDate date default sysdate, --작성일
	updateDate date default sysdate --댓글 수정일
	
);

alter table tbl_reply_team add constraint pk_reply_team primary key(rno);
--ALTER TABLE tbl_reply_team DROP CONSTRAINT fk_reply_board;
alter table tbl_reply_team add constraint fk_reply_team
foreign key(fno) references tbl_board_team(fno) on delete cascade;

select * from tbl_reply_team;
create sequence seq_reply_team;

commit;

select * from tbl_board_team 
where (title like '%test%'or tbl_contents like '%test%' or user_id like '%test%') 
and (pcatagory like '%독서토론%') 
and rownum <=20;

select fno,BCATAGORY, bno,PCATAGORY, title, tbl_contents, user_id,regdate,updatedate, views 
from (select /*+INDEX_DESC(tbl_board_team pk_board_team)*/ rownum rn, fno,BCATAGORY, bno,PCATAGORY, 
title, tbl_contents, user_id,regdate,updatedate,views from tbl_board_team where ( user_id like 
'%' || '00'||'%' ) AND ( pcatagory like '%독서토론%' ) AND rownum<=1*10) where rn>(1-1)*10; 

select * from tbl_board_team;
commit;