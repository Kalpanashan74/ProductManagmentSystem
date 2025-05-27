CREATE database products_db;
USE products_db;
CREATE TABLE products(
id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    price DECIMAL(10, 2),
    quantity INT
);
SELECT * FROM products_db;
