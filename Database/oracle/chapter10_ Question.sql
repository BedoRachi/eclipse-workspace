/*1��, employee���̺� ������ ����->EMP_SAMPLE
        �����ȣ(eno)�� ���̺� ���� Primary key �����ϸ�
        �������� �̸��� my_emp_pk */
create table emp_sample
as
select * from employee where 1=0; --employee���̺� ������ ����->EMP_SAMPLE

alter table emp_sample
add constraint my_emp_pk primary key(eno); 
--�����ȣ�� ���̺� ���� Primary key �����ϸ� �������� �̸��� my_emp_pk

/*2��, department���̺� ������ ����->DEPT_SAMPLE
        �����ȣ(dno)�� ���̺� ���� Primary key �����ϸ�
        �������� �̸��� my_dept_pk */
create table dept_sample
as
select * from department where 1=0; --department���̺� ������ ����->DEPT_SAMPLE

alter table dept_sample
add constraint my_dept_pk primary key(dno);
--�����ȣ(dno)�� ���̺� ���� Primary key �����ϸ� �������� �̸��� my_dept_pk

/*3��, �μ���ȣ�� ���� ����� �������� �ʵ��� �ַ� Ű �������� ����, �̸��� my_emp_dept_fk */
alter table emp_sample
add constraint my_emp_dept_fk
foreign key(dno) references department(dno);

/*4�� Ŀ�̼� �÷��� 0���� ū���� ������ �������� ���� */
alter table emp_sample
add constraint emp_commission_min check (commission >0);

