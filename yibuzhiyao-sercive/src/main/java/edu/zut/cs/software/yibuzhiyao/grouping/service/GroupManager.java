package edu.zut.cs.software.yibuzhiyao.grouping.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;

public interface GroupManager extends GenericManager<Group,Long>{

	
	List<Group> findAll();

	Group findbyGroupname(String groupname);
	
	
}
