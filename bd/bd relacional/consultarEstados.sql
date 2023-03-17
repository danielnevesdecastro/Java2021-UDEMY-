select * from estados

select nome as 'Nome do Estado', sigla, regiao from estados
where regiao = 'sul'

select nome as 'Nome do Estado', sigla from estados
where populacao >= 10 
order by populacao desc