SELECT * FROM member;
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
CREATE TABLE  member(
    id VARCHAR2(10), 
    name VARCHAR2(10), 
    pass VARCHAR2(10), 
    ssn VARCHAR2(14)
);
--���̺� ����--
DROP TABLE account;
--�ν��Ͻ� ����==DB���� �� row�� �߰��ϴ°�---
INSERT INTO meber(id,name,pass,ssn)
VALUES('hong', 'ȫ�浿', '1', '90010-1234567')