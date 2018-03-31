package edu.zut.cs.javaee.dream.admin.dao;

import edu.zut.cs.javaee.dream.admin.domain.User;

public interface UserDao {


    User getByUsername(String username);
}
