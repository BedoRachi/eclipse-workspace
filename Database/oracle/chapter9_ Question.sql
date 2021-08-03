/*1�� EMP���̺��� ������ �����Ͽ� EMP_INSERT�� �� ���̺� */
create table emp_insert
as
select * from employee where 1=0;

/*2�� ������ EMP_INSERT ���̺� �߰��ϵ�  SYSDATE�� �̿��ؼ� �Ի����� ���÷� */
insert into emp_insert
values(1,'LEEJM','STUDENT',null,sysdate,2700,230,10);

/*3�� EMP_INSET ���̺� �� ����� �߰��ϵ� TO_DATE�� �̿� */
insert into emp_insert
values(2,'LYY','STUDENT',null, to_date(sysdate-1,'YY/MM/DD'),1150,null,20);

/*4�� EMPLOYEE ���̺��� ������ ������ �����Ͽ� EMP_COPY�� ���� */
create table emp_copy
as
select * from employee;

/*5�� �����ȣ�� 7788�� ����� �μ���ȣ�� 10������ ����*/
update emp_copy
set dno=10
where eno=7788;

/*6�� �����ȣ 7788�� ���� �� �޿��� 7499�� �����ϰ� ��*/
update emp_copy
set(job, salary) = (select job, salary
                    from emp_copy
                    where eno=7499)
where eno=7788;

/*7��, �����ȣ 7369�� ������ ������ ��� ����� �μ���ȣ�� 7369�� ���� */
update emp_copy
set dno=(select dno
        from emp_copy
        where eno=7369)
where job=(select job
            from emp_copy
            where eno=7369);
            
/*8��, department���̺� ������ �����Ͽ� DEPT_COPY�� ����*/
create table dept_copy
as
select * from department;

/*9��, dept_copy ���̺��� �μ����� RESEARCH�� �μ��� ����*/
delete from dept_copy
where dname='RESEARCH';

/*10��, dept_copy���̺��� �μ���ȣ�� 10,40�� �μ��� ����*/
delete from dept_copy
where dno in(10,40);