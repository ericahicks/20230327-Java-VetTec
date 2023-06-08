/*
Built-in Functions
- If you are trying to format, convert, or manipulate a value, 
  there is almost always a built-in function that will do that, 
  you just need to find which one it is.
https://dev.mysql.com/doc/refman/8.0/en/functions.html
*/
SELECT year(curdate());
SELECT month(curdate());
SELECT year('70-10-11'); -- two digit years 70-99 are 1900s
SELECT year('69-2-14'); -- 0-29 are 2000s
SELECT TIMESTAMPDIFF(YEAR,'2000-01-01',CURDATE()) AS age;

SELECT substr('hello',4,2); -- start and number of characters
SELECT substr('hello',2); -- 'ello' NOT zero-indexed 
SELECT substr('hello', 1); -- 'hello'
SELECT substr('hello', 0); -- does not work
SELECT left('hello', 1); 
SELECT right('hello', 2); 

SELECT concat('hello', ' ', 'world');
SELECT upper('hello');
SELECT lower('HELLO');

