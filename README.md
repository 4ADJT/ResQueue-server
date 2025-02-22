# 🌍 Resqueue Eureka Server

## 📖 Sobre o Projeto
O **Resqueue Eureka Server** é o serviço de descoberta (Service Discovery) do sistema **Resqueue**, responsável por registrar e monitorar microserviços na arquitetura distribuída.

Este servidor é baseado em **Spring Cloud Netflix Eureka Server**, permitindo que microserviços sejam descobertos dinamicamente e se comuniquem sem a necessidade de configurações manuais de rede.

---

## 🚀 **Tecnologias Utilizadas**
- **Java 21 (Corretto)**
- **Spring Boot 3**
- **Spring Cloud Netflix Eureka Server**
- **Maven**

---

## ⚙️ **Configuração do Ambiente**
### 🔧 **Configuração no `application.yml`**
Antes de rodar o serviço, configure as seguintes propriedades:

```yaml
server:
  port: 8761

eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
  server:
    enable-self-preservation: true

management:
  endpoints:
    web:
      exposure:
        include: health,info
  endpoint:
    health:
      show-details: always
```

---

## 🔥 **Executando o Projeto**
### **Rodando com Docker**
Uma imagem Docker já está disponível no **Docker Hub**:

```sh
docker pull rodrigobrocchi/resqueue-server:latest
docker run -p 8761:8761 rodrigobrocchi/resqueue-server:latest
```

---

## 🖥️ **Acessando o Eureka Dashboard**
Após a execução, acesse a interface web do **Eureka Server**:

```
http://localhost:8761
```

A página exibirá os microserviços registrados e o status do serviço.

---
