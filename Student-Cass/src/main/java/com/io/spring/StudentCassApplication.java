package com.io.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class StudentCassApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCassApplication.class, args);
	}
}
