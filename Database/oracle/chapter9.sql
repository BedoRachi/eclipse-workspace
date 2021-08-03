/* 9장 :DML : 테이블 레코드를 조작하는 언어, 트랜잭션 발생
       INSERT : 데이터(레코드) 추가
       UPDATE : 데이터(레코드) 수정
       DELETE : 데이터(레코드) 삭제
       SELECT : 데이터(레코드) 검색
*/

/* INSERT */
create table dept_copy
as
select * from department where 0=1; --값 없이 테이블 구조만 복사
desc dept_copy;

create table emp_copy
as
select eno, ename, job, hiredate, dno from employee where 0=1;--값 없이 테이블 구조만 복사
commit;

rollback;

/*컬럼명을 명시한 INSERT */
insert into dept_copy (dno, loc, dname) --dept_copy테이블에서 값을 입력할 컬럼을 명시
values(20, 'DALLAS','REASEARCH'); --값을 각 컬럼에 순차적으로 입력한다.

/*컬럼명을 생략한 INSERT */
insert into dept_copy --dept_copy테이블에서 값을 입력할 컬럼을 생략
values(21, 'DALLAS','REASEARCH'); --값을 각 컬럼에 순차적으로 입력한다.

/* 명시적 NULL 입력 */
insert into dept_copy(dno, dname,loc) -- 컬럼명을 생략 가능
values(30,'SALES', NULL); --loc 컬럼에 NULL 입력됨

/* 암시적  NULL 입력 */
insert into dept_copy(dno, dname) -- loc컬럼을 생략
values(30,'SALES'); --loc 컬럼에 NULL 입력됨

/* 공백문자 입력 */
insert into dept_copy -- 컬럼명 생략함
values(50,'COMPUTING', ''); -- 공백값 입력

/*날짜 입력 */
insert into emp_copy
values(7000, 'CANDY','MANAGER', '2012/05/01', 10);

/* TO_DATE(문자를 날짜로 변환) 입력*/
insert into emp_copy
values(7010, 'TOM','MANAGER',TO_DATE('2012.05,01','YYYY,MM,DD'), 20);

/* SYSDATE(오늘날짜) 입력 */
insert into emp_copy
values(7020,'JERRY','SALESMAN',SYSDATE,30);

/* UPDATE */
/* 테이블 값 복사 */
insert into dept_copy
select * from department; -- department의 행을 복사함

/* 특정 행(값)만 변경 */
update dept_copy
set dname='PROGRAMMING'
where dno=10; --dno가 10인 값은 dname을 PROGRAMMING으로 변경한다.

/* 특정 컬럼 전체 변경(where 생략) */
update dept_copy
set dname='HR'; --dept_copy의 모든 dname을 HR로 변경

/* 여러 값(컬럼)을 변경 */
update dept_copy
set dname='PROGRAMMING', loc='SEOUL'
where dno=10; --dno가 10인 값은 dname, loc를 변경

/* 서브쿼리를 통한 값 변경 */
update dept_copy
set loc=(select loc
        from dept_copy
        where dno=20)
where dno=10; --dno가 10인 값인 loc는 dno가 20값의 loc로 변경

select * from emp_copy;
/* DELETE */
/* 특정 조건의 데이터만 삭제 */
delete dept_copy
where dno=10;

/*모든 데이터 삭제*/
delete dept_copy;

create table emp_copy
as
select * from employee;

/*서브쿼리를 이용한 데이터 삭제 */
delete emp_copy
where dno=(select dno
            from department
            where dname='SALES'); --SALES dname을 가진 dno값(30)을 emp_copy에서 삭제
            
/* TRANSACTION */
