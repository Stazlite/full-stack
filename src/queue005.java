import java.util.ArrayDeque;
public class queue005 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(1);
        ad.addLast(2);
        ad.addLast(3);
        ad.add(10);
        ad.add(180);
        ad.add(102);
        System.out.println(ad);
        ad.contains(180);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        ad.removeLast();
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        System.out.println(ad.peek());
    }
}