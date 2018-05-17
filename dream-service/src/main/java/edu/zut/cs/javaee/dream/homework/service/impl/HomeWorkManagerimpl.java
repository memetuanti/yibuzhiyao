package edu.zut.cs.javaee.dream.homework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.dream.homework.dao.HomeWorkDao;
import edu.zut.cs.javaee.dream.homework.domain.HomeWork;
import edu.zut.cs.javaee.dream.homework.service.HomeWorkManager;

@Component
public class HomeWorkManagerimpl extends GenericManagerImpl<HomeWork, Long> implements HomeWorkManager{
	
	HomeWorkDao homeworkDao;
	
	
	@Autowired
	public void setHomeWorkDao(HomeWorkDao homeworkDao) {
		this.homeworkDao = homeworkDao;
		this.dao =homeworkDao;
	}
	
	@Override
	public HomeWork findbyHomeWork_name(String homework_name) {
		// TODO Auto-generated method stub
		return null;
	}

}
