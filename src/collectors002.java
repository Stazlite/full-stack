import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
 public class collectors002 {
     public static void main(String[] args){
         List<Integer> list=new ArrayList<>();
         list.add(10);
         list.add(50);
        list.add(60);
         list.add(90);
         System.out.println(list);
         list.add(1,10);
         System.out.println(list);
         System.out.println(list.get(1));
         list.remove(1);
         System.out.println(list);
         list.set(1,90);
         System.out.println(list);     }
}
