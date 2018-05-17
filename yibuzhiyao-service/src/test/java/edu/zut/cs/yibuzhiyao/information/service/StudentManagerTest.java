package edu.zut.cs.yibuzhiyao.information.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.yibuzhiyao.information.domain.Student;
import edu.zut.cs.yibuzhiyao.information.service.StudentManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InformationServiceConfig.class)
public class StudentManagerTest {

	@Autowired
	StudentManager studentManager;

	@Test
	public void testFindAll() {
		List<Student> all = this.studentManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String studentname = "fly";
		Student expected_student = new Student();
		// expected_student.setName(studentname);
		Student student = this.studentManager.findbyStudentname(studentname);
		// assertEquals(student.getName(), expected_student.getName());
		assertEquals(student, expected_student);
	}
}
