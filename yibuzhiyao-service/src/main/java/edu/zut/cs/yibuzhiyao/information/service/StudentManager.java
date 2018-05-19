package edu.zut.cs.yibuzhiyao.information.service;

import java.util.List;
import edu.zut.cs.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.yibuzhiyao.information.domain.Student;

public interface StudentManager  extends GenericManager<Student, Long>{
	
	List<Student> findAll();

	Student findbyStudentname(String studentname);
}
