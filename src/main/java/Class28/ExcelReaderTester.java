package Class28;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data = ExcelReader.readExcelData("C:\\Users\\User\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx","sheet1");
        System.out.println(data.get(0));
    }
}
