
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class java002 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 4, 3));
        //System.out.println(list);
        /*for(int i=0;i<list.size();i++) {
     System.out.println(i);
        }
    }*/
       /* for(int l:list){  //for-each loop
            System.out.println(l);
        }
    }*/
        d obj=a->System.out.println(list);//lamda function
        obj.demo1(1);
    }
}
