Product Management System
A Spring Boot application demonstrating CRUD operations for product management, integrating MySQL for persistent storage. This project follows a three-layer architecture (Controller, Service, Repository) to ensure clean code separation and maintainability.

Features
Create: Add new products with details like name, price, and quantity.

Read: Retrieve all products or a specific product by ID.

Update: Modify existing product details.

Delete: Remove products from the database.

Validation: Ensures data integrity using annotations like @NotNull, @Size, and @Positive.

Technologies Used
Java 17

Spring Boot

Spring Data JPA

MySQL

Maven

Getting Started
Prerequisites
Java 17 or higher

Maven

MySQL Server

Installation
Clone the repository:

bash
Copy
Edit
git clone https://github.com/Kalpanashan74/ProductManagmentSystem.git
cd ProductManagmentSystem
Set up the MySQL database:

Create a new database:

sql
Copy
Edit
CREATE DATABASE products_db;
(Optional) Use the provided products_db.sql script to set up the initial schema.

Configure application properties:

Navigate to src/main/resources/application.properties and update the following:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/products_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build and run the application:

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
The application will start on http://localhost:8080.

API Endpoints
Method	Endpoint	Description
GET	/products	Retrieve all products
GET	/products/{id}	Retrieve a product by ID
POST	/products	Create a new product
PUT	/products/{id}	Update an existing product
DELETE	/products/{id}	Delete a product

Sample JSON for POST/PUT
json
Copy
Edit
{
  "name": "iPhone",
  "price": 299.99,
  "quantity": 15
}
Project Structure
css
Copy
Edit
ProductManagmentSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── spring/
│   │   │           └── mySqlDemo/
│   │   │               ├── Product.java
│   │   │               ├── ProductController.java
│   │   │               ├── ProductRepository.java
│   │   │               └── ProductService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── products_db.sql
└── pom.xml
Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

License
This project is licensed under the MIT License.
