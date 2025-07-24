---------------------Question 1----------------

SELECT country, city from city
INNER JOIN country ON city.country_id = country.country_id;

--------------------Question 2 ----------------

SELECT customer.first_name, customer.last_name FROM payment
INNER JOIN customer ON customer.customer_id = payment.customer_id;

--------------------Question 3-----------------

SELECT rental_id, first_name, last_name FROM rental
INNER JOIN customer ON rental.customer_id = customer.customer_id