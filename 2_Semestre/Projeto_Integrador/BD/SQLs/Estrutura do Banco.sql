CREATE TABLE cliente (
    cod_cs INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    email VARCHAR(60),
    telefone VARCHAR(11),
    logradouro VARCHAR(40),
    complemento VARCHAR(40),
    bairro VARCHAR(40),
    logradouro_num CHAR(5),
    cidade VARCHAR(40),
    estado VARCHAR(40),
    cep CHAR(8),
    documento VARCHAR(14) UNIQUE NOT NULL
);

CREATE TABLE produto (
    cod_prod INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    categoria VARCHAR(40) NOT NULL,
    valor_unit NUMERIC(9,2) NOT NULL,
    quantidade INT NOT NULL
);

CREATE TABLE funcionario (
    cod_fun INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40)  NOT NULL,
    email VARCHAR(60) NOT NULL,
    cargo VARCHAR(40) NOT NULL
);

CREATE TABLE servico (
    cod_serv INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40)  NOT NULL,
    valor NUMERIC(9,2) NOT NULL
);

CREATE TABLE venda (
    cod_vend INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dia DATE NOT NULL,
    valor_total NUMERIC(9,2) NOT NULL,
    metodo_pagamento VARCHAR(40) NOT NULL,
    fk_cliente_cod_cs INT NOT NULL,
    fk_funcionario_cod_fun INT NOT NULL,
    FOREIGN KEY(fk_cliente_cod_cs) REFERENCES cliente(cod_cs),
    FOREIGN KEY(fk_funcionario_cod_fun) REFERENCES funcionario(cod_fun)
);

CREATE TABLE participa (
	quantidade_total INT NOT NULL,
    fk_venda_cod_vend INT NOT NULL,
    fk_produto_cod_prod INT NOT NULL,
    FOREIGN KEY(fk_venda_cod_vend) REFERENCES venda(cod_vend),
    FOREIGN KEY(fk_produto_cod_prod) REFERENCES produto(cod_prod)
);

CREATE TABLE ordem_servico (
    cod_os INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dia DATE NOT NULL,
    problema VARCHAR(100) NOT NULL,
    valor_total NUMERIC(9,2) NOT NULL,
    metodo_pagamento VARCHAR(40) NOT NULL,
    fk_cliente_cod_cs INT NOT NULL,
    fk_funcionario_cod_fun INT NOT NULL,
    FOREIGN KEY(fk_cliente_cod_cs) REFERENCES cliente(cod_cs),
    FOREIGN KEY(fk_funcionario_cod_fun) REFERENCES funcionario(cod_fun)
);

CREATE TABLE integra (
	quantidade_serv INT NOT NULL,
    fk_servico_cod_serv INT NOT NULL,
    fk_ordem_servico_cod_os INT NOT NULL,
    FOREIGN KEY(fk_servico_cod_serv) REFERENCES servico(cod_serv),
    FOREIGN KEY(fk_ordem_servico_cod_os) REFERENCES ordem_servico(cod_os)
);
