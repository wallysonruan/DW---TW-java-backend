# Back-end Java
Repositório contendo as experiências gerais relacionadas ao curso BACK-END JAVA do programa INCLUA oferecido pela THOUGHTWORKS, tendo as aulas ministradas pela DIGITAL HOUSE, além dos aprendizados envolvendo a linguagem JAVA e os arquivos dos códigos que escrevi durante o curso.

SUMÁRIO:

  1. [INSIGHTS DA INTERAÇÃO COM OS DEMAIS](#INSIGHTS-DA-INTERAÇÃO-COM-OS-DEMAIS)
  2. [ALGORITMOS CODIFICADOS](#ALGORITMOS-CODIFICADOS)
     1. [FORNECIDOS PELO CURSO](#FORNECIDOS-PELO-CURSO)
        1. [MÓDULO 2](#MÓDULO-2)
           1. [AULA 03](#aula-03-uma-pesquisa-para-uma-empresa-contendo-as-seguintes-perguntas)
           2. [AULA 08](#aula-08-criando-um-jogo)
           3. [AULA 09 – Heranças e Polimorfismo](#aula-09-aprendendo-a-passar-heranças)
           4. [AULA 11 – Classes Wrappers, Equals e Hash](#aula-11-classes-wrappers-equals-e-hash)
           5. [AULA 12 – STREAM API (List, Stream, ForEach, Map, Reduce e Min Max)](#aula-12-stream-api)
     2. [PESQUISADOS PARALELAMENTE](#pesquisados-paralelamente)
        1. [LINHA DO TEMPO](#1-linha-do-tempo-iteração-repetição)
        2. [NÚMEROS PARES OU ÍMPARES](#2-números-pares-ou-ímpares-iteração-módulo)
        3. [PARÂMETROS](#3-parâmetros)
        4. [CONTADOR DE PALAVRAS](#4-contador-de-palavras)
        5. [CÓDIGO HEX VÁLIDO](#5-código-hex-válido)
        6. [RETORNE O MAIOR E O MENOR NÚMERO](#6-retorne-o-maior-e-o-menor-número)
        7. [CONSERTE UMA CALCULADORA BÁSICA](#7-conserte-uma-calculadora-básica)
        8. [SHIRITORI](#8-shiritori)
<hr>

## INSIGHTS DA INTERAÇÃO COM OS DEMAIS
<br>

  1. A ferramenta *autocomplete* ("autocompletador") que eu costumava pensar ser uma ferramenta "extra", para agilizar o trabalho de digitação, é uma forma importantíssima de acessibilidade para pessoas com baixa mobilidade, como as pessoas tetraplégicas, afinal, a lida com o teclado e/ou a digitação por voz tende a ser letra por letra, e o autocomplete ajuda a minimizar o trabalho.

  2. O _CAPTCHA_ (Completely Automated Public Turing test to tell Computers and Humans Apart, Teste de Turing público completamente automatizado para distinguir entre computadores e pessoas) é totalmente inacessível para as pessoas cegas. É um fato lógico, no entanto, eu nunca havia refletido sobre.

  3. Diferente do que eu costumava pensar, a navegação via terminal é algo ainda atual, não só para pessoas programadoras, como para as pessoas cegas em geral. Isso deve-se ao fato de que o terminal permite que o usuário navegue pelo ambiente virtual por meio de textos apenas, ou seja, não há a necessidade do visual.  

  4. O termo "neurodivergente", além de classificar uma parte específica da população, tal como "surdo e ouvinte", também pode ser usado como um termo guarda-chuva para autoidentificação, por exemplo, no caso de alguém que têm duas ou mais neurodivergências, basta usar o termo supracitado e todas as divergências serão enquadradas, ao invés de usar termos que se referem a apenas uma delas, como "autista", "TDAH", "bipolar", ... .

  5. Para pessoas cegas, o uso simultâneo do chat e da explicação sonora é complicado, pois, quando acontece, serão duas vozes: a do leitor de tela e a do professor ao mesmo tempo, o que dificulta a concentração.  

<hr>
<br>

## ALGORITMOS CODIFICADOS
### FORNECIDOS PELO CURSO
<br>

#### MÓDULO 2

#### AULA 03: Uma pesquisa para uma empresa contendo as seguintes perguntas: 

  1. Qual é o seu nome?; 
  2. Há quanto tempo trabalha aqui?;
  3. Qual é o seu salário atual?;

Ao fim delas, se a pessoa funcionária tiver mais de 10 anos de trabalho, o salário dela aumentará 10%. Após o cálculo, o algoritmo deve mostrar o nome do funcionário e o salário novo.

<br>

#### AULA 08: Criando um jogo:

Na aula 08 foi passado um exercício a ser resolvido em equipe, sendo ele:
  1. Criar uma classe jogador;
  2. O Jogador tem uma arma;
  3. Uma arma deverá ter métodos para "atirar" e "recarregar";
  4. Cada arma gasta uma quantidade diferente de munição por tiro;
  5. Cada arma demora uma quantidade diferente de tempo, em segundos, para recarregar;
  6. Implemente 2 tipos de arma diferentes.


Após a resolução, os professores explicaram sobre o que seria e como usar a ferramenta INTERFACE.

As INTERFACES, basicamente, são um contrato que viabiliza o processo de múltipla herança. Nela são declarados os métodos que todas as classes **devem** ter em comum. Como exemplo abordarei a que criei na minha resolução pós aula.

Criei uma INTERFACE nomeada como "Armas", ela ditará quais os métodos que todas as classes que a extenderem devem ter. Abaixo é possível conferir a estrutura da INTERFACE.


```
public interface Armas {
	public void atirar();
	public void recarregar();
	public void silenciar();
	public void status();
}
```

Para a extenderem as classes devem usar a palavra reservada *extends*, conforme exemplo abaixo.

```
public class Arma implements Armas{
  [...]

  	@Override
	public void silenciar() {
		this.silenciador = (this.silenciador ? false : true);
	}

  [...]
  }
```

Caso a classe que extender a INTERFACE Armas não tiver os métodos acordados, o código retornará um erro. Ou seja, ao extender uma INTERFACE, é **obrigatório** o cumprimento dos termos que lá estão, isto é, a criação dos métodos listados.

Percebam que tanto a INTERFACE Armas quanto a CLASSE Arma têm um método chamado SILENCIAR, na hora de evocá-lo qual o programa deve ativar? Para isso serve a palavra reservada @Override, do Inglês *sobrepor*, ela dirá ao programa que o método contido na classe Arma deve sobrepor ao método contido na INTERFACE. Graças a esse sistema (INTERFACE, EXTENDS e @OVERRIDE) que a linguagem JAVA aplica o conceito de MÚLTIPLA HERANÇA.

<br>

#### AULA 09: Aprendendo a passar HERANÇAS:
<br>

Durante a aula 09 foram passados dois exercícios, listados abaixo.

  1. Criar uma classe abstrata e dessa duas classes concretas, em seguida uma classe principal na qual seriam consumidas as concretas;
  2. Criar uma superclasse com 5 atributos e 1 método, e dessa uma subclasse com 3 atributos e 1 método.

<br>

  EXERCÍCIO 1 – Aprendizados:

  Classe abstrata, como criar e como utilizar. Durante a aula, eu e outros tivemos dúvidas similares, como "Qual é a diferença entre INTERFACE e CLASSE ABSTRATA?". Tivemos essa dúvida porque ambas as ferramentas são uma espécie acordo de padronização das classes que as instanciam e/ou extendem. Perguntamos.

  O prof. Rafael respondeu-nos usando a seguinte tabela (Frisando as diferenças 1, 2, 3 e 6):

<br>

|Nº|Característica|Interface|Classe Abstrata|
|:--|:--|:--|:--|
|1|Herança múltipla|Uma classe pode implementar diversas interfaces|Uma classe pode herdar somente uma classe|
|2|Implementação Padrão|Uma interface não pode conter qualquer tipo de código, muito menos código padrão.|Uma classe abstrata pode fornecer código completo, código padrão ou ter apenas a declaração de seu esqueleto para ser posteriormente sobrescrita.|
|3|Constantes|Suporte somente constantes do tipo estática.|Pode conter constantes estáticas e de instância.
|4|Componentes de terceiros|Uma implementação de uma interface pode ser incluída a qualquer classe de terceiros.|Uma classe de terceiros precisa ser reescrita para estender somente a partir da classe abstrata.
|5|Homogeneidade|Se todas as diversas implementações compartilham a assinatura do método então a interface funciona melhor.|Se as várias implementações são todas do tipo e compartilham um comportamento e status comum , então a classe abstrata funciona melhor.
|6|Manutenção|Se o código do seu cliente conversa somente em termos de uma interface, você pode facilmente alterar a implementação concreta usando  um método factory.|Idêntico
|7|Velocidade|Lento, requer trabalho extra para encontrar o método correspondente na classe atual.|Rápido
|8|Clareza|Todas as declarações de constantes em uma interface são presumidamente publicas ou estáticas.|Você pode por código compartilhado em uma classe abstrata. Você pode usar código para computar o valor inicial de suas constantes e variáveis de instância ou estáticas.
|9|Funcionalidades Adicionais|Se você incluir um novo método em uma interface você precisa ajustar todas as implementações da interface.|Se você incluir um novo método em uma classe abstrata você tem a opção de fornecer uma implementação padrão para ele.

##### *FONTE: [DEVMEDIA – Interfaces x Classes Abstratas](https://www.devmedia.com.br/interfaces-x-classes-abstratas/13337#:~:text=Uma%20interface%20n%C3%A3o%20pode%20conter,esqueleto%20para%20ser%20posteriormente%20sobrescrita.)*
<br>

Em resumo, entendi que a interface é melhor se for desejado apenas a padronização de alguns métodos das classes, enquanto que a classe abstrata é melhor quando várias classes compartilham atributos e métodos similares.

<br>

  EXERCÍCIO 2 – Aprendizados:

  Apenas pratiquei o aplicar dos conceitos em JAVA, pois já tinha experiência de heranças simples em PYTHON.

<br>

#### AULA 11: Classes Wrappers, Equals e Hash:

1. **CLASSES WRAPPERS:** 

Na 11ª aula, o professor Rafael explicou sobre as CLASSES WRAPPERERS, ou, em outras palavras, sobre as variáveis encapsuladas. Eu havia percebido elas ao resolver exercícios paralelos (como o exercício [6](#6-retorne-o-maior-e-o-menor-número)), no entanto, a aula de hoje esclareceu o conceito mais ainda.

Agora entendo porque alguns preferem declarar variáveis `Integer`, ao invés de `int`, fazem isso para que possam utilizar os métodos da classe que encapsula os tipos int e contam com métodos referentes ao tratamentos desses.

2. **EQUALS:**

Finalmente entendi o EQUALS! Rafael explicou que ele serve para comparar `atributos`. Por ser um método padrão dos objetos, é necessário que o EQUALS seja sempre sobrescrito para atender às demandas do programador. Além disso, foi abordada a diferença entre o operador `==` e o método `equals()`. O operador verifica se os objetos apontados estão no mesmo endereço de memória, enquanto que o segundo verifica se o conteúdo dos objetos apontados são iguais. Pude conferir mais detalhes no site [Geeks For Geeks](https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/). 

Nessa aula ele usou o método para comparar se dois objetos da classe CONTA tinham dois atributos idênticos. Escreveu o código abaixo para fazer a validação.

```
@Override
public boolean equals(Object obj){
  if(obj != null && obj instaceof Conta){

    return(
      getNumeroConta().equals(
        (
        (Conta) obj).getNumeroConta() 
        &&
        getAgencia().equals(((Conta) obj).getAgencia()
      )
    );

  }else{
    return false;
  }
}
```

Explicação do código acima, por partes:

  1. 
```
  if(obj != null && obj instaceof Conta){

  }else{
    return false;
  }
```
Se o objeto passado como parâmetro não for nulo e for uma instância da classe Conta execute o bloco de código abaixo, se não, retorne `false`.

  2. 
```
  return(
    getNumeroConta().equals(
      (
      (Conta) obj).getNumeroConta() 
      &&
      getAgencia().equals(((Conta) obj).getAgencia()
    )
  );
```
Retorne o resultado booleano da seguinte lógica:

O número da conta do objeto que está evocando o método `equals` é `equal`(*igual*) ao número da conta do objeto passado como parâmetro para o método **e** a agência do objeto evocador é igual à do objeto passado como parâmetro.


COMPLEMENTO:

Perceba o código abaixo. 

```
(Conta) obj
```

Questionei ao Rafael o porquê de instanciar **novamente** o objeto `obj` (passado como parâmetro) se a condicional já disse que ele é uma instância da classe Conta. Respondeu-me (não com as seguintes palavras) dizendo que a condicional apenas verificou se o `obj` é uma instância da classe Conta, todavia, ele não é encarado como objeto dentro do escopo do método, por isso é necessário instanciá-lo, ou, em outras palavras, reativar o estado de `objeto`.

O código acima é uma forma abreviada de instanciação, sendo equivalente a:

```
Conta obj = new Conta();
```

3. **HASH**

Outra forma de comparar atributos é usando o método `hashCode()`, ele verifica se os atributos têm o mesmo código hash, o retorno desse método é o próprio hash code e não um valor booleano.

<br>

#### AULA 12: Stream API

LIST e STREAM

List é uma interface que, segundo [Jakob Jenkov](https://jenkov.com/tutorials/java-collections/list.html),  é um subtipo da classe Collection, ou seja, herda todos os métodos da Collection. É possível colocar qualquer tipo dentro de uma lista, inclusive objetos de diferentes classes (Integer, Boolean, String, …), no entanto, durante a aula o professor Rafael usou a sintaxe que limita a lista a conter apenas um tipo, por exemplo: `List <String> lista = [...]` .

<br>

MÉTODOS PARA LIDA COM LISTAS

1. FOR EACH

Apenas itera sobre os itens de uma lista e, a cada iteração, realiza a função que há dentro do escopo dele. Exemplo:

```
List<Integer> numbers = Arrays.asList(1,2,3);
numbers.forEach( (Integer number) -> {
  System.out.println(number);
  });

//Result: 
1
2
3
```

Explicação do código acima, por partes:

1. 
```
List<Integer> numbers = Arrays.asList(1,2,3);
```
A variável `numbers` receberá a seguinte lista: `[1,2,3]` – dentro da lista dela somente integers serão aceitos.

2. 

```
numbers.forEach( (Integer number) -> {
  System.out.println(number);
  });
```
Da lista `numbers` o método forEach é chamado. Sintaxe dele: *forEach( (Tipo variável) -> {função a ser chamada a cada iteração} )*. A cada iteração o método *forEach()* irá imprimir o valor iterado `numbers`.

<br>

2. MAP

Itera e retorna algo a cada iteração, o retorno será o resultado da função declarada dentro do método *map()*. 

Para explicar a aplicação do método *map()*, o professor Rafael disponibilizou duas formas de resolver o seguinte desafio:

> *Receber uma lista com letras minúsculas e alimentar outra lista com essas mesmas letras, todavia, maiúsculas.*

Sendo elas:

1. Antes do JAVA 8

```
List<String> alpha = Arrays.asList("a", "b", "c", "d");
List<String> alphaUpper = new ArrayList<>();

for (String s : alpha) {
alphaUpper.add(s.toUpperCase());
}

System.out.println(alpha); //[a, b, c, d]
System.out.println(alphaUpper); //[A, B, C, D]
```

2. Depois do JAVA 8

```
List<String> alpha = Arrays.asList("a", "b", "c", "d");

List<String> alphaUpper = alpha.stream().
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());

System.out.println(alphaUpper); //[A, B, C, D]
```

<br>

3. FILTER

Retorna apenas os valores que passarem pela função declarada dentro do método *filter*, ou seja, filtra a lista.

Exemplo:

```
List<Integer> numeros = Arrays.asList(1,2,3,4,5);

List<Integer> menoresQueTres = numeros.stream()
                              .filter(number -> number < 3)
                              .collect(Collectors.toList());
System.out.print(menoresQueTres);

//Resultado: [1, 2]
```

<br>

4. REDUCE

Método usado para reduzir a lista, seja somando, multiplicando, dividindo ou concatenando todos itens.

Segundo o professor Rafael, o método Reduce é o mais complicado da lista de hoje (forEach, Map, Min Max, Filter e Reduce). A sintaxe do *reduce()* consiste de 3 ferramentas, sendo elas:

  1. IDENTIDADE:
  
  Um elemento que é o valor inicial da operação de redução e o resultado padrão se o fluxo estiver vazio.
  
  2. ACUMULADOR:
  
  Função que aceita dois parâmetros: um resultado parcial da operação de redução e o próximo elemento do fluxo.
  
  3. COMBINADOR:
  
  Uma função usada para combinar o resultado parcial da operação de redução, quando a redução é paralelizada ou quando há uma incompatibilidade entre os tipos de argumentos do acumulador e os tipos de implementação do acumulador.

Em outras palavras:

  1. Valor inicial ou Valor padrão. Caso a lista esteja vazia esse será o valor retornado. Caso não esteja vazia, será considerado como o primeiro valor, logo, a definição dele é importante. Um exemplo para melhor explicar essa importância é o relato contido na explicação do exercício dessa aula, veja em (FOR EACH)[].

  2. Parênteses que abriga o *acumulador* e o *próximo item*.

  3. Variável usada para guardar o resultado da função até então.

<br>

Exemplos do REDUCE:

Soma de todos os itens:
```
List<Integer> numberReducer = Arrays.asList(2,4,6,8,10);
int result = numberReducer.stream()
                          .reduce(0, (subtotal, element) -> subtotal + element);
```
Concatenação de todos os itens.
```
List<String> words = Arrays.asList(“como”, “ usar”, “ reducer”, ” para”, “ unificar”, “ string”);
String resultString = words.stream().reduce(“”,(parcialString, element) -> parcialString + element);

System.out.print(resultString);

//Result: como usar reducer para unificar string
```

<br>

5. MIN e MAX

Como o nome diz, os métodos `min` e `max` servem para que sejam encontrados os menores e os maiores valores de uma determinada lista.

Exemplo de aplicação:

```
Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).
max(Comparator.comparing(Integer::valueOf))
.get();

Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).
min(Comparator.comparing(Integer::valueOf))
.get();

System.out.print(minNumber);
System.out.print(maxNumber);

//Result: 
1
9
```
<br>

EXERCÍCIOS PARA PRÁTICA:

+ FOR: criar uma lista de string com 5 posições e imprimir elas

+ MAP: devemos criar uma lista string com 4 posições com valores MAIUSCULOS e utilizar o map para deixar minusculo.

+ FILTER: devemos criar uma lista de string de frutas com 3 posições, deve retornar apenas a fruta abacaxi

+ REDUCER: devemos criar uma lista de integer com 3 posições e utilziar o reducer para multiplicar seus valores

+ MIN e MAX:  devemos criar uma lista integer de 3 posições e retornar o valor maximo e minimo da lista
<hr>

<br>

### PESQUISADOS PARALELAMENTE
Aqui registrarei os exercícios que, de fato, ensinaram-me algo, pois se eu tentar registrar TODOS os que estou a resolver a fim de praticar este README ficará gigantesco.

<br>

#### 1. LINHA DO TEMPO (ITERAÇÃO, REPETIÇÃO)
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

#### 2. NÚMEROS PARES OU ÍMPARES? (ITERAÇÃO, MÓDULO)

Programa que recebe um número inicial e um final, além de receber o tipo de número desejado, isto é, par ou ímpar. Após os parâmetros terem sido declarados o programa itera o intervalo de números que há entre o INICIAL e o FINAL e devolve apenas os que são pares ou ímpares, a depender da escolha do usuário.

O que aprendi?

1. A usar o operador MÓDULO (%), que divide um número pelo outro e retorna apenas o resto, ou seja, o que há no lado direito do ponto final, isto é, se o resultado for "0.1" o operador retornará 1.
2. Prática relacionada à construção de funções em JAVA, são criadas ao declarar que são do tipo VOID e que recebem parâmetros.

#### 3. PARÂMETROS

Assistindo ao vídeo [Como e porque implementar o método equals no java (EXPLICADO NA PRÁTICA)](https://www.youtube.com/watch?v=9q7BrH78ZWM), mais especificamente no minuto 02:45, aprendi que JAVA aceita que, durante a passagem de parâmetros na instanciação, o atributo seja citado.

CLASSE:
```
public class Pessoa(){
  private String nome;

  public void Pessoa(String nome){
    this.nome = nome;
  }
}
```

INSTANCIAÇÃO:
```
Pessoa pessoa1 = new Pessoa(nome: "João da Silva");
```

Tal maneira de passagem de parâmetros, ainda que verbosa, para mim, é melhor do que a tradicional, isto é, sem mencionar o atributo. Penso isso pois, às vezes, depois de já haver instanciado, preciso ir até a classe e verificar o que cada parâmetro representa. Em resumo, a forma apresentada no vídeo é mais legível aos humanos.

<br>

#### 4. CONTADOR DE PALAVRAS
Tive dificuldades de resolver um dos desafios do Edabit, chamado de [Contador de Palavras](https://edabit.com/challenge/5LnycSd2xT4uwZCpi), sendo eles:

  1. Tentei resolver da forma mais simples que pude pensar, isto é, simplesmente iterar a STRING inputada pelo usuário e incrementar uma variável nomeada TOTAL a cada vez que um caractere vazio ("espaço") fosse encontrado. Não funcionou. String não é um objeto iterável.

  2. Pesquisei pelos métodos disponíveis na classe STRING e encontrei o `split()`. Tentei utilizá-lo da maneira ilustrada abaixo. Porém, não funcionou. Haviam alguns problemas, sendo eles:
      1. O `split()` recebe 2 parâmetros, o primeiro é obrigatório e o segundo é opcional. O primeiro parâmetro trata-se do delimitador (caractere que será usado para quebrar a STRING) e o segundo é a quantidade limite de vezes que tal delimitador deve ser considerado. Ou seja, considerando a STRING "teste@exemplo@aloha@" e aplique o método `split("@",2)`, o retorno seria um array contendo *["teste","exemplo","aloha@"]*.
      2. A palavra reservada *length* estava ortograficamente errada.
      3. A variável *total* não havia sido inicializada, logo, não poderia ser incrementada.

USO INCORRETO DO `split()`:

  ```
  public class Program {
	public static int countWords(String s) {
		String[] words = s.split();
		int total;
		for(int i = 0; i < words.lenght; i++){
				total++;
		}
		return total;
		}
}
  ```

USO CORRETO DO `split(delimitador, totalDeRepetições)`:

  ```
  public class Program {
	public static int countWords(String s) {
		String[] words = s.split(" ");
		int total = 0;
		for(int i = 0; i < words.length; i++){
				total++;
		}
		return total;
		}
}
  ```

<br>

#### 5. CÓDIGO HEX VÁLIDO
Desafio do site [EDABIT](https://edabit.com/challenge/9zBJYnBekqAo52zEp). Enunciado:

*Criar uma função que determina se uma STRING é um código HEX válido ou não. O código HEX deve começar com uma # e ter exatamente 6 caracteres (7, se somar a cerquilha). Cada caractere´deve ser um dígito de 0 a 9 ou uma letra que esteja entre A a Z, todos eles devem ser ou minúscula ou maiúscula.*

Ao ler o enunciado logo lembrei dos estudos de EXPRESSÕES REGULARES (RegEx), motivados pelo estudo do PYTHON há uns meses. Procurei pelos métodos da superclasse STRING e localizei o método `matches(_String regex_)`. Com o modelo em mãos, isto é, o formato padrão do código HEX, esbocei alguns modelos de RegEx e os testei usando o [Free Formatter – Java Regex Tester](https://www.freeformatter.com/java-regex-tester.html#ad-output). Após alguns testes, finalizei a função abaixo.


APRENDIZADO:
  1. Prática dos estudos das Expressões Regulares;
  2. Prática do uso de métodos da superclasse String, bem como da perspectiva de superclasse e subclasse – o que têm facilitado minha interação com a linguagem.


SOLUÇÃO:
```
public class Challenge {
  public static boolean isValidHexCode(String str) {
		boolean isValid = false;
		
		if(str.length() <=7 && str.charAt(0) == '#'){
			isValid = str.matches("#[A-F0-9][A-F0-9][A-F0-9][A-F0-9][A-F0-9][A-F0-9]") ? true : false;
			if (isValid == false){
				isValid = str.matches("#[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]") ? true : false;
			}
		}
		
		return isValid;
	}
}
```

<br>

#### 6. RETORNE O MAIOR E O MENOR NÚMERO
Desafio do site [EDABIT](https://edabit.com/challenge/iaCSbqngin2AXriyB). Enunciado:

Crie um método que aceite uma STRING com números separados por um espaço e retorne o maior e o menor deles, no formato STRING.

SOLUÇÃO:

```
import java.util.Arrays;

public class Program {
	
	public static String highLow(String s){
      String[] integers = s.split(" ");
      int[] toBeSorted = new int[integers.length];
      String high;
      String low;
      String result;
		
	    for(int i = 0; i < integers.length ; i++){
	        toBeSorted[i] = Integer.parseInt(integers[i]);
	    }
	    
	    Arrays.sort(toBeSorted);
			high = Integer.toString(toBeSorted[toBeSorted.length - 1]);
			low = Integer.toString(toBeSorted[0]);
		
		
	    result =  high + " " + low;
	    return result;
	}
}
```

APRENDIZADO:
  
Graças à nova perspectiva quanto aos tipos não primitivos (String {texto}, Array {conjunto de dados} e afins), isto é, vê-los como objetos, em outras palavras, "sub-classes", tenho tido o hábito de pesquisar por métodos da superclasse deles. Esse hábito ajuda a não perder tempo tentando criar uma lógica que já foi criada e implementada na linguagem. Este desafio prova isso.

1. Conhecer a superclasse ARRAYS e utilizar seus métodos, como o `sort(original_array)` – tal método altera o array original, ou seja, não é necessário que retorne valor algum;
2. Conhecer e utilizar o objeto Integer.

<br>

#### 7. CONSERTE UMA CALCULADORA BÁSICA
Desafio do site [EDABIT](https://edabit.com/challenge/7bupZ6FmuAQwJE6CL). Enunciado:

*Mubashir criou uma função que recebe dois números, `a` e `b`, e um operador `o`. A função dele deveria retornar o resultado correspondente ao cálculo matemático passado pelo usuário. Se o operador não for um dos caracteres especificados (`+`, `-`, `/` e `*`) ou se houver uma operação de divisão por zero a função deve retornar `null`. Para passar este desafio, ajude-o a corrigir o código dele.*

CÓDIGO ERRADO:

```
public class Calculator { 
	public static Object basicCalculator(a, o, b) {
		int result = 0;
		if(O == "+") return a + b;
		if(o != "-") return a - b;
		if(o != "/" || b == 0) return a / b;
		if(0 == "*") return a * b;
		return result;
	}
}
```

SOLUÇÃO:

```
public class Calculator { 
	public static Object basicCalculator(int a, String o, int b) {
		int result = 0;
		if(o != "+" && o != "-" && o != "/" && o != "*" ) return null;
		if(o == "+") return a + b;
		if(o == "-") return a - b;
		if(a == 0 || b == 0) return null;
		if(o == "/") return a / b;
		if(o == "*") return a * b;
		return result;
	}
}
```

APRENDIZADO:
  1. *Object* pode ser usado como tipo de retorno de uma função;
  2. Sintaxe simplificada da estrutura condicional IF;
  3. Lida com a correção de bugs no código alheio.

<br>

#### 8. SHIRITORI

Exercício do site [EDABIT](https://edabit.com/challenge/rqum6rzyZQrC43Ldv). Consegui resolvê-lo apenas graças à abstração provida pela interface LIST e seus métodos, que aprendi durante a [AULA 12](#aula-12-stream-api) do curso.

Com esse exercício pude exercitar o design *cada função deve ter apenas uma função*.

APRENDIZADO:
  1. Método `public int size(){}`, verifica o tamanho da lista e retorna um integer correspondente.
  2. Método `public boolean isEmpty(){}`, verifica se a lista está vazia e retorna um valor booleano.
  3. Método `public boolean contains(element){}`, verifica se a lista tem algum elemento que seja igual ao passado como parâmetro e retorna um valor booleano.