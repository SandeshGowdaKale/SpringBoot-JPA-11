package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dto.User;
import com.jpa.test.repository.UserRepository;

import antlr.collections.impl.LList;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Sandesh");
//		user.setCity("Bangalore");
//		user.setStatus("I am Java Programmer");
//
//		User user2 = userRepository.save(user);
//		System.out.println(user2);

		// create Object Of User
//		User user1 = new User();
//		user1.setName("sohail");
//		user1.setCity("mumbai");
//		user1.setStatus("Python Programmer");
//
//		User user2 = new User();
//		user2.setName("aniket");
//		user2.setCity("mumbai");
//		user2.setStatus("c# Programmer");
//		userRepository.save(user1);
//		userRepository.save(user2);
//		// saving single user
//		List<User> list = List.of(user1, user2); // java 9 method
//		Iterable<User> result = userRepository.saveAll(list);
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		// update the user id 5
//		Optional<User> optional = userRepository.findById(5);
//		User user = optional.get();
//		System.out.println(user);
//
//		user.setName("Eshwar");
//		User user2 = userRepository.save(user);
//		System.out.println(user2);

		// How to get the Data
		Iterable<User> iterable = userRepository.findAll();
//		Iterator<User> iterator = iterable.iterator();
//		while (iterator.hasNext()) {
//			User user3 = iterator.next();
//			System.out.println(user3);
//		}

//		iterable.forEach(new Consumer<User>() {  //Anonymous
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});

//		iterable.forEach(user -> System.out.println(user)); // Lambda function

		// Deleting the User elements
//		userRepository.deleteById(5);
//		System.out.println("deleted");

//		Iterable<User> iterable2 = userRepository.findAll();
//		iterable2.forEach(user -> System.out.println(user));

		// delete all
		// userRepository.deleteAll(iterable2);

//		List<User> users = userRepository.findByName("sandesh");
//		users.forEach(user -> System.out.println(user));

		// refer
		// https://docs.spring.io/spring-data/solr/docs/current/reference/html/#solr.repositories
//		List<User> users1 = userRepository.findByNameAndCity("sandesh", "Bangalore");
//		users1.forEach(user -> System.out.println(user));

		List<User> allUser = userRepository.getAllUser();

		allUser.forEach(listUser -> System.out.println(listUser));
		System.out.println("---------------------------------------------------------");
//		List<User> users = userRepository.getUserByName("sunil");
//		users.forEach(user -> System.out.println(users));

//		List<User> users = userRepository.getUserByNameAndCity("sunil", "bangalore");
//		users.forEach(user -> System.out.println(users));

//		List<User> list = userRepository.getUserByCity("mumbai");
//		list.forEach(user -> System.out.println(user));

		// Native query

		List<User> list = userRepository.getUsers();
		list.forEach(user -> System.out.println(user));
	}

}
