/* 9�� :DML : ���̺� ���ڵ带 �����ϴ� ���, Ʈ����� �߻�
       INSERT : ������(���ڵ�) �߰�
       UPDATE : ������(���ڵ�) ����
       DELETE : ������(���ڵ�) ����
       SELECT : ������(���ڵ�) �˻�
*/

/* INSERT */
create table dept_copy
as
select * from department where 0=1; --�� ���� ���̺� ������ ����
desc dept_copy;

create table emp_copy
as
select eno, ename, job, hiredate, dno from employee where 0=1;--�� ���� ���̺� ������ ����
commit;

rollback;

/*�÷����� ����� INSERT */
insert into dept_copy (dno, loc, dname) --dept_copy���̺��� ���� �Է��� �÷��� ���
values(20, 'DALLAS','REASEARCH'); --���� �� �÷��� ���������� �Է��Ѵ�.

/*�÷����� ������ INSERT */
insert into dept_copy --dept_copy���̺��� ���� �Է��� �÷��� ����
values(21, 'DALLAS','REASEARCH'); --���� �� �÷��� ���������� �Է��Ѵ�.

/* ����� NULL �Է� */
insert into dept_copy(dno, dname,loc) -- �÷����� ���� ����
values(30,'SALES', NULL); --loc �÷��� NULL �Էµ�

/* �Ͻ���  NULL �Է� */
insert into dept_copy(dno, dname) -- loc�÷��� ����
values(30,'SALES'); --loc �÷��� NULL �Էµ�

/* ���鹮�� �Է� */
insert into dept_copy -- �÷��� ������
values(50,'COMPUTING', ''); -- ���鰪 �Է�

/*��¥ �Է� */
insert into emp_copy
values(7000, 'CANDY','MANAGER', '2012/05/01', 10);

/* TO_DATE(���ڸ� ��¥�� ��ȯ) �Է�*/
insert into emp_copy
values(7010, 'TOM','MANAGER',TO_DATE('2012.05,01','YYYY,MM,DD'), 20);

/* SYSDATE(���ó�¥) �Է� */
insert into emp_copy
values(7020,'JERRY','SALESMAN',SYSDATE,30);

/* UPDATE */
/* ���̺� �� ���� */
insert into dept_copy
select * from department; -- department�� ���� ������

/* Ư�� ��(��)�� ���� */
update dept_copy
set dname='PROGRAMMING'
where dno=10; --dno�� 10�� ���� dname�� PROGRAMMING���� �����Ѵ�.

/* Ư�� �÷� ��ü ����(where ����) */
update dept_copy
set dname='HR'; --dept_copy�� ��� dname�� HR�� ����

/* ���� ��(�÷�)�� ���� */
update dept_copy
set dname='PROGRAMMING', loc='SEOUL'
where dno=10; --dno�� 10�� ���� dname, loc�� ����

/* ���������� ���� �� ���� */
update dept_copy
set loc=(select loc
        from dept_copy
        where dno=20)
where dno=10; --dno�� 10�� ���� loc�� dno�� 20���� loc�� ����

select * from emp_copy;
/* DELETE */
/* Ư�� ������ �����͸� ���� */
delete dept_copy
where dno=10;

/*��� ������ ����*/
delete dept_copy;

create table emp_copy
as
select * from employee;

/*���������� �̿��� ������ ���� */
delete emp_copy
where dno=(select dno
            from department
            where dname='SALES'); --SALES dname�� ���� dno��(30)�� emp_copy���� ����
            
/* TRANSACTION */
