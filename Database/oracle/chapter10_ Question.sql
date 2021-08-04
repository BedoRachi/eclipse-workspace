/*1번, employee테이블 구조를 복사->EMP_SAMPLE
        사원번호(eno)를 테이블 레벨 Primary key 설정하며
        제약조건 이름은 my_emp_pk */
create table emp_sample
as
select * from employee where 1=0; --employee테이블 구조를 복사->EMP_SAMPLE

alter table emp_sample
add constraint my_emp_pk primary key(eno); 
--사원번호를 테이블 레벨 Primary key 설정하며 제약조건 이름은 my_emp_pk

/*2번, department테이블 구조를 복사->DEPT_SAMPLE
        사원번호(dno)를 테이블 레벨 Primary key 설정하며
        제약조건 이름은 my_dept_pk */
create table dept_sample
as
select * from department where 1=0; --department테이블 구조를 복사->DEPT_SAMPLE

alter table dept_sample
add constraint my_dept_pk primary key(dno);
--사원번호(dno)를 테이블 레벨 Primary key 설정하며 제약조건 이름은 my_dept_pk

/*3번, 부서번호가 없는 사원이 배정되지 않도록 왜래 키 제약조건 지정, 이름은 my_emp_dept_fk */
alter table emp_sample
add constraint my_emp_dept_fk
foreign key(dno) references department(dno);

/*4번 커미션 컬럼이 0보다 큰값만 들어가도록 제약조건 지정 */
alter table emp_sample
add constraint emp_commission_min check (commission >0);

