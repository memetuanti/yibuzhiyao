package edu.zut.cs.software.yibuzhiyao.task.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;

public class ManagementDaoTest extends GenericDaoTestCase<Long, Management, ManagementDao> {

	@Autowired
	ManagementDao managementdao;

	/*void test() {
		String taskname = "task";
		Management query = new Management();

		Management expectedManagement = new Management();
	}*/
@Test
public void testFindAll() {
	List<Management> result = this.managementdao.findAll();
	if (logger.isInfoEnabled()) {
		logger.info("testFindAll() - List<Management> result={}", result); //$NON-NLS-1$
	}
}
}
