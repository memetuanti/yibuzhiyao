package edu.zut.cs.software.yibuzhiyao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.achievement.service.ScoreManager;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.information.service.StudentManager;

@ContextConfiguration(locations = { "classpath:/applicationContextTest-resources.xml",
		"classpath:/applicationContext-dao.xml", "classpath:/applicationContext-service.xml" })
public class App  extends AbstractJUnit4SpringContextTests {
	Student student = new Student();
	Score score=new Score();

	StudentManager studentManager;
	ScoreManager scoreManager;

	@Autowired
	public void setUserManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
	@Autowired
	public void setUserManager(ScoreManager scoreManager) {
		this.scoreManager = scoreManager;
	}

	// 目标对象有实现接口，spring会自动选择“JDK代理”
	@Test
	public void testApp() {
		this.studentManager.save(this.student);
	}
	@Test
	public void testApp1() {
		this.scoreManager.save(this.score);
	}
}
