package com.gtspring.BankingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {

		System.out.println("App is starting...");
		SpringApplication.run(BankingAppApplication.class, args);
		System.out.println("App started...");
	}

}
