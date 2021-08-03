/* 1�� ���� ǥ�� ��õ� ��� DEPT1 ���̺� ���� */
drop table dept1;
create table dept1(
        dno number(2),
        dname varchar2(14),
        loc varchar2(13));
desc dept1;

/* 2��, EMP ���̺� ���� */
drop table emp;
create table emp(
        eno number(4),
        ename varchar2(10),
        dno number(2));
desc emp;

/* 3��, ���̸��� �����ϵ��� EMP���̺��� ����(ENAME Į��ũ�� ����) */
alter table emp
modify ename varchar2(25);
desc emp;

/* 4��, employee���̺��� employee2�� �����ϵ� �����ȣ, �̸�, �޿�, �μ���ȣ Į���� �����ϰ�
 �� Į���� �̸��� EMP_ID, NAME, SAL, DEPT_ID�̴�. */
 create table employee2(emp_id,name,sal,dept_id)
 as
 select eno, ename, salary, dno from employee;
 desc employee2;
 
 /*5��, emp ���̺긦 ���� */
 drop table emp;
 desc emp;
 
 /* 6��, employee2�� �̸��� emp�� ����*/
rename employee2 to emp;
desc emp;
desc employee2;

/* 7��, DEPT ���̺��� DNAME Į�� ���� */
alter table dept1
drop column dname;
desc dept1;

/* 8��, DEPT ���̺��� LOCĮ���� UNUSED �� ǥ�� */
alter table dept1
set unused(loc);
desc dept1;

/*9��, UNUSED Į�� ���� */
alter table dept1
drop unused columns;
desc dept1;