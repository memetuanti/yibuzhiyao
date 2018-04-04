package edu.zut.cs.javaee.dream.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.base.service.GenericTreeManagerTestCase;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

	GroupManager groupManager;

	@Autowired
	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
		this.manager = this.groupManager;
	}

	public GroupManagerTest() {
		super(Group.class);
	}

}
