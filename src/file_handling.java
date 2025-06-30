import java.io.*;
public class file_handling {
    public static void main(String[] args) {
     try(FileOutputStream fos=new FileOutputStream("two.mp3"))
     {
         System.out.println("file created");
     }
     catch(Exception e){
         System.out.println("file not created");
     }
    }
}
