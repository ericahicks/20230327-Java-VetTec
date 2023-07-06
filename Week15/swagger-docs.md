# Swagger Documentation for our Spring Boot REST Api

## Introduction

Swagger-ui is a tool for generating the documentation for our REST api using annotations on our controller class methods.
It generates an html file to easily understand what api endpoints are available, what parameters and headers they need, 
and what responses look like.

## Instructions

1. Add Swagger-ui to your projects pom.xml file
<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui -->
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.7.0</version>
		</dependency>


2. Start up your application and go to http://localhost:8080/swagger-ui/index.html

3. To customize the documentation, add annotations:

Some annotations we can use are
`@Operation`
`@ApiResponse`
`@Content`
`@Schema`
`@ArraySchema`

https://github.com/swagger-api/swagger-core/wiki/Swagger-2.X---Annotations 

4. You can customize the documentation settings/configurations in the application.properties file

```
# Sort the API paths according to their HTTP methods 
springdoc.swagger-ui.operationsSorter=method

# Change the file-name where the interactive html page can be found so its now http://localhost:8080/swagger-ui-custom.html
springdoc.swagger-ui.path=/swagger-ui-custom.html
```


