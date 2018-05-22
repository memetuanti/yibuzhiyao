package edu.zut.cs.software.yibuzhiyao.information.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.information.domain.Group;

public class GroupManagerTest extends GenericGenerator{

	
	@Autowired
	GroupManager groupmanager;
	
	@Test	
	public void G_add()
	{
		List<Group> G=new ArrayList<Group>();
		for(Long i=(long) 0;i<200;i++)
		{
			Group g=new Group();
			g.setG_name("G_name"+i);
			g.setG_age(19);
			g.setG_snum("201608040"+i);
			String s;
			if(i%2==0)
				s="women";
				else
					s="man";
			g.setG_sex(s);
			String c;
			if(i<100)
				c="软件161";
				else
					c="软件162";
			g.setG_cla(c);
			this.groupmanager.save(g);
		}
	}
}
