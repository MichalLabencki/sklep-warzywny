package com.example.sklepwarzywny;

import com.example.sklepwarzywny.user.User;
import com.example.sklepwarzywny.user.UserRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SklepWarzywnyApplication {

	private static Session db;

	public static void main(String[] args) {
		SpringApplication.run(SklepWarzywnyApplication.class, args);
	}

}
