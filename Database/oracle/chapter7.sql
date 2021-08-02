/* Chapter.7 */
/*서브쿼리: 주쿼리를 계산하기 위해 다른 쿼리의 값이 필요할 경우 사용 */
select ename, dno
from employee
where dno = (select dno --=> dno = SCOTT => dno = 20
                from employee
                where ename='SCOTT');

select ename, job, salary
from employee
where salary = (select min(salary)--=> salary = min(salary) => salary = 800
                from employee);
                
select dno, min(salary)
from employee
group by dno
having min(salary) > (select min(salary)--=> dno가 30인 salary중에서 최소값보다 큰 값중 최소
                        from employee
                        where dno=30);
                        
/* 다중 행 서브 쿼리 IN 연산자: 주쿼리와 보조쿼리를 비교하여 하나라도 일치할 경우 참*/
select eno, ename
from employee
where salary in (select min(salary) -- dno별 최소salary와 동일한 값의 eno, enmame을 출력
                    from employee
                    group by dno);

/* 다중 행 서브 쿼리 ANY 연산자: 주쿼리와 보조쿼리를 비교하여 크거나 작음에 따라 참거짓*/                    
select eno, ename, job, salary
from employee
where salary < any ( select salary -- <ANY 이므로 최대값 보다 작음 / >ANY 일 경우 최소값 보다 큼(OR연산)
                    from employee  --job이 SALESMAN인 컬럼의 salary 보다 작은 salary의 eno, ename, job을 출력한다.
                    where job='SALESMAN')
and job <> 'SALESMAN'; --단 job이 SALESMAN이 아닌 사람만

/* 다중 행 서브 쿼리 ALL 연산자: 주쿼리와 보조쿼리를 비교하여 하나라도 일치할 경우 참*/
select eno, ename, job, salary
from employee
where salary < all ( select salary -- <ALL 이므로 최대값 보다 큼 / >ANY 일 경우 최소값 보다 작음(AND연산)
                    from employee  --job이 SALESMAN인 컬럼의 salary 보다 작은 salary의 eno, ename, job을 출력한다.
                    where job='SALESMAN')
and job <> 'SALESMAN';