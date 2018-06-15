package edu.zut.cs.software.yibuzhiyao.achievement.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;

public class ScoreManagerTest extends GenericGenerator{
	@Autowired
	ScoreManager scoremanager;
	
	/*@Test
	void test() {
		String username = "yang929";
		Score query = new Score();

		Score expectedScore = new Score();
	}*/
	
	@Test
	public void gen_score() {
		List<Score> sco=new ArrayList<Score>();
		for (Long i = (long)0; i < 60; i++) {
				Score m = new Score();
				//Score score = new Score();
				m.setNum("20160804" + i);
				m.setMath(80);
				m.setDB(75);
				m.setJavaee(95);
				this.scoremanager.save(m);
			}
	}
}
