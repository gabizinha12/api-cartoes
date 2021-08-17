DROP TABLE IF EXISTS CARTAO;
create table CARTAO
(
id bigint(20) not null auto_increment,
codigo_Pacote varchar(255) not null,
nome_Pacote varchar(255) not null,
valor_Pacote decimal(19,2) not null,
primary key(id)
);

INSERT INTO CARTAO(codigo_Pacote, nome_Pacote, valor_Pacote) VALUES(1, 'Basic', '0.00');
INSERT INTO CARTAO(codigo_Pacote, nome_Pacote, valor_Pacote) VALUES(2, 'Silver', '70.00');
INSERT INTO CARTAO(codigo_Pacote, nome_Pacote, valor_Pacote) VALUES(3, 'Black', '800.00');
INSERT INTO CARTAO(Codigo_Pacote, nome_Pacote, valor_Pacote) VALUES(4, 'Gold', '200.00');

