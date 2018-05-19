package edu.zut.cs.yibuzhiyao.information.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.yibuzhiyao.information.domain.Group;
import edu.zut.cs.yibuzhiyao.information.domain.Student;
import edu.zut.cs.yibuzhiyao.information.service.GroupManager;
import edu.zut.cs.yibuzhiyao.information.service.StudentManager;

public class InformationEntityGenerator extends GenericGenerator  {

	@Autowired
	GroupManager groupManager;

	@Autowired
	StudentManager studentManager;

	
	@Test
	public void gen_group() {
		for (int i = 0; i < 10; i++) {
			Group g = new Group();
			g.setName("group_" + i);
			g.setWebsite("website_" + i);
			this.groupManager.save(g);
			this.gen_student(g);
			for (int j = 0; j < 10; j++) {
				Group group = new Group();
				group.setName("group_" + i + "_" + j);
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_student(g);
			}
		}
	}
	

	public void gen_student(Group g) {
		for (int i = 1; i <= 10; i++) {
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
			s.setGroup(g);
			this.studentManager.save(s);
		}
	}
	
/*
	@Test
	public void gen() throws FileNotFoundException
	{
		Scanner input=new Scanner(new File("student.txt"));
		while(input.hasNext()) {
			Student s = new Student();
			s.setName(input.next());
			s.setNum(input.next());
			s.setSex(input.next());
			s.setScore(input.nextInt());
			s.setAge(input.nextInt());
			this.studentManager.save(s);
		}
		input=new Scanner(new File("group.txt"));
		while(input.hasNext())
		{
			Group g=new Group();
			g.setName(input.next());
			g.setWebsite(input.next());
			this.groupManager.save(g);
		}
	}*/

	
	/*
	@Test
	public void gen_group() throws FileNotFoundException {
		
		Scanner input=new Scanner(new File("group.txt"));
		while(input.hasNext()) {
			Group g = new Group();
			g.setName(input.next());
			g.setWebsite(input.next());
			this.groupManager.save(g);
			/*Scanner inp=new Scanner(new File("group.txt"));
			while(inp.hasNext()) {
				Group group = new Group();
				group.setName(input.next());
				group.setWebsite(input.next());
				group.setParent(g);
				g = this.groupManager.save(group);
				this.gen_student(g);
			}
		}
	}

	public void gen_student(Group g) throws FileNotFoundException {
		
		Scanner input=new Scanner(new File("student.txt"));
		while(input.hasNext()){
			Student s = new Student();
			s.setName(input.next());
			s.setNum(input.next());
			s.setSex(input.next());
			s.setScore(input.nextInt());
			s.setAge(input.nextInt());
			s.setGroup(g);
			this.studentManager.save(s);
		}
	}*/
}
