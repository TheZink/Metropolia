DROP DATABASE IF EXISTS CONVERTER;
CREATE DATABASE CONVERTER;

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'appuser';
GRANT SELECT, INSERT ON CONVERTER TO 'appuser';


USE CONVERTER;

DROP TABLE IF EXISTS Currency;

CREATE TABLE IF NOT EXISTS Currency (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    value DECIMAL(10,4) NOT NULL
);

INSERT INTO Currency (name, value) VALUES ('USD', 1.0);
INSERT INTO Currency (name, value) VALUES ('EUR', 0.85);
INSERT INTO Currency (name, value) VALUES ('KZT', 330.0);
INSERT INTO Currency (name, value) VALUES ('BYN', 2.0);
INSERT INTO Currency (name, value) VALUES ('GBP', 0.75);
INSERT INTO Currency (name, value) VALUES ('JPY', 110.0);
INSERT INTO Currency (name, value) VALUES ('CNY', 6.5);
INSERT INTO Currency (name, value) VALUES ('UAH', 27.0);




