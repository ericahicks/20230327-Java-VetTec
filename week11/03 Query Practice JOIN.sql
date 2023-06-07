-- Joining Data from multiple tables

SELECT first_name, last_name, title, release_year
FROM
  actor
    JOIN
 film_actor ON actor.actor_id = film_actor.actor_id
    JOIN
 film ON film.film_id = film_actor.film_id;
 
 /*
 1.	Retrieve the film title and the language name it is in.
 */
 SELECT film.title, language.name
 FROM film 
     right JOIN
      language ON film.language_id = language.language_id
WHERE title IS NULL
ORDER BY film.language_id, title;


 
 /*
2.	Retrieve the staff member's first name and the store they work at.

*/ 
SELECT first_name, store.store_id
FROM store
	JOIN
     staff ON staff.store_id = store.store_id
ORDER BY store.store_id ASC, first_name ASC;



/*
3.	Retrieve the customer's first name and the rental date of the films they have rented.

*/
SELECT customer.first_name, rental.rental_date
FROM customer JOIN rental ON rental.customer_id = customer.customer_id
ORDER BY first_name;

/*
4.	Get the staff member's first name and the number of customers they have assisted.

*/



/*
5.	Get the customer's first name and the total amount they have paid in payments.
*/


/*
6.	Retrieve the customer's first name, last name, and the film title they rented along with the rental date.
*/
select first_name, last_name, film.title, rental_date
FROM
  customer
    JOIN
  rental ON customer.customer_id = rental.customer_id
    JOIN
  inventory ON rental.inventory_id = inventory.inventory_id
    JOIN
  film ON inventory.film_id = film.film_id
ORDER BY customer.last_name, customer.first_name, rental_date, film.title;

/*
7.	Get the customer's first name, last name, and the film titles they have rented.
*/

/*
8.	Retrieve the customer's first name, last name, and the number of films they have rented.
*/
-- total number of films Rafael Abney has rented:
select first_name, last_name, count(*)
FROM
  customer
    JOIN
  rental ON customer.customer_id = rental.customer_id
    JOIN
  inventory ON rental.inventory_id = inventory.inventory_id
    JOIN
  film ON inventory.film_id = film.film_id
WHERE first_name = "Rafael" AND last_name = "Abney"
GROUP BY customer.customer_id;

-- total number of films each customer has rented

select first_name, last_name, count(*)
FROM
  customer
    JOIN
  rental ON customer.customer_id = rental.customer_id
    JOIN
  inventory ON rental.inventory_id = inventory.inventory_id
    JOIN
  film ON inventory.film_id = film.film_id
GROUP BY customer.customer_id
ORDER BY count(*);


/*
9.	Get the customer's first name, last name, and the category name of the films they have rented.

*/

/*
10.	Get the film's title, description, and the number of times it has been rented:

 */
 