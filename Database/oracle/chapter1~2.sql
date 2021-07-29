desc department;
select * from department;

desc employee;/*특정 테이블의 구성 보기*/
select * from employee;/*특정 테이블의 모든 컬럼을 출력 */

select eno,ename,eno from employee;/*특정 컬럼만 출력하기 */

DESCRIBE employee; /* = desc employee; */

/* SQL에서의 사칙연산 */
select salary from employee; 
select salary, salary + 300, salary - 300,salary * 300,salary / 300  from employee;

/* ename, salary출력 +  salary*12 하여 연봉(컬럼의 별칭을 지정)을 출력 */
select ename, salary, commission from employee;
select ename, salary as 월급, salary*12 as 연봉 from employee;

/* commission에 null이 있으므로 정상적인 값이 나오질 않는다. */
select ename, salary, salary*12 + commission from employee;

/* nvl(컬럼명, 값) => 특정 컬럼의 Null을 값으로 교체 함*/
select ename, salary, salary*12 + nvl(commission, 0)  from employee;

/* 컬럼의 중복제거, distinct 컬럼명 */
select dno from employee;
select distinct dno from employee;

/* 컬럼 한행 출력 or select 없이도 Table 처럼 출력이 가능하다고함 dual */
select sysdate from department;
select sysdate from dual;

/* employee 모든 컬럼중 salary 컬럼이 1500이상만 출력 */
select * from employee where salary >= 1500;
select * from employee where dno = 10;

select eno 사원번호, ename 사원이름, salary 월급 from employee where salary >=1500;

/*문자열 검색하기(대소문자 유의)*/
select * from employee where ename = 'KING';

/* 날짜 데이터 비교, 가져오기 */
select * from employee where hiredate <= '1981/1/1';

/* 논리 연산자 사용하기(and, or ,not) */
select * from employee where job = 'MANAGER';/*비교용*/
select * from employee where dno =10 and job = 'MANAGER';
select * from employee where salary >=1000 and salary <=1500;
select * from employee where salary >=1000 or salary <=1500;
select * from employee where commission <> 300; /* not */

/* 비교 연산자 between A and B = A~B 사이 */
select * from employee where salary not between 1000 and 1500;

/* IN 연산자를 사용한 검색, 여러개 검색 */
select * from employee where commission in (300, 500, 1400);

/* 와일드 카드를 통한 검색, like % (* 동일)  , _ (한 문자만)  */
select * from employee where ename like '%A%';
select * from employee where ename not like '%A%';
select * from employee where ename like 'M_RT_N';

/* 테이블 별 컬럼 속성 및 별칭 지정 */
select 
    eno 사원번호
    ,ename 사원명
    ,job 업무명
    ,manager "상사 번호" --공백이 있으므로 ""로 묶음
    ,hiredate 고용일
    ,salary 급여
    ,commission "보너스[커미션]" --특수문자가 있으므로 ""로 묶음
    ,dno 부서번호
from employee;

select 
    dno 부서번호
    ,dname 부서명
    ,loc 지역명
from department;

select
    grade 급여등급
    ,losal 급여하한가
    ,hisal 급여상한가
from salgrade;

/* NULL 검색 방법 */
--select ename, dno, commission from employee where commission=null; Error 발생, is를 사용해야함
select ename, dno, commission from employee where commission is null; 
select ename, dno, commission from employee where commission is not null;

?/* 정렬해서 출략하기 order by {컬럼명} asc(or desc) */
select * from employee order by salary asc; --오름차순 정렬
select * from employee order by salary desc; --내림차순 정렬

select * from employee order by ename asc; --오름차순 정렬
select * from employee order by ename desc; --내림차순 정렬

/* 여러 컬럼 정렬해서 출략하기 order by A, B */
select * from employee order by salary desc, ename asc; -- A먼저 정렬 후 A가 동일한 값은 B 정렬
select * from employee order by job asc, ename desc; -- A먼저 정렬 후 A가 동일한 값은 B 정렬
