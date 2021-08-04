/*1번, 20번 부서에 소속된 사원의 사원번호와 이름, 부서번호를 출력하는 view */
create view v_em_dno
as
select eno, ename, dno
from emp_second
where dno=20;

/*2번, 급여를 출력 */
create or replace view v_em_dno
as
select eno, ename, dno,salary
from emp_second
where dno=20;

/*3번, view 삭제 */
drop view v_em_dno;