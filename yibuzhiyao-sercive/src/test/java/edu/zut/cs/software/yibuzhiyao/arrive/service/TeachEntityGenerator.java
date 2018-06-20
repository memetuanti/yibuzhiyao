package edu.zut.cs.software.yibuzhiyao.arrive.service;



import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;

/**
 *  Entity Generator for teach package.
 * @author yibuzhiyao
 *
 */
public class TeachEntityGenerator extends GenericGenerator{
	List<Mark> markList;
	MarkManager markManager;
	
	@Autowired
	public void setMarkManager(MarkManager markManager) {
		this.markManager=markManager;
	}
	
	@Before
	public void setUp() throws Exception {
		this.markList=new ArrayList<Mark>();
		InputStream input =MarkManagerTest.class.getResourceAsStream("/mark_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Mark m=new Mark();
			for (int j = 0; j < row.getLastCellNum(); j++) {//最后一节
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 1)
						m.setNum(value);
					if (j == 2)
						m.setName(value);
					if (j == 3)
						m.setMyclass(value);
					if (j == 4)
						m.setAttdent1(value);
					if (j == 5)
						m.setAttdent2(value);
					if (j == 6)
						m.setAttdent3(value);
					if (j == 7)
						m.setAttdent4(value);
					if (j == 8)
						m.setAttdent5(value);
					if (j == 9)
					{
						int a=Integer.parseInt(value);
						m.setScore(a);
					}
				}
			}
			this.markList.add(m);
		}
	}
	@Test
	public void test() {
		this.markManager.save(this.markList);
		List<Mark> result = this.markManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Mark> result=" + result); //$NON-NLS-1$
		}
		
	}
	
	
}
	
