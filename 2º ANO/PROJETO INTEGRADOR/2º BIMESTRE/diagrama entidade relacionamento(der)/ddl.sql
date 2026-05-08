-- ==============================================================================
-- SCRIPT DDL: GESCONP - Sistema de Gestão de Contratos Públicos (PostgreSQL)
-- ==============================================================================

-- 1. TABELAS DOMÍNIO ORGANIZACIONAL E CADASTROS BASE (Sem dependências)

CREATE TABLE orgaos (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    sigla VARCHAR(20) NOT NULL
);

CREATE TABLE fornecedores (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cnpj VARCHAR(14) UNIQUE NOT NULL,
    email VARCHAR(255)
);

CREATE TABLE categorias (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE usuarios (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    matricula VARCHAR(50) UNIQUE NOT NULL,
    perfil VARCHAR(20) NOT NULL, -- Ex: GESTOR, FISCAL, AUDITOR, ADMIN
    senha_hash VARCHAR(255) NOT NULL
);

-- 2. NÚCLEO TRANSACIONAL (Depende dos cadastros base)

CREATE TABLE contratos (
    id BIGSERIAL PRIMARY KEY,
    numero VARCHAR(50) UNIQUE NOT NULL,
    objeto TEXT NOT NULL,
    valor_total NUMERIC(15,2) NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    status VARCHAR(20) NOT NULL,      -- Ex: ATIVO, ENCERRADO, INATIVO, SUSPENSO
    risco_atual VARCHAR(20) NOT NULL, -- Ex: BAIXO, MEDIO, ALTO
    orgao_id BIGINT NOT NULL REFERENCES orgaos(id),
    fornecedor_id BIGINT NOT NULL REFERENCES fornecedores(id),
    categoria_id BIGINT NOT NULL REFERENCES categorias(id)
);

-- 3. EXECUÇÃO E ADITIVOS (Dependem de Contratos)

CREATE TABLE execucao_financeira (
    id BIGSERIAL PRIMARY KEY,
    nota_empenho VARCHAR(50) NOT NULL,
    descricao_fatura TEXT,
    valor_empenhado NUMERIC(15,2) NOT NULL,
    data_empenho DATE NOT NULL,
    valor_liquidado NUMERIC(15,2),
    data_liquidacao DATE,
    valor_pago NUMERIC(15,2),
    data_pagamento DATE,
    status VARCHAR(20) NOT NULL, -- Ex: EMPENHADO, LIQUIDADO, PAGO, CANCELADO
    contrato_id BIGINT NOT NULL REFERENCES contratos(id)
);

CREATE TABLE aditivos (
    id BIGSERIAL PRIMARY KEY,
    data_assinatura DATE NOT NULL,
    valor_alterado NUMERIC(15,2),
    prazo_extensao_dias INT,
    tipo VARCHAR(20) NOT NULL, -- Ex: VALOR, PRAZO, ESCOPO
    contrato_id BIGINT NOT NULL REFERENCES contratos(id)
);

-- 4. FISCALIZAÇÃO, INTELIGÊNCIA E DOCUMENTOS (Dependem de Contratos e Usuários)

CREATE TABLE documentos (
    id BIGSERIAL PRIMARY KEY,
    nome_arquivo VARCHAR(255) NOT NULL,
    url_storage VARCHAR(500) NOT NULL,
    tipo VARCHAR(50) NOT NULL, -- Ex: ATA, EMPENHO, ADITIVO, EXTRATO
    mime_type VARCHAR(100) NOT NULL,
    tamanho_bytes BIGINT NOT NULL,
    hash_integridade VARCHAR(256) NOT NULL,
    data_upload TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    contrato_id BIGINT NOT NULL REFERENCES contratos(id)
);

CREATE TABLE fiscalizacoes (
    id BIGSERIAL PRIMARY KEY,
    data DATE NOT NULL,
    parecer TEXT NOT NULL,
    nota_qualidade NUMERIC(3,2) NOT NULL,
    nota_prazo NUMERIC(3,2) NOT NULL,
    nota_conformidade NUMERIC(3,2) NOT NULL,
    aprovado BOOLEAN NOT NULL,
    contrato_id BIGINT NOT NULL REFERENCES contratos(id),
    usuario_id BIGINT NOT NULL REFERENCES usuarios(id)
);

CREATE TABLE ocorrencias (
    id BIGSERIAL PRIMARY KEY,
    descricao TEXT NOT NULL,
    gravidade VARCHAR(20) NOT NULL, -- Ex: BAIXA, MEDIA, ALTA
    data DATE NOT NULL,
    contrato_id BIGINT NOT NULL REFERENCES contratos(id)
);

CREATE TABLE alertas (
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    mensagem TEXT NOT NULL,
    tipo VARCHAR(30) NOT NULL, -- Ex: RISCO_ELEVADO, SALDO_CRITICO, VENCIMENTO_PROXIMO
    data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    lido BOOLEAN NOT NULL DEFAULT FALSE,
    contrato_id BIGINT NOT NULL REFERENCES contratos(id),
    usuario_id BIGINT REFERENCES usuarios(id)
);

-- 5. AUDITORIA (Depende de Usuários)

CREATE TABLE logs_auditoria (
    id BIGSERIAL PRIMARY KEY,
    operacao VARCHAR(100) NOT NULL,
    entidade_afetada VARCHAR(100) NOT NULL,
    entidade_id BIGINT NOT NULL,
    dados_anteriores JSONB,
    dados_novos JSONB,
    ip VARCHAR(45),
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    usuario_id BIGINT REFERENCES usuarios(id)
);