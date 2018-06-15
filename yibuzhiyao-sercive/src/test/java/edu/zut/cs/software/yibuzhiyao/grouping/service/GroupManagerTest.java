package edu.zut.cs.software.yibuzhiyao.grouping.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManagerTestCase;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;

public class GroupManagerTest extends GenericManagerTestCase<Long,Group,GroupManager>{
	GroupManager groupmanager;
	
	
	public GroupManagerTest() {
		super(Group.class);
	}
	@Autowired
	public void setGroupManager(GroupManager groupmanager) {
		this.groupmanager=groupmanager;
		this.manager=this.groupmanager;
	}
	@Before
	public void setUp() throws Exception{
		Group group=new Group();
		group.setg_name("张三");
		group.setg_snum("711700");
		this.entity=this.manager.save(group);
	}
	@Test	
	public void testFindByFullname() {
		List<Group> result=this.groupmanager.findByg_name("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三",result.get(0).getg_name());
	}

	@Test
	public void testFindByPostcode() {
		String G_snum = this.entity.getg_snum();
		List<Group>result=this.groupmanager.findByg_snum(G_snum);
		assertEquals(G_snum,result.get(0).getg_snum());
	}
}
