import java.util.Scanner;
public class bitwiseoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int a = sc.nextInt();//33
        System.out.println("enter the value:");
        int b = sc.nextInt();//77
        System.out.println("bitwise and :"+(a&b));
        System.out.println(" bitwise or:"+(a|b));
        System.out.println("compliment:"+(~a));
        System.out.println("bitwise xor:"+(a^b));
        System.out.println("left shift:"+(a<<3));
        System.out.println("right shift:"+(a>>1));

    }
}
