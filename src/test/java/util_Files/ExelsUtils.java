package util_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelsUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		fi=new  FileInputStream( xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getFirstRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCont(String xlfile,String xlsheet,int rownum ) throws IOException
	{
		fi=new  FileInputStream( xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.createRow(rownum);
		int cellcount=row.getFirstCellNum();
		wb.close();
		fi.close();
		return cellcount;
	
	}
	
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colum) throws IOException
	{
		fi=new  FileInputStream( xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colum);
		
		String data;
		try
		{
		//data=cell.toString();
		DataFormatter formatter=new DataFormatter();
		data=formatter.formatCellValue(cell);  // Return the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e)
		{
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
		
	}
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colum,String data) throws IOException
	{
		fi=new  FileInputStream( xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		
		cell=row.createCell(colum);
		cell.setCellValue(data);
		fo=new  FileOutputStream(xlfile);
		wb.write(fo);
		fi.close();
		fo.close();
		
	}
	
	public static void fillGreenColour(String xlfile,String xlsheet,int rownum,int colum) throws IOException
	{
		fi=new  FileInputStream( xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colum);
		
		 style = wb.createCellStyle();
	        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        
	        cell.setCellStyle(style);
	        fo=new FileOutputStream(xlfile);
	        wb.write(fo);
	        wb.close();
	        fi.close();
	        fo.close();
	}
	
	
	public static void fillRedColour(String xlfile,String xlsheet,int rownum,int colum) throws IOException
	{
		fi=new  FileInputStream( xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colum);
		
		 style = wb.createCellStyle();
	        style.setFillForegroundColor(IndexedColors.RED.getIndex());
	        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        
	        cell.setCellStyle(style);
	        fo=new FileOutputStream(xlfile);
	        wb.write(fo);
	        wb.close();
	        fi.close();
	        fo.close();
	}
	
		
	                                              
}
