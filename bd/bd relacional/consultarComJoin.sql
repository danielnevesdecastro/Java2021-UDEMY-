 --igualando chaves para correlacionar tabelas, de forma coerente, através de um filtro
select 
    e.nome as 'Estado',
    c.nome as Cidade ,
    regiao 
    from estados e , cidades c 
where e.id = c.estado_id


--Usando inner join pra juntar tabelas 
select 
    c.nome as Cidade,
    e.nome as Estado,
    regiao as Regiao
from estados e
inner join cidades c on e.id = c.estado_id --
