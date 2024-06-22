package com.minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate > Database
	// UserDaoService > Static List
	
private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	// this is List of users 
	static {
		users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Eve",LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"Jim",LocalDate.now().minusYears(20)));
	    users.add(new User(++usersCount,"Prashant",LocalDate.now().minusYears(21)));

	}
	      // save the data 
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	     // for add the id 
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	public List<User> findAll() {
		return users;
	}
	
         // for delete the id 
	public void  deletebyId(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		 users.removeIf(predicate);
	}
}