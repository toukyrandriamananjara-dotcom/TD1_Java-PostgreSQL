CREATE DATABASE product_management_db;

CREATE USER product_manager_user WITH PASSWORD '123456';

GRANT ALL PRIVILEGES ON DATABASE product_management_db TO product_manager_user;

\c product_management_db;
GRANT ALL ON SCHEMA public TO product_manager_user;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO product_manager_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO product_manager_user;