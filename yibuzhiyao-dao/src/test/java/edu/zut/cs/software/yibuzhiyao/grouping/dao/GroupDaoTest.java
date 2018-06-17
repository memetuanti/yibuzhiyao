package edu.zut.cs.software.yibuzhiyao.grouping.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;

public class GroupDaoTest extends GenericDaoTestCase<Long,Group,GroupDao>{
	
	@Autowired
	GroupDao groupdao;

	
	@Test
	public void testFindAll() {

		List<Group> result = this.groupdao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Group> result={}", result); //$NON-NLS-1$
		}

	}

}