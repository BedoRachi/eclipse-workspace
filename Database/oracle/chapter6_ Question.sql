/*1. EQUI ������ ����Ͽ� SCOTT ����� �μ���ȣ�� �μ��̸��� ����Ͻÿ�*/
select e.ename, e.dno, d.dname
from employee e, department d
where e.dno = d.dno
and e.ename='SCOTT';

/*2. INNER Join�� On �����ڸ� ����Ͽ� ����̸��� �Բ� �� ����� �Ҽӵ� 
�μ��̸��� �������� ����Ͻÿ�*/
select ename, dname, loc
from employee e join department d
on e.dno = d.dno;

/*3. INNER join�� USING �����ڸ� ����Ͽ� 10�� �μ��� ���ϴ� ��� ��� ������
��������� �μ��� �������� �����Ͽ� ����Ͻÿ�*/
select dno, job, loc
from employee inner join department
using(dno)
where dno=10;

/*4. NATURAL Join�� ����Ͽ� Ŀ�̼��� �޴� ��� ����� �̸�, �μ��̸�, �������� ���*/
select ename, dname, loc
from employee natural join department
where commission >0;

/*5. EQUI���� �� WildCard�� ����Ͽ� �̸��� A�� ���Ե� ��� ����� �̸��� �μ����� ���*/
select e.ename, d.dname
from employee e, department d
where e.dno=d.dno
and e.ename like '%A%';

/*6. NATURAL Join�� ����Ͽ� NEW YORK�� �ٹ��ϴ� ��� ����� �̸�, ����, �μ���ȣ ��
�μ����� ��� */
select ename, job, dno, dname
from employee natural join department
where loc='NEW YORK';

/*7. SELF Join�� ����Ͽ� ����� �̸� �� �����ȣ�� ������ �̸� �� ������ ��ȣ�� �Բ�
����Ͻÿ�*/
select emp.ename as "Employee",
        emp.manager as "Emp#",
        mgr.eno as "Manager",
        mgr.ename as "Mgr#"
from employee emp, employee mgr
where emp.manager=mgr.eno;

/*8. OUTER Join, SELF Join�� ����Ͽ� �����ڰ� ���� ����� �����Ͽ� �����ȣ�� ��������
�������� �����Ͽ� ����Ͻÿ�*/
select emp.ename as "Employee",
        emp.manager as "Emp#",
        mgr.eno as "Manager",
        mgr.ename as "Mgr#"
from employee emp, employee mgr
where emp.manager=mgr.eno(+)
order by emp.eno desc;

/*9. SELF Join�� ����Ͽ� ������ ����� �̸�, �μ���ȣ, ������ ����� ������
�μ����� �ٹ��ϴ� ����� ����Ͻÿ�*/
select me.ename as �̸�, me.dno as �μ���ȣ, other.ename as ����
from employee me, employee other
where me.dno=other.dno
and me.ename='SCOTT'
and other.ename!='SCOTT';

/*10. SELF join�� ����Ͽ� WARD ������� �ʰ� �Ի��� ����� �̸��� �Ի����� ��� */
select other.ename, other.hiredate
from employee ward, employee other
where other.hiredate>ward.hiredate
and ward.ename='WARD'
order by hiredate;

/*11. SELF Join�� ����Ͽ� �����ں��� ���� �Ի��� ��� ����� �̸� �� �Ի����� �������� 
�̸� �� �Ի��ϰ� �Բ� ����Ͻÿ�.*/
select other.ename, other.hiredate, mgr.ename, mgr.hiredate
from employee mgr, employee other
where other.manager=mgr.eno
and other.hiredate<=mgr.hiredate;
