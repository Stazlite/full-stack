import java.io.File;
import javax.imageio.ImageIO;


public class file_sharing {
    public static void main(String[] args) throws Exception {
        String s = "file.jpg";
        File obj = new File(s);
        if (obj.createNewFile())
            System.out.println("file created");
        else {
            System.out.println("file already exists");
        }
    }
}