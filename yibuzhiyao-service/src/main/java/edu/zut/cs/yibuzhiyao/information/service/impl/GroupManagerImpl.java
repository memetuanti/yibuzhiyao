package edu.zut.cs.yibuzhiyao.information.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.yibuzhiyao.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.yibuzhiyao.information.dao.GroupDao;
import edu.zut.cs.yibuzhiyao.information.domain.Group;
import edu.zut.cs.yibuzhiyao.information.service.GroupManager;

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
