/* Chapter.7 */
/*��������: �������� ����ϱ� ���� �ٸ� ������ ���� �ʿ��� ��� ��� */
select ename, dno
from employee
where dno = (select dno --=> dno = SCOTT => dno = 20
                from employee
                where ename='SCOTT');

select ename, job, salary
from employee
where salary = (select min(salary)--=> salary = min(salary) => salary = 800
                from employee);
                
select dno, min(salary)
from employee
group by dno
having min(salary) > (select min(salary)--=> dno�� 30�� salary�߿��� �ּҰ����� ū ���� �ּ�
                        from employee
                        where dno=30);
                        
/* ���� �� ���� ���� IN ������: �������� ���������� ���Ͽ� �ϳ��� ��ġ�� ��� ��*/
select eno, ename
from employee
where salary in (select min(salary) -- dno�� �ּ�salary�� ������ ���� eno, enmame�� ���
                    from employee
                    group by dno);

/* ���� �� ���� ���� ANY ������: �������� ���������� ���Ͽ� ũ�ų� ������ ���� ������*/                    
select eno, ename, job, salary
from employee
where salary < any ( select salary -- <ANY �̹Ƿ� �ִ밪 ���� ���� / >ANY �� ��� �ּҰ� ���� ŭ(OR����)
                    from employee  --job�� SALESMAN�� �÷��� salary ���� ���� salary�� eno, ename, job�� ����Ѵ�.
                    where job='SALESMAN')
and job <> 'SALESMAN'; --�� job�� SALESMAN�� �ƴ� �����

/* ���� �� ���� ���� ALL ������: �������� ���������� ���Ͽ� �ϳ��� ��ġ�� ��� ��*/
select eno, ename, job, salary
from employee
where salary < all ( select salary -- <ALL �̹Ƿ� �ִ밪 ���� ŭ / >ANY �� ��� �ּҰ� ���� ����(AND����)
                    from employee  --job�� SALESMAN�� �÷��� salary ���� ���� salary�� eno, ename, job�� ����Ѵ�.
                    where job='SALESMAN')
and job <> 'SALESMAN';