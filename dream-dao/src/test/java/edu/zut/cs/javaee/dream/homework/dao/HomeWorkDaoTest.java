package edu.zut.cs.javaee.dream.homework.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import edu.zut.cs.javaee.dream.homework.domain.HomeWork;


public class HomeWorkDaoTest extends GenericDaoTestCase<Long, HomeWork, HomeWorkDao>{

	@Autowired
	HomeWorkDao homeworkdao;
	
	@Test
	public void testFindAll() {

		List<HomeWork> result = this.homeworkdao.findAll();

	}
	
}
