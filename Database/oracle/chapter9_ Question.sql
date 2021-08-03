/*1번 EMP테이블의 구조만 복사하여 EMP_INSERT란 인 테이블 */
create table emp_insert
as
select * from employee where 1=0;

/*2번 본인을 EMP_INSERT 테이블에 추가하되  SYSDATE를 이용해서 입사일을 오늘로 */
insert into emp_insert
values(1,'LEEJM','STUDENT',null,sysdate,2700,230,10);

/*3번 EMP_INSET 테이블에 옆 사람을 추가하되 TO_DATE를 이용 */
insert into emp_insert
values(2,'LYY','STUDENT',null, to_date(sysdate-1,'YY/MM/DD'),1150,null,20);

/*4번 EMPLOYEE 테이블의 구조와 내용을 복사하여 EMP_COPY를 만듬 */
create table emp_copy
as
select * from employee;

/*5번 사원번호가 7788인 사원의 부서번호를 10번으로 수정*/
update emp_copy
set dno=10
where eno=7788;

/*6번 사원번호 7788의 업무 및 급여를 7499와 동일하게 함*/
update emp_copy
set(job, salary) = (select job, salary
                    from emp_copy
                    where eno=7499)
where eno=7788;

/*7번, 사원번호 7369와 업무가 동일한 모든 사원의 부서번호를 7369와 갱신 */
update emp_copy
set dno=(select dno
        from emp_copy
        where eno=7369)
where job=(select job
            from emp_copy
            where eno=7369);
            
/*8번, department테이블 구조를 복사하여 DEPT_COPY를 만듬*/
create table dept_copy
as
select * from department;

/*9번, dept_copy 테이블에서 부서명이 RESEARCH인 부서를 제거*/
delete from dept_copy
where dname='RESEARCH';

/*10번, dept_copy테이블에서 부서번호가 10,40인 부서를 제거*/
delete from dept_copy
where dno in(10,40);