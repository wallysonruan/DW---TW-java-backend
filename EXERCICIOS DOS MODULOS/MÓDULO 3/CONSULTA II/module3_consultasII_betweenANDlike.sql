-- Selecione as cidades que o nome destas começa com a letra A
select world.city.name from world.city where world.city.name like 'A%';

-- Selecione as cidades que possuem entre 10.000 e 20.000 habitantes
select world.city.name, world.city.population from world.city where world.city.population between '10000' and '20000';

-- Selecione países que seus nomes terminam com a letra A
select world.country.name from world.country where world.country.name like '%a';

-- Selecione os países em que as regiões pertencem ao Caribe
select world.country.name from world.country where world.country.region like 'Caribbean';