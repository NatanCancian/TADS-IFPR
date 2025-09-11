create schema assistenciaTecnica;
use assistenciaTecnica;

create table Cliente(
id_Cliente int(4) not null auto_increment,
nome varchar(1000) not null,
cpf varchar(11) not null,
primary key (id_Cliente)
);

create table Equipamento(
id_Equipamento int(4) not null auto_increment,
serial_equi varchar(100) not null,
id_Clien int not null,
primary key (id_Equipamento),
constraint fk1_cliente foreign key(id_Clien) references Cliente(id_Cliente)
);

create table Ordem_Servico(
id_Ordem_servico int(4) not null auto_increment,
id_Equi int not null,
id_Clien int not null,
defeito varchar(1000) not null,
status_os enum ('concluido', 'na bancada', 'aguardando') not null,
primary key (id_Ordem_servico),
constraint fk_Equipamento foreign key(id_Equi) references Equipamento(id_Equipamento),
constraint fk_Cliente foreign key(id_Clien) references Cliente(id_Cliente)
);

INSERT INTO Cliente (nome, cpf) VALUES
('João da Silva', '12345678900'),
('Maria Oliveira', '98765432100'),
('Carlos Souza', '45678912300');

INSERT INTO Equipamento (serial_equi, id_Clien) VALUES
('ABC123456', 1), -- João da Silva
('XYZ987654', 2), -- Maria Oliveira
('LMN456789', 1), -- João da Silva
('QWE321654', 3); -- Carlos Souza

INSERT INTO Ordem_Servico (id_Equi, id_Clien, defeito, status_os) VALUES
(1, 1,'Equipamento não liga', 'concluido'),
(2, 2,'Tela quebrada', 'aguardando'),
(3, 1,'Superaquecimento durante o uso', 'aguardando'),
(4, 3,'Erro no carregamento do sistema', 'na bancada');

#Ex 01
CREATE VIEW vw_nomeClientes_equipamentos AS
SELECT c.nome,e.serial_equi
FROM Cliente c JOIN Equipamento e ON c.id_cliente = e.id_Clien Join Ordem_Servico os ON e.id_Equipamento = os.id_Equi;
SELECT * FROM vw_nomeClientes_equipamentos;

#Ex 02
CREATE VIEW vw_OSeEquipamentosAguardando AS
SELECT id_Ordem_Servico, id_Equi
FROM Ordem_Servico WHERE status_os = 'aguardando';
SELECT * FROM vw_OSeEquipamentosAguardando;

#Ex 03
CREATE VIEW vw_Clientes_Atendidos AS
SELECT nome
FROM Cliente c
JOIN Equipamento e ON c.id_cliente = e.id_Clien
JOIN Ordem_Servico o ON e.id_Equipamento = o.id_Equi;
select * from vw_Clientes_Atendidos;


#Ex 04
CREATE VIEW vw_ClientesEquipamentosAssist AS
SELECT COUNT(id_Clien) AS qtd_clientes, COUNT(id_Equi) AS qtd_equipamentos
FROM Ordem_Servico WHERE id_Clien IS NOT NULL AND id_Equi IS NOT NULL;  
SELECT * FROM vw_ClientesEquipamentosAssist;
