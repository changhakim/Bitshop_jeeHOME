SELECT * FROM account;
SELECT*FROM TAB ������

system/password - �����ִ� �༮ ��������
--��������--
CREAT USER oracle IDENTIFIED BY password;
oracle/password
--���Ѻο�--
GRANT RESOURCE, CONNECT, DBA TO oracle;
EXIT
---�ٽ÷α���
sqlplus oracle/password
--�������� ��������
SHOW USER
SELECT * FROM TAB;
--���̺� ����--
CREATE TABLE  account(
    accountnum VARCHAR2(30), 
    money NUMBER(10,0), 
    today VARCHAR2(30)
);
--���̺� ����--
DROP TABLE account;
--�ν��Ͻ� ����==DB���� �� row�� �߰��ϴ°�---
INSERT INTO meber(id,name,pass,ssn)
VALUES('hong', 'ȫ�浿', '1', '90010-1234567')