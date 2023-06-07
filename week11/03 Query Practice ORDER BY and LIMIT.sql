SELECT * FROM world.country;

-- Order by with Limit is useful for getting the smallest or largest 

-- The oldest indep year
SELECT Name, Continent, Region, IndepYear
FROM world.country
WHERE IndepYear IS NOT NULL
ORDER BY IndepYear ASC
LIMIT 1;

-- The most recent indep year
SELECT Name, Continent, Region, IndepYear
FROM world.country
ORDER BY IndepYear DESC
LIMIT 1;

-- The longest life expectancy
SELECT Name, Continent, Region, LifeExpectancy
FROM world.country
ORDER BY LifeExpectancy DESC
LIMIT 5;

-- The shortest life excectancy
SELECT Name, Continent, Region, LifeExpectancy
FROM world.country
WHERE LifeExpectancy IS NOT NULL
ORDER BY LifeExpectancy ASC
LIMIT 1;