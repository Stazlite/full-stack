import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();

        // Corrected logic to find the largest of three numbers using nested if
        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " is large");
            } else {
                System.out.println(c + " is large");
            }
        } else { // This means b > a
            if (b >= c) {
                System.out.println(b + " is large");
            } else {
                System.out.println(c + " is large");
            }
        }
    }
}