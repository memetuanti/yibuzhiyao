package edu.zut.cs.software.yibuzhiyao.task.web.string.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;
import edu.zut.cs.software.yibuzhiyao.task.service.ManagementManager;

@Controller
@RequestMapping("/management")
public class ManagementController extends GenericController<Management, Long, ManagementManager>{
	ManagementManager managementManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		
		String result = "/management/index";
		return result;
	}

	@Autowired
	public void setStudentManager(ManagementManager managementManager) {
		this.managementManager = managementManager;
		this.manager = this.managementManager;
	}
}
