import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Arrays;
public class queue008 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(50, 6, 7, 10, 20));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}