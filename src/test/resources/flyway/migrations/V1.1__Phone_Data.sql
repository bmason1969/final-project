-- Products
INSERT INTO products (product_id, product_name) VALUES(100, 'IPhone');
INSERT INTO products (product_id, product_name) VALUES(200, 'Samsung');
INSERT INTO products (product_id, product_name) VALUES(300, 'Motorola');
INSERT INTO products (product_id, product_name) VALUES(400, 'LG');
INSERT INTO products (product_id, product_name) VALUES(500, 'Nokia');

-- Models

INSERT INTO models (model_id,  price, product_id) VALUES('IPhone 14', 800, 100);
INSERT INTO models (model_id,  price, product_id) VALUES('IPhone 13', 750, 100);
INSERT INTO models (model_id, price, product_id) VALUES('Samsung S22', 800, 200);
INSERT INTO models (model_id, price, product_id) VALUES('Samsung A23', 300, 200);
INSERT INTO models (model_id, price, product_id) VALUES('Motorola 5G Stylus', 285, 300);
INSERT INTO models (model_id,  price, product_id) VALUES('Motorola 5G', 300, 300);
INSERT INTO models (model_id, price, product_id) VALUES('LG Stylo 6',  265, 400);
INSERT INTO models (model_id, price, product_id) VALUES('LG Stylo 5',  215, 400);
INSERT INTO models (model_id,  price, product_id) VALUES('Nokia XR20',  399, 500);
INSERT INTO models (model_id,  price, product_id) VALUES('Nokia T20',  179, 500);

-- Inventory
INSERT INTO inventory (model_id, stock) VALUES('IPhone 14', 800);
INSERT INTO inventory (model_id, stock) VALUES('IPhone 13', 700);
INSERT INTO inventory (model_id, stock) VALUES('Samsung S22', 600);
INSERT INTO inventory (model_id, stock) VALUES('Samsung A23', 300);
INSERT INTO inventory (model_id, stock) VALUES('Motorola 5G Stylus', 400);
INSERT INTO inventory (model_id, stock) VALUES('Motorola 5G', 300);
INSERT INTO inventory (model_id, stock) VALUES('LG Stylo 6', 500);
INSERT INTO inventory (model_id, stock) VALUES('LG Stylo 5', 300);
INSERT INTO inventory (model_id, stock) VALUES('Nokia XR20', 600);
INSERT INTO inventory (model_id, stock) VALUES('Nokia T20', 400);
