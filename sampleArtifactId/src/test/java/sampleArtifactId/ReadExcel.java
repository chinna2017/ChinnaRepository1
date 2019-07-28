package sampleArtifactId;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 File source= new File("C:/Development/DataFiles/LoginData.xlsx");
  FileInputStream fis = new FileInputStream(source);
  XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(0);
//	String data0= sh.getRow(1).getCell(1).getStringCellValue();
//	System.out.println( data0);
	int rowcount=sh.getLastRowNum();
	//string colcount=sh.col
	//System.out.println( colcount);
/*	for (int i=0;i<=rowcount;i++)
	{
		String data1= sh.getRow(i).getCell(0).getStringCellValue();
		if (data1=="end")
			{
					sh.getRow(i+1);
			}
		
		System.out.println(data1);
		System.out.println();
	}*/
	
	for (@SuppressWarnings("rawtypes") org.apache.poi.ss.usermodel.Sheet sh1 : wb ) {
        for (Row row : sh) {
            for (Cell cell : row) {
                // Do something here
            }
        }
    }
	wb.close();
	}

		}

