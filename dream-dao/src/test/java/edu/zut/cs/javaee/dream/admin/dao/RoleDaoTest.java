package edu.zut.cs.javaee.dream.admin.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Role;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;

public class RoleDaoTest extends GenericDaoTestCase<Long, Role, RoleDao> {

	@Autowired
	RoleDao roleDao;

	@Test
	public void test() {
		Role r = new Role();
		r.setName("test_role");
		Role test_role = this.roleDao.save(r);
		Long role_id = test_role.getId();
		Role result = this.roleDao.getOne(role_id);
		assertEquals(test_role, result);
		List<Role> all = this.roleDao.findAll();
	}

}
