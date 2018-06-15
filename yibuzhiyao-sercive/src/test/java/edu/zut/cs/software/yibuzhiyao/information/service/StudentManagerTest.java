package edu.zut.cs.software.yibuzhiyao.information.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManagerTestCase;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;

public class StudentManagerTest extends GenericManagerTestCase<Long, Student, StudentManager>{
	StudentManager studentManager;

	public StudentManagerTest() {
		super(Student.class);
	}

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager = this.studentManager;
	}

	@Before
	public void setUp() throws Exception {
		Student student = new Student();
		student.setName("张三");
		student.setNum("450007");
		this.entity = this.manager.save(student);
	}

	@Test
	public void testFindByFullname() {
		List<Student> result = this.studentManager.findByName("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getName());
	}

	@Test
	public void testFindByPostcode() {
		String num = this.entity.getNum();
		List<Student> result = this.studentManager.findByNum(num);
		assertEquals(num, result.get(0).getNum());

	}


}
