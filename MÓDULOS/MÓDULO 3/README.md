# SITES QUE ME AUXILIARAM NESTE MÓDULO

- [VÍDEO] [Java EE #1 - Como Baixar e Configurar o Tomcat no Eclipse](https://www.youtube.com/watch?v=mAdJgDxezWU)
- [VÍDEO] [Preparando Ambiente - Instalação Java e eclipse EE para web](https://www.youtube.com/watch?v=6jKlRuINhZI)
- [VÍDEO] [Como Baixar, Instalar e Configurar o Eclipse IDE e o Apache Tomcat 10 no Windows 10](https://www.youtube.com/watch?v=GCc4ZQqnmVY)
- [TEXTO] [How to Grant All Privileges on a Database in MySQL](https://chartio.com/resources/tutorials/how-to-grant-all-privileges-on-a-database-in-mysql/#:~:text=To%20GRANT%20ALL%20privileges%20to,TO%20'username'%40'localhost'%3B)
- [TEXTO] [Página da qual baixei o connector do MySQL (para conectar o código em algum banco de dados)](http://ftp.jaist.ac.jp/pub/mysql/Downloads/Connector-J/)
- [VÍDEO] [O que é MVC? Aprenda MVC de MANEIRA FÁCIL](https://www.youtube.com/watch?v=ZW2JLtX4Dag)

## O que são SERVLETS?

Servlet (servidorzinho em tradução livre) é uma classe Java usada para estender as funcionalidades de um servidor. Apesar dos servlets poderem responder a quaisquer tipos de requisições, eles normalmente são usados para estender as aplicações hospedadas por servidores web, desta forma eles podem ser imaginados como Applets (pequenos aplicativos em tradução livre) Java que rodam em servidores em vez de rodarem nos navegadores web. Estes tipos de servlets são os equivalentes Java a outras tecnologias de conteúdo Web dinâmico, como PHP e ASP.NET. 

Também pode ser definido como um componente semelhante um servidor, que gera dados HTML e XML para a camada de apresentação de uma aplicação Web. Ele processa dinamicamente requisições e respostas.

*FONTE: [Wikipedia](https://pt.wikipedia.org/wiki/Servlet)*

Em outras palavras, é o que permite que códigos JAVA funcionem em servidores, isto é, recebendo os dados das requisições HTTP e as inserindo como parâmetro no código. Após o processamento, se necessário, a classe Servlet permite também que sejam enviadas respostas.

<br>

![Representação do funcionamento dos servlets](https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/JSPLife.svg/800px-JSPLife.svg.png)

## O que é MVC (Model View Controler)?

MVC é um padrão de arquitetura de software que separa a aplicação em 3 camadas. A fim de facilitar o entendimento, abaixo estarão as camadas listadas na ordem de funcionamento.

- **V**iew: Camada de interação do usuário.
- **M**odel: Camada de manipulação dos dados.
- **C**ontroller: Camada de controle.

Exemplo: Ao entrar no site, vemos a camada VIEW. Ao clicarmos em qualquer objeto que acione uma requisição HTTP, a camada CONTROLLER é ativada e direciona a requisição ao MODEL. O Model receberá a requisição e separará os dados necessários para atendê-la e, em seguida, a devolve para o controller. Com os dados em mãos, o controller os enviará ao VIEW para que sejam adaptados para o layout do website, em outras palavras, para que sejam adaptados para a visualização humana.

FLUXO:
1. Controller (usuário clica em algum objeto do VIEW que faz uma requisição)
2. Model
3. Controller
4. View

![Representação do fluxo do MVC](https://media.geeksforgeeks.org/wp-content/uploads/20210629165722/mvc.png)