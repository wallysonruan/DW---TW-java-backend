-- Selecione os 50 primeiros registros da tabela de países
select * from world.country limit 50;

-- Selecione os registros de 51 à 60 da tabela de países
select * from world.country limit 10 offset 50;

-- Selecione os 10 primeiros registros  das cidades com mais de 10.000 habitantes da tabela cidades
select * from world.city where world.city.population > '10000' limit 10;

-- Selecione os registros de 11 à 20 com até 10.000 habitantes da tabela cidades e ordene alfabeticamente pelo nome das cidades
select * from world.city where world.city.population > '10000' order by world.city.name limit 10 offset 10;