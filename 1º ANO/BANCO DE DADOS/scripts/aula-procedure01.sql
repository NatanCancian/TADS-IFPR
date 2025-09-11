create database aulaprocedure;
use aulaprocedure;

create table Funcionario(
	id_funcionario int not null auto_increment,
    nome varchar(40) not null,
    salario int not null, 
    primary key(id_funcionario)
);

insert into Funcionario(nome, salario) values("João Paulo",1000), ("Daniel Silva", 1000), ("Axel Manoel",3200), ("Slash Madureira", 5000);

DELIMITER $

CREATE PROCEDURE proc_aumenta_salario(idf int)
BEGIN
	UPDATE Funcionario 
    SET salario = salario + 300
	WHERE Funcionario.id_funcionario = idf;
END $

DELIMITER ; 

CALL proc_aumenta_salario(2);


DELIMITER $

CREATE PROCEDURE proc_selecionar_funcionario(IN quantidade int)
BEGIN
	SELECT * FROM Funcionario
    LIMIT quantidade;
END $
DELIMITER ;

CALL proc_selecionar_funcionario(2);


DELIMITER $

CREATE PROCEDURE proc_verificar_quantidade_funcionario(OUT quantidade int)
BEGIN
	SELECT COUNT(*) INTO quantidade FROM Funcionario;
END $
DELIMITER ;

CALL proc_verificar_quantidade_funcionario(@total); # @ -> é para criar uma variavel para a saida do procedimento 

SELECT @total;

DROP schema aulaprocedure;