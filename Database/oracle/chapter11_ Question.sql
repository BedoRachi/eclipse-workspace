/*1��, 20�� �μ��� �Ҽӵ� ����� �����ȣ�� �̸�, �μ���ȣ�� ����ϴ� view */
create view v_em_dno
as
select eno, ename, dno
from emp_second
where dno=20;

/*2��, �޿��� ��� */
create or replace view v_em_dno
as
select eno, ename, dno,salary
from emp_second
where dno=20;

/*3��, view ���� */
drop view v_em_dno;