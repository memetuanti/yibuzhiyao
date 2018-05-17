package edu.zut.cs.javaee.dream.homework.service;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.dream.admin.service.AdminServiceConfig;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.homework.dao.HomeWorkDao;
import edu.zut.cs.javaee.dream.homework.domain.HomeWork;

public class HomeWorkManagerTest extends GenericGenerator{

	
	@Autowired
	HomeWorkManager homeworkmanager;
	
	@Test
	public void add() {
		List<HomeWork> mywork=new ArrayList<HomeWork>();
		for(Long i=(long) 0;i<300;i++)
		{
			HomeWork homework=new HomeWork();
			homework.setId(i);;
			homework.setHomeWork_name(i+"");
			homework.setHomeWork_BeginTime(new Date(i));
			homework.setHomeWork_EndTime(new Date(i));
			homework.setHomeWork_State("NO");
			this.homeworkmanager.save(homework);
		}
		
	}

}
