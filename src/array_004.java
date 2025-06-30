import java.util.Scanner;//max value in array
public class array_004 {
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
        int max = array[0];
        {
            for (int i = 1; i < array.length; i++)
                if (array[i] > max)
                    max = array[i];
        }
        System.out.println("max value" + max);
    }
}

