package edu.zut.cs.software.yibuzhiyao.homework.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;


public class HomeworkDaoTest extends GenericDaoTestCase<Long,Homework,HomeworkDao>{

	private static final Logger logger = LogManager.getLogger(HomeworkDaoTest.class.getName());
	
	@Autowired
	HomeworkDao homeworkDao;
	
	@Test
	public void testFindAll() {

		List<Homework> result = this.homeworkDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<User> result={}", result); //$NON-NLS-1$
		}

	}


}
