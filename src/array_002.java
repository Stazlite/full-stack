public class array_002 {
    public static void main(String[] args){
        int dd[]={1,2,3,4,5,6,7};
        int sum=0;
        for(int i=0;i<dd.length;i++)
        {
            System.out.println(dd[i]);
        }
        for(int i=0;i<dd.length;i++)
        {
            sum=sum+dd[i];
        }
        System.out.println("sum"+sum);
    }
}
