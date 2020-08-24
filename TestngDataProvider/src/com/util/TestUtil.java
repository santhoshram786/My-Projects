package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

public static ArrayList<Object[]> getexceldata() throws IOException
{
	ArrayList<Object[]> data=new ArrayList<Object[]>();
	File f=new File("S:\\selenium tuto\\TestNG\\Copy of example.xlsx");
	FileInputStream ip=new FileInputStream(f);

	Workbook wb=new XSSFWorkbook(ip);
	Sheet ws=wb.getSheet("Sheet1");
	try
	{
		int lastrow= ws.getLastRowNum();
		System.out.println(lastrow);
		for(int i=1;i<=lastrow;i++)
		{
		Row r=ws.getRow(i);
		Cell fname=r.getCell(0);
		//Cell lname=r.getCell(1);
		String fn=fname.getStringCellValue();
		System.out.println(fn);
		//String ln=lname.getStringCellValue();
		//System.out.println(ln);
		Object k[]= {fn};
		//data.add(new Object[] {fn,ln});
		data.add(k);
		}
	
	}
	
		catch(Exception e)
	{
			e.printStackTrace();
	}
	
	FileOutputStream fo=new FileOutputStream(f);
	wb.write(fo);
	fo.close();
	return data;
	
	}
	
	
}

