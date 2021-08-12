/* FUNCTION문: 함수문 사용 */
create or replace function fn_salary_ename( --함수문 사용
v_ename in employee.ename%type) --Input인자값 정의
    RETURN number -- Output 반환값 지정
is
    v_salary number(7,2); --함수 변수
begin
    select salary into v_salary
    from employee
    where ename = v_ename;
    RETURN v_salary;
end;
/

/* 함수 결과값 가져오기*/
variable v_salary number;
execute :v_salary := fn_salary_ename('SCOTT');

/* 함수 결과값 출력 */
print v_salary;

/*트리거 : 테이블에서 진행하는 자동화된 코드
 -- 테이블 이벤트(insert, update, delete) 발생시 트리거에 정의된 코드(begin ~ end)가 실행됨
 -- 이번트 발생 전 실행되는 Before 트리거(이벤트 발생 -> 테이블에 적용 -> 트리거 실행)
 -- 이벤트 발생 후 실행되는 After 트리거(이벤트 발생 -> 트리거 실행 -> 테이블 적용)
 -- 중요 테이블에 트리거를 구성하여 테이블 이벤트를 기록할 수 있음
 */
create table dept_original
as
select * from department where 0=1;

create table dept_copy
as
select * from department where 0=1;

/* insert 트리거 생성 */ 
create or replace trigger trigger_sample1
    after insert 
    on dept_original
    for each row -- dept_originalsp instert 발생 시 트리거 작동하여 각 row에 적용
begin
    if inserting then --insert가 발생할 경우
        dbms_output.put_line('Insert Trigger');
        insert into dept_copy
        values(:new.dno, :new.dname, :new.loc); 
-- insert되는 dept_original 테이블의 값 -> 가상 테이블(new) -> dept_copy에 추가함
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

 
/* Delete 트리거 생성 */
create or replace trigger trigger_sample2
    after delete
    on dept_original
    for each row
begin
    DBMS_OUTPUT.PUT_LINE('Delete Trigger');
    delete from dept_copy
        where dept_copy.dno = :old.dno;
        -- delete 되는 dept_original 테이블의 값 -> 가상 테이블(old) -> dept_copy에 삭제함
end;
/

delete dept_original where dno=10;

select * from dept_original;
select * from dept_copy;
