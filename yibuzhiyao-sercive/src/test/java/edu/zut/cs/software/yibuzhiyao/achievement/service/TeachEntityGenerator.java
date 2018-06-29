package edu.zut.cs.software.yibuzhiyao.achievement.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;


/**
 *  Entity Generator for teach package.
 * @author yibuzhiyao
 *
 */
public class TeachEntityGenerator extends GenericGenerator {

	List<Score> scoreList;

	ScoreManager scoreManager;

	@Autowired
	public void setScoreManager(ScoreManager scoreManager) {
		this.scoreManager = scoreManager;
	}

	@Before
	public void setUp() throws Exception {
		this.scoreList = new ArrayList<Score>();
		InputStream input = ScoreManagerTest.class.getResourceAsStream("/yibuzhiyao_score_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {//最后一行
			Row row = sheet.getRow(i);
			Score s = new Score();
			for (int j = 1; j < row.getLastCellNum(); j++) {//最后一节
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value1 = row.getCell(j).getStringCellValue().trim();
					if (j == 1)
						s.setNum(value1);
					if (j == 2)
						s.setName(value1);
					
					if (j == 3) {
						int value2 = Integer.parseInt(value1);
						s.setFirst(value2);}
					if (j == 4) {
						int value3 = Integer.parseInt(value1);
						s.setSecond(value3);}
					if (j == 5) {
						int value4 = Integer.parseInt(value1);
						s.setThird(value4);}
					if (j == 6) {
						int value5 = Integer.parseInt(value1);
						s.setFourth(value5);}
					if (j == 7) {
						int value6 = Integer.parseInt(value1);
						s.setFifth(value6);}
					if (j == 8) {
						int value7 = Integer.parseInt(value1);
						s.setAttendance(value7);}
					if (j == 9) {
						int value8 = Integer.parseInt(value1);
						s.setJ2design(value8);}
					/*if (j == 10) {
						int value9 = Integer.parseInt(value1);
						s.setTotal(value9);}*/
				}
			}
			this.scoreList.add(s);
		}
	}

	@Test
	public void test() {
		this.scoreManager.save(this.scoreList);
		List<Score> result = this.scoreManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Score> result=" + result); //$NON-NLS-1$
		}
	}

}
