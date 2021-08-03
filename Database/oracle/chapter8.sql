/* Table 생성 */
Create table dept1(
    dno number(2) not null,
    dname varchar2(14) not null,
    loc varchar2(13) null
    );
-- 컬럼명 자료형 NULL허용여부 순으로 입력한다.

/* Table 구조 출력 */
desc dept1;

/* 테이블 내용 출력 -> Null */
select * from dept1;

/* 컬럼을 명시 하지 않고 삽입->형식이 맞다면 순차적으로 입력됨 */
insert into dept1 values (1, 'hong', 'seoul');

/* 컬럼을 명시하여 삽입 -> 컬럼에 맞춰 입력됨 */
insert into dept1 (dno, dname, loc) values (2, 'kim', 'pusan');

/* 컬럼을 일부만 삽입 -> 부족한 컬럼은 NULL 처리됨 */
insert into dept1 (dno, dname) values (3, 'park');

/* 테이블 내용 출력 -> 3개 출력*/
select * from dept1;

--트랜잭션(Transaction) : DB의 최소 처리단위를 트랜잭션이라함
    -- 데이터의 일관성 보장
    -- ALL or Nothing : 전부 되거나 전부 안되거나 하는 방식의 처리
    -- Oracle 은 DML 문이 실행될때 먼저 Memory에 적용하여 begin transection & Rollback을 지원하며
    -- "commit;" 할 경우 DB에 저장하며 Commit한다.
    -- 모든 Transaction은 오류시점까지 복구하기 위해 로그를 보관한다.
 
insert into dept1 (dno, dname, loc) values (4, 'son', 'taegu'); -- Treansaction Insert(Memeoy) 
select * from dept1; -- 삽입한 컬럼이 출력됨
rollback; -- Last Commit으로 돌아감
select * from dept1;  -- 삽입한 컬럼이 없음
insert into dept1 (dno, dname, loc) values (4, 'son', 'taegu'); -- Treansaction Insert(Memeoy) 
commit; -- commit 완료(Memory ->DB)
rollback;
select * from dept1; -- commit을 하였기 때문에 컬럼이 보임

delete dept1 -- where가 없을 경우dept1 테이블을 삭제
where dno=3; -- where가 있을 경우 특정 데이터만 삭제함
rollback; -- delete를 하지 않았으므로 Rollback됨

/* Table 전체 복사 */
create table dept1_second
as
select * from department; --depeartment 모든 테이블을 불러와 dept1_sccond 테이블을 생성
select * from dept1_second;

/* Table 부분 복사 및 변경 */
create table dept120
as
select eno, ename, salary * 12 annsal -- 테이블 복사시 테이블의 값을 변경할 경우 테이블명이 없어지기 때문에 반드시 별칭을 넣어야함  
from employee
where dno =20; --dno가 20 인 대상으로만 한다.

/* Table 구조만 복사 */
create table dept1_third
as
select eno, ename -- 복사할 테이블을 선택
from employee
where 0=1; -- 거짓이 반환되므로 값없이 테이블만 복사함

/* 테이블 수정(alter) */
alter table dept120
add(birth date); --컬럼 추가

alter table dept120
add(email varchar2(100)); --컬럼 추가

alter table dept120
add(Address varchar2(200)); --컬럼 추가(200자리 이내의 가변형 char)(성능이 다소 떨어지나 필요시에 공간을 할당하므로 낭비가 적음)

alter table dept120
add(Jumin char(13)); --컬럼 추가(13자리 이내의 char))(성능은 좋으나 공간을 선점하므로 낭비가 발생할 수 있음)

desc dept120
select * from dept120; --추가된 컬럼 확인

/* 컬럼 자료형 변경 */
alter table dept120
modify  ename varchar2 (30); --ename 자료형을 변경

/* 컬럼 제거 */
alter table dept120
drop column JUMIN; --JUMIN 컬럼을 제거

/*컬럼명 변경 */
alter table dept120
rename column EMAIL to E_MAIL;

/*Table명 변경*/
rename dept120 to emp120;

-- SET UNUSED : 특정 컬럼을 비사용등록 하는 것으로 삭제시 많은 부하가 발생하므로 UNUSED->DELETE하여
        --  자원이 충분할때 DELETE를 진행한다.
alter table dept120
set unused(eno);

alter table dept120
drop unused column;

select table_name from user_tables;
select * from tab;

/* TRUNCATE Table : 테이블의 모든 데이터를 삭제 */
-- 모든 데이터를 삭제하나 테이블 자체는 남는다(=값만 삭제)
-- 명령을 실행시 자동으로 Commit됨

/* Delete Table : 테이블를 삭제 */
-- 모든 데이터 + 테이블을 삭제한다(값+테이블 삭제)
-- 무조건 행단위로 삭제하기 때문에 테이블 전체 삭제시 TRUNCATE보다 느림
-- where로 조건을 줄 경우 특정 값만 삭제한다.
-- Memory 상에서만 지워졌기 때문에 Commit or Rollback이 가능

/* 데이터 사전 : 객체의 정보를 저장하고 있는 테이블 */
-- 객체(엔티티) : 테이블, 뷰, 트리거, 인덱스, 저장프로시져, 함수....
-- DDL : 객체를 조작하는 언어, Create, Alter, Drop
-- DML : 데이터(레코드)를 조작하는 언어, Insert, Update, Delete, Select
        -- 트랜잭션이 발생하며 Log에 기록됨
/* USER_ : 자신의 계정이 속한 객체에 관한 정보
   ALL_ : 자신의 계정 소유한 객체나 권한을 부여 받은 객체
   DBA+ : 데이터베이스 관리자만 접근 가능한 객체
*/

show user;

/* USER_ : ?현재 로그인한 사용자가 소유하는 객체를 조회*/
select * from user_tables; -- 테이블 목록 및 관련된 정보
select * from user_views; -- 뷰 목록 및 관련된 정보
select * from user_indexes; --인텍스 목록 및 관련된 정보
select * from user_constraints; --테이블의 제약조건을 조회
select * from user_sequences; --시퀀스 목록 조회
-- 제약조건: 테이터의 무결성을 위한 조건(NOT NULL, UNIQUE, CHECK, PRIMARY/FOREIGN KEY, DEFAULT)
-- 시퀀스 : 자동번호 발생기로 기본키가 유일한 값(순서)을 유지하도록 자동으로 증가하며 할당

/*ALL_ : 모든 사용자가 접근권한이 있는 객체를 조회 */
select * from all_tables;
select * from all_views;
select * from all_indexes;

/*DBA_ : 관리자가 접근가능한 객체로 모든 객체를 조회(sys or system 계정이 필요) */
select * from dba_tables;
select * from dba_views;
select * from dba_indexes;

