# Product API

A API de Produtos oferece um conjunto de endpoints para gerenciar informações relacionadas a produtos, proporcionando operações básicas de CRUD (Create, Read, Update, Delete). As principais características incluem:

- **RESTful:** A API segue os princípios de arquitetura REST, proporcionando uma interface uniforme para comunicação eficiente e escalável.

- **Java e Spring Boot:** A aplicação é desenvolvida em Java, utilizando o framework Spring Boot para simplificar o desenvolvimento e fornecer funcionalidades como injeção de dependência.

<div align="center"> 
  <h3 align="center">Ferramentas e Tecnologias Utilizadas</h3>
    <img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/rest.png" alt="Rest" title="Rest"/>
    <img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/intellij.png" alt="IntelliJ" title="Intellij"/>
    <img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/postman.png" alt="Postman" title="Postman"/>
    <img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/spring_boot.png" alt="Spring Boot" title="Spring Boot"/>
    <img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/mysql.png" alt="MySQL" title="MySQL"/>
</div>

<br>
<br>
<div align="center"> 
  <h3 align="center">Endpoints - BaseURL</h3>
</div>

  ```
  https://localhost:8080/produtos
  ```

| EndPoint  | Método HTTP   | Descrição   |
|---------------|---------------|---------------|
| /produtos | GET | Lista todos os produtos |
| /produtos/{id} | GET | Detalhes de um produto especifico |
| /produtos | POST | Cria um novo produto |
| /produtos/{id} | PUT | Atualiza os dados de um produto especifico |
| /produtos/{id} | DELETE | Deleta um produto especifico |

<br>

<h3>Conclusão</h3>

<p>O desenvolvimento desta API REST foi realizado com o objetivo de oferecer uma interface eficiente e robusta para o gerenciamento de produtos. Utilizando MySQL como banco de dados, garantimos uma base sólida e confiável para o armazenamento e recuperação de informações. A integração com o JPA (Java Persistence API) simplificou a manipulação de entidades e promoveu a abstração do acesso a dados, aumentando a produtividade e reduzindo a complexidade do código.

Além disso, a dependência Validation foi essencial para garantir que as entradas fornecidas pelos usuários fossem validadas de forma rigorosa, protegendo a API contra dados inconsistentes e possíveis falhas. Com o uso de anotações como @NotNull, @Size, e outras, foi possível assegurar que as regras de negócios fossem respeitadas de forma automatizada e prática.

O projeto foi estruturado seguindo as melhores práticas de desenvolvimento de APIs, com endpoints bem documentados, autenticação segura (se implementada), e um design orientado a recursos que facilita a integração com clientes externos. Essa estrutura modular e escalável permite futuras expansões, como a adição de novas funcionalidades, melhorias de desempenho, ou integração com outras plataformas.

Por fim, a API está pronta para ser consumida e integrada a sistemas diversos, oferecendo uma base sólida para atender às necessidades dos usuários de forma eficiente e escalável. O uso de tecnologias consolidadas como MySQL, JPA, e Validation reforça a confiabilidade e a qualidade técnica do projeto.

</p>
