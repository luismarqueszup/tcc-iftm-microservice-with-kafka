# AVALIAÇÃO DA UTILIZAÇÃO DO APACHE KAFKA APLICADO NA TRANSMISSÃO DE DADOS ENTRE MICROSSERVIÇOS

O sistema desenvolvido é em experimento composto de 3 microsserviços, onde é simulado um sistema de ecommerce. Os microserviços são NewOrder, Payment e Send como mostra a imagem abaixo

![Microsserviços TCC](https://user-images.githubusercontent.com/15522192/87034244-ec8f1080-c1bd-11ea-9b76-156dd5c8a634.jpg)

# Objetivo

Essa pesquisa possui significativa relevância por apresentar o quanto é vantajoso utilizar o Apache Kafka como uma plataforma distribuída de dados, sendo ela capaz de gerenciar fluxo de dados em tempo real entre vários microsserviços, bem como, o desenvolvimento de um experimento para que seja possível capturar métricas mostrando os resultados obtidos e as vantagens da utilização dessa plataforma e exibi-las através de dashboards.

# Tecnologias Utilizadas

Spring Boot

Java 11

Rest

Swagger 2.0

Apache kafka

Prometheus e Grafana

# API´s disponíveis

![swagger api-ecommerce](https://user-images.githubusercontent.com/15522192/87035592-eef26a00-c1bf-11ea-9cc7-6e3524fc6107.JPG)

# Como utilizar o projeto

Para utilizar o projeto é necessário ter:

1° Java 11 e Maven instalado e configurado (variáveis de ambiente). versão Maven utilizada 3.6.1

2° Também é necessário ter o docker instalado na maquina

# Como executar o projeto

1° Clone o projeto https://github.com/LuisEduardoM/tcc-iftm-microservice-with-kafka.git

2° Entre na pasta docker/prometheus através de um terminal e execute os comandos abaixo:

**docker-compose up**

3º Iniciar os 3 microsserviços, voltando na pasta raiz do projeto:

>  3.1 Entre na pasta **neworder** através de um terminal e execute os comandos abaixo:
  
>  $ mvn clean package

>  $ java -jar neworder-application\target\new-order.jar
   
>  3.2 Entre na pasta **payment** através de um terminal e execute os comandos abaixo:

>  $ mvn clean package

>  $ java -jar payment-application\target\payment-application-0.0.1-SNAPSHOT.jar
   
>   3.3 Entre na pasta **send** através de um terminal e execute os comandos abaixo:

>   $ mvn clean package

>   $ java -jar send-application\target\send-application-0.0.1-SNAPSHOT.jar
