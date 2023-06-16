-- write a join query to get all the information from the computer and the part table
-- table computer has columns id and name
-- table parts has columns id name and computer_id
SELECT * FROM 
computer c
  JOIN
part p ON c.computer_id = p.computer_id;
