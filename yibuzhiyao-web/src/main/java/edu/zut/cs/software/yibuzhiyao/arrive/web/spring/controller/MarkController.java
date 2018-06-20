package edu.zut.cs.software.yibuzhiyao.arrive.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.arrive.service.MarkManager;
import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/mark")
public class MarkController extends GenericController<Mark,Long,MarkManager>{
	MarkManager markManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/mark/index";
		return result;
	}
	
	@Autowired
	public void setMarkManager(MarkManager markManager) {
		this.markManager=markManager;
		this.manager=this.markManager;
	}
}
