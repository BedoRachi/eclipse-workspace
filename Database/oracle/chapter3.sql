/* 대소문자 변환 함수 */
select 'Oracle Mania' -- 원본
    ,UPPER('Oracle mania') -- 대문자로 변환
    ,LOWER('Oracle mania') -- 소문자로 변환
    ,INITCAP('Oracle mania') -- 첫자만 대문자 나머진 소문자
    from dual; --그냥 출력
SELECT ename, LOWER(ename), UPPER(ename), INITCAP(ename) from employee; 

/* 문자 길이 반환 함수 */
select LENGTH('오라클매니아'), LENGTH('Oracle mania') from dual;

/* 문자 연결 함수 */ 
select concat('Oracle','mania') from dual; --문자열을 합침
select concat(ename, job) from employee; --컬럼을 합쳐서 출력

/* 문자 분리(1byte) 함수 */
select substr('Oracle mania', 4,3), -- 앞에서 4번째 자리부터 3개 추출
    substr('Oracle mania', -4,3) -- 뒤에서 4번째 자리부터 3개 추출
    from dual;
    
select substr('오라클매니아', 3,3), -- 앞에서 4번째 자리부터 3개 추출
    substr('오라클매니아', -3,3) -- 뒤에서 4번째 자리부터 3개 추출
    from dual;
    
select substrb('Oracle mania', 4,3), -- 앞에서 4번째 자리부터 3개 추출
    substrb('Oracle mania', -4,3) -- 뒤에서 4번째 자리부터 3개 추출
    from dual;
    
select substrb('오라클매니아', 0,5), -- 앞에서 3번째 자리부터 4개 추출
    substrb('오라클매니아', -3,3) -- 뒤에서 3번째 자리부터 3개 추출
    from dual;
    
select * from employee
    where substr(hiredate, 4, 2) = '09';
    
/* 특정 문자 위치 반환 함수 */
select instr('oracle mania', 'a', 1, 2) --oracle mania에서 a를 1번위치부터 찾으며 2번째 찾은 a의 자릿수를 반환
    ,instr('oracle mania' , 'a' , 5, 2) --oracle mania에서 a를 5번위치 부터 찾으며 2번째 찾은 a의 자릿수를 반환
    --(이 경우 문자열을 넘어가는데 oracle mania를 한번더 실행하여 찾음)
    from dual; 
select * from employee where INSTR(ename, 'R', 3,1)='3';

/*특정 문자 채우기 */
select salary from employee; -- 비교용
select LPAD(salary, 10, '*') from employee; --문자열 왼쪽을 *로 채워 10자리를 만든다.
select RPAD(salary, 10, '*') from employee; --문자열 오른쪽을 *로 채워 10자리를 만든다.

/* 공백 제거 */
select ' Oracle Mania '
    , LTRIM(' Oracle Mania ') --왼쪽 공백을 제거
    , RTRIM(' Oracle Mania ') --오른쪽 공백을 제거
    from dual;
    
/* 특정 문자 제거 */
select 'Oracle mania'
    ,TRIM('O' FROM 'Oracle mania') --문자열에서 O 제거
    ,TRIM(' Oracle mainia ') --문자열에서 앞뒤공백 제거
from dual;
select ename, TRIM('S' FROM ename) from employee; -- S 문자 제거
select ename, TRIM('S' FROM ename) from employee where ename like '%S%'; -- S 문자 제거 + S문자만 출력

/* 반올림 함수 */
select 98.7654 -- 원본 출력
    ,Round(98.7654) -- 소숫점 전체 반올림
    ,Round(98.7654, 2) -- 소숫점 2번째에서 남기고 반올림
    ,Round(98.7654, -1) -- 정수 1번째 자리에서 반올림
from dual;

/* 버림 함수 */
select 98.7654 -- 원본 출력
    ,TRUNC(98.7654) -- 소숫점 전체 버림
    ,TRUNC(98.7654, 2) -- 소숫점 2번째 뒤부터 버림
    ,TRUNC(98.7654, -1) -- 정수 1번째 자리에서 버림
from dual;
/* 나머지 함수 */
select MOD(31,2) -- 31%2
    ,MOD(31,5) -- 31%5
    ,MOD(32, 5)-- 32%5
    ,MOD(30, 5) -- 30%5
from dual;
/* 날짜 계산 및 출력 */
select 
    sysdate -300 어제 --300일 전
    ,sysdate 오늘 --오늘
    ,sysdate +1000 내일 --1000일 후
from dual;
select SYSDATE, hiredate, ROUND(SYSDATE - hiredate) from employee;
select sysdate, TRUNC(sysdate, 'MONTH') from dual; --월 기준으로 버림
select hiredate, ROUND(hiredate, 'MONTH') from employee; -- 월 기준으로 반올림
select sysdate, hiredate, MONTHS_BETWEEN(sysdate, hiredate), ROUND(MONTHS_BETWEEN(sysdate, hiredate)), TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) from employee;
-- 오늘날짜 과거날짜 비교하여 월기준 버림
select hiredate, ADD_MONTHS(hiredate, 6) from employee; -- 6개월 만큼 더함
select sysdate, NEXT_DAY(sysdate, '토요일') from dual;

select ename, hiredate, -- 날짜 출력
    TO_CHAR(hiredate, 'YY-MM'), --날짜를 YY-MM형식으로 출력
    TO_CHAR(hiredate, 'YYYY/MM/DD DAY') --날짜를 YYYY/MM/DD 날짜 형식으로 출력
from employee;

select TO_CHAR(sysdate, 'yyyy/mm/dd, HH24:MI:SS') from dual;

select ename, TO_CHAR(salary, 'L999,999') from employee; -- salary를 원000,000 양식으로 출력

select ename, hiredate from employee where hiredate=TO_DATE(19810220, 'YYYYMMDD'); --숫자를 날짜로 형변환 하여 검색양식에 맞춤

select TO_NUMBER('100,000' , '999,999') - TO_NUMBER('50,000','999,999') from dual;
-- 문자열 100,000과 50,000을 숫자로 변환하여 연산

select ename, salary, commission,
    NVL(commission, 0), --null을 0으로 바꿈
    salary*12+NVL(commission,0) --null을 0으로 바꾼 후 연산
from employee
order by job; -- job 기준으로 정렬

select ename, salary, commission,
    NVL2(commission , -- commission을 검사해서
        salary*12+commission, --null이 아니면 연산 후 반환
        NVL(commission, 0)+salary*12) --null이면 salary만 반환
from employee;