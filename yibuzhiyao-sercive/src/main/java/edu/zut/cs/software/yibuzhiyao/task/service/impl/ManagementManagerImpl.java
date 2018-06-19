package edu.zut.cs.software.yibuzhiyao.task.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.yibuzhiyao.task.dao.ManagementDao;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;
import edu.zut.cs.software.yibuzhiyao.task.service.ManagementManager;
@Component
public class ManagementManagerImpl extends GenericManagerImpl<Management, Long> implements ManagementManager{
	ManagementDao managementDao;
	@Autowired
	public void setUserDao(ManagementDao managementDao) {
		this.managementDao = managementDao;
		this.dao = this.managementDao;
	}
	
	

}
