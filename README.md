# 🚗 Revenda de Veículos

  

API para uma plataforma de revenda de veículos automotores, desenvolvida em Java com Spring Boot, com autenticação via JWT, documentação com Swagger e deploy via Docker Compose.

  

---

  

## 📋 Descrição

  

Uma empresa de revenda de veículos automotores contratou o desenvolvimento de uma plataforma online. O time de UX está cuidando do design, enquanto esta API foi criada para atender os requisitos de backend da solução. Posteriormente, o frontend será integrado.

  

A API cobre as seguintes funcionalidades:

  

- ✅ Cadastrar veículos com: marca, modelo, ano, cor e preço.

- ✏️ Editar os dados de veículos existentes.

- 🛒 Permitir a compra de veículos por pessoas previamente cadastradas.

- 📃 Listar veículos disponíveis para venda, ordenados por preço (do mais barato para o mais caro).

- 📃 Listar veículos vendidos, também ordenados por preço (do mais barato para o mais caro).

  

---

  

## ⚙️ Tecnologias Utilizadas

  

-  **Java 17**

-  **Spring Boot 3.x**

-  **Spring Data JPA**

-  **Spring Security (com JWT)**

-  **PostgreSQL**

-  **Docker / Docker Compose**

-  **Swagger / OpenAPI**

-  **JUnit 5 + Mockito**

-  **GitHub Actions (CI/CD)**

  

---

  

## 🚀 Como Executar Localmente

  

### 1. Clone o repositório

  

    git  clone  https://github.com/angelazgiampaoli/revendaVeiculos.git
    
    cd  revendaVeiculos

 

 

### 2.  Suba  o  banco  de  dados  com  Docker

  

    docker-compose up -d

  

### 3. Rode a aplicação localmente

  

    ./mvnw  spring-boot:run

  

## ☁️  Deploy  com  Docker  Compose

  

1.  Clone  o  repositório  de  produção

  

```bash
git clone https://github.com/angelazgiampaoli/revendaVeiculos.git

cd revendaVeiculos
```

  

### 2. Suba os containers

  
```bash
docker-compose up -d
```

  
  

## 🔐 Segurança

A autenticação e autorização são realizadas com JWT (JSON Web Token). Usuários precisam estar autenticados para realizar compras e acessar recursos protegidos.

  

## 🧪 Testes Automatizados

A API conta com testes unitários e de integração, desenvolvidos com:

  

-  **JUnit  5**

-  **Mockito**

  

Para executá-los:

  

```bash
./mvnw  test
 ``` 

## 📚  Documentação  da  API

A  documentação  interativa  da  API (Swagger/OpenAPI) estará disponível localmente após iniciar a aplicação em:

  

```bash
http://localhost:8080/swagger-ui.html
```
  

### 📝 Licença

Este projeto está licenciado sob a MIT License.

  

### 👩‍💻 Autoria

Desenvolvido por Ângela Giampaoli.

Projeto criado para atender uma empresa de revenda de veículos automotores com uma plataforma moderna, segura e escalável.
