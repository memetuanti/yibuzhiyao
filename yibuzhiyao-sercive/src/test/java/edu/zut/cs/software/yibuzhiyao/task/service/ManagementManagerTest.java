package edu.zut.cs.software.yibuzhiyao.task.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManagerTestCase;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;


public class ManagementManagerTest extends GenericManagerTestCase<Long, Management, ManagementManager>{

	ManagementManager managementManager;
	
	public ManagementManagerTest()
	{
		super(Management.class);
	}
	@Autowired
	public void setManagementManager(ManagementManager managementManager)
	{
		this.managementManager=managementManager;
		this.manager=this.managementManager;
	}
	
	
	
	@Test
	public void testFindByPostcode() {
		String num = this.entity.getTaskname();
		List<Management> result = this.managementManager.findBynum(num);
		assertEquals(num, result.get(0).getTaskname());

	}
}