package edu.zut.cs.software.yibuzhiyao.homework.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;

public interface HomeworkManager extends GenericManager<Homework,Long>{
	
	List<Homework> findAll();

	Homework findbyHomework_list_name(String studentname);
}
