package org.example.class20.tasks;
/*
Create a class File that will have the following behaviors: open), edit), close) and fields like name and size.
Edit and close are implemented method while open is an abstract. Create 3 subclasses:
JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open java file we need notepad++ or sublime text, to open doc file we need Microsoft word to be installed etc.
Create a tester class and call all of the methods from these classes.
 */
public abstract class File {
    protected String name;
    protected int size;
    public File(String name, int size){
       this.name = name;
       this.size = size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing "+name);
    }
    public void close(){
        System.out.println("Closing "+name);
    }
}
class JavaFile extends File{
    public JavaFile(String name, int size){
        super(name,size);
    }
    @Override
    public void open(){
        System.out.println("To open "+name+" file we need notepad++ or sublime text");
    }
}
class WordFile extends File{
    public WordFile(String name, int size){
        super(name, size);
    }
    @Override
    public void open(){
        System.out.println("To open "+name+" file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    public PdfFile(String name, int size){
        super(name, size);
    }
    @Override
    public void open(){
        System.out.println("To open "+name+" file we need Adobe Acrobat reader");
    }
}
class FileTester{
    public static void main(String[] args) {
        File [] files = {new JavaFile(".java",100),
        new WordFile(".doc",200),
        new PdfFile(".pdf",300)};
        for(File f:files){
            f.open();
            f.edit();
            f.close();
        }
    }
}
