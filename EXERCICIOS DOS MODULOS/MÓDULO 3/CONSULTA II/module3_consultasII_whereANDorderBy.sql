-- Módulo:  3 – Bancos de Dados e Aplicações Web
-- Consultas II WHERE e ORDER BY

-- Selecione o código dos países que falam português
select world.country_language.country_code from world.country_language where world.country_language.language = 'Portuguese';

-- Selecione o nome das cidades com menos de 10.000 habitantes
select world.city.name from world.city where world.city.population < '10000';

-- Selecione o nome das cidades com até 10.000 habitantes
select world.city.name from world.city where world.city.population <= '10000';

-- Selecione os países com mais de 10 milhões de habitantes
select world.country.population from world.country where world.country.population > '10000000';

-- Selecione o nome e a população dos países da Asia e Europa
select world.country.name, world.country.population from world.country where world.country.continent = 'Asia' or world.country.continent = 'Europe';

-- Selecione o nome dos estados brasileiros em ordem alfabética
-- (Ao invés de usar o código BRA, tentar aprender uma forma de fazer com que a busca seja por 'Brazil', ou seja, o SQL pegaria o código BRA e pesquisaria na tabela de países pelo nome Brazil e, se encontrasse, retornaria tal linha)
select world.city.district from world.city where world.city.country_code = 'BRA' order by world.city.district asc;

-- Liste os países de cada continente por ordem decrescente de PIB
select world.country.continent, world.country.name, world.country.capital from world.country order by world.country.continent, world.country.capital desc;

-- Encontre os 5 países com menor densidade populacional do mundo
select world.country.name, world.country.population from world.country order by world.country.population asc limit 5;

-- Encontre os 5 países cujo PIB mais cresceu
select world.country.name, world.country.capital from world.country order by world.country.capital desc limit 5;