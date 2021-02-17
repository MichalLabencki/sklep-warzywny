package com.example.sklepwarzywny;

import com.example.sklepwarzywny.user.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SklepWarzywnyApplication {

	private static Session db;

	public static void main(String[] args) {
//		Query q = db.createQuery("from User u where u.id = 1", User.class);
//		User u = (User) q.getSingleResult();

		SpringApplication.run(SklepWarzywnyApplication.class, args);
	}

}
