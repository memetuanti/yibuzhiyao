package edu.zut.cs.software.yibuzhiyao.arrive.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;

import org.junit.Test;

public class MarkDaoTest extends GenericDaoTestCase <Long,Mark,MarkDao>{

	@Autowired
	MarkDao markdao;
	
	public void test() {
		String username = "rj201605020129";
		Mark query = new Mark();
		Mark expectedMark = new Mark();
	}

}
