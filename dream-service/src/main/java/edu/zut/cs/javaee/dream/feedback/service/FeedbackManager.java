package edu.zut.cs.javaee.dream.feedback.service;

import edu.zut.cs.javaee.dream.feedback.domain.FeedBack;

import java.util.List;

public interface FeedbackManager {


    List<FeedBack> findByCustomer(String customerId);
}
