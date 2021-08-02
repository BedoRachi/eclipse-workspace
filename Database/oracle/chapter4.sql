/* NULLIF 함수 */
select NULLIF('A', 'A'), --인자 값이 같음므로 Null 반환
    NULLIF('A', 'B') -- 인자 값이 다름으로 1번 인자 반환
from dual;

/* COALESCE 함수 */
select ename, salary, commission,
    COALESCE(commission, salary,0) --인자중에서 Null 아닌 인자를 반환(->순으로 확인)
from employee order by job;


/* DECODE 함수 */
select ename, dno,
    DECODE(dno, 10, 'ACCOUNTING', -- dno가 10일때
                20, 'RESERCH', -- dno가 20일때
                30, 'SALES', -- dno가 30일때
                40, 'OPERATIONS', -- dno가 40일때
                'DEFAULT') AS dname  -- 전부 아닐때
from employee order by dno asc; 

/* CASE 함수 */
select ename, dno,
    CASE when dno=10 then 'ACCOUNTING' -- dno가 10일 때
        when dno=20 then 'RESEARCH' -- dno가 20일 때
        when dno=30 then 'SALES' -- dno가 30일 때
        when dno=40 then 'OPERATION' -- dno가 40일 때
        ELSE 'defalut' -- 전부 아닐때
    END as dname --결과값 컬럼의 별칭을 dname으로
from employee order by dno asc;

/* 연산함수 */
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


/* Count 함수 */
select count (*) as 총사원수 from employee; --employeee에서 모든 갯수
select count (ename) from employee; -- employee에서 enmae의 갯수
select count (commission) from employee; -- employee에서 commission의 갯수(null X)
select commission from employee where commission is not null;
-- employee에서 commission 출력 (null X)

/* Group by 함수 */
select dno, avg(salary) from employee group by dno; -- dno컬럼의 같은 값(기준)들을 그룹화하여 salary의 평균
select dno, avg(salary),sum(salary), min(salary), max(salary)
from employee group by dno; -- dno컬럼의 같은 값(기준)들을 그룹화하여 각 값들을 연산함


/* 다중컬럼 그룹화 */
select dno, job, count(*), sum(salary)  --dno, job 컬럼을 카운트 하고 salary 컬럼을 합산함
from employee
group by dno, job --dno, job 컬럼을 그룹화
order by dno, job; --dno, job 컬럼을 정렬

/* 집계 함수 */

select dno, salary from employee;
select dno,max(salary)
from employee
group by dno
having max(salary) >=3000;

/* 154p ~ 155p연습문제 */
--01번
select max(salary) as "Maximum", -- salary max
        min(salary) as "Minimum", --salary min
        sum(salary) as "Sum", --salary total sum
        round(avg(salary)) as "Average" --salary average + round
from employee; -- for employee

--02번
select job as "job",
        max(salary) as "MAX",
        min(salary)as "MIN",
        sum(salary)as "SUM",
        round(avg(salary))as "AVG"
from employee
group by job;

--03번
select job as "job",
        COUNT(*)
from employee
group by job;

--04번
select count(manager)
from employee;

--05번
select max(salary) - min(salary) as "Diffrent"
from employee;

--06번
select job, min(salary) --job+salary최소 출력
from employee
group by job --job 기준 그룹화
having not MIN(salary)<2000 -- salary 2000미만 제외
order by min(salary) desc; -- salary 기준 내림차순

--07번
select dno,
    count(*) as "N o P",
    round(avg(salary), 2) as "salary"
from employee
group by dno
order by dno asc;

--08번
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
        
--09번
select job, dno,
        decode(dno, 10,sum(salary)) as "부서10",
        decode(dno, 20,sum(salary)) as "부서20",
        decode(dno, 30,sum(salary)) as "부서30",
        sum(salary) as "총액"
from employee
group by job,dno
order by dno;