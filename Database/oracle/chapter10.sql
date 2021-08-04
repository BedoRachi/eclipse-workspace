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

/*FOREIGN KEY : �ٸ� ���̺� Primary key or Unique �÷�(�� �����ؼ� ���� �Ҵ� */
-- A ���̺� Primary Key(�θ�) -> B ���̺� Foreign Key(�ڽ�)
-- �ٸ� ���̺��� �������� ������� �÷� ������ ���

--�θ� ���̺�(primary key)
create table ParentTb1(
        name varchar2(20),
        age number (3) constraint ParentTb1_age_ck check(age > 0 and age <200),
        gender varchar (3) constraint ParentTb1_gender_ck check(gender in ('M', 'W')),
        infono number constraint ParentTb1_infono_pk primary key
        );
desc ParentTb1
insert into ParentTb1 values ('ȫ�浿',30,'M',1);
insert into ParentTb1 values ('��ʶ�',20,'M',2);
insert into ParentTb1 values ('����',40,'M',3);
insert into ParentTb1 values ('ȫ���',50,'W',4);
insert into ParentTb1 values ('�̳���',30,'W',5);
insert into ParentTb1 values ('��ʼ�',70,'W',10);
commit;

select * from user_indexes;
select * from parentTb1;

--�ڽ� ���̺� foreign key
create table childTb1(
        id varchar2(40) constraint ChildTb1_id_pk primary key,
        pw varchar2(40),
        infono number,
        constraint childTb1_infono_FK foreign key (infono) references parentTb1(infono)
        -- parentTb1�� infono�� �����Ͽ� childTb1�� infono�� �����ϸ� �������� ���� childTb1_infono_FK�̴�.
        -- �� childTb1�� infono�� �ݵ�� parentTb1�� infono�� ��ġ�ϴ� ���� �־�� �Ѵ�. ��ġ���� ���� ��� �Է� �Ұ�
        -- �� primary�� �޸� childTb1 infono �ȿ��� �ߺ����� �����
        );

insert into childTb1 values ('aaa','1234',20); -- parentTb1 infono�� 20�� �����Ƿ� �Է� �Ұ�
insert into childTb1 values ('aaa','1234',1); -- parentTb1 infono�� 1�� �����Ƿ� �Է� ����
insert into childTb1 values ('bbb','5678',1); -- parentTb1 infono�� 1�� �����Ƿ� �Է� ����
select * from childTb1;

/* CHECK : �÷��� ���� ������ ���� */
create table emp_second(
    eno number(4) constraint emp_seconde_eno_pk primary key,
    ename varchar2(10),
    salary number(7,2) constraint emp_second_salary_min check(salary>0));
    
/* DEFAULT : �÷��� ���� �Է����� �ʾ��� ���(null) default���� ����� */
create table emp_second(
        eno number(4) constraint emp_seconde_eno_pk primary key,
        ename varchar2(10),
        salary number(7,2) default 1000);
        
/* �������� ���� */
/* ���� ���̺� Priamary Key �߰� */
alter table emp_copy
add constraint emp_copy_eno_pk primary key(eno);

alter table dept_copy
add constraint dept_copy_dno_pk primary key(dno);

/* add : ���� ���̺� Foreign Key �߰� */
alter table emp_copy
add constraint emp_copy_dno_fk
foreign key(dno) references dept_copy(dno);

/* Modify : ���� ���������� ���� */
alter table emp_copy
modify ename constraint emp_copy_ename_nn not null;

/* ���� ���� ���� */
alter table dept_copy
drop primary key;

/* CASCADE : ���� ���� ����(unique, foreign)���� ���� ���� */
alter table dept_copy
drop primary key cascade;

/* Drop : Ư�� ���� ���� ���� */
alter table emp_copy
drop constraint emp_copy_ename_nn;

/* �������� Ȱ��ȭ, ��Ȱ��ȭ */
/* Disable : ���� ���� ��Ȱ��ȭ */
alter table emp_copy
disable constraint emp_copy_dno_fk;

/* Enable : ���� ���� Ȱ��ȭ */
alter table emp_copy
enable constraint emp_copy_dno_fk;