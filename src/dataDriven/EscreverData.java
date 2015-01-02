package dataDriven;

import java.io.*;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class EscreverData{
	private static Workbook wb;


	private static void criarArquvio() {            
	FileOutputStream fileOut = null;
	                                                 
	wb = new XSSFWorkbook();
	wb.createSheet("new sheet");
	 
	        //Creating Cells
	wb = new XSSFWorkbook();
	     
	CreationHelper createHelper = wb.getCreationHelper();
	org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Atualização 4.21");
    
    /*         
    Familiares
    Igor Bernardo Renato Victor Liam
    22 17 16 15 15
    */
    
    Row row = sheet.createRow((short)0); //top
    row.createCell(0).setCellValue(createHelper.createRichTextString("TOP LANE"));
    row.createCell(1).setCellValue(createHelper.createRichTextString("Rek'Sai"));
    row.createCell(2).setCellValue(createHelper.createRichTextString("Cho'Gath"));
    row.createCell(3).setCellValue(createHelper.createRichTextString("Jayce"));
    row.createCell(4).setCellValue(createHelper.createRichTextString("Jax"));
    row.createCell(5).setCellValue(createHelper.createRichTextString("Zac"));
    row.createCell(6).setCellValue(createHelper.createRichTextString("Kennen"));
    row.createCell(7).setCellValue(createHelper.createRichTextString("Pantheon"));
    row.createCell(8).setCellValue(createHelper.createRichTextString("Shen"));

    
    row = sheet.createRow((short)1); //mid            
    row.createCell(0).setCellValue(createHelper.createRichTextString("MID LANE"));
    row.createCell(1).setCellValue(createHelper.createRichTextString("Azir"));
    row.createCell(2).setCellValue(createHelper.createRichTextString("Cassopeia"));
    row.createCell(3).setCellValue(createHelper.createRichTextString("Diana"));
    row.createCell(4).setCellValue(createHelper.createRichTextString("Galio"));
    row.createCell(5).setCellValue(createHelper.createRichTextString("Yasuo"));
    
    
    row = sheet.createRow((short)2); // jungle
    row.createCell(0).setCellValue(createHelper.createRichTextString("JUNGLE"));
    row.createCell(1).setCellValue(createHelper.createRichTextString("Warwick"));
    row.createCell(2).setCellValue(createHelper.createRichTextString("Fiddlesticks"));
    row.createCell(3).setCellValue(createHelper.createRichTextString("Jarvan IV"));
    row.createCell(4).setCellValue(createHelper.createRichTextString("Nocturne"));
    row.createCell(5).setCellValue(createHelper.createRichTextString("Rengar"));
    row.createCell(6).setCellValue(createHelper.createRichTextString("Sejuani"));
    row.createCell(7).setCellValue(createHelper.createRichTextString("Shyvana"));
    
                
    row = sheet.createRow((short)3); // adc
    row.createCell(0).setCellValue(createHelper.createRichTextString("BOT LANE - ADC"));
    row.createCell(1).setCellValue(createHelper.createRichTextString("Corki"));
    row.createCell(2).setCellValue(createHelper.createRichTextString("Jinx"));
    row.createCell(3).setCellValue(createHelper.createRichTextString("Lucian"));
    row.createCell(4).setCellValue(createHelper.createRichTextString("Varus"));
    
    row = sheet.createRow((short)4); // supp
    row.createCell(0).setCellValue(createHelper.createRichTextString("BOT LANE - SUP"));
    row.createCell(1).setCellValue(createHelper.createRichTextString("Soraka"));        

    
    // Write the output to a file
    try {
      fileOut = new FileOutputStream("testData.xlsx"); 
    }    catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
      e.getMessage();
    }
    try {
      wb.write(fileOut);
      fileOut.close();
    }    catch (IOException e) {
      e.getMessage();
    }
  }
}