import java.io.FileWriter;
import java.io.File;
public class file_handling002 {
    public static void main(String[] args) throws Exception{
    String s="fileyyy.txt";
    File file=new File(s);
    FileWriter writer=new FileWriter(file);
        writer.write("ghdkf");
        writer.write("hello");
    System.out.println("file created");
    writer.close();
    }
}
