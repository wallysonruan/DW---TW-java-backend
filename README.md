# Back-end Java
Repositório contendo os arquivos dos códigos que escrevi durante o curso BACK-END JAVA do programa INCLUA oferecido pela THOUGHTWORKS, tendo as aulas ministradas pela DIGITAL HOUSE.

## INSIGHTS DA INTERAÇÃO COM OS DEMAIS

  1. A ferramenta *autocomplete* ("autocompletador") que eu costumava pensar ser uma ferramenta "extra", para agilizar o trabalho de digitação, é uma forma importantíssima de acessibilidade para pessoas com baixa mobilidade, como as pessoas tetraplégicas, afinal, a lida com o teclado e/ou a digitação por voz tende a ser letra por letra, e o autocomplete ajuda a minimizar o trabalho.

  2. O _CAPTCHA_ (Completely Automated Public Turing test to tell Computers and Humans Apart, Teste de Turing público completamente automatizado para distinguir entre computadores e pessoas) é totalmente inacessível para as pessoas cegas. É um fato lógico, no entanto, eu nunca havia refletido sobre.

  3. Diferente do que eu costumava pensar, a navegação via terminal é algo ainda atual, não só para pessoas programadoras, como para as pessoas cegas em geral. Isso deve-se ao fato de que o terminal permite que o usuário navegue pelo ambiente virtual por meio de textos apenas, ou seja, não há a necessidade do visual.  

  4. O termo "neurodivergente", além de classificar uma parte específica da população, tal como "surdo e ouvinte", também pode ser usado como um termo guarda-chuva para autoidentificação, por exemplo, no caso de alguém que têm duas ou mais neurodivergências, basta usar o termo supracitado e todas as divergências serão enquadradas, ao invés de usar termos que se referem a apenas uma delas, como "autista", "TDAH", "bipolar", ... .

  5. Para pessoas cegas, o uso simultâneo do chat e da explicação sonora é complicado, pois, quando acontece, serão duas vozes: a do leitor de tela e a do professor ao mesmo tempo, o que dificulta a concentração.  


## ALGORITMOS CODIFICADOS

### FORNECIDOS PELO CURSO

#### MÓDULO 2

Aula 03
Uma pesquisa para uma empresa contendo as seguintes perguntas: 

  1. Qual é o seu nome?; 
  2. Há quanto tempo trabalha aqui?;
  3. Qual é o seu salário atual?;

Ao fim delas, se a pessoa funcionária tiver mais de 10 anos de trabalho, o salário dela aumentará 10%. Após o cálculo, o algoritmo deve mostrar o nome do funcionário e o salário novo.

### PESQUISADOS PARALELAMENTE

#### ESTUDOS DE ESTRUTURAS

##### LINHA DO TEMPO (ITERAÇÃO, REPETIÇÃO)

Após uma experiência envolvendo um infográfico de uma linha do tempo, estive a pensar na existência de programas que recebiam uma série de acontecimento e devolvia uma linha do tempo organizada cronologicamente. Curioso sobre como seria a lógica de tais programas, escrevi um em JAVA.

Meu programa é bem simples, ele recebe os seguintes inputs:
  1. Nome da linha do tempo;
  2. Acontecimento;
  3. Ano do acontecimento.

Opções do programa:
  1. Oferece a opção de adicionar ou não mais de um acontecimento.

O que aprendi?

Por já ter conhecimento em outras linguagens o novo aprendizado envolveu:
  1. Prática da sintaxe do JAVA, o que envolve a tipagem das variáveis;
  3. Construção de arrays, o que ainda devo me aprofundar.
  3. Prática no uso da ferramenta Scanner. Por exemplo, aprendi que os comandos: *System.util.Scanner.next()* e o *System.util.Scanner.nextLine()* são diferentes, o primeiro recebe apenas uma cadeia de String (uma palavra) e o segundo recebe toda uma linha (textos).

##### NÚMEROS PARES OU ÍMPARES? (ITERAÇÃO, MÓDULO)

Programa que recebe um número inicial e um final, além de receber o tipo de número desejado, isto é, par ou ímpar. Após os parâmetros terem sido declarados o programa itera o intervalo de números que há entre o INICIAL e o FINAL e devolve apenas os que são pares ou ímpares, a depender da escolha do usuário.

O que aprendi?

1. A usar o operador MÓDULO (%), que divide um número pelo outro e retorna apenas o resto, ou seja, o que há no lado direito do ponto final, isto é, se o resultado for "0.1" o operador retornará 1.
2. Prática relacionada à construção de funções em JAVA, são criadas ao declarar que são do tipo VOID e que recebem parâmetros.

### ESTRUTURAS VISANDO POO
Nem todas as classes abaixo terão sido criadas no momento em que eu as registrar neste README, tratam-se apenas de ideia. Para registrar quais já foram criadas e quais não, irei utilizar o recurso TASK LIST do MarkDown.

- [ ] FUNCIONARIO (CRIAÇÃO, REUTILIZAÇÃO, ABSTRAÇÃO, "THIS")

#### Funções Desejadas e Funções Já Adicionadas
  1. Mudar o nome;
  2. Mudar o cargo;
  3. Aumentar o salário;
  4. Mostrar todos os dados.

<br>

- [ ] WHATSAPP (CRIAÇÃO, REUTILIZAÇÃO, ABSTRAÇÃO, "THIS", RETURN, SETTLERS, GETTERS)
  
Representação da classe Whatsapp, usando a UML (Unified Modeling Language) – aprendi o básico dela no dia 15/05/2022.

|Nº|Whatsapp|
|---| :--- |
|0|- userNumber|
|1|- userName|
|2|- historicNames|
|3|- totalContacts|
|4|+ setNumber()|
|5|+ changeNumber()|
|6|+ setUserName()|
|7|+ changeUserName()|

|Nº|Contato|
|---| :--- |
|0|- id|
|1|- name|
|2|- historicNames|
|3|- number|
|4|+ setUserName()|
|5|+ changeUserName()|
|6|+ setNumber()|
|7|+ changeNumber()|

#### Funções Desejadas e Funções Já Adicionadas
- [ ] Adicionar nome;
- [ ] Alterar o nome (mantendo registro de todas as alterações);
- [ ] Adicionar um número de telefone;
- [ ] Adicionar um número de telefone (mantendo registro de todas as alterações);
- [ ] Criar contatos;
- [ ] Editar contatos;
- [ ] Apagar contatos.

## Aprendizados
15/05/2022: Aprendi a criar funções e métodos que retornam algum valor, a diferença é bem pouca, como é possível ver abaixo.

FUNÇÃO:

*public static **void** NOME(  ){ --corpo--;}*

MÉTODO QUE RETORNA ALGO:

*public **TipoDoRetorno** NOME(  ){**return** oQueSeráRetornado;}*
