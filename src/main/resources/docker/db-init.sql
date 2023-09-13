connect system/123;

ALTER SESSION SET CONTAINER = ORCLPDB1;
CREATE TABLESPACE CONTROLE_TBS DATAFILE '/opt/oracle/oradata/XE/ORCLPDB1/controletbs01.dbf' SIZE 100M ONLINE;
CREATE TABLESPACE IDX_CONTROLE_TBS DATAFILE '/opt/oracle/oradata/XE/ORCLPDB1/idx_controletbs01.dbf' SIZE 100M;
CREATE USER CONTROLE IDENTIFIED BY CONTROLE DEFAULT TABLESPACE CONTROLE_TBS TEMPORARY TABLESPACE TEMP;
GRANT INSERT ON BEBIDA TO CONTROLE;
GRANT INSERT ON FORNECEDOR TO CONTROLE;
GRANT UPDATE ON BEBIDA TO CONTROLE;
GRANT UPDATE ON FORNECEDOR TO CONTROLE;
GRANT DELETE ON BEBIDA TO CONTROLE;
GRANT DELETE ON FORNECEDOR TO CONTROLE;
GRANT CONNECT TO CONTROLE;
GRANT CREATE VIEW TO CONTROLE;
GRANT CREATE PROCEDURE TO CONTROLE;
GRANT CREATE JOB TO CONTROLE;
GRANT CREATE MATERIALIZED VIEW TO CONTROLE;
ALTER USER CONTROLE DEFAULT ROLE CONNECT, RESOURCE;


-- create tablespace get datafile '/u01/app/oracle/oradata/XE/get01.dbf' size 100M online;
-- create tablespace idx_get datafile '/u01/app/oracle/oradata/XE/idx_get01.dbf' size 100M;
-- create user get identified by get default tablespace get temporary tablespace temp;
-- grant resource to get;
-- grant connect to get;
-- grant create view to get;
-- grant create procedure to get;
-- grant create job to get;
-- grant create materialized view to get;
-- alter user get default role connect, resource;
