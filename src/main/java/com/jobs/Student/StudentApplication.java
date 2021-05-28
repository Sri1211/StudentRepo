package com.jobs.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.example.restservice")
public class StudentApplication extends SpringBootServletInitializer {
	 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StudentApplication.class);
		
	}
	@GetMapping("/greetinghello")
	public String hello(@RequestParam(value = "name", defaultValue = "Praveen") String name) {
	return String.format("Hello %s!", name);
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
