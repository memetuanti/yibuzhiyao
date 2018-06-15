package edu.zut.cs.software.yibuzhiyao.grouping.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;

public interface GroupManager extends GenericManager<Group,Long>{

	
	
	List<Group>findByg_snum(String g_snum);
	
	List<Group> findByg_name(String g_name);
	
	
	
	
}
