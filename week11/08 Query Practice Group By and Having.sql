-- 4 Find the total sales (revenue) for each customer
SELECT customer_id, SUM(amount) AS revenue
FROM payment
GROUP BY customer_id;

SELECT 
    first_name, SUM(amount)
FROM
    customer
        JOIN
    payment ON customer.customer_id = payment.customer_id
GROUP BY first_name
ORDER BY SUM(amount) DESC;

-- 6 Find the total number of rentals per day.
SELECT 
   DATE(rental_date) AS Day,  -- Don't care about the time of Day
   count(*) AS Rentals
FROM sakila.rental
GROUP BY DATE(rental_date);

/*
1.	Retrieve the rental count and customer ID for customers who have rented more than 30 films.
2.	Get the total payment amount and customer ID for customers whose total payment amount exceeds $200.
3.	Find the average rental rate and rental duration for films that have an average rental rate greater than $3.50.
4.	Retrieve the film IDs and their rental counts for films that have been rented more than 50 times.
5.	Get the customer ID and the number of distinct cities the customer has rented films from for customers who have rented from more than 2 distinct cities.

*/

-- 1 Rental Count and Customer ID
SELECT customer_id, COUNT(*) AS 'Rental Count'
FROM sakila.rental
GROUP BY customer_id
HAVING COUNT(*) > 30
ORDER BY COUNT(*) DESC;

-- 2 Payment amount for customers over $200
SELECT customer_id, SUM(amount) AS revenue
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 200;

-- 3 Avg rental rate and duration for films with rental rate > 3.50
SELECT AVG(rental_rate), AVG(length)
FROM rental JOIN inventory USING (inventory_id) JOIN film USING (film_id)
GROUP BY rental_rate
HAVING AVG(rental_rate) > 3.50;