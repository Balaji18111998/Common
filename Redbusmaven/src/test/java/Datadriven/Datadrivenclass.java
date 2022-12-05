package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenclass {

	XSSFWorkbook wb;
    XSSFSheet sh;
    
    public void Datadrivenread (String Filename) throws IOException {
    
    	File f=new File(Filename);
    	FileInputStream f1=new FileInputStream(f);
    	wb=new XSSFWorkbook(f1);
    }
    
    
    public int getrow(int sheetno)
    {
    int row = wb.getSheetAt(sheetno).getLastRowNum();
    row=row+1;
    return row;
    }
    
    public void getcol(int sheetno)
    {
    	int col=wb.getSheetAt(sheetno).getColumnOutlineLevel(sheetno);
    	return;
    }
    public String getdata(int shno,int row,int cell)
    {
    sh=wb.getSheetAt(shno);
    String data=sh.getRow(row).getCell(cell).getStringCellValue();
    return data;
    }
    
    
    
}
