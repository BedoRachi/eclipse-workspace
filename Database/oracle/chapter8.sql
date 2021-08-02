/* Table ���� */
Create table dept(
    dno number(2) not null, 
    dname varchar2(14) not null,
    loc varchar2(13) null
    );

/* Table ���� ��� */
desc dept;

/* ���̺� ���� ��� -> Null */
select * from dept;

/* �÷��� ���� ���� �ʰ� ����->������ �´ٸ� ���������� �Էµ� */
insert into dept values (1, 'hong', 'seoul');

/* �÷��� �����Ͽ� ���� -> �÷��� ���� �Էµ� */
insert into dept (dno, dname, loc) values (2, 'kim', 'pusan');

/* �÷��� �Ϻθ� ���� -> ������ �÷��� NULL ó���� */
insert into dept (dno, dname) values (3, 'park');

/* ���̺� ���� ��� -> 3�� ���*/
select * from dept;

--Ʈ�����(Transaction) : DB�� �ּ� ó�������� Ʈ������̶���
    -- �������� �ϰ��� ����
    -- ALL or Nothing : ���� �ǰų� ���� �ȵǰų� �ϴ� ����� ó��
    -- Oracle �� DML ���� ����ɶ� ���� Memory�� �����Ͽ� begin transection & Rollback�� �����ϸ�
    -- "commit;" �� ��� DB�� �����ϸ� Commit�Ѵ�.
 
insert into dept (dno, dname, loc) values (4, 'son', 'taegu'); -- Treansaction Insert(Memeoy) 
select * from dept; -- ������ �÷��� ��µ�
rollback; -- Last Commit���� ���ư�
select * from dept;  -- ������ �÷��� ����
insert into dept (dno, dname, loc) values (4, 'son', 'taegu'); -- Treansaction Insert(Memeoy) 
commit; -- commit �Ϸ�(Memory ->DB)
rollback;
select * from dept; -- commit�� �Ͽ��� ������ �÷��� ����

delete dept -- where�� ���� ���dept ���̺��� ����
where dno=3; -- where�� ���� ��� Ư�� �����͸� ������
rollback; -- delete�� ���� �ʾ����Ƿ� Rollback��

/* Table ��ü ���� */
create table dept_second
as
select * from department; --depeartment ��� ���̺��� �ҷ��� dept_sccond ���̺��� ����
select * from dept_second;

/* Table �κ� ���� �� ���� */
create table dept20
as
select eno, ename, salary * 12 annsal -- ���̺� ����� ���̺��� ���� ������ ��� ���̺����� �������� ������ �ݵ�� ��Ī�� �־����  
from employee
where dno =20; --dno�� 20 �� ������θ� �Ѵ�.

/* Table ������ ���� */
create table dept_third
as
select eno, ename -- ������ ���̺��� ����
from employee
where 0=1; -- ������ ��ȯ�ǹǷ� ������ ���̺��� ������

/* ���̺� ����(alter) */
alter table dept20
add(birth date); --�÷� �߰�

alter table dept20
add(email varchar2(100)); --�÷� �߰�

alter table dept20
add(Address varchar2(200)); --�÷� �߰�(200�ڸ� �̳��� ������ char)(������ �ټ� �������� �ʿ�ÿ� ������ �Ҵ��ϹǷ� ���� ����)

alter table dept20
add(Jumin char(13)); --�÷� �߰�(13�ڸ� �̳��� char))(������ ������ ������ �����ϹǷ� ���� �߻��� �� ����)

desc dept20
select * from dept20; --�߰��� �÷� Ȯ��

/* �÷� �ڷ��� ���� */
alter table dept20
modify  ename varchar2 (30); --ename �ڷ����� ����

/* �÷� ���� */
alter table dept20
drop column JUMIN; --JUMIN �÷��� ����

-- SET UNUSED : Ư�� �÷��� ������ �ϴ� ������ ������ ���� ���ϰ� �߻��ϹǷ� UNUSED->DELETE�Ͽ�
        --  �ڿ��� ����Ҷ� DELETE�� �����Ѵ�.
alter table dept20
set unused(eno);

alter table dept20
drop unused column;