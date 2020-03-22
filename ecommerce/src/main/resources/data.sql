DROP TABLE IF EXISTS Product;
  
CREATE TABLE product(
  product_id INT AUTO_INCREMENT  PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  product_brand VARCHAR(250) NOT NULL,
  category VARCHAR(250) NOT NULL,
  active BOOLEAN NOT NULL,
  price INT NOT NULL,
  size VARCHAR(250) NOT NULL,
  color VARCHAR(250) NOT NULL
);


INSERT INTO Product (product_id, product_name, product_brand, category, active, price, size, color) VALUES
  (1, 'Roaster shirt', 'Roadster','shirt',true,1000,'XS','GREEN'),
  (2, 'Roaster shirt', 'Roadster','shirt',true,1000,'M','GREEN'),
  (3, 'Roaster shirt', 'Roadster','shirt',true,1000,'L','GREEN'),
  (4, 'Roaster shirt', 'Roadster','shirt',true,1000,'S','GREEN'),
  (5, 'Roaster shirt', 'Roadster','shirt',true,1000,'XL','GREEN'),
  (6, 'Roaster shirt', 'Roadster','shirt',true,1000,'XXL','GREEN'),
  (7, 'Roaster shirt', 'Roadster','shirt',true,1000,'XS','RED'),
  (8, 'Roaster shirt', 'Roadster','shirt',true,1000,'M','RED'),
  (9, 'Roaster shirt', 'Roadster','shirt',true,1000,'L','RED'),
  (10, 'Roaster pant', 'Roadster','pant',true,1000,'S','RED'),
  (11, 'Nike shirt', 'Nike','t-shirt',true,3400,'XL','RED'),
  (12, 'Nike shirt', 'Nike','t-shirt',true,8000,'XXL','YELLOW'),
   (13, 'Nike t-shirt', 'Nike','t-shirt',true,1000,'XS','RED'),
  (14, 'Nike t-shirt', 'Nike','t-shirt',true,1000,'M','RED'),
  (15, 'Nike shirt', 'Nike','shirt',true,1000,'L','YELLOW'),
  (16, 'Nike pant', 'Nike','pant',true,1000,'S','RED'),
  (17, 'Nike t-shirt', 'Nike','t-shirt',true,3400,'XL','Olive'),
  (18, 'Nike t-shirt', 'Nike','t-shirt',true,8000,'XXL','YELLOW'),
  (19, 'Nike t-shirt', 'Nike','t-shirt',true,1000,'XS','RED'),
  (20, 'Adidas t-shirt', 'Adidas','t-shirt',true,1000,'M','RED'),
  (21, 'Adidas shirt', 'Adidas','shirt',true,1000,'L','YELLOW'),
  (22, 'Adidas pant', 'Adidas','pant',true,1000,'S','RED'),
  (23, 'Adidas t-shirt', 'Adidas','t-shirt',true,3400,'XL','Olive'),
  (24, 'Adidas shirt', 'Adidas','t-shirt',true,8000,'XXL','YELLOW');