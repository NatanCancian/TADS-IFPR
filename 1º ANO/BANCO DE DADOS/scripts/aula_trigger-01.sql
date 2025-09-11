create database aulagatilhos;
use aulagatilhos;

create table Produtos(
	referencia int not null,
    descricao varchar(50) not null,
    estoque int not null default 0,
    primary key(referencia)
);

insert into Produtos(referencia, descricao, estoque) values
(1,"Feijão",10), (2, "Arroz", 5), (3, "Farinha",15);

select * from Produtos;

create table ItensVenda(
	venda int not null,
    produto int not null,
    quantidade int,
    primary key(venda),
    constraint FK_Venda_Produto foreign key(produto) references Produtos(referencia)
);

DELIMITER $ 
CREATE TRIGGER Tgr_ItensVenda_Insert AFTER INSERT 
ON ItensVenda 
FOR EACH ROW 
BEGIN
UPDATE Produtos SET Estoque = Estoque - NEW.quantidade
WHERE referencia = NEW.Produto;
END$
DELIMITER ;

INSERT INTO ItensVenda (venda, produto, quantidade) values(1,1,3);

# COISAS NOVAS NA TABELA -> NEW
# COISAS ANTIGAS NA TABELA -> OLD

DELIMITER $
CREATE TRIGGER Tgr_ItensVenda_Delete AFTER DELETE
ON ItensVenda
FOR EACH ROW 
BEGIN	
	UPDATE Produtos SET Estoque = Estoque + OLD.quantidade 
    WHERE referencia = OLD.produto;
    
END$
DELIMITER ;

select * from Produtos;

SET SQL_SAFE_UPDATES = 0;

DELETE FROM ItensVenda WHERE Venda = 1 AND produto = 1;