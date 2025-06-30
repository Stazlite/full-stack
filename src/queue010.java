import java.util.LinkedList;
import java.util.Queue;

public class queue010 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("v");
        queue.offer("i");
        queue.offer("j");
        queue.offer("a");
        queue.offer("y");

        System.out.println("original order " + queue);
        reverseQueue(queue);
        System.out.println("reverse order " + queue);
    }

    public static void reverseQueue(Queue<String> queue) {
        Queue<String> helper = new LinkedList<>();
        int size = queue.size();

        // Step 1: Bring each last unprocessed element to the front and move it to helper
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                queue.offer(queue.poll()); // Rotate front to back
            }
            helper.offer(queue.poll()); // Move the i-th last element to helper
        }

        // Step 2: Transfer reversed elements back to original queue
        while (!helper.isEmpty()) {
            queue.offer(helper.poll());
        }
    }
}