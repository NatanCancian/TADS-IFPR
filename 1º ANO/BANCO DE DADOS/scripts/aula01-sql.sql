create schema aulaBD;
use aulaBD;

create table AlunosBD(
idAluno integer,
nomeAluno varchar(100),
emailAluno varchar(100),
turmaAluno varchar(10));

show tables;

insert into AlunosBD(idAluno, nomeAluno, emailAluno, turmaAluno)
values (1,"Zezão", "zezao@gmail.com", "1º TADS");

insert into AlunosBD(idAluno, nomeAluno, emailAluno, turmaAluno)
values (2,"Zezão2", "zezao2@gmail.com", "1º TADS");

 SET SQL_SAFE_UPDATES = 0;

UPDATE AlunosBD
set emailAluno = "zezao@gmail.com"
where idAluno = 1;

delete from AlunosBD
where idAluno = 1;


select * from AlunosBD;