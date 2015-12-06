CREATE TABLE produto
(codigo integer primary key ,
nome varchar(20) not null,
marca varchar(50) not null,
modelo varchar(50) not null,
descricao varchar(50) not null,
datacompra date not null,
quantidade integer not null,
valorunitario decimal not null,
valorcompra decimal not null
);
