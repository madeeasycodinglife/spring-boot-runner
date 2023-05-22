package com.madeeasy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello from CommandLineRunner");
	}
}
