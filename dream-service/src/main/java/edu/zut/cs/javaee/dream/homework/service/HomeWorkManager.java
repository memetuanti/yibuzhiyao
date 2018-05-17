package edu.zut.cs.javaee.dream.homework.service;

import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import edu.zut.cs.javaee.dream.homework.domain.HomeWork;

public interface HomeWorkManager extends GenericManager<HomeWork, Long>{
	List<HomeWork> findAll();

	HomeWork findbyHomeWork_name(String homework_name);

}
