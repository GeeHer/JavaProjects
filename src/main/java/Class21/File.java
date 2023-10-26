package Class21;

abstract public class File {

    private String name;
    private int size;

    public File(String name, int size){
        this.name=name;
        this.size=size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing the file "+name);
    }
    public void close(){
        System.out.println("Close the file "+name);
    }

}

class JavaFile extends File{

    public JavaFile(String name, int size){
        super(name,size);
    }
    public void open(){
        System.out.println("Opening javaFile using Intellij");
    }
}

class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Using Microsoft word to open Word file");
    }
}

class PdfFile extends File{
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Using Adobe to open PDF file");
    }
}