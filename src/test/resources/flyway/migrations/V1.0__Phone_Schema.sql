-- Products
DROP TABLE IF EXISTS inventory;
DROP TABLE IF EXISTS models;
DROP TABLE IF EXISTS products;

CREATE TABLE products (
  product_id int unsigned NOT NULL,
  product_name varchar(45) NOT NULL, 
  
  PRIMARY KEY (product_id)
);

CREATE TABLE models (  
  model_id varchar(40),
  price DECIMAL NOT NULL,
  product_id int unsigned NOT NULL,
  PRIMARY KEY (model_id),
  FOREIGN KEY (product_id) REFERENCES products (product_id)
);

CREATE TABLE inventory (
  inventory_pk int unsigned NOT NULL AUTO_INCREMENT,
  model_id varchar(40),
  stock int unsigned NOT NULL,
  PRIMARY KEY (inventory_pk),
  FOREIGN KEY (model_id) REFERENCES models (model_id)
);


