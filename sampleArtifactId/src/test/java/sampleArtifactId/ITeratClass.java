package sampleArtifactId;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ITeratClass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		public static void main(String[] args) throws IOException {
		    FileInputStream file = new FileInputStream(new File("C:/Development/DataFiles/LoginData.xlsx"));
		    XSSFWorkbook wb = new XSSFWorkbook(file);
		    XSSFSheet sheet = wb.getSheetAt(0);
		    Iterator<Row> rowIterator = sheet.iterator();
		    while (rowIterator.hasNext()) {
		      Row row = rowIterator.next();
		      Iterator <Cell> cellIterator = row.cellIterator();
		      while (cellIterator.hasNext()) {
		        Cell cell = cellIterator.next();
		        System.out.print(cell.getStringCellValue() + "\t\t");
		      } 
		    }
		    file.close();
		    FileOutputStream out =
		      new FileOutputStream(new File("C:/Development/DataFiles/testt.xls"));
		    wb.write(out);
		    out.close();
		    wb.close();
		  }
	}


