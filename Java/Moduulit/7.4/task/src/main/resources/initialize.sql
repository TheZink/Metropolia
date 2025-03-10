USE converter;

DROP TABLE IF EXISTS currency;

CREATE TABLE IF NOT EXISTS currency (
    id INT PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    rates DECIMAL(10,4) NOT NULL
);

INSERT INTO Currency (code, name ,rates) VALUES ('USD', 'US Dollar', 1.0);
INSERT INTO Currency (code, name ,rates) VALUES ('EUR', 'Euro', 0.9);
INSERT INTO Currency (code, name ,rates) VALUES ('AUD', 'Australian Dollar', 1.5);
INSERT INTO Currency (code, name ,rates) VALUES ('CAD', 'Canadian Dollar', 1.4);
INSERT INTO Currency (code, name ,rates) VALUES ('CHF', 'Swiss Franc', 1.1);
INSERT INTO Currency (code, name ,rates) VALUES ('CNY', 'Chinese Yuan', 7.0);
INSERT INTO Currency (code, name ,rates) VALUES ('INR', 'Indian Rupee', 70.0);
INSERT INTO Currency (code, name ,rates) VALUES ('KRW', 'South Korean Won', 1200.0);
INSERT INTO Currency (code, name ,rates) VALUES ('GBP', 'British Pound', 0.8);
INSERT INTO Currency (code, name ,rates) VALUES ('JPY', 'Japanese Yen', 110.0);