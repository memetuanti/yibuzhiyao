package edu.zut.cs.software.yibuzhiyao.task.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.information.service.StudentManager;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;

public class ManagementManagerTest extends GenericGenerator{

	@Autowired
	ManagementManager managementManager;
	
	@Test				
	public void task_add() {
		List<Management> stu=new ArrayList<Management>();
		for(int i= 0;i<50;i++)
		{
			Management  m= new Management();
			m.setTaskname("taskname"+i);
			m.setStarttime(i);
			m.setEndtime(i+5);
			this.managementManager.save(m);
		}
		
	}

}
