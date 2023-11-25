# Documentação da API de Produtos

## Introdução

Bem-vindo à documentação da API de Produtos, uma aplicação desenvolvida utilizando Java e Spring Boot. Esta API foi criada com o objetivo de consolidar conhecimentos no ecossistema do Spring Boot e aprender os conceitos fundamentais de uma API RESTful.

## Visão Geral

A API de Produtos oferece um conjunto de endpoints para gerenciar informações relacionadas a produtos, proporcionando operações básicas de CRUD (Create, Read, Update, Delete). As principais características incluem:

- **RESTful:** A API segue os princípios de arquitetura REST, proporcionando uma interface uniforme para comunicação eficiente e escalável.

- **Java e Spring Boot:** A aplicação é desenvolvida em Java, utilizando o framework Spring Boot para simplificar o desenvolvimento e fornecer funcionalidades como injeção de dependência, controle transacional e segurança.

## Endpoints

### 1. Listar Todos os Produtos

**Endpoint:** `/produtos`  
**Método:** `GET`  
**Descrição:** Retorna uma lista de todos os produtos cadastrados.

### 2. Obter Detalhes de um Produto

**Endpoint:** `/produtos/{id}`  
**Método:** `GET`  
**Descrição:** Retorna os detalhes de um produto específico com base no ID.

### 3. Cadastrar Novo Produto

**Endpoint:** `/produtos`  
**Método:** `POST`  
**Descrição:** Cadastra um novo produto. O corpo da requisição deve conter os dados do produto.

Exemplo de corpo da requisição:
```json
{
  "nome": "Produto Nome",
  "valor": 29.99,
}
```

### 3. Atualizar um Produto

**Endpoint:** `/produtos/{id}`  
**Método:** `PUT`  
**Descrição:** Atualiza um produto existente. O corpo da requisição deve conter os dados que desejamos alterar.
