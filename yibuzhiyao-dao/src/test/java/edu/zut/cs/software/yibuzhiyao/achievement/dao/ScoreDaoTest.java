package edu.zut.cs.software.yibuzhiyao.achievement.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.base.dao.GenericDaoTestCase;

public class ScoreDaoTest extends GenericDaoTestCase<Long, Score, ScoreDao>{
	@Autowired
	ScoreDao scoredao;

	@Test
	public void testFindAll() {

		List<Score> result = this.scoredao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Score> result={}", result); //$NON-NLS-1$
		}

	}
}
