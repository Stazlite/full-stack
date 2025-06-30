import java.util.Scanner;

public class Relationaloperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int a = sc.nextInt();
        System.out.println("enter the value:");
        int b = sc.nextInt();
        System.out.println("equal:"+(a==b));
        System.out.println("greater than:"+(a<b));
        System.out.println("less than:"+(a>b));
        System.out.println("not equal:"+(a!=b));
        System.out.println("greater than equal:"+(a<=b));
        System.out.println("less than equal:"+(a>=b));
    }
}

