package com.deepak.lecturers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LecturersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LecturersApplication.class, args);
		System.out.println("Welcome to Lecturer REST API...");
	}

}
