# Terminology

Spring Framework - Java framework for web applications with a large ecosystem of subprojects we can use like spring security, spring cloud, spring data

Spring Boot - Takes an opinionated view on the Spring framework so it comes with the tool spring initializer that allows us to generate the project already able to run
Spring Initializr - tool we use to initialize our project and decide what settings we want
  - Important settings to remember: use Maven (not Gradle)
  - We use Java 8 and Spring  version 2.7 (not version 3)
  - REST application needs
      1. spring data jpa
      2. spring web
      3. mysql driver

Java Beans - This is a class in Java that follows the rules:
   1. private instance variables
   2. default constructor
   3. getters/setters follow naming convention
POJO - plain/poor old java object
   1. doesn't implement or extend any other interfaces/classes

Inversion of Control (IoC) - the bean retains control of itself instead of the "owner" class which needs an instance of it
Dependency Injection - Spring gives us the instance of an object type we need
@Autowired - This gives us an instance of the specified type without us calling a constructor (useful for loose coupling)

application.properties File - where to store the password, user, url for mysql, in general your database connection information, along with other key-value pairs


Object Relational Mapping - ORM is the generic concept for mapping objects (any oop language) to tables in any relational database
JPA - Java Persistence API which is a standard for the mappings of java model classes to the tables in a database
Hibernate - the JPA implementation we/Spring Data JPA is using 

Entity Mappings - 
Entity Annotations -
OneToOne - 

Model Layer - 
Repository Layer - 
Service Layer - 
Controller Layer - 

@RestController - 
@RequestMapping("/url") - 
@GetMapping - 
@PostMapping -
@PutMapping - 
@DeleteMapping - 

HTTP - Hypertext Transfer Protocol used for sending requests and responses over the web (can be used 
HTTP Request and Response - Request sent over the we
HTTP Methods -
   - POST = create
   - GET = read
   - PUT = update
   - DELETE = delete/remove
HTTP Statuses - 
   - 100 information
   - 200 success (200 OK, 201 CREATED, 204 NO CONTENT)
   - 300 redirection
   - 400 client error (ex: 404 bad request)
   - 500 server error 
HTTPS - Secure version of HTTP that encrypts the requests and responses instead of sending in plain text (need SSL certificate to use this)

Idempotency and Safety - 
   - indempotency: GET, PUT, DELETE requests can be run multiple times without having unintended side-effect (POST is NOT indempontent - also PATCH and CONNECT)
   - safe: not changing the state of the server ex: GET, HEAD, OPTIONS


REST - Representational
       State
       Transfer
     - REST Api sends data over the network in response to requests
     - Rules for how we set up the API endpoints
        1. unique - one api endpoint per resource
        2. stateless - 
        3. client-server - 
        4. cacheable - 
        5. layered - 
        6. runnable code

JSON - javascript object notation (use curly braces and key-value pairs where the key is in quotes, the value can be a number, a string in quotes, an array in [ ] or a nested object)

Postman - tool for generating http requests to test our api
