import java.util.Scanner;

public class assignmentoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int a = sc.nextInt();//33
        System.out.println("enter the value:");
        int b = sc.nextInt();//77
        System.out.println("+= :" + (a += 2));
        System.out.println(" -=:" + (a -= 2));
        System.out.println("*=:" + (a *= 2));
    }
}
