# Expense Tracker API

## Description
A RESTful API to manage personal or business expenses with features like authentication, expense categorization, and analytics.

## Technologies
- Java
- Spring Boot
- H2 Database

## Features
- Add, update, delete expenses.
- Categorize expenses.
- View all expenses.

## Installation
1. Clone the repository.
2. Run `mvn spring-boot:run`.
3. Access H2 Console: `http://localhost:8080/h2-console`.

## API Endpoints
- `GET /api/expenses` - Fetch all expenses.
- `POST /api/expenses` - Create a new expense.
- `DELETE /api/expenses/{id}` - Delete an expense.

## License
MIT
