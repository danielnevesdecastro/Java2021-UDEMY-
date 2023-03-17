create table if not exists cidades ( -- if not exists , se nao existir 
    id int unsigned not null auto_increment,-- unsigned, valor sem sinal (positivo), auto incremente (definir valor automaticamente)
    nome varchar (255) not null, -- not null, nao pode ser vazio 
    estado_id int unsigned not null,
    area decimal (10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) references estados (id) -- chave estrangeira 
);

create table if not exists teste (
    id int unsigned not null auto_increment primary key
);


-- deletar tabela se existir
drop table if exists teste;
