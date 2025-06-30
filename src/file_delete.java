import java.io.File;

public class file_delete {
    public static void main(String[] args) {
        File file = new File("file.txt");
        if ((file.exists() )){
            if ((file.delete())) {
                ;
                System.out.println("file deleted");
            } else {
                System.out.println("file not found");
            }
        } else {
            System.out.println("file not found");
        }
    }
}


