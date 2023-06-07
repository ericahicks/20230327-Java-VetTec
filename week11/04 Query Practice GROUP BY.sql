/*
1.	Count the number of films in each category.
*/
SELECT COUNT(film.film_id ) AS num_films, category.name, film.title
FROM film 
   JOIN
     film_category
   USING  (film_id)-- shorthand for ON blank = blank
     JOIN
    category
   USING (category_id)
GROUP BY category_id
ORDER BY num_films;


/*
2.	Calculate the average rental duration for films in each language.
3.	Determine the number of rentals made by each staff member.
4.	Find the total sales (revenue) for each customer:
5.	Calculate the average replacement cost of films in each rating category.
6.	Find the total number of rentals per day.
7.	Determine the maximum rental rate for each film category.
8.	Calculate the total revenue for each month in the payment table.
9.	Find the average rental rate and length for films in each language.
10.	Determine the minimum and maximum rental duration for films in each category.
*/
SELECT MIN(film.length) AS Min , MAX(film.length) AS Max, category.name
FROM film 
   JOIN
     film_category
   USING  (film_id)-- shorthand for ON blank = blank
     JOIN
    category
   USING (category_id)
GROUP BY category_id
ORDER BY Max desc;