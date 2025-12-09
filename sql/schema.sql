CREATE TABLE Product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    price NUMERIC(10,2),
    creation_datetime TIMESTAMP DEFAULT NOW()
);

CREATE TABLE Product_category (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    product_id INT REFERENCES Product(id)
);
