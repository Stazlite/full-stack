import java.util.Scanner;

public class Logicaloperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int a = sc.nextInt();//3
        System.out.println("enter the value:");
        int b = sc.nextInt();//5
        System.out.println(a>b && a==3);
        System.out.println(a != 3 || a < b);
        System.out.println(!(a != 2 || a < b));

    }
}
