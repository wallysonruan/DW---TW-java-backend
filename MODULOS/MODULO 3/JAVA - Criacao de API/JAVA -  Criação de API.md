## Criação de WebServices

### SERVLET x WEBSERVICES

"Servlet", em Português "servidorzinho", é um container que atua dentro de um servidor habilitando-o a receber códigos de uma determinada linguagem – ou seja, é atrelado a uma determinada tecnologia.

"Webservices", em Português "serviços da internet", é toda aplicação aberta a receber requisições e a emitir recursos baseados em tais requisições. Utilizam o protocolo HTTP e/ou HTTPS para efetuar a comunicação. Não depende de uma tecnologia específica, ou seja, pode receber requisições de Python, Javascript e outras mesmo tendo sido escrita em JAVA.

### WEBSERVICES x API

A principal diferença entre ambas é que WEBSERVICES exigem conexão via internet e APIs não. Todo WEBSERVICE é uma API, mas nem toda API é um WEBSERVICE, afinal, assim como as APIs os WEBSERVICES atua como intermediário entre dois programas.

Os textos acima são provisórios, pretendo escrevê-los com mais detalhe.

## Estrutura padrão de um WebService

```
package defaultStructure;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/service")
public class WebService extends HttpServlet{
	private static final Long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.getWriter().print("Connected");
	}

}
```

As classes acima são nativas do JAVA, portanto, não há que se preocupar em baixá-las.

O SERVLET acima está configurado para receber, por meio de programas como o APACHE TOMCAT, as requisições GET feitas para o projeto teste por meio da seguinte URL: `localhost:8080/teste/teste` – tais requisições culminarão no mesmo resultado: será impressa a palavra "Connected" na tela. O código interno do método `doGet(){}` **não** faz parte da estrutura padrão. Ou seja, o SERVLET estará prestando um webservice ao permitir que clientes *requisitem* ao servidor e recebam uma *resposta*.

## Destrinchando a Estrutura Padrão

- É graças à anotação `@WebServlet(-aqui é inserido o nome do recurso-)` que o JAVA reconhece que o código acima é referente a um caminho do Servlet. Ela é um recurso proveniente do pacote `javax.servlet.annotation.WebServlet`.

- Toda classe que funcione como um caminho de Servlet deve ser uma extensão da classe `HttpServlet`, cujo uso nos obriga a importar o pacote  `javax.servlet.http.HttpServlet`. Graças a essa classe que o código herda os métodos necessários para o funcionamento do SERVLET.

- Eu, até a presente data, 03/07/2022, não entendo o motivo de ser obrigatória a declaração do atributo serialVersionUID, como na linha `private static final Long serialVersionUID = 1L;`. Sem ela o programa não funciona.

- Por ser uma extensão, a classe Servlet do código acima tem que ,por obrigação, caso queira utilizar de forma personalizada os métodos da classe HttpServlet, sobreescrever os métodos referentes aos verbos HTTP, como o método `doGet(HttpServletRequest request, HttpServletResponse response){}`. Esse método recebe como parâmetro dois objetos, sendo eles do tipo `HttpServletRequest` e `HttpServletResponse`. Os nomes são autoexplicativos, tratam-se de objetos que contém métodos que nos permitem lidar com as requisições e respostas via protocolo HTTP. Ambos nos obrigam a importar os pacotes `javax.servlet.http.HttpServletRequest` e `javax.servlet.http.HttpServletRequest`.

- Durante a sobreescrita dos métodos que nos permitem lidar com as requisições, como o `doGet(){}`, notei ser de praxe a inserção de um código específico para tratamento de erros, no caso, a linha `throws ServletException, IOException` – que nos obriga a importar mais dois pacotes, sendo eles `javax.servlet.ServletException` e `java.io.IOException`, ainda não os estudei a fundo.

## Insights

- Como os servlets são criados usando classes Java, é necessário que sejam criados em classes diferentes, isto é, arquivos diferentes. Algo óbvio, considerando a estrutura regular dos arquivos JAVA, todavia, há pouco cometi o erro de criar dois servlets usando uma classe apenas.
