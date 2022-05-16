# Whatsapp
Pacote JAVA que contém classes que simulam um Whatsapp, isto é, ao menos algumas das funções. Creio que me ajudará a aprender como aplicar o conceito de POO (Programação orientada a objetos) em JAVA.

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

### Funções Desejadas e Funções Já Adicionadas
- Adicionar nome (OK);
- Alterar o nome (mantendo registro de todas as alterações) (OK);
- Adicionar um número de telefone (OK);
- Adicionar um número de telefone (mantendo registro de todas as alterações) (OK);
- Criar contatos;
- Editar contatos;
- Apagar contatos.

## Aprendizados
15/05/2022: Aprendi a criar funções e métodos que retornam algum valor, a diferença é bem pouca, como é possível ver abaixo.

FUNÇÃO:

*public static **void** NOME(  ){ --corpo--;}*

MÉTODO QUE RETORNA ALGO:

*public **TipoDoRetorno** NOME(  ){**return** oQueSeráRetornado;}*
