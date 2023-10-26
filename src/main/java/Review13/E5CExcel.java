package Review13;

import Utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class E5CExcel {
    public static void main(String[] args) {
        List<Map<String,String>> data = ExcelReader.readExcelData("C:\\Users\\User\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx","Sheet1");
        System.out.println(data);
    }
}
