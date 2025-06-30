import java.util.ArrayList;
import java.util.List;
public class collectors003 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("fi");
        list.add("ma");
        list.add("jo");
        list.add("ko");
        System.out.print(list);
        list.remove(1);
        System.out.print(list);
        list.add(1,"ko");
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(3,"ko");
        System.out.println(list);

    }
}