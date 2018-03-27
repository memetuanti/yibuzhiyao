package edu.zut.cs.javaee.dream.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.UserManager;

@Component
public class UserManagerImpl implements UserManager {

	@Override
	public User findbyUsername(String username) {
		User user = new User();
		user.setUsername(username);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> all = new ArrayList<User>();
		for (int i = 0; i < 100; i++) {
			User u = new User();
			u.setUsername("username_" + i);
			u.setPassword("password_" + i);
			all.add(u);
		}
		return all;
	}

}
