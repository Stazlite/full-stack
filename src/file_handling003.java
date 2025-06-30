import java.io.FileOutputStream;
public class file_handling003 {
    public static void main(String[] args) {
        String s="fileyyy.txt";
        String content="hello nndkldkklsdd";
        try(FileOutputStream fos=new FileOutputStream(s)){
           byte[] bytes=content.getBytes();
           fos.write(bytes);
           System.out.println("file created");
           fos.close();
        }
        catch(Exception e){
            System.out.println("file not created");
        }
    }
}
