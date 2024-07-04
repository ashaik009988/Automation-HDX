package Utils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ExcelReader {

    XSSFWorkbook CurrentworkBook;

    XSSFRow row;

    XSSFSheet spreadsheet;

    public void initiateExcelRead(String FileName, String SheetName, int rowNum){
        try

        {

        //File fileOperand=new File(FileName);

        FileInputStream file1 = new FileInputStream(FileName);

 

    // spreadsheet object

        CurrentworkBook= new XSSFWorkbook(file1);

        System.out.println(CurrentworkBook.getSheetName(0));

        spreadsheet = CurrentworkBook.getSheet(SheetName);

        row = spreadsheet.getRow(0);

    }

        catch (IOException e) {

                throw new RuntimeException(e);

            }
    }

    public String GetValueFromSheet(String FileName, String SheetName, int rowNum, String ColumnName){
        initiateExcelRead(FileName, SheetName,rowNum);

        Cell cell;

        String ColumnValueToBeReturn;

        int ColumnNoValue=0;

        for(int i=0;i<row.getLastCellNum();i++){

            if(row.getCell(i).getStringCellValue().trim().equals(ColumnName)){

                ColumnNoValue=i;

            }

        }

        row=spreadsheet.getRow(1);

        ColumnValueToBeReturn=row.getCell(ColumnNoValue).toString();

        return ColumnValueToBeReturn;
}
    
    public static Map<String, String> readExcelData(String excelFilePath, String sheetname) {
	    Map<String, String> orderMap = new HashMap<>();

	    try (FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));
	         Workbook workbook = WorkbookFactory.create(fileInputStream)) {
	      //  Sheet sheet = workbook.getSheet(excelFilePath); // Assuming data is in the first sheet

	        Sheet sheet = workbook.getSheet(sheetname);
	        
	        if(sheet== null) {
	        	System.out.println("Sheet with name " + sheet + "not found");
	        }
	   
	        // Assuming the headers are in the first row
	        Row headerRow = sheet.getRow(0);
	        int custIdIndex = -1;
	        int qtyIndex = -1;

	        // Find column indices for "Custid" and "Qty"
	        Iterator<Cell> cellIterator = headerRow.cellIterator();
	        
	        while (cellIterator.hasNext()) {
	            Cell cell = cellIterator.next();
	            if(cell!=null) {
	            String columnHeader = cell.getStringCellValue();
	            if (columnHeader.equalsIgnoreCase("Custid")) {
	                custIdIndex = cell.getColumnIndex();
	            } else if (columnHeader.equalsIgnoreCase("Qty")) {
	                qtyIndex = cell.getColumnIndex();
	            }
	        }
	        }

	        // Read data from subsequent rows
	        Iterator<Row> rowIterator = sheet.iterator();
	        // Skip the header row
	        rowIterator.next();
	        
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            if (row.getCell(custIdIndex) != null && row.getCell(qtyIndex) != null) { // Add null check here
	                String custId;
	                if (row.getCell(custIdIndex).getCellType() == CellType.STRING) {
	                    custId = row.getCell(custIdIndex).getStringCellValue();
	                } else {
	                    custId = String.valueOf((int) row.getCell(custIdIndex).getNumericCellValue());
	                }
	                String qty = String.valueOf((int) row.getCell(qtyIndex).getNumericCellValue());
	                orderMap.put(custId, qty);
	            }
	        }
	        
	        
	    } catch (IOException | EncryptedDocumentException ex) {
	        ex.printStackTrace();
	    }

	    return orderMap;
	}
    
    
    
    // By passing excelFilePath,sheetname,custIdColumnName,qtyColumnName
    
    public static Map<String, String> readExcelData(String excelFilePath, String sheetname, String custIdColumnName, String qtyColumnName) {
        Map<String, String> orderMap = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));
             Workbook workbook = WorkbookFactory.create(fileInputStream)) {
            Sheet sheet = workbook.getSheet(sheetname);

            if (sheet == null) {
                System.out.println("Sheet with name " + sheetname + " not found");
                return orderMap; // Return an empty map if sheet not found
            }

            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                System.out.println("Header row not found in the sheet.");
                return orderMap; // Return an empty map if header row not found
            }

            int custIdIndex = -1;
            int qtyIndex = -1;

            Iterator<Cell> cellIterator = headerRow.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String columnHeader = cell.getStringCellValue();
                if (columnHeader.equalsIgnoreCase(custIdColumnName)) {
                    custIdIndex = cell.getColumnIndex();
                } else if (columnHeader.equalsIgnoreCase(qtyColumnName)) {
                    qtyIndex = cell.getColumnIndex();
                }
            }

            if (custIdIndex == -1 || qtyIndex == -1) {
                System.out.println("Required columns missing in the sheet.");
                return orderMap; // Return an empty map if required columns are missing
            }

//            Iterator<Row> rowIterator = sheet.iterator();
//            rowIterator.next(); // Skip the header row
//
//            while (rowIterator.hasNext()) {
//                Row row = rowIterator.next();
//                Cell custIdCell = row.getCell(custIdIndex);
//                Cell qtyCell = row.getCell(qtyIndex);
//
//                if (custIdCell != null && qtyCell != null &&
//                        custIdCell.getCellType() == CellType.STRING &&
//                        qtyCell.getCellType() == CellType.NUMERIC) {
//                    String custId = custIdCell.getStringCellValue();
//                    String qty = String.valueOf((int) qtyCell.getNumericCellValue());
//                    orderMap.put(custId, qty);
//                }
//            }
            
            // Read data from subsequent rows
	        Iterator<Row> rowIterator = sheet.iterator();
	        // Skip the header row
	        rowIterator.next();
	        
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            if (row.getCell(custIdIndex) != null && row.getCell(qtyIndex) != null) { // Add null check here
	                String custId;
	                String qty;
	                if (row.getCell(custIdIndex).getCellType() == CellType.STRING) {
	                    custId = row.getCell(custIdIndex).getStringCellValue();
	                    qty = row.getCell(qtyIndex).getStringCellValue();
	                } else {
	                    custId = String.valueOf((int) row.getCell(custIdIndex).getNumericCellValue());
	                     qty = String.valueOf((int) row.getCell(qtyIndex).getNumericCellValue());
	                }
	                
	                orderMap.put(custId, qty);
	            }
	        }
	        
	        

        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }

        return orderMap;
    }
}

 