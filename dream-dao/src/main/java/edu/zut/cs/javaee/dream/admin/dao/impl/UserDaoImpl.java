package edu.zut.cs.javaee.dream.admin.dao.impl;

import edu.zut.cs.javaee.dream.admin.dao.UserDao;
import edu.zut.cs.javaee.dream.admin.domain.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User getByUsername(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }

}
