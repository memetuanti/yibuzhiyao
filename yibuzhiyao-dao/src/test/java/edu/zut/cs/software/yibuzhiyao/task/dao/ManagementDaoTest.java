package edu.zut.cs.software.yibuzhiyao.task.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.yibuzhiyao.information.dao.StudentDao;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;

public class ManagementDaoTest extends GenericDaoTestCase<Long, Student, StudentDao> {

	@Autowired
	ManagementDao managementdao;

	@Test
	void test() {
		String username = "fly";
		Management query = new Management();
		// List<Student> result = this.studentdao.findOne(null);

		Management expectedStudent = new Management();
		//  expectedStudent.setName(username);
		//  assertEquals(student, expectedStudent);
		//assertEquals(student.getName(), expectedStudent.getName());
	}


}
