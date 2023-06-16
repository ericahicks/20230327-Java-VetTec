DROP TABLE IF EXISTS books;

CREATE TABLE `books` (
  `isbn` char(11) NOT NULL,
  `author_first_name` varchar(45) DEFAULT NULL,
  `author_last_name` varchar(45) DEFAULT NULL,
  `title` varchar(100) NOT NULL,
  `genre` varchar(30) DEFAULT NULL,
  `year` int DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('521186422-0', 'Erhard', 'Dodwell', 'L!fe Happens', 'Comedy', 1996);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('207925960-1', 'Ruperta', 'Mudie', 'Foxfire', 'Fiction', 1994);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('308825334-4', 'Stephine', 'Perrett', 'Jack and Sarah', 'Romance', 2000);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('937776191-3', 'Viviene', 'Goslin', 'Nasty Old People', 'Fiction', 1996);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('123928973-1', 'Ursa', 'Allso', 'Get on the Bus', 'Fiction', 2006);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('809071850-7', 'Harwell', 'Elford', 'Someone''s Gaze', 'Animation', 2006);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('016941060-9', 'Ruby', 'Sneddon', 'Pennies from Heaven', 'Romance', 2012);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('958324579-8', 'Florence', 'Swayton', 'Cabinet of Dr. Ramirez, The', 'Comedy', 2002);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('371432214-0', 'Davon', 'Cadden', 'Errand Boy, The', 'Comedy', 1998);
insert into books (isbn, author_first_name, author_last_name, title, genre, year) values ('767784499-5', 'Chalmers', 'Schutte', 'Lovely & Amazing', 'Romance', 2008);