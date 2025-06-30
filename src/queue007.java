import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue007 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        Stack<String> stack=new Stack<>();
        stack.push("v");
        stack.push("i");
        stack.push("j");                          //queue
        stack.push("a");
        stack.push("y");
        System.out.println("orginal order "+stack);

        while(!stack.isEmpty()){
            queue.offer(stack.pop());              //converting stack into queue"reverse"
        }
        System.out.println("reverse order "+stack);
    }
}
