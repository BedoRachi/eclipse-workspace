/* 1번 다음 표에 명시된 대로 DEPT1 테이블 생성 */
drop table dept1;
create table dept1(
        dno number(2),
        dname varchar2(14),
        loc varchar2(13));
desc dept1;

/* 2번, EMP 테이블 생성 */
drop table emp;
create table emp(
        eno number(4),
        ename varchar2(10),
        dno number(2));
desc emp;

/* 3번, 긴이름을 저장하도록 EMP테이블을 수정(ENAME 칼럼크기 수정) */
alter table emp
modify ename varchar2(25);
desc emp;

/* 4번, employee테이블을 employee2로 복사하되 사원번호, 이름, 급여, 부서번호 칼럼만 복사하고
 각 칼럼의 이름은 EMP_ID, NAME, SAL, DEPT_ID이다. */
 create table employee2(emp_id,name,sal,dept_id)
 as
 select eno, ename, salary, dno from employee;
 desc employee2;
 
 /*5번, emp 테이브를 삭제 */
 drop table emp;
 desc emp;
 
 /* 6번, employee2란 이름을 emp로 변경*/
rename employee2 to emp;
desc emp;
desc employee2;

/* 7번, DEPT 테이블에서 DNAME 칼럼 제거 */
alter table dept1
drop column dname;
desc dept1;

/* 8번, DEPT 테이블에서 LOC칼럼을 UNUSED 로 표시 */
alter table dept1
set unused(loc);
desc dept1;

/*9번, UNUSED 칼럼 제거 */
alter table dept1
drop unused columns;
desc dept1;