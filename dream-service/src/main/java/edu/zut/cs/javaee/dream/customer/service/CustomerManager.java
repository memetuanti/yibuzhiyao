package edu.zut.cs.javaee.dream.customer.service;

import edu.zut.cs.javaee.dream.admin.domain.User;

import java.util.List;

public interface CustomerManager {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<User> findByPostcode(String postcode);
}
