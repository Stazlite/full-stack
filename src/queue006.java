import java.util.Stack;

public class queue006 {
    public static void main(String[] args){
        Stack<String> uio=new Stack<>();
        uio.push("yess");
        uio.push("nope");
        uio.push("yup");
        System.out.println(uio);
        System.out.println(uio.peek());
        uio.pop();
        System.out.println(uio);
        uio.get(1);
        System.out.println(uio);
        uio.pop();
        System.out.println(uio);
    }
}
