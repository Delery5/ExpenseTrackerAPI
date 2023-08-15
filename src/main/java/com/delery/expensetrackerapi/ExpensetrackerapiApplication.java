package com.delery.expensetrackerapi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpensetrackerapiApplication {

	public static void main(String[] args) {
		final Logger log =LoggerFactory.getLogger(ExpensetrackerapiApplication.class);
		log.info("#### Invoked ExpensetrackerapiApplication.java (String[]) method");
		SpringApplication.run(ExpensetrackerapiApplication.class, args);
		log.info("#### Exited ExpensetrackerapiApplication.java (String[]) method");

	}
}
