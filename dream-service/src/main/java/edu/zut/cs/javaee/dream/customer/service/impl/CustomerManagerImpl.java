package edu.zut.cs.javaee.dream.customer.service.impl;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerManagerImpl implements CustomerManager {

    @Override
    public List<User> findByPostcode(String postcode) {
        List<User> result = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            result.add(u);
        }
        return result;
    }

}
