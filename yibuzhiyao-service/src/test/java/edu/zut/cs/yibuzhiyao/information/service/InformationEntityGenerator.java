package edu.zut.cs.yibuzhiyao.information.service;

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

}
