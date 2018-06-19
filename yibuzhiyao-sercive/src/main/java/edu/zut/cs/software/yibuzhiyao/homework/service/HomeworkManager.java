package edu.zut.cs.software.yibuzhiyao.homework.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;

public interface HomeworkManager extends GenericManager<Homework,Long>{
	
	List<Homework> findByNum(String num);

	List<Homework> findbyHomework_list_name(String homework_list_name);
}
