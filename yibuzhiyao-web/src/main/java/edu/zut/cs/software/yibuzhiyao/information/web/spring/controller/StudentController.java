package edu.zut.cs.software.yibuzhiyao.information.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.information.service.StudentManager;


@Controller
@RequestMapping("/student")
public class StudentController  extends GenericController<Student, Long, StudentManager>{
	StudentManager studentmanager;

    @Autowired
    public void setStudentManager(StudentManager studentmanager) {
        this.studentmanager = studentmanager;
        this.manager = this.studentmanager;
    }

    @RequestMapping("/index")
    public String index() {
        return "student/index";
    }
}
