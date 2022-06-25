-- Selecionar os nomes e códigos dos países, renomeando as colunas com suas traduções em português
select world.country.name NOME, world.country.code CÓDIGO from world.country;

-- Selecione todos os países da tabela países e renomeie a tabela para seu nome em português
select world.country.name NOME from world.country;