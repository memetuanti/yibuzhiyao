package edu.zut.cs.software.yibuzhiyao.arrive.service;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;

public class MarkManagerTest extends GenericGenerator{
	
	@Autowired
	MarkManager markmanager;

	@Test
	public void mar_add(){
		List<Mark> mar = new ArrayList<Mark>();
		for(Long i=(long) 0;i<50;i++)
		{
			Mark m = new Mark();
			m.setName("studentname" + i);
			m.setNum("20160804"+i);
			m.setMyclass("软件"+i);
			m.setAttdent("yes");
			this.markmanager.save(m);
		}
	}

}
