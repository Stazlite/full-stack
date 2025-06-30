import java.util.LinkedList;
import java.util.Queue;

public class queue001 {
    public static void main(String[] args) {
        Queue<String> obj=new LinkedList<>();
        obj.offer("aa");
        obj.offer("bb");
        obj.offer("cc");
        System.out.println(obj);
        System.out.println(obj.peek());
        obj.poll();
        System.out.println(obj);



    }
}
