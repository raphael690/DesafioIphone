
<h1 algin = "center">
Desafio Iphone
</h1>

<p algin = "center">
<b><i>
Modelagem e diagramação da representação em UML e Código no que se refere ao componente iphone.
<b><i>
</p>

## 💡 Modelando e Diagramação de um Componente iPhone
- Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## 💡 Contexto
- Com base no video de lançamento do iphone, elabore em uma ferramenta da UML de sua preferência a
diagramação das classes e interfaces com a proposta de representar os papéis do iphone de:
Reprodução Muusical, Aparelho Telefônico e Navegador na internet. Em seguida crie as classes e interfaces no formato de arquivos .java
<br> <br>

## 📁 Estrutura/
- [DesafioIphone](https://github.com/raphael690/DesafioIphone.git)/
Pasta com projeto

###### Comportamentos esperados:
* Reprodutor Musical : tocar(), pausar(), selecionarMusica(String musica)
* Aparelho Telefônico : ligar(String numero), atender(), iniciarCorreioVoz()
* Navegador na Internet: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

###### Objetivo

### Exemplo de Diagrama UML 
```mermaid
classDiagram
    class ReprodutorMusical {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

## 🔧 Tecnologias
![JAVA]

## 🔗 Referências
- Video aulas do Bootcamp Santander 2024 - Backend com Java

## ✅ Feedback

<a href>
</a>

<p align = "center"> Desenvolvido por Raphael Ferreira</p>
