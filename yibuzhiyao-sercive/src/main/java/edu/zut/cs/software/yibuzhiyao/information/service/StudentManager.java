package edu.zut.cs.software.yibuzhiyao.information.service;

import java.util.List;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;

public interface StudentManager  extends GenericManager<Student, Long>{
	
	List<Student> findAll();

	Student findbyStudentname(String studentname);
}
