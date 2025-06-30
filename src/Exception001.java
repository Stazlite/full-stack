import java.io.FileReader;
import java.io.File;

//exception handling for checked exception
public class Exception001 {
    public static void main(String[] args) throws Exception{
        File obj1=new File("filegg.txt");
        FileReader obj=new FileReader(obj1);

    }
}
