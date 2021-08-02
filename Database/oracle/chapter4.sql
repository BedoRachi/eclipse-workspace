/* NULLIF �Լ� */
select NULLIF('A', 'A'), --���� ���� �����Ƿ� Null ��ȯ
    NULLIF('A', 'B') -- ���� ���� �ٸ����� 1�� ���� ��ȯ
from dual;

/* COALESCE �Լ� */
select ename, salary, commission,
    COALESCE(commission, salary,0) --�����߿��� Null �ƴ� ���ڸ� ��ȯ(->������ Ȯ��)
from employee order by job;


/* DECODE �Լ� */
select ename, dno,
    DECODE(dno, 10, 'ACCOUNTING', -- dno�� 10�϶�
                20, 'RESERCH', -- dno�� 20�϶�
                30, 'SALES', -- dno�� 30�϶�
                40, 'OPERATIONS', -- dno�� 40�϶�
                'DEFAULT') AS dname  -- ���� �ƴҶ�
from employee order by dno asc; 

/* CASE �Լ� */
select ename, dno,
    CASE when dno=10 then 'ACCOUNTING' -- dno�� 10�� ��
        when dno=20 then 'RESEARCH' -- dno�� 20�� ��
        when dno=30 then 'SALES' -- dno�� 30�� ��
        when dno=40 then 'OPERATION' -- dno�� 40�� ��
        ELSE 'defalut' -- ���� �ƴҶ�
    END as dname --����� �÷��� ��Ī�� dname����
from employee order by dno asc;

/* �����Լ� */
select SUM (salary),
        round(AVG(salary),3),
        MAX(salary),
        MIN(salary)
from employee;

select sum(commission),
        avg(commission),
        max(commission),
        min(commission)
from employee;


/* Count �Լ� */
select count (*) as �ѻ���� from employee; --employeee���� ��� ����
select count (ename) from employee; -- employee���� enmae�� ����
select count (commission) from employee; -- employee���� commission�� ����(null X)
select commission from employee where commission is not null;
-- employee���� commission ��� (null X)

/* Group by �Լ� */
select dno, avg(salary) from employee group by dno; -- dno�÷��� ���� ��(����)���� �׷�ȭ�Ͽ� salary�� ���
select dno, avg(salary),sum(salary), min(salary), max(salary)
from employee group by dno; -- dno�÷��� ���� ��(����)���� �׷�ȭ�Ͽ� �� ������ ������


/* �����÷� �׷�ȭ */
select dno, job, count(*), sum(salary)  --dno, job �÷��� ī��Ʈ �ϰ� salary �÷��� �ջ���
from employee
group by dno, job --dno, job �÷��� �׷�ȭ
order by dno, job; --dno, job �÷��� ����

/* ���� �Լ� */

select dno, salary from employee;
select dno,max(salary)
from employee
group by dno
having max(salary) >=3000;

/* 154p ~ 155p�������� */
--01��
select max(salary) as "Maximum", -- salary max
        min(salary) as "Minimum", --salary min
        sum(salary) as "Sum", --salary total sum
        round(avg(salary)) as "Average" --salary average + round
from employee; -- for employee

--02��
select job as "job",
        max(salary) as "MAX",
        min(salary)as "MIN",
        sum(salary)as "SUM",
        round(avg(salary))as "AVG"
from employee
group by job;

--03��
select job as "job",
        COUNT(*)
from employee
group by job;

--04��
select count(manager)
from employee;

--05��
select max(salary) - min(salary) as "Diffrent"
from employee;

--06��
select job, min(salary) --job+salary�ּ� ���
from employee
group by job --job ���� �׷�ȭ
having not MIN(salary)<2000 -- salary 2000�̸� ����
order by min(salary) desc; -- salary ���� ��������

--07��
select dno,
    count(*) as "N o P",
    round(avg(salary), 2) as "salary"
from employee
group by dno
order by dno asc;

--08��
select decode(dno, 10,'ACCOUNTING',
                    20,'REAEARCH',
                    30,'SALES',
                    40,'OPERATION') as "dname",
        decode(dno, 10,'NEW YORK',
                    20,'DALLAS',
                    30,'CHICAGO',
                    40,'BOSTON') as "Location",
        count(*) as "N o P",
        round(avg(salary)) as "Salary"
from employee
group by dno;
        
--09��
select job, dno,
        decode(dno, 10,sum(salary)) as "�μ�10",
        decode(dno, 20,sum(salary)) as "�μ�20",
        decode(dno, 30,sum(salary)) as "�μ�30",
        sum(salary) as "�Ѿ�"
from employee
group by job,dno
order by dno;