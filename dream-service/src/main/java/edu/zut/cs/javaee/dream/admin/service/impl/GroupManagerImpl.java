package edu.zut.cs.javaee.dream.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.dream.admin.dao.GroupDao;
import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.admin.service.GroupManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericTreeManagerImpl;

@Service("groupManager")
@Transactional
public class GroupManagerImpl extends GenericTreeManagerImpl<Group, Long> implements GroupManager {

	GroupDao groupDao;

	@Autowired
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
		this.treeDao = this.groupDao;
		this.dao = this.treeDao;
	}

}
