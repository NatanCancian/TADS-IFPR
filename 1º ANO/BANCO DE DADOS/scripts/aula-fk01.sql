create database aulafk;
use aulafk;

create table contato(
idcontato int(4) not null auto_increment,
nome varchar(30) not null,
sobrenome varchar(100) not null,
email varchar(100) not null,
primary key(idcontato)
);

create table telefone(
	idtelefone int(4) not null auto_increment,
    ddd varchar(2) not null,
    numero varchar(9) not null,
	idcont int(4) not null,
    constraint FK_Contato foreign key(idcont) references contato(idcontato),
    primary key(idtelefone)
);

insert into contato(nome, sobrenome, email) values ("João", "da Silva", "joão.silva@contatos.com.br");

insert into telefone(ddd, numero, idcont) values ("45","33446789",1);


insert into contato(nome, sobrenome, email) values ("Zezão", "da Silva", "zezão.silva@contatos.com.br");

insert into telefone(ddd, numero, idcont) values ("45","45246789",2);

insert into telefone(ddd, numero, idcont) values ("45","45246756",2);

select * from telefone;

insert into telefone(ddd, numero, idcont) values ("41","45246756",1);

select * from contato;

select contato.nome, contato.sobrenome, telefone.ddd, telefone.numero
from contato, telefone
where contato.idcontato = telefone.idcont; 