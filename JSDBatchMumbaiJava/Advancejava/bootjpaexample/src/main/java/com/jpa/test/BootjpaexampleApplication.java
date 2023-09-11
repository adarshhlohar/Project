package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);

//		User user = new User();

		/*
		 * tHIS IS WORKING 
		 * user.setName("Adarsh"); 
		 * user.setCity("pune"); 
		 * user.setStatus("Programmer");
		 * 
		 * User user1 = userRepo.save(user); 
		 * System.out.println(user1);
		 */
		
		
//		CRUD methods
//		User user1 = new User();
//		user1.setName("Adsrsh");
//		user1.setCity("pune");
//		user1.setStatus("Programmer");
		
		
//		User user2 = new User();
//		user2.setName("addi");
//		user2.setCity("bengluru");
//		user2.setStatus("java programmer");
		
//		saving single user
//		User resultUser = userRepo.save(user1);
//		System.out.println("Saved user" + resultUser);
		
		
//		Saving all the data at onetime 
//		List<User> users = List.of(user1,user2);
//		
//		Iterable<User> result = userRepo.saveAll(users);
//		System.out.println("Saved all users" + result);
//		
////		using forEach Iterator
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
		
//	****************************************************
//	Update using jpa id 1 adarsh to adarsh lohar
//		Optional<User> optional = userRepo.findById(1);
//		
//		User user = optional.get();
//		
//		System.out.println(user);
//		
//		user.setName("Adarsh Lohar");
//		User result = userRepo.save(user);
//		System.out.println(result);
//		
//		
		
		
		

//		****************************************************
		
//		getting element
		Iterable<User > itr = userRepo.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(result->{
//			System.out.println(result);
//		});
		
		

//		****************************************************
//		deleting the single user repository
		
//		userRepo.deleteById(102);
//		System.out.println("delete.....");
//		
		
//		deleting multiples 
		Iterable<User> allusers = userRepo.findAll();
		allusers.forEach(users->{
			userRepo.deleteAll(allusers);
		});
		
		System.out.println("done.....");
		
	}

}
