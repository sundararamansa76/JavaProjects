package com.hare.krsna.restfulwebservices1.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	public static List<User> users = new ArrayList<User>();
	private static int userCount;
	static {
		userCount = 3;
		users.add(new User(1, "Krsna", new Date()));
		users.add(new User(2, "Rama", new Date()));
		users.add(new User(3, "Radha", new Date()));
	}

	public User getUser(Integer id) {
		for (User usr : users) {
			if (usr.getId().equals(id)) {
				return usr;
			}
		}
		return null;
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			userCount++;
			user.setId(userCount);
		}
		users.add(user);
		return user;
	}

}
