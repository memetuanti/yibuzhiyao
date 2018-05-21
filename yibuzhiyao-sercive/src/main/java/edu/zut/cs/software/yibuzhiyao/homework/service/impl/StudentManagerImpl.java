package edu.zut.cs.software.yibuzhiyao.homework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.yibuzhiyao.homework.dao.HomeworkDao;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;
import edu.zut.cs.software.yibuzhiyao.homework.service.HomeworkManager;

public class StudentManagerImpl extends GenericManagerImpl<Homework,Long> implements HomeworkManager{

	HomeworkDao homeworkDao;
	
	@Autowired
	public void setHomeworkDao(HomeworkDao homeworkDao) {
		// TODO Auto-generated method stub
		this.homeworkDao=homeworkDao;
		this.dao=this.homeworkDao;
	}
	
	public Homework findbyHomework_list_name(String  Homework_list_name) {
		
		return null;
		
	}
}
