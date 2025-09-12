create schema campeonato;
use campeonato;

create table Partida(
    id_Partida int not null auto_increment,
    nome_jogo varchar(100) not null,
    fornecedor_jogo varchar(100) not null,
    hora_inicio DATETIME not null,
    hora_fim DATETIME not null,
    num_jogadores int(20) not null,
    primary key (id_Partida)
);

create table Jogador(
    id_Jogador int not null auto_increment,
    nome_jogador varchar(100) not null,
    nivel_jogador int(10) not null,
    primary key (id_Jogador)
);

create table JogandoPartida(
    id_NumeroPartida int not null auto_increment,
    id_Part int not null,
    id_Jog int not null UNIQUE,
    hora_entrada DATETIME,
    hora_saida DATETIME,
    primary key (id_NumeroPartida),
    constraint jogador_partida UNIQUE(id_Jog, id_Part),
    constraint fk_partida foreign key(id_Part) references Partida(id_Partida),
    constraint fk_jogador foreign key(id_Jog) references Jogador(id_Jogador)
);

insert into Jogador (nome_jogador, nivel_jogador) values ('Zezão', 1, ), ('Carlin', 5);

insert into Partida (nome_jogo, fornecedor_jogo, hora_inicio, hora_fim, num_jogadores) values
('LOL', 'RIOT Games', '2025-09-11 14:00:00', '2025-09-11 15:30:00', 2);

insert into JogandoPartida (id_Part, id_Jog, hora_entrada) values (1, 2, '2025-09-11 14:00:00');

--Verificar depois como fica a questão de finalizar a partida (criar trigger q inclui o hora_fim em partida ou em jogandoPartida)

-- View a)
CREATE VIEW vw_PartidaJogador
AS SELECT Jogador.nome_jogador as Jogo, Partida.nome_jogo, as Partida 
FROM JogandoPartida WHERE Jogador.id_Jogador = JogandoPartida.id_Jog; 

-- Procedure b)
DELIMITER $
CREATE PROCEDURE proc_insere_jogador(IN idj int, IN idp int)
BEGIN

    DECLARE h_inicio DATETIME;

    SELECT hora_inicio INTO h_inicio
    FROM Partida
    WHERE id_partida = idp;

    IF NOT EXISTS(
        SELECT 1 FROM JogandoPartida
        WHERE id_Jog = idj AND id_partida = idp
    ) THEN
    insert into JogandoPartida(id_Jog, id_Part, hora_entrada)
    values (idj, idp, h_inicio);
    END IF;
END $
DELIMITER ;

-- Trigger c)
DELIMITER $
CREATE TRIGGER TGR_atualiza_partida_Insert 
AFTER INSERT ON JogandoPartida 
FOR EACH ROW 
BEGIN 
    UPDATE Partida 
    SET num_jogadores = num_jogadores + 1
    WHERE Id_Partida =  NEW.id_Part;
END $
DELIMITER ;