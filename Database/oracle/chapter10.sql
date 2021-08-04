/*제약조건*/
/*특정 컬럼을 primary key 설정(컬럼 레벨) */
create table dept_second(
        dno number(2) constraint pk_dept_second primary key,
        dname varchar2(14),
        loc varchar2(13));
        
/*묵시적 primary key 설정(테이블 레벨)*/
create table dept_third(
        dno number(2),
        dname varchar2(14),
        loc varchar2(13),
        constraint pk_dept_third primary key(dno)); --dno 컬럼이 Primary key
        
create table customer(
        id varchar(20),
        pwd varchar(20) constraint customer_pwd_nn not null,
        name varchar(20) constraint customer_name_nn not null,
        phone varchar(30),
        address varchar(100),
        constraint customer_id_pk primary key(id));
        
/* NOT NULL : 컬럼에 NULL을 허용하지 않는다(컬럼 레벨) */
create table customer(
        id varchar(20) not null,
        pwd varchar(20) not null,
        name varchar(20) not null,
        phone varchar(30),
        address varchar(100));
        
/* UNIQUE : 컬럼에 중복값을 허용하지 않는다.(컬럼, 테이블 레벨) */
-- 최초 1회에 한해 NULL 입력 가능
-- Non Cluster Index을 자동생성
create table customer(
        id varchar(20) unique,
        pwd varchar(20) not null,
        name varchar(20) not null,
        phone varchar(30),
        address varchar(100));

/* CONSTRAINT : 제약 조건의 별칭(이름) 설정 */
create table customer(
        id varchar(20) constraint customer_id_uk unique,
        pwd varchar(20) constraint customer_pwd_uk not null,
        name varchar(20) constraint customer_name_uk not null,
        phone varchar(30),
        address varchar(100));

select table_name, constraint_name
from user_constraints
where table_name in ('CUSTOMER');

/*FOREIGN KEY : 다른 테이블에 Primary key or Unique 컬럼(을 참조해서 값을 할당 */
-- A 테이블 Primary Key(부모) -> B 테이블 Foreign Key(자식)
-- 다른 테이블의 고유값을 기반으로 컬럼 설정시 사용

--부모 테이블(primary key)
create table ParentTb1(
        name varchar2(20),
        age number (3) constraint ParentTb1_age_ck check(age > 0 and age <200),
        gender varchar (3) constraint ParentTb1_gender_ck check(gender in ('M', 'W')),
        infono number constraint ParentTb1_infono_pk primary key
        );
desc ParentTb1
insert into ParentTb1 values ('홍길동',30,'M',1);
insert into ParentTb1 values ('김똘똘',20,'M',2);
insert into ParentTb1 values ('원빈',40,'M',3);
insert into ParentTb1 values ('홍길순',50,'W',4);
insert into ParentTb1 values ('이나영',30,'W',5);
insert into ParentTb1 values ('김똘순',70,'W',10);
commit;

select * from user_indexes;
select * from parentTb1;

--자식 테이블 foreign key
create table childTb1(
        id varchar2(40) constraint ChildTb1_id_pk primary key,
        pw varchar2(40),
        infono number,
        constraint childTb1_infono_FK foreign key (infono) references parentTb1(infono)
        -- parentTb1의 infono를 참조하여 childTb1의 infono를 생성하며 제약조건 명은 childTb1_infono_FK이다.
        -- 즉 childTb1의 infono는 반드시 parentTb1의 infono에 일치하는 값이 있어야 한다. 일치하지 않을 경우 입력 불가
        -- 단 primary와 달리 childTb1 infono 안에서 중복값은 허용함
        );

insert into childTb1 values ('aaa','1234',20); -- parentTb1 infono에 20이 없으므로 입력 불가
insert into childTb1 values ('aaa','1234',1); -- parentTb1 infono에 1이 있으므로 입력 가능
insert into childTb1 values ('bbb','5678',1); -- parentTb1 infono에 1이 있으므로 입력 가능
select * from childTb1;

/* CHECK : 컬럼의 값의 범위를 설정 */
create table emp_second(
    eno number(4) constraint emp_seconde_eno_pk primary key,
    ename varchar2(10),
    salary number(7,2) constraint emp_second_salary_min check(salary>0));
    
/* DEFAULT : 컬럼의 값을 입력하지 않았을 경우(null) default값이 저장됨 */
create table emp_second(
        eno number(4) constraint emp_seconde_eno_pk primary key,
        ename varchar2(10),
        salary number(7,2) default 1000);
        
/* 제약조건 변경 */
/* 기존 테이블에 Priamary Key 추가 */
alter table emp_copy
add constraint emp_copy_eno_pk primary key(eno);

alter table dept_copy
add constraint dept_copy_dno_pk primary key(dno);

/* add : 기존 테이블에 Foreign Key 추가 */
alter table emp_copy
add constraint emp_copy_dno_fk
foreign key(dno) references dept_copy(dno);

/* Modify : 기존 제약조건을 변경 */
alter table emp_copy
modify ename constraint emp_copy_ename_nn not null;

/* 제약 조건 제거 */
alter table dept_copy
drop primary key;

/* CASCADE : 종속 제약 조건(unique, foreign)까지 전부 제거 */
alter table dept_copy
drop primary key cascade;

/* Drop : 특정 제약 조건 제거 */
alter table emp_copy
drop constraint emp_copy_ename_nn;

/* 제약조건 활성화, 비활성화 */
/* Disable : 제약 조건 비활성화 */
alter table emp_copy
disable constraint emp_copy_dno_fk;

/* Enable : 제약 조건 활성화 */
alter table emp_copy
enable constraint emp_copy_dno_fk;