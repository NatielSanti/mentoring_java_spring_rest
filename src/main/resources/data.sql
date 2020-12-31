DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);

--CREATE TABLE billionaires ( id INT PRIMARY KEY, first_name VARCHAR(250) NOT NULL, last_name VARCHAR(250) NOT NULL, career VARCHAR(250) DEFAULT NULL);

INSERT INTO customer (first_name, last_name) VALUES
  ('Aliko', 'Dangote'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'Alakija');

--INSERT INTO billionaires (id, first_name, last_name, career) VALUES (1, 'Aliko', 'Dangote', 'Billionaire Industrialist'),(2, 'Bill', 'Gates', 'Billionaire Tech Entrepreneur'),(3, 'Folrunsho', 'Alakija', 'Billionaire Oil Magnate');