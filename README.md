# fin-api
A simple Spring Boot API demonstrating inheritance in Java for modeling financial instruments (e.g., Asset → Bond, Stock). Highlights OOP principles like polymorphism, Liskov Substitution, and Template Method in a fintech context.

# Features
1. Abstract Asset class with shared audit/risk logic.
2. Subclasses (Bond, Stock) override behavior polymorphically.
3. REST endpoint: GET /api/assets/audit returns JSON audit logs.
4. No dependencies beyond Spring Boot (no Lombok).

# Prerequisites
Java 17+
Maven

Build & Run : ./mvnw spring-boot:run

Test: GET http://localhost:8080/api/assets/audit (use Postman or curl)

Example Responsejson

[
  "[AUDIT] BOND | ISIN: US912828K742 | Value: 950000 | Risk: 4.281",
  "[AUDIT] EQUITY | ISIN: US02079K3059 | Value: 2800000 | Risk: 504000.000"
]

