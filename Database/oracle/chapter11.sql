 /* view */
-- ������ ���̺�� ������������ ���̺��� ȣ���ϴ� ��ó�� ������ ������ ���̺��� �����ϴ� ��(������ �Լ� or Object)
-- ���� Table�� �ƴϰ� �ڵ��� �������� view�� ȣ�� �� �ڵ��� ������ ����Ǵ� ����
-- ������ ���� ���, ��ü ���̺��� Ư�� �÷��� ���
-- ������ ������ ������ ���(���Ǽ�)

/* view ���� ���� 
    1. USER_VIEWS ������ �������� �信 ���� ������ ��ȸ
    2. ������ ������ ���̺� ������ �� �ִ��� ���� Ȯ��
    3. �⺻ ������ ����
    4. �˻�(view�� ���� ������ ���� �ʱ� ������ ���̺��� ���� ������)
    5. ��� ���

 /* view �� ���� */
 create view v_emp_job(���, ����̸�, �μ���ȣ, ������)
 as
 select eno, ename, dno, job
 from emp_second
 where job like 'SALESMAN';

/* view �� ����(�÷��� ����) */
create view v_emp_job2
 as
 select eno, ename, dno, job
 from emp_second
 where job like 'SALESMAN';
 
 /* view �� ����ϱ� */
 select * from v_emp_job;
  select * from v_emp_job2;
  
 /* view �� ���� �ڵ� ��� */
 select view_name,text from user_views
 where view_name = 'V_EMP_JOB';
 
-- �ܼ���(Simple view) : �ϳ��� ���̺�� ������ view
-- ���պ�(Complex view) : �ΰ� �̻��� ���̺�� ������ view
    -- �䳻���� DISTINC, �׷��Լ�, Group by, Rownum�� ����� �� ����.
    
/* ���� �� ����(�� ���̺��� ���ļ� ���) */
create view v_emp_complex
as
select *
from emp_second natural join dept_second; -- emp, dept�� join�Ͽ� ���� �� ����

select * from v_emp_complex;

/*�ܼ� �� ����(�ʿ��� �÷��� ���)*/
create view v_emp_sample
as
select eno, ename, job, manager, dno --�ʿ��� �÷��� �����ͼ� view�� ����
from emp_second;

/* ���� �� ����(JOIN�� view) */
create view v_emp_complex2
as
select e.eno, e.ename, e.salary, dno, d.dname, d.loc
from emp_second e natural join dept_second d;

/* view ����(insert)(�� �׷��Լ� ����� insert �Ұ�) */
-- view�� ���� ��������� �ʰ� ���� Table�� �����
-- ��, ���� Table�� �������ǿ� ���� ������� ���� �� �ִ�.
insert into v_emp_job
values(9000,'����ȭ',30,'SALESMAN'); --view��� ���� Table�� �����

select * from v_emp_job;  --view ȣ��� ������� Ȯ��

select view_name,text from user_views
where view_name = 'V_EMP_JOB'; --���� Table Ȯ��

select * from emp_second; -- ���� Table ȣ��� ������� Ȯ��

/* view + �׷� �Լ�, ��Ī�� ����ؾ��� */
create view v_emp_salary
as
select dno, sum(salary) as "sal_sum", avg(salary) as "sal_avg" --��Ī�� �ݵ�� ����ؾ���
from emp_second
group by dno;

/* view �����ϱ� */
drop view v_emp_job2;

/* CREATE OR REPLACE : view�� ������ ���� ��� �űԻ���, ������ ��� ����� */
create or replace view v_emp_job2
as
select eno, ename, job
from emp_second
where job like 'MANAGER';

/* force/noforce : ���̺� ������� ���� / ���̺��� ���� ���� ����(defualt) */
create force view v_emp_notable --force�ɼ��� ���� ��������
as
select eno, ename, job
from emp_notable --���� ���̺�
where job like 'MANAGER';

/* with check : where�� ���� Ư�� ���� �����ð�� Ȯ���ؼ� insert or update ������ */
create or replace view v_emp_job_nochk
as
select eno, ename, dno, job
from emp_second
where job like 'MANAGER' with check option; --insert or update�� job�� Ȯ���Ͽ� MANAGER�� ��츸 �����

select * from v_emp_job_nochk;

insert into v_emp_job_nochk
values (9001, '������', 30,'SALESMAN');--MANAGER�� �ƴϱ� ������ �Է� ����

/* with Read Only : �б⸸ ���(insert/update/delete ���Ұ�) */
create or replace view v_emp_job_readonly
as
select eno, ename, dno, job
from emp_second
where job like 'MANAGER' with read only; --������ ������� ����

select * from v_emp_job_readonly; --read�� ����

insert into v_emp_job_readonly
values (9005, '������', 30,'SALESMAN');--read only ������ �Է� ����