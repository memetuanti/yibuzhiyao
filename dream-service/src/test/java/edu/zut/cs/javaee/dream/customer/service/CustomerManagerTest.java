package edu.zut.cs.javaee.dream.customer.service;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.AdminServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class CustomerManagerTest {

    @Autowired
    CustomerManager customerManager;

    @Test
    public void testFindByPostcode() {
        String postcode = "NR74DU";
        List<User> result = this.customerManager.findByPostcode(postcode);
        List<User> expected = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            expected.add(u);
        }
        assertEquals(expected.size(), result.size());

    }

}
