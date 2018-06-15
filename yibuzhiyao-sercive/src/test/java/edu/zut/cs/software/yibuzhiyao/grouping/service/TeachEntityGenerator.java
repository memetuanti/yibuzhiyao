package edu.zut.cs.software.yibuzhiyao.grouping.service;

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


import edu.zut.cs.software.yibuzhiyao.base.service.GenericGenerator;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;

/**
 *  Entity Generator for teach package.
 * 
 * @author yibuzhiyao
 *
 */
public class TeachEntityGenerator extends GenericGenerator{

	
	List<Group> groupList;
	GroupManager groupmanager;
	
	@Autowired
	public void setGroupManager(GroupManager groupmanager)
	{
		this.groupmanager=groupmanager;
	}
	
	@Before
	public void setUp() throws Exception {
		this.groupList=new ArrayList<Group>();
		InputStream input = GroupManagerTest.class.getResourceAsStream("/group_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Group g=new Group();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 1)
						g.setg_snum(value);
					if (j == 2)
						g.setg_name(value);
					if (j == 3)
						g.setg_cla(value);
					if (j == 4)
						g.setg_sex(value);
					if (j == 5)
						{
						int a=Integer.parseInt(value);
						g.setg_age(a);
						}
					if (j == 6)
					g.setg_Major(value);
				}
			}
			this.groupList.add(g);
	}
}
	@Test
	public void test() {
		this.groupmanager.save(this.groupList);
		List<Group> result=this.groupmanager.findAll();
		if (logger.isInfoEnabled()) 
		{
			logger.info("test() - List<Group> result="+result);
		}
	}
}
