create table t1 (
    a number (10,3) NOT NULL, --숫자 정수 10자리 + 소수 3자리
    b char (6) NOT NULL, -- 6Byte 
    c varchar2(6) NOT NULL, -- 6Byte 
    d nchar (6) null, -- 6자 유니코드
    e nvarchar2 (6) -- 6자 유니코드
    );