import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Arrays;
public class queue003 {
    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<>(Arrays.asList("aa","bb","cc"));
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
