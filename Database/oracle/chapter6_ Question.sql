/*1. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서이름을 출력하시오*/
select e.ename, e.dno, d.dname
from employee e, department d
where e.dno = d.dno
and e.ename='SCOTT';

/*2. INNER Join과 On 연산자를 사용하여 사원이름과 함께 그 사원이 소속된 
부서이름과 지역명을 출력하시오*/
select ename, dname, loc
from employee e join department d
on e.dno = d.dno;

/*3. INNER join과 USING 연산자를 사용하여 10번 부서에 속하는 모든 담당 업무의
고유목록을 부서의 지역명을 포함하여 출력하시오*/
select dno, job, loc
from employee inner join department
using(dno)
where dno=10;

/*4. NATURAL Join을 사용하여 커미션을 받는 모든 사원의 이름, 부서이름, 지역명을 출력*/
select ename, dname, loc
from employee natural join department
where commission >0;

/*5. EQUI조인 과 WildCard를 사용하여 이름에 A가 포함된 모든 사원의 이름과 부서명을 출력*/
select e.ename, d.dname
from employee e, department d
where e.dno=d.dno
and e.ename like '%A%';

/*6. NATURAL Join을 사용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및
부서명을 출력 */
select ename, job, dno, dname
from employee natural join department
where loc='NEW YORK';

/*7. SELF Join을 사용하여 사원의 이름 및 사원번호를 관리자 이름 및 관리자 번호와 함꼐
출력하시오*/
select emp.ename as "Employee",
        emp.manager as "Emp#",
        mgr.eno as "Manager",
        mgr.ename as "Mgr#"
from employee emp, employee mgr
where emp.manager=mgr.eno;

/*8. OUTER Join, SELF Join을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로
내림차순 정렬하여 출력하시오*/
select emp.ename as "Employee",
        emp.manager as "Emp#",
        mgr.eno as "Manager",
        mgr.ename as "Mgr#"
from employee emp, employee mgr
where emp.manager=mgr.eno(+)
order by emp.eno desc;

/*9. SELF Join을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한
부서에서 근무하는 사원을 출력하시오*/
select me.ename as 이름, me.dno as 부서번호, other.ename as 동료
from employee me, employee other
where me.dno=other.dno
and me.ename='SCOTT'
and other.ename!='SCOTT';

/*10. SELF join을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력 */
select other.ename, other.hiredate
from employee ward, employee other
where other.hiredate>ward.hiredate
and ward.ename='WARD'
order by hiredate;

/*11. SELF Join을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 
이름 및 입사일과 함께 출력하시오.*/
select other.ename, other.hiredate, mgr.ename, mgr.hiredate
from employee mgr, employee other
where other.manager=mgr.eno
and other.hiredate<=mgr.hiredate;
