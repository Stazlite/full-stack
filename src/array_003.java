import java.util.Scanner;
public class array_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        int array[]=new int[a];
        System.out.println("elements of array");
        for (int i=0;i<a;i++){
        array[i]=sc.nextInt();}
        System.out.println("enter the number to search");
        for(int i=0;i<a;i++)
        {
            System.out.println(array[i]);
        }
    }
}
