package edu.zut.cs.software.yibuzhiyao.homework.web.spring.controller;

import org.hibernate.loader.GeneratedCollectionAliases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;
import edu.zut.cs.software.yibuzhiyao.homework.service.HomeworkManager;

@Controller
@RequestMapping("/homework")
public class homeworkController extends GenericController<Homework,Long, HomeworkManager> {
	HomeworkManager homeworkManager;
	
	@RequestMapping("/homeworkList")
	 public String index (){
        return "homework/homeworkList";
    }
	
	@Autowired
	public void setHomeworkManager(HomeworkManager homeworkManager)
	{
		this.homeworkManager=homeworkManager;
		this.manager=this.homeworkManager;
	}
}
