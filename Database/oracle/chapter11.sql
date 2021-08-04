 /* view */
-- 가상의 테이블로 서브쿼리에서 테이블을 호출하는 것처럼 사전에 가상의 테이블을 정의하는 것(일종의 함수 or Object)
-- 실제 Table은 아니고 코드의 집합으로 view를 호출 시 코드의 집합이 실행되는 구조
-- 보안을 위해 사용, 전체 테이블에서 특정 컬럼만 출력
-- 복잡한 쿼리를 저장후 사용(편의성)

/* view 실행 과정 
    1. USER_VIEWS 데이터 사전에서 뷰에 대한 쿼리를 조회
    2. 접속한 계정이 테이블에 접속할 수 있는지 권한 확인
    3. 기본 쿼리를 실행
    4. 검색(view는 값을 가지고 있지 않기 때문에 테이블에서 값을 가져옴)
    5. 결과 출력

 /* view 뷰 정의 */
 create view v_emp_job(사번, 사원이름, 부서번호, 담당업무)
 as
 select eno, ename, dno, job
 from emp_second
 where job like 'SALESMAN';

/* view 뷰 정의(컬럼명 생략) */
create view v_emp_job2
 as
 select eno, ename, dno, job
 from emp_second
 where job like 'SALESMAN';
 
 /* view 뷰 출력하기 */
 select * from v_emp_job;
  select * from v_emp_job2;
  
 /* view 뷰 정의 코드 출력 */
 select view_name,text from user_views
 where view_name = 'V_EMP_JOB';
 
-- 단순뷰(Simple view) : 하나의 테이블로 생성된 view
-- 복합뷰(Complex view) : 두개 이상의 테이블로 생성된 view
    -- 뷰내에서 DISTINC, 그룹함수, Group by, Rownum을 사용할 수 없다.
    
/* 복합 뷰 정의(두 테이블을 합쳐서 출력) */
create view v_emp_complex
as
select *
from emp_second natural join dept_second; -- emp, dept를 join하여 복합 뷰 생성

select * from v_emp_complex;

/*단순 뷰 정의(필요한 컬럼만 출력)*/
create view v_emp_sample
as
select eno, ename, job, manager, dno --필요한 컬럼만 가져와서 view를 만듬
from emp_second;

/* 복합 뷰 정의(JOIN용 view) */
create view v_emp_complex2
as
select e.eno, e.ename, e.salary, dno, d.dname, d.loc
from emp_second e natural join dept_second d;

/* view 삽입(insert)(단 그룹함수 적용시 insert 불가) */
-- view에 값이 저장되지는 않고 실제 Table에 저장됨
-- 단, 실제 Table에 제약조건에 따라 저장되지 않을 수 있다.
insert into v_emp_job
values(9000,'윤정화',30,'SALESMAN'); --view대신 실제 Table에 저장됨

select * from v_emp_job;  --view 호출시 저장됨을 확인

select view_name,text from user_views
where view_name = 'V_EMP_JOB'; --실제 Table 확인

select * from emp_second; -- 실제 Table 호출시 저장됨을 확인

/* view + 그룹 함수, 별칭을 사용해야함 */
create view v_emp_salary
as
select dno, sum(salary) as "sal_sum", avg(salary) as "sal_avg" --별칭을 반드시 사용해야함
from emp_second
group by dno;

/* view 제거하기 */
drop view v_emp_job2;

/* CREATE OR REPLACE : view를 생성시 없을 경우 신규생성, 존재할 경우 덮어쓰기 */
create or replace view v_emp_job2
as
select eno, ename, job
from emp_second
where job like 'MANAGER';

/* force/noforce : 테이블 상관없이 생성 / 테이블이 있을 때만 생성(defualt) */
create force view v_emp_notable --force옵션을 통해 강제생성
as
select eno, ename, job
from emp_notable --없는 테이블
where job like 'MANAGER';

/* with check : where를 통해 특정 값을 가져올경우 확인해서 insert or update 참조함 */
create or replace view v_emp_job_nochk
as
select eno, ename, dno, job
from emp_second
where job like 'MANAGER' with check option; --insert or update시 job을 확인하여 MANAGER일 경우만 허용함

select * from v_emp_job_nochk;

insert into v_emp_job_nochk
values (9001, '김주현', 30,'SALESMAN');--MANAGER가 아니기 때문에 입력 실패

/* with Read Only : 읽기만 사용(insert/update/delete 사용불가) */
create or replace view v_emp_job_readonly
as
select eno, ename, dno, job
from emp_second
where job like 'MANAGER' with read only; --수정을 허용하지 않음

select * from v_emp_job_readonly; --read는 가능

insert into v_emp_job_readonly
values (9005, '김주현', 30,'SALESMAN');--read only 때문에 입력 실패