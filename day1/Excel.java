package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook("./sheet/file.xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		int lastRowNum = ws.getLastRowNum();
		
		System.out.println(lastRowNum);;
		
		short cellcount = ws.getRow(0).getLastCellNum();
		
		System.out.println(cellcount);
		
		for(int i=1;i <= lastRowNum;i++)
		{
			for(int j=0;j < cellcount;j++)
			{
				
				 String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
			
			System.out.println("#################3");
		}
		wb.close();
	}
	
}
