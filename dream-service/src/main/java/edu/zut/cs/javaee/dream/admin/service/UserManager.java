package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.admin.domain.User;

import java.util.List;

public interface UserManager {

    List<User> findAll();

    User findbyUsername(String username);
}
