CREATE TABLE cliente
(cpf integer primary key not null,
rg integer not null,
nome varchar(20) not null,
sobrenome varchar(50) not null,
sexo varchar(10) not null,
datanascimento date not null,
datacadastro date not null,
estadocivil varchar(15) not null,
telefone varchar(13) not null,
celular varchar(13) not null,
email varchar(50) not null,
endereco varchar(50) not null,
logadouro varchar(50) not null,
bairro varchar(50) not null,
numero integer not null,
cep integer not null,
estado varchar(2) not null,
complemento varchar(50) not null,
referencia varchar(100) not null
);