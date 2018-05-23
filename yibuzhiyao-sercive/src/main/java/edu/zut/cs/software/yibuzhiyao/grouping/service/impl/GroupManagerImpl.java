package edu.zut.cs.software.yibuzhiyao.grouping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.yibuzhiyao.grouping.dao.GroupDao;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;
import edu.zut.cs.software.yibuzhiyao.grouping.service.GroupManager;

@Component
public class GroupManagerImpl extends GenericManagerImpl<Group,Long> implements GroupManager {

	GroupDao groupdao;
	@Autowired
	public void setUserDao(GroupDao groupdao)
	{
		this.groupdao=groupdao;
		this.dao=groupdao;
	}
	
	@Override
	public Group findbyGroupname(String groupname)
	{
		return null;
	}
}
