package edu.zut.cs.javaee.dream.customer.service;

import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import edu.zut.cs.javaee.dream.customer.domain.Customer;

public interface CustomerManager extends GenericManager<Customer, Long> {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<Customer> findByPostcode(String postcode);
}
