# Criação de Servlets
Irei utilizar este arquivo para registrar os aprendizados referentes à criação de servlets, bem como todo insight que obtiver acerca do assunto.

## Estrutura padrão de um SERVLET

```
package br.com.teste;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teste")
public class Teste extends HttpServlet{
    ...
}
```

As classes acima são nativas do JAVA, portanto, não há que se preocupar em as baixar.

O SERVLET acima está configurado para receber, por meio de programas como o APACHE TOMCAT as requisições feitas para o projeto teste, no localhost por meio da seguinte URL: localhost:8080/teste/teste

## Insights

- Como os servlets são criados usando classes Java, é necessário que sejam criados em classes diferentes, isto é, arquivos diferentes. Algo óbvio, considerando a estrutura regular dos arquivos JAVA, todavia, há pouco cometi o erro de criar dois servlets usando uma classe apenas.