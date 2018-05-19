package edu.zut.cs.yibuzhiyao.achievement.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.yibuzhiyao.base.service.GenericGenerator;

public class AchievementEntityGenerator extends GenericGenerator {

	@Autowired
	ScoreManager scoreManager;

	public ScoreManager getScoreManager() {
		return scoreManager;
	}

	public void setScoreManager(ScoreManager scoreManager) {
		this.scoreManager = scoreManager;
	}
	
	@Test
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
		}

}
