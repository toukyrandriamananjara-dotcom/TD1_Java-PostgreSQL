-- Insertion des produits
INSERT INTO Product (id, name, price, creation_datetime) VALUES
(1, 'Laptop Deli XPS', 4500.00, '2024-01-16 09:30:00'),
(2, 'Phone 13', 5300.00, '2024-02-01 14:10:00'),
(3, 'Casque Sony WHT000', 890.50, '2024-02-10 16:45:00'),
(4, 'Carrier Logitech', 180.00, '2024-03-05 17:20:00'),
(5, 'Form Seminorg 27*', 1200.00, '2024-03-18 08:00:00');

-- Insertion des catégories
INSERT INTO Product_category (id, name, product_id) VALUES
(1, 'Informatique', 1),
(2, 'Téléphonie', 2),
(3, 'Audio', 3),
(4, 'Accessoires', 4),
(5, 'Informatique', 5),
(6, 'Bureau', 5),
(7, 'Mobile', 2);