package edu.zut.cs.javaee.dream.feedback.service;

import java.util.List;

import edu.zut.cs.javaee.dream.feedback.domain.FeedBack;

public interface FeedbackManager {

	
	List<FeedBack> findByCustomer(String customerId);
}
