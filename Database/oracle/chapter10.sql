/*��������*/
/*Ư�� �÷��� primary key ����(�÷� ����) */
create table dept_second(
        dno number(2) constraint pk_dept_second primary key,
        dname varchar2(14),
        loc varchar2(13));
        
/*������ primary key ����(���̺� ����)*/
create table dept_third(
        dno number(2),
        dname varchar2(14),
        loc varchar2(13),
        constraint pk_dept_third primary key(dno)); --dno �÷��� Primary key
        
create table customer(
        id varchar(20),
        pwd varchar(20) constraint customer_pwd_nn not null,
        name varchar(20) constraint customer_name_nn not null,
        phone varchar(30),
        address varchar(100),
        constraint customer_id_pk primary key(id));
        
/* NOT NULL : �÷��� NULL�� ������� �ʴ´�(�÷� ����) */
create table customer(
        id varchar(20) not null,
        pwd varchar(20) not null,
        name varchar(20) not null,
        phone varchar(30),
        address varchar(100));
        
/* UNIQUE : �÷��� �ߺ����� ������� �ʴ´�.(�÷�, ���̺� ����) */
-- ���� 1ȸ�� ���� NULL �Է� ����
-- Non Cluster Index�� �ڵ�����
create table customer(
        id varchar(20) unique,
        pwd varchar(20) not null,
        name varchar(20) not null,
        phone varchar(30),
        address varchar(100));

/* CONSTRAINT : ���� ������ ��Ī(�̸�) ���� */
create table customer(
        id varchar(20) constraint customer_id_uk unique,
        pwd varchar(20) constraint customer_pwd_uk not null,
        name varchar(20) constraint customer_name_uk not null,
        phone varchar(30),
        address varchar(100));

select table_name, constraint_name
from user_constraints
where table_name in ('CUSTOMER');

/*FOREIGN KEY : �ٸ� ���̺� Primary key �÷��� �����ؼ� ���� �Ҵ� */
-- A ���̺� Primary Key(�θ�) -> B ���̺� Foreign Key(�ڽ�)

select * from user_constraints
where table_name = 'DEPARTMENT';

select * from user_constraints
where table_name = 'EMPLOYEE';

commit;
