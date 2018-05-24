package edu.zut.cs.software.yibuzhiyao.arrive.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;

public interface MarkManager extends GenericManager<Mark,Long>{
	List<Mark> findAll();
	
	Mark findbyMarkname(String markname);
}
