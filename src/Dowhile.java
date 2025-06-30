import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter  the value");
        int number=sc.nextInt();
        int i=1;
        int sum=10;

        do {
            sum+=1;
            i++;
        }
        while (i<=number);
        System.out.println(sum);
    }
}
