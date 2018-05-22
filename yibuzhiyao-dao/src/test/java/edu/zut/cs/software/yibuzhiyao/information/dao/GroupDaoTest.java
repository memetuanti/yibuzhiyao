package edu.zut.cs.software.yibuzhiyao.information.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.yibuzhiyao.information.domain.Group;

public class GroupDaoTest extends GenericDaoTestCase<Long,Group,GroupDao>{
	
	@Autowired
	GroupDao groupdao;
	
	@Test
	void test()
	{
		String username="520";
		Group g=new Group();
	}

}
