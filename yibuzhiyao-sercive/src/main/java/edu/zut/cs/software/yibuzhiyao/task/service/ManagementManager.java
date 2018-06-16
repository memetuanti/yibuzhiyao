package edu.zut.cs.software.yibuzhiyao.task.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;

public interface ManagementManager extends GenericManager<Management, Long>{
	List<Management> findAll();

	Management findbyManagementname(String Managementname);
}
