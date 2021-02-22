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
//		Query q = db.createQuery("from User u where u.id = 1", User.class);
//		User u = (User) q.getSingleResult();
//		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.r
//		UserRepository userRepository = configurable
		SpringApplication.run(SklepWarzywnyApplication.class, args);
	}

}
