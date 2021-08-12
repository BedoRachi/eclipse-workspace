/* FUNCTION��: �Լ��� ��� */
create or replace function fn_salary_ename( --�Լ��� ���
v_ename in employee.ename%type) --Input���ڰ� ����
    RETURN number -- Output ��ȯ�� ����
is
    v_salary number(7,2); --�Լ� ����
begin
    select salary into v_salary
    from employee
    where ename = v_ename;
    RETURN v_salary;
end;
/

/* �Լ� ����� ��������*/
variable v_salary number;
execute :v_salary := fn_salary_ename('SCOTT');

/* �Լ� ����� ��� */
print v_salary;

/*Ʈ���� : ���̺��� �����ϴ� �ڵ�ȭ�� �ڵ�
 -- ���̺� �̺�Ʈ(insert, update, delete) �߻��� Ʈ���ſ� ���ǵ� �ڵ�(begin ~ end)�� �����
 -- �̹�Ʈ �߻� �� ����Ǵ� Before Ʈ����(�̺�Ʈ �߻� -> ���̺� ���� -> Ʈ���� ����)
 -- �̺�Ʈ �߻� �� ����Ǵ� After Ʈ����(�̺�Ʈ �߻� -> Ʈ���� ���� -> ���̺� ����)
 -- �߿� ���̺� Ʈ���Ÿ� �����Ͽ� ���̺� �̺�Ʈ�� ����� �� ����
 */
create table dept_original
as
select * from department where 0=1;

create table dept_copy
as
select * from department where 0=1;

/* insert Ʈ���� ���� */ 
create or replace trigger trigger_sample1
    after insert 
    on dept_original
    for each row -- dept_originalsp instert �߻� �� Ʈ���� �۵��Ͽ� �� row�� ����
begin
    if inserting then --insert�� �߻��� ���
        dbms_output.put_line('Insert Trigger');
        insert into dept_copy
        values(:new.dno, :new.dname, :new.loc); 
-- insert�Ǵ� dept_original ���̺��� �� -> ���� ���̺�(new) -> dept_copy�� �߰���
    end if;
end;
/

insert into dept_original
values (10,'ACCOUNTING', 'NEW YORK');
insert into dept_original
values (20,'SALESMAN', 'SEOUL');

select * from dept_original;
select * from dept_copy;

update dept_original
set dname = 'SALESMAN'
where dno = 10;

 
/* Delete Ʈ���� ���� */
create or replace trigger trigger_sample2
    after delete
    on dept_original
    for each row
begin
    DBMS_OUTPUT.PUT_LINE('Delete Trigger');
    delete from dept_copy
        where dept_copy.dno = :old.dno;
        -- delete �Ǵ� dept_original ���̺��� �� -> ���� ���̺�(old) -> dept_copy�� ������
end;
/

delete dept_original where dno=10;

select * from dept_original;
select * from dept_copy;
