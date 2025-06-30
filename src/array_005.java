import java.util.Scanner;//reverse array
public class array_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int a = sc.nextInt();
        int array[] = new int[a];
        System.out.println("enter the elements)");
        {
            for (int i = 0; i < array.length; i++)
                array[i] = sc.nextInt();
        }
        {
            for (int i=a-1; i>=0; i--)
                System.out.println(array[i]);
        }
    }
}


