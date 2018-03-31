package edu.zut.cs.javaee.dream.admin.service;

import edu.zut.cs.javaee.dream.admin.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class UserManagerTest {

    @Autowired
    UserManager userManager;

    @Test
    public void testFindAll() {
        List<User> all = this.userManager.findAll();
        assertEquals(all.size(), 100);
    }

    @Test
    public void testFindbyUsername() {
        String username = "world";
        User expected_user = new User();
        expected_user.setUsername(username);
        User user = this.userManager.findbyUsername(username);
        assertEquals(user.getUsername(), expected_user.getUsername());
        assertEquals(user, expected_user);
    }

}
