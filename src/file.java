import java.nio.file.Files;
import java.nio.file.Paths;

public class file {
    public static void main(String[] args)
    {
        String d="fileone.txt";

        try{
            System.out.println("file created");
            Files.write(Paths.get(d),"hekki".getBytes());
            System.out.println("data loaded");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}