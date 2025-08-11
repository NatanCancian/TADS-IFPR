create database AulaConsultas;
use AulaConsultas;

create table contatos(
id int not null auto_increment,
nome varchar(20) not null,
sobrenome varchar (30) not null,
ddd int(2) not null,
telefone varchar(9) not null,
data_nasc date null,
email varchar(30),
ano_conheceu int(4) not null,
primary key(id)
);

insert into contatos(nome, sobrenome, ddd, telefone, data_nasc, email, ano_conheceu) values
("João", "Silva", 45, "991234567", "1976-11-23", "joao.silva@contatos.com", 2007),
("João", "Machado", 41, "988776655", "1995-02-12", "joao.machado@teste.com", 2015),
("Anderson", "Nunes", 11, "977112233","2005-12-21", "ander.nunes@contato.com", 2018),
("Bruno", "Souza", 31, "988443365","1986-06-16", "bruno.souza@contato.com",2000),
("Carlos", "Roberto", 43, "987654534","1978-01-27","carlos.roberto@teste.com",2004),
("Rodrigo", "Antenor", 67, "982314568","1997-09-08", "rodrigo.antenor@teste.com", 1997),
("Maria", "Clara", 21,"987643489", "1999-10-09", "maria.clara@teste.com", 2008),
("Zelia", "Ducan", 21, "923451234", "1972-03-29", "zelia.ducan@contatos.com", 2014),
("Antonia", "Zara", 87,"997462345", "2001-04-05","antonia.zara@teste.com", 2012),
("Claudia", "Machado", 45, "987900709","1987-07-09","claudia.machado@contatos.com", 1996),
("Tatiana", "Oliveira", 41, "980909876","1984-03-02", "tatiana.oliveira@teste.com", 1990);

select * from contatos;

select id, nome, sobrenome, email from contatos where sobrenome = "Machado";

select nome, sobrenome, ano_conheceu from contatos where ano_conheceu <> 2015;

select distinct ddd from contatos;

select nome, sobrenome from contatos order by nome DESC;

-- LIMIT: limitar o conjunto de resultados

select * from contatos
LIMIT 0,5; # 1 número (offset por onde começa), 2 número tanto de índices

#extração de dados do campo date
select nome, sobrenome, data_nasc, DAYNAME(data_nasc) from contatos;
select nome, sobrenome, data_nasc, DAYOFMONTH(data_nasc) from contatos;
select nome, sobrenome, data_nasc, DAYOFYEAR(data_nasc) from contatos;

-- LIKE
select nome, sobrenome from contatos where nome LIKE 'B%'; #Primeira letra começa com "B"
select nome, sobrenome from contatos where nome LIKE '_a%'; #Segunda letra é com "a"
select nome, sobrenome from contatos where nome LIKE '__a%';#Terceira letra é com "a"
select nome, sobrenome, email from contatos where email LIKE '_%teste.com';#Terceira letra é com "a"
#antes do % pega a informação que tá no começo, depois do % pega o que tá no final 

-- LEFT e RIGHT
select LEFT(nome, 6) from contatos; #Pega a parte esquerda da String
select RIGHT(nome, 6) from contatos; #Pega a parte direita da String

select nome, sobrenome, data_nasc, timestampdiff(YEAR, data_nasc, NOW()) from contatos where timediff(YEAR, data_nasc, NOW()) <= 35;

select timestampdiff(YEAR, "1984-11-02", "2040-11-02");