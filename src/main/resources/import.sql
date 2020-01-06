-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)


INSERT INTO USER (user_registration_number, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role) VALUES ('348972198' , 'John', 'Smith', '1234 Main St, Athens, Greece', 'john.smith@gmail.com', '2101234567', 'john_smith', '123', 'Student');
INSERT INTO USER (user_registration_number, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role) VALUES ('348972198' , 'John', 'Smith', '1234 Main St, Athens, Greece', 'john.smith@gmail.com', '2101234567', 'john_smith', '123', 'Student');
INSERT INTO USER (user_registration_number, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role) VALUES ('348972198' , 'John', 'Smith', '1234 Main St, Athens, Greece', 'john.smith@gmail.com', '2101234567', 'john_smith', '123', 'Student');
INSERT INTO USER (user_registration_number, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role) VALUES ('348972198' , 'John', 'Smith', '1234 Main St, Athens, Greece', 'john.smith@gmail.com', '2101234567', 'john_smith', '123', 'Student');
INSERT INTO USER (user_registration_number, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role) VALUES ('348972198' , 'John', 'Smith', '1234 Main St, Athens, Greece', 'john.smith@gmail.com', '2101234567', 'john_smith', '123', 'Student');


INSERT INTO PRODUCT (product_name, product_price) VALUES ('cheese pie', 2.25);
INSERT INTO PRODUCT (product_name, product_price) VALUES ('cheese pie', 2.25);
INSERT INTO PRODUCT (product_name, product_price) VALUES ('cheese pie', 2.25);
INSERT INTO PRODUCT (product_name, product_price) VALUES ('cheese pie', 2.25);
INSERT INTO PRODUCT (product_name, product_price) VALUES ('cheese pie', 2.25);
