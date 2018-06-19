package edu.zut.cs.software.yibuzhiyao.homework.service;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.homework.domain.Homework;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.information.service.StudentManagerTest;


public class TeachEntityGenerator extends GenericGenerator {
	List<Homework> homeworkList;
	HomeworkManager homeworkManager;
	
	@Autowired
	public void setStudentManager(HomeworkManager homeworkManager) {
		this.homeworkManager = homeworkManager;
	}
	
	@Before
	public void setUp() throws Exception {
		this.homeworkList = new ArrayList<Homework>();
		InputStream input = StudentManagerTest.class.getResourceAsStream("/homeworkList.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Homework s = new Homework();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 0) {
						s.setNum(value);
						System.out.println("第一列是"+row.getCell(j).getStringCellValue());
						}
					if (j == 1) {
						s.setHomework_list_name(value);
						System.out.println("第二列是"+row.getCell(j).getStringCellValue());
						}
					if (j == 2) {
						s.setHomework_teacher(value);
						System.out.println("第三列是"+row.getCell(j).getStringCellValue());}
					if (j == 3) 
					{
//						System.out.println("日期列的格式是"+row.getCell(j).getStringCellValue());
						Date date = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
						sdf.parse(row.getCell(j).getStringCellValue());
						s.setHomework_end_time(sdf.parse(row.getCell(j).getStringCellValue()));
						System.out.println(sdf.parse(row.getCell(j).getStringCellValue()));
					}
					if (j == 4)
					{
						Boolean state=true;
						if(row.getCell(j).getStringCellValue()=="false") 
						{
							state=false;
							System.out.println("第五列是"+row.getCell(j).getStringCellValue());
						}
						s.setHomework_state(state);
					}
					if (j == 5)
					{
						int score=Integer.parseInt(value);
						s.setHomework_score(score);
					}
				}
			}
			this.homeworkList.add(s);
		}
	}
	@Test
	public void test() {
		this.homeworkManager.save(this.homeworkList);
		List<Homework> result = this.homeworkManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Homework> result=" + result); //$NON-NLS-1$
		}
	}
}
