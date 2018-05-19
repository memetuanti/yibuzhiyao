package edu.zut.cs.yibuzhiyao.achievement.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.yibuzhiyao.base.dao.GenericDaoTestCase;


public class ScoreDaoTest extends GenericDaoTestCase<Long, Score, ScoreDao>{
	
	@Autowired
	ScoreDao scoreDao;
	
	@Test
	void test() {
		String username = "yang929";
		Score query = new Score();

		Score expectedStudent = new Score();
		
		
		Score r = new Score();
		r.setName("test_role");
		Score test_role = this.scoreDao.save(r);
		Long role_id = test_role.getId();
		Score result = this.scoreDao.getOne(role_id);
		assertEquals(test_role, result);
		List<Score> all = this.scoreDao.findAll();

	}

}
