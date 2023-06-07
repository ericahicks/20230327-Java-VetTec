-- This is a one line comment
/*
This is a 
multi-line 
comment
*/

SelEcT -- capitalization doesn't matter
-- white space doesn't matter
* -- this means "everything"
FROM
   sakila.actor;
-- ---------------------------------------------
-- Problem 1: Retrieve all customer data
SELECT firstname, last_name
FROM sakila.customer;

-- ---------------------------------------------
-- TODO put a screenshot of th film titles in the chat
-- Problem 2: Get the titles of all the films from the film table
SELECT title -- select clause has to be first
FROM sakila.film; -- from clause has to be second

SELECT title
FROM sakila.film
WHERE release_year < 2010; -- where clause must be after from clause, and have conditions to filter on
-- LIMIT 5; -- limit clause must be last

SELECT MAX(release_year) 
FROM sakila.film;

SELECT MIN(release_year) 
FROM sakila.film;

-- ---------------------------------------------
-- Problem 3: Get the first name, last name, and email of all customers
SELECT first_name AS 'First Name',  last_name AS `Last Name`, email AS "Email"
FROM sakila.customer
ORDER BY first_name;


-- ---------------------------------------------
-- TODO put a screenshot of the rental ID, rental date, and return date from the "rental" table
-- Problem 4: 
SELECT rental_ID, rental_date, return_date
FROM sakila.rental
ORDER BY rental_date;

DESCRIBE rental;

-- ---------------------------------------------
-- Problem 5: Get the film titles and descriptions of films that have a rating of "R".
SELECT title, description, rating
FROM sakila.film
WHERE rating = 'R'; -- single and double quotes are the same to sql

/* Comparisons:
=  equals
<
>
<=
>=
AND
OR
*/


-- ---------------------------------------------
-- Problem 6: Retrieve the rental ID, customer ID, and return date of rentals that are overdue 
-- (aka return date is in the past)
SELECT rental_ID, customer_ID, return_date
FROM sakila.rental
-- WHERE return_date < '2023-6-7'; -- how can we check if a date is in the past?
WHERE return_date < CURDATE(); -- you can use built in functions https://dev.mysql.com/doc/refman/8.0/en/built-in-function-reference.html

-- ---------------------------------------------
-- Problem 7: Get the distinct cities from the "city" table.
SELECT DISTINCT * FROM sakila.city;

SELECT COUNT(*) FROM sakila.city; -- COUNT(*) counts the number of rows
SELECT COUNT(city) FROM sakila.city; -- counts the number of non-null values in the city column
SELECT count(*) FROM sakila.staff; -- number of rows is 2 here
SELECT count(password) FROM sakila.staff; -- number of non-null passwords is 1
SELECT * FROM sakila.actor ORDER BY first_name; -- number of 
SELECT COUNT(first_name) FROM sakila.actor;
SELECT COUNT( DISTINCT first_name) FROM sakila.actor;

/*
COUNT
MAX
MIN
SUM
AVG
*/

-- ---------------------------------------------
-- Problem 8: Retrieve the film titles and rental rates of films that 
-- have a rental rate less than $4.50
SELECT title, rental_rate
FROM sakila.film
WHERE rental_rate < 4.50
ORDER BY rental_rate, title;
-- LIMIT 50 OFFSET 150;

SELECT 
    MIN(rental_rate),
    MAX(rental_rate),
    AVG(rental_rate),
    SUM(rental_rate),
    COUNT(rental_rate),
    COUNT(DISTINCT rental_rate)
FROM
    sakila.film;

-- ---------------------------------------------
-- Problem 9:



-- ---------------------------------------------
-- Problem 10: 10.	Challenge: Retrieve the first name, last name, and email of customers 
-- whose last name starts with "S".

SELECT first_name, last_name, email
FROM sakila.customer
WHERE first_name LIKE 'S%'; -- % means any number of characters or _ means exactly one character
-- substring built-in function  = operator

SELECT first_name, last_name, email
FROM sakila.customer
WHERE first_name LIKE '%S%'; 

SELECT first_name, last_name, email
FROM sakila.customer
WHERE first_name LIKE '_S%'; -- second letter is

SELECT first_name, last_name, email
FROM sakila.customer
WHERE first_name LIKE '%S';-- ends with

SELECT first_name, last_name, email
FROM sakila.customer
WHERE first_name LIKE '%SS%'; -- contains a double s

SELECT first_name, last_name
FROM sakila.customer
WHERE first_name LIKE 'A__'; -- 