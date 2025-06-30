import java.io.FileNotFoundException;
import java.io.FileReader;
public class file_reader002 {
    public static void main(String[] args ) throws Exception
    {
        try (FileReader gr=new FileReader("file.txt")) {
            int Character;
            while ((Character = gr.read()) != -1) {
                System.out.println( Character);
            }
        }
        catch(Exception a)
        {
            System.out.println(a);
        }
    }
}