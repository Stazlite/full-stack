
public class Whileloop {
    public static void main(String[] args) {
      int first=0;
        int second=1;
        System.out.println(first+""+second);
        int sum= first + second ;
        int number = 20;
        while (sum<=number)
        {
            System.out.println(sum);
            first=second;
            second=sum;
            sum=first+second;
        }
    }
}
