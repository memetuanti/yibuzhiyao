package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;

public class UserDaoTest extends GenericDaoTestCase<Long, User, UserDao> {

	@Autowired
	UserDao userDao;

	@Test
	public void testFindAll() {

		List<User> result = this.userDao.findAll();

	}

}
