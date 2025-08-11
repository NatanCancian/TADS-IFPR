create database if not exists AulaBD;
drop database AulaBD;

use AulaBD;

create table contatos(
	nome varchar(50) not null,
    telefone varchar(25) not null
);

describe contatos;

insert into contatos(nome, sobrenome, ddd, telefone, data_nasc, email)
values("Zezão", "Zaoze", 45, "998982653", "1996-08-22", "zezao.zao@contatos.com.br");

insert into contatos(nome, sobrenome, ddd, telefone, data_nasc, email)
values("Zezinho", "Ze", 45, "918982653", "2000-01-21", "zezinho@contatos.com.br");

insert into contatos(idContato, nome, sobrenome, ddd, telefone, data_nasc, email)
values(5, "Zezo", "Zao", 44, "818982654", "1900-01-21", "zezo@contatos.com.br");

insert into contatos(nome, sobrenome, ddd, telefone, data_nasc, email)
values("Ana Paula", "Tejano", 45, "918985652", "2001-05-21", "apj@contatos.com.br");

alter table contatos
add ativo smallint null after email;

select * from contatos;

drop table contatos;

update contatos
set ativo = 1 where idContato = 1;


update contatos
set ativo = 1 where idContato = 6;


create table contatos(
	idContato int(4) not null auto_increment,
	nome varchar(20) not null,
    sobrenome varchar(30) not null,
    ddd int(2) not null,
    telefone varchar(9) not null,
    data_nasc date null,
    email varchar(30) null,
    primary key (idContato)
);