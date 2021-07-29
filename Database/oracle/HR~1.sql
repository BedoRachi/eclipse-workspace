desc department;
select * from department;

desc employee;/*특정 테이블의 구성 보기*/
select * from employee;/*특정 테이블의 모든 컬럼을 출력 */

select eno,ename,eno from employee;/*특정 컬럼만 출력하기 */

DESCRIBE employee; /* = desc employee; */

/* SQL에서의 사칙연산 */
select salary from employee; 
select salary, salary + 300, salary - 300,salary * 300,salary / 300  from employee;

/* ename, salary출력 +  salary*12 하여 연봉(컬럼의 별칭을 지정)을 출력 *
select ename, salary, commission from employee;
select ename, salary as 월급, salary*12 as 연봉 from employee;

/* commission에 null이 있으므로 정상적인 값이 나오질 않는다. *
select ename, salary, salary*12 + commission from employee;

/* nvl(컬럼명, 값) => 특정 컬럼의 Null을 값으로 교체 함*/
select ename, salary, salary*12 + nvl(commission, 0)  from employee;

/* 컬럼의 중복제거, distinct 컬럼명 */
select dno from employee;
select distinct dno from employee;

/* 컬럼 한줄 출력, dual */
select sysdate from department;
select sysdate from dual;

/* employee 모든 컬럼중 salary 컬럼이 1500이상만 출력 */
select * from employee where salary >= 1500;
select * from employee where dno = 10;

select eno 사원번호, ename 사원이름, salary 월급 from employee where salary >=1500;

/*문자열 검색 */
select * from employee where ename = 'KING';

/* 날짜 데이터 비교, 가져오기 */
select * from employee where hiredate <= '1981/1/1';

/* 논리 연산자 사용하기 */
select * from employee where dno =10 and job = 'MANAGER';
select * from employee where job = 'MANAGER';
select * from employee where salary >=1000 and salary <=1500;
select * from employee where commission <> 300; /* not */

/* 비교 연산자 between A and B = A~B 사이 */
select * from employee where salary not between 1000 and 1500;

/* IN 연산자를 사용한 검색, 여러개 검색 */
select * from employee where commission in (300, 500, 1400);


/* 와일드 카드를 통한 검색, like % (* 동일)  , _ (한 문자만)  */
select * from employee where ename like '%A%';

select * from employee where ename not like '%A%';


select * from employee where ename like 'M_RT_N';

