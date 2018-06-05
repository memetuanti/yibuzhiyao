package edu.zut.cs.software.yibuzhiyao.information.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;

public class StudentDaoTest  extends GenericDaoTestCase<Long, Student, StudentDao> {

	@Autowired
	StudentDao studentdao;

	/*@Test
	void test() {
		String username = "fly";
		Student query = new Student();
		// List<Student> result = this.studentdao.findOne(null);

		Student expectedStudent = new Student();
		//  expectedStudent.setName(username);
		//  assertEquals(student, expectedStudent);
		//assertEquals(student.getName(), expectedStudent.getName());
	}*/
	@Test
	public void testFindAll() {

		List<Student> result = this.studentdao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Student> result={}", result); //$NON-NLS-1$
		}

	}

}
