package edu.zut.cs.software.yibuzhiyao.homework.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;
import edu.zut.cs.software.yibuzhiyao.homework.service.HomeworkManager;

@Controller
@RequestMapping("/homework")
public class HomeworkController extends GenericController<Homework, Long, HomeworkManager>{
	HomeworkManager homeworkManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index()
	{
		
		String result = "/homework/index";
		return result;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/inqutreHomework.html")
	public String inqutregroup() {
		String result="/homework/inqutreHomework";
		return result;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/resultHomework.html")
	public String resultgroup() {
		String result="/homework/resultHomework";
		return result;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/newHomework.html")
	public String newhomework() {
		String result="/homework/newHomework";
		return result;
	}
	@Autowired
	public void setHomeworkManager(HomeworkManager homeworkManager) {
		this.homeworkManager = homeworkManager;
		this.manager = this.homeworkManager;
	}
}

