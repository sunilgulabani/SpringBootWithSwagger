package com.demo.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BootStrapper {
	public static void main(String[] args) {
		SpringApplication.run(BootStrapper.class, args);

		System.out.println("Swagger API Doc: http://localhost:8080/api-docs");
		System.out.println("Swagger UI: http://localhost:8080/index.html");
	}
}
