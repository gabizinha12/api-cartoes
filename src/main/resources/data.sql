drop table if exists PACOTE_CARTAO;

create table PACOTE_CARTAO
(
id bigint(20) not null auto_increment,
codigoPacote varchar(255) not null,
nomePacote varchar(255) not null,
valorPacote decimal(19,2) not null,
primary key(id)
);

INSERT INTO PACOTE_CARTAO(codigoPacote, nomePacote, valorPacote) VALUES(1, 'Basic', '0.00');
INSERT INTO PACOTE_CARTAO(codigoPacote, nomePacote, valorPacote) VALUES(2, 'Silver', '70.00');
INSERT INTO PACOTE_CARTAO(codigoPacote, nomePacote, valorPacote) VALUES(3, 'Black', '800.00');
INSERT INTO PACOTE_CARTAO(CodigoPacote, nomePacote, valorPacote) VALUES(4, 'Gold', '200.00');

