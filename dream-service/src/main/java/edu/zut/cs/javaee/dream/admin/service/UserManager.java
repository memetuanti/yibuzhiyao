package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.User;

public interface UserManager {

	List<User> findAll();

	User findbyUsername(String username);
}
