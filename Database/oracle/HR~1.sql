desc department;
select * from department;

desc employee;/*Ư�� ���̺��� ���� ����*/
select * from employee;/*Ư�� ���̺��� ��� �÷��� ��� */

select eno,ename,eno from employee;/*Ư�� �÷��� ����ϱ� */

DESCRIBE employee; /* = desc employee; */

/* SQL������ ��Ģ���� */
select salary from employee; 
select salary, salary + 300, salary - 300,salary * 300,salary / 300  from employee;

/* ename, salary��� +  salary*12 �Ͽ� ����(�÷��� ��Ī�� ����)�� ��� *
select ename, salary, commission from employee;
select ename, salary as ����, salary*12 as ���� from employee;

/* commission�� null�� �����Ƿ� �������� ���� ������ �ʴ´�. *
select ename, salary, salary*12 + commission from employee;

/* nvl(�÷���, ��) => Ư�� �÷��� Null�� ������ ��ü ��*/
select ename, salary, salary*12 + nvl(commission, 0)  from employee;

/* �÷��� �ߺ�����, distinct �÷��� */
select dno from employee;
select distinct dno from employee;

/* �÷� ���� ���, dual */
select sysdate from department;
select sysdate from dual;

/* employee ��� �÷��� salary �÷��� 1500�̻� ��� */
select * from employee where salary >= 1500;
select * from employee where dno = 10;

select eno �����ȣ, ename ����̸�, salary ���� from employee where salary >=1500;

/*���ڿ� �˻� */
select * from employee where ename = 'KING';

/* ��¥ ������ ��, �������� */
select * from employee where hiredate <= '1981/1/1';

/* �� ������ ����ϱ� */
select * from employee where dno =10 and job = 'MANAGER';
select * from employee where job = 'MANAGER';
select * from employee where salary >=1000 and salary <=1500;
select * from employee where commission <> 300; /* not */

/* �� ������ between A and B = A~B ���� */
select * from employee where salary not between 1000 and 1500;

/* IN �����ڸ� ����� �˻�, ������ �˻� */
select * from employee where commission in (300, 500, 1400);


/* ���ϵ� ī�带 ���� �˻�, like % (* ����)  , _ (�� ���ڸ�)  */
select * from employee where ename like '%A%';

select * from employee where ename not like '%A%';


select * from employee where ename like 'M_RT_N';

