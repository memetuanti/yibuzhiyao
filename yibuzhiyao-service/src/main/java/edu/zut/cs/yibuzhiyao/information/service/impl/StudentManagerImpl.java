package edu.zut.cs.yibuzhiyao.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.yibuzhiyao.base.service.impl.GenericManagerImpl;
import edu.zut.cs.yibuzhiyao.information.dao.StudentDao;
import edu.zut.cs.yibuzhiyao.information.domain.Student;
import edu.zut.cs.yibuzhiyao.information.service.StudentManager;

@Component
public class StudentManagerImpl extends GenericManagerImpl<Student, Long> implements StudentManager{

	
	StudentDao studentDao;

	@Autowired
	public void setUserDao(StudentDao studentDao) {
		this.studentDao = studentDao;
		this.dao = this.studentDao;
	}
	
	@Override
	public Student findbyStudentname(String studentname) {
		// TODO Auto-generated method stub
		return null;
	}

}
