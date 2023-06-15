INSERT INTO computer (name) VALUES
("Alienware"),
("Heliumware"),
("Dell");

SELECT * FROM car.computer;

INSERT INTO part (name, computer_id) values
("Graphics Card", 1),
("Processor", 1),
("Dual Fan and Heatsink", 2);

SELECT * FROM car.part;

SELECT * FROM 
computer 
  LEFT JOIN
part
  USING (computer_id);