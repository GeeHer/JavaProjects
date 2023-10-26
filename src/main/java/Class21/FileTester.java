package Class21;

public class FileTester {
    public static void main(String[] args) {
        File [] arr={new JavaFile("Java",10), new WordFile("Word",20), new PdfFile("PDF",15)};
        for (File a:arr){
            a.open();
            a.edit();
            a.close();
        }
    }
}
