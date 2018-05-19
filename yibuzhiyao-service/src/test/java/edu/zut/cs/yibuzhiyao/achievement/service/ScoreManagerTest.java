package edu.zut.cs.yibuzhiyao.achievement.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.yibuzhiyao.achievement.domain.Score;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AchievementServiceConfig.class)
public class ScoreManagerTest {

	@Autowired
	ScoreManager scoreManager;

	@Test
	public void testFindAll() {
		List<Score> all = this.scoreManager.findAll();
		assertEquals(all.size(), 100);
	}
	
	//@Test
	public void testFindbyUsername() {
		String scorename = "yang";
		Score expected_score = new Score();
		Score score = this.scoreManager.findbyScorename(scorename);
		assertEquals(score, expected_score);
	}
	
	/*@Test
	public void gen_score() {
		for (int i = 0; i < 10; i++) {
			Score g = new Score();
			g.setName("group_" + i);
			
			this.scoreManager.save(g);
			for (int j = 0; j < 10; j++) {
				Score group = new Score();
				group.setName("group_" + i + "_" + j);
				
				g = this.scoreManager.save(group);
			}
		}
	}*/


}
