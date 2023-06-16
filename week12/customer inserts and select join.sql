SELECT * FROM sakilastorm.customer;

INSERT INTO COUNTRY (country)
VALUES ("USA"), ("Canada"), ("Mexico");

SELECT first_name, last_name, email, phone, city, country
FROM sakilastorm.customer
JOIN address USING (address_id)
JOIN city USING (city_id)
JOIN country USING (country_id)
ORDER BY country, city, last_name, first_name;

UPDATE COUNTRY 
SET last_updated = now()
WHERE country_id < 4;

INSERT INTO CITY (city, country_id, last_updated)
VALUES ("Mexico City", 3, now()), ("Chicago", 1, now()), ("Toronto", 2, now());

INSERT INTO ADDRESS (address, address2, district, city_id, postal_code, phone, last_update)
VALUES ("123 Main St", "Apt 12", "Ontario", 3, "L4K", "14161234567", now()),
("321 First St", "", "Illinois", 2,"60007",  "13121112345", now()),
("21 Second St", "Apt 505",  "Jalisco", 2, "44199", '520838016880', now());

INSERT INTO CUSTOMER (first_name, last_name, email, address_id, active, create_date, last_update)
VALUES
("John","Doe", "jdoe@gmail.com", 1, true, curdate(), now()),
("Sara", "Smith", "sarasmith@yahoo.com", 2, true, curdate(), now()),
("Dan", "Pickles", "pickles@aol.com", 3, false, curdate(), now());