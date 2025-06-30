import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Arrays;
public class queue004 {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Arrays.asList(50,6,7,10,20));
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.remove(50);
        System.out.println(pq);
        System.out.println();
        pq.add((100));
        System.out.println(pq);
    }
}