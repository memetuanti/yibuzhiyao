package edu.zut.cs.software.yibuzhiyao.homework.service;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;

public class HomeworkManagerTest extends GenericGenerator{

	@Autowired
	HomeworkManager howeworkManager;
		
	@Test
	public void test_add() {
		List<Homework> hw=new ArrayList<Homework>();
		for(int i=0;i<=100;i++) {
			Homework homework=new Homework();
			homework.setHomework_end_time(new Date(i));
			homework.setHomework_list_name("homework"+i);
			homework.setHomework_state(false);
			homework.setHomework_score(0);
			this.howeworkManager.save(homework);
		}
		
	}

}
