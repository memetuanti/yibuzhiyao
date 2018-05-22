package edu.zut.cs.software.yibuzhiyao.information.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.information.domain.Group;

public interface GroupManager extends GenericManager<Group,Long>{

	
	List<Group> findAll();

	Group findbyGroupname(String groupname);
	
	
}
