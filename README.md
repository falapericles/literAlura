# LiterAlura

LiterAlura é um projeto desenvolvido como parte do desafio LiterAlura. O objetivo do projeto é criar um catálogo de livros utilizando Java, Spring Boot, PostgreSQL e a API Gutendex. O projeto consome dados da API Gutendex e persiste esses dados em um banco de dados relacional, permitindo interações diversas com o usuário.

## Tecnologias Utilizadas

- Java
- Spring Boot
- PostgreSQL
- Gutendex API

## Funcionalidades

O projeto possui cinco opções de interação com o usuário:

1. **Buscar livro pelo título**: Realiza a consulta diretamente na API Gutendex e insere o livro no banco de dados.
2. **Listar livros registrados**: Lista todos os livros que foram inseridos no banco de dados.
3. **Listar autores**: Lista todos os autores dos livros registrados no banco de dados.
4. **Listar autores em determinado ano**: Lista os autores que estavam vivos em um determinado ano.
5. **Listar livros em determinado idioma**: Lista os livros registrados no banco de dados em um determinado idioma.

## Configuração do Projeto

### Pré-requisitos

- Java 11 ou superior
- Maven
- PostgreSQL

### Configurando o Banco de Dados

Certifique-se de que o PostgreSQL está instalado e em execução na sua máquina. Crie um banco de dados para o projeto:

```sql
CREATE DATABASE literAlura;
```

### Configurando o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/literAlura.git
cd literAlura
```

2. Configure o arquivo `application.properties` com as suas credenciais do banco de dados:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literAlura
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Executando o Projeto

1. Compile e execute o projeto:

```bash
mvn clean install
mvn spring-boot:run
```

2. Interaja com o projeto através do terminal.

### Exemplo de Uso

#### Buscar Livro pelo Título

Insira a opção 1 e o nome do livro "Dom Casmurro":

```
1
Dom Casmurro
```

Isso fará uma busca na API Gutendex e salvará o livro no banco de dados.

#### Listar Livros Registrados

Insira a opção 2 para listar todos os livros registrados:

```
2
```

## Estrutura do Projeto

```plaintext
literAlura/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/example/literAlura/
│   │   │   │   ├── LiterAluraApplication.java
│   │   │   │   ├── controller/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── schema.sql
├── .gitignore
├── pom.xml
└── README.md
```

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```

Este README fornece uma visão geral clara do projeto, das tecnologias utilizadas, das funcionalidades e das etapas necessárias para configurar e executar o projeto. Sinta-se à vontade para personalizá-lo conforme necessário.
