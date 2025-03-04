SELECT * FROM Currency;
SELECT name, value FROM Currency where name = 'EUR';
SELECT name, value FROM Currency where value > 1.0;

SELECT name, value FROM Currency where max(SELECT MAX(value) from Currency);

SELECT COUNT(*) as count from Currency;