CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

CREATE TABLE livros (
id_livro INT AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(100) NOT NULL,
autor VARCHAR(100) NOT NULL,
ano_publicacao INT,
status ENUM('disponível', 'emprestado') DEFAULT 'disponível'
);

INSERT INTO livros (titulo, autor, ano_publicacao, status)
VALUES
('Dom Casmurro', 'Machado de Assis', 1899, 'disponível'),
('O Cortiço', 'Aluísio Azevedo', 1890, 'disponível'),
('Memórias Póstumas de Brás Cubas', 'Machado de Assis', 1881, 'disponível');

CREATE TABLE emprestimos (
id_emprestimo INT AUTO_INCREMENT PRIMARY KEY,
id_livro INT NOT NULL,
nome_cliente VARCHAR(100) NOT NULL,
telefone_cliente VARCHAR(20) NOT NULL,
data_emprestimo DATE NOT NULL,
data_devolucao DATE,
FOREIGN KEY (id_livro) REFERENCES livros(id_livro)
);

DELIMITER $
CREATE TRIGGER trg_emprestimo_insert
AFTER INSERT ON emprestimos
FOR EACH ROW
BEGIN
UPDATE livros
SET status = 'emprestado'
WHERE id_livro = NEW.id_livro;
END$;

DELIMITER ;

DELIMITER $
CREATE TRIGGER trg_emprestimo_update
AFTER UPDATE ON emprestimos
FOR EACH ROW
BEGIN
IF NEW.data_devolucao IS NOT NULL THEN
UPDATE livros
SET status = 'disponível'
WHERE id_livro = NEW.id_livro;
END IF;
END$;

DELIMITER ;

#TESTE DISPARADOR DA TRIGGER trg_emprestimo_insert
INSERT INTO emprestimos(id_livro, nome_cliente,telefone_cliente,data_emprestimo) values (1, "Zezinhao", "45-1234-5678", "2025-05-22");
select * from emprestimos;
select * from livros;

#TESTE DISPARADOR DA TRIGGER trg_emprestimo_update
UPDATE emprestimos
SET id_livro = 1, data_devolucao = now()
WHERE id_emprestimo = 1;
select * from emprestimos;
select * from livros;
