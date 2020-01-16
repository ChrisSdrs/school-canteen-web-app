-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)



INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('348972198' , 'Elementary 1st Grade', 'John', 'Smith', '1234 Main St, Athens, Greece', 'john.smith@gmail.com', '2101234567', 'john_smith', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Student', 2.0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('384925389' , 'Elementary 1st Grade', 'Jason', 'Wayne', '2278 Main St, Athens, Greece', 'j.wayne@gmail.com', '2105589001', 'j_wayne', '$2a$10$21Z7l0vYZUpNL9/JEtInEuVm7CyLzP8mJFPeH7JLe.SCYN7Ck9fVq', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('556878932' , 'Elementary 1st Grade', 'Luke', 'Bolt', '5779 Main St, Athens, Greece', 'L.B@gmail.com', '2104478970', 'admin', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Admin', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('154480337' , 'Elementary 1st Grade', 'Alex', 'Semer', '5779 Main St, Athens, Greece', 'L.B@gmail.com', '2104478970', 'semer', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('909754361' , 'Elementary 1st Grade', 'Mary', 'Johnson', '9902 Main St, Athens, Greece', 'mary.johnson@gmail.com', '2102044452', 'm_johnson', '$2a$10$GXwXrQkw3HRkmvXoVrHNQ.Lyb/ypASl7doAqrbAkEIQyLp.6t5HJO', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('219812345' , 'Elementary 1st Grade', 'Thomas', 'Robles', '8761 Main St, Athens, Greece', 'T.robles@gmail.com', '2107709532', 't_robles', '$2a$10$rqxIPM5e6ag2Nfv.WB9MZeqlZH51spJYZHtIBRy7t6Jm2SJzAemMu', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('469570126' , 'Elementary 1st Grade', 'Philip', 'Anderson', '9012 Main St, Patras, Greece', 'philip.a@gmail.com', '2610436799', 'philip_a', '$2a$10$h1yvxn9etIlRaP5HA0.HgeLCs9uh0eccGn8/GPYyLgk5BIFIiMbaS', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('358500986' , 'Elementary 1st Grade', 'Socrates', 'Rondulescu', '9902 Main St, Patras, Greece', 'socrates.r@gmail.com', '2610990512', 'socrates_ron', '$2a$10$kFblueaaWbQzw5t47C7Bn.y0hu3gSmPsM9X8AfKpYgZQUTHGnFD0i', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('129063002' , 'Elementary 1st Grade', 'Jason', 'Timberlake', '8008 Main St, Patras, Greece', 'jason.tim@gmail.com', '2610077732', 'jason_tim', '$2a$10$6d88tM4RwqV0cLrg7lJbH.42VvIbotO9r2kquPIldz0myStOxuVsW', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('446906418' , 'Elementary 1st Grade', 'Luke', 'Iglesias', '1239 Main St, Patras, Greece', 'Luke.ig@gmail.com', '2610763802', 'luke_ig', '$2a$10$5pivrLGiBrQXJZAGa7rEBu3o0cTGz3zhHJWsQSnPDxGIrRF5wrz9y', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt)VALUES ('098542318' , 'Elementary 1st Grade', 'Alexander', 'Bolt', '2392 Main St, Patras, Greece', 'alex@gmail.com', '2610996524', 'alexander_bolt', '$2a$10$8GOl.ZuRorxcsvDFDMKEKu6hf79axWOu8yyXidefCjDqrj0lpkwMS', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('638907255' , 'Elementary 1st Grade', 'Manuel', 'Komnenos', '1118 Main St, Athens, Greece', 'm.komnenos@gmail.com', '2101118238', 'manuel_komnenos', '$2a$10$lgK3mFbO/UbuP9IuyBcbou3j6eMx.ZNeQb1rr6T5/Aw2LtjN3Iq1u', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('310819902' , 'Elementary 1st Grade', 'Alexios', 'Komnenos', '8181 Main St, Athens, Greece', 'komnenos@gmail.com', '2108290627', 'alexios_komnenos', '$2a$10$CjmkW7qFSe.GyHaF1MRJr..QqkJlb11Z7A82KLO9UjZxzY.j0E/ty', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('108721781' , 'Elementary 1st Grade', 'John', 'Komnenos', '1087 Main St, Athens, Greece', 'thegood@gmail.com', '2101087589', 'the_good', '$2a$10$nVvm1hJRZEp8jJskcyxl1eoMQPUMpQn/IYhAhEImUbjY0d6.Qthfm', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('565139567' , 'Elementary 1st Grade', 'Flavius', 'Belisarius', '5652 Main St, Athens, Greece', 'belisarius@gmail.com', '2102648900', 'flavius_b', '$2a$10$ROpy5gxJmarOF.gChtgSrORfPtx80bo/BLaVseIpF3dSnxi7.FvqS', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('638907115' , 'Elementary 1st Grade', 'Thomas', 'Brook', '8601 Main St, Athens, Greece', 'thomas@gmail.com', '2109964710', 'thomas', '$2a$10$qXHV8jqMjnKMEsWu9GsUqenm320sRGWA5Ja4yZ123soKgIQQLlM4q', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('382392056' , 'Elementary 1st Grade', 'Philip', 'Amyntason', '3821 Main St, Patras, Greece', 'philip_a.a@gmail.com', '2610382382', 'philip_am', '$2a$10$My0iJJy38/FyvyjHPhiGuuToFW5N1a4xRXjCZaztIAw3vdLxZ8r8a', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('300212345' , 'Elementary 1st Grade', 'Jason', 'Iglesia', '1108 Main St, Patras, Greece', 'jason@gmail.com', '2610889932', 'jason', '$2a$10$aVhDpn7hKgBYSstFWGZRRerjAwNagfutsfxv7bjX/W8ASlkPAKsYS', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('279906336' , 'Elementary 1st Grade', 'Luke', 'Sky', '1999 Main St, Patras, Greece', 'Sky@gmail.com', '2610985331', 'sky', '$2a$10$nyImTyz/n1CN/27jmQOhz.NzGJSmiMGVy4XEvdD.rUjc0wc5aI002', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('007753549' , 'Elementary 1st Grade', 'Itachi', 'Uchiha', '0001 Main St, Patras, Greece', 'itachi@gmail.com', '2610112295', 'itachi_uchiha', '$2a$10$R7a3sPGj8u6e5y608qvj2.hxHBnXX2MAGAPmO8JCy81CfD23AEeZW', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('328449990' , 'Elementary 1st Grade', 'Philip', 'Philipson', '1905 Main St, Patras, Greece', 'philip_p@gmail.com', '2610773490', 'philip_p', '$2a$10$KhP0cf/GfoXhJCPJNaj6eOijF9BzaDK2U6NHdexSSeCmhZKgKgcra', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('406223890' , 'Elementary 1st Grade', 'Plato', 'Ariston', '3651 Main St, Patras, Greece', 'plato_a@gmail.com', '2610994065', 'plato_a', '$2a$10$GjN0ivPCX2Oh7bJVCNHF5OiGXW1Xzq6H59IAF2ewWooCWc19iLoum', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('322678904' , 'Elementary 1st Grade', 'Jason', 'Philipson', '1900 Main St, Patras, Greece', 'jason_ph@gmail.com', '2610845556', 'jason_ph', '$2a$10$xxlWAnhyriEIlnLusw5HreWG22pQnsfV8lAmZHHY7IAvTqb/HU5Om', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('200067344' , 'Elementary 1st Grade', 'Luke', 'Walker', '1997 Main St, Patras, Greece', 'Luke_w@gmail.com', '2610775431', 'Luke', '$2a$10$ZK5BtuU.IoAOXp6MLErYUOtmSzNl1MEwPNP9aLPR1QGYhjgFdxqoi', 'Student', 0);

INSERT INTO USER (user_registration_number, user_grade, user_first_name, user_last_name, user_address, user_email, user_phone, user_username, user_password, user_role, user_debt) VALUES ('744567778' , 'Elementary 1st Grade', 'Madara', 'Uchiha', '1001 Main St, Patras, Greece', 'madara@gmail.com', '2610008744', 'madara', '$2a$10$QjQuqaZJIWTFpiDWjcZsVeyUtj34Y1x67izzjmg6/YGyq5BzVjkwi', 'Student', 0);

INSERT INTO ORDERS (order_regn, order_description, order_cost) VALUES ('348972198', 'tyropita', 2.0 );