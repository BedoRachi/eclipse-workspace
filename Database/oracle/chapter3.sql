/* ��ҹ��� ��ȯ �Լ� */
select 'Oracle Mania' -- ����
    ,UPPER('Oracle mania') -- �빮�ڷ� ��ȯ
    ,LOWER('Oracle mania') -- �ҹ��ڷ� ��ȯ
    ,INITCAP('Oracle mania') -- ù�ڸ� �빮�� ������ �ҹ���
    from dual; --�׳� ���
SELECT ename, LOWER(ename), UPPER(ename), INITCAP(ename) from employee; 

/* ���� ���� ��ȯ �Լ� */
select LENGTH('����Ŭ�ŴϾ�'), LENGTH('Oracle mania') from dual;

/* ���� ���� �Լ� */ 
select concat('Oracle','mania') from dual; --���ڿ��� ��ħ
select concat(ename, job) from employee; --�÷��� ���ļ� ���

/* ���� �и�(1byte) �Լ� */
select substr('Oracle mania', 4,3), -- �տ��� 4��° �ڸ����� 3�� ����
    substr('Oracle mania', -4,3) -- �ڿ��� 4��° �ڸ����� 3�� ����
    from dual;
    
select substr('����Ŭ�ŴϾ�', 3,3), -- �տ��� 4��° �ڸ����� 3�� ����
    substr('����Ŭ�ŴϾ�', -3,3) -- �ڿ��� 4��° �ڸ����� 3�� ����
    from dual;
    
select substrb('Oracle mania', 4,3), -- �տ��� 4��° �ڸ����� 3�� ����
    substrb('Oracle mania', -4,3) -- �ڿ��� 4��° �ڸ����� 3�� ����
    from dual;
    
select substrb('����Ŭ�ŴϾ�', 0,5), -- �տ��� 3��° �ڸ����� 4�� ����
    substrb('����Ŭ�ŴϾ�', -3,3) -- �ڿ��� 3��° �ڸ����� 3�� ����
    from dual;
    
select * from employee
    where substr(hiredate, 4, 2) = '09';
    
/* Ư�� ���� ��ġ ��ȯ �Լ� */
select instr('oracle mania', 'a', 1, 2) --oracle mania���� a�� 1����ġ���� ã���� 2��° ã�� a�� �ڸ����� ��ȯ
    ,instr('oracle mania' , 'a' , 5, 2) --oracle mania���� a�� 5����ġ ���� ã���� 2��° ã�� a�� �ڸ����� ��ȯ
    --(�� ��� ���ڿ��� �Ѿ�µ� oracle mania�� �ѹ��� �����Ͽ� ã��)
    from dual; 
select * from employee where INSTR(ename, 'R', 3,1)='3';

/*Ư�� ���� ä��� */
select salary from employee; -- �񱳿�
select LPAD(salary, 10, '*') from employee; --���ڿ� ������ *�� ä�� 10�ڸ��� �����.
select RPAD(salary, 10, '*') from employee; --���ڿ� �������� *�� ä�� 10�ڸ��� �����.

/* ���� ���� */
select ' Oracle Mania '
    , LTRIM(' Oracle Mania ') --���� ������ ����
    , RTRIM(' Oracle Mania ') --������ ������ ����
    from dual;
    
/* Ư�� ���� ���� */
select 'Oracle mania'
    ,TRIM('O' FROM 'Oracle mania') --���ڿ����� O ����
    ,TRIM(' Oracle mainia ') --���ڿ����� �յڰ��� ����
from dual;
select ename, TRIM('S' FROM ename) from employee; -- S ���� ����
select ename, TRIM('S' FROM ename) from employee where ename like '%S%'; -- S ���� ���� + S���ڸ� ���

/* �ݿø� �Լ� */
select 98.7654 -- ���� ���
    ,Round(98.7654) -- �Ҽ��� ��ü �ݿø�
    ,Round(98.7654, 2) -- �Ҽ��� 2��°���� ����� �ݿø�
    ,Round(98.7654, -1) -- ���� 1��° �ڸ����� �ݿø�
from dual;

/* ���� �Լ� */
select 98.7654 -- ���� ���
    ,TRUNC(98.7654) -- �Ҽ��� ��ü ����
    ,TRUNC(98.7654, 2) -- �Ҽ��� 2��° �ں��� ����
    ,TRUNC(98.7654, -1) -- ���� 1��° �ڸ����� ����
from dual;
/* ������ �Լ� */
select MOD(31,2) -- 31%2
    ,MOD(31,5) -- 31%5
    ,MOD(32, 5)-- 32%5
    ,MOD(30, 5) -- 30%5
from dual;
/* ��¥ ��� �� ��� */
select 
    sysdate -300 ���� --300�� ��
    ,sysdate ���� --����
    ,sysdate +1000 ���� --1000�� ��
from dual;
select SYSDATE, hiredate, ROUND(SYSDATE - hiredate) from employee;
select sysdate, TRUNC(sysdate, 'MONTH') from dual; --�� �������� ����
select hiredate, ROUND(hiredate, 'MONTH') from employee; -- �� �������� �ݿø�
select sysdate, hiredate, MONTHS_BETWEEN(sysdate, hiredate), ROUND(MONTHS_BETWEEN(sysdate, hiredate)), TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) from employee;
-- ���ó�¥ ���ų�¥ ���Ͽ� ������ ����
select hiredate, ADD_MONTHS(hiredate, 6) from employee; -- 6���� ��ŭ ����
select sysdate, NEXT_DAY(sysdate, '�����') from dual;

select ename, hiredate, -- ��¥ ���
    TO_CHAR(hiredate, 'YY-MM'), --��¥�� YY-MM�������� ���
    TO_CHAR(hiredate, 'YYYY/MM/DD DAY') --��¥�� YYYY/MM/DD ��¥ �������� ���
from employee;

select TO_CHAR(sysdate, 'yyyy/mm/dd, HH24:MI:SS') from dual;

select ename, TO_CHAR(salary, 'L999,999') from employee; -- salary�� ��000,000 ������� ���

select ename, hiredate from employee where hiredate=TO_DATE(19810220, 'YYYYMMDD'); --���ڸ� ��¥�� ����ȯ �Ͽ� �˻���Ŀ� ����

select TO_NUMBER('100,000' , '999,999') - TO_NUMBER('50,000','999,999') from dual;
-- ���ڿ� 100,000�� 50,000�� ���ڷ� ��ȯ�Ͽ� ����

select ename, salary, commission,
    NVL(commission, 0), --null�� 0���� �ٲ�
    salary*12+NVL(commission,0) --null�� 0���� �ٲ� �� ����
from employee
order by job; -- job �������� ����

select ename, salary, commission,
    NVL2(commission , -- commission�� �˻��ؼ�
        salary*12+commission, --null�� �ƴϸ� ���� �� ��ȯ
        NVL(commission, 0)+salary*12) --null�̸� salary�� ��ȯ
from employee;