package exels_File_DataHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excels file--->Workbook--->sheets--->Rows--->cells

public class Reading_DataFrom_Excels {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir") +"\\testdata\\Book1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
	    XSSFSheet sheet=workbook.getSheet("Sheet1"); //workbook.getSheetAT(0)provide index of sheet
	    
	   int totalNoofRows= sheet.getLastRowNum();
	 int totalnoofcells= sheet.getRow(1).getLastCellNum();
	 System.out.println("number of rows:"+totalNoofRows);//5
	 System.out.println("number of cells:"+totalnoofcells);//4
	 
	 
	 for(int r=0;r<=totalNoofRows;r++)
	 {
		XSSFRow currentRow=sheet.getRow(r);
		
		 
		 for(int c=0;c<totalnoofcells;c++)
		 {
				XSSFCell cell=currentRow.getCell(c);
			System.out.print(cell.toString()+"\t");
		 }
		 System.out.println();
	 }
	   	 
	 workbook.close();
	 file.close();
	 
	}

}
