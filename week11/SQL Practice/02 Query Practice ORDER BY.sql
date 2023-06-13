/* 
1.	Retrieve all customers from the "customer" table, ordered by last name in descending order:

*/
SELECT * 
FROM sakila.customer
ORDER BY last_name DESC;

/*
2.	Get the titles of all films from the "film" table, ordered by release year in ascending order

*/
SELECT title 
FROM sakila.film
ORDER BY release_year;


/*
3.	Retrieve the first name, last name, and email of all customers, ordered by last name in ascending order and then by first name in ascending order:

*/
SELECT first_name, last_name, email 
FROM sakila.customer
ORDER  BY last_name, first_name;

/*
4.	Get the rental ID, rental date, and return date from the "rental" table, ordered by rental date in descending order:

*/
SELECT rental_id, rental_date, return_date
FROM sakila.rental
ORDER BY rental_date;

/*
5.	Retrieve the first name, last name, and email of customers whose last name starts with "S", ordered by last name in descending order:

*/
SELECT first_name, last_name, email
FROM sakila.customer
WHERE last_name LIKE 'S%'
ORDER BY last_name DESC;

/*
6.	Get the film titles and descriptions of films that have a rating of "R", ordered by length in ascending order:

*/
SELECT title, description, length, length(title)
FROM sakila.film
WHERE rating LIKE 'R' -- notice the columns in the where clause do not have to be in the select clause
ORDER BY length(title) ASC;
/*

7.	Retrieve the rental ID, customer ID, and return date of rentals that are overdue 
(return date is in the past), ordered by customer ID in ascending order:

*/
SELECT rental_id, customer_id, return_date
FROM sakila.rental
WHERE return_date < CURDATE()
ORDER BY customer_id;

/*
8.	Get the distinct cities from the "city" table, ordered by country ID in ascending order and then by city name in ascending order:

*/
SELECT DISTINCT city, country_id
FROM sakila.city
ORDER BY country_id, city; -- note the order by columns must be in the select clause when using DISTINCT
/*
9.	Get a list of all cities from the “city” table ordered alphabetically by country code.

*/
SELECT Name, CountryCode
FROM world.city
ORDER BY CountryCode;
