package com.example.exception;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExceptionApplication.class, args);
		
		

		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int age=89;
		if(age>88) {
			
			throw new StudentNotFoundException("Age Not found Exception");
		}
	}

}