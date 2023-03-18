insert into empresas (nome, cnpj)
values
    ('Bradesco', 9565465162),
    ('Vale', 46546516464),
    ('Cielo', 034134656554);


-- modificando valor do tipo da coluna em uma tabela 
alter table empresas modify cnpj varchar(14);

select * from empresas
select * from empresas_unidades

-- descreve conteudo da tabela
desc empresas;


insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1);