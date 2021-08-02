/*1. �����ȣ�� 7788�� ����� ��� ������ ���� ����� ǥ��*/
select ename, job
from employee
where job = (select job
                from employee
                where eno=7788);
                
/*2. �����ȣ�� 7499�� ������� �޿��� ���� ����� ǥ��*/
select ename, job
from employee
where salary > (select salary
                from employee
                where eno=7499);

/*3. �ּ� �޿��� �޴� ����� �̸�, ������, �޿��� ǥ��*/
select ename, job, salary
from employee
where salary = (select
                min(salary)
                from employee);
                
/*4. ��� �޿��� ���� ���� ����� ��� ������ ã�� ���ް� ��� �޿��� ǥ��*/
select job, round(avg(salary),1)
from employee
group by job
having round(avg(salary),1)=(select min(round(avg(salary),1))
                                from employee
                                group by job);
                                
/*5. �� �μ��� �ּ� �޿��� �޴� ����� �̸�, �޿�, �μ���ȣ�� ǥ��*/
select ename, salary, dno
from employee
where salary in(select min(salary)
                from employee
                group by dno);
                
/*6. ��� ������ �м���(ANALYST)�� ������� �޿��� �����鼭 ������ �м���(ANALYST)�� 
�ƴ� ������� ǥ��(�����ȣ, �̸�, ��� ����, �޿�)*/
select eno,ename,job,salary
from employee
where salary < any (select salary
                    from employee
                    where job='ANALYST')
and job<>'ANALYST';

/*7. ���������� ���� ����� �̸��� ǥ��*/
select ename
from employee
where eno in(select eno
                from employee
                where manager is null);

/*8. ���������� �ִ� ����� �̸��� ǥ��*/
select ename
from employee
where eno in(select eno
                from employee
                where manager is null);

/*9. BLAKE�� ������ �μ��� ���� ����� �̸��� �Ի����� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�*/
select ename, hiredate
from employee
where dno = (select dno
                from employee
                where ename='BLAKE')
and ename <> 'BLAKE';

/*10. �޿��� ��� �޿����� ���� ������� �����ȣ�� �̸��� ǥ���ϵ� ����� �޿��� ���Ͽ� 
������������ ����*/
select eno, ename
from employee
where salary > (select avg(salary)
                from employee)
                order by salary asc;
                
/*11. �̸��� K�� ���Ե� ����� ���� �μ����� ���ϴ� ����� �����ȣ�� �̸��� ǥ���ϴ�
���Ǹ� �ۼ�*/
select eno, ename
from employee
where dno in(select dno
                from employee
                where ename like '%K%');
                
/*12. �μ� ��ġ�� DALLAS�� ����� �̸��� �μ���ȣ �� ��� ������ ǥ��*/
select ename, dno, job
from employee
where dno = (select dno
                from department
                where loc='DALLAS');

/*13. KING���� �����ϴ� ����� �̸��� �޿��� ǥ��*/
select ename, salary
from employee
where manager = (select eno
                    from employee
                    where ename='KING');

/*14. RESEARCH �μ��� ����� ���� �μ���ȣ, ����̸� �� ��� ������ ǥ��*/
select dno, ename, job
from employee
where dno = (select dno
                from department
                where dname = 'RESEARCH');
                
/*15. ��� �޿����� ���� �޿��� �ް� �̸��� M�� ���Ե� ����� ���� �μ��� �ٹ��ϴ�
����� �����ȣ, �̸�, �޿��� ǥ��*/
select eno, ename, salary
from employee
where salary > (select avg(salary)
                from employee)
and dno in(select dno
            from employee
            where ename like '%M%');
            
/*16. ��� �޿��� ���� ���� ������ ã���ÿ�*/
select job, avg(salary)
from employee
group by job
having avg(salary) = (select min(avg(salary))
                        from employee
                        group by job);

/*17. ��� ������ MANAGER�� ����� �Ҽӵ� �μ��� ������ �μ��� ����� ǥ��*/
select ename
from employee
where eno in(select manager
                from employee);

