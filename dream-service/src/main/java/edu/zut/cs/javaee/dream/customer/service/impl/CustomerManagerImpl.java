package edu.zut.cs.javaee.dream.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.customer.service.CustomerManager;

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
