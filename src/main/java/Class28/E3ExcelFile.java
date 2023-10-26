package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "C:\\Users\\User\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx";

        // Class that brings the data in the form of bytes into memory
        FileInputStream fis = new FileInputStream(path);

        // That special Class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");

        // A nested Data Structure that is going to hold all the info from the sheet
        List<Map<String,String>> empListMap = new ArrayList<>();

        Row headerRow = sheet.getRow(0);

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            // Getting all the rows one by one and placing them inside the row variable
            Row row = sheet.getRow(i);
            // Create new map every time to store each row
            Map<String,String> rowMap = new LinkedHashMap<>();
            // Inner loop to go through all the cells from each row
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                // Getting keys from header row
                String keyCell = headerRow.getCell(j).toString();
                // Getting values from header row
                String valueCell =row.getCell(j).toString();
                // Storing keys and values in the map
                rowMap.put(keyCell,valueCell);
            }
            // Once map is ready store it inside the list
            empListMap.add(rowMap);
        }
        System.out.println(empListMap);
    }
}
