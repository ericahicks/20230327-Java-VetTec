-- Delete table
DROP TABLE books;

-- Creating a table
CREATE TABLE `books` (
  `isbn` int NOT NULL,
  `author` varchar(45) DEFAULT NULL,
  `title` varchar(45) NOT NULL,
  `genre` varchar(45) DEFAULT NULL
);

-- Add a constraint 
ALTER TABLE books
ADD CONSTRAINT books_pk
     PRIMARY KEY (author, title);
     
ALTER TABLE books
DROP COLUMN isbn;


-- Create a genre table
CREATE TABLE `genre` (
  `id` int UNSIGNED PRIMARY KEY NOT NULL,
  `name` varchar(45) NOT NULL
);

ALTER TABLE books
DROP COLUMN genre;

ALTER TABLE books
ADD COLUMN genre_id INT UNSIGNED NOT NULL;

-- Add a constraint 
ALTER TABLE books
ADD CONSTRAINT books_fk_genre
     FOREIGN KEY (genre_id)
     REFERENCES genre (id);
     
-- 

/*
When changing the schema use:
CREATE
ALTER
DROP

When changing the data in a table use the SQL commands for CRUD (ISUD) which are:
INSERT INTO
SELECT 
UPDATE
  SET
  WHERE
DELETE FROM
*/