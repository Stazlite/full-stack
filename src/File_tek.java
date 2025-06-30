import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
public class File_tek {
    public static void main(String[] args) {
     try{
         List<String> list=Files.readAllLines(Path.of("file.txt"));
         for(String data:list){
             System.out.println(data);
         }
     }
     catch(Exception e){
         System.out.println("file not found");
     }
    }
}