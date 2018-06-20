package edu.zut.cs.software.yibuzhiyao.arrive.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManagerTestCase;

public class MarkManagerTest extends GenericManagerTestCase<Long,Mark,MarkManager>{
	MarkManager markManager;
	
	public MarkManagerTest() {
		super(Mark.class);
	}
	
	@Autowired
	public void setMarkManager(MarkManager markManager) {
		this.markManager=markManager;
		this.manager=this.markManager;
	}
	
	@Before
	public void setUp() throws Exception {
		Mark mark=new Mark();
		mark.setName("张三");
		mark.setNum("201608040218");
		this.entity=this.manager.save(mark);
	}
	
	@Test
	public void testfindbyName() {
		List<Mark> result=this.markManager.findbyName("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getName());
	}
	
	@Test
	public void testfindbyNum() {
		String num=this.entity.getNum();
		List<Mark> result=this.markManager.findBynum(num);
		assertEquals(num, result.get(0).getNum());
	}
	
}
