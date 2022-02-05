-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Dez-2021 às 22:01
-- Versão do servidor: 10.4.20-MariaDB
-- versão do PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pdv`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `cod_cs` int(11) NOT NULL,
  `nome` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `logradouro` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `complemento` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bairro` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `logradouro_num` char(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cidade` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cep` char(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `documento` varchar(14) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cod_cs`, `nome`, `email`, `telefone`, `logradouro`, `complemento`, `bairro`, `logradouro_num`, `cidade`, `estado`, `cep`, `documento`) VALUES
(1, 'Bruno Luís Caleb da Cruz', 'brunoluiscalebdacruz_@hawk.com.br', '69985723919', 'Avenida Campos Sales', '', 'Conceição', '200', 'Porto Velho', NULL, '76808389', '95504503680'),
(2, 'Elaine Jéssica da Cunha', 'elainejessicadacunha@rodomen.com.br', '92982797995', 'Rua Anselmo Duarte', '', 'Puraquequara', '935', 'Manaus', NULL, '69009220', '88206205101'),
(3, 'Yasmin Luciana Almada', 'yasminlucianaalmada@oul.com.br', '85943523524', 'Rua da Umburana', '', 'Jardim das Oliveiras', '23A', 'Fortaleza', NULL, '60820230', '37929022650'),
(4, 'Nathan Daniel Luís Assis', 'nathandanielluisassis_@bemarius.com.br', '11945324123', 'Rua São Francisco de Assis', 'Galpão Leste', 'Santa Mônica', '45', 'Feira de Santana', NULL, '44077660', '31591022000105'),
(5, 'Valentina Rafaela Cristiane da Costa', 'valentinarafaelacristianedacosta@gmaill.com', '22353423423', 'Rua Pastor Braff', '', 'Cohafaba III Plano', '345', 'Dourados', NULL, '79826210', '43893897690'),
(7, 'Gael Lorenzo Silva', 'gaellorenzosilva_@contabilidaderangel.com.br', '34512421234', 'Rua Cruz e Souza', '', 'Candelária', '', 'Natal', NULL, '59065530', '17011666000148');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `cod_fun` int(11) NOT NULL,
  `nome` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cargo` varchar(40) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`cod_fun`, `nome`, `email`, `cargo`) VALUES
(1, 'Rodrigo Vicente Lorenzo Rodrigues', 'rodrigovicentelorenzorodrigues@pobox.com', 'Técnico(a)'),
(2, 'Caroline Maitê Andreia Nogueira', 'carolinemaaiteandreianogueira@netservicos.com.br', 'Vendedora'),
(3, 'Lúcia Isis Nunes', 'luciaisisnunes..luciaisisnunes@academiahct.com.br', 'Técnico(a)'),
(4, 'André Geraldo da Cruz', 'aandregeraldodacruz@dicid.com.br', 'Supervisor'),
(5, 'Martin Tomás Ruan Santos', 'martintomasruansantos-81@iq.unesp.br', 'Técnico(a)'),
(6, 'Leonardo Renan Rodrigo Nunes', 'leonardorenanrodrigonunes@geometrabte.com.br', 'Gerente');

-- --------------------------------------------------------

--
-- Estrutura da tabela `integra`
--

CREATE TABLE `integra` (
  `quantidade_serv` int(11) NOT NULL,
  `fk_servico_cod_serv` int(11) NOT NULL,
  `fk_ordem_servico_cod_os` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `integra`
--

INSERT INTO `integra` (`quantidade_serv`, `fk_servico_cod_serv`, `fk_ordem_servico_cod_os`) VALUES
(1, 1, 1),
(1, 3, 1),
(1, 1, 3),
(1, 2, 3),
(1, 3, 4),
(2, 3, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ordem_servico`
--

CREATE TABLE `ordem_servico` (
  `cod_os` int(11) NOT NULL,
  `dia` date NOT NULL,
  `problema` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `valor_total` decimal(9,2) NOT NULL,
  `metodo_pagamento` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `fk_cliente_cod_cs` int(11) NOT NULL,
  `fk_funcionario_cod_fun` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `ordem_servico`
--

INSERT INTO `ordem_servico` (`cod_os`, `dia`, `problema`, `valor_total`, `metodo_pagamento`, `fk_cliente_cod_cs`, `fk_funcionario_cod_fun`) VALUES
(1, '2021-09-20', 'Manutenção da placa mãe', '195.50', 'Débito', 4, 3),
(2, '2021-10-21', 'Instalção de memória RAM e HD', '151.00', 'Crédito', 7, 2),
(3, '2021-11-02', 'Limpeza do processador', '170.00', 'Crédito (x2)', 1, 3),
(4, '2021-11-25', 'Instalação de HD', '75.50', 'Crédito (x3)', 3, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `participa`
--

CREATE TABLE `participa` (
  `quantidade_total` int(11) NOT NULL,
  `fk_venda_cod_vend` int(11) NOT NULL,
  `fk_produto_cod_prod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `participa`
--

INSERT INTO `participa` (`quantidade_total`, `fk_venda_cod_vend`, `fk_produto_cod_prod`) VALUES
(2, 1, 1),
(1, 2, 4),
(2, 3, 6),
(1, 4, 2),
(2, 5, 1);

--
-- Acionadores `participa`
--
DELIMITER $$
CREATE TRIGGER `baixa_estoque` AFTER INSERT ON `participa` FOR EACH ROW BEGIN
	UPDATE produto SET quantidade = quantidade - new.quantidade_total where cod_prod = new.fk_produto_cod_prod;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `cod_prod` int(11) NOT NULL,
  `nome` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `categoria` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `valor_unit` decimal(9,2) NOT NULL,
  `quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`cod_prod`, `nome`, `categoria`, `valor_unit`, `quantidade`) VALUES
(1, 'ASRock B450M Steel Legend', 'Placa-Mãe', '700.00', 8),
(2, 'Asus TUF B360M-Plus Gaming/BR', 'Placa-Mãe', '630.50', 5),
(4, 'Seagate BarraCuda | 3TB', 'HD', '238.00', 7),
(5, 'Kingston A400 | 240GB', 'SSD', '365.34', 8),
(6, 'XPG Spectrix D45G | 8GB | 3600MHz | DDR4', 'Memória RAM', '260.90', 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

CREATE TABLE `servico` (
  `cod_serv` int(11) NOT NULL,
  `nome` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `valor` decimal(9,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `servico`
--

INSERT INTO `servico` (`cod_serv`, `nome`, `valor`) VALUES
(1, 'Manutenção', '120.00'),
(2, 'Limpeza', '50.00'),
(3, 'Instalação', '75.50'),
(4, 'Reparo', '130.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabelateste`
--

CREATE TABLE `tabelateste` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `idade` int(11) DEFAULT NULL,
  `sexo` char(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cidade` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `tabelateste`
--

INSERT INTO `tabelateste` (`id`, `nome`, `idade`, `sexo`, `cidade`) VALUES
(1, 'Matheus', 22, 'M', 'Embu-Guacu'),
(4, 'Bruno', 22, 'M', 'Indaiatuba'),
(5, 'Gusatavo', 25, 'M', 'Sao Paulo'),
(6, 'Arthur', 20, 'M', 'Embu-Guacu'),
(11, 'Charlie', 30, 'M', 'Santos'),
(12, 'Mano Brown', 40, 'M', 'Quebrada'),
(14, 'Yoda', 18, 'M', 'FON'),
(15, 'Isabella', 22, 'F', 'Embu-Guacu');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `cod_vend` int(11) NOT NULL,
  `dia` date NOT NULL,
  `valor_total` decimal(9,2) NOT NULL,
  `metodo_pagamento` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `fk_cliente_cod_cs` int(11) NOT NULL,
  `fk_funcionario_cod_fun` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`cod_vend`, `dia`, `valor_total`, `metodo_pagamento`, `fk_cliente_cod_cs`, `fk_funcionario_cod_fun`) VALUES
(1, '2021-03-12', '1400.00', 'Débito', 1, 2),
(2, '2021-03-23', '238.00', 'Débito', 2, 3),
(3, '2021-05-22', '521.80', 'Débito', 4, 4),
(4, '2021-05-22', '630.50', 'Crédito (x5)', 2, 3),
(5, '2021-11-02', '1400.00', 'Débito', 3, 2);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cs`),
  ADD UNIQUE KEY `documento` (`documento`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cod_fun`);

--
-- Índices para tabela `integra`
--
ALTER TABLE `integra`
  ADD KEY `fk_servico_cod_serv` (`fk_servico_cod_serv`),
  ADD KEY `fk_ordem_servico_cod_os` (`fk_ordem_servico_cod_os`);

--
-- Índices para tabela `ordem_servico`
--
ALTER TABLE `ordem_servico`
  ADD PRIMARY KEY (`cod_os`),
  ADD KEY `fk_cliente_cod_cs` (`fk_cliente_cod_cs`),
  ADD KEY `fk_funcionario_cod_fun` (`fk_funcionario_cod_fun`);

--
-- Índices para tabela `participa`
--
ALTER TABLE `participa`
  ADD KEY `fk_venda_cod_vend` (`fk_venda_cod_vend`),
  ADD KEY `fk_produto_cod_prod` (`fk_produto_cod_prod`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`cod_prod`);

--
-- Índices para tabela `servico`
--
ALTER TABLE `servico`
  ADD PRIMARY KEY (`cod_serv`);

--
-- Índices para tabela `tabelateste`
--
ALTER TABLE `tabelateste`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`cod_vend`),
  ADD KEY `fk_cliente_cod_cs` (`fk_cliente_cod_cs`),
  ADD KEY `fk_funcionario_cod_fun` (`fk_funcionario_cod_fun`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cod_cs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `cod_fun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `ordem_servico`
--
ALTER TABLE `ordem_servico`
  MODIFY `cod_os` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `cod_prod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `servico`
--
ALTER TABLE `servico`
  MODIFY `cod_serv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tabelateste`
--
ALTER TABLE `tabelateste`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `cod_vend` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `integra`
--
ALTER TABLE `integra`
  ADD CONSTRAINT `integra_ibfk_1` FOREIGN KEY (`fk_servico_cod_serv`) REFERENCES `servico` (`cod_serv`),
  ADD CONSTRAINT `integra_ibfk_2` FOREIGN KEY (`fk_ordem_servico_cod_os`) REFERENCES `ordem_servico` (`cod_os`);

--
-- Limitadores para a tabela `ordem_servico`
--
ALTER TABLE `ordem_servico`
  ADD CONSTRAINT `ordem_servico_ibfk_1` FOREIGN KEY (`fk_cliente_cod_cs`) REFERENCES `cliente` (`cod_cs`),
  ADD CONSTRAINT `ordem_servico_ibfk_2` FOREIGN KEY (`fk_funcionario_cod_fun`) REFERENCES `funcionario` (`cod_fun`);

--
-- Limitadores para a tabela `participa`
--
ALTER TABLE `participa`
  ADD CONSTRAINT `participa_ibfk_1` FOREIGN KEY (`fk_venda_cod_vend`) REFERENCES `venda` (`cod_vend`),
  ADD CONSTRAINT `participa_ibfk_2` FOREIGN KEY (`fk_produto_cod_prod`) REFERENCES `produto` (`cod_prod`);

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`fk_cliente_cod_cs`) REFERENCES `cliente` (`cod_cs`),
  ADD CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`fk_funcionario_cod_fun`) REFERENCES `funcionario` (`cod_fun`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
