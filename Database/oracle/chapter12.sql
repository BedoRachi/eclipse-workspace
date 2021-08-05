/* ������ : �ڵ� ��ȣ �߻��� */
/*������ ���� */
create sequence sample_seq --������ ����
        increment by 10  --������
        start with 10;  --���۰�
    
select * from user_sequences;
select sample_seq.nextval from dual; -- ȣ���Ҷ� ���� ���� ���� ��ȯ��
select sample_seq.currval from dual; -- ȣ���Ҷ� ���� ���� ���� ��ȯ��

/* �������� �⺻ Ű�� �����ϱ� */
create sequence sample_seq --������ ����
        increment by 1  --������
        start with 1;  --���۰�

insert into dept_second
values (sample_seq.nextval, 'ACCOUNT', 'New York');

select * from dept_second;

create sequence sample_seq2 --������ ����
        increment by 2  --������
        start with 1;  --���۰�
        
/* ������ ���� �� ���� */
alter sequence sample_seq
increment by 5;

drop sequence sample_seq;

/* cache / nocache : �������� ������ ���� �������� ���� �ӽ÷� ������
                    �������� ���̰� ������ ���� ���� ���ɿ� ������ �߻� + ������ ������ ����� �������� �ȸ°Ե�*/
--���� URL : https://doughman.tistory.com/11
create sequence sample_seq3
        increment by 2
        start with 2
        nocache;
        
/* INDEX : ���� ��� �� ���� Ű���� ������ INDEX�� ����� ȣ��� INDEX�� �˻��Ͽ� ���ϴ� ���� ��ġ�� Ȯ��
            ���̺� �˻� �ӵ� < �ε��� �˻� �ӵ� (not always) / ���̺� �˻� ���� > �ε��� �˻� ����
            ��. �ε����� ���� �߰� ����(10%) + ���� �ε��� ������ ���� �߻� + ���� �������� ���� �ε��� ����� ����(�ε��� ����)
            */
/*?

B-Tree(Balanced Tree, ����Ʈ��) :

- Root Node(��Ʈ ���) : INDEX�� ù �������� ���� Ű�� �� ��ǥ���� �����ϰ� �ִ� Node�̴�.

�˻��� Root Node���� Ű���� ��ġ �Ǵ� ���� ����� Leaf Node�� ��ġ�� Ȯ��

- Reaf Node(���� ���) : ���� Ű������ ���� �� ���� �Ǿ� ����Ǿ� �ִ� Node��� �� Leaf Node�� ��ǥ Ű��

�� Root Node�� �����Ѵ�. */

select * from user_columns;
select * from user_ind_columns;

/* Index ���� */
create index idx_employee_ename
on employee(ename);

select * from employee
where ename = 'MILLER'; -- Index�� ���� �˻�

/* Index ��ȸ */
select index_name, table_name, column_name
from user_ind_columns
where table_name in('EMPLOYEE'); --�˻��� ���̺���� �빮��

/* Index �ڵ� ����(Primary, UniqueŰ�� �ִ� �÷��� �ڵ� Index) */
create table tbl1(
    a number(4) constraint tbl1_a_pk primary key, --primary Key�� �ڵ� Index��
    b number(4),
    c number(4)
    );
    
create table tbl2 (
    a number(4) constraint tbl2_a_pk primary key,
    b number(4) constraint tbl2_b_uk unique, --Unique Key�� �ڵ� Index��
    c number(4) constraint tbl2_c_uk unique
    );
    
select index_name, table_name, column_name
from user_ind_columns
where table_name in('TBL1', 'TBL2');

/* Index drop */
drop index idx_employee_ename;

/* index rebuild : �÷��� ���� ����(insert, update, delete)�� Index Page�� ���� �� 
�籸���ǹǷ� rebulid�� ���� ����ȭ */
alter index idx_employee_ename rebuild;

/* index �� ����
    ���� �ε���(Unique Index) : �÷��� �ߺ����� �ʴ� ���� �� ���� ������ INDEX(Primary Key, Unique �÷��� �ڵ�����)
    ���� �ε���(Single Index) : �÷� �ϳ��� �ο��Ǵ� �ε���
    ���� �ε���(Composite Index) : �÷� �������� ���� �ο��ϴ� �ε���
    �Լ� �ε���(Function Base Index) : �Լ��� ������ �÷��� �ε���
*/

/* ���� �ε���(Unique Index) */
drop table dept_second;

create table dept_second
as
select * from department;

select * from dept_second;
select * from user_ind_columns;

select * from user_ind_columns
where table_name in('DEPT_SECOND', 'DEPARTMENT');

create unique index idx_dept_dno
on dept_second(dno); --dno �÷��� unique index �� �ο��ϸ� �̸��� idx_dept_dno �̴�.

create unique index inx_dept_loc
on dept_second(loc); --dno �÷��� unique index �� �ο��ϸ� �̸��� inx_dept_loc �̴�.

/* ���� �ε���(Composite Index) */
create index idx_dept_com
on dept_second(dname, loc); --loc, danem �÷��� ��� Index

/* DB ���� 
    -- DBMS�� ���� �� �� �ִ� �����(��������)
    -- Authorization : DB�� ���� �� ����, ������ �� �� �ִ� ����
        -- System privilege : 
        -- Object Privilege : 
*/
/* create user : ���� ���� */
create user usertest01 identified by pass1; -- ���� ����

/* grant : ���� �ο� */
grant create session to usertest01; -- ���� ���� �ο�

grant create table to usertest01; -- ���̺��� ���� �� �ִ� ����

select username, default_tablespace
from dba_users
where username in ('USERTEST01','HR'); -- ������ ���� Ȯ��

alter user usertest1 default TABLESPACE USERS; -- �⺻ ���̺� �����̽� USERS �Ҵ�

grant select on employee to usertest01; -- usertest01�� employee���̺��� select ���Ѹ� �ο� 

/* ���� �н����� ���� */
alter user usertest01 identified by 1234;

/* ���� ���� ���� */
revoke create session from usertest01 ;

/* ���� �α׿� ������ ���� ��� */
select * from session_privs;

/* WITH GRANT OPTION 
    : ������ �ο� ���� ����ڵ� �ش� ������ �ٸ� ����ڿ��� �ο�.
*/
create user usertest02 identified by pass2;
create user usertest03 identified by pass3;

grant create session, create table, create view to usertest02;
grant create session, create table, create view to usertest03;

grant select on hr.employee to usertest02 with grant option;

/* ��ü ���� */
grant select on hr.employee to public;

/* �� : ���� ����ϴ� ������ �׷�ȭ */
create user usertest04 identified by pass4
grant resource to usertest04; --�������� �� ��
grant connect to usertest04;

/* ����� ���� �� */
create role roletest01;
grant create session, create table, create view to roletest01; -- ����� ���� ��

grant roletest01 to usertest01;

/* �� ���� Ȯ�� */
select * from role_sys_privs
where role like '%TEST%';