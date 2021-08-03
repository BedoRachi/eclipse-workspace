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

/*FOREIGN KEY : 다른 테이블에 Primary key 컬럼을 참조해서 값을 할당 */
-- A 테이블 Primary Key(부모) -> B 테이블 Foreign Key(자식)

select * from user_constraints
where table_name = 'DEPARTMENT';

select * from user_constraints
where table_name = 'EMPLOYEE';

commit;
