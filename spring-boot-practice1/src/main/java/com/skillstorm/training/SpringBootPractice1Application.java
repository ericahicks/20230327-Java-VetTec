package com.skillstorm.training;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skillstorm.training.models.Computer;
import com.skillstorm.training.models.Part;

@SpringBootApplication
/*
 * @SpringBootApplication -- tells Spring Boot to do 3 things:
 *    @Configuration -- this is a configuration file
 *    @EnableAutoConfiguration 
 *    @ComponentScan -- this scans the package for your code searching for classes annotated as @Component
 */
public class SpringBootPractice1Application {

	public static void main(String[] args) {
		Computer c = new Computer();
		Part p = new Part();
		p.setComputer(c);
		c.setParts(new HashSet<Part>(Arrays.asList(p)));
		System.out.println(c);
		
		SpringApplication.run(SpringBootPractice1Application.class, args);
		
	}

}
