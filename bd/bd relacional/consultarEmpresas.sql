-- Consulta Relação N pra N 

select e.nome as Empresa , c.nome  from empresas e , cidades c , empresas_unidades eu
where e.id = eu.empresa_id
and c.id = eu.cidade_id
and sede;

select e.nome as Empresa , c.nome  from empresas e , cidades c , empresas_unidades eu
where e.id = eu.empresa_id
and c.id = eu.cidade_id




select * from empresas_unidades
select * from empresas