package edu.zut.cs.software.yibuzhiyao.grouping.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;
import edu.zut.cs.software.yibuzhiyao.grouping.service.GroupManager;

@Controller
@RequestMapping("/group")
public class GroupController extends GenericController<Group,Long,GroupManager>{

	GroupManager groupmanager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
		String result="/group/index";
        return result;
    }

	
	@RequestMapping(method = RequestMethod.GET, value = "/inqutregroup.html")
	public String inqutregroup() {
		String result="/group/inqutregroup";
		return result;
	}
	 @Autowired
	 public void setGroupManager(GroupManager groupmanager)
	 {
		 this.groupmanager=groupmanager;
		 this.manager=this.groupmanager;
	 }
	 
}
