package edu.zut.cs.software.yibuzhiyao.arrive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.yibuzhiyao.arrive.dao.MarkDao;
import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.arrive.service.MarkManager;
import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;

@Component
public class MarkManagerImpl extends GenericManagerImpl<Mark,Long> implements MarkManager{
	
	MarkDao markDao;
	@Autowired
	public void setUserDao(MarkDao markDao) {
		this.markDao=markDao;
		this.dao=markDao;
		
	}
	@Override
	public Mark findbyMarkname(String Markname) {
		// TODO Auto-generated method stub
		return null;
	}

}
