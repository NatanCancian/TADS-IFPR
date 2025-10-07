create schema campeonato;
use campeonato;

create table Partida(
    id_Partida int not null auto_increment,
    nome_jogo varchar(100) not null,
    fornecedor_jogo varchar(100) not null,
    hora_inicio DATETIME not null,
    hora_fim DATETIME not null,
    num_jogadores int not null,
    primary key (id_Partida)
);

create table Jogador(
    id_Jogador int not null auto_increment,
    nome_jogador varchar(100) not null,
    nivel_jogador int not null,
    primary key (id_Jogador)
);

create table JogandoPartida(
    id_NumeroPartida int not null auto_increment,
    id_Part int not null,
    id_Jog int not null UNIQUE,
    hora_entrada DATETIME,
    hora_saida DATETIME,
    qtd_jogadores int,
    status ENUM('encerrado','em andamento'),
    primary key (id_NumeroPartida),
    constraint jogador_partida UNIQUE(id_Jog, id_Part),
    constraint fk_partida foreign key(id_Part) references Partida(id_Partida),
    constraint fk_jogador foreign key(id_Jog) references Jogador(id_Jogador)
);

insert into Jogador (nome_jogador, nivel_jogador) values ('Zezão', 1, ), ('Carlin', 5);

insert into Partida (nome_jogo, fornecedor_jogo, hora_inicio, hora_fim, num_jogadores) values
('LOL', 'RIOT Games', NOW(), '2025-09-11 15:30:00', 2);

insert into JogandoPartida (id_Part, id_Jog, hora_entrada) values (1, 2, '2025-09-11 14:00:00');
-- View a)

CREATE VIEW vw_PartidaJogador
SELECT j.nome_jogador AS Jogo, p.nome_jogo AS Partida
FROM JogandoPartida jp
JOIN Jogador j ON j.id_jogador = jp.id_Jog
JOIN Partida p ON p.id_Partida = jp.id_Part;

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
    insert into JogandoPartida(id_Jog, id_Part, hora_entrada, qtd_jogadores)
    values (idj, idp, h_inicio, (SELECT qtd_jogadores + 1 FROM JogandoPartida WHERE id_Part = idp));
    -- Vai incrementar o nº de jogadores toda vez q 1 jogador for inserido 
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

-- Procedure d)

DELIMITER $
CREATE PROCEDURE proc_jogador_sai(IN idj int, IN idp int)
BEGIN
    DELETE id_Jog 
    FROM JogandoPartida
    WHERE id_Jog = idj and id_Part = idp;
END $
DELIMITER ;

-- Procedure auxiliar para a e)

DELIMITER $
CREATE PROCEDURE proc_contar_jogadores(OUT id_Jog int)
BEGIN
    SELECT COUNT(id_Jog) FROM JogandoPartida;
END $
DELIMITER ;

-- Trigger e)

DELIMITER $
CREATE TRIGGER tgr_atualiza_jogadores
AFTER DELETE ON JogandoPartida
FOR EACH ROW
BEGIN
     UPDATE Partida
    SET num_jogadores = GREATEST(num_jogadores - 1, 0)
    WHERE id_Partida = OLD.id_Part;
END $
DELIMITER ;

