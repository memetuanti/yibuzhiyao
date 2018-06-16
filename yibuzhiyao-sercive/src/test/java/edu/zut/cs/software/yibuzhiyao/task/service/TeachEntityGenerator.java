package edu.zut.cs.software.yibuzhiyao.task.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.task.domain.Management;


/**
 *  Entity Generator for teach package.
 * @author yibuzhiyao
 *
 */
public class TeachEntityGenerator extends GenericGenerator {

	List<Management> managementList;

	ManagementManager managementManager;

	@Autowired
	public void setScoreManager(ManagementManager managementManager) {
		this.managementManager = managementManager;
	}
	@Test
	public void setUp() throws Exception {
		this.managementList = new ArrayList<Management>();
		InputStream input = ManagementManagerTest.class.getResourceAsStream("/task_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {//最后一行
			Row row = sheet.getRow(i);
			Management s = new Management();
			for (int j = 0; j < row.getLastCellNum(); j++) {//最后一节
				Cell cell = row.getCell(j);
				if (cell != null) {
					if (j == 1)
					{
						String value=row.getCell(j).getStringCellValue();
						s.setTaskname(value);
					}
					if (j == 2) {
						Date value = row.getCell(j).getDateCellValue();
						s.setStarttime(value);
					}
					if (j == 3)
					{
						Date value = row.getCell(j).getDateCellValue();
						s.setEndtime(value);
				
					}
						
				}
			}
			this.managementList.add(s);
		}
		this.managementManager.save(this.managementList);
	}



}
