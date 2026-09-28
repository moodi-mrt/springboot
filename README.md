# Spring Boot Projects

A collection of Spring Boot practice projects.

| Project | Description |
|---|---|
| [crud-student](crud-student) | REST API for creating, reading, updating and deleting students (Spring Boot, Spring Data JPA, MySQL) |

## Running a project

Each project is a standalone Maven project. From its folder:

```bash
./mvnw spring-boot:run
```

Database passwords are not stored in the code. Set them as environment variables before running (see each project's `application.properties`), e.g.:

```bash
export DB_PASSWORD=your_mysql_password
```
