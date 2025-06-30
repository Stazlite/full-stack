import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class tiekehe {
  public static void main(String[] args) throws Exception {
      File obj = new File("gig.txt");
      try {
          if (obj.createNewFile()){
          System.out.println("file created");
      }
          else{
              System.out.println("File already exists");
          }
          FileWriter writer=new FileWriter(obj);

              writer.write("hello dannt");
              writer.write("i am great ");
              System.out.println("file Written");
              writer.close();

          FileReader reader=new FileReader(obj);{
              int data=reader.read();
              while(data!=-1){
                  System.out.print((char)data);
                  data=reader.read();
              }
              reader.close();
          }
          System.out.println();
          if(obj.exists()){
              if(obj.delete()) {
                  System.out.println("file deleted");
              }
                  else
                  {
                  System.out.println("file not deleted");
                  }
              }
          else {
              System.out.println("file not found");
          }
  }
      catch(Exception e){
        System.out.println(e);
      }
}
}

