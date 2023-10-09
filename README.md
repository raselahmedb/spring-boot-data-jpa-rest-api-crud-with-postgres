# spring-boot-data-jpa-rest-api-crud-with-postgres
Data JPA Rest Api crud with PostgreSQL project for Spring Boot
# Spring Boot, Spring Data Jpa, PostgreSQL, Lombok

## Development Setup

[JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

[Spring Boot 3.1.4]()

[PostgreSQL]()

## Run Spring Boot application
```bash
mvn spring-boot:run
```

### API URL
```
POST http://localhost:8080/student/add
{
    "name": "Abdul Rohim",
    "rollNo": "10",
    "stdClass": "01"
}

GET http://localhost:8080/student/1

GET http://localhost:8080/student/all

PUT http://localhost:8080/student/update
{
    "id": 1,
    "name": "Abdul Rohim Khan",
    "rollNo": "10",
    "stdClass": "01"
}

DELETE http://localhost:8080/student/1
```
