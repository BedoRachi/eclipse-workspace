select dno, eno, ename
from employee
where eno = 7788;

/* 카사디안 곱 */
select * from department, employee;

/* 카사디안 곱: 한 테이블에서 다른 테이블의 값까지 출력 */
/* department(4) * employment(14) = 54 */
select * -- 전부 출력
from department, employee -- department, employee을 곱함
order by department.dno asc, ename asc;  -- department의 dno, ename 기준 오름차순

/* Join */
select *
from department, employee
where department.dno = employee.dno
-- 두 테이블의 공통 컬럼 dno(Key 컬럼)을 연결(공통된 값을 연결점으로 사용)
and employee.eno =7788; -- employee의 eno의 값이 7788인 값만 출력

select eno, ename, dname, department.dno
from department, employee
where department.dno = employee.dno
-- 두 테이블의 공통 컬럼 dno(Key 컬럼)을 연결(공통된 값을 연결점으로 사용)
and employee.eno =7788; -- employee의 eno의 값이 7788인 값만 출력

/* 테이블에 별칭 */
select e.eno, e.ename, d.dname, d.dno --별칭 적용
from department d, employee e -- 테이블명의 별칭을 지정(선언)
where d.dno = e.dno--별칭 적용
and e.eno=7788;--별칭 적용

/* NATURAL JOIN : Join과 달리 Where 삭제, 공통키 자동적용, 공통키 별칭 사용불가, 공통키 데이터 타입이 동일*/
select eno, ename, dname, dno --공통키인 dno 컬럼은 별칭 적용 불가
from employee e natural join department d --별칭적용 및 natural join
where e.eno = 7788; --공통키 이외엔 별칭적용 가능

/* USING : 데이터 타입이 서로 다른 경우 USING을 통해 Join */
select e.eno, e.ename, d.dname, dno --Natural Join처럼 공통키 컬럼에 별칭 사용불가
from employee e join department d -- join할 테이블을 지정+별칭 지정
using (dno) -- join할 컬럼(공통 컬럼)을 지정
where e.eno=7788;

/* ON : EQUI Join에서 Where 대신 On 사용이 가능하다. */
select e.eno, e.ename, d.dname, d.dno --공통키 컬럼에 별칭 사용가능
from department d join employee e -- join할 테이블을 지정+별칭 지정
on d.dno = e.dno --On으로 Join할 컬럼을 지정
where e.eno=7788;-- where 사용

/* NON EQUI Join : 조인 조건에 특정 범위, 특정 조건을 사용할 때 */
select ename, salary, grade
from employee, salgrade
where salary between losal and hisal; --salary가 lo,hi 사이일때 grade를 공통키컬럼으로 사용한다.

/* 3개의 테이블 join */
select e.ename, d.dname, e.salary, s.grade
from employee e, department d, salgrade s --3개 테이블 Join
where e.dno = d.dno -- dno 컬럼을 공통키컬럼으로 지정
and salary between losal and hisal; -- 

/* Self Join + where : 1개의 테이블 내에 칼럼끼리 연결 */
--Oracle 에서 사용하는 문법으로 Oracle에서만 사용 가능
select employees.ename as "사원이름", manager.ename as "직속상관이름"
from employee employees, employee manager -- 같은 테이블을 2개의 별칭으로 지정함
where employees.manager = manager.eno; --where를 통한 employee의 manager와 eno가 같은(=) 대상을 Join

/* Self Join + On : 1개의 테이블 내에 칼럼끼리 연결 */
-- ANSI 호환으로 모든 DBMS에서 사용가능함
select employees.ename || ' 의 직속상관은 ' || manager.ename --ename을 String으루 묶어서 출력함
from employee employees join employee manager -- 같은 테이블을 2개의 별칭으로 지정함
on employees.manager = manager.eno; --On를 통한 employee의 manager와 eno가 같은(=) 대상을 Join

/* Outer Join : 양 컬럼의 중 하나가 Null이지만 출력할 필요가 있을 경우 사용(EQUI에선 Null일 경우 출력X)*/
--Oracle 에서 사용하는 문법으로 Oracle에서만 사용 가능
select employees.ename || ' 의 직속상관은 ' || manager.ename
from employee employees join employee manager -- 같은 테이블을 2개의 별칭으로 지정함
on employees.manager = manager.eno(+); --On를 통한 manager, eno 조인, eno가 Null이라도 출력(+)
--실제 출력시 바로 위의 예제와 달리 1개의 Null을 가진 값이 출력된다.

/* Outer Join : 양 컬럼의 중 하나가 Null이지만 출력할 필요가 있을 경우 사용(EQUI에선 Null일 경우 출력X)*/
-- ANSI 호환으로 모든 DBMS에서 사용가능함가능
-- left, right, full 3개의 옵션 사용 가능
select employees.ename || ' 의 직속상관은 ' || manager.ename
from employee employees left outer join employee manager -- 각은 테이블을 2개의 별칭으로 지정함, manager가 Null이라도 출력
on employees.manager = manager.eno; --On를 통한 manager, eno 조인

