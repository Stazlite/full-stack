import java.util.LinkedList;
import java.util.Queue;

public class queue002 {
    public static void main(String[] args) {
        Queue<Integer> obh=new LinkedList<>();
        obh.offer(10);
        obh.offer(20);
        obh.offer(30);
        System.out.println(obh);


        obh.add(40);
        System.out.println(obh);
        System.out.println(obh.peek());
        obh.poll();
        System.out.println(obh);
        obh.remove(20);
        System.out.println(obh);
        obh.size();
        System.out.println(obh);
        obh.clear();
        System.out.println(obh);
    }
}
