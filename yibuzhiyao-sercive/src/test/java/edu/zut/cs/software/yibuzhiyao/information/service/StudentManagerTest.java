package edu.zut.cs.software.yibuzhiyao.information.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;

public class StudentManagerTest  extends GenericGenerator{

	@Autowired
	StudentManager studentmanager;
	
	@Test				
	public void stu_add() {
		List<Student> stu=new ArrayList<Student>();
		for(Long i=(long) 0;i<50;i++)
		{
			Student s = new Student();
			s.setName("studentname_" + i);
			s.setAge(20);
			s.setNum("20160804"+i);
			String sex;
			if(i%2==0)
				sex="man";
			else
				sex="woman";
			s.setSex(sex);
			s.setScore(80);
			this.studentmanager.save(s);
		}
		
	}
}
