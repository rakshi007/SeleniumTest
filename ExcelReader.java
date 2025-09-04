package util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelReader {

    private static String getFullPath(String fileName) {
        return "src/test/resources/Test/TestData/" + fileName;
    }

    // ✅ Read all rows
    public static List<Map<String, String>> readExcelData(String fileName, String sheetName) {
        List<Map<String, String>> dataList = new ArrayList<>();
        String fullPath = getFullPath(fileName);

        try (InputStream fis = new FileInputStream(fullPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet '" + sheetName + "' not found in file: " + fileName);
            }

            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                throw new RuntimeException("Header row is missing in sheet: " + sheetName);
            }

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                Map<String, String> rowData = getRowData(headerRow, row);
                dataList.add(rowData);
            }

        } catch (Exception e) {
            throw new RuntimeException("Error reading Excel file: " + fullPath, e);
        }

        return dataList;
    }

    // ✅ Read only one row by index (1-based index, excluding header row)
    public static Map<String, String> readRowByIndex(String fileName, String sheetName, int rowIndex) {
        String fullPath = getFullPath(fileName);

        try (InputStream fis = new FileInputStream(fullPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet '" + sheetName + "' not found in file: " + fileName);
            }

            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                throw new RuntimeException("Header row is missing in sheet: " + sheetName);
            }

            Row row = sheet.getRow(rowIndex); // ⚠️ here rowIndex includes header as row 0
            if (row == null) {
                throw new IllegalArgumentException("Row " + rowIndex + " not found in sheet: " + sheetName);
            }

            return getRowData(headerRow, row);

        } catch (Exception e) {
            throw new RuntimeException("Error reading Excel file: " + fullPath, e);
        }
    }

    // ✅ Helper to extract row data
    private static Map<String, String> getRowData(Row headerRow, Row row) {
        Map<String, String> rowData = new HashMap<>();

        for (int j = 0; j < headerRow.getLastCellNum(); j++) {
            Cell headerCell = headerRow.getCell(j);
            Cell dataCell = row.getCell(j);

            String header = headerCell != null ? headerCell.getStringCellValue() : "Column" + j;
            String value = "";

            if (dataCell != null) {
                if (dataCell.getCellType() == CellType.STRING) {
                    value = dataCell.getStringCellValue();
                } else if (dataCell.getCellType() == CellType.NUMERIC) {
                    if (DateUtil.isCellDateFormatted(dataCell)) {
                        value = dataCell.getDateCellValue().toString(); // date handling
                    } else {
                        value = String.valueOf(dataCell.getNumericCellValue());
                    }
                } else if (dataCell.getCellType() == CellType.BOOLEAN) {
                    value = String.valueOf(dataCell.getBooleanCellValue());
                }
            }

            rowData.put(header.trim(), value.trim());
        }

        return rowData;
    }
}
