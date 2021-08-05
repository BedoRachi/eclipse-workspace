/* 시퀀스 : 자동 번호 발생기 */
/*시퀀스 정의 */
create sequence sample_seq --시퀀스 정의
        increment by 10  --증가량
        start with 10;  --시작값
    
select * from user_sequences;
select sample_seq.nextval from dual; -- 호출할때 마다 다음 값을 반환함
select sample_seq.currval from dual; -- 호출할때 마다 현재 값을 반환함

/* 시퀀스를 기본 키에 접목하기 */
create sequence sample_seq --시퀀스 정의
        increment by 1  --증가량
        start with 1;  --시작값

insert into dept_second
values (sample_seq.nextval, 'ACCOUNT', 'New York');

select * from dept_second;

create sequence sample_seq2 --시퀀스 정의
        increment by 2  --증가량
        start with 1;  --시작값
        
/* 시퀀스 수정 및 제거 */
alter sequence sample_seq
increment by 5;

drop sequence sample_seq;

/* cache / nocache : 시퀀스의 성능을 위해 시퀀스의 값을 임시로 저장함
                    시퀀스가 쌓이고 많아질 수록 서버 성능에 영향이 발생 + 서버에 비정상 종료시 시퀀스가 안맞게됨*/
--참고 URL : https://doughman.tistory.com/11
create sequence sample_seq3
        increment by 2
        start with 2
        nocache;
        
/* INDEX : 색인 기능 각 값의 키값을 가지고 INDEX를 만들어 호출시 INDEX을 검색하여 원하는 값의 위치를 확인
            테이블 검색 속도 < 인덱스 검색 속도 (not always) / 테이블 검색 부하 > 인덱스 검색 부하
            단. 인덱스를 위한 추가 공간(10%) + 최초 인덱스 생성시 부하 발생 + 잦은 변경으로 인한 인덱스 변경시 부하(인덱스 분할)
            */
/*?

B-Tree(Balanced Tree, 균형트리) :

- Root Node(루트 노드) : INDEX의 첫 페이지로 여러 키값 중 대표값을 저장하고 있는 Node이다.

검색시 Root Node에서 키값과 일치 또는 가장 가까운 Leaf Node의 위치를 확인

- Reaf Node(리프 노드) : 실제 키값들이 정렬 및 분할 되어 저장되어 있는 Node들로 각 Leaf Node의 대표 키값

을 Root Node에 저장한다. */

select * from user_columns;
select * from user_ind_columns;

/* Index 생성 */
create index idx_employee_ename
on employee(ename);

select * from employee
where ename = 'MILLER'; -- Index를 통해 검사

/* Index 조회 */
select index_name, table_name, column_name
from user_ind_columns
where table_name in('EMPLOYEE'); --검색시 테이블명은 대문자

/* Index 자동 생성(Primary, Unique키가 있는 컬럼은 자동 Index) */
create table tbl1(
    a number(4) constraint tbl1_a_pk primary key, --primary Key은 자동 Index됨
    b number(4),
    c number(4)
    );
    
create table tbl2 (
    a number(4) constraint tbl2_a_pk primary key,
    b number(4) constraint tbl2_b_uk unique, --Unique Key은 자동 Index됨
    c number(4) constraint tbl2_c_uk unique
    );
    
select index_name, table_name, column_name
from user_ind_columns
where table_name in('TBL1', 'TBL2');

/* Index drop */
drop index idx_employee_ename;

/* index rebuild : 컬럼의 값이 변경(insert, update, delete)시 Index Page를 분할 및 
재구성되므로 rebulid를 통해 최적화 */
alter index idx_employee_ename rebuild;

/* index 의 종류
    고유 인덱스(Unique Index) : 컬럼의 중복되지 않는 고유 한 값을 가지는 INDEX(Primary Key, Unique 컬럼은 자동생성)
    단일 인덱스(Single Index) : 컬럼 하나에 부여되는 인덱스
    결합 인덱스(Composite Index) : 컬럼 여러개를 묶어 부여하는 인덱스
    함수 인덱스(Function Base Index) : 함수를 적용한 컬럼의 인덱스
*/

/* 고유 인덱스(Unique Index) */
drop table dept_second;

create table dept_second
as
select * from department;

select * from dept_second;
select * from user_ind_columns;

select * from user_ind_columns
where table_name in('DEPT_SECOND', 'DEPARTMENT');

create unique index idx_dept_dno
on dept_second(dno); --dno 컬럼에 unique index 를 부여하며 이름은 idx_dept_dno 이다.

create unique index inx_dept_loc
on dept_second(loc); --dno 컬럼에 unique index 를 부여하며 이름은 inx_dept_loc 이다.

/* 결합 인덱스(Composite Index) */
create index idx_dept_com
on dept_second(dname, loc); --loc, danem 컬럼을 묶어서 Index

/* DB 권한 
    -- DBMS에 접속 할 수 있는 사용자(계정생성)
    -- Authorization : DB를 수정 및 생성, 삭제를 할 수 있는 계정
        -- System privilege : 
        -- Object Privilege : 
*/
/* create user : 계정 생성 */
create user usertest01 identified by pass1; -- 계정 생성

/* grant : 권한 부여 */
grant create session to usertest01; -- 접속 권한 부여

grant create table to usertest01; -- 테이블을 만들 수 있는 권한

select username, default_tablespace
from dba_users
where username in ('USERTEST01','HR'); -- 생성한 계정 확인

alter user usertest1 default TABLESPACE USERS; -- 기본 테이블 스페이스 USERS 할당

grant select on employee to usertest01; -- usertest01에 employee테이블의 select 권한만 부여 

/* 계정 패스워드 변경 */
alter user usertest01 identified by 1234;

/* 계정 권한 제거 */
revoke create session from usertest01 ;

/* 현재 로그온 계정의 권한 출력 */
select * from session_privs;

/* WITH GRANT OPTION 
    : 권한을 부여 받은 사용자도 해당 권한을 다른 사용자에게 부여.
*/
create user usertest02 identified by pass2;
create user usertest03 identified by pass3;

grant create session, create table, create view to usertest02;
grant create session, create table, create view to usertest03;

grant select on hr.employee to usertest02 with grant option;

/* 객체 권한 */
grant select on hr.employee to public;

/* 룰 : 자주 사용하는 권한을 그룹화 */
create user usertest04 identified by pass4
grant resource to usertest04; --사전정의 된 룰
grant connect to usertest04;

/* 사용자 정의 룰 */
create role roletest01;
grant create session, create table, create view to roletest01; -- 사용자 정의 룰

grant roletest01 to usertest01;

/* 룰 권한 확인 */
select * from role_sys_privs
where role like '%TEST%';