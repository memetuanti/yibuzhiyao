package edu.zut.cs.software.yibuzhiyao.achievement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManagerTestCase;

public class ScoreManagerTest extends GenericManagerTestCase<Long, Score, ScoreManager>{
	ScoreManager scoreManager;

	public ScoreManagerTest() {
		super(Score.class);
	}

	@Autowired
	public void setScoreManager(ScoreManager scoreManager) {
		this.scoreManager = scoreManager;
		this.manager = this.scoreManager;
	}

	@Before
	public void setUp() throws Exception {
		Score score = new Score();
		score.setName("张三");
		score.setNum("201608040218");
		this.entity = this.manager.save(score);
	}

	@Test
	public void testfindbyName() {
		List<Score> result = this.scoreManager.findbyName("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getName());
	}

	@Test
	public void testfindbyNum() {
		String num = this.entity.getNum();
		List<Score> result = this.scoreManager.findbyNum(num);
		assertEquals(num, result.get(0).getNum());

	}


}
