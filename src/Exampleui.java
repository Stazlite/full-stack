import java.util.*;

public class Exampleui {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("enter the val");
        double a = no.nextDouble();
        if (a % 2 == 0) {
            System.out.println(a + "is even");
        } else {
            System.out.println(a + "is odd");
        }
    }
}