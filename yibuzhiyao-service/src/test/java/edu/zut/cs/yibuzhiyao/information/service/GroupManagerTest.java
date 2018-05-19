package edu.zut.cs.yibuzhiyao.information.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.yibuzhiyao.base.service.GenericTreeManagerTestCase;
import edu.zut.cs.yibuzhiyao.information.domain.Group;
import edu.zut.cs.yibuzhiyao.information.service.GroupManager;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

	GroupManager groupManager;

	@Autowired
	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
		this.manager = this.groupManager;
	}
	
	public GroupManagerTest(){
		super(Group.class);
	}
}
