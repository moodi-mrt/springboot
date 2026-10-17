# Java & Spring Boot Projects

A collection of Java and Spring Boot practice projects.

| Project | Description |
|---|---|
| [crud-student](crud-student) | REST API for creating, reading, updating and deleting students (Spring Boot, Spring Data JPA, MySQL) |
| [crude-student-exception](crude-student-exception) | Student CRUD API with custom exceptions and a global exception handler (Spring Boot) |
| [springMVC](springMVC) | Spring MVC basics: controller, entity and repository |
| [ATM](ATM) | Console ATM simulation in plain Java (OOP: accounts, cash dispenser, balance inquiry) |

## Running a project

Each project is a standalone Maven project. From its folder:

```bash
./mvnw spring-boot:run
```

Database passwords are not stored in the code. Set them as environment variables before running (see each project's `application.properties`), e.g.:

```bash
export DB_PASSWORD=your_mysql_password
```
