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
	public void stu_add() {
		List<Management> stu=new ArrayList<Management>();
		for(Long i=(long) 0;i<50;i++)
		{
			Management s = new Management();
			s.setName("managementname_" + i);
			s.setAge(20);
			s.setNum("20160804"+i);
			String sex;
			if(i%2==0)
				sex="man";
			else
				sex="woman";
			s.setSex(sex);
			s.setScore(80);
			this.managementManager.save(s);
		}
		
	}

}
