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


2. Start up your application and go to http://localhost:8080/v3/swagger-ui/index.html

3. To customize the documentation, add annotations:
https://github.com/swagger-api/swagger-core/wiki/Swagger-2.X---Annotations 


