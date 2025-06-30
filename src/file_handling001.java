import java.nio.file.Files;
import java.nio.file.Paths;

public class file_handling001 {
public static void main(String[] args){
    String s="fileyyy.txt";
    try{
        Files.write(Paths.get(s),"hello".getBytes());
        System.out.println("file created");
    }
    catch(Exception e){
        System.out.println("file not created");
    }
}
}










































