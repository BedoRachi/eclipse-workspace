select dno, eno, ename
from employee
where eno = 7788;

/* ī���� �� */
select * from department, employee;

/* ī���� ��: �� ���̺��� �ٸ� ���̺��� ������ ��� */
/* department(4) * employment(14) = 54 */
select * -- ���� ���
from department, employee -- department, employee�� ����
order by department.dno asc, ename asc;  -- department�� dno, ename ���� ��������

/* Join */
select *
from department, employee
where department.dno = employee.dno
-- �� ���̺��� ���� �÷� dno(Key �÷�)�� ����(����� ���� ���������� ���)
and employee.eno =7788; -- employee�� eno�� ���� 7788�� ���� ���

select eno, ename, dname, department.dno
from department, employee
where department.dno = employee.dno
-- �� ���̺��� ���� �÷� dno(Key �÷�)�� ����(����� ���� ���������� ���)
and employee.eno =7788; -- employee�� eno�� ���� 7788�� ���� ���

/* ���̺� ��Ī */
select e.eno, e.ename, d.dname, d.dno --��Ī ����
from department d, employee e -- ���̺���� ��Ī�� ����(����)
where d.dno = e.dno--��Ī ����
and e.eno=7788;--��Ī ����

/* NATURAL JOIN : Join�� �޸� Where ����, ����Ű �ڵ�����, ����Ű ��Ī ���Ұ�, ����Ű ������ Ÿ���� ����*/
select eno, ename, dname, dno --����Ű�� dno �÷��� ��Ī ���� �Ұ�
from employee e natural join department d --��Ī���� �� natural join
where e.eno = 7788; --����Ű �̿ܿ� ��Ī���� ����

/* USING : ������ Ÿ���� ���� �ٸ� ��� USING�� ���� Join */
select e.eno, e.ename, d.dname, dno --Natural Joinó�� ����Ű �÷��� ��Ī ���Ұ�
from employee e join department d -- join�� ���̺��� ����+��Ī ����
using (dno) -- join�� �÷�(���� �÷�)�� ����
where e.eno=7788;

/* ON : EQUI Join���� Where ��� On ����� �����ϴ�. */
select e.eno, e.ename, d.dname, d.dno --����Ű �÷��� ��Ī ��밡��
from department d join employee e -- join�� ���̺��� ����+��Ī ����
on d.dno = e.dno --On���� Join�� �÷��� ����
where e.eno=7788;-- where ���

/* NON EQUI Join : ���� ���ǿ� Ư�� ����, Ư�� ������ ����� �� */
select ename, salary, grade
from employee, salgrade
where salary between losal and hisal; --salary�� lo,hi �����϶� grade�� ����Ű�÷����� ����Ѵ�.

/* 3���� ���̺� join */
select e.ename, d.dname, e.salary, s.grade
from employee e, department d, salgrade s --3�� ���̺� Join
where e.dno = d.dno -- dno �÷��� ����Ű�÷����� ����
and salary between losal and hisal; -- 

/* Self Join + where : 1���� ���̺� ���� Į������ ���� */
--Oracle ���� ����ϴ� �������� Oracle������ ��� ����
select employees.ename as "����̸�", manager.ename as "���ӻ���̸�"
from employee employees, employee manager -- ���� ���̺��� 2���� ��Ī���� ������
where employees.manager = manager.eno; --where�� ���� employee�� manager�� eno�� ����(=) ����� Join

/* Self Join + On : 1���� ���̺� ���� Į������ ���� */
-- ANSI ȣȯ���� ��� DBMS���� ��밡����
select employees.ename || ' �� ���ӻ���� ' || manager.ename --ename�� String���� ��� �����
from employee employees join employee manager -- ���� ���̺��� 2���� ��Ī���� ������
on employees.manager = manager.eno; --On�� ���� employee�� manager�� eno�� ����(=) ����� Join

/* Outer Join : �� �÷��� �� �ϳ��� Null������ ����� �ʿ䰡 ���� ��� ���(EQUI���� Null�� ��� ���X)*/
--Oracle ���� ����ϴ� �������� Oracle������ ��� ����
select employees.ename || ' �� ���ӻ���� ' || manager.ename
from employee employees join employee manager -- ���� ���̺��� 2���� ��Ī���� ������
on employees.manager = manager.eno(+); --On�� ���� manager, eno ����, eno�� Null�̶� ���(+)
--���� ��½� �ٷ� ���� ������ �޸� 1���� Null�� ���� ���� ��µȴ�.

/* Outer Join : �� �÷��� �� �ϳ��� Null������ ����� �ʿ䰡 ���� ��� ���(EQUI���� Null�� ��� ���X)*/
-- ANSI ȣȯ���� ��� DBMS���� ��밡���԰���
-- left, right, full 3���� �ɼ� ��� ����
select employees.ename || ' �� ���ӻ���� ' || manager.ename
from employee employees left outer join employee manager -- ���� ���̺��� 2���� ��Ī���� ������, manager�� Null�̶� ���
on employees.manager = manager.eno; --On�� ���� manager, eno ����

