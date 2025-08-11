create database aulaview;
use aulaview;

create table AUTOR(
	id_autor int not null auto_increment,
    nome varchar(40) not null,
    sobrenome varchar(40) not null,
    nacionalidade varchar(40) null,
    estilo varchar(40) null,
    primary key(id_autor)
);

insert into AUTOR(nome, sobrenome, nacionalidade, estilo) values("Machado", "de Assis", "brasileira", "romance"),
("Karl","Marx","alemã","filosofia"),
("Adam", "Smith", "escocesa", "filosofia"),
("Shamakant", "Navathe", "estadounidense","banco de dados");

select * from AUTOR;

create table LIVROS(
	id_livro int not null auto_increment,
    titulo varchar(100) not null,
    ano int(4) not null,
    edicao int(3) null,
    estilo varchar(40) null,
    id_autor int not null,
    primary key(id_livro),
    constraint fk_autor foreign key(id_autor) references AUTOR(id_autor)
    );
    
insert into LIVROS(titulo, ano, estilo, id_autor) values ("Dom Casmurro", 1899, "romance", 1),
("Memórias Póstumas de Braś Cubas", 1881, "romance", 1),
("O Capital", 1867, "filsofia", 2),
("Uma Contribuição para a Crítica da Economia Política", 1859, "filosofia", 2),
("A Riqueza das Nações", 1776, "filosofia", 3),
("Teoria dos Sentimentos Morais", 1759, "filosofia", 3);

insert into LIVROS(titulo, ano, edicao, estilo, id_autor) values ("Sistema de Banco de Dados", 2003, 4, "banco de dados", 4),
("Fundamentals of Database", 2017, 7, "banco de dados", 4);

select * from LIVROS;

CREATE VIEW vw_LivrosAutores 
AS SELECT LIVROS.titulo AS Livro, AUTOR.nome AS Autor 
FROM LIVROS, AUTOR
WHERE LIVROS.id_autor = AUTOR.id_autor;  

select * from vw_LivrosAutores;

CREATE VIEW vw_LivrosAlemaes
AS SELECT LIVROS.titulo AS Livro
FROM LIVROS INNER JOIN AUTOR
ON LIVROS.id_autor = AUTOR.id_autor
AND AUTOR.nacionalidade = "alemã";

select * from vw_LivrosAlemaes;

select Livro,Autor
from vw_LivrosAutores
ORDER BY Livro;