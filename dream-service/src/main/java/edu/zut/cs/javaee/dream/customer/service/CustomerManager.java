package edu.zut.cs.javaee.dream.customer.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.User;

public interface CustomerManager {

	/**
	 *  get customers according to postcode
	 * @param postcode
	 * @return
	 * 
	 */
	List<User> findByPostcode(String postcode);
}
