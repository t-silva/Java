# Java - Conceitos Básicos.

    Java é uma linguagem de programação orientada a objetos, mas também é uma plataforma. Uma coleção de API's (classes, componentes, frameworks) para o desenvolvimento
de aplicações multiplataforma, presente em browsers, celulares, mainframes, etc..


1) Java - Linguagem
    - Java Development Kit (JDK): ambiente de desenvolvimento em linguagem java.
    - A linguagem Java é mantida e controlada pelo Java Community Process (www.jcp.org).
    - Os ambientes de execução e desenvolvimento são desenvolvidos por diferentes produtores de hardware e software.
    - Linguagem com sintaxe parecida com C.
    - Simples e Robusta.
    - Linguagem com código intermediário de MAQUINA VIRTUAL interpretado.
    - Fortemente tipada.

2) Java - Plataforma
    Define o ambiente de hardware e software onde programas são executados.
    - Máquina Virtual Java (JVM)
    - Interface para Desenvolvimento de Aplicações (API Java)

    Nenhum programa java roda diretamente no Hardware. Um arquivo.java, para executar, é interpretado pela máquina virtual, intermediária para comunicação com o hardware, 
possibilitando a migração para outros softwares, desde que tenham uma máquina virtual, específica para o SO utilizado, que interprete a linguagem.


    As APIs (bibliotecas) são organizadas em pacotes (grupos), e são distribuidas juntamente com as plataformas para desenvolvimento de aplicações:
    
    - Desktop: JSE (Java Standard Edition).
    - WEB: JEE (Java Enterprise Edition) - Com a JSE + ferramentas para WEB.
    - MOBILE: JME (Java Micro Edition) - Plataforma em desuso 

    Ao instalar o ambiente de desenvolvimento, utilizando o JSE, instalamos o ambiente (JSDK) e a máquina virtual (JRE)

    
    Quando compilamos um arquivo.java, é criado um .class, chamado de byte code, que pode ser executado em qualquer SO que tenha a máquina virtual instalada.



    ---------------------------------------------

    Pratica 1:  - Criação de classes (tipo abstrato de dados), construtures e objetos (classes instanciada)
                - Encapsulamento - Utilizar, ou não, atributos ou métodos fora da classe (public/private). Atributos privados são acessados
                por outras classes utilizando getters e setters, impedindo acessos indevidos.