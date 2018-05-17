package edu.zut.cs.yibuzhiyao.information.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.yibuzhiyao.information.domain.Student;

public class StudentDaoTest  extends GenericDaoTestCase<Long, Student, StudentDao> {

	@Autowired
	StudentDao studentdao;

	@Test
	void test() {
		String username = "fly";
		Student query = new Student();
		// List<Student> result = this.studentdao.findOne(null);

		Student expectedStudent = new Student();
		//  expectedStudent.setName(username);
		//  assertEquals(student, expectedStudent);
		//assertEquals(student.getName(), expectedStudent.getName());
	}

}
