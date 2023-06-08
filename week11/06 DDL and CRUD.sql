/* CRUD (or ISUD)
Create - insert
Read - select
Update - update
Delete - delete
*/

-- Insert a student into the student table
INSERT INTO student (first_name, last_name, dob, class) VALUES 
('John', 'Doe', '2016-01-01', null);


INSERT INTO student (first_name, last_name, dob)
 VALUES 
('Jane', 'Doe', '2016-12-11');

SELECT * FROM student;

-- Update a student entry
UPDATE student
SET first_name = 'Jane'
WHERE id = 2;


-- Delete a student
DELETE FROM student
WHERE id = 1;

-- Delete all students
TRUNCATE TABLE student;





/* DDL */
-- Create a schema
CREATE SCHEMA school;

-- Create a table
CREATE TABLE student;

-- Drop a column
ALTER TABLE student
DROP COLUMN first_name;

-- Add a column
ALTER TABLE student
ADD COLUMN first_name VARCHAR(45) NOT NULL;

-- Change column varchar(45) to varchar(50)
ALTER TABLE student
MODIFY COLUMN first_name VARCHAR(50) NOT NULL;

-- Rename column
ALTER TABLE student
RENAME COLUMN class TO class_num;


-- Constraints: 
-- Add pk

-- Add fk
   
-- Delete table

-- Keep table but delete all data

/* CRUD */

-- insert record

-- update record

-- delete record

