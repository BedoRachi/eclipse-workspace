SELECT * FROM TAB;

alter session set nls_date_format='YYYY-MM-DD';

drop table emp purge ;
CREATE TABLE EMP ( 
  EMPNO     NUMBER(4, 0), 
  ENAME     VARCHAR2(10), 
  JOB       VARCHAR2(9), 
  MGR       NUMBER(4, 0), 
  HIREDATE  DATE, 
  SAL       NUMBER(7, 2),
  COMM      NUMBER(7, 2), 
  DEPTNO    NUMBER(2, 0));

insert into emp values (7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
insert into emp values (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
insert into emp values (7521,'WARD','SALESMAN',7698,'1982-02-22',1250,500,30);
insert into emp values (7566,'JONES','MANAGER',7839,'1981-04-02',2975,null,20);
insert into emp values (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
insert into emp values (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,null,30);
insert into emp values (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,null,10);
insert into emp values (7788,'SCOTT','ANALYST',7566,'1987-04-17',3000,null,20);
insert into emp values (7839,'KING','PRESIDENT',null,'1981-11-17',5000,null,10);
insert into emp values (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
insert into emp values (7876,'ADAMS','CLERK',7788,'1987-05-23',1100,null,20);
insert into emp values (7900,'JAMES','CLERK',7698,'1981-12-03',950,null,30);
insert into emp values (7902,'FORD','ANALYST',7566,'1981-12-03',3000,null,20);
insert into emp values (7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

-- select * from emp;
-- commit;

CREATE UNIQUE INDEX PK_EMP ON EMP (EMPNO) ; -- Index(empno) ����
ALTER TABLE EMP ADD  CONSTRAINT PK_EMP PRIMARY KEY (EMPNO); -- primary Key(empno) ���� �߰�

drop table dept purge ;
CREATE TABLE DEPT (
  DEPTNO   NUMBER(2,0), 
  DNAME    VARCHAR2(14), 
  LOC      VARCHAR2(13));

insert into dept values (10,'ACCOUNTING','NEW YORK');
insert into dept values (20,'RESEARCH','DALLAS');
insert into dept values (30,'SALES','CHICAGO');
insert into dept values (40,'OPERATIONS','BOSTON');

CREATE UNIQUE INDEX PK_DEPT ON DEPT (DEPTNO); -- Index(deptno) ����
ALTER TABLE DEPT ADD  CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO);-- primary Key(deptno) ���� �߰�

ALTER TABLE EMP ADD CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO);
-- emp table�� deptno�� dept table�� deptno�� Foreign Key�� �ϴ� ���� �߰�


drop table professor ;

create table professor
(profno number(4) primary key,
 name  varchar2(10) not null, 
 id  varchar2(15) not null,
 position varchar2 (15) not null,
 pay number (3) not null,
 hiredate  date not null,
 bonus number(4) ,
 deptno  number(3),
 email  varchar2(50),
 hpage  varchar2(50)); -- tablespace users; --USERS Tablespace�� professor table�� ����(�ݹ� �׽�Ʈ ȯ�濡�� �ּ�ó����)

insert into professor
values(1001,'������','captain','������',550,to_date('1980-06-23','YYYY-MM-DD'),100,101,'captain@abc.net','http://www.abc.net');

insert into professor
values(1002,'�ڽ°�','sweety','������',380,to_date('1987-01-30','YYYY-MM-DD'),60,101,'sweety@abc.net','http://www.abc.net');

insert into professor
values (1003,'�۵���','powerman','���Ӱ���',270,to_date('1998-03-22','YYYY-MM-DD'),null,101,'pman@power.com','http://www.power.com');

insert into professor
values (2001,'�缱��','lamb1','���Ӱ���',250,to_date('2001-09-01','YYYY-MM-DD'),null,102,'lamb1@hamail.net',null);

insert into professor
values (2002,'�迵��','number1','������',350,to_date('1985-11-30','YYYY-MM-DD'),80,102,'number1@naver.com','http://num1.naver.com');

insert into professor
values (2003,'�ֽ���','bluedragon','������',490,to_date('1982-04-29','YYYY-MM-DD'),90,102,'bdragon@naver.com',null);

insert into professor
values (3001,'�赵��','angel1004','������',530,to_date('1981-10-23','YYYY-MM-DD'),110,103,'angel1004@hanmir.com',null);

insert into professor
values (3002,'���ѿ�','naone10','������',330,to_date('1997-07-01','YYYY-MM-DD'),50,103,'naone10@empal.com',null);

insert into professor
values (3003,'������','only-u','���Ӱ���',290,to_date('2002-02-24','YYYY-MM-DD'),null,103,'only_u@abc.com',null);

insert into professor
values (4001,'�ɽ�','simson','������',570,to_date('1981-10-23','YYYY-MM-DD'),130,201,'chebin@daum.net',null);

insert into professor
values (4002,'�ֽ���','gogogo','������',330,to_date('2009-08-30','YYYY-MM-DD'),null,201,'gogogo@def.com',null);

insert into professor
values (4003,'�ڿ���','mypride','������',310,to_date('1999-12-01','YYYY-MM-DD'),50,202,'mypride@hanmail.net',null);

insert into professor
values (4004,'����ö','ironman','���Ӱ���',260,to_date('2009-01-28','YYYY-MM-DD'),null,202,'ironman@naver.com',null);

insert into professor
values (4005,'�ٺ�','standkang','������',500,to_date('1985-09-18','YYYY-MM-DD'),80,203,'standkang@naver.com',null);

insert into professor 
values (4006,'����','napeople','���Ӱ���',220,to_date('2010-06-28','YYYY-MM-DD'),null,301,'napeople@jass.com',null);

insert into professor
values (4007,'����','silver-her','������',290,to_date('2001-05-23','YYYY-MM-DD'),30,301,'silver-her@daum.net',null);

commit; -- ���ݱ��� �۾� ������ Memory -> DB�� �����Ͽ� ������

drop table department purge;
create table department
( deptno number(3) primary key ,
  dname varchar2(25) not null,
  part number(3),
  build  varchar2(14)); -- tablespace users;

insert into department 
values (101,'��ǻ�Ͱ��а�',100,'������');

insert into department
values (102,'��Ƽ�̵����а�',100,'��Ƽ�̵���');

insert into department
values (103,'����Ʈ������а�',100,'����Ʈ�����');

insert into department
values (201,'���ڰ��а�',200,'���������');

insert into department
values (202,'�����а�',200,'�������');

insert into department
values (203,'ȭ�а��а�',200,'ȭ�нǽ���');

insert into department
values (301,'���������а�',300,'�ι���');

insert into department
values (100,'��ǻ�������к�',10,null);

insert into department
values (200,'��īƮ�δн��к�',10,null);

insert into department
values (300,'�ι���ȸ�к�',20,null);

insert into department
values (10,'��������',null,null);

insert into department
values (20,'�ι�����',null,null);

commit;
 

drop table student purge;

create table student
( studno number(4) primary key,
  name   varchar2(10) not null,
  id varchar2(20) not null unique,
  grade number check(grade between 1 and 6),
  jumin char(13) not null,
  birthday  date,
  tel varchar2(15),
  height  number(4),
  weight  number(3),
  deptno1 number(3),
  deptno2 number(3),
  profno  number(4)); -- tablespace users;

insert into student values (
9411,'������','75true',4,'7510231901813',to_date('1975-10-23','YYYY-MM-DD'),'055)381-2158',180,72,101,201,1001);

insert into student values (
9412,'�����','pooh94',4,'7502241128467',to_date('1975-02-24','YYYY-MM-DD'),'051)426-1700',172,64,102,null,2001);

insert into student values (
9413,'�̹̰�','angel000',4,'7506152123648',to_date('1975-06-15','YYYY-MM-DD'),'053)266-8947',168,52,103,203,3002);

insert into student values (
9414,'�����','gunmandu',4,'7512251063421',to_date('1975-12-25','YYYY-MM-DD'),'02)6255-9875',177,83,201,null,4001);

insert into student values (
9415,'�ڵ�ȣ','pincle1',4,'7503031639826',to_date('1975-03-03','YYYY-MM-DD'),'031)740-6388',182,70,202,null,4003);

insert into student values (
9511,'��ſ�','bingo',3,'7601232186327',to_date('1976-01-23','YYYY-MM-DD'),'055)333-6328',164,48,101,null,1002);

insert into student values (
9512,'������','jjang1',3,'7604122298371',to_date('1976-04-12','YYYY-MM-DD'),'051)418-9627',161,42,102,201,2002);

insert into student values (
9513,'������','nara5',3,'7609112118379',to_date('1976-09-11','YYYY-MM-DD'),'051)724-9618',177,55,202,null,4003);

insert into student values (
9514,'������','guyume',3,'7601202378641',to_date('1976-01-20','YYYY-MM-DD'),'055)296-3784',160,58,301,101,4007);

insert into student values (
9515,'�Ӽ���','shyun1',3,'7610122196482',to_date('1976-10-12','YYYY-MM-DD'),'02)312-9838',171,54,201,null,4001);

insert into student values (
9611,'������','onejimae',2,'7711291186223',to_date('1977-11-29','YYYY-MM-DD'),'02)6788-4861',182,72,101,null,1002);

insert into student values (
9612,'������','samjang7',2,'7704021358674',to_date('1977-04-02','YYYY-MM-DD'),'055)488-2998',171,70,102,null,2001);

insert into student values (
9613,'�ȱ���','nonnon1',2,'7709131276431',to_date('1977-09-13','YYYY-MM-DD'),'053)736-4981',175,82,201,null,4002);

insert into student values (
9614,'�蹮ȣ','munho',2,'7702261196365',to_date('1977-02-26','YYYY-MM-DD'),'02)6175-3945',166,51,201,null,4003);

insert into student values (
9615,'����ȣ','star123',2,'7712141254963',to_date('1977-12-14','YYYY-MM-DD'),'051)785-6984',184,62,301,null,4007);

insert into student values (
9711,'������','prettygirl',1,'7808192157498',to_date('1978-08-19','YYYY-MM-DD'),'055)278-3649',162,48,101,null,null);

insert into student values (
9712,'������','silverwt',1,'7801051776346',to_date('1978-01-05','YYYY-MM-DD'),'02)381-5440',175,63,201,null,null);

insert into student values (
9713,'�ο���','youngmin',1,'7808091786954',to_date('1978-08-09','YYYY-MM-DD'),'031)345-5677',173,69,201,null,null);

insert into student values (
9714,'������','kimjh',1,'7803241981987',to_date('1978-03-24','YYYY-MM-DD'),'055)423-9870',179,81,102,null,null);

insert into student values (
9715,'���','wooya2702',1,'7802232116784',to_date('1978-02-23','YYYY-MM-DD'),'02)6122-2345',163,51,103,null,null);

commit;

drop table emp2 cascade constraint ;

CREATE TABLE EMP2 (
 EMPNO       NUMBER  PRIMARY KEY,
 NAME        VARCHAR2(10) NOT NULL,
 BIRTHDAY    DATE,
 DEPTNO      VARCHAR2(06) NOT NULL,
 EMP_TYPE    VARCHAR2(08),
 TEL         VARCHAR2(15),
 HOBBY       VARCHAR2(30),
 PAY         NUMBER,
 POSITION    VARCHAR2(08),
 PEMPNO      NUMBER
);

INSERT INTO EMP2 VALUES (19900101,'������',TO_DATE('19640125','YYYYMMDD'),'0001','������','054)223-0001','���ǰ���',100000000,'��ǥ�̻�',null);
INSERT INTO EMP2 VALUES (19960101,'������',TO_DATE('19730322','YYYYMMDD'),'1000','������','02)6255-8000','����',72000000,'����',19900101);
INSERT INTO EMP2 VALUES (19970201,'���ϵ�',TO_DATE('19750415','YYYYMMDD'),'1000','������','02)6255-8005','�',50000000,'����',19960101);
INSERT INTO EMP2 VALUES (19930331,'�����',TO_DATE('19760525','YYYYMMDD'),'1001','������','02)6255-8010','������Ÿ��',60000000,'����',19960101);
INSERT INTO EMP2 VALUES (19950303,'õ����',TO_DATE('19730615','YYYYMMDD'),'1002','������','02)6255-8020','������',56000000,'����',19960101);
INSERT INTO EMP2 VALUES (19966102,'������',TO_DATE('19720705','YYYYMMDD'),'1003','������','052)223-4000','���ǰ���',75000000,'����',19900101);
INSERT INTO EMP2 VALUES (19930402,'������',TO_DATE('19720815','YYYYMMDD'),'1004','������','042)998-7005','���',51000000,'����',19966102);
INSERT INTO EMP2 VALUES (19960303,'�蹮ȣ',TO_DATE('19710925','YYYYMMDD'),'1005','������','031)564-3340','���',35000000,'�븮',19966102);
INSERT INTO EMP2 VALUES (19970112,'����ȣ',TO_DATE('19761105','YYYYMMDD'),'1006','������','054)223-4500','����',68000000,'����',19900101);
INSERT INTO EMP2 VALUES (19960212,'������',TO_DATE('19721215','YYYYMMDD'),'1007','������','054)223-4600',null,49000000,'����',19970112);
INSERT INTO EMP2 VALUES (20000101,'���¹�',TO_DATE('19850125','YYYYMMDD'),'1008','�����','051)123-4567','���', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000102,'�輳��',TO_DATE('19830322','YYYYMMDD'),'1009','�����','031)234-5678','����', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000203,'�ֿ���',TO_DATE('19820415','YYYYMMDD'),'1010','�����','02)2345-6789','�ٵ�', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000334,'������',TO_DATE('19810525','YYYYMMDD'),'1011','�����','053)456-7890','�뷡', 30000000,'',19960212);
INSERT INTO EMP2 VALUES (20000305,'���Ͼ�',TO_DATE('19800615','YYYYMMDD'),'1008','������','051)567-8901','����', 22000000,'',19960212);
INSERT INTO EMP2 VALUES (20006106,'������',TO_DATE('19800705','YYYYMMDD'),'1009','������','031)678-9012','��',   22000000,'',19960212);
INSERT INTO EMP2 VALUES (20000407,'���ֿ�',TO_DATE('19800815','YYYYMMDD'),'1010','������','02)2789-0123','����', 22000000,'',19960212);
INSERT INTO EMP2 VALUES (20000308,'������',TO_DATE('19800925','YYYYMMDD'),'1011','������','053)890-1234','����', 20000000,'',19960212);
INSERT INTO EMP2 VALUES (20000119,'��ݰ�',TO_DATE('19801105','YYYYMMDD'),'1004','������','042)901-2345','��',   20000000,'',19930402);
INSERT INTO EMP2 VALUES (20000210,'���Ѷ�',TO_DATE('19801215','YYYYMMDD'),'1005','������','031)345-3456','����', 20000000,'',19960303);
COMMIT;

drop table dept2 cascade constraint;

CREATE TABLE DEPT2 (
 DCODE   VARCHAR2(06)  PRIMARY KEY,
 DNAME   VARCHAR2(20) NOT NULL,
 PDEPT VARCHAR2(06) ,
 AREA        VARCHAR2(16)
);

INSERT INTO DEPT2 VALUES ('0001','�����','','���׺���');
INSERT INTO DEPT2 VALUES ('1000','�濵������','0001','��������');
INSERT INTO DEPT2 VALUES ('1001','�繫������','1000','��������');
INSERT INTO DEPT2 VALUES ('1002','�ѹ���','1000','��������');
INSERT INTO DEPT2 VALUES ('1003','�����','0001','���׺���');
INSERT INTO DEPT2 VALUES ('1004','H/W����','1003','��������');
INSERT INTO DEPT2 VALUES ('1005','S/W����','1003','�������');
INSERT INTO DEPT2 VALUES ('1006','������','0001','���׺���');
INSERT INTO DEPT2 VALUES ('1007','������ȹ��','1006','���׺���');
INSERT INTO DEPT2 VALUES ('1008','����1��','1007','�λ�����');
INSERT INTO DEPT2 VALUES ('1009','����2��','1007','�������');
INSERT INTO DEPT2 VALUES ('1010','����3��','1007','��������');
INSERT INTO DEPT2 VALUES ('1011','����4��','1007','�������');

commit;

DROP TABLE cal purge ;

CREATE TABLE cal
   (week  varchar2(1),
    day   varchar2(5),
    num_day varchar2(2)) ;

insert into cal values ('1','��','1');
insert into cal values ('1','��','2');
insert into cal values ('1','ȭ','3');
insert into cal values ('1','��','4');
insert into cal values ('1','��','5');
insert into cal values ('1','��','6');
insert into cal values ('1','��','7');
insert into cal values ('2','��','8');
insert into cal values ('2','��','9');
insert into cal values ('2','ȭ','10');
insert into cal values ('2','��','11');
insert into cal values ('2','��','12');
insert into cal values ('2','��','13');
insert into cal values ('2','��','14');
insert into cal values ('3','��','15');
insert into cal values ('3','��','16');
insert into cal values ('3','ȭ','17');
insert into cal values ('3','��','18');
insert into cal values ('3','��','19');
insert into cal values ('3','��','20');
insert into cal values ('3','��','21');
insert into cal values ('4','��','22');
insert into cal values ('4','��','23');
insert into cal values ('4','ȭ','24');
insert into cal values ('4','��','25');
insert into cal values ('4','��','26');
insert into cal values ('4','��','27');
insert into cal values ('4','��','28');
insert into cal values ('5','��','29');
insert into cal values ('5','��','30');
insert into cal values ('5','ȭ','31');
commit ;

DROP TABLE gift purge ;

create table gift
( gno  number ,
  gname varchar2(20) ,
  g_start  number ,
  g_end  number );

insert into gift values(1,'��ġ��Ʈ',1,100000);
insert into gift values(2,'��Ǫ��Ʈ',100001,200000);
insert into gift values(3,'������ǰ��Ʈ',200001,300000);
insert into gift values(4,'�ֹ��ǰ��Ʈ',300001,400000);
insert into gift values(5,'��ǿ�������',400001,500000);
insert into gift values(6,'LCD�����',500001,600000);
insert into gift values(7,'��Ʈ��',600001,700000);
insert into gift values(8,'������TV',700001,800000);
insert into gift values(9,'�巳��Ź��',800001,900000);
insert into gift values(10,'���ʹ������',900001,1000000);
commit ;

DROP TABLE gogak purge;

create table gogak
(gno  number(8) ,
 gname varchar2(12) ,
 jumin char(13) ,
 point number) ;

insert into gogak values (20010001,'������','7510231369824',980000);
insert into gogak values (20010002,'�����','7502241128467',73000);
insert into gogak values (20010003,'�̹̰�','7506152123648',320000);
insert into gogak values (20010004,'�����','7512251063421',65000);
insert into gogak values (20010005,'�ڵ�ȣ','7503031639826',180000);
insert into gogak values (20010006,'��ſ�','7601232186327',153000);
insert into gogak values (20010007,'������','7604212298371',273000);
insert into gogak values (20010008,'������','7609112118379',315000);
insert into gogak values (20010009,'�輳��','7601202378641',542000);
insert into gogak values (20010010,'�Ӽ���','7610122196482',265000);
insert into gogak values (20010011,'�ּ���','7711291186223',110000);
insert into gogak values (20010012,'������','7704021358674',99000);
insert into gogak values (20010013,'�ȱ���','7709131276431',470000);
insert into gogak values (20010014,'��ȯ','7702261196365',298000);
insert into gogak values (20010015,'����ȣ','7712141254963',420000);
insert into gogak values (20010016,'������','7808192157498',598000);
insert into gogak values (20010017,'������','7801051776346',625000);
insert into gogak values (20010018,'�ο���','7808091786954',670000);
insert into gogak values (20010019,'������','7803242114563',770000);
insert into gogak values (20010020,'���','7802232116784',730000);
commit ;

DROP TABLE hakjum purge ;

create table hakjum
(grade char(3) ,
 min_point  number ,
 max_point  number );

insert into hakjum values ('A+',96,100);
insert into hakjum values ('A0',90,95);
insert into hakjum values ('B+',86,89);
insert into hakjum values ('B0',80,85);
insert into hakjum values ('C+',76,79);
insert into hakjum values ('C0',70,75);
insert into hakjum values ('D',0,69);

commit;


drop table exam_01 purge ;

create table exam_01
(studno  number ,
 total number);

insert into exam_01 values (9411,97);
insert into exam_01 values (9412,78);
insert into exam_01 values (9413,83);
insert into exam_01 values (9414,62);
insert into exam_01 values (9415,88);
insert into exam_01 values (9511,92);
insert into exam_01 values (9512,87);
insert into exam_01 values (9513,81);
insert into exam_01 values (9514,79);
insert into exam_01 values (9515,95);
insert into exam_01 values (9611,89);
insert into exam_01 values (9612,77);
insert into exam_01 values (9613,86);
insert into exam_01 values (9614,82);
insert into exam_01 values (9615,87);
insert into exam_01 values (9711,91);
insert into exam_01 values (9712,88);
insert into exam_01 values (9713,82);
insert into exam_01 values (9714,83);
insert into exam_01 values (9715,84);

commit ;

drop table p_grade purge ;

create table p_grade
( position  varchar2(10) ,
  s_age number ,
  e_age number ,
  s_year number ,
  e_year number ,
  s_pay  number ,
  e_pay  number );

insert into p_grade values ('����',0,24,1,2,12000000,29990000);
insert into p_grade values ('�븮',25,28,3,5,30000000,45000000);
insert into p_grade values ('����',29,32,6,8,45010000,51000000);
insert into p_grade values ('����',33,36,9,10,51010000,60000000);
insert into p_grade values ('����',37,40,11,13,60010000,75000000);
insert into p_grade values ('�̻�',41,55,14,99,75010000,100000000);

commit ;


drop table reg_test purge ;

CREATE TABLE reg_test
( text varchar2(10)) ;

INSERT ALL
INTO reg_test VALUES('ABC123')
INTO reg_test VALUES('ABC 123')
INTO reg_test VALUES('abc 123')
INTO reg_test VALUES('a1b2c3')
INTO reg_test VALUES('aabbcc123')
INTO reg_test VALUES('?/!@#$*&')
INTO reg_test VALUES('\~*().,')
INTO reg_test VALUES(123123)
INTO reg_test VALUES('123abc')
SELECT  *  FROM dual ;

commit;


-- insert all �ǽ��� ���̺�

drop table p_01 purge;
drop table p_02 purge;

CREATE TABLE p_01
(no  number ,
 name varchar2(10) );

CREATE TABLE p_02
(no number ,
 name varchar2(10) );



-- merge �ǽ��� ���̺�

drop table pt_01 purge;
drop table pt_02 purge;
drop table p_total purge;

create table pt_01
(�ǸŹ�ȣ varchar2(8) , ��ǰ��ȣ char(4) , ���� number , �ݾ� number) ;

create table pt_02
(�ǸŹ�ȣ varchar2(8) , ��ǰ��ȣ char(4) , ���� number , �ݾ� number) ;

create table p_total
(�ǸŹ�ȣ  varchar2(8) , ��ǰ��ȣ char(4) , ���� number , �ݾ� number) ;

INSERT ALL
 INTO pt_01 VALUES ('12010101','1000',1,500)
 INTO pt_01 VALUES ('12010102','1001',1,400)
 INTO pt_01 VALUES ('12010103','1003',1,300)
 INTO pt_02 VALUES ('12010201','1004',1,600)
 INTO pt_02 VALUES ('12010202','1000',1,500)
 INTO pt_02 VALUES ('12010203','1005',1,700)
 SELECT * FROM dual ;

commit;

-- DML ���� �α� ��� �ǽ��� ���̺�

DROP Table dml_err_test purge;

CREATE TABLE dml_err_test
( no number primary key,
  name varchar2(10));

INSERT ALL
INTO dml_err_test VALUES (1,'AAA')
INTO dml_err_test VALUES (2,'BBB')
SELECT  * FROM dual ;

commit ;

create or replace procedure print_table( p_query in varchar2 )
AUTHID CURRENT_USER
is
    l_theCursor     integer default dbms_sql.open_cursor;
    l_columnValue   varchar2(4000);
    l_status        integer;
    l_descTbl       dbms_sql.desc_tab;
    l_colCnt        number;
begin
    execute immediate
    'alter session set
        nls_date_format=''yyyy-mm-dd:hh24:mi:ss'' ';
    dbms_sql.parse(  l_theCursor,  p_query, dbms_sql.native );
    dbms_sql.describe_columns
    ( l_theCursor, l_colCnt, l_descTbl );
    for i in 1 .. l_colCnt loop
        dbms_sql.define_column
        (l_theCursor, i, l_columnValue, 4000);
    end loop;
    l_status := dbms_sql.execute(l_theCursor);
    while ( dbms_sql.fetch_rows(l_theCursor) > 0 ) loop
        for i in 1 .. l_colCnt loop
            dbms_sql.column_value
            ( l_theCursor, i, l_columnValue );
            dbms_output.put_line
            ( rpad( l_descTbl(i).col_name, 30 )
              || ': ' ||
              l_columnValue );
        end loop;
        dbms_output.put_line( '-----------------' );
    end loop;
    execute immediate
        'alter session set nls_date_format=''yyyy-mm-dd'' ';
exception
    when others then
      execute immediate
          'alter session set nls_date_format=''yyyy-mm-dd'' ';
      raise;
end;
 /


-- �������� �׽�Ʈ�� ���̺�

drop table test_novalidate purge ;

CREATE TABLE test_novalidate
( no number primary key ,
  name varchar2(10) not null );

INSERT INTO test_novalidate VALUES(1,'AAA');
INSERT INTO test_novalidate VALUES(2,'BBB');
INSERT INTO test_novalidate VALUES(3,'CCC');
COMMIt ;

drop table test_validate purge ;

CREATE TABLE test_validate
 ( no number
    CONSTRAINT tv_no_pk PRIMARY KEY ,
   name  varchar2(10)
    CONSTRAINT tv_name_nn NOT NULL) ;

INSERT INTO test_validate VALUES (1,'AAA');
INSERT INTO test_validate VALUES (2,'BBB');
INSERT INTO test_validate VALUES (3,'CCC');
COMMIT ;

drop table test_enable purge;

CREATE TABLE test_enable
 ( no number
    CONSTRAINT te_no_pk PRIMARY KEY ,
   name varchar2(10)
    CONSTRAINT te_name_nn NOT NULL) ;



-- �����Լ� ������ ���� ���̺�

drop table product purge ;

CREATE TABLE product
( p_code  number(3) primary key,
  p_name varchar2(20) not null ,
  p_price  number) ;


insert into product values (100,'����¯',800);
insert into product values (101,'����¯',900);
insert into product values (102,'��ū��',1000);
insert into product values (103,'���̼�',900);
insert into product values (104,'��¯��',800);
insert into product values(105,'������',1500);
commit;

drop table panmae purge ;

create table panmae
( p_date varchar2(8) not null,
  p_code number not null,
  p_qty  number ,
  p_total number ,
  p_store varchar2(5) );


insert into panmae values ('20110101',100,3,2400,'1000');
insert into panmae values ('20110101',101,5,4500,'1001');
insert into panmae values ('20110101',102,2,2000,'1003');
insert into panmae values ('20110101',103,6,5400,'1004');
insert into panmae values ('20110102',102,2,2000,'1000');
insert into panmae values ('20110102',103,5,4500,'1002');
insert into panmae values ('20110102',104,3,2400,'1002');
insert into panmae values ('20110102',105,2,3000,'1000');
insert into panmae values ('20110103',100,10,8000,'1004');
insert into panmae values ('20110103',100,2,1600,'1000');
insert into panmae values ('20110103',100,3,2400,'1001');
insert into panmae values ('20110103',101,4,3600,'1003');
insert into panmae values ('20110104',100,2,1600,'1002');
insert into panmae values ('20110104',100,4,3200,'1003');
insert into panmae values ('20110104',100,5,4000,'1004');
insert into panmae values ('20110104',101,3,2700,'1001');
insert into panmae values ('20110104',101,4,3600,'1002');
insert into panmae values ('20110104',101,3,2700,'1003');
insert into panmae values ('20110104',102,4,4000,'1001');
insert into panmae values ('20110104',102,2,2000,'1002');
insert into panmae values ('20110104',103,2,1800,'1003');


commit;

drop table member purge ;
create table member
(no number(4) not null ,
 name varchar2(10) not null ,
 jumin char(13) primary key ,
 passwd varchar2(10) not null ,
 id  varchar2(15) not null unique ,
 an_key varchar2(15) ,
 an_key_dap  varchar2(20) );


insert into member
 values (1001,'������','7510231234567','a1234','simson','�Ƴ��̸�?','���ʵ�') ;

insert into member
 values(1002,'���ʵ�','7509222345678','b1234','bobby','�����̸�?','������') ;

insert into member
 values (1003,'������','1410234567890','c1234','daddy','�ƺ��̸�?','������');

insert into member
 values (1004,'�������','1609223456789','d1234','mommy','�����̸�?','���ʵ�') ;



commit;

SELECT * FROM TAB;

DESC emp;

DESC dept;

SELECT * FROM emp;

SELECT empno, ename
FROM emp;

SELECT * FROM professor;

SELECT name, '������~����Ŀ�~' 
FROM professor;

SELECT studno "�й�", name AS "�̸�", profno ����������ȣ
FROM student;

SELECT empno �����ȣ, ename �����, job ����
FROM emp;

SELECT deptno �μ�#, dname �μ���, loc ��ġ
FROM dept;

SELECT name || '����' || position || '�Դϴ�'
FROM professor;

SELECT * FROM student;

SELECT name || '�� Ű��' || height || 'cm, �����Դ�' || weight || 'kg �Դϴ�'
FROM student;

SELECT * FROM professor;

SELECT name || '(' || position || '), ' || name || '''' || position || ''''
FROM professor;

SELECT ename, sal, sal+100
FROM emp;

SELECT sal, sal+100/2, (sal+100)/2
FROM emp;

SELECT ename, sal, deptno
FROM emp
WHERE deptno = 10;

SELECT ename, sal
FROM emp
WHERE sal > 4000;

SELECT ename, empno, sal
FROM emp
WHERE ename = 'SCOTT';

SELECT * FROM professor;

SELECT name, pay, hiredate
FROM professor
WHERE hiredate = '2001-05-23';

SELECT name, height
FROM student
WHERE height >= 180;

SELECT name, weight
FROM student
WHERE weight BETWEEN 60 AND 80;

SELECT name, weight
FROM student
WHERE weight >= 60
AND weight <= 80;

SELECT name, deptno1
FROM student
WHERE deptno1 IN (101, 201);

SELECT name
FROM student
WHERE name LIKE '��%';

SELECT name, bonus
FROM professor;

SELECT name, bonus
FROM professor
WHERE bonus IS NULL;

SELECT name bonus
FROM professor
WHERE bonus IS NOT NULL;

SELECT name, grade, height
FROM student
WHERE grade = 4
AND height > 170;

SELECT name, grade, height, weight
FROM student
WHERE grade = 1
OR weight > 80;

SELECT name, grade, height, weight
FROM student
WHERE grade = 2
AND height > 180
AND weight > 70;

SELECT name, grade, height, weight
FROM student
WHERE grade = 2
AND (height > 180 OR weight > 70);

SELECT name
FROM professor
WHERE name >= '��'
AND name < '��'
ORDER BY 1;

SELECT name, height
FROM student
WHERE grade = 1;

SELECT name, height
FROM student
WHERE grade = 1
ORDER BY height;

SELECT name, height, weight
FROM student
WHERE grade = 1
ORDER BY height ASC, weight DESC;

SELECT name, birthday, height, weight
FROM student
WHERE grade = 1
ORDER BY 2;

SELECT name "�̸�", height "Ű"
FROM student
WHERE grade = 1
ORDER BY �̸�;

SELECT * FROM professor;

SELECT INITCAP(ID)
FROM student
WHERE deptno1 = 201;

SELECT INITCAP('Pretty girl')
FROM DUAL;

SELECT name �̸�, id, LOWER(id) �ҹ���, UPPER(id) �빮��
FROM student
WHERE deptno1 = 201;

SELECT name �̸�, id, LENGTH(id) ���ڼ�
FROM student
WHERE LENGTH(id) > 9;

SELECT name �̸�, LENGTH(name), LENGTHB(name)
FROM student
WHERE deptno1 = 201;

SELECT CONCAT(name, position)
FROM professor
WHERE deptno = 101;

SELECT SUBSTR('ABCDE', 2, 3)
FROM dual;

SELECT SUBSTR('ABCDE', -2, 3)
FROM dual;

SELECT name, SUBSTR(jumin, 1, 6) "�������"
FROM student
WHERE deptno1 = 101;

SELECT name, SUBSTR(jumin, 1, 6) "�������"
FROM student
WHERE SUBSTR(jumin, 3, 2) = '08';

SELECT SUBSTR(name, 1, 2)
FROM student
WHERE deptno1 = 101;

SELECT SUBSTRB(name, 1, 2)
FROM student
WHERE deptno1 = 101;

SELECT INSTR('A*B*C*', '*', 1, 2)
FROM dual;

SELECT name, tel, SUBSTR( tel, 1,INSTR(TEL, ')', 1, 1) - 1 ) AS ������ȣ
FROM student
WHERE deptno1 = 101;

SELECT id, LPAD(id, 10, '$') "LPAD"
FROM student
WHERE deptno1 = 101;

SELECT LPAD(dname, 10, '1234') "LPAD ����"
FROM dept2;

SELECT RPAD(dname, 10, SUBSTR('1234567890 ', LENGTHB(dname)+1, 10)) "LPAD ����"
FROM dept2;

SELECT LTRIM(dname, '��')
FROM dept2;

SELECT REPLACE(name, substr(name, 1, 1), '#')
FROM student
WHERE deptno1 = 101;

SELECT REPLACE(name, substr(name, 2, 1), '#')
FROM student
WHERE deptno1 = 101;

SELECT REPLACE(jumin, substr(jumin, 7, 7), '*******')
FROM student
WHERE deptno1 = 101;

SELECT name, tel, REPLACE(tel, substr(tel, INSTR(TEL, ')', 1, 1)+1, 3), '###') AS REPLACE
FROM student
WHERE deptno1 = 102;

SELECT TRUNC(12.345) TRUNC1, TRUNC(12.345, 2) TRUNC2, TRUNC(12.345, -1) TRUNC3
FROM dual;

SELECT MOD(12, 10) "Mod", CEIL(12.345) "Ceil", FLOOR(12.345) "Flor"
FROM dual;

SELECT POWER(3, 2)
FROM dual;

SELECT SYSDATE
FROM dual;

SELECT MONTHS_BETWEEN('2012-03-01', '2012-01-01')
FROM dual;

SELECT name, SYSDATE, hiredate,
        ROUND(MONTHS_BETWEEN(SYSDATE, hiredate), 2) Date_1,
        ROUND(((SYSDATE - hiredate) / 31), 2) Date_2
FROM professor
WHERE deptno = 101;

SELECT SYSDATE, ADD_MONTHS(SYSDATE, 3)
FROM dual;

SELECT SYSDATE, NEXT_DAY(SYSDATE, '������')
FROM dual;

SELECT SYSDATE, ROUND(SYSDATE), TRUNC(SYSDATE)
FROM dual;

SELECT 1 + '1' FROM dual;

SELECT TO_CHAR(SYSDATE, 'YYYY') "YYYY",
        TO_CHAR(SYSDATE, 'RRRR') "RRRR",
        TO_CHAR(SYSDATE, 'YY') "YY",
        TO_CHAR(SYSDATE, 'YEAR') "YEAR"
FROM dual;

SELECT TO_CHAR(SYSDATE, 'MM') "MM",
        TO_CHAR(SYSDATE, 'MON') "MON",
        TO_CHAR(SYSDATE, 'MONTH') "MONTH"
FROM dual;

SELECT name, TO_CHAR((pay * 12) + bonus, '99,999') "����"
FROM professor
WHERE deptno = 101;

SELECT TO_NUMBER('1')
FROM dual;

SELECT name, TO_DATE(hiredate, 'YYYY-MM-DD') "�Ի���", TO_CHAR((pay * 12), '99,999') "����", To_CHAR((pay*12)*1.1, '99,999') "�λ���"
FROM professor
WHERE TO_CHAR(hiredate, 'YYYY') < 1990;

SELECT name, pay, bonus, (pay * 12 + NVL(bonus, 0 )) "����"
FROM professor
WHERE deptno = 101;

SELECT name, deptno, DECODE(deptno, 101, '��ǻ�Ͱ��а�') "�а���"
FROM professor;

SELECT name, deptno, DECODE(deptno, 101, '��ǻ�Ͱ��а�', '��Ÿ�а�') "�а���"
FROM professor;

SELECT name, deptno, DECODE(deptno, 101, '��ǻ�Ͱ��а�',
                                    102, '��Ƽ�̵����а�',
                                    103, '����Ʈ������а�',
                                         '��Ÿ�а�') "�а���"
FROM professor;

SELECT name, jumin, DECODE(substr(jumin, 7, 1), 1, '����', '����')
FROM student
WHERE deptno1 = 101;

SELECT name, tel, CASE(substr(tel, 1, INSTR(tel, ')') -1)) WHEN '02' THEN '����'
                                                           WHEN '031' THEN '���'
                                                           WHEN '031' THEN '�λ�'
                                                           WHEN '031' THEN '���'
                                                           WHEN '031' THEN '�泲'
                                                           ELSE '��Ÿ'
                                                           END "������"
FROM student;       

SELECT deptno, position, AVG(NVL(pay, 0)) "��ձ޿�"
FROM professor
GROUP BY deptno, position;

SELECT deptno, position, AVG(NVL(pay, 0)) "��ձ޿�"
FROM professor
GROUP BY deptno, position
ORDER BY deptno;

SELECT deptno, AVG(NVL(pay, 0))
FROM professor
GROUP BY deptno
HAVING AVG(pay) > 450;

SELECT deptno, position, COUNT(*), SUM(pay)
FROM professor
GROUP BY ROLLUP(deptno, position);

SELECT *
FROM (SELECT week "��", day, num_day
      FROM cal)
PIVOT (MAX(num_day)
       FOR day IN('��' as "��",
                  '��' as "��",
                  'ȭ' as "ȭ",
                  '��' as "��",
                  '��' as "��",
                  '��' as "��",
                  '��' as "��")
      )
ORDER BY "��";

SELECT MAX(DECODE(day, '��', num_day)) AS SUN,
       MAX(DECODE(day, '��', num_day)) AS MON,
       MAX(DECODE(day, 'ȭ', num_day)) AS TUE,
       MAX(DECODE(day, '��', num_day)) AS WED,
       MAX(DECODE(day, '��', num_day)) AS THU,
       MAX(DECODE(day, '��', num_day)) AS FRI,
       MAX(DECODE(day, '��', num_day)) AS SAT
FROM cal
GROUP BY week
ORDER BY week;

SELECT *
FROM (SELECT deptno, job, empno, sal
      FROM emp)
PIVOT
( COUNT(empno)
  FOR job IN('CLERK' as "CLERK",
             'MANAGER' as "MANAGER",
             'PRESIDENT' as "PRESIDENT",
             'ANALYST' as "ANALYST",
             'SALESMAN' as "SALESMAN")
)
ORDER BY deptno;

SELECT *
FROM (SELECT deptno, job, empno, sal
      FROM emp)
PIVOT ( COUNT(empno) AS CNT,
        SUM(NVL(sal,0)) AS S_SAL FOR job IN('CLERK' as "C",
                                            'MANAGER' as "M",
                                            'PRESIDENT' as "P",
                                            'ANALYST' as "A",
                                            'SALESMAN' as "S")
      )
ORDER BY deptno;

CREATE TABLE t_unpivot AS
(SELECT * FROM (SELECT deptno, job, empno
                FROM emp)
PIVOT
(  COUNT (empno)
    FOR job IN('CLERK' as "CLERK",
             'MANAGER' as "MANAGER",
             'PRESIDENT' as "PRESIDENT",
             'ANALYST' as "ANALYST",
             'SALESMAN' as "SALESMAN")
)
);

SELECT * FROM t_unpivot;

SELECT * 
FROM t_unpivot
UNPIVOT(
empno FOR job IN(CLERK, MANAGER, PRESIDENT, ANALYST, SALESMAN)
);

SELECT MAX(pay + NVL(bonus, 0)) "MAX", MIN(pay + NVL(bonus, 0)) "MIN", AVG(pay + NVL(bonus, 0)) "AVG"
FROM professor;

SELECT * FROM student;

SELECT COUNT(*)"�հ�",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'01',0)) "1��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'02',0)) "2��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'03',0)) "3��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'04',0)) "4��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'05',0)) "5��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'06',0)) "6��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'07',0)) "7��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'08',0)) "8��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'09',0)) "9��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'10',0)) "10��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'11',0)) "11��",
       COUNT(DECODE(TO_CHAR(birthday, 'MM'),'12',0)) "12��"
FROM student;

SELECT substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) from student;

SELECT  COUNT(*)"�հ�",
        COUNT(DECODE( substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) ,'02',0)) "����",
        COUNT(DECODE( substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) ,'031',0)) "���",
        COUNT(DECODE( substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) ,'051',0)) "�λ�",
        COUNT(DECODE( substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) ,'052',0)) "���",
        COUNT(DECODE( substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) ,'053',0)) "�뱸",
        COUNT(DECODE( substr(tel, 1, INSTR(TEL, ')', 1, 1)-1 ) ,'055',0)) "�泲"
FROM student;

insert into emp (empno , deptno , ename , sal)
values (1000,10,'ȫ�浿',3600) ;

insert into emp (empno , deptno , ename , sal)
values (2000,30,'������',3000);

commit;

SELECT * FROM (SELECT deptno, job, empno, sal
                FROM emp)
PIVOT
(
    COUNT(empno) as CNT,
    SUM(NVL(sal,0)) as S_SAL FOR job IN('CLERK' as "CLERK",
             'MANAGER' as "MANAGER",
             'PRESIDENT' as "PRESIDENT",
             'ANALYST' as "ANALYST",
             'SALESMAN' as "SALESMAN")
             )
ORDER BY deptno;      

SELECT deptno,
SUM(DECODE(job, 'CLERK', sal, 0)) "CLERK",
SUM(DECODE(job, 'MANAGER', sal, 0)) "MANAGER",
SUM(DECODE(job, 'PRESIDENT', sal, 0)) "PRESIDENT",
SUM(DECODE(job, 'ANALYST', sal, 0)) "ANALYST",
SUM(DECODE(job, 'SALESMAN', sal, 0)) "SALESMAN",
SUM(NVL2(job, sal, 0)) "�հ�"
FROM emp
GROUP BY ROLLUP(deptno);

SELECT profno, name, pay,
       RANK() OVER (ORDER BY pay) AS RANK,
       RANK() OVER (ORDER BY pay DESC) AS RANK_DESC
FROM professor;

SELECT profno, name, pay,
       RANK() OVER (ORDER BY pay) AS RANK,
       RANK() OVER (ORDER BY pay DESC) AS RANK_DESC
FROM professor;

SELECT s.name "�л��̸�", s.deptno1 "�а���ȣ", d.dname "�а��̸�"
FROM student s, department d
WHERE s.deptno1 = d.deptno;

SELECT * from student;

SELECT s.name "�л��̸�", p.profno "������ȣ", p.name "�����̸�"
FROM student s, professor p
WHERE s.profno = p.profno;

SELECT s.name "�л��̸�", d.dname "�а��̸�", p.name "�����̸�"
FROM student s, professor p, department d
WHERE s.deptno1 = d.deptno
AND s.profno = p.profno;

SELECT * FROM gift;

SELECT go.gname "����", go.point "POINT", gi.gname "��ǰ��"
FROM gogak go, gift gi
WHERE go.point BETWEEN gi.g_start AND gi.g_end;

SELECT ename, sal
FROM emp
WHERE sal >(SELECT sal
            FROM emp
            WHERE ename = 'SCOTT');

SELECT s.name "�л��̸�", d.dname
FROM student s, department d
WHERE s.deptno1 = d.deptno
AND s.deptno1 = (SELECT deptno1
                FROM student
                WHERE name = '������');

SELECT p.name "������", p.hiredate "�Ի���", d.dname "�а���"
FROM professor p, department d
WHERE p.deptno = d.deptno
AND p.hiredate > (SELECT hiredate
                  FROM professor
                  WHERE name = '�۵���');

SELECT name "�̸�", position "����", TO_CHAR(pay, '999,999,999')|| ' ��' "����"
FROM emp2
WHERE pay > ANY (SELECT pay
                 FROM emp2
                 WHERE position = '����');
                 
                 
SELECT name "�̸�", position "����", TO_CHAR(pay, '999,999,999')|| ' ��' "����"
FROM emp2
WHERE pay < ANY (SELECT pay
                 FROM emp2
                 WHERE position = '����');

SELECT name "�̸�", grade "�г�", weight "������"
FROM student
WHERE weight < ALL(SELECT weight
                   FROM student
                   WHERE grade = '4');

SELECT grade "�г�", name "�̸�", height "Ű"
FROM student
WHERE (grade, height) IN (SELECT grade, MAX(height)
                 FROM student
                 GROUP BY grade)
ORDER BY 1;

SELECT p.PROFNO "������ȣ", p.name "������", p.hiredate "�Ի���", d.dname "�а���"
FROM professor p, department d
WHERE p.deptno = d.deptno
AND (p.deptno, p.hiredate) IN (SELECT deptno, MIN(hiredate)
                                FROM professor
                                GROUP BY deptno)
ORDER BY 4;

SELECT name "����̸�", position "����", pay "�޿�"
FROM emp2 a
WHERE pay >= (SELECT AVG(pay)
              FROM emp2 b
              WHERE a.position = b.position);
              
INSERT INTO dept2(dcode, dname, pdept)
VALUES(9002, 'Ư��3��', '������');

INSERT INTO professor(profno, name, id, position, pay, hiredate)
VALUES (5001, '�輳��', 'Love_me', '������', 510, '2011-11-14');

CREATE TABLE professor2
AS SELECT * FROM professor;

INSERT INTO professor2
SELECT * FROM professor;

INSERT ALL
INTO p_01(no, name)
VALUES(1, 'AAA')
INTO p_02(no, name)
VALUES(2, 'BBB')
SELECT * FROM dual;

INSERT ALL
WHEN profno BETWEEN 1000 AND 1999 THEN
INTO p_01 VALUES(profno, name)
WHEN profno BETWEEN 2000 AND 2999 THEN
INTO p_02 VALUES(profno, name)
SELECT profno, name
FROM professor;

SELECT COUNT(*) FROM p_01;

CREATE TABLE scott.test01(
no NUMBER, name VARCHAR2(20), addr VARCHAR2(20));

BEGIN
FOR i IN 1..500000 LOOP
INSERT INTO scott.test01
VALUES(i, DBMS_RANDOM.STRING('A', 19), 
          DBMS_RANDOM.STRING('Q', 19));
END LOOP;
COMMIT;
END;
/

SELECT COUNT(*) FROM SCOTT.TEST01;

ANALYZE TABLE scott.test01 COMPUTE STATISTICS;

Select * FROM pt_01;

Select * FROM pt_02;

Select * FROM P_total;

MERGE INTO p_total total
USING pt_01 p01
ON (total.�ǸŹ�ȣ = p01.�ǸŹ�ȣ)
WHEN MATCHED THEN
UPDATE SET total.��ǰ��ȣ = p01.��ǰ��ȣ
WHEN NOT MATCHED THEN
INSERT VALUES(p01.�ǸŹ�ȣ, p01.��ǰ��ȣ, p01.����, p01.�ݾ�);

MERGE INTO p_total total
USING pt_02 p02
ON (total.�ǸŹ�ȣ = p02.�ǸŹ�ȣ)
WHEN MATCHED THEN
UPDATE SET total.��ǰ��ȣ = p02.��ǰ��ȣ
WHEN NOT MATCHED THEN
INSERT VALUES(p02.�ǸŹ�ȣ, p02.��ǰ��ȣ, p02.����, p02.�ݾ�);

SELECT * FROM p_total;

CREATE TABLE dept5
AS  SELECT *
    FROM dept2
    WHERE 1 = 2;

SELECT * FROM dept5;

CREATE TABLE vt001
( no1 number,
  no2 number,
  no3 number GENERATED ALWAYS AS (no1 + no2) VIRTUAL);

SELECT * FROM vt001;
