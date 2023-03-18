select * from prefeitos;
select * from cidade;

-- join entre tabelas 
select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id;
select * from prefeitos p left outer join cidades c on p.cidade_id = c.id ;
select * from cidades c right join prefeitos p on c.id = p.cidade_id;
-- select * from cidades c full join prefeitos p on c.id = p.cidade_id; nao suportado pelo my sql

-- opção substituta ao full join
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union -- union all tras as duplicações também
select * from cidades c right join prefeitos p on c.id = p.cidade_id;