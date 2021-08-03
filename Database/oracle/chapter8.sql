/* Table ���� */
Create table dept1(
    dno number(2) not null,
    dname varchar2(14) not null,
    loc varchar2(13) null
    );
-- �÷��� �ڷ��� NULL��뿩�� ������ �Է��Ѵ�.

/* Table ���� ��� */
desc dept1;

/* ���̺� ���� ��� -> Null */
select * from dept1;

/* �÷��� ��� ���� �ʰ� ����->������ �´ٸ� ���������� �Էµ� */
insert into dept1 values (1, 'hong', 'seoul');

/* �÷��� ����Ͽ� ���� -> �÷��� ���� �Էµ� */
insert into dept1 (dno, dname, loc) values (2, 'kim', 'pusan');

/* �÷��� �Ϻθ� ���� -> ������ �÷��� NULL ó���� */
insert into dept1 (dno, dname) values (3, 'park');

/* ���̺� ���� ��� -> 3�� ���*/
select * from dept1;

--Ʈ�����(Transaction) : DB�� �ּ� ó�������� Ʈ������̶���
    -- �������� �ϰ��� ����
    -- ALL or Nothing : ���� �ǰų� ���� �ȵǰų� �ϴ� ����� ó��
    -- Oracle �� DML ���� ����ɶ� ���� Memory�� �����Ͽ� begin transection & Rollback�� �����ϸ�
    -- "commit;" �� ��� DB�� �����ϸ� Commit�Ѵ�.
    -- ��� Transaction�� ������������ �����ϱ� ���� �α׸� �����Ѵ�.
 
insert into dept1 (dno, dname, loc) values (4, 'son', 'taegu'); -- Treansaction Insert(Memeoy) 
select * from dept1; -- ������ �÷��� ��µ�
rollback; -- Last Commit���� ���ư�
select * from dept1;  -- ������ �÷��� ����
insert into dept1 (dno, dname, loc) values (4, 'son', 'taegu'); -- Treansaction Insert(Memeoy) 
commit; -- commit �Ϸ�(Memory ->DB)
rollback;
select * from dept1; -- commit�� �Ͽ��� ������ �÷��� ����

delete dept1 -- where�� ���� ���dept1 ���̺��� ����
where dno=3; -- where�� ���� ��� Ư�� �����͸� ������
rollback; -- delete�� ���� �ʾ����Ƿ� Rollback��

/* Table ��ü ���� */
create table dept1_second
as
select * from department; --depeartment ��� ���̺��� �ҷ��� dept1_sccond ���̺��� ����
select * from dept1_second;

/* Table �κ� ���� �� ���� */
create table dept120
as
select eno, ename, salary * 12 annsal -- ���̺� ����� ���̺��� ���� ������ ��� ���̺���� �������� ������ �ݵ�� ��Ī�� �־����  
from employee
where dno =20; --dno�� 20 �� ������θ� �Ѵ�.

/* Table ������ ���� */
create table dept1_third
as
select eno, ename -- ������ ���̺��� ����
from employee
where 0=1; -- ������ ��ȯ�ǹǷ� ������ ���̺� ������

/* ���̺� ����(alter) */
alter table dept120
add(birth date); --�÷� �߰�

alter table dept120
add(email varchar2(100)); --�÷� �߰�

alter table dept120
add(Address varchar2(200)); --�÷� �߰�(200�ڸ� �̳��� ������ char)(������ �ټ� �������� �ʿ�ÿ� ������ �Ҵ��ϹǷ� ���� ����)

alter table dept120
add(Jumin char(13)); --�÷� �߰�(13�ڸ� �̳��� char))(������ ������ ������ �����ϹǷ� ���� �߻��� �� ����)

desc dept120
select * from dept120; --�߰��� �÷� Ȯ��

/* �÷� �ڷ��� ���� */
alter table dept120
modify  ename varchar2 (30); --ename �ڷ����� ����

/* �÷� ���� */
alter table dept120
drop column JUMIN; --JUMIN �÷��� ����

/*�÷��� ���� */
alter table dept120
rename column EMAIL to E_MAIL;

/*Table�� ����*/
rename dept120 to emp120;

-- SET UNUSED : Ư�� �÷��� ������ �ϴ� ������ ������ ���� ���ϰ� �߻��ϹǷ� UNUSED->DELETE�Ͽ�
        --  �ڿ��� ����Ҷ� DELETE�� �����Ѵ�.
alter table dept120
set unused(eno);

alter table dept120
drop unused column;

select table_name from user_tables;
select * from tab;

/* TRUNCATE Table : ���̺��� ��� �����͸� ���� */
-- ��� �����͸� �����ϳ� ���̺� ��ü�� ���´�(=���� ����)
-- ����� ����� �ڵ����� Commit��

/* Delete Table : ���̺� ���� */
-- ��� ������ + ���̺��� �����Ѵ�(��+���̺� ����)
-- ������ ������� �����ϱ� ������ ���̺� ��ü ������ TRUNCATE���� ����
-- where�� ������ �� ��� Ư�� ���� �����Ѵ�.
-- Memory �󿡼��� �������� ������ Commit or Rollback�� ����

/* ������ ���� : ��ü�� ������ �����ϰ� �ִ� ���̺� */
-- ��ü(��ƼƼ) : ���̺�, ��, Ʈ����, �ε���, �������ν���, �Լ�....
-- DDL : ��ü�� �����ϴ� ���, Create, Alter, Drop
-- DML : ������(���ڵ�)�� �����ϴ� ���, Insert, Update, Delete, Select
        -- Ʈ������� �߻��ϸ� Log�� ��ϵ�
/* USER_ : �ڽ��� ������ ���� ��ü�� ���� ����
   ALL_ : �ڽ��� ���� ������ ��ü�� ������ �ο� ���� ��ü
   DBA+ : �����ͺ��̽� �����ڸ� ���� ������ ��ü
*/

show user;

/* USER_ : ?���� �α����� ����ڰ� �����ϴ� ��ü�� ��ȸ*/
select * from user_tables; -- ���̺� ��� �� ���õ� ����
select * from user_views; -- �� ��� �� ���õ� ����
select * from user_indexes; --���ؽ� ��� �� ���õ� ����
select * from user_constraints; --���̺��� ���������� ��ȸ
select * from user_sequences; --������ ��� ��ȸ
-- ��������: �������� ���Ἲ�� ���� ����(NOT NULL, UNIQUE, CHECK, PRIMARY/FOREIGN KEY, DEFAULT)
-- ������ : �ڵ���ȣ �߻���� �⺻Ű�� ������ ��(����)�� �����ϵ��� �ڵ����� �����ϸ� �Ҵ�

/*ALL_ : ��� ����ڰ� ���ٱ����� �ִ� ��ü�� ��ȸ */
select * from all_tables;
select * from all_views;
select * from all_indexes;

/*DBA_ : �����ڰ� ���ٰ����� ��ü�� ��� ��ü�� ��ȸ(sys or system ������ �ʿ�) */
select * from dba_tables;
select * from dba_views;
select * from dba_indexes;

